package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "", "()V", "MarkFavourite", "UserMessageDismiss", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$MarkFavourite;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$UserMessageDismiss;", "feature_movies_release"})
public abstract class DetailsUiEvent {
    
    private DetailsUiEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$UserMessageDismiss;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "messageId", "", "(I)V", "getMessageId", "()I", "feature_movies_release"})
    public static final class UserMessageDismiss extends com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent {
        private final int messageId = 0;
        
        public UserMessageDismiss(int messageId) {
            super();
        }
        
        public final int getMessageId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent$MarkFavourite;", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsUiEvent;", "movieId", "", "(I)V", "getMovieId", "()I", "feature_movies_release"})
    public static final class MarkFavourite extends com.denisgithuku.movies.presentation.screens.details.DetailsUiEvent {
        private final int movieId = 0;
        
        public MarkFavourite(int movieId) {
            super();
        }
        
        public final int getMovieId() {
            return 0;
        }
    }
}