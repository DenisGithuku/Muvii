package com.denisgithuku.movies.data.data_src.remote.dto

data class AllMoviesByGenreDTO(
    val page: Int,
    val results: List<MovieDTO>,
    val total_pages: Int,
    val total_results: Int
)
