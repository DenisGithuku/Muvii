package com.denisgithuku.tv_shows.data.data_src.remote.api

import com.denisgithuku.tv_shows.data.data_src.remote.dto.AllTvDTO
import com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO
import com.githukudenis.core_data.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TvApiInterface {

    @GET("discover/tv")
    suspend fun getTvShows(
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US"
    ): Response<AllTvDTO>

    @GET("tv/{tv_id}")
    suspend fun getTvShowDetails(
        @Path("tv_id") tvId: Int,
        @Query("api_key") api_key: String = BuildConfig.TMDB_API_KEY,
        @Query("language") language: String = "en-US"
    ): Response<TvDTO>
}