package com.example.reading.presentation.view.adapter;

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
public final class AuthorAdapter_Factory implements Factory<AuthorAdapter> {
  @Override
  public AuthorAdapter get() {
    return newInstance();
  }

  public static AuthorAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthorAdapter newInstance() {
    return new AuthorAdapter();
  }

  private static final class InstanceHolder {
    private static final AuthorAdapter_Factory INSTANCE = new AuthorAdapter_Factory();
  }
}
