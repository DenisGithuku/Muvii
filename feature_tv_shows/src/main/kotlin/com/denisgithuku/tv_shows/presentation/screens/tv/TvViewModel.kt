package com.denisgithuku.tv_shows.presentation.screens.tv

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.tv_shows.domain.use_cases.TvUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TvViewModel @Inject constructor(
    private val tvUseCases: TvUseCases
): ViewModel() {

    private val _uiState = MutableStateFlow(TvUiState())
    val uiState: StateFlow<TvUiState> = _uiState.asStateFlow()

    private var getTvsJob: Job? = null

    init {
        getShows()
    }

    private fun getShows() {
        getTvsJob?.cancel()
        getTvsJob = viewModelScope.launch {
            tvUseCases.getShows().collect { result ->
                when(result) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(tvLoading = true)
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(tvLoading = false, shows = result.data ?: emptyList())
                        }
                        Log.d("shows", "getShows: ${result.data}")
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            val userMessages = mutableListOf<UserMessage>()
                            userMessages.add(
                                UserMessage(
                                    id = 0,
                                    message = result.throwable?.message ?: "An error occurred"
                                )
                            )
                            it.copy(
                                tvLoading = false,
                                userMessages = userMessages
                            )
                        }
                    }
                }
            }
        }
    }

}