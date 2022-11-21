package com.githukudenis.core_navigation.navigators

import androidx.compose.material3.SnackbarHostState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.denisgithuku.core_data.Constants
import com.denisgithuku.tv_shows.presentation.screens.tv.TvScreen
import com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsScreen
import com.githukudenis.core_navigation.Screen

fun NavGraphBuilder.tvGraph(
    navHostController: NavHostController,
    snackbarHostState: SnackbarHostState,
) {
    navigation(startDestination = Screen.Tv.routeId, route = Constants.tvShowsRoute) {
            composable(route = Screen.Tv.routeId) {
                TvScreen(snackbarHostState = snackbarHostState, onOpenDetails = { tvId ->
                    navHostController.navigate(Screen.TvDetails.routeId + "/${tvId}") {
                      popUpTo(Screen.TvDetails.routeId) {
                          inclusive = true
                          saveState = true
                      }
                        restoreState = true
                    }
                })
            }
            composable(route = Screen.TvDetails.routeId + "/{tvId}") {
                TvDetailsScreen(
                    snackbarHostState = snackbarHostState,
                    onNavigateUp = {
                        navHostController.navigateUp()
                    }
                )
            }
        }
    }
