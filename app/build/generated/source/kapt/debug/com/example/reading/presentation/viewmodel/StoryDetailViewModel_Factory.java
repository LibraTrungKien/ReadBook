package com.example.reading.presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class StoryDetailViewModel_Factory implements Factory<StoryDetailViewModel> {
  @Override
  public StoryDetailViewModel get() {
    return newInstance();
  }

  public static StoryDetailViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StoryDetailViewModel newInstance() {
    return new StoryDetailViewModel();
  }

  private static final class InstanceHolder {
    private static final StoryDetailViewModel_Factory INSTANCE = new StoryDetailViewModel_Factory();
  }
}
