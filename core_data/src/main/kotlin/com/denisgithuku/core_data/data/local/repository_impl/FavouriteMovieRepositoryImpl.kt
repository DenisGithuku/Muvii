package com.denisgithuku.core_data.data.local.repository_impl

import com.denisgithuku.core_data.data.local.FavouriteMovieDBO
import com.denisgithuku.core_data.data.local.FavouriteMoviesDao
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository
import javax.inject.Inject

class FavouriteMovieRepositoryImpl @Inject constructor(
    private val favouriteMoviesDao: FavouriteMoviesDao,
) : FavouriteMoviesRepository {

    override suspend fun getFavouriteMovies(): List<FavouriteMovieDBO> {
        return favouriteMoviesDao.getFavouriteMovies()
    }
}