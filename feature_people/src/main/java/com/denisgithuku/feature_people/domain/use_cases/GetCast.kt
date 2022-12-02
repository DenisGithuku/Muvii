package com.denisgithuku.feature_people.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.feature_people.domain.model.Cast
import com.denisgithuku.feature_people.domain.repository.CastRepository
import com.denisgithuku.feature_people.domain.repository.PersonRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCast @Inject constructor(
    private val castRepository: CastRepository,
    private val personRepository: PersonRepository,
    private val dispatcherProvider: DispatcherProvider
) {
    suspend operator fun invoke(movieId: Int): Flow<Resource<List<Cast>>> = flow {
        try {
            emit(Resource.Loading())
            val cast = castRepository.getCast(movieId).map { castDTO ->
                castDTO.toCast().copy(following = personRepository.getFollowedPersonsFromDB()
                    .any { personEntity -> personEntity.personId == castDTO.id })
            }
            emit(Resource.Success(cast))
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Could not reach server. Check internet connection")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable(message = "Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(dispatcherProvider.ioDispatcher)
}