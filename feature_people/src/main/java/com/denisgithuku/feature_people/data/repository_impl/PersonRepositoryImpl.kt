package com.denisgithuku.feature_people.data.repository_impl

import com.denisgithuku.core_data.data.local.PersonEntity
import com.denisgithuku.core_data.data.local.PersonsDao
import com.denisgithuku.feature_people.data.remote.PeopleApiInterface
import com.denisgithuku.feature_people.data.remote.dto.PersonDTO
import com.denisgithuku.feature_people.domain.repository.PersonRepository
import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor(
    private val peopleApiInterface: PeopleApiInterface,
    private val personsDao: PersonsDao
): PersonRepository {
    override suspend fun getPersonDetails(personId: Int): PersonDTO? {
        val response = peopleApiInterface.getPersonDetails(personId)
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }

    override suspend fun getFollowedPersonsFromDB(): List<PersonEntity> {
        return personsDao.getFollowedPersonsList()
    }

    override suspend fun getFollowedPerson(personId: Int): PersonEntity {
        return personsDao.getFollowedPerson(personId = personId)
    }

    override suspend fun toggleFollowPerson(personId: Int) {
        val followed = personsDao.getFollowedPersonsList().any { personEntity ->
            personEntity.personId == personId
        }
        if (followed) {
            personsDao.deletePerson(personEntity = PersonEntity(personId = personId))
        } else {
            personsDao.insertPerson(personEntity = PersonEntity(personId = personId))
        }
    }
}