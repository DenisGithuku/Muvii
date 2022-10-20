package com.denisgithuku.core.providers

import com.denisgithuku.core.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import javax.inject.Inject

class GetUserTheme @Inject constructor(
    private val userPreferences: UserPreferences,
) {
    suspend operator fun invoke(externalScope: CoroutineScope): SharedFlow<Boolean> = flow {

        val isSystemInDarkTheme = userPreferences.readFromPreferences(Constants.UI_THEME_KEY)
        emit(isSystemInDarkTheme)


    }.shareIn(
        scope = externalScope,
        started = SharingStarted.WhileSubscribed(),
        replay = 1
    )
}
