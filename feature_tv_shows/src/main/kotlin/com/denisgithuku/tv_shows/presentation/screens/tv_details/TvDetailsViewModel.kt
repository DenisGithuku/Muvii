package com.denisgithuku.tv_shows.presentation.screens.tv_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases
import com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases
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
    private val coreMuviiUseCases: CoreMuviiUseCases,
    private val peopleUseCases: PeopleUseCases,
    savedStateHandle: SavedStateHandle
): ViewModel() {

    private val _uiState = MutableStateFlow(TvDetailsUiState())
    val uiState: StateFlow<TvDetailsUiState> get() = _uiState.asStateFlow()

    init {
        savedStateHandle.get<String>("tvId")?.let { tvId ->
            getTvDetails(tvId.toInt())
            getCast(tvId.toInt())
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

    private fun getCast(movieId: Int) {
        viewModelScope.launch {
            peopleUseCases.getCast(movieId).collect { result ->
                when(result) {
                    is Resource.Loading -> {
                        _uiState.update {
                            it.copy(
                                castLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update {
                            it.copy(
                                castLoading = false,
                                castList = result.data ?: emptyList()
                            )
                        }
                    }
                    is Resource.Error ->  {
                        _uiState.update {
                            val userMessages = mutableListOf<UserMessage>()
                            userMessages.add(
                                UserMessage(
                                    id = 0,
                                    message = result.throwable?.message ?: "An error occurred. Could not fetch cast"
                                )
                            )
                            it.copy(
                                castLoading = false,
                                userMessages = userMessages
                            )
                        }
                    }
                }
            }
        }
    }

    fun onEvent(tvDetailsEvent: TvDetailsEvent) {
        when(tvDetailsEvent) {
            is TvDetailsEvent.DismissUserMessage -> {
                val userMessages = _uiState.value.userMessages
                userMessages.filterNot { userMessage ->
                    userMessage.id == tvDetailsEvent.messageId
                }
                _uiState.update { tvDetailsUiState ->
                    tvDetailsUiState.copy(
                        userMessages = userMessages
                    )
                }
            }
        }
    }

}