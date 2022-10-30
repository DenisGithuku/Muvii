package com.denisgithuku.movies.presentation.screens.details

import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.MovieDetails

data class DetailsUiState(
    val moviePosterLoading: Boolean = false,
    val movieDetailsLoading: Boolean = false,
    val similarMoviesLoading: Boolean = false,
    val favouritesLoading: Boolean = false,
    val movieDetails: MovieDetails? = null,
    val showConfirmationDialog: Boolean = false,
    val favourites: List<Movie> = emptyList(),
    val favMovieListIds: List<Int> = emptyList(),
    val similarMovies: List<Movie> = emptyList(),
    val userMessages: List<UserMessage> = emptyList()
)