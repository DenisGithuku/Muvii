package com.denisgithuku.movies.di

import com.denisgithuku.core.Constants
import com.denisgithuku.core.providers.UserPreferences
import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface
import com.denisgithuku.movies.data.data_src.repository_impl.MoviesRepositoryImpl
import com.denisgithuku.movies.domain.repository.MoviesRepository
import com.denisgithuku.movies.domain.use_cases.*
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
object MoviesModule {

    @Provides
    @Singleton
    fun provideMoviesApiInterface(
        okHttpClient: OkHttpClient
    ): MoviesApiInterface {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(MoviesApiInterface::class.java)
    }

    @Provides
    @Singleton
    fun provideMoviesRepository(
        moviesApiInterface: MoviesApiInterface
    ): MoviesRepository {
        return MoviesRepositoryImpl(moviesApiInterface)
    }

    @Provides
    @Singleton
    fun provideMovieUseCases(
        moviesRepository: MoviesRepository,
        userPreferences: UserPreferences
    ): MovieUseCases {
        return MovieUseCases(
            getAllMovieGenres = GetAllMovieGenres(moviesRepository),
            getMoviesByGenre = GetMoviesByGenre(moviesRepository),
            getTrendingMovies = GetTrendingMovies(moviesRepository),
            readAdultContentPreferences = GetAdultContentPreferences(userPreferences),
            changeUiTheme = ChangeUiTheme(userPreferences),
            enableAdultContent = EnableAdultContent(userPreferences),
            getMovieDetails = GetMovieDetails(moviesRepository)
        )
    }
}
