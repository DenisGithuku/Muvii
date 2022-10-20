package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiState;", "", "isLoading", "", "movie", "Lcom/denisgithuku/movies/domain/model/Movie;", "userMessages", "", "Lcom/denisgithuku/core/UserMessage;", "(ZLcom/denisgithuku/movies/domain/model/Movie;Ljava/util/List;)V", "()Z", "getMovie", "()Lcom/denisgithuku/movies/domain/model/Movie;", "getUserMessages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_movies_debug"})
public final class DetailsUiState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.denisgithuku.movies.domain.model.Movie movie = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.presentation.screens.details.DetailsUiState copy(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.Movie movie, @org.jetbrains.annotations.NotNull()
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
    
    public DetailsUiState(boolean isLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.movies.domain.model.Movie movie, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.Movie component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.movies.domain.model.Movie getMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core.UserMessage> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core.UserMessage> getUserMessages() {
        return null;
    }
}