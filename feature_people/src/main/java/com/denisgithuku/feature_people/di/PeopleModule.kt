package com.denisgithuku.feature_people.di

import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.data.local.PersonsDao
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.feature_people.data.remote.PeopleApiInterface
import com.denisgithuku.feature_people.data.repository_impl.CastRepositoryImpl
import com.denisgithuku.feature_people.data.repository_impl.PersonRepositoryImpl
import com.denisgithuku.feature_people.domain.repository.CastRepository
import com.denisgithuku.feature_people.domain.repository.PersonRepository
import com.denisgithuku.feature_people.domain.use_cases.GetCast
import com.denisgithuku.feature_people.domain.use_cases.GetProfile
import com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases
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
object PeopleModule {
    @Provides
    @Singleton
    fun providePeopleApiInterface(okHttpClient: OkHttpClient): PeopleApiInterface {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(PeopleApiInterface::class.java)
    }


    @Provides
    @Singleton
    fun provideCastRepository(peopleApiInterface: PeopleApiInterface): CastRepository =
        CastRepositoryImpl(peopleApiInterface)

    @Provides
    @Singleton
    fun providePersonRepository(
        peopleApiInterface: PeopleApiInterface,
        personsDao: PersonsDao
    ): PersonRepository =
        PersonRepositoryImpl(peopleApiInterface, personsDao)

    @Provides
    @Singleton
    fun providePeopleUseCases(
        personRepository: PersonRepository,
        dispatcherProvider: DispatcherProvider,
        castRepository: CastRepository
    ): PeopleUseCases {
        return PeopleUseCases(
            getCast = GetCast(
                castRepository = castRepository,
                dispatcherProvider = dispatcherProvider
            ),
            getProfile = GetProfile(
                personRepository = personRepository
            )
        )
    }
}
