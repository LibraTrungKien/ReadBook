package com.example.reading.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

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
public final class ServiceModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;

  public ServiceModule_ProvideOkHttpClientFactory(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    this.httpLoggingInterceptorProvider = httpLoggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(httpLoggingInterceptorProvider.get());
  }

  public static ServiceModule_ProvideOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider) {
    return new ServiceModule_ProvideOkHttpClientFactory(httpLoggingInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideOkHttpClient(httpLoggingInterceptor));
  }
}
