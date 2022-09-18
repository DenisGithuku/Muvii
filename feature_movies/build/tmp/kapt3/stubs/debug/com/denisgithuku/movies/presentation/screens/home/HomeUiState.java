package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00c6\u0003JW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeUiState;", "", "genresLoading", "", "selectedGenre", "Lcom/denisgithuku/movies/domain/model/Genre;", "moviesLoading", "genres", "", "movies", "Lcom/denisgithuku/movies/domain/model/Movie;", "userMessages", "Lcom/denisgithuku/core/UserMessage;", "(ZLcom/denisgithuku/movies/domain/model/Genre;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGenres", "()Ljava/util/List;", "getGenresLoading", "()Z", "getMovies", "getMoviesLoading", "getSelectedGenre", "()Lcom/denisgithuku/movies/domain/model/Genre;", "getUserMessages", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_movies_debug"})
public final class HomeUiState {
    private final boolean genresLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.model.Genre selectedGenre = null;
    private final boolean moviesLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Genre> genres = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Movie> movies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.presentation.screens.home.HomeUiState copy(boolean genresLoading, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.model.Genre selectedGenre, boolean moviesLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, @org.jetbrains.annotations.NotNull()
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
    
    public HomeUiState() {
        super();
    }
    
    public HomeUiState(boolean genresLoading, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.model.Genre selectedGenre, boolean moviesLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getGenresLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.model.Genre component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.model.Genre getSelectedGenre() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getMoviesLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Genre> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Genre> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> getMovies() {
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