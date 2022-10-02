package com.denisgithuku.movies.data.data_src.remote.dto

data class AllTrendingMoviesDTO(
    val page: Int,
    val results: List<TrendingMovieDTO>,
    val total_pages: Int,
    val total_results: Int
)
