package com.denisgithuku.core_data.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.domain.model.FavouriteMovie
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository
import com.denisgithuku.core_data.providers.DispatcherProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetFavouriteMovies @Inject constructor(
    private val favoriteMoviesRepository: FavouriteMoviesRepository,
    private val dispatcherProvider: DispatcherProvider
) {
    suspend operator fun invoke(): Flow<Resource<List<FavouriteMovie>>> = flow {
        try {
            emit(Resource.Loading())
            val dbMovies = favoriteMoviesRepository.getFavouriteMoviesFromDB()
            val networkMovies = favoriteMoviesRepository.getFavouriteMoviesFromNetwork()

            val filteredMovies = networkMovies.filter { networkMovie ->
                dbMovies.any { dbMovie ->
                    dbMovie.movieId == networkMovie.id
                }
            }
            emit(Resource.Success(filteredMovies.map { it.toFavouriteMovie() }))

        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Could not reach server. Check internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable(message = "Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(dispatcherProvider.ioDispatcher)
}