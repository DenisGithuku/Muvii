package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAllMovieGenres @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend operator fun invoke(): Flow<Resource<List<Genre>>> = flow {
        try {
            emit(Resource.Loading())
            val genres = moviesRepository.getMovieGenres()
            emit(Resource.Success(genres.map { it.toGenre() }))
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Could not reach server. Check internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable(message = "Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(Dispatchers.IO)
}
