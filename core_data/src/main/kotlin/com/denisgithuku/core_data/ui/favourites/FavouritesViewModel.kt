package com.denisgithuku.core_data.ui.favourites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.domain.use_cases.CoreMovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavouritesViewModel @Inject constructor(
    private val coreMovieUseCases: CoreMovieUseCases
) : ViewModel() {
    private val _uiState = MutableStateFlow(FavouritesUiState())
    val uiState: StateFlow<FavouritesUiState> get() = _uiState.asStateFlow()

    var favouriteMoviesJob: Job? = null

    init {
        getFavouriteMovies()
    }

    private fun getFavouriteMovies() {
        favouriteMoviesJob?.cancel()
        favouriteMoviesJob = viewModelScope.launch {
            coreMovieUseCases.getFavouriteMovies().collectLatest { result ->
                when (result) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                isLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                favourites = result.data ?: emptyList()
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                error = result.throwable?.message ?: "An error occurred"
                            )
                        }
                    }
                }
            }
        }
    }
}