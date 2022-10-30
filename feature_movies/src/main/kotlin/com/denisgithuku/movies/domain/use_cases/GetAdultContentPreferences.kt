package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.providers.UserPreferences
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.shareIn
import javax.inject.Inject

class GetAdultContentPreferences @Inject constructor(
    private val userPreferences: UserPreferences
) {
    suspend operator fun invoke(externalScope: CoroutineScope): SharedFlow<Boolean> = flow {
        val adultContentEnabled = userPreferences.readFromPreferences(Constants.ADULT_CONTENT_ENABLED_KEY)
        emit(adultContentEnabled)
    }.shareIn(
        scope = externalScope,
        started = SharingStarted.WhileSubscribed(),
        replay = 1
    )
}
