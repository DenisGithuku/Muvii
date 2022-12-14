package com.denisgithuku.core_data.data.local;

import java.lang.System;

@androidx.room.Database(entities = {com.denisgithuku.core_data.data.local.FavouriteMovieDBO.class, com.denisgithuku.core_data.data.local.PersonEntity.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/denisgithuku/core_data/data/local/MoviesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favouriteMoviesDao", "Lcom/denisgithuku/core_data/data/local/FavouriteMoviesDao;", "personsDao", "Lcom/denisgithuku/core_data/data/local/PersonsDao;", "core_data_debug"})
public abstract class MoviesDatabase extends androidx.room.RoomDatabase {
    
    public MoviesDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.denisgithuku.core_data.data.local.FavouriteMoviesDao favouriteMoviesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.denisgithuku.core_data.data.local.PersonsDao personsDao();
}