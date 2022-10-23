package com.denisgithuku.core.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/denisgithuku/core/data/local/FavouriteMoviesDao;", "", "deleteAllFavouriteMovies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMovie", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavouriteMovies", "", "Lcom/denisgithuku/core/data/local/MovieDBO;", "insertMovie", "movie", "(Lcom/denisgithuku/core/data/local/MovieDBO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_data_release"})
public abstract interface FavouriteMoviesDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.data.local.MovieDBO movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM favourite_movies_table")
    public abstract java.lang.Object getFavouriteMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core.data.local.MovieDBO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteAllFavouriteMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM favourite_movies_table WHERE movieId LIKE movieId")
    public abstract java.lang.Object deleteMovie(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}