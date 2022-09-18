package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMoviesByGenre @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend operator fun invoke(genre: String): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = moviesRepository.getMoviesByGenre(genre = genre)
            emit(Resource.Success(movies.map { it.toMovie() }))
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(Dispatchers.IO)
}
