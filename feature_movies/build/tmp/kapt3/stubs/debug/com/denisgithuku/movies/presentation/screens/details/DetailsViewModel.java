package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001bH\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006&"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "movieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "coreMuviiUseCases", "Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;", "peopleUseCases", "Lcom/denisgithuku/feature_people/domain/use_cases/PeopleUseCases;", "dispatcherProvider", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "personRepository", "Lcom/denisgithuku/feature_people/domain/repository/PersonRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;Lcom/denisgithuku/feature_people/domain/use_cases/PeopleUseCases;Lcom/denisgithuku/core_data/providers/DispatcherProvider;Lcom/denisgithuku/feature_people/domain/repository/PersonRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiState;", "moviesJob", "Lkotlinx/coroutines/Job;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCast", "", "movieId", "", "getMovieDetails", "getSimilarMovies", "onEvent", "event", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "toggleFavourite", "favourite", "", "toggleFollowPerson", "castId", "feature_movies_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases = null;
    private final com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases = null;
    private final com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases peopleUseCases = null;
    private final com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider = null;
    private final com.denisgithuku.feature_people.domain.repository.PersonRepository personRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.denisgithuku.movies.presentation.screens.details.DetailsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.denisgithuku.movies.presentation.screens.details.DetailsUiState> uiState = null;
    private kotlinx.coroutines.Job moviesJob;
    
    @javax.inject.Inject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.MovieUseCases movieUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases peopleUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.feature_people.domain.repository.PersonRepository personRepository, @org.jetbrains.annotations.NotNull()
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
    
    private final void toggleFavourite(int movieId, boolean favourite) {
    }
    
    private final void getCast(int movieId) {
    }
    
    private final void toggleFollowPerson(int castId) {
    }
}