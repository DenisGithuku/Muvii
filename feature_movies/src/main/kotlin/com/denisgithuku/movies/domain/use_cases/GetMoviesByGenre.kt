package com.denisgithuku.movies.domain.use_cases

import com.denisgithuku.core.Resource
import com.denisgithuku.movies.domain.common.OrderType
import com.denisgithuku.movies.domain.common.SortType
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.repository.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMoviesByGenre @Inject constructor(
    private val moviesRepository: MoviesRepository,
) {
    suspend operator fun invoke(
        sortType: SortType,
        genreId: Int,
        include_adult: Boolean
    ): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            when (sortType.orderType) {
                OrderType.DESCENDING -> {
                    when (sortType) {
                        is SortType.Popularity -> {
                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "popularity.desc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.ReleaseDate -> {
                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "release_date.desc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.Revenue -> {
                            val movies = moviesRepository.getMoviesByGenre(sort_by = "revenue.desc",
                                genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.VoteAverage -> {

                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "vote_average.desc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.VoteCount -> {
                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "vote_count.desc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                    }
                }
                OrderType.ASCENDING -> {
                    when (sortType) {
                        is SortType.Popularity -> {
                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "popularity.asc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.ReleaseDate -> {
                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "release_date.asc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.Revenue -> {
                            val movies = moviesRepository.getMoviesByGenre(sort_by = "revenue.asc",
                                genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.VoteAverage -> {

                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "vote_average.asc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                        is SortType.VoteCount -> {
                            val movies =
                                moviesRepository.getMoviesByGenre(sort_by = "vote_count.asc",
                                    genreId = genreId, include_adult = include_adult)
                            emit(Resource.Success(movies.map { it.toMovie() }))
                        }
                    }
                }
            }
        } catch (e: IOException) {
            emit(Resource.Error(Throwable(message = "Cannot reach the server. Check your interncet conecton")))
        } catch (e: HttpException) {
            emit(Resource.Error(Throwable(message = "Unknown error occurred")))
        } catch (e: Exception) {
            emit(Resource.Error(e))
        }

    }.flowOn(Dispatchers.IO)
}
