package com.denisgithuku.movies.presentation.screens.details

import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.model.Movie

data class DetailsUiState(
    val isLoading: Boolean = false,
    val movie: Movie? = null,
    val userMessages: List<UserMessage> = emptyList()
)