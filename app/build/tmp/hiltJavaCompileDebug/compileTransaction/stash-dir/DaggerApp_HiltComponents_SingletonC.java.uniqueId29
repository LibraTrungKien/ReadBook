package com.example.reading.presentation.view;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.reading.data.AppService;
import com.example.reading.data.StoryDao;
import com.example.reading.data.database.AppDatabase;
import com.example.reading.data.di.LocalModule;
import com.example.reading.data.di.LocalModule_ProvideAppDatabaseFactory;
import com.example.reading.data.di.LocalModule_ProvideStoryDaoFactory;
import com.example.reading.data.di.ServiceModule;
import com.example.reading.data.di.ServiceModule_ProvideAppServiceFactory;
import com.example.reading.data.di.ServiceModule_ProvideHttpLoggingInterceptorFactory;
import com.example.reading.data.di.ServiceModule_ProvideOkHttpClientFactory;
import com.example.reading.data.di.ServiceModule_ProvideRepositoryFactory;
import com.example.reading.data.di.ServiceModule_ProvideRetrofitFactory;
import com.example.reading.data.locadatasource.AppStorageLocalDataSource;
import com.example.reading.data.locadatasource.StoryLocalDataSource;
import com.example.reading.data.sharedpreferences.AppStorage;
import com.example.reading.domain.Repository;
import com.example.reading.domain.usecase.GetDataStoryUseCase;
import com.example.reading.presentation.view.fragment.AddAccountFragment;
import com.example.reading.presentation.view.fragment.BuyStoryFragment;
import com.example.reading.presentation.view.fragment.EditProfileFragment;
import com.example.reading.presentation.view.fragment.LoginFragment;
import com.example.reading.presentation.view.fragment.MainFragment;
import com.example.reading.presentation.view.fragment.ManageAccountFragment;
import com.example.reading.presentation.view.fragment.ManagerStoryFragment;
import com.example.reading.presentation.view.fragment.PostManagementFragment;
import com.example.reading.presentation.view.fragment.PostStoryFragment;
import com.example.reading.presentation.view.fragment.ProfileFragment;
import com.example.reading.presentation.view.fragment.RegisterFragment;
import com.example.reading.presentation.view.fragment.SearchStoryFragment;
import com.example.reading.presentation.view.fragment.SplashFragment;
import com.example.reading.presentation.view.fragment.StoryFavouriteFragment;
import com.example.reading.presentation.view.fragment.StoryFragment;
import com.example.reading.presentation.viewmodel.AddAccountViewModel;
import com.example.reading.presentation.viewmodel.AddAccountViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.BuyStoryViewModel;
import com.example.reading.presentation.viewmodel.BuyStoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.EditProfileViewModel;
import com.example.reading.presentation.viewmodel.EditProfileViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.LoginViewModel;
import com.example.reading.presentation.viewmodel.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.MainViewModel;
import com.example.reading.presentation.viewmodel.MainViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.ManageAccountViewModel;
import com.example.reading.presentation.viewmodel.ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.ManagerStoryViewModel;
import com.example.reading.presentation.viewmodel.ManagerStoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.PostManagementViewModel;
import com.example.reading.presentation.viewmodel.PostManagementViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.PostStoryViewModel;
import com.example.reading.presentation.viewmodel.PostStoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.ProfileViewModel;
import com.example.reading.presentation.viewmodel.ProfileViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.RegisterViewModel;
import com.example.reading.presentation.viewmodel.RegisterViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.SearchStoryViewModel;
import com.example.reading.presentation.viewmodel.SearchStoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.SplashViewModel;
import com.example.reading.presentation.viewmodel.SplashViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.StoryDetailViewModel;
import com.example.reading.presentation.viewmodel.StoryDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.StoryFavouriteViewModel;
import com.example.reading.presentation.viewmodel.StoryFavouriteViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.reading.presentation.viewmodel.StoryViewModel;
import com.example.reading.presentation.viewmodel.StoryViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class DaggerApp_HiltComponents_SingletonC {
  private DaggerApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(
        HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
      Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder localModule(LocalModule localModule) {
      Preconditions.checkNotNull(localModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder serviceModule(ServiceModule serviceModule) {
      Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public App_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements App_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public App_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonCImpl);
    }
  }

  private static final class ActivityCBuilder implements App_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public App_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements App_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public App_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements App_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements App_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public App_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements App_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public App_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements App_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public App_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends App_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends App_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectAddAccountFragment(AddAccountFragment addAccountFragment) {
    }

    @Override
    public void injectBuyStoryFragment(BuyStoryFragment buyStoryFragment) {
    }

    @Override
    public void injectEditProfileFragment(EditProfileFragment editProfileFragment) {
    }

    @Override
    public void injectLoginFragment(LoginFragment loginFragment) {
    }

    @Override
    public void injectMainFragment(MainFragment mainFragment) {
    }

    @Override
    public void injectManageAccountFragment(ManageAccountFragment manageAccountFragment) {
    }

    @Override
    public void injectManagerStoryFragment(ManagerStoryFragment managerStoryFragment) {
    }

    @Override
    public void injectPostManagementFragment(PostManagementFragment postManagementFragment) {
    }

    @Override
    public void injectPostStoryFragment(PostStoryFragment postStoryFragment) {
    }

    @Override
    public void injectProfileFragment(ProfileFragment profileFragment) {
    }

    @Override
    public void injectRegisterFragment(RegisterFragment registerFragment) {
    }

    @Override
    public void injectSearchStoryFragment(SearchStoryFragment searchStoryFragment) {
    }

    @Override
    public void injectSplashFragment(SplashFragment splashFragment) {
    }

    @Override
    public void injectStoryFavouriteFragment(StoryFavouriteFragment storyFavouriteFragment) {
    }

    @Override
    public void injectStoryFragment(StoryFragment storyFragment) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends App_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends App_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public void injectRechargeActivity(RechargeActivity rechargeActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(18).add(AddAccountViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(BuyStoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(EditProfileViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HomeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ManageAccountViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ManagerStoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PostManagementViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PostStoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ProfileViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RechargeViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(RegisterViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SearchStoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SplashViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StoryDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StoryFavouriteViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends App_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AddAccountViewModel> addAccountViewModelProvider;

    private Provider<BuyStoryViewModel> buyStoryViewModelProvider;

    private Provider<EditProfileViewModel> editProfileViewModelProvider;

    private Provider<HomeViewModel> homeViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<MainViewModel> mainViewModelProvider;

    private Provider<ManageAccountViewModel> manageAccountViewModelProvider;

    private Provider<ManagerStoryViewModel> managerStoryViewModelProvider;

    private Provider<PostManagementViewModel> postManagementViewModelProvider;

    private Provider<PostStoryViewModel> postStoryViewModelProvider;

    private Provider<ProfileViewModel> profileViewModelProvider;

    private Provider<RechargeViewModel> rechargeViewModelProvider;

    private Provider<RegisterViewModel> registerViewModelProvider;

    private Provider<SearchStoryViewModel> searchStoryViewModelProvider;

    private Provider<SplashViewModel> splashViewModelProvider;

    private Provider<StoryDetailViewModel> storyDetailViewModelProvider;

    private Provider<StoryFavouriteViewModel> storyFavouriteViewModelProvider;

    private Provider<StoryViewModel> storyViewModelProvider;

    private ViewModelCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam,
        ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    private GetDataStoryUseCase getDataStoryUseCase() {
      return new GetDataStoryUseCase(singletonCImpl.repository());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.addAccountViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.buyStoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.editProfileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.mainViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.manageAccountViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.managerStoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
      this.postManagementViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 8);
      this.postStoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 9);
      this.profileViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 10);
      this.rechargeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 11);
      this.registerViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 12);
      this.searchStoryViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 13);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 14);
      this.storyDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 15);
      this.storyFavouriteViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 16);
      this.storyViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 17);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(18).put("com.example.reading.presentation.viewmodel.AddAccountViewModel", ((Provider) addAccountViewModelProvider)).put("com.example.reading.presentation.viewmodel.BuyStoryViewModel", ((Provider) buyStoryViewModelProvider)).put("com.example.reading.presentation.viewmodel.EditProfileViewModel", ((Provider) editProfileViewModelProvider)).put("com.example.reading.presentation.view.HomeViewModel", ((Provider) homeViewModelProvider)).put("com.example.reading.presentation.viewmodel.LoginViewModel", ((Provider) loginViewModelProvider)).put("com.example.reading.presentation.viewmodel.MainViewModel", ((Provider) mainViewModelProvider)).put("com.example.reading.presentation.viewmodel.ManageAccountViewModel", ((Provider) manageAccountViewModelProvider)).put("com.example.reading.presentation.viewmodel.ManagerStoryViewModel", ((Provider) managerStoryViewModelProvider)).put("com.example.reading.presentation.viewmodel.PostManagementViewModel", ((Provider) postManagementViewModelProvider)).put("com.example.reading.presentation.viewmodel.PostStoryViewModel", ((Provider) postStoryViewModelProvider)).put("com.example.reading.presentation.viewmodel.ProfileViewModel", ((Provider) profileViewModelProvider)).put("com.example.reading.presentation.view.RechargeViewModel", ((Provider) rechargeViewModelProvider)).put("com.example.reading.presentation.viewmodel.RegisterViewModel", ((Provider) registerViewModelProvider)).put("com.example.reading.presentation.viewmodel.SearchStoryViewModel", ((Provider) searchStoryViewModelProvider)).put("com.example.reading.presentation.viewmodel.SplashViewModel", ((Provider) splashViewModelProvider)).put("com.example.reading.presentation.viewmodel.StoryDetailViewModel", ((Provider) storyDetailViewModelProvider)).put("com.example.reading.presentation.viewmodel.StoryFavouriteViewModel", ((Provider) storyFavouriteViewModelProvider)).put("com.example.reading.presentation.viewmodel.StoryViewModel", ((Provider) storyViewModelProvider)).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.reading.presentation.viewmodel.AddAccountViewModel 
          return (T) new AddAccountViewModel(singletonCImpl.repository());

          case 1: // com.example.reading.presentation.viewmodel.BuyStoryViewModel 
          return (T) new BuyStoryViewModel(singletonCImpl.repository());

          case 2: // com.example.reading.presentation.viewmodel.EditProfileViewModel 
          return (T) new EditProfileViewModel(singletonCImpl.repository());

          case 3: // com.example.reading.presentation.view.HomeViewModel 
          return (T) new HomeViewModel(singletonCImpl.repository());

          case 4: // com.example.reading.presentation.viewmodel.LoginViewModel 
          return (T) new LoginViewModel(singletonCImpl.repository());

          case 5: // com.example.reading.presentation.viewmodel.MainViewModel 
          return (T) new MainViewModel(viewModelCImpl.getDataStoryUseCase(), singletonCImpl.repository());

          case 6: // com.example.reading.presentation.viewmodel.ManageAccountViewModel 
          return (T) new ManageAccountViewModel(singletonCImpl.repository());

          case 7: // com.example.reading.presentation.viewmodel.ManagerStoryViewModel 
          return (T) new ManagerStoryViewModel(singletonCImpl.repository());

          case 8: // com.example.reading.presentation.viewmodel.PostManagementViewModel 
          return (T) new PostManagementViewModel(singletonCImpl.repository());

          case 9: // com.example.reading.presentation.viewmodel.PostStoryViewModel 
          return (T) new PostStoryViewModel(singletonCImpl.repository());

          case 10: // com.example.reading.presentation.viewmodel.ProfileViewModel 
          return (T) new ProfileViewModel(singletonCImpl.repository());

          case 11: // com.example.reading.presentation.view.RechargeViewModel 
          return (T) new RechargeViewModel(singletonCImpl.repository());

          case 12: // com.example.reading.presentation.viewmodel.RegisterViewModel 
          return (T) new RegisterViewModel(singletonCImpl.repository());

          case 13: // com.example.reading.presentation.viewmodel.SearchStoryViewModel 
          return (T) new SearchStoryViewModel(singletonCImpl.repository());

          case 14: // com.example.reading.presentation.viewmodel.SplashViewModel 
          return (T) new SplashViewModel(singletonCImpl.repository());

          case 15: // com.example.reading.presentation.viewmodel.StoryDetailViewModel 
          return (T) new StoryDetailViewModel();

          case 16: // com.example.reading.presentation.viewmodel.StoryFavouriteViewModel 
          return (T) new StoryFavouriteViewModel(singletonCImpl.repository());

          case 17: // com.example.reading.presentation.viewmodel.StoryViewModel 
          return (T) new StoryViewModel(singletonCImpl.repository());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends App_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    private Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    private ActivityRetainedCImpl(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle 
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends App_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends App_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    private Provider<Retrofit> provideRetrofitProvider;

    private Provider<AppDatabase> provideAppDatabaseProvider;

    private SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    private OkHttpClient okHttpClient() {
      return ServiceModule_ProvideOkHttpClientFactory.provideOkHttpClient(ServiceModule_ProvideHttpLoggingInterceptorFactory.provideHttpLoggingInterceptor());
    }

    private AppService appService() {
      return ServiceModule_ProvideAppServiceFactory.provideAppService(provideRetrofitProvider.get());
    }

    private StoryDao storyDao() {
      return LocalModule_ProvideStoryDaoFactory.provideStoryDao(provideAppDatabaseProvider.get());
    }

    private StoryLocalDataSource storyLocalDataSource() {
      return new StoryLocalDataSource(storyDao());
    }

    private AppStorage appStorage() {
      return new AppStorage(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
    }

    private AppStorageLocalDataSource appStorageLocalDataSource() {
      return new AppStorageLocalDataSource(appStorage());
    }

    private Repository repository() {
      return ServiceModule_ProvideRepositoryFactory.provideRepository(appService(), storyLocalDataSource(), appStorageLocalDataSource());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 0));
      this.provideAppDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<AppDatabase>(singletonCImpl, 1));
    }

    @Override
    public void injectApp(App app) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // retrofit2.Retrofit 
          return (T) ServiceModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.okHttpClient());

          case 1: // com.example.reading.data.database.AppDatabase 
          return (T) LocalModule_ProvideAppDatabaseFactory.provideAppDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
