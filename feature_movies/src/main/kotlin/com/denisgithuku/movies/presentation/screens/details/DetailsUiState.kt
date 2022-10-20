package com.denisgithuku.movies.presentation.screens.details

import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.MovieDetails

data class DetailsUiState(
    val moviePosterLoading: Boolean = false,
    val movieDetailsLoading: Boolean = false,
    val similarMoviesLoading: Boolean = false,
    val movieDetails: MovieDetails? = null,
    val similarMovies: List<Movie> = emptyList(),
    val userMessages: List<UserMessage> = emptyList()
)