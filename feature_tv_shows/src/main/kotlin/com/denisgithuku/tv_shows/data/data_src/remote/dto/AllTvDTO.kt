package com.denisgithuku.tv_shows.data.data_src.remote.dto

data class AllTvDTO(
    val page: Int,
    val results: List<TvDTO>,
    val total_pages: Int,
    val total_results: Int
)