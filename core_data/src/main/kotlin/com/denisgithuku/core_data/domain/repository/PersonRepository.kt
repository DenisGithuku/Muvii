package com.denisgithuku.core_data.domain.repository

import com.denisgithuku.core_data.data.remote.dto.PersonDTO

interface PersonRepository {
    suspend fun getPersonDetails(personId: Int): PersonDTO?

}