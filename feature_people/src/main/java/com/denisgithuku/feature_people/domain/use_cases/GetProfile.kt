package com.denisgithuku.feature_people.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.feature_people.domain.model.Profile
import com.denisgithuku.feature_people.domain.repository.PersonRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetProfile @Inject constructor(
    private val personRepository: PersonRepository,
    private val dispatcherProvider: DispatcherProvider
) {
    suspend operator fun invoke(personId: Int): Flow<Resource<Profile?>> = flow {
        try {
            emit(Resource.Loading())
            val profile = personRepository.getPersonDetails(personId = personId)?.toProfile()?.copy(
                following = personRepository.getFollowedPersonsFromDB()
                    .any { personEntity -> personEntity.personId == personId }
            )
            emit(Resource.Success(profile))
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(dispatcherProvider.ioDispatcher)
}