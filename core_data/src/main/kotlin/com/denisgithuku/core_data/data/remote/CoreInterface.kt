package com.denisgithuku.core_data.data.remote

import com.denisgithuku.core_data.data.remote.dto.FavouriteMoviesDTO
import com.denisgithuku.core_data.data.remote.dto.MovieCastDTO
import com.denisgithuku.core_data.data.remote.dto.PersonDTO
import com.githukudenis.core_data.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface CoreInterface {
    @GET("discover/movie")
    suspend fun getFavouriteMovies(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US"
    ): Response<FavouriteMoviesDTO>

    @GET("movie/{movieId}/credits")
    suspend fun getCast(
        @Path("movieId") movieId: Int,
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US"
    ): Response<MovieCastDTO>

    @GET("person/{personId}")
    suspend fun getPersonDetails(
        @Path("personId") personId: Int,
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US"
    ): Response<PersonDTO>
}