package com.denisgithuku.core_data.domain.use_cases

import com.denisgithuku.core_data.Resource
import com.denisgithuku.core_data.domain.model.Person
import com.denisgithuku.core_data.domain.repository.PersonRepository
import com.denisgithuku.core_data.providers.DispatcherProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPerson @Inject constructor(
    private val personRepository: PersonRepository,
    private val dispatcherProvider: DispatcherProvider,
) {
    suspend operator fun invoke(personId: Int): Flow<Resource<Person?>> = flow {
        try {
            emit(Resource.Loading())
            val person = personRepository.getPersonDetails(personId = personId)?.toPerson()
            emit(Resource.Success(person))
        } catch (e: IOException) {
            emit(Resource.Error(e))
        } catch (e: HttpException) {
            emit(Resource.Error(e))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }
    }.flowOn(dispatcherProvider.ioDispatcher)
}