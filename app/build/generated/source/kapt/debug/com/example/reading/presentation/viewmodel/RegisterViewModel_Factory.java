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
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<Repository> repositoryProvider;

  public RegisterViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new RegisterViewModel_Factory(repositoryProvider);
  }

  public static RegisterViewModel newInstance(Repository repository) {
    return new RegisterViewModel(repository);
  }
}
