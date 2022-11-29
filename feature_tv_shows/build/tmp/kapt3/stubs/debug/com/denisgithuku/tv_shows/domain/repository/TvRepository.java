package com.denisgithuku.tv_shows.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;", "", "getShowDetails", "Lcom/denisgithuku/tv_shows/data/data_src/remote/dto/TvDTO;", "tvId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShows", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tv_shows_debug"})
public abstract interface TvRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getShows(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getShowDetails(int tvId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO> continuation);
}