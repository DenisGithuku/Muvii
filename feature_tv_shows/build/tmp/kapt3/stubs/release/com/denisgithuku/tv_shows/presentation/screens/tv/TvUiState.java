package com.denisgithuku.tv_shows.presentation.screens.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/denisgithuku/tv_shows/presentation/screens/tv/TvUiState;", "", "tvLoading", "", "shows", "", "Lcom/denisgithuku/tv_shows/domain/model/Tv;", "userMessages", "Lcom/denisgithuku/core_data/UserMessage;", "(ZLjava/util/List;Ljava/util/List;)V", "getShows", "()Ljava/util/List;", "getTvLoading", "()Z", "getUserMessages", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_tv_shows_release"})
public final class TvUiState {
    private final boolean tvLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> shows = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core_data.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.tv_shows.presentation.screens.tv.TvUiState copy(boolean tvLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> shows, @org.jetbrains.annotations.NotNull()
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
    
    public TvUiState() {
        super();
    }
    
    public TvUiState(boolean tvLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> shows, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getTvLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> getShows() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> getUserMessages() {
        return null;
    }
}