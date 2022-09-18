package com.denisgithuku.movies.data.data_src.repository_impl

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface
import com.denisgithuku.movies.data.data_src.remote.dto.AllMoviesByCategoryDTO
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


class MoviesRepositoryImpl @Inject constructor(
    private val moviesApiInterface: MoviesApiInterface,
) : MoviesRepository {
    override suspend fun getMovieGenres(): Flow<Resource<List<Genre>>> = flow {
        try {
            emit(Resource.Loading())
            val response = moviesApiInterface.getGenres()
            if (response.isSuccessful) {
                emit(Resource.Success(response.body()?.genres?.map {
                    it.toGenre()
                } ?: emptyList()))
                return@flow
            }
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }

    }.flowOn(Dispatchers.IO)

    override suspend fun getMoviesInCategory(): Flow<Resource<AllMoviesByCategoryDTO>> = flow {
        try {
            emit(Resource.Loading())
            val response = moviesApiInterface
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }


}
