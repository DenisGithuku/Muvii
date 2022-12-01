package com.denisgithuku.core_data.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
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
public final class PersonsDao_Impl implements PersonsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PersonEntity> __insertionAdapterOfPersonEntity;

  private final EntityDeletionOrUpdateAdapter<PersonEntity> __deletionAdapterOfPersonEntity;

  public PersonsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPersonEntity = new EntityInsertionAdapter<PersonEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `followed_persons_table` (`personId`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PersonEntity value) {
        stmt.bindLong(1, value.getPersonId());
      }
    };
    this.__deletionAdapterOfPersonEntity = new EntityDeletionOrUpdateAdapter<PersonEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `followed_persons_table` WHERE `personId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PersonEntity value) {
        stmt.bindLong(1, value.getPersonId());
      }
    };
  }

  @Override
  public Object insertPerson(final PersonEntity personEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPersonEntity.insert(personEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deletePerson(final PersonEntity personEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPersonEntity.handle(personEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFollowedPersonsList(
      final Continuation<? super List<PersonEntity>> continuation) {
    final String _sql = "SELECT * FROM followed_persons_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<PersonEntity>>() {
      @Override
      public List<PersonEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonId = CursorUtil.getColumnIndexOrThrow(_cursor, "personId");
          final List<PersonEntity> _result = new ArrayList<PersonEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final PersonEntity _item;
            final int _tmpPersonId;
            _tmpPersonId = _cursor.getInt(_cursorIndexOfPersonId);
            _item = new PersonEntity(_tmpPersonId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFollowedPerson(final int personId,
      final Continuation<? super PersonEntity> continuation) {
    final String _sql = "SELECT * FROM followed_persons_table WHERE personId like ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, personId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<PersonEntity>() {
      @Override
      public PersonEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPersonId = CursorUtil.getColumnIndexOrThrow(_cursor, "personId");
          final PersonEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpPersonId;
            _tmpPersonId = _cursor.getInt(_cursorIndexOfPersonId);
            _result = new PersonEntity(_tmpPersonId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
