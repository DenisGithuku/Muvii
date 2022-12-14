package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0015H\u00c6\u0003J\t\u00101\u001a\u00020\u0017H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\t\u00106\u001a\u00020\rH\u00c6\u0003J\t\u00107\u001a\u00020\u000fH\u00c6\u0003J\t\u00108\u001a\u00020\u0011H\u00c6\u0003J\t\u00109\u001a\u00020\u0013H\u00c6\u0003Jw\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020?H\u00d6\u0001J\t\u0010@\u001a\u00020AH\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006B"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "", "getAllMovieGenres", "Lcom/denisgithuku/movies/domain/use_cases/GetAllMovieGenres;", "getMoviesByGenre", "Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;", "getTrendingMovies", "Lcom/denisgithuku/movies/domain/use_cases/GetTrendingMovies;", "readAdultContentPreferences", "Lcom/denisgithuku/movies/domain/use_cases/GetAdultContentPreferences;", "changeUiTheme", "Lcom/denisgithuku/movies/domain/use_cases/ChangeUiTheme;", "enableAdultContent", "Lcom/denisgithuku/movies/domain/use_cases/EnableAdultContent;", "getMovieDetails", "Lcom/denisgithuku/movies/domain/use_cases/GetMovieDetails;", "getSimilarMoviesById", "Lcom/denisgithuku/movies/domain/use_cases/GetSimilarMoviesById;", "toggleFavourite", "Lcom/denisgithuku/movies/domain/use_cases/ToggleFavourite;", "deleteAllFavourites", "Lcom/denisgithuku/movies/domain/use_cases/DeleteAllFavourites;", "searchMovies", "Lcom/denisgithuku/movies/domain/use_cases/SearchMovies;", "(Lcom/denisgithuku/movies/domain/use_cases/GetAllMovieGenres;Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;Lcom/denisgithuku/movies/domain/use_cases/GetTrendingMovies;Lcom/denisgithuku/movies/domain/use_cases/GetAdultContentPreferences;Lcom/denisgithuku/movies/domain/use_cases/ChangeUiTheme;Lcom/denisgithuku/movies/domain/use_cases/EnableAdultContent;Lcom/denisgithuku/movies/domain/use_cases/GetMovieDetails;Lcom/denisgithuku/movies/domain/use_cases/GetSimilarMoviesById;Lcom/denisgithuku/movies/domain/use_cases/ToggleFavourite;Lcom/denisgithuku/movies/domain/use_cases/DeleteAllFavourites;Lcom/denisgithuku/movies/domain/use_cases/SearchMovies;)V", "getChangeUiTheme", "()Lcom/denisgithuku/movies/domain/use_cases/ChangeUiTheme;", "getDeleteAllFavourites", "()Lcom/denisgithuku/movies/domain/use_cases/DeleteAllFavourites;", "getEnableAdultContent", "()Lcom/denisgithuku/movies/domain/use_cases/EnableAdultContent;", "getGetAllMovieGenres", "()Lcom/denisgithuku/movies/domain/use_cases/GetAllMovieGenres;", "getGetMovieDetails", "()Lcom/denisgithuku/movies/domain/use_cases/GetMovieDetails;", "getGetMoviesByGenre", "()Lcom/denisgithuku/movies/domain/use_cases/GetMoviesByGenre;", "getGetSimilarMoviesById", "()Lcom/denisgithuku/movies/domain/use_cases/GetSimilarMoviesById;", "getGetTrendingMovies", "()Lcom/denisgithuku/movies/domain/use_cases/GetTrendingMovies;", "getReadAdultContentPreferences", "()Lcom/denisgithuku/movies/domain/use_cases/GetAdultContentPreferences;", "getSearchMovies", "()Lcom/denisgithuku/movies/domain/use_cases/SearchMovies;", "getToggleFavourite", "()Lcom/denisgithuku/movies/domain/use_cases/ToggleFavourite;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature_movies_debug"})
public final class MovieUseCases {
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres getAllMovieGenres = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre getMoviesByGenre = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetTrendingMovies getTrendingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetAdultContentPreferences readAdultContentPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.ChangeUiTheme changeUiTheme = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.EnableAdultContent enableAdultContent = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetMovieDetails getMovieDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.GetSimilarMoviesById getSimilarMoviesById = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.ToggleFavourite toggleFavourite = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.DeleteAllFavourites deleteAllFavourites = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.use_cases.SearchMovies searchMovies = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.MovieUseCases copy(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetAllMovieGenres getAllMovieGenres, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetMoviesByGenre getMoviesByGenre, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetTrendingMovies getTrendingMovies, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetAdultContentPreferences readAdultContentPreferences, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ChangeUiTheme changeUiTheme, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.EnableAdultContent enableAdultContent, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetMovieDetails getMovieDetails, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetSimilarMoviesById getSimilarMoviesById, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ToggleFavourite toggleFavourite, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.DeleteAllFavourites deleteAllFavourites, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.SearchMovies searchMovies) {
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
    com.denisgithuku.movies.domain.use_cases.GetAdultContentPreferences readAdultContentPreferences, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ChangeUiTheme changeUiTheme, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.EnableAdultContent enableAdultContent, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetMovieDetails getMovieDetails, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.GetSimilarMoviesById getSimilarMoviesById, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.ToggleFavourite toggleFavourite, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.DeleteAllFavourites deleteAllFavourites, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.SearchMovies searchMovies) {
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
    public final com.denisgithuku.movies.domain.use_cases.GetAdultContentPreferences component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetAdultContentPreferences getReadAdultContentPreferences() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetMovieDetails component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetMovieDetails getGetMovieDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetSimilarMoviesById component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.GetSimilarMoviesById getGetSimilarMoviesById() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.ToggleFavourite component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.ToggleFavourite getToggleFavourite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.DeleteAllFavourites component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.DeleteAllFavourites getDeleteAllFavourites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.SearchMovies component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.use_cases.SearchMovies getSearchMovies() {
        return null;
    }
}