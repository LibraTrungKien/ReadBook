package com.example.reading.presentation.view.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/reading/presentation/view/fragment/ManageAccountFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentManageAccountBinding;", "()V", "controller", "Lcom/example/reading/presentation/view/adapter/AccountController;", "viewModel", "Lcom/example/reading/presentation/viewmodel/ManageAccountViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/ManageAccountViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createViewBinding", "handleDeleteAccount", "", "account", "Lcom/example/reading/domain/model/Account;", "initializeComponent", "initializeData", "initializeEvents", "loadData", "Companion", "app_debug"})
public final class ManageAccountFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentManageAccountBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.reading.presentation.view.adapter.AccountController controller;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.ManageAccountFragment.Companion Companion = null;
    
    public ManageAccountFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.ManageAccountViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentManageAccountBinding createViewBinding() {
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
    
    private final void loadData() {
    }
    
    private final void handleDeleteAccount(com.example.reading.domain.model.Account account) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/reading/presentation/view/fragment/ManageAccountFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController) {
        }
    }
}