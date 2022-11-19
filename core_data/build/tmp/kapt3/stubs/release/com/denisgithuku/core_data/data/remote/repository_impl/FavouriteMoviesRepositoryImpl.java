package com.denisgithuku.core_data.data.remote.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/denisgithuku/core_data/data/remote/repository_impl/FavouriteMoviesRepositoryImpl;", "Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;", "favouriteMoviesApiInterface", "Lcom/denisgithuku/core_data/data/remote/CoreInterface;", "favouriteMoviesDao", "Lcom/denisgithuku/core_data/data/local/FavouriteMoviesDao;", "(Lcom/denisgithuku/core_data/data/remote/CoreInterface;Lcom/denisgithuku/core_data/data/local/FavouriteMoviesDao;)V", "deleteAllFavourites", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteMoviesFromDB", "", "Lcom/denisgithuku/core_data/data/local/FavouriteMovieDBO;", "getFavouriteMoviesFromNetwork", "Lcom/denisgithuku/core_data/data/remote/dto/FavouriteMovieDTO;", "toggleFavourite", "movie", "favourite", "", "(Lcom/denisgithuku/core_data/data/local/FavouriteMovieDBO;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_data_release"})
public final class FavouriteMoviesRepositoryImpl implements com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository {
    private final com.denisgithuku.core_data.data.remote.CoreInterface favouriteMoviesApiInterface = null;
    private final com.denisgithuku.core_data.data.local.FavouriteMoviesDao favouriteMoviesDao = null;
    
    @javax.inject.Inject()
    public FavouriteMoviesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.remote.CoreInterface favouriteMoviesApiInterface, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.FavouriteMoviesDao favouriteMoviesDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavouriteMoviesFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.local.FavouriteMovieDBO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavouriteMoviesFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.remote.dto.FavouriteMovieDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object toggleFavourite(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.FavouriteMovieDBO movie, boolean favourite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllFavourites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}