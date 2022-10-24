package com.denisgithuku.core.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favourite_movies_table")
data class MovieDBO(
    @PrimaryKey()
    @ColumnInfo(name = "movie_id")
    val movieId: Int
)
