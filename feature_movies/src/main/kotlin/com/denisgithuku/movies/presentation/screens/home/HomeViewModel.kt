package com.denisgithuku.movies.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core.Resource
import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.use_cases.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val movieUseCases: MovieUseCases,
) : ViewModel() {

    private val _uiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState())
    val uiState get() = _uiState.asStateFlow()

    private var genresJob: Job? = null
    private var moviesByGenreJob: Job? = null
    private var moviePosterJob: Job? = null

    init {
        getGenres()
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
                            it.copy(
                                genresLoading = false,
                                selectedGenre = result.data?.first()!!,
                                genres = result.data ?: emptyList()
                            )
                        }.also {
                            getMoviesByGenre(_uiState.value.selectedGenre.name)
                        }
                    }
                }
            }
        }
    }

    private fun getUserMessagesFromException(throwable: Throwable?): List<UserMessage> {
        val userMessages = mutableListOf<UserMessage>()
        userMessages.add(
            UserMessage(
                message = throwable?.localizedMessage
                    ?: Throwable(message = "Something went wrong.").localizedMessage
            )
        )
        return userMessages
    }

    fun onEvent(event: HomeEvent) {
        when(event) {
            is HomeEvent.ChangeMovieGenre -> {
                _uiState.update {
                    it.copy(selectedGenre = event.genre)
                }
                getMoviesByGenre(event.genre.name)
            }
        }
    }

    private fun getMoviesByGenre(genre: String) {
        moviesByGenreJob?.cancel()
        moviesByGenreJob = viewModelScope.launch {
            movieUseCases.getMoviesByGenre(genre).collect { result ->
                when(result) {
                    is Resource.Error -> {
                        val messages = getUserMessagesFromException(result.throwable)
                        _uiState.update {
                            it.copy(moviesLoading = false, userMessages = messages)
                        }

                    }
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                moviesLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(
                                moviesLoading = false,
                                movies = result.data ?: emptyList()
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getImagePoster(path: String): String? {
        var poster: String? = null
        moviePosterJob?.cancel()
        moviePosterJob = viewModelScope.launch {
          _uiState.map {
              it.movies.forEach {
                  getImagePoster(path)
              }
          }
        }
        return poster
    }
}
