package com.denisgithuku.movies.presentation.screens.details

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core.Constants
import com.denisgithuku.core.Resource
import com.denisgithuku.core.UserMessage
import com.denisgithuku.core.data.local.MovieDBO
import com.denisgithuku.core.providers.DispatcherProvider
import com.denisgithuku.movies.domain.repository.MoviesRepository
import com.denisgithuku.movies.domain.use_cases.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val movieUseCases: MovieUseCases,
    private val moviesRepository: MoviesRepository,
    private val dispatcherProvider: DispatcherProvider,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailsUiState())
    val uiState: StateFlow<DetailsUiState> = _uiState.asStateFlow()

    private var moviesJob: Job? = null

    init {
        savedStateHandle.get<String>(Constants.movieId)?.let { movieId ->
            getMovieDetails(movieId.toInt()).also {
                getFavouriteMovies()
                getSimilarMovies(movieId.toInt())
            }
        }
    }

    fun onEvent(event: DetailsUiEvent) {
        when (event) {
            is DetailsUiEvent.UserMessageDismiss -> {
                _uiState.update {
                    val userMessages = _uiState.value.userMessages.filterNot { userMessage ->
                        userMessage.id == event.messageId
                    }
                    it.copy(
                        userMessages = userMessages
                    )
                }
            }
            DetailsUiEvent.MarkFavourite -> {
                getFavouriteMovies().also {
                    if (_uiState.value.favMovieListIds.any { it == _uiState.value.movieDetails!!.id }) {
                        _uiState.update {
                            it.copy(
                                showConfirmationDialog = !_uiState.value.showConfirmationDialog
                            )
                        }
                    } else {
                        val movieDBO = MovieDBO(movieId = _uiState.value.movieDetails!!.id)
                        markAsFavourite(
                            movieDBO
                        )
                    }
                }
            }
            DetailsUiEvent.UserDialogDismiss -> {
                _uiState.update {
                    it.copy(
                        showConfirmationDialog = !_uiState.value.showConfirmationDialog
                    )
                }
            }
           DetailsUiEvent.DeleteFromFavourites -> {
                deleteFromFavourites(_uiState.value.movieDetails!!.id)
            }
        }
    }

    private fun getMovieDetails(movieId: Int) {
        moviesJob?.cancel()
        moviesJob = viewModelScope.launch {
            movieUseCases.getMovieDetails(movieId).collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(movieDetailsLoading = true)
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            val movieDetails =
                                result.data?.copy(favourite = _uiState.value.favMovieListIds.any { id ->
                                    id == result.data?.id
                                })

                            it.copy(
                                movieDetailsLoading = false, movieDetails = movieDetails
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            val error = result.throwable?.message
                            val userMessages = mutableListOf<UserMessage>()
                            userMessages.add(
                                UserMessage(
                                    id = 0, message = error ?: "An unexpected error occurred"
                                )
                            )
                            it.copy(
                                movieDetailsLoading = false, userMessages = userMessages
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getSimilarMovies(
        movieId: Int
    ) {
        viewModelScope.launch {
            movieUseCases.getSimilarMoviesById(movieId).collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                similarMoviesLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(
                                similarMoviesLoading = false,
                                similarMovies = result.data ?: emptyList()
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            val error = result.throwable?.message
                            val userMessages = mutableListOf<UserMessage>()
                            userMessages.add(
                                UserMessage(
                                    id = 0, message = error ?: "An unexpected error occurred"
                                )
                            )
                            it.copy(
                                movieDetailsLoading = false, userMessages = userMessages
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getFavouriteMovies() {
        viewModelScope.launch(dispatcherProvider.ioDispatcher) {
            moviesRepository.getFavouriteMovieIdsFromDB().also { favMovieIds ->
                _uiState.update {
                    val ids = favMovieIds.map { it.movieId }
                    it.copy(
                        favMovieListIds = ids
                    )
                }
                Log.d("favs2", favMovieIds.toString())
            }
        }
    }

    private fun markAsFavourite(movieDBO: MovieDBO) {
        viewModelScope.launch(dispatcherProvider.ioDispatcher) {
            movieUseCases.insertIntoFavourites(movieDBO).also { markedAsFavourite ->
                if (markedAsFavourite) {
                    _uiState.update {
                        val userMessages = mutableListOf<UserMessage>()
                        userMessages.add(UserMessage(id = 0, message = "Added to favourites"))
                        it.copy(
                            userMessages = userMessages,
                            movieDetails = it.movieDetails?.copy(favourite = true)
                        )
                    }
                }
            }
        }
    }

    private fun deleteFromFavourites(movieId: Int) {
        viewModelScope.launch(dispatcherProvider.ioDispatcher) {
            val movieDBO = MovieDBO(movieId)
            movieUseCases.deleteFromFavouritesById(movieDBO).also {
                _uiState.update {
                    it.copy(
                        movieDetails = _uiState.value.movieDetails?.copy(
                            favourite = !_uiState.value.movieDetails!!.favourite
                        )
                    )
                }
            }
        }
    }
}