package com.denisgithuku.movies.presentation.screens.details

import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.feature_people.domain.model.Cast
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.MovieDetails

data class DetailsUiState(
    val movieDetailsLoading: Boolean = false,
    val similarMoviesLoading: Boolean = false,
    val movieDetails: MovieDetails? = null,
    val cast: List<com.denisgithuku.feature_people.domain.model.Cast> = emptyList(),
    val castLoading: Boolean = false,
    val showConfirmationDialog: Boolean = false,
    val similarMovies: List<Movie> = emptyList(),
    val userMessages: List<UserMessage> = emptyList()
)