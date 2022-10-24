package com.denisgithuku.movies.domain.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0011\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/denisgithuku/movies/domain/common/SortType;", "", "orderType", "Lcom/denisgithuku/movies/domain/common/OrderType;", "(Lcom/denisgithuku/movies/domain/common/OrderType;)V", "getOrderType", "()Lcom/denisgithuku/movies/domain/common/OrderType;", "Popularity", "ReleaseDate", "Revenue", "VoteAverage", "VoteCount", "Lcom/denisgithuku/movies/domain/common/SortType$Popularity;", "Lcom/denisgithuku/movies/domain/common/SortType$ReleaseDate;", "Lcom/denisgithuku/movies/domain/common/SortType$Revenue;", "Lcom/denisgithuku/movies/domain/common/SortType$VoteAverage;", "Lcom/denisgithuku/movies/domain/common/SortType$VoteCount;", "feature_movies_debug"})
public abstract class SortType {
    @org.jetbrains.annotations.NotNull()
    private final com.denisgithuku.movies.domain.common.OrderType orderType = null;
    
    private SortType(com.denisgithuku.movies.domain.common.OrderType orderType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denisgithuku.movies.domain.common.OrderType getOrderType() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/domain/common/SortType$Popularity;", "Lcom/denisgithuku/movies/domain/common/SortType;", "()V", "feature_movies_debug"})
    public static final class Popularity extends com.denisgithuku.movies.domain.common.SortType {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.domain.common.SortType.Popularity INSTANCE = null;
        
        private Popularity() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/domain/common/SortType$ReleaseDate;", "Lcom/denisgithuku/movies/domain/common/SortType;", "()V", "feature_movies_debug"})
    public static final class ReleaseDate extends com.denisgithuku.movies.domain.common.SortType {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.domain.common.SortType.ReleaseDate INSTANCE = null;
        
        private ReleaseDate() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/domain/common/SortType$VoteAverage;", "Lcom/denisgithuku/movies/domain/common/SortType;", "()V", "feature_movies_debug"})
    public static final class VoteAverage extends com.denisgithuku.movies.domain.common.SortType {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.domain.common.SortType.VoteAverage INSTANCE = null;
        
        private VoteAverage() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/domain/common/SortType$VoteCount;", "Lcom/denisgithuku/movies/domain/common/SortType;", "()V", "feature_movies_debug"})
    public static final class VoteCount extends com.denisgithuku.movies.domain.common.SortType {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.domain.common.SortType.VoteCount INSTANCE = null;
        
        private VoteCount() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/denisgithuku/movies/domain/common/SortType$Revenue;", "Lcom/denisgithuku/movies/domain/common/SortType;", "()V", "feature_movies_debug"})
    public static final class Revenue extends com.denisgithuku.movies.domain.common.SortType {
        @org.jetbrains.annotations.NotNull()
        public static final com.denisgithuku.movies.domain.common.SortType.Revenue INSTANCE = null;
        
        private Revenue() {
            super(null);
        }
    }
}