package com.denisgithuku.movies.data.data_src.remote

import retrofit2.http.GET
import retrofit2.http.Headers

interface MoviesApiInterface {

    @GET("")
    @Headers()
    suspend fun getGenres()
}
