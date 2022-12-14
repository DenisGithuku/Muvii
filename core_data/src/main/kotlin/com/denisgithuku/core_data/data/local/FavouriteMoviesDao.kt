package com.denisgithuku.core_data.data.local

import androidx.room.*

@Dao
interface FavouriteMoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovie(movie: FavouriteMovieDBO)

    @Query("SELECT * FROM favourite_movies_table")
    suspend fun getFavouriteMovies(): List<FavouriteMovieDBO>

    @Query("DELETE FROM favourite_movies_table")
    suspend fun deleteAllFavouriteMovies()

    @Delete
    suspend fun deleteMovie(movie: FavouriteMovieDBO)

}