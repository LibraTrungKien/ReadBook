package com.example.reading.domain.usecase;

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
public final class GetDataStoryUseCase_Factory implements Factory<GetDataStoryUseCase> {
  private final Provider<Repository> repositoryProvider;

  public GetDataStoryUseCase_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetDataStoryUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetDataStoryUseCase_Factory create(Provider<Repository> repositoryProvider) {
    return new GetDataStoryUseCase_Factory(repositoryProvider);
  }

  public static GetDataStoryUseCase newInstance(Repository repository) {
    return new GetDataStoryUseCase(repository);
  }
}
