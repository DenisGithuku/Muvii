package com.denisgithuku.feature_people.presentation.profile

sealed interface ProfileEvent {
    data class DismissUserMessage(val messageId: Int): ProfileEvent
    object ToggleFollowPerson : ProfileEvent
}