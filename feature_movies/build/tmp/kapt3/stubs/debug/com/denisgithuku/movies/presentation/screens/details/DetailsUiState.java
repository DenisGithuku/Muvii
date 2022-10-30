package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u0087\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u000eH\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014\u00a8\u00060"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiState;", "", "moviePosterLoading", "", "movieDetailsLoading", "similarMoviesLoading", "favouritesLoading", "movieDetails", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "showConfirmationDialog", "favourites", "", "Lcom/denisgithuku/movies/domain/model/Movie;", "favMovieListIds", "", "similarMovies", "userMessages", "Lcom/denisgithuku/core_data/UserMessage;", "(ZZZZLcom/denisgithuku/movies/domain/model/MovieDetails;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFavMovieListIds", "()Ljava/util/List;", "getFavourites", "getFavouritesLoading", "()Z", "getMovieDetails", "()Lcom/denisgithuku/movies/domain/model/MovieDetails;", "getMovieDetailsLoading", "getMoviePosterLoading", "getShowConfirmationDialog", "getSimilarMovies", "getSimilarMoviesLoading", "getUserMessages", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "feature_movies_debug"})
public final class DetailsUiState {
    private final boolean moviePosterLoading = false;
    private final boolean movieDetailsLoading = false;
    private final boolean similarMoviesLoading = false;
    private final boolean favouritesLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.denisgithuku.movies.domain.model.MovieDetails movieDetails = null;
    private final boolean showConfirmationDialog = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Movie> favourites = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> favMovieListIds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core_data.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.presentation.screens.details.DetailsUiState copy(boolean moviePosterLoading, boolean movieDetailsLoading, boolean similarMoviesLoading, boolean favouritesLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.MovieDetails movieDetails, boolean showConfirmationDialog, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> favourites, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> favMovieListIds, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.UserMessage> userMessages) {
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
    
    public DetailsUiState() {
        super();
    }
    
    public DetailsUiState(boolean moviePosterLoading, boolean movieDetailsLoading, boolean similarMoviesLoading, boolean favouritesLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.MovieDetails movieDetails, boolean showConfirmationDialog, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> favourites, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> favMovieListIds, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getMoviePosterLoading() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getMovieDetailsLoading() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getSimilarMoviesLoading() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getFavouritesLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.MovieDetails component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.MovieDetails getMovieDetails() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getShowConfirmationDialog() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> getFavourites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getFavMovieListIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> getSimilarMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> getUserMessages() {
        return null;
    }
}