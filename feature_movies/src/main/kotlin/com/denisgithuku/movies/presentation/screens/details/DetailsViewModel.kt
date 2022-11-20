package com.denisgithuku.movies.presentation.screens.details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.core_data.data.local.FavouriteMovieDBO
import com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases
import com.denisgithuku.core_data.providers.DispatcherProvider
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
    private val coreMuviiUseCases: CoreMuviiUseCases,
    private val dispatcherProvider: DispatcherProvider,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailsUiState())
    val uiState: StateFlow<DetailsUiState> = _uiState.asStateFlow()

    private var moviesJob: Job? = null

    init {
        savedStateHandle.get<String>(Constants.movieId)?.let { movieId ->
            getMovieDetails(movieId.toInt()).also {
                getCast(movieId.toInt())
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
            DetailsUiEvent.MarkUnmarkFavourite -> {
                _uiState.value.movieDetails?.let { details ->
                    toggleFavourite(details.id, !details.favourite)
                }

            }
            DetailsUiEvent.UserDialogDismiss -> {
                _uiState.update {
                    it.copy(
                        showConfirmationDialog = false
                    )
                }
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
                        _uiState.update { currentState ->
                            currentState.copy(
                                movieDetailsLoading = false, movieDetails = result.data
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

    private fun toggleFavourite(movieId: Int, favourite: Boolean) {
        viewModelScope.launch {
            movieUseCases.toggleFavourite(FavouriteMovieDBO(movieId = movieId), favourite)
            getMovieDetails(movieId)
            _uiState.update { currentState ->
                val userMessages = mutableListOf<UserMessage>()
                userMessages.add(
                    UserMessage(
                        id = 0,
                        message = if (favourite) "Added to favourites" else "Removed from favourites"
                    )
                )
                currentState.copy(
                    userMessages = userMessages
                )
            }
        }
    }

    private fun getCast(movieId: Int) {
        viewModelScope.launch {
            coreMuviiUseCases.getCast(movieId).collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _uiState.update { state ->
                            state.copy(
                                castLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update { state ->
                            state.copy(
                                castLoading = false,
                                cast = result.data ?: emptyList()
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update { state ->
                            val error = result.throwable?.message
                            val userMessages = mutableListOf<UserMessage>()
                            userMessages.add(
                                UserMessage(
                                    id = 0,
                                    message = error ?: "Couldn't complete operation"
                                )
                            )
                            state.copy(
                                userMessages = userMessages,
                                castLoading = false
                            )
                        }
                    }
                }
            }
        }
    }
}