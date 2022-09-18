package com.denisgithuku.movies.data.data_src.remote.dto

data class AllMoviesByCategoryDTO(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)
