package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.data.local.MovieDBO
import com.denisgithuku.movies.domain.repository.MoviesRepository
import javax.inject.Inject

class InsertIntoFavourites @Inject constructor(
    private val moviesRepository: MoviesRepository
) {

    suspend operator fun invoke(movie: MovieDBO): Boolean {
        return try {
            moviesRepository.markMovieAsFavourite(movie)
            true
        } catch (e: Exception) {
            false
        }
    }
}