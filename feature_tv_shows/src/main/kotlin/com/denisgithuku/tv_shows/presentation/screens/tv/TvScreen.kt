package com.denisgithuku.tv_shows.presentation.screens.tv

import androidx.compose.animation.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
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
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.tv_shows.domain.model.Tv
import com.denisgithuku.tv_shows.presentation.components.TvItem

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun TvScreen(
    snackbarHostState: SnackbarHostState,
    onOpenDetails: (Int) -> Unit
) {
    val viewModel: TvViewModel = hiltViewModel()
    val uiState = viewModel.uiState.collectAsStateWithLifecycle().value
    
    if (uiState.tvLoading) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            AnimatedVisibility(
                visible = uiState.tvLoading,
                enter = fadeIn() + slideInVertically(),
                exit = fadeOut() + slideOutVertically()
            ) {
                JumpingBubblesLoadingIndicator()
            }
        }
    }
    
    if (uiState.userMessages.isNotEmpty()) {
        LaunchedEffect(uiState.userMessages, snackbarHostState) {
            val message = uiState.userMessages[0]
            snackbarHostState.showSnackbar(message.message)
            viewModel.onEvent(TvEvent.DismissUserMessage(messageId = message.id))
        }
    }
    
    TvScreen(shows = uiState.shows, onOpenDetails = onOpenDetails)
    
}

@Composable
private fun TvScreen(
    shows: List<Tv>,
    onOpenDetails: (Int) -> Unit,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
    ) {
        item {
            Text(
                text = "Tv",
                style = MaterialTheme.typography.displayLarge
            )
        }
        items(items = shows, key = { tv -> tv.id }) { tv ->
            TvItem(
                title = tv.name,
                favourite = tv.favourite,
                poster = tv.poster_path,
                tvId = tv.id,
                onOpen = onOpenDetails,
                onToggleFavourite = {},
            )
        }
    }
}