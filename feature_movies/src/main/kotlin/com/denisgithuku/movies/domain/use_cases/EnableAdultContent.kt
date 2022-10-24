package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Constants
import com.denisgithuku.core.providers.UserPreferences
import javax.inject.Inject

class EnableAdultContent @Inject constructor(
    private val userPreferences: UserPreferences
) {
    suspend operator fun invoke(value: Boolean) = userPreferences.writeIntoPreferences(Constants.ADULT_CONTENT_ENABLED_KEY, value)
}
