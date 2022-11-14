package com.denisgithuku.core_data.domain.repository

import com.denisgithuku.core_data.data.local.FavouriteMovieDBO

interface FavouriteMoviesRepository {
    suspend fun getFavouriteMovies(): List<FavouriteMovieDBO>
}