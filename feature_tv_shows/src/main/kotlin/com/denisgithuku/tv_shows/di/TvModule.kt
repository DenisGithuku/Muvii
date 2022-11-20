package com.denisgithuku.tv_shows.di

import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface
import com.denisgithuku.tv_shows.data.data_src.repository_impl.TvRepositoryImpl
import com.denisgithuku.tv_shows.domain.repository.TvRepository
import com.denisgithuku.tv_shows.domain.use_cases.GetShowDetails
import com.denisgithuku.tv_shows.domain.use_cases.GetShows
import com.denisgithuku.tv_shows.domain.use_cases.TvUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TvModule {

    @Provides
    @Singleton
    fun provideTvApiInterface(okHttpClient: OkHttpClient): TvApiInterface {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(TvApiInterface::class.java)
    }

    @Provides
    @Singleton
    fun provideTvRepository(tvApiInterface: TvApiInterface): TvRepository = TvRepositoryImpl(tvApiInterface)

    @Provides
    @Singleton
    fun provideTvUseCases(
        tvRepository: TvRepository,
        coreMuviiUseCases: CoreMuviiUseCases,
        dispatcherProvider: DispatcherProvider
    ): TvUseCases = TvUseCases(
        getShows = GetShows(
        tvRepository = tvRepository,
        dispatcherProvider = dispatcherProvider
    ),
        getShowDetails = GetShowDetails(
            tvRepository = tvRepository,
            dispatcherProvider = dispatcherProvider,
            coreMuviiUseCases = coreMuviiUseCases
        )
    )
}