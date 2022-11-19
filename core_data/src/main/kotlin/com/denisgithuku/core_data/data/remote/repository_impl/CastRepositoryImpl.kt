package com.denisgithuku.core_data.data.remote.repository_impl

import com.denisgithuku.core_data.data.remote.CoreInterface
import com.denisgithuku.core_data.data.remote.dto.CastDTO
import com.denisgithuku.core_data.data.remote.dto.CrewDTO
import com.denisgithuku.core_data.domain.repository.CastRepository
import javax.inject.Inject

class CastRepositoryImpl @Inject constructor(
    private val coreInterface: CoreInterface
) : CastRepository {
    override suspend fun getCast(movieId: Int): List<CastDTO> {
        val response = coreInterface.getCast(movieId)
        if (response.isSuccessful) {
            response.body()?.let {
                return it.cast
            }
        }
        return emptyList()
    }

    override suspend fun getCrew(movieId: Int): List<CrewDTO> {
        val response = coreInterface.getCast(movieId)
        if (response.isSuccessful) {
            response.body()?.crew
        }
        return emptyList()
    }
}