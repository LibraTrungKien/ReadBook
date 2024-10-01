package com.example.reading.presentation.view.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0003J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006$"}, d2 = {"Lcom/example/reading/presentation/view/fragment/MainFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentMainBinding;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "controller", "Lcom/example/reading/presentation/view/adapter/CategoryController;", "viewModel", "Lcom/example/reading/presentation/viewmodel/MainViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindView", "", "bindViewAccount", "bindViewImageSlider", "bindViewImageUser", "image", "", "bindViewProgress", "isVisible", "", "createViewBinding", "initializeComponent", "initializeData", "initializeEvents", "manageStory", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "openManageAccountFragment", "openManageStory", "openPostStory", "showConfirmDialogLogout", "Companion", "app_debug"})
public final class MainFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentMainBinding> implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.reading.presentation.view.adapter.CategoryController controller;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.MainFragment.Companion Companion = null;
    
    public MainFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentMainBinding createViewBinding() {
        return null;
    }
    
    @java.lang.Override
    public void initializeComponent() {
    }
    
    @java.lang.Override
    public void initializeEvents() {
    }
    
    @java.lang.Override
    public void initializeData() {
    }
    
    @java.lang.Override
    public void bindView() {
    }
    
    private final void bindViewImageSlider() {
    }
    
    private final void bindViewImageUser(java.lang.String image) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void bindViewAccount() {
    }
    
    private final void bindViewProgress(boolean isVisible) {
    }
    
    @java.lang.Override
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void manageStory() {
    }
    
    private final void showConfirmDialogLogout() {
    }
    
    private final void openPostStory() {
    }
    
    private final void openManageAccountFragment() {
    }
    
    private final void openManageStory() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/reading/presentation/view/fragment/MainFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController) {
        }
    }
}