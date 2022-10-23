package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Resource
import com.denisgithuku.core.providers.DispatcherProvider
import com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAllFavourites @Inject constructor(
    private val moviesRepository: MoviesRepository,
    private val dispatcherProvider: DispatcherProvider
){
    suspend operator fun invoke(): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val favourites = moviesRepository.getFavouriteMoviesFromNetwork().filter { movieDTO: MovieDTO ->
                moviesRepository.getFavouriteMovieIdsFromDB().any { it.movieId == movieDTO.id }
            }.map { it.toMovie() }
            emit(Resource.Success(favourites))
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Cannot reach the server. Check your internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable(message = "Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(dispatcherProvider.ioDispatcher)
}