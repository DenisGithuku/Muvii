package com.denisgithuku.tv_shows.data.data_src.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/denisgithuku/tv_shows/data/data_src/remote/api/TvApiInterface;", "", "getTvShowDetails", "Lretrofit2/Response;", "Lcom/denisgithuku/tv_shows/data/data_src/remote/dto/TvDTO;", "tvId", "", "api_key", "", "language", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTvShows", "Lcom/denisgithuku/tv_shows/data/data_src/remote/dto/AllTvDTO;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tv_shows_debug"})
public abstract interface TvApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "discover/tv")
    public abstract java.lang.Object getTvShows(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denisgithuku.tv_shows.data.data_src.remote.dto.AllTvDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/{tv_id}")
    public abstract java.lang.Object getTvShowDetails(@retrofit2.http.Path(value = "tv_id")
    int tvId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}