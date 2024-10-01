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
public final class AddAccountViewModel_Factory implements Factory<AddAccountViewModel> {
  private final Provider<Repository> repositoryProvider;

  public AddAccountViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AddAccountViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static AddAccountViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new AddAccountViewModel_Factory(repositoryProvider);
  }

  public static AddAccountViewModel newInstance(Repository repository) {
    return new AddAccountViewModel(repository);
  }
}
