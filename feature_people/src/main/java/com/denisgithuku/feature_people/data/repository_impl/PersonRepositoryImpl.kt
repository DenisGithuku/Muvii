package com.denisgithuku.feature_people.data.repository_impl

import com.denisgithuku.feature_people.data.remote.PeopleApiInterface
import com.denisgithuku.feature_people.data.remote.dto.PersonDTO
import com.denisgithuku.feature_people.domain.repository.PersonRepository
import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor(
    private val peopleApiInterface: PeopleApiInterface
): PersonRepository {
    override suspend fun getPersonDetails(personId: Int): PersonDTO? {
        val response = peopleApiInterface.getPersonDetails(personId)
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}