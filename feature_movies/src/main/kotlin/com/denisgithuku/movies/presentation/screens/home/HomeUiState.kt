package com.denisgithuku.movies.presentation.screens.home

import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.model.Genre

data class HomeUiState(
    val genresLoading: Boolean = false,
    val selectedGenre: Genre = Genre(),
    val moviesLoading: Boolean = false,
    val genres: List<Genre> = listOf(),
    val userMessages: List<UserMessage> = listOf()
)
