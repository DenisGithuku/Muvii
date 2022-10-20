package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006$"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiState;", "", "moviePosterLoading", "", "movieDetailsLoading", "similarMoviesLoading", "movieDetails", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "similarMovies", "", "Lcom/denisgithuku/movies/domain/model/Movie;", "userMessages", "Lcom/denisgithuku/core/UserMessage;", "(ZZZLcom/denisgithuku/movies/domain/model/MovieDetails;Ljava/util/List;Ljava/util/List;)V", "getMovieDetails", "()Lcom/denisgithuku/movies/domain/model/MovieDetails;", "getMovieDetailsLoading", "()Z", "getMoviePosterLoading", "getSimilarMovies", "()Ljava/util/List;", "getSimilarMoviesLoading", "getUserMessages", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_movies_debug"})
public final class DetailsUiState {
    private final boolean moviePosterLoading = false;
    private final boolean movieDetailsLoading = false;
    private final boolean similarMoviesLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.denisgithuku.movies.domain.model.MovieDetails movieDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.presentation.screens.details.DetailsUiState copy(boolean moviePosterLoading, boolean movieDetailsLoading, boolean similarMoviesLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.MovieDetails movieDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core.UserMessage> userMessages) {
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
    
    public DetailsUiState(boolean moviePosterLoading, boolean movieDetailsLoading, boolean similarMoviesLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.MovieDetails movieDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core.UserMessage> userMessages) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.MovieDetails component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.MovieDetails getMovieDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> getSimilarMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core.UserMessage> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core.UserMessage> getUserMessages() {
        return null;
    }
}