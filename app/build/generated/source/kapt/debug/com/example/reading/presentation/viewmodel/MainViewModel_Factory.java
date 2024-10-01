package com.example.reading.presentation.viewmodel;

import com.example.reading.domain.Repository;
import com.example.reading.domain.usecase.GetDataStoryUseCase;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<GetDataStoryUseCase> getDataStoryUseCaseProvider;

  private final Provider<Repository> repositoryProvider;

  public MainViewModel_Factory(Provider<GetDataStoryUseCase> getDataStoryUseCaseProvider,
      Provider<Repository> repositoryProvider) {
    this.getDataStoryUseCaseProvider = getDataStoryUseCaseProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(getDataStoryUseCaseProvider.get(), repositoryProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<GetDataStoryUseCase> getDataStoryUseCaseProvider,
      Provider<Repository> repositoryProvider) {
    return new MainViewModel_Factory(getDataStoryUseCaseProvider, repositoryProvider);
  }

  public static MainViewModel newInstance(GetDataStoryUseCase getDataStoryUseCase,
      Repository repository) {
    return new MainViewModel(getDataStoryUseCase, repository);
  }
}
