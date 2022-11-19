package com.denisgithuku.core_data.ui.favourites;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/denisgithuku/core_data/ui/favourites/FavouritesViewModel;", "Landroidx/lifecycle/ViewModel;", "coreMovieUseCases", "Lcom/denisgithuku/core_data/domain/use_cases/CoreMovieUseCases;", "(Lcom/denisgithuku/core_data/domain/use_cases/CoreMovieUseCases;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/core_data/ui/favourites/FavouritesUiState;", "favouriteMoviesJob", "Lkotlinx/coroutines/Job;", "getFavouriteMoviesJob", "()Lkotlinx/coroutines/Job;", "setFavouriteMoviesJob", "(Lkotlinx/coroutines/Job;)V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getFavouriteMovies", "", "core_data_release"})
public final class FavouritesViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.core_data.domain.use_cases.CoreMovieUseCases coreMovieUseCases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.core_data.ui.favourites.FavouritesUiState> _uiState = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job favouriteMoviesJob;
    
    @javax.inject.Inject()
    public FavouritesViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.use_cases.CoreMovieUseCases coreMovieUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.core_data.ui.favourites.FavouritesUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getFavouriteMoviesJob() {
        return null;
    }
    
    public final void setFavouriteMoviesJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    private final void getFavouriteMovies() {
    }
}