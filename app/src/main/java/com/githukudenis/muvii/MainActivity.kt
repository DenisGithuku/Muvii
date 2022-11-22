package com.githukudenis.muvii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.denisgithuku.core_design.ui.theme.MuviiTheme
import com.githukudenis.core_navigation.Screen
import com.githukudenis.core_navigation.navigators.MuviiNavigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    val screens = listOf<Screen>(
        Screen.Movies,
        Screen.Tv,
        Screen.Search,
        Screen.Favourites,
    )

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.uiState.map {
                    it.isSystemInDarkTheme
                }.distinctUntilChanged().collectLatest { isInDarkTheme ->
                    setContent {
                        val navHostController = rememberNavController()
                        val navState by navHostController.currentBackStackEntryAsState()
                        val currentDestination = navState?.destination
                        val snackbarHostState = remember { SnackbarHostState() }

                        MuviiTheme(useDarkTheme = isInDarkTheme) {
                            Scaffold(
                                snackbarHost = { SnackbarHost(snackbarHostState) },
                                bottomBar = {
                                    AnimatedVisibility(visible = currentDestination?.route != Screen.MovieDetails.routeId) {
                                        NavigationBar {
                                            screens.forEach { screen ->
                                                NavigationBarItem(
                                                    selected = screen.routeId == currentDestination?.route,
                                                    onClick = {
                                                        if (currentDestination?.route == screen.routeId) {
                                                            return@NavigationBarItem
                                                        }
                                                        navHostController.navigate(screen.routeId)
                                                    },
                                                    label = {
                                                        Text(
                                                            text = screen.routeId,
                                                            style = MaterialTheme.typography.labelSmall
                                                        )
                                                    },
                                                    icon = {
                                                        screen.vectorId?.let { vectorId ->
                                                            Icon(
                                                                painter = painterResource(id = vectorId),
                                                                contentDescription = null
                                                            )
                                                        }
                                                    }
                                                )
                                            }
                                        }
                                    }
                                }
                            ) { contentPadding ->
                                Box(modifier = Modifier
                                    .fillMaxSize()
                                    .padding(contentPadding)) {
                                    MuviiNavigator(
                                        snackbarHostState = snackbarHostState,
                                        navHostController = navHostController,
                                        onToggleTheme = mainViewModel::changeUiTheme,
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
