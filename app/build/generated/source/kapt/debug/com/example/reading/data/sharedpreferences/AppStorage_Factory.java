package com.example.reading.data.sharedpreferences;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class AppStorage_Factory implements Factory<AppStorage> {
  private final Provider<Context> contextProvider;

  public AppStorage_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppStorage get() {
    return newInstance(contextProvider.get());
  }

  public static AppStorage_Factory create(Provider<Context> contextProvider) {
    return new AppStorage_Factory(contextProvider);
  }

  public static AppStorage newInstance(Context context) {
    return new AppStorage(context);
  }
}
