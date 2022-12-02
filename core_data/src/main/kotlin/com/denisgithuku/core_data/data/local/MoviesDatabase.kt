package com.denisgithuku.core_data.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [FavouriteMovieDBO::class, PersonEntity::class],
    version = 2,
    exportSchema = false
)
abstract class MoviesDatabase: RoomDatabase() {
    abstract fun favouriteMoviesDao(): FavouriteMoviesDao

    abstract fun personsDao(): PersonsDao
}