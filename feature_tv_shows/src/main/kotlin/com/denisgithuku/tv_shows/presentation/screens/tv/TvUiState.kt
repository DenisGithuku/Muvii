package com.denisgithuku.tv_shows.presentation.screens.tv

import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.tv_shows.domain.model.Tv

data class TvUiState(
    val tvLoading: Boolean = false,
    val shows: List<Tv> = emptyList(),
    val userMessages: List<UserMessage> = emptyList()
)
