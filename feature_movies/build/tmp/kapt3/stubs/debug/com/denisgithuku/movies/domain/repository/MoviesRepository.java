package com.denisgithuku.movies.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "", "getMovieGenres", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core/Resource;", "", "Lcom/denisgithuku/movies/domain/model/Genre;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_debug"})
public abstract interface MoviesRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core.Resource<? extends java.util.List<com.denisgithuku.movies.domain.model.Genre>>>> continuation);
}