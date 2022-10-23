package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "moviesRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "dispatcherProvider", "Lcom/denisgithuku/core/providers/DispatcherProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;Lcom/denisgithuku/movies/domain/repository/MoviesRepository;Lcom/denisgithuku/core/providers/DispatcherProvider;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiState;", "moviesJob", "Lkotlinx/coroutines/Job;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteFromFavourites", "", "movieId", "", "getFavouriteMovies", "getMovieDetails", "getSimilarMovies", "markAsFavourite", "movieDBO", "Lcom/denisgithuku/core/data/local/MovieDBO;", "onEvent", "event", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "feature_movies_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases = null;
    private final com.denisgithuku.movies.domain.repository.MoviesRepository moviesRepository = null;
    private final com.denisgithuku.core.providers.DispatcherProvider dispatcherProvider = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.movies.presentation.screens.details.DetailsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.movies.presentation.screens.details.DetailsUiState> uiState = null;
    private kotlinx.coroutines.Job moviesJob;
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository moviesRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.providers.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.movies.presentation.screens.details.DetailsUiState> getUiState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent event) {
    }
    
    private final void getMovieDetails(int movieId) {
    }
    
    private final void getSimilarMovies(int movieId) {
    }
    
    private final void getFavouriteMovies() {
    }
    
    private final void markAsFavourite(com.denisgithuku.core.data.local.MovieDBO movieDBO) {
    }
    
    private final void deleteFromFavourites(int movieId) {
    }
}