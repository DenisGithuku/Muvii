package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMoviePoster @Inject constructor(
    private val moviesRepository: MoviesRepository
) {

    suspend operator fun invoke(path: String): String? {
        return try {
            val image = moviesRepository.getImagePoster(path)
            image
        } catch (e: Exception) {
            null
        }
    }
}
