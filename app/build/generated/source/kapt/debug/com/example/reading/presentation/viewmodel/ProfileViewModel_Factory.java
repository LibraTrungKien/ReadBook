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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<Repository> repositoryProvider;

  public ProfileViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new ProfileViewModel_Factory(repositoryProvider);
  }

  public static ProfileViewModel newInstance(Repository repository) {
    return new ProfileViewModel(repository);
  }
}
