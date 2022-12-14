package com.denisgithuku.core_data.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FavouriteMoviesDao_Impl implements FavouriteMoviesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FavouriteMovieDBO> __insertionAdapterOfFavouriteMovieDBO;

  private final EntityDeletionOrUpdateAdapter<FavouriteMovieDBO> __deletionAdapterOfFavouriteMovieDBO;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavouriteMovies;

  public FavouriteMoviesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFavouriteMovieDBO = new EntityInsertionAdapter<FavouriteMovieDBO>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `favourite_movies_table` (`movie_id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteMovieDBO value) {
        stmt.bindLong(1, value.getMovieId());
      }
    };
    this.__deletionAdapterOfFavouriteMovieDBO = new EntityDeletionOrUpdateAdapter<FavouriteMovieDBO>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `favourite_movies_table` WHERE `movie_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FavouriteMovieDBO value) {
        stmt.bindLong(1, value.getMovieId());
      }
    };
    this.__preparedStmtOfDeleteAllFavouriteMovies = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM favourite_movies_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertMovie(final FavouriteMovieDBO movie, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavouriteMovieDBO.insert(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteMovie(final FavouriteMovieDBO movie, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavouriteMovieDBO.handle(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllFavouriteMovies(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavouriteMovies.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllFavouriteMovies.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object getFavouriteMovies(final Continuation<? super List<FavouriteMovieDBO>> arg0) {
    final String _sql = "SELECT * FROM favourite_movies_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<FavouriteMovieDBO>>() {
      @Override
      public List<FavouriteMovieDBO> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final List<FavouriteMovieDBO> _result = new ArrayList<FavouriteMovieDBO>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FavouriteMovieDBO _item;
            final int _tmpMovieId;
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
            _item = new FavouriteMovieDBO(_tmpMovieId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
