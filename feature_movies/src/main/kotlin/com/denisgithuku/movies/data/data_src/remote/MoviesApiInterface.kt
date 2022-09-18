package com.denisgithuku.movies.data.data_src.remote

import com.denisgithuku.movies.data.data_src.remote.dto.AllMovieGenresDTO
import com.denisgithuku.movies.data.data_src.remote.dto.AllMoviesByCategoryDTO
import com.denisgithuku.movies.data.data_src.remote.dto.MovieGenreDTO
import com.githukudenis.movies.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApiInterface {

    @GET("genre/movie/list")
    suspend fun getGenres(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US",
    ): Response<AllMovieGenresDTO>

    @GET("discover/movie")
    suspend fun getMoviesByCategory(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US",
        @Query("sort_by") sort_by: String = "popularity.desc",
        @Query("with_genres") with_genre: String,
        @Query("page") page: Int = 1,
        @Query("include_video") include_video: Boolean = false,
        @Query("include_adult") include_adult: Boolean = false
    ): Response<AllMoviesByCategoryDTO>
}
