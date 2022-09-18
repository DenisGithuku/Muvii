package com.denisgithuku.movies.domain.repository

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.data.data_src.remote.dto.AllMoviesByCategoryDTO
import com.denisgithuku.movies.domain.model.Genre
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    suspend fun getMovieGenres(): Flow<Resource<List<Genre>>>

    suspend fun getMoviesInCategory(): Flow<Resource<AllMoviesByCategoryDTO>>
}
