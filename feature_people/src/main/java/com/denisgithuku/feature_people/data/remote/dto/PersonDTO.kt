package com.denisgithuku.feature_people.data.remote.dto

import com.denisgithuku.feature_people.domain.model.Profile

data class PersonDTO(
    val adult: Boolean,
    val also_known_as: List<String>,
    val biography: String,
    val birthday: String,
    val deathday: Any,
    val gender: Int,
    val homepage: Any,
    val id: Int,
    val imdb_id: String,
    val known_for_department: String,
    val name: String,
    val place_of_birth: String,
    val popularity: Double,
    val profile_path: String
) {
    fun toPerson(): Profile {
        return Profile(
            adult,
            also_known_as,
            biography,
            gender,
            homepage,
            id,
            imdb_id,
            known_for_department,
            name,
            place_of_birth,
            popularity,
            profile_path
        )
    }
}