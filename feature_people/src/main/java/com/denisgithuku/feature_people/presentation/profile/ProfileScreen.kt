package com.denisgithuku.feature_people.presentation.profile

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.denisgithuku.core_data.ui.components.JumpingBubblesLoadingIndicator
import com.denisgithuku.feature_people.domain.model.Profile

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun ProfileScreen(
    snackbarHostState: SnackbarHostState,
    onNavigateUp: () -> Unit
) {

    val profileViewModel: ProfileViewModel = hiltViewModel()
    val uiState = profileViewModel.uiState.collectAsStateWithLifecycle().value

    if (uiState.userMessages.isNotEmpty()) {
        LaunchedEffect(
            key1 = uiState.userMessages,
            key2 = snackbarHostState
        ) {
            val userMessage = uiState.userMessages[0]
            snackbarHostState.showSnackbar(message = userMessage.message)
            profileViewModel.onEvent(ProfileEvent.DismissUserMessage(messageId = userMessage.id))
        }
    }

    AnimatedVisibility(
        visible = uiState.isLoading,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            JumpingBubblesLoadingIndicator()
        }
    }

    uiState.profile?.let { profile ->
        ProfileScreenWithState(
            onNavigateUp = onNavigateUp,
            onToggleFollow = {},
            profile = profile
        )
    }

}

@Composable
private fun ProfileScreenWithState(
    onToggleFollow: (Int) -> Unit,
    onNavigateUp: () -> Unit,
    profile: Profile
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = profile.name)
    }
}