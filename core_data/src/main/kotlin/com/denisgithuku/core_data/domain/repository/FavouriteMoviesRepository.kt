package com.denisgithuku.core_data.domain.repository

import com.denisgithuku.core_data.data.local.FavouriteMovieDBO
import com.denisgithuku.core_data.data.remote.dto.FavouriteMovieDTO

interface FavouriteMoviesRepository {
    suspend fun getFavouriteMoviesFromDB(): List<FavouriteMovieDBO>

    suspend fun getFavouriteMoviesFromNetwork(): List<FavouriteMovieDTO>

    suspend fun toggleFavourite(movie: FavouriteMovieDBO, favourite: Boolean)

    suspend fun deleteAllFavourites()
}