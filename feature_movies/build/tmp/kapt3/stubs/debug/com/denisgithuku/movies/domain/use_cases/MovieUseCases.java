package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "", "getAllMovieGenres", "Lcom/denisgithuku/movies/domain/use_cases/GetAllMovieGenres;", "getMoviesByGenre", "Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;", "getTrendingMovies", "Lcom/denisgithuku/movies/domain/use_cases/GetTrendingMovies;", "readAdultContentPreferences", "Lcom/denisgithuku/movies/domain/use_cases/ReadAdultContentPrefences;", "changeUiTheme", "Lcom/denisgithuku/movies/domain/use_cases/ChangeUiTheme;", "enableAdultContent", "Lcom/denisgithuku/movies/domain/use_cases/EnableAdultContent;", "(Lcom/denisgithuku/movies/domain/use_cases/GetAllMovieGenres;Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;Lcom/denisgithuku/movies/domain/use_cases/GetTrendingMovies;Lcom/denisgithuku/movies/domain/use_cases/ReadAdultContentPrefences;Lcom/denisgithuku/movies/domain/use_cases/ChangeUiTheme;Lcom/denisgithuku/movies/domain/use_cases/EnableAdultContent;)V", "getChangeUiTheme", "()Lcom/denisgithuku/movies/domain/use_cases/ChangeUiTheme;", "getEnableAdultContent", "()Lcom/denisgithuku/movies/domain/use_cases/EnableAdultContent;", "getGetAllMovieGenres", "()Lcom/denisgithuku/movies/domain/use_cases/GetAllMovieGenres;", "getGetMoviesByGenre", "()Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;", "getGetTrendingMovies", "()Lcom/denisgithuku/movies/domain/use_cases/GetTrendingMovies;", "getReadAdultContentPreferences", "()Lcom/denisgithuku/movies/domain/use_cases/ReadAdultContentPrefences;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature_movies_debug"})
public final class MovieUseCases {
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres getAllMovieGenres = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre getMoviesByGenre = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetTrendingMovies getTrendingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.ReadAdultContentPrefences readAdultContentPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.ChangeUiTheme changeUiTheme = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.EnableAdultContent enableAdultContent = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.MovieUseCases copy(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres getAllMovieGenres, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre getMoviesByGenre, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetTrendingMovies getTrendingMovies, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ReadAdultContentPrefences readAdultContentPreferences, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ChangeUiTheme changeUiTheme, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.EnableAdultContent enableAdultContent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MovieUseCases(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres getAllMovieGenres, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre getMoviesByGenre, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetTrendingMovies getTrendingMovies, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ReadAdultContentPrefences readAdultContentPreferences, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ChangeUiTheme changeUiTheme, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.EnableAdultContent enableAdultContent) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres getGetAllMovieGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre getGetMoviesByGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetTrendingMovies component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetTrendingMovies getGetTrendingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.ReadAdultContentPrefences component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.ReadAdultContentPrefences getReadAdultContentPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.ChangeUiTheme component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.ChangeUiTheme getChangeUiTheme() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.EnableAdultContent component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.EnableAdultContent getEnableAdultContent() {
        return null;
    }
}