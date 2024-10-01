package com.example.reading.presentation.view;

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
public final class RechargeViewModel_Factory implements Factory<RechargeViewModel> {
  private final Provider<Repository> repositoryProvider;

  public RechargeViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RechargeViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static RechargeViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new RechargeViewModel_Factory(repositoryProvider);
  }

  public static RechargeViewModel newInstance(Repository repository) {
    return new RechargeViewModel(repository);
  }
}
