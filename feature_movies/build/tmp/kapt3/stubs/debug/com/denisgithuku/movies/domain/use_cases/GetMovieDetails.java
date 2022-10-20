package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/GetMovieDetails;", "", "movieRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "(Lcom/denisgithuku/movies/domain/repository/MoviesRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core/Resource;", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_debug"})
public final class GetMovieDetails {
    private final com.denisgithuku.movies.domain.repository.MoviesRepository movieRepository = null;
    
    @javax.inject.Inject()
    public GetMovieDetails(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core.Resource<com.denisgithuku.movies.domain.model.MovieDetails>>> continuation) {
        return null;
    }
}