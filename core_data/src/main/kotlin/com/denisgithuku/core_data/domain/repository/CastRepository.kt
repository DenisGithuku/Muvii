package com.denisgithuku.core_data.domain.repository

import com.denisgithuku.core_data.data.remote.dto.CastDTO
import com.denisgithuku.core_data.data.remote.dto.CrewDTO

interface CastRepository {
    suspend fun getCast(movieId: Int): List<CastDTO>

    suspend fun getCrew(movieId: Int): List<CrewDTO>
}