package com.denisgithuku.core_data.providers

import com.denisgithuku.core_data.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import javax.inject.Inject

class AppThemeProvider @Inject constructor(
    private val userPreferences: UserPreferences,
) {
    suspend fun getUserTheme(externalScope: CoroutineScope): SharedFlow<Boolean> = flow {
        val themeInDarkMode = userPreferences.readFromPreferences(Constants.UI_THEME_KEY)
        emit(themeInDarkMode)
    }.shareIn(
            scope = externalScope, started = SharingStarted.WhileSubscribed(), replay = 1
        )

    suspend fun changeUserTheme(value: Boolean) =
        userPreferences.writeIntoPreferences(Constants.UI_THEME_KEY, value = value)
}
