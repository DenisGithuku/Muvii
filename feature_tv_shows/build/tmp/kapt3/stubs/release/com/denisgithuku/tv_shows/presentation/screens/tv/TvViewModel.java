package com.denisgithuku.tv_shows.presentation.screens.tv;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/denisgithuku/tv_shows/presentation/screens/tv/TvViewModel;", "Landroidx/lifecycle/ViewModel;", "tvUseCases", "Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;", "(Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/tv_shows/presentation/screens/tv/TvUiState;", "getTvsJob", "Lkotlinx/coroutines/Job;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getShows", "", "feature_tv_shows_release"})
public final class TvViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.tv_shows.domain.use_cases.TvUseCases tvUseCases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.tv_shows.presentation.screens.tv.TvUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.tv_shows.presentation.screens.tv.TvUiState> uiState = null;
    private kotlinx.coroutines.Job getTvsJob;
    
    @javax.inject.Inject()
    public TvViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.domain.use_cases.TvUseCases tvUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.tv_shows.presentation.screens.tv.TvUiState> getUiState() {
        return null;
    }
    
    private final void getShows() {
    }
}