package com.denisgithuku.movies.data.data_src.repository_impl

import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface
import com.denisgithuku.movies.data.data_src.remote.dto.MovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO
import com.denisgithuku.movies.domain.repository.MoviesRepository
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

    override suspend fun getMoviesByGenre(sort_by: String, genreId: Int, include_adult: Boolean): List<MovieDTO> {
        val response = moviesApiInterface.getMoviesByGenre(sort_by = sort_by, genre_id = genreId, include_adult = include_adult)
        response.body()?.let {
            if (response.isSuccessful) {
                return it.results
            }
        }
        return emptyList()
    }

    override suspend fun getTrendingMovies(): List<TrendingMovieDTO> {
        val response =
            moviesApiInterface.getTrendingMovies()


        response.body()?.let {
            if (response.isSuccessful) {

                return it.results
            }

        }
        return emptyList()
    }

    override suspend fun getMovieDetails(movieId: String): MovieDTO? {
        val response = moviesApiInterface.getMovieDetails(movieId)
        response.body()?.let {
            if (response.isSuccessful) {
                return it
            }
        }
        return null
    }

}
