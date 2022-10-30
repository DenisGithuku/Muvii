package com.denisgithuku.core_data.data.remote.dto

data class AllSearchItemsDTO(
    val page: Int,
    val results: List<SearchItemDTO>,
    val total_pages: Int,
    val total_results: Int
)