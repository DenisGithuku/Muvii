package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u00c6\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012\u00a8\u0006+"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiState;", "", "movieDetailsLoading", "", "similarMoviesLoading", "movieDetails", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "cast", "", "Lcom/denisgithuku/feature_people/domain/model/Cast;", "castLoading", "showConfirmationDialog", "similarMovies", "Lcom/denisgithuku/movies/domain/model/Movie;", "userMessages", "Lcom/denisgithuku/core_data/UserMessage;", "(ZZLcom/denisgithuku/movies/domain/model/MovieDetails;Ljava/util/List;ZZLjava/util/List;Ljava/util/List;)V", "getCast", "()Ljava/util/List;", "getCastLoading", "()Z", "getMovieDetails", "()Lcom/denisgithuku/movies/domain/model/MovieDetails;", "getMovieDetailsLoading", "getShowConfirmationDialog", "getSimilarMovies", "getSimilarMoviesLoading", "getUserMessages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_movies_debug"})
public final class DetailsUiState {
    private final boolean movieDetailsLoading = false;
    private final boolean similarMoviesLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.denisgithuku.movies.domain.model.MovieDetails movieDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.feature_people.domain.model.Cast> cast = null;
    private final boolean castLoading = false;
    private final boolean showConfirmationDialog = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core_data.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.presentation.screens.details.DetailsUiState copy(boolean movieDetailsLoading, boolean similarMoviesLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.MovieDetails movieDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.feature_people.domain.model.Cast> cast, boolean castLoading, boolean showConfirmationDialog, @org.jetbrains.annotations.NotNull()
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
    
    public DetailsUiState(boolean movieDetailsLoading, boolean similarMoviesLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.MovieDetails movieDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.feature_people.domain.model.Cast> cast, boolean castLoading, boolean showConfirmationDialog, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getMovieDetailsLoading() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getSimilarMoviesLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.MovieDetails component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.MovieDetails getMovieDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.feature_people.domain.model.Cast> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.feature_people.domain.model.Cast> getCast() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getCastLoading() {
        return false;
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
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> getSimilarMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> getUserMessages() {
        return null;
    }
}