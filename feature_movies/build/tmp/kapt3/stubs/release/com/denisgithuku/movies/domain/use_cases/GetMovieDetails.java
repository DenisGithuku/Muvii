package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/GetMovieDetails;", "", "movieRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "formatDateUseCase", "Lcom/denisgithuku/movies/domain/use_cases/FormatDateUseCase;", "(Lcom/denisgithuku/movies/domain/repository/MoviesRepository;Lcom/denisgithuku/movies/domain/use_cases/FormatDateUseCase;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core/Resource;", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_release"})
public final class GetMovieDetails {
    private final com.denisgithuku.movies.domain.repository.MoviesRepository movieRepository = null;
    private final com.denisgithuku.movies.domain.use_cases.FormatDateUseCase formatDateUseCase = null;
    
    @javax.inject.Inject()
    public GetMovieDetails(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository movieRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.FormatDateUseCase formatDateUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core.Resource<com.denisgithuku.movies.domain.model.MovieDetails>>> continuation) {
        return null;
    }
}