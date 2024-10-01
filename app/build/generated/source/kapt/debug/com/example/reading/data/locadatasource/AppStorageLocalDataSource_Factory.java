package com.example.reading.data.locadatasource;

import com.example.reading.data.sharedpreferences.AppStorage;
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
public final class AppStorageLocalDataSource_Factory implements Factory<AppStorageLocalDataSource> {
  private final Provider<AppStorage> appStorageProvider;

  public AppStorageLocalDataSource_Factory(Provider<AppStorage> appStorageProvider) {
    this.appStorageProvider = appStorageProvider;
  }

  @Override
  public AppStorageLocalDataSource get() {
    return newInstance(appStorageProvider.get());
  }

  public static AppStorageLocalDataSource_Factory create(Provider<AppStorage> appStorageProvider) {
    return new AppStorageLocalDataSource_Factory(appStorageProvider);
  }

  public static AppStorageLocalDataSource newInstance(AppStorage appStorage) {
    return new AppStorageLocalDataSource(appStorage);
  }
}
