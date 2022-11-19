package com.denisgithuku.core_data.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J!\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;", "", "deleteAllFavourites", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteMoviesFromDB", "", "Lcom/denisgithuku/core_data/data/local/FavouriteMovieDBO;", "getFavouriteMoviesFromNetwork", "Lcom/denisgithuku/core_data/data/remote/dto/FavouriteMovieDTO;", "toggleFavourite", "movie", "favourite", "", "(Lcom/denisgithuku/core_data/data/local/FavouriteMovieDBO;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_data_release"})
public abstract interface FavouriteMoviesRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavouriteMoviesFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.local.FavouriteMovieDBO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavouriteMoviesFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.remote.dto.FavouriteMovieDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object toggleFavourite(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.FavouriteMovieDBO movie, boolean favourite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllFavourites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}