package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Constants
import com.denisgithuku.core.providers.UserPreferences
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class ChangeUiTheme @Inject constructor(
    private val userPreferences: UserPreferences
) {
    suspend operator fun invoke(isDarkTheme: Boolean, coroutineScope: CoroutineScope) {
            userPreferences.writeIntoPreferences(Constants.UI_THEME_KEY, isDarkTheme)
    }
}
