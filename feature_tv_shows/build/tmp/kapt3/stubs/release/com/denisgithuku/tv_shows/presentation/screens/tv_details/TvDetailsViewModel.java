package com.denisgithuku.tv_shows.presentation.screens.tv_details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/denisgithuku/tv_shows/presentation/screens/tv_details/TvDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "tvUseCases", "Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;", "coreMuviiUseCases", "Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;", "peopleUseCases", "Lcom/denisgithuku/feature_people/domain/use_cases/PeopleUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;Lcom/denisgithuku/feature_people/domain/use_cases/PeopleUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/tv_shows/presentation/screens/tv_details/TvDetailsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCast", "", "movieId", "", "getTvDetails", "tvId", "onEvent", "tvDetailsEvent", "Lcom/denisgithuku/tv_shows/presentation/screens/tv_details/TvDetailsEvent;", "feature_tv_shows_release"})
public final class TvDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.tv_shows.domain.use_cases.TvUseCases tvUseCases = null;
    private final com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases = null;
    private final com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases peopleUseCases = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsUiState> _uiState = null;
    
    @javax.inject.Inject()
    public TvDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.domain.use_cases.TvUseCases tvUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases peopleUseCases, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsUiState> getUiState() {
        return null;
    }
    
    private final void getTvDetails(int tvId) {
    }
    
    private final void getCast(int movieId) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsEvent tvDetailsEvent) {
    }
}