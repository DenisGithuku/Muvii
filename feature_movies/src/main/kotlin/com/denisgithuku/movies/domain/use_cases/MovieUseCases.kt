package com.denisgithuku.movies.domain.use_cases

data class MovieUseCases(
    val getAllMovieGenres: GetAllMovieGenres,
    val getMoviesByGenre: GetMoviesByGenre,
    val getTrendingMovies: GetTrendingMovies,
    val readAdultContentPreferences: ReadAdultContentPrefences,
    val changeUiTheme: ChangeUiTheme,
    val enableAdultContent: EnableAdultContent

)
