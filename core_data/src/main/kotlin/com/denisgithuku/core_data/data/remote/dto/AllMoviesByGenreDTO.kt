package com.denisgithuku.core_data.data.remote.dto

data class FavouriteMoviesDTO(
    val page: Int,
    val results: List<FavouriteMovieDTO>,
    val total_pages: Int,
    val total_results: Int
)