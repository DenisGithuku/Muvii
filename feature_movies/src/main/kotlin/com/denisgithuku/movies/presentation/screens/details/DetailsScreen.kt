package com.denisgithuku.movies.presentation.screens.details

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
import com.denisgithuku.core_design.ui.components.ConfirmationDialog
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.components.RoundedRectangleChip
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.MovieDetails
import com.denisgithuku.movies.presentation.components.TrendingMovieItem
import com.denisgithuku.movies.presentation.screens.details.components.CastCard
import com.denisgithuku.movies.presentation.screens.details.components.MovieInfo
import com.githukudenis.movies.R
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment
import com.google.accompanist.flowlayout.FlowMainAxisAlignment
import com.google.accompanist.flowlayout.FlowRow
import okhttp3.internal.trimSubstring

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun DetailsScreen(
    snackbarHostState: SnackbarHostState,
    detailsViewModel: DetailsViewModel = hiltViewModel(),
    onOpenMovieDetails: (Int) -> Unit,
    onNavigateUp: () -> Unit
) {
    val uiState = detailsViewModel.uiState.collectAsStateWithLifecycle().value


    AnimatedVisibility(
        visible = uiState.movieDetailsLoading,
        enter = fadeIn() + slideInVertically(),
        exit = fadeOut() + slideOutVertically()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            JumpingBubblesLoadingIndicator()
        }
    }

    if (uiState.userMessages.isNotEmpty()) {
        LaunchedEffect(uiState.userMessages, snackbarHostState) {
            snackbarHostState.showSnackbar(uiState.userMessages[0].message)
            detailsViewModel.onEvent(DetailsUiEvent.UserMessageDismiss(uiState.userMessages[0].id))
        }
    }

    if (uiState.showConfirmationDialog) {
        ConfirmationDialog(
            dialogTitleId = com.denisgithuku.core_design.R.string.delete_from_favourites_title,
            dialogDescriptionId = com.denisgithuku.core_design.R.string.delete_from_favourites_desc,
            confirmButtonTextId = com.denisgithuku.core_design.R.string.confirm_button_text,
            cancelButtonTextId = com.denisgithuku.core_design.R.string.cancel_button_text,
            onConfirm = {
                detailsViewModel.onEvent(DetailsUiEvent.MarkUnmarkFavourite)
                detailsViewModel.onEvent(DetailsUiEvent.UserDialogDismiss)
            },
            onCancel = {
                detailsViewModel.onEvent(DetailsUiEvent.UserDialogDismiss)
            },
            dismissable = true
        )

    }

    uiState.movieDetails?.let { movieDetails ->
        DetailsScreenWithState(movieDetails = movieDetails,
            similarMoviesLoading = uiState.similarMoviesLoading,
            similarMovies = uiState.similarMovies,
            onOpenSimilarMovie = onOpenMovieDetails,
            onNavigateUp = onNavigateUp,
            onMarkUnmarkFavourite = {
                detailsViewModel.onEvent(
                    DetailsUiEvent.MarkUnmarkFavourite
                )
            },
            castLoading = uiState.castLoading,
            castList = uiState.cast,
            onOpenProfile = {

            },
            onToggleFollow = {

            })
    }
}

@Composable
fun DetailsScreenWithState(
    movieDetails: MovieDetails,
    similarMoviesLoading: Boolean,
    castLoading: Boolean,
    castList: List<Cast>,
    onOpenProfile: (Int) -> Unit,
    onToggleFollow: (Int) -> Unit,
    similarMovies: List<Movie>,
    onOpenSimilarMovie: (Int) -> Unit,
    onMarkUnmarkFavourite: () -> Unit,
    onNavigateUp: () -> Unit,
) {
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .sizeIn(minHeight = 200.dp, maxHeight = 400.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://image.tmdb.org/t/p/${Constants.imageSize}/${movieDetails.backdrop_path ?: movieDetails.poster_path}")
                        .crossfade(enable = true).build(),
                    contentDescription = "Poster",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillParentMaxSize(),
                )
                Box(
                    modifier = Modifier
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
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                        .background(color = Color.Transparent)
                        .padding(
                            (LocalAppDimens.current.medium)
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MuviiIconButton(onClick = onNavigateUp) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.secondary
                        )
                    }
                    MuviiIconButton(onClick = {
                        onMarkUnmarkFavourite()
                    }) {
                        if (movieDetails.favourite) {
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
                text = movieDetails.title,
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
            FlowRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = LocalAppDimens.current.extra_large,
                        start = LocalAppDimens.current.extra_large,
                        end = LocalAppDimens.current.extra_large,


                        ),
                mainAxisAlignment = FlowMainAxisAlignment.Center,
                crossAxisAlignment = FlowCrossAxisAlignment.Center,
                mainAxisSpacing = LocalAppDimens.current.medium,
                crossAxisSpacing = LocalAppDimens.current.medium
            ) {
                movieDetails.genres.forEach { name ->
                    RoundedRectangleChip(label = name)
                }
            }
        }

        item {
            Text(
                text = movieDetails.overview,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                ),
                textAlign = TextAlign.Justify
            )
        }
        item {
            Divider(
                modifier = Modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.large),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                MovieInfo(label = "Release Date", value = movieDetails.release_date)
                MovieInfo(
                    label = "Rating", value = movieDetails.vote_average.toString().trimSubstring(
                        startIndex = 0, endIndex = 3
                    )
                )
            }
        }

        item {
            Divider(
                modifier = Modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }

        item {
            Box(
                modifier = Modifier.wrapContentSize(), contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier
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

                LazyRow(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
                ) {
                    items(items = similarMovies, key = { it.id }) { movie ->
                        TrendingMovieItem(
                            poster_path = movie.poster_path,
                            movieId = movie.id,
                            context = context,
                            onSelect = onOpenSimilarMovie,
                            modifier = Modifier.padding(horizontal = LocalAppDimens.current.large)
                        )
                    }
                }

                if (similarMoviesLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center),
                        color = MaterialTheme.colorScheme.secondary
                    )
                }
            }
        }

    }
}