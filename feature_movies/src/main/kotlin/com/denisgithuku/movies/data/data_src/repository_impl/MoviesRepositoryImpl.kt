package com.denisgithuku.movies.data.data_src.repository_impl

import com.denisgithuku.core_data.data.local.FavouriteMoviesDao
import com.denisgithuku.core_data.data.local.MovieDBO
import com.denisgithuku.core_data.data.remote.dto.SearchItemDTO
import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface
import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO
import com.denisgithuku.movies.data.data_src.remote.dto.movie_details.MovieDetailsDTO
import com.denisgithuku.movies.domain.repository.MoviesRepository
import javax.inject.Inject


class MoviesRepositoryImpl @Inject constructor(
    private val moviesApiInterface: MoviesApiInterface,
    private val favouriteMoviesDao: FavouriteMoviesDao
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

    override suspend fun getMoviesByGenre(
        sort_by: String,
        genreId: Int,
        include_adult: Boolean
    ): List<MovieDTO> {
        val response = moviesApiInterface.getMoviesByGenre(
            sort_by = sort_by,
            genre_id = genreId,
            include_adult = include_adult
        )
        response.body()?.let {
            if (response.isSuccessful) {
                return it.results
            }
        }
        return emptyList()
    }

    override suspend fun getTrendingMovies(): List<TrendingMovieDTO> {
        val response = moviesApiInterface.getTrendingMovies()


        response.body()?.let {
            if (response.isSuccessful) {

                return it.results
            }

        }
        return emptyList()
    }

    override suspend fun getMovieDetails(movieId: Int): MovieDetailsDTO? {
        val response = moviesApiInterface.getMovieDetails(movieId)
        response.body()?.let {
            if (response.isSuccessful) {
                return it
            }
        }
        return null
    }

    override suspend fun getSimilarMovies(movieId: Int): List<MovieDTO> {
        val response = moviesApiInterface.getSimilarMovies(movieId)
        response.body()?.let {
            if (response.isSuccessful)  {
                return it.results
            }
        }
        return emptyList()
    }

    override suspend fun markMovieAsFavourite(movie: MovieDBO) {
        return favouriteMoviesDao.insertMovie(movie)
    }

    override suspend fun getFavouriteMovieIdsFromDB(): List<MovieDBO> {
        return favouriteMoviesDao.getFavouriteMovies()
    }

    override suspend fun deleteFromFavourites(movie: MovieDBO) {
        return favouriteMoviesDao.deleteMovie(movie)
    }

    override suspend fun getFavouriteMoviesFromNetwork(): List<MovieDTO> {
        val response = moviesApiInterface.getFavouriteMovies()
        response.body()?.let {
            if (response.isSuccessful) {
                return it.results
            }
        }
        return emptyList()
    }

    override suspend fun search(query: String): List<SearchItemDTO> {
        val response = moviesApiInterface.searchMovies(query = query)
        response.body()?.let {
            if (response.isSuccessful) {
                return it.results
            }
        }
        return emptyList()
    }

    override suspend fun deleteAllFromFavourites() {
        return favouriteMoviesDao.deleteAllFavouriteMovies()
    }

}
