package com.denisgithuku.movies.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.navigation.compose.hiltViewModel
import com.denisgithuku.design.ui.theme.LocalAppDimens
import com.denisgithuku.movies.domain.common.SortType
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.TrendingMovie
import com.denisgithuku.movies.presentation.components.CustomSwitch
import com.denisgithuku.movies.presentation.components.GenreItem
import com.denisgithuku.movies.presentation.components.MovieItem
import com.denisgithuku.movies.presentation.components.TrendingMovieItem
import com.githukudenis.movies.R
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
) {
    val uiState = homeViewModel.uiState.collectAsState().value
    val scaffoldState =
        rememberBottomSheetScaffoldState(bottomSheetState = BottomSheetState(initialValue = BottomSheetValue.Collapsed))
    val coroutineScope = rememberCoroutineScope()



    BottomSheetScaffold(scaffoldState = scaffoldState,
        sheetContent = {
            BottomSheetColumnContent(isLightTheme = !isSystemInDarkTheme(),
                sortTypes = uiState.sortTypes,
                onChangeSortType = {
                    if (it != uiState.selectedSortType) {
                        homeViewModel.onEvent(HomeEvent.ChangeSortType(it))
                    }
                },
                onToggleTheme = {
                                homeViewModel.onEvent(HomeEvent.ToggleDarkTheme)
                },
                selectedSortType = uiState.selectedSortType,
                adultContentEnabled = uiState.adultContentEnabled,
                onToggleEnableAdultContent = { homeViewModel.onEvent(HomeEvent.ToggleAdultContentEnable) })
        },
        sheetBackgroundColor = MaterialTheme.colors.surface,
        sheetPeekHeight = LocalAppDimens.current.default,
        sheetElevation = LocalAppDimens.current.large,
        sheetShape = MaterialTheme.shapes.large.copy(topEnd = CornerSize(18.dp),
            topStart = CornerSize(18.dp)),

        topBar = {
            TopBar {
                coroutineScope.launch {
                    if (scaffoldState.bottomSheetState.isCollapsed) {
                        scaffoldState.bottomSheetState.expand()
                    } else {
                        scaffoldState.bottomSheetState.collapse()
                    }
                }
            }
        }) {

        if (uiState.genresLoading) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                CircularProgressIndicator()
            }
        }

        if (uiState.trendingMovieLoading) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                CircularProgressIndicator()
            }
        }

        if (uiState.moviesLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        if (uiState.userMessages.isNotEmpty()) {
            val userMessage = uiState.userMessages[0]
            LaunchedEffect(scaffoldState.snackbarHostState, uiState.userMessages) {
                scaffoldState.snackbarHostState.showSnackbar(userMessage.message)
                homeViewModel.onEvent(HomeEvent.ErrorMessageDismissed(userMessage.id))
            }
        }

        HomeScreen(selectedGenre = uiState.selectedGenre, onChangeGenre = { genreId: Int ->
            homeViewModel.onEvent(HomeEvent.ChangeMovieGenre(genreId))
        }, genres = uiState.genres, movies = uiState.movies, trending_movies = uiState.trending)
    }
}

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
    selectedGenre: Int,
    onChangeGenre: (Int) -> Unit,
    genres: List<Genre>,
    movies: List<Movie>,
    trending_movies: List<TrendingMovie>,
) {


    val context = LocalContext.current

    LazyColumn(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {

        item {
            SearchBar(modifier = modifier
                .fillMaxWidth()
                .padding(LocalAppDimens.current.medium))
        }
        item {
            LazyRow(state = rememberLazyListState(),
                modifier = modifier.padding(LocalAppDimens.current.medium)) {
                items(items = trending_movies, key = { it.id }) { trending_movie_item ->
                    TrendingMovieItem(poster_path = trending_movie_item.poster_path,
                        movieId = trending_movie_item.id,
                        context = context,
                        onSelect = {},
                        modifier = modifier.padding(horizontal = LocalAppDimens.current.medium)
                    )
                }
            }
        }
        item {
            LazyRow(modifier = modifier.padding(vertical = LocalAppDimens.current.medium)) {
                items(items = genres) { item: Genre ->
                    GenreItem(name = item.name,
                        genreId = item.id,
                        isSelected = selectedGenre == item.id,
                        onSelect = { genre ->
                            onChangeGenre(genre)
                        },
                        modifier = modifier)
                }
            }
        }
        items(items = movies, key = { it.id }) { movie ->
            MovieItem(title = movie.title,
                rating = movie.vote_average,
                poster = movie.poster_path,
                movieId = movie.id,
                onClick = {})
        }


    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetColumnContent(
    modifier: Modifier = Modifier,
    isLightTheme: Boolean,
    sortTypes: List<SortType>,
    selectedSortType: SortType,
    adultContentEnabled: Boolean,
    onToggleEnableAdultContent: () -> Unit,
    onChangeSortType: (SortType) -> Unit,
    onToggleTheme: () -> Unit,
) {
    val dialogOpen = remember {
        mutableStateOf(false)
    }
    Column(modifier = modifier
        .fillMaxWidth()
        .padding(LocalAppDimens.current.large),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {

        BottomSheetColumnItem {
            Text("App Theme", style = MaterialTheme.typography.subtitle2)
            Surface(onClick = {
                onToggleTheme()
            },
                shape = MaterialTheme.shapes.large,
                color = MaterialTheme.colors.onSurface.copy(alpha = 0.1f)) {
                Icon(modifier = modifier.padding(LocalAppDimens.current.medium),
                    painter = painterResource(id = if (isLightTheme) R.drawable.ic_moon24 else R.drawable.ic_sun_24),
                    contentDescription = "Toggle app theme icon")
            }
        }
        BottomSheetColumnItem {
            Text(text = "Sort by", style = MaterialTheme.typography.subtitle2)
            Box(modifier = modifier
                .sizeIn(
                    minWidth = LocalAppDimens.current.button_width,
                    minHeight = LocalAppDimens.current.button_height,
                    maxWidth = LocalAppDimens.current.button_width,
                    maxHeight = LocalAppDimens.current.button_height,
                )
                .clip(MaterialTheme.shapes.medium)

                .clickable {
                    dialogOpen.value = !dialogOpen.value
                }
                .border(width = 1.dp,
                    color = MaterialTheme.colors.onPrimary.copy(alpha = 0.3f),
                    shape = MaterialTheme.shapes.medium), contentAlignment = Alignment.Center) {
                Row(modifier = modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.medium),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween) {

                    Text(text = getSortType(selectedSortType),
                        style = MaterialTheme.typography.overline)
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Category",
                    )
                }
            }
        }

        BottomSheetColumnItem {
            Text(text = "Trending", style = MaterialTheme.typography.subtitle2)
            Row(modifier = modifier
                .fillMaxWidth()
                .padding(LocalAppDimens.current.medium),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {

                Text(text = getSortType(selectedSortType),
                    style = MaterialTheme.typography.overline)
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "Category",
                )
            }
        }

        BottomSheetColumnItem {
            Text(text = "Include adult content", style = MaterialTheme.typography.subtitle2)
            CustomSwitch(isToggleOn = adultContentEnabled,
                selectedColor = MaterialTheme.colors.secondary,
                unSelectedColor = MaterialTheme.colors.onSurface.copy(alpha = 0.3f),
                onToggleOption = {
                    onToggleEnableAdultContent()
                })
        }


        if (dialogOpen.value) {
            Dialog(properties = DialogProperties(dismissOnBackPress = true,
                dismissOnClickOutside = true), onDismissRequest = {
                onChangeSortType(selectedSortType)
                dialogOpen.value = !dialogOpen.value
            }) {
                Box(
                    modifier = modifier
                        .sizeIn(minWidth = 150.dp, minHeight = 300.dp)
                        .background(color = MaterialTheme.colors.surface,
                            shape = MaterialTheme.shapes.large),
                    contentAlignment = Alignment.Center,
                ) {
                    Column(modifier = modifier.padding(LocalAppDimens.current.large)) {
                        sortTypes.forEach { sortType ->
                            Row(horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = modifier
                                    .fillMaxWidth()
                                    .padding(LocalAppDimens.current.extra_small)
                                    .clickable {
                                        dialogOpen.value = !dialogOpen.value
                                        onChangeSortType(sortType)
                                    }) {
                                Text(getSortType(sortType),
                                    style = MaterialTheme.typography.subtitle2)
                                RadioButton(selected = selectedSortType == sortType, onClick = {
                                    dialogOpen.value = !dialogOpen.value
                                    onChangeSortType(sortType)
                                })
                            }
                            if (sortTypes.indexOf(sortType) < sortTypes.size - 1) {
                                Divider()
                            }
                        }
                    }
                }
            }
        }

    }
}

@Composable
fun BottomSheetColumnItem(
    modifier: Modifier = Modifier,
    content: @Composable (RowScope.() -> Unit),
) {
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(LocalAppDimens.current.medium),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        content = content)
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    onSelectSortAndFilter: () -> Unit,
) {

    Row(modifier = modifier
        .fillMaxWidth()
        .padding(LocalAppDimens.current.medium),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Discover", style = MaterialTheme.typography.subtitle1)
        Surface(
            color = MaterialTheme.colors.onBackground.copy(alpha = 0.1f),
            shape = MaterialTheme.shapes.large,
            onClick = {
                onSelectSortAndFilter()
            },
        ) {
            Icon(modifier = modifier.padding(LocalAppDimens.current.large),
                painter = painterResource(id = com.githukudenis.core.R.drawable.sliders1_svgrepo_com),
                contentDescription = "Filter and Sort")
        }
    }
}


@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
) {
    val query = remember {
        mutableStateOf("")
    }
    TextField(
        value = query.value, onValueChange = { query.value = it },
        placeholder = {
            Text("Search by keyword", style = MaterialTheme.typography.caption)
        },
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            backgroundColor = Color.Black.copy(alpha = 0.1f)),
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.fillMaxWidth(0.9f),
    )
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
    BottomSheetColumnContent(isLightTheme = true,
        sortTypes = listOf(),
        onChangeSortType = {},
        onToggleTheme = {},
        selectedSortType = SortType.Popularity,
        adultContentEnabled = true,
        onToggleEnableAdultContent = {})
}
