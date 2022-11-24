package com.denisgithuku.feature_people.presentation.profile

sealed class ProfileEvent {
    data class DismissUserMessage(val messageId: Int): ProfileEvent()
}