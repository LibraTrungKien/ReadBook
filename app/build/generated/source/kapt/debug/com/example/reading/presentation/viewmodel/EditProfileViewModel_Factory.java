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
public final class EditProfileViewModel_Factory implements Factory<EditProfileViewModel> {
  private final Provider<Repository> repositoryProvider;

  public EditProfileViewModel_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public EditProfileViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static EditProfileViewModel_Factory create(Provider<Repository> repositoryProvider) {
    return new EditProfileViewModel_Factory(repositoryProvider);
  }

  public static EditProfileViewModel newInstance(Repository repository) {
    return new EditProfileViewModel(repository);
  }
}
