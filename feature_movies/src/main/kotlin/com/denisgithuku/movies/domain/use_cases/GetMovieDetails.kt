package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.domain.model.MovieDetails
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetMovieDetails @Inject constructor(
    private val movieRepository: MoviesRepository
) {

    suspend operator fun invoke(movieId: Int): Flow<Resource<MovieDetails>> = flow {
        try {
            emit(Resource.Loading())
            val res = movieRepository.getMovieDetails(movieId)
            res?.let {
                emit(Resource.Success(it.toMovie()))
            }

        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(Throwable("Something wrong happened")))
        }
    }
}