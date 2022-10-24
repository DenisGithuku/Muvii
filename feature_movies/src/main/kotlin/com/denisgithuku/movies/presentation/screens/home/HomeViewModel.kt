package com.denisgithuku.movies.presentation.screens.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core.Resource
import com.denisgithuku.core.UserMessage
import com.denisgithuku.core.providers.AppThemeProvider
import com.denisgithuku.movies.domain.common.SortType
import com.denisgithuku.movies.domain.use_cases.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val movieUseCases: MovieUseCases,
    private val appThemeProvider: AppThemeProvider,
) : ViewModel() {

    private val _uiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState())
    val uiState get() = _uiState.asStateFlow()

    private var genresJob: Job? = null
    private var moviesByGenreJob: Job? = null
    private var trendingMoviesJob: Job? = null

    init {
        readUserPrefs()
        getGenres()
        getTrending()
    }

    private fun getGenres() {
        genresJob?.cancel()
        genresJob = viewModelScope.launch {
            movieUseCases.getAllMovieGenres().collect { result ->
                when (result) {
                    is Resource.Error -> {
                        _uiState.update {
                            val messages = getUserMessagesFromException(result.throwable)
                            it.copy(genresLoading = false, userMessages = messages)
                        }
                    }
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(genresLoading = true)
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(genresLoading = false,
                                selectedGenre = result.data?.first()?.id ?: Math.random().toInt(),
                                genres = result.data ?: emptyList())
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)
                    }
                }
            }
        }
    }

    private fun getUserMessagesFromException(throwable: Throwable?): List<UserMessage> {
        val userMessages = mutableListOf<UserMessage>()
        userMessages.add(UserMessage(id = 0,
            message = throwable?.localizedMessage
                ?: Throwable(message = "Something went wrong.").localizedMessage))
        return userMessages
    }

    private fun getTrending() {
        trendingMoviesJob?.cancel()
        trendingMoviesJob = viewModelScope.launch {
            movieUseCases.getTrendingMovies().collect { result ->
                when (result) {
                    is Resource.Error -> {
                        _uiState.update {
                            val userMessages = getUserMessagesFromException(result.throwable)
                            it.copy(trendingMovieLoading = false, userMessages = userMessages)
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)

                    }
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(trendingMovieLoading = true)
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(trendingMovieLoading = false,
                                trending = result.data ?: emptyList())
                        }
                    }
                }
            }
        }
    }

    fun onEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.ChangeMovieGenre -> {
                _uiState.update {
                    it.copy(selectedGenre = event.genreId)
                }
                getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                    genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)

            }
            is HomeEvent.ErrorMessageDismissed -> {
                _uiState.update {
                    val userMessages = _uiState.value.userMessages.filterNot { error ->
                        error.id == event.messageId
                    }
                    it.copy(userMessages = userMessages)
                }
            }
            is HomeEvent.ChangeSortType -> {
                when (event.sortType) {
                    SortType.Popularity -> {
                        _uiState.update {
                            it.copy(selectedSortType = SortType.Popularity)
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)
                    }
                    SortType.ReleaseDate -> {
                        _uiState.update {
                            it.copy(selectedSortType = SortType.ReleaseDate)
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)
                    }
                    SortType.Revenue -> {
                        _uiState.update {
                            it.copy(selectedSortType = SortType.Revenue)
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)
                    }
                    SortType.VoteAverage -> {
                        _uiState.update {
                            it.copy(selectedSortType = SortType.VoteAverage)
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)
                    }
                    SortType.VoteCount -> {
                        _uiState.update {
                            it.copy(selectedSortType = SortType.VoteCount)
                        }
                        getMoviesByGenre(sort_by = _uiState.value.selectedSortType,
                            genreId = _uiState.value.selectedGenre, include_adult = _uiState.value.adultContentEnabled)
                    }
                }
            }
            HomeEvent.ToggleAdultContentEnable -> {
                enableAdultContent().also {
                    getMoviesByGenre(
                        sort_by = _uiState.value.selectedSortType,
                        genreId = _uiState.value.selectedGenre,
                        include_adult = _uiState.value.adultContentEnabled
                    )
                }
            }
        }
    }

    private fun readUserPrefs() {
        viewModelScope.launch {
            movieUseCases.readAdultContentPreferences(viewModelScope).collectLatest { adult_content_enabled ->
                    Log.d("user_prefs", adult_content_enabled.toString())
                    _uiState.update {
                        it.copy(adultContentEnabled = adult_content_enabled)
                    }
                }
        }
    }

    private fun enableAdultContent() {
        viewModelScope.launch {
            movieUseCases.enableAdultContent(!_uiState.value.adultContentEnabled).also {
                readUserPrefs()
            }
        }
    }


    private fun getMoviesByGenre(sort_by: SortType, genreId: Int, include_adult: Boolean) {
        moviesByGenreJob?.cancel()
        moviesByGenreJob = viewModelScope.launch {
            movieUseCases.getMoviesByGenre(sort_by, genreId, include_adult = include_adult).collect { result ->
                when (result) {
                    is Resource.Error -> {
                        val messages = getUserMessagesFromException(result.throwable)
                        _uiState.update {
                            it.copy(moviesLoading = false, userMessages = messages)
                        }

                    }
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(moviesLoading = true)
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(moviesLoading = false, movies = result.data ?: emptyList())
                        }
                        Log.d("genre", _uiState.value.selectedGenre.toString())
                        Log.d("movieDetails", result.data.toString())
                    }
                }
            }
        }
    }

}
