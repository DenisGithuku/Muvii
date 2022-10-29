package com.githukudenis.muvii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.rememberScaffoldState
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.compose.rememberNavController
import com.denisgithuku.core_design.ui.theme.MuviiTheme
import com.githukudenis.core_navigation.MuviiNavigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.uiState.map {
                    it.isSystemInDarkTheme
                }.distinctUntilChanged().collectLatest { darkTheme ->
                    setContent {
                        val navHostController = rememberNavController()
                        val scaffoldState = rememberScaffoldState()
                        MuviiTheme(darkTheme = darkTheme) {
                            MuviiNavigator(
                                scaffoldState = scaffoldState,
                                navHostController = navHostController,
                                onToggleTheme = mainViewModel::changeUiTheme
                            )
                        }
                    }
                }
            }
        }
    }
}
