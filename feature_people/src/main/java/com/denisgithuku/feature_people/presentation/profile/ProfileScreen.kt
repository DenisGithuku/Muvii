@file:OptIn(ExperimentalMaterial3Api::class)

package com.denisgithuku.feature_people.presentation.profile

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.ui.components.JumpingBubblesLoadingIndicator
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.components.RoundedRectangleChip
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.feature_people.domain.model.Profile

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun ProfileScreen(
    snackbarHostState: SnackbarHostState, onNavigateUp: () -> Unit
) {

    val profileViewModel: ProfileViewModel = hiltViewModel()
    val uiState = profileViewModel.uiState.collectAsStateWithLifecycle().value

    if (uiState.userMessages.isNotEmpty()) {
        LaunchedEffect(
            key1 = uiState.userMessages, key2 = snackbarHostState
        ) {
            val userMessage = uiState.userMessages[0]
            snackbarHostState.showSnackbar(message = userMessage.message)
            profileViewModel.onEvent(ProfileEvent.DismissUserMessage(messageId = userMessage.id))
        }
    }

    AnimatedVisibility(
        visible = uiState.isLoading, enter = fadeIn(), exit = fadeOut()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            JumpingBubblesLoadingIndicator()
        }
    }

    uiState.profile?.let { profile ->
        ProfileScreenWithState(
            onNavigateUp = onNavigateUp,
            onToggleFollow = { profileViewModel.onEvent(ProfileEvent.ToggleFollowPerson) },
            profile = profile
        )
    }

}

@Composable
private fun ProfileScreenWithState(
    onToggleFollow: (Int) -> Unit,
    onNavigateUp: () -> Unit,
    profile: Profile,
    modifier: Modifier = Modifier
) {

    val context = LocalContext.current
    val following = rememberSaveable {
        mutableStateOf(if (profile.following) "Following" else "Follow")
    }

    val gender = rememberSaveable {
        mutableStateOf(
            when (profile.gender) {
                1 -> "Female"
                2 -> "Male"
                else -> "Rather not say"
            }
        )
    }

    LazyColumn(
        modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(
            LocalAppDimens.current.large
        )
    ) {
        item {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = profile.name,
                    )
                },
                modifier = modifier,
                navigationIcon = {
                    MuviiIconButton(onClick = onNavigateUp, icon = {
                        Icon(
                            imageVector = Icons.Default.ArrowBack, contentDescription = "Back"
                        )
                    })
                },

                )
        }

        item {
            Column(
                modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(
                    LocalAppDimens.current.large
                ), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://image.tmdb.org/t/p/${Constants.imageSize}/${profile.profile_path}")
                        .crossfade(true).build(),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Profile",
                    modifier = modifier
                        .sizeIn(
                            minWidth = 150.dp,
                            minHeight = 150.dp,
                            maxHeight = 150.dp,
                            maxWidth = 150.dp
                        )
                        .clip(CircleShape)
                )
                RoundedRectangleChip(
                    label = following.value
                )
            }
        }
        item {
            if (profile.also_known_as.isNotEmpty()) {
                Column(
                    modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(
                        LocalAppDimens.current.medium
                    ), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Also known as", style = MaterialTheme.typography.bodyMedium
                    )
                    LazyRow(
                        contentPadding = PaddingValues(LocalAppDimens.current.large),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(
                            LocalAppDimens.current.large
                        )
                    ) {
                        items(profile.also_known_as) { also_known_as ->
                            RoundedRectangleChip(
                                modifier = modifier, label = also_known_as
                            )
                        }
                    }
                }
            }
        }
        item {
            if (profile.biography.isNotEmpty()) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            LocalAppDimens.current.extra_large
                        ), verticalArrangement = Arrangement.spacedBy(
                        LocalAppDimens.current.large
                    ), horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Biography",
                        style = MaterialTheme.typography.bodyLarge,
                    )
                    Text(
                        text = profile.biography,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }

        item {
            Divider(
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }

        item {
            Column(
                modifier = modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(
                    LocalAppDimens.current.large
                ), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Additional Information", style = MaterialTheme.typography.bodyLarge
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier.fillMaxWidth()
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Gender", style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = gender.value, style = MaterialTheme.typography.labelMedium
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Popularity", style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = "${profile.popularity}",
                            style = MaterialTheme.typography.labelMedium
                        )
                    }
                }

                profile.homepage?.let { homepage ->
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(
                                top = LocalAppDimens.current.extra_large,
                                start = LocalAppDimens.current.extra_large,
                                end = LocalAppDimens.current.extra_large,
                            ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(
                            LocalAppDimens.current.large
                        )
                    ) {
                        Text(
                            text = "Homepage:", style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = homepage.toString(),
                            maxLines = 1,
                            textDecoration = TextDecoration.Underline,
                            overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = Color.Blue.copy(alpha = 0.8f)
                            ),
                        )
                    }
                }
            }
        }

    }
}