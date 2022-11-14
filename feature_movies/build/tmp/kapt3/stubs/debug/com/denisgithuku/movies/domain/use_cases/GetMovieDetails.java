package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/GetMovieDetails;", "", "movieRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "favouriteMoviesRepository", "Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;", "formatDateUseCase", "Lcom/denisgithuku/movies/domain/use_cases/FormatDateUseCase;", "dispatcherProvider", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "(Lcom/denisgithuku/movies/domain/repository/MoviesRepository;Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;Lcom/denisgithuku/movies/domain/use_cases/FormatDateUseCase;Lcom/denisgithuku/core_data/providers/DispatcherProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core_data/Resource;", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_debug"})
public final class GetMovieDetails {
    private final com.denisgithuku.movies.domain.repository.MoviesRepository movieRepository = null;
    private final com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository favouriteMoviesRepository = null;
    private final com.denisgithuku.movies.domain.use_cases.FormatDateUseCase formatDateUseCase = null;
    private final com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider = null;
    
    @javax.inject.Inject()
    public GetMovieDetails(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository movieRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository favouriteMoviesRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.FormatDateUseCase formatDateUseCase, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core_data.Resource<com.denisgithuku.movies.domain.model.MovieDetails>>> continuation) {
        return null;
    }
}