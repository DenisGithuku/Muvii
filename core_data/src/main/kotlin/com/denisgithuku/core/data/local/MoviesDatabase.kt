package com.denisgithuku.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MovieDBO::class], version = 1, exportSchema = false)
abstract class MoviesDatabase: RoomDatabase() {
    abstract fun favouriteMoviesDao(): FavouriteMoviesDao
}