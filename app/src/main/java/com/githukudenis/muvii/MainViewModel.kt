package com.githukudenis.muvii

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.denisgithuku.core_data.providers.AppThemeProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val appThemeProvider: AppThemeProvider,
) : ViewModel() {

    private val _uiState: MutableStateFlow<MainActivityUiState> =
        MutableStateFlow(MainActivityUiState())
    val uiState: StateFlow<MainActivityUiState> = _uiState.asStateFlow()

    init {
        getAppTheme()
    }

    private fun getAppTheme() {
        viewModelScope.launch {
            appThemeProvider.getUserTheme(viewModelScope).collectLatest { isSystemInDarkTheme ->
                Log.d("prefs", isSystemInDarkTheme.toString())
                _uiState.update {
                    it.copy(isSystemInDarkTheme = isSystemInDarkTheme)
                }
            }
        }
    }

    fun changeUiTheme() {
        viewModelScope.launch {
            appThemeProvider.changeUserTheme(!_uiState.value.isSystemInDarkTheme).also {
                getAppTheme()
            }
        }
    }
}
