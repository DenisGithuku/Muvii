package com.denisgithuku.movies.data.data_src.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ]\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00062\b\b\u0003\u0010\u001a\u001a\u00020\u00062\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;", "", "getGenres", "Lretrofit2/Response;", "Lcom/denisgithuku/movies/data/data_src/remote/dto/AllMovieGenresDTO;", "api_key", "", "language", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetails", "Lcom/denisgithuku/movies/data/data_src/remote/dto/MovieDTO;", "movieId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesByGenre", "Lcom/denisgithuku/movies/data/data_src/remote/dto/AllMoviesByGenreDTO;", "sort_by", "genre_id", "", "page", "include_video", "", "include_adult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingMovies", "Lcom/denisgithuku/movies/data/data_src/remote/dto/AllTrendingMoviesDTO;", "media_type", "time_window", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_debug"})
public abstract interface MoviesApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "genre/movie/list")
    public abstract java.lang.Object getGenres(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denisgithuku.movies.data.data_src.remote.dto.AllMovieGenresDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "discover/movie")
    public abstract java.lang.Object getMoviesByGenre(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort_by")
    java.lang.String sort_by, @retrofit2.http.Query(value = "with_genres")
    int genre_id, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "include_video")
    boolean include_video, @retrofit2.http.Query(value = "include_adult")
    boolean include_adult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denisgithuku.movies.data.data_src.remote.dto.AllMoviesByGenreDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "trending/{media_type}/{time_window}")
    public abstract java.lang.Object getTrendingMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "media_type")
    java.lang.String media_type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "time_window")
    java.lang.String time_window, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denisgithuku.movies.data.data_src.remote.dto.AllTrendingMoviesDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/{movieId}")
    public abstract java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "movieId")
    java.lang.String movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denisgithuku.movies.data.data_src.remote.dto.MovieDTO>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}