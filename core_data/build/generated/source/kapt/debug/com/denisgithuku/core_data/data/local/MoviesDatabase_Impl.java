package com.denisgithuku.core_data.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MoviesDatabase_Impl extends MoviesDatabase {
  private volatile FavouriteMoviesDao _favouriteMoviesDao;

  private volatile PersonsDao _personsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `favourite_movies_table` (`movie_id` INTEGER NOT NULL, PRIMARY KEY(`movie_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `followed_persons_table` (`personId` INTEGER NOT NULL, PRIMARY KEY(`personId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dc2e64c9e63ccb4b051acd3d06e1d2b8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `favourite_movies_table`");
        _db.execSQL("DROP TABLE IF EXISTS `followed_persons_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFavouriteMoviesTable = new HashMap<String, TableInfo.Column>(1);
        _columnsFavouriteMoviesTable.put("movie_id", new TableInfo.Column("movie_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavouriteMoviesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavouriteMoviesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavouriteMoviesTable = new TableInfo("favourite_movies_table", _columnsFavouriteMoviesTable, _foreignKeysFavouriteMoviesTable, _indicesFavouriteMoviesTable);
        final TableInfo _existingFavouriteMoviesTable = TableInfo.read(_db, "favourite_movies_table");
        if (! _infoFavouriteMoviesTable.equals(_existingFavouriteMoviesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "favourite_movies_table(com.denisgithuku.core_data.data.local.FavouriteMovieDBO).\n"
                  + " Expected:\n" + _infoFavouriteMoviesTable + "\n"
                  + " Found:\n" + _existingFavouriteMoviesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsFollowedPersonsTable = new HashMap<String, TableInfo.Column>(1);
        _columnsFollowedPersonsTable.put("personId", new TableInfo.Column("personId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFollowedPersonsTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFollowedPersonsTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFollowedPersonsTable = new TableInfo("followed_persons_table", _columnsFollowedPersonsTable, _foreignKeysFollowedPersonsTable, _indicesFollowedPersonsTable);
        final TableInfo _existingFollowedPersonsTable = TableInfo.read(_db, "followed_persons_table");
        if (! _infoFollowedPersonsTable.equals(_existingFollowedPersonsTable)) {
          return new RoomOpenHelper.ValidationResult(false, "followed_persons_table(com.denisgithuku.core_data.data.local.PersonEntity).\n"
                  + " Expected:\n" + _infoFollowedPersonsTable + "\n"
                  + " Found:\n" + _existingFollowedPersonsTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dc2e64c9e63ccb4b051acd3d06e1d2b8", "39244e79f03fe7d22606775bf3fd8908");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "favourite_movies_table","followed_persons_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `favourite_movies_table`");
      _db.execSQL("DELETE FROM `followed_persons_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(FavouriteMoviesDao.class, FavouriteMoviesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PersonsDao.class, PersonsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public FavouriteMoviesDao favouriteMoviesDao() {
    if (_favouriteMoviesDao != null) {
      return _favouriteMoviesDao;
    } else {
      synchronized(this) {
        if(_favouriteMoviesDao == null) {
          _favouriteMoviesDao = new FavouriteMoviesDao_Impl(this);
        }
        return _favouriteMoviesDao;
      }
    }
  }

  @Override
  public PersonsDao personsDao() {
    if (_personsDao != null) {
      return _personsDao;
    } else {
      synchronized(this) {
        if(_personsDao == null) {
          _personsDao = new PersonsDao_Impl(this);
        }
        return _personsDao;
      }
    }
  }
}
