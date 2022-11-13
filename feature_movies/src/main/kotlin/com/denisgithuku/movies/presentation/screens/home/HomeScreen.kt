package com.denisgithuku.movies.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.navigation.compose.hiltViewModel
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.movies.domain.common.SortType
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.TrendingMovie
import com.denisgithuku.movies.presentation.components.CustomSwitch
import com.denisgithuku.movies.presentation.components.GenreItem
import com.denisgithuku.movies.presentation.components.MovieItem
import com.denisgithuku.movies.presentation.components.TrendingMovieItem
import com.denisgithuku.movies.presentation.screens.home.components.SearchBar


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(
    scaffoldState: ScaffoldState,
    homeViewModel: HomeViewModel = hiltViewModel(),
    onToggleTheme: () -> Unit,
    onOpenDetails: (Int) -> Unit
) {
    val uiState = homeViewModel.uiState.collectAsState().value


    val dialogProperties = DialogProperties(
        dismissOnBackPress = true, dismissOnClickOutside = true
    )

    var settingsDialogOpen by rememberSaveable {
        mutableStateOf(false)
    }
    if (uiState.genresLoading) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator(
                color = MaterialTheme.colors.secondary
            )
        }
    }

    if (uiState.trendingMovieLoading) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator(
                color = MaterialTheme.colors.secondary
            )
        }
    }

    if (uiState.moviesLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator(
                color = MaterialTheme.colors.secondary
            )
        }
    }

    if (settingsDialogOpen) {
        Dialog(
            onDismissRequest = {
                settingsDialogOpen = !settingsDialogOpen
            },
            properties = dialogProperties
        ) {
            Box(
                modifier = Modifier
                    .sizeIn(minWidth = 200.dp, minHeight = 300.dp)
                    .background(MaterialTheme.colors.surface, shape = MaterialTheme.shapes.large)
            ) {
                DialogContent(
                    isDarkTheme = uiState.isSystemInDarkTheme,
                    sortTypes = uiState.sortTypes,
                    selectedSortType = uiState.selectedSortType,
                    adultContentEnabled = uiState.adultContentEnabled,
                    onToggleEnableAdultContent = {
                        homeViewModel.onEvent(HomeEvent.ToggleAdultContentEnable)
                    },
                    onChangeSortType = { sortType ->
                        homeViewModel.onEvent(HomeEvent.ChangeSortType(sortType))
                    },
                    onToggleTheme = {
                        onToggleTheme()
                        homeViewModel.onEvent(HomeEvent.ToggleTheme)
                    },
                    onDismissRequest = {
                        settingsDialogOpen = !settingsDialogOpen
                    }
                )
            }
        }
        }

    if (uiState.userMessages.isNotEmpty()) {
        val userMessage = uiState.userMessages[0]
        LaunchedEffect(scaffoldState.snackbarHostState, uiState.userMessages) {
            scaffoldState.snackbarHostState.showSnackbar(userMessage.message)
            homeViewModel.onEvent(HomeEvent.ErrorMessageDismissed(userMessage.id))
        }
    }

    HomeScreen(selectedGenre = uiState.selectedGenre,
        onChangeGenre = { genreId: Int ->
            homeViewModel.onEvent(HomeEvent.ChangeMovieGenre(genreId))
        },
        genres = uiState.genres,
        movies = uiState.movies,
        trending_movies = uiState.trending,
        onOpenDetails = onOpenDetails,
        onOpenSettings = {
            settingsDialogOpen = !settingsDialogOpen
        },
        onSearchMovies = {
            homeViewModel.onEvent(HomeEvent.Search(it))
        })
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
    selectedGenre: Int,
    onChangeGenre: (Int) -> Unit,
    onSearchMovies: (String) -> Unit,
    onOpenSettings: () -> Unit,
    genres: List<Genre>,
    movies: List<Movie>,
    trending_movies: List<TrendingMovie>,
    onOpenDetails: (Int) -> Unit
) {

    val context = LocalContext.current

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item {
            TopBar {
                onOpenSettings()
            }
        }

        item {
            SearchBar(onSearch = onSearchMovies)
        }
        item {
            LazyRow(
                state = rememberLazyListState(),
                modifier = modifier.padding(LocalAppDimens.current.medium)
            ) {
                items(items = trending_movies, key = { it.id }) { trending_movie_item ->
                    TrendingMovieItem(
                        poster_path = trending_movie_item.poster_path,
                        movieId = trending_movie_item.id,
                        context = context,
                        onSelect = { movieId ->
                            onOpenDetails(movieId)
                        },
                        modifier = modifier.padding(horizontal = LocalAppDimens.current.large)
                    )
                }
            }
        }
        item {
            LazyRow(modifier = modifier.padding(vertical = LocalAppDimens.current.medium)) {
                items(items = genres) { item: Genre ->
                    GenreItem(
                        name = item.name,
                        genreId = item.id,
                        isSelected = selectedGenre == item.id,
                        onSelect = { genre ->
                            onChangeGenre(genre)
                        },
                        modifier = modifier
                    )
                }
            }
        }
        items(items = movies, key = { it.id }) { movie ->
            MovieItem(
                title = movie.title,
                rating = movie.vote_average,
                poster = movie.poster_path,
                movieId = movie.id,
                onOpen = onOpenDetails
            )
        }
    }
}

@Composable
fun DialogContent(
    isDarkTheme: Boolean,
    sortTypes: List<SortType>,
    selectedSortType: SortType,
    adultContentEnabled: Boolean,
    onToggleEnableAdultContent: () -> Unit,
    onChangeSortType: (SortType) -> Unit,
    onToggleTheme: () -> Unit,
    onDismissRequest: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(LocalAppDimens.current.large),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
    ) {

        Text(
            text = "Settings", style = MaterialTheme.typography.h3
        )
        Divider()
        Text(
            text = "Theme",
            style = MaterialTheme.typography.subtitle1,
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomSwitch(
                selectedColor = MaterialTheme.colors.secondary,
                isToggleOn = isDarkTheme,
                unSelectedColor = MaterialTheme.colors.onSurface.copy(alpha = 0.6f)) {
                onToggleTheme()
            }
            Text(
                text = "Dark", style = MaterialTheme.typography.body2
            )
        }

        Text(
            text = "Content preferences",
            style = MaterialTheme.typography.subtitle1
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
        ) {
            CustomSwitch(
                selectedColor = MaterialTheme.colors.secondary,
                isToggleOn = adultContentEnabled,
                unSelectedColor = MaterialTheme.colors.onSurface.copy(alpha = 0.6f)
            ) {
                onToggleEnableAdultContent()
            }
            Text(
                text = "Include adult content", style = MaterialTheme.typography.body2
            )
        }

        Text(
            text = "Sort Type",
            style = MaterialTheme.typography.subtitle1
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
        ) {
            for (sortType in sortTypes) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(
                        LocalAppDimens.current.medium
                    )
                ) {
                    RadioButton(selected = sortType == selectedSortType,
                        onClick = { onChangeSortType(sortType) })
                    Text(
                        text = getSortType(sortType), style = MaterialTheme.typography.body2
                    )
                }
            }
        }

        TextButton(onClick = { onDismissRequest() }) {
            Text(
                text = "Ok",
                style = MaterialTheme.typography.button.copy(
                    color = MaterialTheme.colors.onSurface
                )
            )
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    onOpenSettings: () -> Unit,
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(LocalAppDimens.current.large),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Discover", style = MaterialTheme.typography.subtitle1)
        MuviiIconButton(onClick = { onOpenSettings() }) {
            Icon(
                painter = painterResource(id = com.denisgithuku.core_design.R.drawable.settings_outline),
                contentDescription = "Settings",
                modifier = modifier.sizeIn(
                        minHeight = 32.dp, minWidth = 32.dp, maxWidth = 32.dp, maxHeight = 32.dp
                    )
//                    .padding(LocalAppDimens.current.large)
            )
        }
    }
}


private fun getSortType(sortType: SortType): String {
    return when (sortType) {
        SortType.Popularity -> "Popular"
        SortType.ReleaseDate -> "Release date"
        SortType.Revenue -> "Revenue"
        SortType.VoteAverage -> "Vote average"
        SortType.VoteCount -> "Vote count"
    }
}


@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar {}
}


@Preview(showBackground = true)
@Composable
fun BottomSheetPrev() {
    DialogContent(isDarkTheme = true,
        sortTypes = listOf(),
        onChangeSortType = {},
        onToggleTheme = {},
        selectedSortType = SortType.Popularity,
        adultContentEnabled = true,
        onToggleEnableAdultContent = {}, onDismissRequest = {})
}
