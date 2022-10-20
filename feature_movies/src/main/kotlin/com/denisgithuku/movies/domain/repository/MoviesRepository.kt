package com.denisgithuku.movies.domain.repository

import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.movie_details.MovieDetailsDTO

interface MoviesRepository {

    suspend fun getMovieGenres(): List<MovieGenreDTO>

    suspend fun getMoviesByGenre(
        sort_by: String,
        genreId: Int,
        include_adult: Boolean
    ): List<MovieDTO>

    suspend fun getTrendingMovies(): List<TrendingMovieDTO>

    suspend fun getMovieDetails(movieId: Int): MovieDetailsDTO?

    suspend fun getSimilarMovies(movieId: Int): List<MovieDTO>

}
