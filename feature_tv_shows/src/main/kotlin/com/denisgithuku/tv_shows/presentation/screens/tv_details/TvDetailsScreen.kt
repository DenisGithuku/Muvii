package com.denisgithuku.tv_shows.presentation.screens.tv_details

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.domain.model.Cast
import com.denisgithuku.core_data.ui.components.JumpingBubblesLoadingIndicator
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.tv_shows.domain.model.Tv
import com.denisgithuku.tv_shows.presentation.components.CastCard
import com.denisgithuku.tv_shows.presentation.components.TvInfo
import com.githukudenis.tv_shows.R
import okhttp3.internal.trimSubstring

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun TvDetailsScreen(
    snackbarHostState: SnackbarHostState
) {
    val tvDetailsViewModel: TvDetailsViewModel = hiltViewModel()
    val uiState = tvDetailsViewModel.uiState.collectAsStateWithLifecycle().value

    AnimatedVisibility(
        visible = uiState.tvDetailsLoading,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            JumpingBubblesLoadingIndicator()
        }
    }

    if (uiState.userMessages.isNotEmpty()) {
        LaunchedEffect(
            key1 = uiState.userMessages,
            key2 = snackbarHostState
        ) {
            val userMessage = uiState.userMessages[0]
            snackbarHostState.showSnackbar(message = userMessage.message)
        }
    }

    uiState.tvDetails?.let { details ->
        TvDetailsScreen(
            tvDetailsLoading = uiState.tvDetailsLoading,
            tvDetails = details,
            castLoading = uiState.castLoading,
            onOpenProfile = {},
            onToggleFollow = {},
            castList = uiState.castList,
            onNavigateUp = {  },
            onMarkUnmarkFavourite = { },
            similarShows = uiState.similarShows
        )
    }
}

@Composable
private fun TvDetailsScreen(
    tvDetailsLoading: Boolean,
    tvDetails: Tv,
    castLoading: Boolean,
    onOpenProfile: (Int) -> Unit,
    onToggleFollow: (Int) -> Unit,
    castList: List<Cast>,
    modifier: Modifier = Modifier,
    onNavigateUp: () -> Unit,
    onMarkUnmarkFavourite: () -> Unit,
    similarShows: List<Tv>
) {
    val context = LocalContext.current

    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .sizeIn(minHeight = 200.dp, maxHeight = 400.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://image.tmdb.org/t/p/${Constants.imageSize}/${tvDetails.backdrop_path ?: tvDetails.poster_path}")
                        .crossfade(enable = true).build(),
                    contentDescription = "Poster",
                    contentScale = ContentScale.Crop,
                    modifier = modifier.fillParentMaxSize(),
                )
                Box(
                    modifier = modifier
                        .fillParentMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent, Color.Black.copy(alpha = 0.6f)
                                )
                            )
                        ),
                )
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                        .background(color = Color.Transparent)
                        .padding(
                            (LocalAppDimens.current.medium)
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MuviiIconButton(onClick = { onNavigateUp() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.secondary
                        )
                    }
                    MuviiIconButton(onClick = {
                        onMarkUnmarkFavourite()
                    }) {
                        if (tvDetails.favourite) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                tint = MaterialTheme.colorScheme.secondary,
                                contentDescription = "Favourite",
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                tint = MaterialTheme.colorScheme.secondary,
                                contentDescription = "Favourite",
                            )
                        }
                    }
                }
            }
        }

        item {
            Text(
                text = tvDetails.name,
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(
                    top = LocalAppDimens.current.medium,
                    start = LocalAppDimens.current.medium,
                    end = LocalAppDimens.current.medium

                )
            )
        }

        item {
            Text(
                text = "Storyline",
                style = MaterialTheme.typography.displaySmall,
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }

        item {
            Text(
                text = tvDetails.overview,
                style = MaterialTheme.typography.bodyMedium,
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                ),
                textAlign = TextAlign.Justify
            )
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
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.large),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                TvInfo(label = "First Air Date", value = tvDetails.first_air_date)
                TvInfo(
                    label = "Rating", value = tvDetails.vote_average.toString().trimSubstring(
                        startIndex = 0, endIndex = 3
                    )
                )
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
            Box(
                modifier = modifier.wrapContentSize(), contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(LocalAppDimens.current.large),
                    verticalArrangement = Arrangement.spacedBy(
                        LocalAppDimens.current.large
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Cast",
                        style = MaterialTheme.typography.displaySmall,
                        textAlign = TextAlign.Center
                    )
                    LazyRow(horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.large)) {
                        items(items = castList, key = { it.cast_id }) { cast ->
                            cast.profile_path?.let { profileUrl ->
                                CastCard(
                                    profileUrl = profileUrl,
                                    castId = cast.cast_id,
                                    name = cast.name,
                                    onOpenProfile = onOpenProfile,
                                    onToggleFollow = onToggleFollow,
                                    vectorId = if (cast.following) R.drawable.ic_baseline_check_24 else R.drawable.ic_baseline_add_24
                                )
                            }
                        }
                    }
                }
                AnimatedVisibility(
                    visible = castLoading,
                    enter = slideInVertically() + fadeIn(),
                    exit = slideOutVertically() + fadeOut()
                ) {
                    CircularProgressIndicator()
                }
            }
        }

        item {

            Text(
                text = "Similar movies",
                modifier = Modifier.padding(LocalAppDimens.current.large),
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.displaySmall
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.large)
            ) {

//                LazyRow(
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
//                ) {
//                    items(items = similarShows, key = { it.id }) { movie ->
//                        TrendingMovieItem(
//                            poster_path = movie.poster_path,
//                            movieId = movie.id,
//                            context = context,
//                            onSelect = onOpenSimilarMovie,
//                            modifier = Modifier.padding(horizontal = LocalAppDimens.current.large)
//                        )
//                    }
//                }

//                if (similarMoviesLoading) {
//                    CircularProgressIndicator(
//                        modifier = Modifier.align(Alignment.Center),
//                        color = MaterialTheme.colorScheme.secondary
//                    )
//                }
            }
        }

    }
}