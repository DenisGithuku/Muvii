package com.denisgithuku.core_data.ui.favourites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/denisgithuku/core_data/ui/favourites/FavouritesUiState;", "", "isLoading", "", "favourites", "", "Lcom/denisgithuku/core_data/domain/model/FavouriteMovie;", "error", "", "(ZLjava/util/List;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getFavourites", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "core_data_debug"})
public final class FavouritesUiState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denisgithuku.core_data.domain.model.FavouriteMovie> favourites = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String error = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.core_data.ui.favourites.FavouritesUiState copy(boolean isLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.domain.model.FavouriteMovie> favourites, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
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
    
    public FavouritesUiState() {
        super();
    }
    
    public FavouritesUiState(boolean isLoading, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denisgithuku.core_data.domain.model.FavouriteMovie> favourites, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.domain.model.FavouriteMovie> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denisgithuku.core_data.domain.model.FavouriteMovie> getFavourites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getError() {
        return null;
    }
}