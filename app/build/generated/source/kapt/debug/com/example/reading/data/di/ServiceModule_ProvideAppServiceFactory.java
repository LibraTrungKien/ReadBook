package com.example.reading.data.di;

import com.example.reading.data.AppService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class ServiceModule_ProvideAppServiceFactory implements Factory<AppService> {
  private final Provider<Retrofit> retrofitProvider;

  public ServiceModule_ProvideAppServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AppService get() {
    return provideAppService(retrofitProvider.get());
  }

  public static ServiceModule_ProvideAppServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new ServiceModule_ProvideAppServiceFactory(retrofitProvider);
  }

  public static AppService provideAppService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideAppService(retrofit));
  }
}
