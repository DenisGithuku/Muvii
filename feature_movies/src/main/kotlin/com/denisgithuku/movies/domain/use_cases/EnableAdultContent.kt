package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.providers.UserPreferences
import javax.inject.Inject

class EnableAdultContent @Inject constructor(
    private val userPreferences: UserPreferences
) {
    suspend operator fun invoke(value: Boolean) = userPreferences.writeIntoPreferences(Constants.ADULT_CONTENT_ENABLED_KEY, value)
}
