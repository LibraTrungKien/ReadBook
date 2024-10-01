package com.example.reading.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.example.reading.data.StoryDao;
import com.example.reading.data.StoryDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile StoryDao _storyDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `StoryEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `category` INTEGER NOT NULL, `author_id` INTEGER NOT NULL, `dateCreated` INTEGER NOT NULL, `dateUpdated` INTEGER NOT NULL, `status` INTEGER NOT NULL, `description` TEXT NOT NULL, `chapters` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `category` INTEGER NOT NULL, `author_id` INTEGER NOT NULL, `dateCreated` INTEGER NOT NULL, `dateUpdated` INTEGER NOT NULL, `cost` INTEGER NOT NULL, `status` INTEGER NOT NULL, `description` TEXT NOT NULL, `chapters` TEXT NOT NULL, `timeWhenSave` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `FavouriteEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `category` INTEGER NOT NULL, `author_id` INTEGER NOT NULL, `dateCreated` INTEGER NOT NULL, `cost` INTEGER NOT NULL, `dateUpdated` INTEGER NOT NULL, `status` INTEGER NOT NULL, `description` TEXT NOT NULL, `chapters` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7f7113ced733539ed4b5f0d3a5755bac')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `StoryEntity`");
        db.execSQL("DROP TABLE IF EXISTS `HistoryEntity`");
        db.execSQL("DROP TABLE IF EXISTS `FavouriteEntity`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsStoryEntity = new HashMap<String, TableInfo.Column>(10);
        _columnsStoryEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("category", new TableInfo.Column("category", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("author_id", new TableInfo.Column("author_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("dateUpdated", new TableInfo.Column("dateUpdated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStoryEntity.put("chapters", new TableInfo.Column("chapters", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStoryEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStoryEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStoryEntity = new TableInfo("StoryEntity", _columnsStoryEntity, _foreignKeysStoryEntity, _indicesStoryEntity);
        final TableInfo _existingStoryEntity = TableInfo.read(db, "StoryEntity");
        if (!_infoStoryEntity.equals(_existingStoryEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "StoryEntity(com.example.reading.data.entity.StoryEntity).\n"
                  + " Expected:\n" + _infoStoryEntity + "\n"
                  + " Found:\n" + _existingStoryEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsHistoryEntity = new HashMap<String, TableInfo.Column>(12);
        _columnsHistoryEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("category", new TableInfo.Column("category", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("author_id", new TableInfo.Column("author_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("dateUpdated", new TableInfo.Column("dateUpdated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("cost", new TableInfo.Column("cost", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("chapters", new TableInfo.Column("chapters", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntity.put("timeWhenSave", new TableInfo.Column("timeWhenSave", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistoryEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistoryEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHistoryEntity = new TableInfo("HistoryEntity", _columnsHistoryEntity, _foreignKeysHistoryEntity, _indicesHistoryEntity);
        final TableInfo _existingHistoryEntity = TableInfo.read(db, "HistoryEntity");
        if (!_infoHistoryEntity.equals(_existingHistoryEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HistoryEntity(com.example.reading.data.entity.HistoryEntity).\n"
                  + " Expected:\n" + _infoHistoryEntity + "\n"
                  + " Found:\n" + _existingHistoryEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsFavouriteEntity = new HashMap<String, TableInfo.Column>(11);
        _columnsFavouriteEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("category", new TableInfo.Column("category", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("author_id", new TableInfo.Column("author_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("dateCreated", new TableInfo.Column("dateCreated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("cost", new TableInfo.Column("cost", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("dateUpdated", new TableInfo.Column("dateUpdated", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFavouriteEntity.put("chapters", new TableInfo.Column("chapters", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFavouriteEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFavouriteEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFavouriteEntity = new TableInfo("FavouriteEntity", _columnsFavouriteEntity, _foreignKeysFavouriteEntity, _indicesFavouriteEntity);
        final TableInfo _existingFavouriteEntity = TableInfo.read(db, "FavouriteEntity");
        if (!_infoFavouriteEntity.equals(_existingFavouriteEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "FavouriteEntity(com.example.reading.data.entity.FavouriteEntity).\n"
                  + " Expected:\n" + _infoFavouriteEntity + "\n"
                  + " Found:\n" + _existingFavouriteEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7f7113ced733539ed4b5f0d3a5755bac", "0eb16cf49afc2eaa048bbe9fdf0cb67e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "StoryEntity","HistoryEntity","FavouriteEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `StoryEntity`");
      _db.execSQL("DELETE FROM `HistoryEntity`");
      _db.execSQL("DELETE FROM `FavouriteEntity`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(StoryDao.class, StoryDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public StoryDao storyDao() {
    if (_storyDao != null) {
      return _storyDao;
    } else {
      synchronized(this) {
        if(_storyDao == null) {
          _storyDao = new StoryDao_Impl(this);
        }
        return _storyDao;
      }
    }
  }
}
