package com.githukudenis.core_navigation.navigators

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.denisgithuku.core_data.Constants

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MuviiNavigator(
    snackbarHostState: SnackbarHostState,
    navHostController: NavHostController,
    isInDarkTheme: Boolean,
    onToggleTheme: () -> Unit
) {
    NavHost(navController = navHostController, startDestination = Constants.moviesRoute) {
        moviesGraph(
            snackbarHostState = snackbarHostState,
            navHostController = navHostController,
            isInDarkTheme = isInDarkTheme,
            onToggleTheme = onToggleTheme
        )
        tvGraph(
            navHostController = navHostController,
            snackbarHostState = snackbarHostState
        )
    }
}