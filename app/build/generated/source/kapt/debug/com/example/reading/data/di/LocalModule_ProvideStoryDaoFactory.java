package com.example.reading.data.di;

import com.example.reading.data.StoryDao;
import com.example.reading.data.database.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LocalModule_ProvideStoryDaoFactory implements Factory<StoryDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public LocalModule_ProvideStoryDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public StoryDao get() {
    return provideStoryDao(appDatabaseProvider.get());
  }

  public static LocalModule_ProvideStoryDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new LocalModule_ProvideStoryDaoFactory(appDatabaseProvider);
  }

  public static StoryDao provideStoryDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(LocalModule.INSTANCE.provideStoryDao(appDatabase));
  }
}
