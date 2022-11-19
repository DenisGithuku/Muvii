package com.denisgithuku.tv_shows.data.data_src.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/denisgithuku/tv_shows/data/data_src/repository_impl/TvRepositoryImpl;", "Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;", "tvApiInterface", "Lcom/denisgithuku/tv_shows/data/data_src/remote/api/TvApiInterface;", "(Lcom/denisgithuku/tv_shows/data/data_src/remote/api/TvApiInterface;)V", "getShows", "", "Lcom/denisgithuku/tv_shows/data/data_src/remote/dto/TvDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tv_shows_debug"})
public final class TvRepositoryImpl implements com.denisgithuku.tv_shows.domain.repository.TvRepository {
    private final com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface tvApiInterface = null;
    
    @javax.inject.Inject()
    public TvRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface tvApiInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getShows(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO>> continuation) {
        return null;
    }
}