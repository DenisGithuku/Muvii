package com.denisgithuku.feature_people.domain.repository

import com.denisgithuku.feature_people.data.remote.dto.CastDTO
import com.denisgithuku.feature_people.data.remote.dto.CrewDTO

interface CastRepository {
    suspend fun getCast(movieId: Int): List<CastDTO>

    suspend fun getCrew(movieId: Int): List<CrewDTO>

}