package com.example.reading.data;

import com.example.reading.data.locadatasource.AppStorageLocalDataSource;
import com.example.reading.data.locadatasource.StoryLocalDataSource;
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
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<AppService> apiServiceProvider;

  private final Provider<StoryLocalDataSource> localDataSourceProvider;

  private final Provider<AppStorageLocalDataSource> appStorageLocalDataSourceProvider;

  public RepositoryImpl_Factory(Provider<AppService> apiServiceProvider,
      Provider<StoryLocalDataSource> localDataSourceProvider,
      Provider<AppStorageLocalDataSource> appStorageLocalDataSourceProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
    this.appStorageLocalDataSourceProvider = appStorageLocalDataSourceProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(apiServiceProvider.get(), localDataSourceProvider.get(), appStorageLocalDataSourceProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<AppService> apiServiceProvider,
      Provider<StoryLocalDataSource> localDataSourceProvider,
      Provider<AppStorageLocalDataSource> appStorageLocalDataSourceProvider) {
    return new RepositoryImpl_Factory(apiServiceProvider, localDataSourceProvider, appStorageLocalDataSourceProvider);
  }

  public static RepositoryImpl newInstance(AppService apiService,
      StoryLocalDataSource localDataSource, AppStorageLocalDataSource appStorageLocalDataSource) {
    return new RepositoryImpl(apiService, localDataSource, appStorageLocalDataSource);
  }
}
