package com.denisgithuku.movies.data.data_src.repository_impl

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface
import com.denisgithuku.movies.data.data_src.remote.dto.MovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


class MoviesRepositoryImpl @Inject constructor(
    private val moviesApiInterface: MoviesApiInterface,
) : MoviesRepository {
    override suspend fun getMovieGenres(): List<MovieGenreDTO> {
        val response = moviesApiInterface.getGenres()
        response.body()?.let {
            if (response.isSuccessful) {
                return it.genres
            }
        }
        return emptyList()
    }

    override suspend fun getMoviesByGenre(genre: String): List<MovieDTO> {
       val response = moviesApiInterface.getMoviesByGenre(with_genre = genre)
        response.body()?.let {
            if (response.isSuccessful) {
                return it.results
            }
        }
        return emptyList()
    }

    override suspend fun getImagePoster(path: String): String? {
        val response = moviesApiInterface.getImagePoster(path)
        response.body()?.let {
            return it
        }
        return null
    }


}
