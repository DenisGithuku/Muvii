package com.denisgithuku.movies.data.data_src.remote

import com.denisgithuku.movies.data.data_src.remote.dto.AllMovieGenresDTO
import com.denisgithuku.movies.data.data_src.remote.dto.AllMoviesByGenreDTO
import com.denisgithuku.movies.data.data_src.remote.dto.AllTrendingMoviesDTO
import com.githukudenis.movies.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesApiInterface {

    @GET("genre/movie/list")
    suspend fun getGenres(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US",
    ): Response<AllMovieGenresDTO>

    @GET("discover/movie")
    suspend fun getMoviesByGenre(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US",
        @Query("sort_by") sort_by: String,
        @Query("with_genres") genre_id: Int,
        @Query("page") page: Int = 1,
        @Query("include_video") include_video: Boolean = false,
        @Query("include_adult") include_adult: Boolean = false
    ): Response<AllMoviesByGenreDTO>

    @GET("trending/{media_type}/{time_window}")
    suspend fun getTrendingMovies(
        @Path("media_type") media_type: String = "movie",
        @Path("time_window") time_window: String = "day",
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US",
        ): Response<AllTrendingMoviesDTO>
}
