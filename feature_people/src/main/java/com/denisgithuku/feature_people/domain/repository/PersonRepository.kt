package com.denisgithuku.feature_people.domain.repository

import com.denisgithuku.core_data.data.local.PersonEntity
import com.denisgithuku.feature_people.data.remote.dto.PersonDTO

interface PersonRepository {
    suspend fun getPersonDetails(personId: Int): PersonDTO?

    suspend fun getFollowedPersonsFromDB(): List<PersonEntity>

    suspend fun getFollowedPerson(personId: Int): PersonEntity

    suspend fun toggleFollowPerson(personId: Int)

}