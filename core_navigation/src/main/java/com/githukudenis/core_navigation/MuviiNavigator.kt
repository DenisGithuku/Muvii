package com.githukudenis.core_navigation

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.denisgithuku.movies.presentation.screens.details.DetailsScreen
import com.denisgithuku.movies.presentation.screens.home.HomeScreen

@Composable
fun MuviiNavigator(
    scaffoldState: ScaffoldState, navHostController: NavHostController, onToggleTheme: () -> Unit
) {
    NavHost(navController = navHostController, startDestination = Home.route) {
        composable(route = Home.route) {
            HomeScreen(onToggleTheme = onToggleTheme, onOpenDetails = { movieId ->
                navHostController.navigate(route = Details.route + "/${movieId}") {
//                    launchSingleTop = true
                    popUpTo(route = Details.route) {
                        inclusive = true
                        saveState = true
                    }
                    restoreState = true
                }
            })
        }

        composable(route = Details.route + "/{movieId}") {
            DetailsScreen(
                onOpenMovieDetails = { movieId ->
                navHostController.navigate(route = Details.route + "/${movieId}") {
//                    launchSingleTop = true
                    popUpTo(route = Details.route) {
                        inclusive = true
                        saveState = true
                    }
                    restoreState = true
                }
            }, onNavigateUp = {
                navHostController.navigateUp()
            })
        }
    }
}