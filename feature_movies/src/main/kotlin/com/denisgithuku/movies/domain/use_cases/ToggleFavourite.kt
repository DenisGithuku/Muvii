package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.data.local.FavouriteMovieDBO
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository
import javax.inject.Inject

class ToggleFavourite @Inject constructor(
    private val favouriteMoviesRepository: FavouriteMoviesRepository
) {

    suspend operator fun invoke(movie: FavouriteMovieDBO, favourite: Boolean): Boolean {
        return try {
            favouriteMoviesRepository.toggleFavourite(movie, favourite)
            true
        } catch (e: Exception) {
            false
        }
    }
}