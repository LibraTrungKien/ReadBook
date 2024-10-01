package com.example.reading.presentation.viewmodel;

import com.example.reading.domain.Repository;
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
public final class PostManagementViewModel_Factory implements Factory<PostManagementViewModel> {
  private final Provider<Repository> appRepositoryProvider;

  public PostManagementViewModel_Factory(Provider<Repository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public PostManagementViewModel get() {
    return newInstance(appRepositoryProvider.get());
  }

  public static PostManagementViewModel_Factory create(Provider<Repository> appRepositoryProvider) {
    return new PostManagementViewModel_Factory(appRepositoryProvider);
  }

  public static PostManagementViewModel newInstance(Repository appRepository) {
    return new PostManagementViewModel(appRepository);
  }
}
