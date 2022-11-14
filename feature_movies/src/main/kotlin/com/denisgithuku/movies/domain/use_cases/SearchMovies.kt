package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.domain.model.SearchMovieItem
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SearchMovies @Inject constructor(
    private val moviesRepository: MoviesRepository,
    private val dispatcherProvider: DispatcherProvider
) {

    suspend operator fun invoke(query: String): Flow<Resource<List<SearchMovieItem>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = moviesRepository.search(query)
            emit(Resource.Success(movies.map {  it.toSearchMovieItem() } ))
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Cannot reach the server. Check your internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable("Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }
        .flowOn(dispatcherProvider.ioDispatcher)
}