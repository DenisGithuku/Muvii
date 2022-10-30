package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetSimilarMoviesById @Inject constructor(
    private val moviesRepository: MoviesRepository
) {

    suspend operator fun invoke(movieId: Int): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = moviesRepository.getSimilarMovies(movieId)
            emit(Resource.Success(movies.map { it.toMovie() }))
        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(Throwable(e.localizedMessage ?: "Something wrong happened")))
        }
    }.flowOn(Dispatchers.IO)
}