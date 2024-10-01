package com.example.reading.presentation.view.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/example/reading/presentation/view/fragment/ManagerStoryFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentManagerStoryBinding;", "()V", "controller", "Lcom/example/reading/presentation/view/adapter/ManagerStoryController;", "viewModel", "Lcom/example/reading/presentation/viewmodel/ManagerStoryViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/ManagerStoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindView", "", "bindViewProgress", "isVisible", "", "createViewBinding", "deleteStory", "story", "Lcom/example/reading/domain/model/Story;", "handleDelete", "initializeComponent", "initializeData", "initializeEvents", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ManagerStoryFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentManagerStoryBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.reading.presentation.view.adapter.ManagerStoryController controller;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.ManagerStoryFragment.Companion Companion = null;
    
    public ManagerStoryFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.ManagerStoryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentManagerStoryBinding createViewBinding() {
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
    
    private final void bindViewProgress(boolean isVisible) {
    }
    
    private final void deleteStory(com.example.reading.domain.model.Story story) {
    }
    
    private final void handleDelete(com.example.reading.domain.model.Story story) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/reading/presentation/view/fragment/ManagerStoryFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "account", "Lcom/example/reading/domain/model/Account;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
        com.example.reading.domain.model.Account account) {
        }
    }
}