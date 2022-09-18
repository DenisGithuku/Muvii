package com.denisgithuku.movies.presentation.screens.home

import com.denisgithuku.movies.domain.model.Genre

sealed interface HomeEvent {
    data class ChangeMovieGenre(val genre: Genre): HomeEvent
}
