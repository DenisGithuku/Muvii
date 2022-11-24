package com.denisgithuku.feature_people.presentation.profile

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val peopleUseCases: PeopleUseCases,
    savedStateHandle: SavedStateHandle
): ViewModel() {


    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> get() = _uiState.asStateFlow()

    init {
        savedStateHandle.get<String>("profileId")?.let { profileId ->
            getProfile(profileId.toInt())
        }
    }

    private fun getProfile(personId: Int) {
        viewModelScope.launch {
            peopleUseCases.getProfile(personId).collect { result ->
                when(result) {
                    is Resource.Loading -> {
                        _uiState.update { profileUiState ->
                            profileUiState.copy(
                                isLoading = true
                            )
                        }
                    }
                    is Resource.Success -> {
                        _uiState.update { profileUiState ->
                            profileUiState.copy(
                                isLoading = false,
                                profile = result.data
                            )
                        }
                    }
                    is Resource.Error -> {
                        val userMessages = mutableListOf<UserMessage>()
                        userMessages.add(
                            UserMessage(id = 0, message = result.throwable?.message ?: "An error occurred. Couldn't fetch profile")
                        )
                        _uiState.update { profileUiState ->
                            profileUiState.copy(
                                userMessages = userMessages
                            )
                        }
                    }
                }
            }
        }
    }

    fun onEvent(profileEvent: ProfileEvent) {
        when (profileEvent) {
            is ProfileEvent.DismissUserMessage ->  {
                val userMessages = _uiState.value.userMessages
                userMessages.filterNot { userMessage ->
                    userMessage.id == profileEvent.messageId
                }

                _uiState.update { profileUiState ->
                    profileUiState.copy(userMessages = userMessages)
                }
            }
        }
    }
}