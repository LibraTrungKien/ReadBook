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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<Repository> repositoryProvider;

  public LoginViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new LoginViewModel_Factory(repositoryProvider);
  }

  public static LoginViewModel newInstance(Repository repository) {
    return new LoginViewModel(repository);
  }
}
