package com.denisgithuku.movies.presentation.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core.Resource
import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.repository.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val moviesRepository: MoviesRepository,
) : ViewModel() {

    private val _uiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState())
    val uiState get() = _uiState.asStateFlow()

    private var genresJob: Job? = null

    init {
        getGenres()
    }

    private fun getGenres() {
        genresJob?.cancel()
        genresJob = viewModelScope.launch {
            moviesRepository.getMovieGenres().collect { result ->
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
            }
        }
    }
}
