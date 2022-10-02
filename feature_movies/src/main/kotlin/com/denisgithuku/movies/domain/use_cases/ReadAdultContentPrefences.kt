package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.providers.UserPreferences
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import javax.inject.Inject

class ReadAdultContentPrefences @Inject constructor(
    private val userPreferences: UserPreferences
) {
    suspend operator fun invoke(key: String, externalScope: CoroutineScope): SharedFlow<Boolean> = flow {
        val systemInDarkTheme = userPreferences.readFromPreferences(key)
        emit(systemInDarkTheme)
    }.shareIn(
        scope = externalScope,
        started = SharingStarted.WhileSubscribed(),
        replay = 1
    )
}
