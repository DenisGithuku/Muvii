package com.denisgithuku.core_data.data.remote.repository_impl

import com.denisgithuku.core_data.data.remote.CoreInterface
import com.denisgithuku.core_data.data.remote.dto.PersonDTO
import com.denisgithuku.core_data.domain.repository.PersonRepository
import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor(
    private val coreInterface: CoreInterface
): PersonRepository {
    override suspend fun getPersonDetails(personId: Int): PersonDTO? {
        val response = coreInterface.getPersonDetails(personId)
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}