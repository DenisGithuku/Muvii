package com.denisgithuku.tv_shows.presentation.screens.tv_details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/denisgithuku/tv_shows/presentation/screens/tv_details/TvDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "tvUseCases", "Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/tv_shows/presentation/screens/tv_details/TvDetailsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getTvDetails", "", "tvId", "", "feature_tv_shows_release"})
public final class TvDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.tv_shows.domain.use_cases.TvUseCases tvUseCases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsUiState> _uiState = null;
    
    @javax.inject.Inject()
    public TvDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.domain.use_cases.TvUseCases tvUseCases, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsUiState> getUiState() {
        return null;
    }
    
    private final void getTvDetails(int tvId) {
    }
}