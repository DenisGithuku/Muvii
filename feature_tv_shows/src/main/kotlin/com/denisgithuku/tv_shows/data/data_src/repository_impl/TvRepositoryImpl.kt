package com.denisgithuku.tv_shows.data.data_src.repository_impl

import com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface
import com.denisgithuku.tv_shows.data.data_src.remote.dto.TvDTO
import com.denisgithuku.tv_shows.domain.repository.TvRepository
import javax.inject.Inject

class TvRepositoryImpl @Inject constructor(
    private val tvApiInterface: TvApiInterface
): TvRepository {

    override suspend fun getShows(): List<TvDTO> {
        val res = tvApiInterface.getTvShows()
        if (res.isSuccessful) {
            res.body()?.let {
                return it.results
            }
        }
        return emptyList()
    }


    override suspend fun getShowDetails(tvId: Int): TvDTO? {
        val res = tvApiInterface.getTvShowDetails(tvId = tvId)
        return if(res.isSuccessful) {
            res.body()
        } else null
    }
}

