package com.denisgithuku.tv_shows.presentation.screens.tv_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.tv_shows.domain.use_cases.TvUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TvDetailsViewModel @Inject constructor(
    private val tvUseCases: TvUseCases,
    savedStateHandle: SavedStateHandle
): ViewModel() {

    private val _uiState = MutableStateFlow(TvDetailsUiState())
    val uiState: StateFlow<TvDetailsUiState> get() = _uiState.asStateFlow()

    init {
        savedStateHandle.get<String>("tv_id")?.let { tvId ->
            getTvDetails(tvId.toInt())
        }
    }


    private fun getTvDetails(tvId: Int) {
        viewModelScope.launch {
            tvUseCases.getShowDetails(tvId).collect { result ->
                when (result) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(tvDetailsLoading = true)
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(
                                tvDetailsLoading = false,
                                tvDetails = result.data
                            )
                        }
                    }
                    is Resource.Error -> {
                        _uiState.update {
                            val userMessages = mutableListOf<UserMessage>()
                            userMessages.add(UserMessage(id = 0, message = result.throwable?.message ?: "An error occurred. Couldn't fetch details"))
                            it.copy(
                                tvDetailsLoading = false,
                                userMessages = userMessages
                            )
                        }
                    }
                }
            }
        }
    }

}