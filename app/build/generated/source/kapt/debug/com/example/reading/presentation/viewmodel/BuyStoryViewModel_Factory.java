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
public final class BuyStoryViewModel_Factory implements Factory<BuyStoryViewModel> {
  private final Provider<Repository> repositoryProvider;

  public BuyStoryViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BuyStoryViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static BuyStoryViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new BuyStoryViewModel_Factory(repositoryProvider);
  }

  public static BuyStoryViewModel newInstance(Repository repository) {
    return new BuyStoryViewModel(repository);
  }
}
