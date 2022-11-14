package com.denisgithuku.core_data.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favourite_movies_table")
data class FavouriteMovieDBO(
    @PrimaryKey()
    @ColumnInfo(name = "movie_id")
    val movieId: Int
)
