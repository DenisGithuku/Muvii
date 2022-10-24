package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.movies.domain.repository.MoviesRepository
import javax.inject.Inject

class DeleteAllFavourites @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend operator fun invoke(): Boolean {
        return try {
            moviesRepository.deleteAllFromFavourites()
            true
        } catch (e: Exception) {
            false
        }
    }
}