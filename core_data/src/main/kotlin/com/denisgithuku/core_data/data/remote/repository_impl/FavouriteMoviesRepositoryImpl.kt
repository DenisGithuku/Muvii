package com.denisgithuku.core_data.data.remote.repository_impl

import com.denisgithuku.core_data.data.local.FavouriteMovieDBO
import com.denisgithuku.core_data.data.local.FavouriteMoviesDao
import com.denisgithuku.core_data.data.remote.FavouriteMovieInterface
import com.denisgithuku.core_data.data.remote.dto.FavouriteMovieDTO
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository
import javax.inject.Inject

class FavouriteMoviesRepositoryImpl @Inject constructor(
    private val favouriteMoviesApiInterface: FavouriteMovieInterface,
    private val favouriteMoviesDao: FavouriteMoviesDao
) : FavouriteMoviesRepository {
    override suspend fun getFavouriteMoviesFromDB(): List<FavouriteMovieDBO> {
        return favouriteMoviesDao.getFavouriteMovies()
    }

    override suspend fun getFavouriteMoviesFromNetwork(): List<FavouriteMovieDTO> {
        val res = favouriteMoviesApiInterface.getFavouriteMovies()
        return if (res.isSuccessful) {
            res.body()?.results ?: emptyList()
        } else emptyList()
    }

    override suspend fun toggleFavourite(movie: FavouriteMovieDBO, favourite: Boolean) {
        if (favourite) {
            favouriteMoviesDao.insertMovie(movie)
        } else {
            favouriteMoviesDao.deleteMovie(movie)
        }
    }

    override suspend fun deleteAllFavourites() {
        return favouriteMoviesDao.deleteAllFavouriteMovies()
    }
}