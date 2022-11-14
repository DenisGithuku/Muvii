package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.data.local.FavouriteMovieDBO
import com.denisgithuku.movies.domain.repository.MoviesRepository
import javax.inject.Inject

class DeleteFromFavouritesById @Inject constructor(
    private val moviesRepository: MoviesRepository
){
    suspend operator fun invoke(movie: FavouriteMovieDBO): Boolean {
        return try {
            moviesRepository.deleteFromFavourites(movie)
            true
        } catch (e: Exception) {
            false
        }
    }
}