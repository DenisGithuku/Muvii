package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\u0002\u0010\u0017J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u00a9\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u00c6\u0001J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0005H\u00d6\u0001J\t\u00109\u001a\u00020:H\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001b\u00a8\u0006;"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeUiState;", "", "genresLoading", "", "selectedGenre", "", "moviesLoading", "searchLoading", "trendingMovieLoading", "genres", "", "Lcom/denisgithuku/movies/domain/model/Genre;", "movies", "Lcom/denisgithuku/movies/domain/model/Movie;", "trending", "Lcom/denisgithuku/movies/domain/model/TrendingMovie;", "adultContentEnabled", "isSystemInDarkTheme", "selectedSortType", "Lcom/denisgithuku/movies/domain/common/SortType;", "sortTypes", "userMessages", "Lcom/denisgithuku/core_data/UserMessage;", "(ZIZZZLjava/util/List;Ljava/util/List;Ljava/util/List;ZZLcom/denisgithuku/movies/domain/common/SortType;Ljava/util/List;Ljava/util/List;)V", "getAdultContentEnabled", "()Z", "getGenres", "()Ljava/util/List;", "getGenresLoading", "getMovies", "getMoviesLoading", "getSearchLoading", "getSelectedGenre", "()I", "getSelectedSortType", "()Lcom/denisgithuku/movies/domain/common/SortType;", "getSortTypes", "getTrending", "getTrendingMovieLoading", "getUserMessages", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "feature_movies_debug"})
public final class HomeUiState {
    private final boolean genresLoading = false;
    private final int selectedGenre = 0;
    private final boolean moviesLoading = false;
    private final boolean searchLoading = false;
    private final boolean trendingMovieLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Genre> genres = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.Movie> movies = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> trending = null;
    private final boolean adultContentEnabled = false;
    private final boolean isSystemInDarkTheme = false;
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.common.SortType selectedSortType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.movies.domain.common.SortType> sortTypes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core_data.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.presentation.screens.home.HomeUiState copy(boolean genresLoading, int selectedGenre, boolean moviesLoading, boolean searchLoading, boolean trendingMovieLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> trending, boolean adultContentEnabled, boolean isSystemInDarkTheme, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.common.SortType selectedSortType, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.denisgithuku.movies.domain.common.SortType> sortTypes, @org.jetbrains.annotations.NotNull()
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
    
    public HomeUiState() {
        super();
    }
    
    public HomeUiState(boolean genresLoading, int selectedGenre, boolean moviesLoading, boolean searchLoading, boolean trendingMovieLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> trending, boolean adultContentEnabled, boolean isSystemInDarkTheme, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.common.SortType selectedSortType, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.denisgithuku.movies.domain.common.SortType> sortTypes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getGenresLoading() {
        return false;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSelectedGenre() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getMoviesLoading() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getSearchLoading() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getTrendingMovieLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Genre> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Genre> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.Movie> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> getTrending() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getAdultContentEnabled() {
        return false;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean isSystemInDarkTheme() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.common.SortType component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.common.SortType getSelectedSortType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.common.SortType> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.movies.domain.common.SortType> getSortTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> getUserMessages() {
        return null;
    }
}