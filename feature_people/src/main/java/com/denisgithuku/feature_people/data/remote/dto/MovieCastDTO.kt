package com.denisgithuku.feature_people.data.remote.dto

data class MovieCastDTO(
    val cast: List<CastDTO>,
    val crew: List<CrewDTO>,
    val id: Int
)