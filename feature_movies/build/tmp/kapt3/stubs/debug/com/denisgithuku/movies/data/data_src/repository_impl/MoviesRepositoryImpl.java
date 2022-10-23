package com.denisgithuku.movies.data.data_src.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/denisgithuku/movies/data/data_src/repository_impl/MoviesRepositoryImpl;", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "moviesApiInterface", "Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;", "favouriteMoviesDao", "Lcom/denisgithuku/core/data/local/FavouriteMoviesDao;", "(Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;Lcom/denisgithuku/core/data/local/FavouriteMoviesDao;)V", "deleteAllFromFavourites", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromFavourites", "movie", "Lcom/denisgithuku/core/data/local/MovieDBO;", "(Lcom/denisgithuku/core/data/local/MovieDBO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteMovieIdsFromDB", "", "getFavouriteMoviesFromNetwork", "Lcom/denisgithuku/movies/data/data_src/remote/dto/movie/MovieDTO;", "getMovieDetails", "Lcom/denisgithuku/movies/data/data_src/remote/dto/movie_details/MovieDetailsDTO;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieGenres", "Lcom/denisgithuku/movies/data/data_src/remote/dto/MovieGenreDTO;", "getMoviesByGenre", "sort_by", "", "genreId", "include_adult", "", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSimilarMovies", "getTrendingMovies", "Lcom/denisgithuku/movies/data/data_src/remote/dto/TrendingMovieDTO;", "markMovieAsFavourite", "feature_movies_debug"})
public final class MoviesRepositoryImpl implements com.denisgithuku.movies.domain.repository.MoviesRepository {
    private final com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface moviesApiInterface = null;
    private final com.denisgithuku.core.data.local.FavouriteMoviesDao favouriteMoviesDao = null;
    
    @javax.inject.Inject()
    public MoviesRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface moviesApiInterface, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.data.local.FavouriteMoviesDao favouriteMoviesDao) {
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
    java.lang.String sort_by, int genreId, boolean include_adult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTrendingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMovieDetails(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.denisgithuku.movies.data.data_src.remote.dto.movie_details.MovieDetailsDTO> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSimilarMovies(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object markMovieAsFavourite(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.data.local.MovieDBO movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavouriteMovieIdsFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core.data.local.MovieDBO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteFromFavourites(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.data.local.MovieDBO movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFavouriteMoviesFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllFromFavourites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}