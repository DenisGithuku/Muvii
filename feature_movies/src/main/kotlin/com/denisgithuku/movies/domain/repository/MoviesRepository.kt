package com.denisgithuku.movies.domain.repository

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.data.data_src.remote.dto.MovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.denisgithuku.movies.domain.model.Genre
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    suspend fun getMovieGenres(): List<MovieGenreDTO>

    suspend fun getMoviesByGenre(genre: String): List<MovieDTO>

    suspend fun getImagePoster(path: String): String?
}
