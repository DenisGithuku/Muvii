package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent;", "", "ChangeMovieGenre", "Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent$ChangeMovieGenre;", "feature_movies_debug"})
public abstract interface HomeEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent$ChangeMovieGenre;", "Lcom/denisgithuku/movies/presentation/screens/home/HomeEvent;", "genre", "Lcom/denisgithuku/movies/domain/model/Genre;", "(Lcom/denisgithuku/movies/domain/model/Genre;)V", "getGenre", "()Lcom/denisgithuku/movies/domain/model/Genre;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_movies_debug"})
    public static final class ChangeMovieGenre implements com.denisgithuku.movies.presentation.screens.home.HomeEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.denisgithuku.movies.domain.model.Genre genre = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.denisgithuku.movies.presentation.screens.home.HomeEvent.ChangeMovieGenre copy(@org.jetbrains.annotations.NotNull()
        com.denisgithuku.movies.domain.model.Genre genre) {
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
        
        public ChangeMovieGenre(@org.jetbrains.annotations.NotNull()
        com.denisgithuku.movies.domain.model.Genre genre) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.denisgithuku.movies.domain.model.Genre component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.denisgithuku.movies.domain.model.Genre getGenre() {
            return null;
        }
    }
}