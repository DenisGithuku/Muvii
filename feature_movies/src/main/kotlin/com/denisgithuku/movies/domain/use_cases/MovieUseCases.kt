package com.denisgithuku.movies.domain.use_cases

data class MovieUseCases(
    val getAllMovieGenres: GetAllMovieGenres,
    val getMoviesByGenre: GetMoviesByGenre,
    val getTrendingMovies: GetTrendingMovies,
    val readAdultContentPreferences: GetAdultContentPreferences,
    val changeUiTheme: ChangeUiTheme,
    val enableAdultContent: EnableAdultContent,
    val getMovieDetails: GetMovieDetails,
    val getSimilarMoviesById: GetSimilarMoviesById,
    val toggleFavourite: ToggleFavourite,
    val deleteAllFavourites: DeleteAllFavourites,
    val searchMovies: SearchMovies
)
