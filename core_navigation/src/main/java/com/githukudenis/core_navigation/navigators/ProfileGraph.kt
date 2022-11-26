package com.githukudenis.core_navigation.navigators

import androidx.compose.material3.SnackbarHostState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.denisgithuku.core_data.Constants
import com.denisgithuku.feature_people.presentation.profile.ProfileScreen
import com.githukudenis.core_navigation.Screen

fun NavGraphBuilder.profileGraph(
    navHostController: NavHostController,
    snackbarHostState: SnackbarHostState
) {
    navigation(startDestination = Screen.Profile.routeId, route = Constants.peopleRoute) {
        composable(route = Screen.Profile.routeId + "/{profileId}") {
            ProfileScreen(
                snackbarHostState = snackbarHostState,
                onNavigateUp = {
                    navHostController.navigateUp()
                }
            )
        }
    }
}