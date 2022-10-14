package com.githukudenis.muvii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.denisgithuku.design.ui.theme.MuviiTheme
import com.denisgithuku.movies.presentation.screens.home.HomeScreen
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
                        MuviiTheme(darkTheme = darkTheme) {
                            HomeScreen(
                                onToggleTheme = { mainViewModel.changeUiTheme() }
                            )
                        }
                    }
                }
            }
        }
    }
}
