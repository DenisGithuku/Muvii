package com.denisgithuku.tv_shows.domain.repository

import com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO

interface TvRepository {

    suspend fun getShows(): List<TvDTO>
}