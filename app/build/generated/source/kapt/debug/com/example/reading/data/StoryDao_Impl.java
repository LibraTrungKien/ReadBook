package com.example.reading.data;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.reading.data.converter.ChapterConverter;
import com.example.reading.data.entity.FavouriteEntity;
import com.example.reading.data.entity.HistoryEntity;
import com.example.reading.data.entity.StoryEntity;
import com.example.reading.domain.model.Chapter;
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
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StoryDao_Impl implements StoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HistoryEntity> __insertionAdapterOfHistoryEntity;

  private final ChapterConverter __chapterConverter = new ChapterConverter();

  private final EntityInsertionAdapter<FavouriteEntity> __insertionAdapterOfFavouriteEntity;

  private final EntityInsertionAdapter<StoryEntity> __insertionAdapterOfStoryEntity;

  private final EntityDeletionOrUpdateAdapter<FavouriteEntity> __deletionAdapterOfFavouriteEntity;

  private final EntityDeletionOrUpdateAdapter<StoryEntity> __deletionAdapterOfStoryEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllStory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllFavourite;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllHistory;

  public StoryDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistoryEntity = new EntityInsertionAdapter<HistoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `HistoryEntity` (`id`,`name`,`image`,`category`,`author_id`,`dateCreated`,`dateUpdated`,`cost`,`status`,`description`,`chapters`,`timeWhenSave`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final HistoryEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getImage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImage());
        }
        statement.bindLong(4, entity.getCategory());
        statement.bindLong(5, entity.getAuthor_id());
        statement.bindLong(6, entity.getDateCreated());
        statement.bindLong(7, entity.getDateUpdated());
        statement.bindLong(8, entity.getCost());
        statement.bindLong(9, entity.getStatus());
        if (entity.getDescription() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getDescription());
        }
        final String _tmp = __chapterConverter.chapters2String(entity.getChapters());
        if (_tmp == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, _tmp);
        }
        statement.bindLong(12, entity.getTimeWhenSave());
      }
    };
    this.__insertionAdapterOfFavouriteEntity = new EntityInsertionAdapter<FavouriteEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `FavouriteEntity` (`id`,`name`,`image`,`category`,`author_id`,`dateCreated`,`cost`,`dateUpdated`,`status`,`description`,`chapters`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavouriteEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getImage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImage());
        }
        statement.bindLong(4, entity.getCategory());
        statement.bindLong(5, entity.getAuthor_id());
        statement.bindLong(6, entity.getDateCreated());
        statement.bindLong(7, entity.getCost());
        statement.bindLong(8, entity.getDateUpdated());
        statement.bindLong(9, entity.getStatus());
        if (entity.getDescription() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getDescription());
        }
        final String _tmp = __chapterConverter.chapters2String(entity.getChapters());
        if (_tmp == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, _tmp);
        }
      }
    };
    this.__insertionAdapterOfStoryEntity = new EntityInsertionAdapter<StoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `StoryEntity` (`id`,`name`,`image`,`category`,`author_id`,`dateCreated`,`dateUpdated`,`status`,`description`,`chapters`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final StoryEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getImage() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImage());
        }
        statement.bindLong(4, entity.getCategory());
        statement.bindLong(5, entity.getAuthor_id());
        statement.bindLong(6, entity.getDateCreated());
        statement.bindLong(7, entity.getDateUpdated());
        statement.bindLong(8, entity.getStatus());
        if (entity.getDescription() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getDescription());
        }
        final String _tmp = __chapterConverter.chapters2String(entity.getChapters());
        if (_tmp == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, _tmp);
        }
      }
    };
    this.__deletionAdapterOfFavouriteEntity = new EntityDeletionOrUpdateAdapter<FavouriteEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `FavouriteEntity` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final FavouriteEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__deletionAdapterOfStoryEntity = new EntityDeletionOrUpdateAdapter<StoryEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `StoryEntity` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final StoryEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__preparedStmtOfDeleteAllStory = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE \n"
                + "        FROM StoryEntity\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllFavourite = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE \n"
                + "        FROM FavouriteEntity\n"
                + "    ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllHistory = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        DELETE \n"
                + "        FROM HistoryEntity\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object addHistory(final HistoryEntity story,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHistoryEntity.insert(story);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addFavourite(final FavouriteEntity story,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFavouriteEntity.insert(story);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object save(final List<StoryEntity> story, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStoryEntity.insert(story);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object save(final StoryEntity storyEntity, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStoryEntity.insert(storyEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteFavourite(final FavouriteEntity favouriteEntity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFavouriteEntity.handle(favouriteEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteStory(final StoryEntity storyEntity,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfStoryEntity.handle(storyEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllStory(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllStory.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAllStory.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllFavourite(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllFavourite.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAllFavourite.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllHistory(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllHistory.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteAllHistory.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getAllStory(final Continuation<? super List<StoryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT * \n"
            + "        FROM StoryEntity \n"
            + "        WHERE status = 1\n"
            + "        ORDER BY id DESC\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<StoryEntity>>() {
      @Override
      @NonNull
      public List<StoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final List<StoryEntity> _result = new ArrayList<StoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final StoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            _item = new StoryEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpDateUpdated,_tmpStatus,_tmpDescription,_tmpChapters);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object searchStoryByName(final String name,
      final Continuation<? super List<StoryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM StoryEntity\n"
            + "        WHERE name LIKE ?\n"
            + "        ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<StoryEntity>>() {
      @Override
      @NonNull
      public List<StoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final List<StoryEntity> _result = new ArrayList<StoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final StoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            _item = new StoryEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpDateUpdated,_tmpStatus,_tmpDescription,_tmpChapters);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getStoryByCategory(final int category,
      final Continuation<? super List<StoryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM StoryEntity\n"
            + "        WHERE category = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, category);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<StoryEntity>>() {
      @Override
      @NonNull
      public List<StoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final List<StoryEntity> _result = new ArrayList<StoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final StoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            _item = new StoryEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpDateUpdated,_tmpStatus,_tmpDescription,_tmpChapters);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getHistory(final Continuation<? super List<HistoryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM HistoryEntity\n"
            + "        ORDER BY timeWhenSave DESC\n"
            + "        LIMIT 4\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<HistoryEntity>>() {
      @Override
      @NonNull
      public List<HistoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfCost = CursorUtil.getColumnIndexOrThrow(_cursor, "cost");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final int _cursorIndexOfTimeWhenSave = CursorUtil.getColumnIndexOrThrow(_cursor, "timeWhenSave");
          final List<HistoryEntity> _result = new ArrayList<HistoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final HistoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpCost;
            _tmpCost = _cursor.getInt(_cursorIndexOfCost);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            final long _tmpTimeWhenSave;
            _tmpTimeWhenSave = _cursor.getLong(_cursorIndexOfTimeWhenSave);
            _item = new HistoryEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpDateUpdated,_tmpCost,_tmpStatus,_tmpDescription,_tmpChapters,_tmpTimeWhenSave);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<FavouriteEntity>> getStoryFavourites() {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM FavouriteEntity\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"FavouriteEntity"}, new Callable<List<FavouriteEntity>>() {
      @Override
      @NonNull
      public List<FavouriteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfCost = CursorUtil.getColumnIndexOrThrow(_cursor, "cost");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final List<FavouriteEntity> _result = new ArrayList<FavouriteEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final FavouriteEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final int _tmpCost;
            _tmpCost = _cursor.getInt(_cursorIndexOfCost);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            _item = new FavouriteEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpCost,_tmpDateUpdated,_tmpStatus,_tmpDescription,_tmpChapters);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getStoryByAuthor(final int author,
      final Continuation<? super List<StoryEntity>> $completion) {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM StoryEntity\n"
            + "        WHERE author_id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, author);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<StoryEntity>>() {
      @Override
      @NonNull
      public List<StoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final List<StoryEntity> _result = new ArrayList<StoryEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final StoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            _item = new StoryEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpDateUpdated,_tmpStatus,_tmpDescription,_tmpChapters);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getStoryById(final int id, final Continuation<? super StoryEntity> $completion) {
    final String _sql = "\n"
            + "        SELECT *\n"
            + "        FROM StoryEntity\n"
            + "        WHERE id = ?\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<StoryEntity>() {
      @Override
      @Nullable
      public StoryEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfAuthorId = CursorUtil.getColumnIndexOrThrow(_cursor, "author_id");
          final int _cursorIndexOfDateCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateCreated");
          final int _cursorIndexOfDateUpdated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateUpdated");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfChapters = CursorUtil.getColumnIndexOrThrow(_cursor, "chapters");
          final StoryEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final int _tmpCategory;
            _tmpCategory = _cursor.getInt(_cursorIndexOfCategory);
            final int _tmpAuthor_id;
            _tmpAuthor_id = _cursor.getInt(_cursorIndexOfAuthorId);
            final long _tmpDateCreated;
            _tmpDateCreated = _cursor.getLong(_cursorIndexOfDateCreated);
            final long _tmpDateUpdated;
            _tmpDateUpdated = _cursor.getLong(_cursorIndexOfDateUpdated);
            final int _tmpStatus;
            _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final ArrayList<Chapter> _tmpChapters;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfChapters)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfChapters);
            }
            _tmpChapters = __chapterConverter.string2Chapters(_tmp);
            _result = new StoryEntity(_tmpId,_tmpName,_tmpImage,_tmpCategory,_tmpAuthor_id,_tmpDateCreated,_tmpDateUpdated,_tmpStatus,_tmpDescription,_tmpChapters);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
