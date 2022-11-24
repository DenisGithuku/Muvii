package com.denisgithuku.tv_shows.presentation.screens.tv_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/denisgithuku/tv_shows/presentation/screens/tv_details/TvDetailsUiState;", "", "tvDetailsLoading", "", "tvDetails", "Lcom/denisgithuku/tv_shows/domain/model/Tv;", "similarShows", "", "castLoading", "castList", "Lcom/denisgithuku/feature_people/domain/model/Cast;", "userMessages", "Lcom/denisgithuku/core_data/UserMessage;", "(ZLcom/denisgithuku/tv_shows/domain/model/Tv;Ljava/util/List;ZLjava/util/List;Ljava/util/List;)V", "getCastList", "()Ljava/util/List;", "getCastLoading", "()Z", "getSimilarShows", "getTvDetails", "()Lcom/denisgithuku/tv_shows/domain/model/Tv;", "getTvDetailsLoading", "getUserMessages", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature_tv_shows_release"})
public final class TvDetailsUiState {
    private final boolean tvDetailsLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.denisgithuku.tv_shows.domain.model.Tv tvDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> similarShows = null;
    private final boolean castLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.feature_people.domain.model.Cast> castList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core_data.UserMessage> userMessages = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.tv_shows.presentation.screens.tv_details.TvDetailsUiState copy(boolean tvDetailsLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.tv_shows.domain.model.Tv tvDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> similarShows, boolean castLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.feature_people.domain.model.Cast> castList, @org.jetbrains.annotations.NotNull()
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
    
    public TvDetailsUiState() {
        super();
    }
    
    public TvDetailsUiState(boolean tvDetailsLoading, @org.jetbrains.annotations.Nullable()
    com.denisgithuku.tv_shows.domain.model.Tv tvDetails, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> similarShows, boolean castLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.feature_people.domain.model.Cast> castList, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.UserMessage> userMessages) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getTvDetailsLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.tv_shows.domain.model.Tv component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denisgithuku.tv_shows.domain.model.Tv getTvDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.tv_shows.domain.model.Tv> getSimilarShows() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getCastLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.feature_people.domain.model.Cast> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.feature_people.domain.model.Cast> getCastList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.UserMessage> getUserMessages() {
        return null;
    }
}