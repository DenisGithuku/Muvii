package com.denisgithuku.movies.di

import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.data.local.FavouriteMoviesDao
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.core_data.providers.UserPreferences
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
        moviesApiInterface: MoviesApiInterface,
        favouriteMoviesDao: FavouriteMoviesDao
    ): MoviesRepository {
        return MoviesRepositoryImpl(moviesApiInterface, favouriteMoviesDao)
    }

    @Provides
    @Singleton
    fun provideDateFormatterUseCase(): FormatDateUseCase = FormatDateUseCase()


    @Provides
    @Singleton
    fun provideMovieUseCases(
        moviesRepository: MoviesRepository,
        favouriteMoviesRepository: FavouriteMoviesRepository,
        userPreferences: UserPreferences,
        formatDateUseCase: FormatDateUseCase,
        dispatcherProvider: DispatcherProvider
    ): MovieUseCases {
        return MovieUseCases(
            getAllMovieGenres = GetAllMovieGenres(moviesRepository),
            getMoviesByGenre = GetMoviesByGenre(moviesRepository),
            getTrendingMovies = GetTrendingMovies(moviesRepository),
            readAdultContentPreferences = GetAdultContentPreferences(userPreferences),
            changeUiTheme = ChangeUiTheme(userPreferences),
            enableAdultContent = EnableAdultContent(userPreferences),
            getMovieDetails = GetMovieDetails(
                moviesRepository,
                favouriteMoviesRepository,
                formatDateUseCase,
                dispatcherProvider
            ),
            getSimilarMoviesById = GetSimilarMoviesById(moviesRepository),
            toggleFavourite = ToggleFavourite(favouriteMoviesRepository),
            deleteAllFavourites = DeleteAllFavourites(moviesRepository),
            searchMovies = SearchMovies(moviesRepository, dispatcherProvider)
        )
    }
}
