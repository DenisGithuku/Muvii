package com.githukudenis.muvii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.denisgithuku.design.ui.theme.MuviiTheme
import com.denisgithuku.movies.presentation.screens.home.HomeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MuviiTheme {
                HomeScreen()
            }
        }
    }
}
