package com.denisgithuku.movies.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "", "deleteAllFromFavourites", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromFavourites", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteMovieIdsFromDB", "", "Lcom/denisgithuku/core/data/local/MovieDBO;", "getFavouriteMoviesFromNetwork", "Lcom/denisgithuku/movies/data/data_src/remote/dto/movie/MovieDTO;", "getMovieDetails", "Lcom/denisgithuku/movies/data/data_src/remote/dto/movie_details/MovieDetailsDTO;", "getMovieGenres", "Lcom/denisgithuku/movies/data/data_src/remote/dto/MovieGenreDTO;", "getMoviesByGenre", "sort_by", "", "genreId", "include_adult", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSimilarMovies", "getTrendingMovies", "Lcom/denisgithuku/movies/data/data_src/remote/dto/TrendingMovieDTO;", "markMovieAsFavourite", "movie", "(Lcom/denisgithuku/core/data/local/MovieDBO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_release"})
public abstract interface MoviesRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMoviesByGenre(@org.jetbrains.annotations.NotNull()
    java.lang.String sort_by, int genreId, boolean include_adult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrendingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.TrendingMovieDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieDetails(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.denisgithuku.movies.data.data_src.remote.dto.movie_details.MovieDetailsDTO> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSimilarMovies(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markMovieAsFavourite(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.data.local.MovieDBO movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavouriteMovieIdsFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core.data.local.MovieDBO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteFromFavourites(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllFromFavourites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFavouriteMoviesFromNetwork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.movies.data.data_src.remote.dto.movie.MovieDTO>> continuation);
}