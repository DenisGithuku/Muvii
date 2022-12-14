package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J;\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;", "", "moviesRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "(Lcom/denisgithuku/movies/domain/repository/MoviesRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core_data/Resource;", "", "Lcom/denisgithuku/movies/domain/model/Movie;", "sortType", "Lcom/denisgithuku/movies/domain/common/SortType;", "genreId", "", "include_adult", "", "(Lcom/denisgithuku/movies/domain/common/SortType;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_debug"})
public final class GetMoviesByGenre {
    private final com.denisgithuku.movies.domain.repository.MoviesRepository moviesRepository = null;
    
    @javax.inject.Inject()
    public GetMoviesByGenre(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository moviesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.common.SortType sortType, int genreId, boolean include_adult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core_data.Resource<? extends java.util.List<com.denisgithuku.movies.domain.model.Movie>>>> continuation) {
        return null;
    }
}