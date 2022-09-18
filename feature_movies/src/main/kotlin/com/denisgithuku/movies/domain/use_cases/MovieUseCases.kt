package com.denisgithuku.movies.domain.use_cases

data class MovieUseCases(
    val getAllMovieGenres: GetAllMovieGenres,
    val getMoviesByGenre: GetMoviesByGenre,
    val getMoviePoster: GetMoviePoster
)
