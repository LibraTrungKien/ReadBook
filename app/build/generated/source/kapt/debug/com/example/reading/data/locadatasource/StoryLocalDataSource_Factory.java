package com.example.reading.data.locadatasource;

import com.example.reading.data.StoryDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class StoryLocalDataSource_Factory implements Factory<StoryLocalDataSource> {
  private final Provider<StoryDao> storyDaoProvider;

  public StoryLocalDataSource_Factory(Provider<StoryDao> storyDaoProvider) {
    this.storyDaoProvider = storyDaoProvider;
  }

  @Override
  public StoryLocalDataSource get() {
    return newInstance(storyDaoProvider.get());
  }

  public static StoryLocalDataSource_Factory create(Provider<StoryDao> storyDaoProvider) {
    return new StoryLocalDataSource_Factory(storyDaoProvider);
  }

  public static StoryLocalDataSource newInstance(StoryDao storyDao) {
    return new StoryLocalDataSource(storyDao);
  }
}
