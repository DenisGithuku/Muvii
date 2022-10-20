package com.denisgithuku.movies.data.data_src.remote.dto.movie_details

import com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO

data class SimilarMoviesDTO(
    val page: Int,
    val results: List<MovieDTO>,
    val total_pages: Int,
    val total_results: Int
)
