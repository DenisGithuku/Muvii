package com.denisgithuku.core_data.data.remote

import com.denisgithuku.core_data.data.remote.dto.FavouriteMoviesDTO
import com.githukudenis.core_data.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface FavouriteMovieInterface {
    @GET("discover/movie")
    suspend fun getFavouriteMovies(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US"
    ): Response<FavouriteMoviesDTO>
}