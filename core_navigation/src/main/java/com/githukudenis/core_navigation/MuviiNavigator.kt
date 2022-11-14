package com.githukudenis.core_navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.denisgithuku.core_data.ui.favourites.FavouritesScreen
import com.denisgithuku.movies.presentation.screens.details.DetailsScreen
import com.denisgithuku.movies.presentation.screens.home.HomeScreen

@Composable
fun MuviiNavigator(
    snackbarHostState: SnackbarHostState,
    navHostController: NavHostController,
    isInDarkTheme: Boolean,
    onToggleTheme: () -> Unit
) {
    NavHost(navController = navHostController, startDestination = Screen.Home.routeId) {
        composable(route = Screen.Home.routeId) {
            HomeScreen(
                snackbarHostState = snackbarHostState,
                onToggleTheme = onToggleTheme, onOpenDetails = { movieId ->
                navHostController.navigate(route = "details" + "/${movieId}") {
//                    launchSingleTop = true
                    popUpTo(route = "details") {
                        inclusive = true
                        saveState = true
                    }
                    restoreState = true
                }
            }, isInDarkTheme = isInDarkTheme)
        }

        composable(route = "details" + "/{movieId}") {
            DetailsScreen(
                onOpenMovieDetails = { movieId ->
                navHostController.navigate(route = "details" + "/${movieId}") {
//                    launchSingleTop = true
                    popUpTo(route = "details") {
                        inclusive = true
                        saveState = true
                    }
                    restoreState = true
                }
            }, onNavigateUp = {
                navHostController.navigateUp()
            },
                snackbarHostState = snackbarHostState
            )
        }
        composable(route = Screen.Shows.routeId) {
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
        composable(route = Screen.Favourites.routeId) {
            FavouritesScreen(snackbarHostState = snackbarHostState)
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