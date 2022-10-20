package com.denisgithuku.movies.presentation.screens.details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core.Constants
import com.denisgithuku.core.Resource
import com.denisgithuku.core.UserMessage
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
    private val movieUseCases: MovieUseCases, savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailsUiState())
    val uiState: StateFlow<DetailsUiState> = _uiState.asStateFlow()

    private var moviesJob: Job? = null

    init {
        savedStateHandle.get<String>(Constants.movieId)?.let { movieId ->
            getMovieDetails(movieId.toInt()).also {
                getSimilarMovies(movieId.toInt())
            }
        }
    }

    fun onEvent(event: DetailsUiEvent) {
        when (event) {
            is DetailsUiEvent.ErrorMessageDismiss -> {
                _uiState.update {
                    val userMessages = _uiState.value.userMessages.filterNot { userMessage ->
                        userMessage.id == event.messageId
                    }
                    it.copy(
                        userMessages = userMessages
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
                        _uiState.update {
                            it.copy(
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
                    is Resource.Loading ->  {
                        _uiState.update {
                            it.copy(
                                similarMoviesLoading = true
                            )
                        }
                    }
                    is Resource.Success ->  {
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


}