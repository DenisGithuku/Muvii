package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "(Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/movies/presentation/screens/home/HomeUiState;", "genresJob", "Lkotlinx/coroutines/Job;", "moviesByGenreJob", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getGenres", "", "getMoviesByGenre", "genre", "", "getUserMessagesFromException", "", "Lcom/denisgithuku/core/UserMessage;", "throwable", "", "onEvent", "event", "Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent;", "feature_movies_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.movies.presentation.screens.home.HomeUiState> _uiState = null;
    private kotlinx.coroutines.Job genresJob;
    private kotlinx.coroutines.Job moviesByGenreJob;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases) {
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
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.home.HomeEvent event) {
    }
    
    private final void getMoviesByGenre(java.lang.String genre) {
    }
}