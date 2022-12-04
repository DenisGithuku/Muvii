package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "", "MarkUnmarkFavourite", "ToggleFollowPerson", "UserDialogDismiss", "UserMessageDismiss", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$MarkUnmarkFavourite;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$ToggleFollowPerson;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$UserDialogDismiss;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$UserMessageDismiss;", "feature_movies_debug"})
public abstract interface DetailsUiEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$UserMessageDismiss;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "messageId", "", "(I)V", "getMessageId", "()I", "feature_movies_debug"})
    public static final class UserMessageDismiss implements com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent {
        private final int messageId = 0;
        
        public UserMessageDismiss(int messageId) {
            super();
        }
        
        public final int getMessageId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$MarkUnmarkFavourite;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "()V", "feature_movies_debug"})
    public static final class MarkUnmarkFavourite implements com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent.MarkUnmarkFavourite INSTANCE = null;
        
        private MarkUnmarkFavourite() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$UserDialogDismiss;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "()V", "feature_movies_debug"})
    public static final class UserDialogDismiss implements com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent.UserDialogDismiss INSTANCE = null;
        
        private UserDialogDismiss() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$ToggleFollowPerson;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "profileId", "", "(I)V", "getProfileId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature_movies_debug"})
    public static final class ToggleFollowPerson implements com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent {
        private final int profileId = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent.ToggleFollowPerson copy(int profileId) {
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
        
        public ToggleFollowPerson(int profileId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getProfileId() {
            return 0;
        }
    }
}