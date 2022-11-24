package com.denisgithuku.feature_people.data.repository_impl

import com.denisgithuku.feature_people.data.remote.PeopleApiInterface
import com.denisgithuku.feature_people.data.remote.dto.CrewDTO
import com.denisgithuku.feature_people.domain.repository.CastRepository
import javax.inject.Inject

class CastRepositoryImpl @Inject constructor(
    private val peopleApiInterface: PeopleApiInterface
): CastRepository {
    override suspend fun getCast(movieId: Int): List<com.denisgithuku.feature_people.data.remote.dto.CastDTO> {
        val response = peopleApiInterface.getCast(movieId)
        if (response.isSuccessful) {
            response.body()?.let {
                return it.cast
            }
        }
        return emptyList()
    }

    override suspend fun getCrew(movieId: Int): List<CrewDTO> {
        val response = peopleApiInterface.getCast(movieId)
        if (response.isSuccessful) {
            response.body()?.let {
                return it.crew
            }
        }
        return emptyList()
    }
}