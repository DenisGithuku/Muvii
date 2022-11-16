package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u0014H\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u001bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "appThemeProvider", "Lcom/denisgithuku/core_data/providers/AppThemeProvider;", "(Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;Lcom/denisgithuku/core_data/providers/AppThemeProvider;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/movies/presentation/screens/home/HomeUiState;", "genresJob", "Lkotlinx/coroutines/Job;", "moviesByGenreJob", "themeJob", "trendingMoviesJob", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getGenres", "", "getMoviesByGenre", "sort_by", "Lcom/denisgithuku/movies/domain/common/SortType;", "genreId", "", "include_adult", "", "getTrending", "getUserMessagesFromException", "", "Lcom/denisgithuku/core_data/UserMessage;", "throwable", "", "onEvent", "event", "Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent;", "readUserPrefs", "searchMovie", "query", "", "toggleEnableAdultContent", "enabled", "feature_movies_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases = null;
    private final com.denisgithuku.core_data.providers.AppThemeProvider appThemeProvider = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.movies.presentation.screens.home.HomeUiState> _uiState = null;
    private kotlinx.coroutines.Job genresJob;
    private kotlinx.coroutines.Job moviesByGenreJob;
    private kotlinx.coroutines.Job trendingMoviesJob;
    private kotlinx.coroutines.Job themeJob;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.AppThemeProvider appThemeProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.movies.presentation.screens.home.HomeUiState> getUiState() {
        return null;
    }
    
    private final void getGenres() {
    }
    
    private final java.util.List<com.denisgithuku.core_data.UserMessage> getUserMessagesFromException(java.lang.Throwable throwable) {
        return null;
    }
    
    private final void getTrending() {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.home.HomeEvent event) {
    }
    
    private final void readUserPrefs() {
    }
    
    private final void toggleEnableAdultContent(boolean enabled) {
    }
    
    private final void getMoviesByGenre(com.denisgithuku.movies.domain.common.SortType sort_by, int genreId, boolean include_adult) {
    }
    
    private final void searchMovie(java.lang.String query) {
    }
}