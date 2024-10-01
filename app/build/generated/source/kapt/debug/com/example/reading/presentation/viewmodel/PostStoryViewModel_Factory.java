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
public final class PostStoryViewModel_Factory implements Factory<PostStoryViewModel> {
  private final Provider<Repository> repositoryProvider;

  public PostStoryViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PostStoryViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static PostStoryViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new PostStoryViewModel_Factory(repositoryProvider);
  }

  public static PostStoryViewModel newInstance(Repository repository) {
    return new PostStoryViewModel(repository);
  }
}
