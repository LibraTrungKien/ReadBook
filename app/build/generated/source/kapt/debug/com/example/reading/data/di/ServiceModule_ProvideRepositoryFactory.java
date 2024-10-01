package com.example.reading.data.di;

import com.example.reading.data.AppService;
import com.example.reading.data.locadatasource.AppStorageLocalDataSource;
import com.example.reading.data.locadatasource.StoryLocalDataSource;
import com.example.reading.domain.Repository;
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
public final class ServiceModule_ProvideRepositoryFactory implements Factory<Repository> {
  private final Provider<AppService> appServiceProvider;

  private final Provider<StoryLocalDataSource> localDataSourceProvider;

  private final Provider<AppStorageLocalDataSource> appStorageLocalDataSourceProvider;

  public ServiceModule_ProvideRepositoryFactory(Provider<AppService> appServiceProvider,
      Provider<StoryLocalDataSource> localDataSourceProvider,
      Provider<AppStorageLocalDataSource> appStorageLocalDataSourceProvider) {
    this.appServiceProvider = appServiceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
    this.appStorageLocalDataSourceProvider = appStorageLocalDataSourceProvider;
  }

  @Override
  public Repository get() {
    return provideRepository(appServiceProvider.get(), localDataSourceProvider.get(), appStorageLocalDataSourceProvider.get());
  }

  public static ServiceModule_ProvideRepositoryFactory create(
      Provider<AppService> appServiceProvider,
      Provider<StoryLocalDataSource> localDataSourceProvider,
      Provider<AppStorageLocalDataSource> appStorageLocalDataSourceProvider) {
    return new ServiceModule_ProvideRepositoryFactory(appServiceProvider, localDataSourceProvider, appStorageLocalDataSourceProvider);
  }

  public static Repository provideRepository(AppService appService,
      StoryLocalDataSource localDataSource, AppStorageLocalDataSource appStorageLocalDataSource) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideRepository(appService, localDataSource, appStorageLocalDataSource));
  }
}
