package com.denisgithuku.movies.domain.repository

import com.denisgithuku.movies.data.data_src.remote.dto.MovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO

interface MoviesRepository {

    suspend fun getMovieGenres(): List<MovieGenreDTO>

    suspend fun getMoviesByGenre(
        sort_by: String,
        genreId: Int,
        include_adult: Boolean
    ): List<MovieDTO>

    suspend fun getTrendingMovies(): List<TrendingMovieDTO>

}
