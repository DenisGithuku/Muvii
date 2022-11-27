package com.githukudenis.core_navigation.navigators

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.ui.favourites.FavouritesScreen
import com.denisgithuku.movies.presentation.screens.details.MovieDetailsScreen
import com.denisgithuku.movies.presentation.screens.home.MoviesListScreen
import com.githukudenis.core_navigation.Screen

fun NavGraphBuilder.moviesGraph(
    snackbarHostState: SnackbarHostState,
    navHostController: NavHostController,
    onToggleTheme: () -> Unit
) {
    navigation(startDestination = Screen.Movies.routeId, route = Constants.moviesRoute) {
        composable(route = Screen.Movies.routeId) {
            MoviesListScreen(
                snackbarHostState = snackbarHostState,
                onToggleTheme = onToggleTheme, onOpenDetails = { movieId ->
                    navHostController.navigate(route = "movie_details" + "/${movieId}") {
//                    launchSingleTop = true
                        popUpTo(route = "movie_details") {
                            inclusive = true
                            saveState = true
                        }
                        restoreState = true
                    }
                }
            )
        }

        composable(route = "movie_details" + "/{movieId}") {
            MovieDetailsScreen(
                onOpenMovieDetails = { movieId ->
                    navHostController.navigate(route = "movie_details" + "/${movieId}") {
//                    launchSingleTop = true
                        popUpTo(route = "movie_details") {
                            inclusive = true
                            saveState = true
                        }
                        restoreState = true
                    }
                }, onNavigateUp = {
                    navHostController.navigateUp()
                },
                snackbarHostState = snackbarHostState,
                onOpenProfile = { profileId ->
                    navHostController.navigate(Screen.Profile.routeId + "/${profileId}") {
                        popUpTo(Screen.Profile.routeId) {
                            inclusive = true
                            saveState = true
                        }
                        restoreState = true
                    }
                }
            )
        }
        composable(route = Screen.Favourites.routeId) {
            FavouritesScreen(
                snackbarHostState = snackbarHostState,
                onOpenDetails = { movieId ->
                    navHostController.navigate(route = "movie_details" + "/${movieId}") {
//                    launchSingleTop = true
                        popUpTo(route = "movie_details") {
                            inclusive = true
                            saveState = true
                        }
                        restoreState = true
                    }
                }
            )
        }
        composable(route = Screen.Search.routeId) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Coming soon..."
                )
            }
        }
    }

}