package com.denisgithuku.tv_shows.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.tv_shows.domain.model.Tv
import com.denisgithuku.tv_shows.domain.repository.TvRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetShowDetails @Inject constructor(
    private val tvRepository: TvRepository,
    private val dispatcherProvider: DispatcherProvider
) {
    suspend operator fun invoke(tvId: Int): Flow<Resource<Tv?>> = flow {
        try {
            emit(Resource.Loading())
            val showDetails = tvRepository.getShowDetails(tvId)?.toTv()
            emit(Resource.Success(showDetails))
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Could not reach server. Check internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable(message = "Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(dispatcherProvider.ioDispatcher)
}