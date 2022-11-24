package com.denisgithuku.feature_people.presentation.profile

import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.feature_people.domain.model.Profile

data class ProfileUiState(
    val isLoading: Boolean = false,
    val profile: Profile? = null,
    val userMessages: List<UserMessage> = emptyList()
)
