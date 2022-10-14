package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\u0013H\u0002J\b\u0010\'\u001a\u00020\u0013H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "appThemeProvider", "Lcom/denisgithuku/core/providers/AppThemeProvider;", "(Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;Lcom/denisgithuku/core/providers/AppThemeProvider;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/movies/presentation/screens/home/HomeUiState;", "genresJob", "Lkotlinx/coroutines/Job;", "moviesByGenreJob", "trendingMoviesJob", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "changeUiTheme", "", "enableAdultContent", "getGenres", "getMoviesByGenre", "sort_by", "Lcom/denisgithuku/movies/domain/common/SortType;", "genreId", "", "include_adult", "", "getTrending", "getUserMessagesFromException", "", "Lcom/denisgithuku/core/UserMessage;", "throwable", "", "onEvent", "event", "Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent;", "readUiThemePrefs", "readUserPrefs", "feature_movies_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases = null;
    private final com.denisgithuku.core.providers.AppThemeProvider appThemeProvider = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.movies.presentation.screens.home.HomeUiState> _uiState = null;
    private kotlinx.coroutines.Job genresJob;
    private kotlinx.coroutines.Job moviesByGenreJob;
    private kotlinx.coroutines.Job trendingMoviesJob;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.providers.AppThemeProvider appThemeProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.movies.presentation.screens.home.HomeUiState> getUiState() {
        return null;
    }
    
    private final void getGenres() {
    }
    
    private final java.util.List<com.denisgithuku.core.UserMessage> getUserMessagesFromException(java.lang.Throwable throwable) {
        return null;
    }
    
    private final void getTrending() {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.home.HomeEvent event) {
    }
    
    private final void readUserPrefs() {
    }
    
    private final void readUiThemePrefs() {
    }
    
    private final void changeUiTheme() {
    }
    
    private final void enableAdultContent() {
    }
    
    private final void getMoviesByGenre(com.denisgithuku.movies.domain.common.SortType sort_by, int genreId, boolean include_adult) {
    }
}