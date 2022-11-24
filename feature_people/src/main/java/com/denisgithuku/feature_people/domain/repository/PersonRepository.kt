package com.denisgithuku.feature_people.domain.repository

import com.denisgithuku.feature_people.data.remote.dto.PersonDTO

interface PersonRepository {
    suspend fun getPersonDetails(personId: Int): PersonDTO?

}