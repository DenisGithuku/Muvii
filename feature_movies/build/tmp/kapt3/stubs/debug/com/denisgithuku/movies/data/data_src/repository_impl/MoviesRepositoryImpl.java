package com.denisgithuku.movies.data.data_src.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/denisgithuku/movies/data/data_src/repository_impl/MoviesRepositoryImpl;", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "moviesApiInterface", "Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;", "(Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;)V", "getMovieGenres", "", "Lcom/denisgithuku/movies/data/data_src/remote/dto/MovieGenreDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesByGenre", "Lcom/denisgithuku/movies/data/data_src/remote/dto/MovieDTO;", "sort_by", "", "genreId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingMovies", "Lcom/denisgithuku/movies/data/data_src/remote/dto/TrendingMovieDTO;", "feature_movies_debug"})
public final class MoviesRepositoryImpl implements com.denisgithuku.movies.domain.repository.MoviesRepository {
    private final com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface moviesApiInterface = null;
    
    @javax.inject.Inject()
    public MoviesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface moviesApiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMoviesByGenre(@org.jetbrains.annotations.NotNull()
    java.lang.String sort_by, int genreId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.MovieDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTrendingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO>> continuation) {
        return null;
    }
}