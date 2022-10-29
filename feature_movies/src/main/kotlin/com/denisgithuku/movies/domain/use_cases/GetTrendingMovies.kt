package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.movies.domain.model.TrendingMovie
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetTrendingMovies @Inject constructor(
    private val moviesRepository: MoviesRepository,
) {
    suspend operator fun invoke(): Flow<Resource<List<TrendingMovie>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = moviesRepository.getTrendingMovies()
            emit(Resource.Success(movies.map { it.toTrendingMovie() }))
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Cannot reach the server. Check your internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable("Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(Dispatchers.IO)

}
