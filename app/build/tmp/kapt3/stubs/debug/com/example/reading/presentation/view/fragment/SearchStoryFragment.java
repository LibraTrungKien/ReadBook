package com.example.reading.presentation.view.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/example/reading/presentation/view/fragment/SearchStoryFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentSearchStoryBinding;", "()V", "controller", "Lcom/example/reading/presentation/view/adapter/StoryController;", "viewModel", "Lcom/example/reading/presentation/viewmodel/SearchStoryViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/SearchStoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindViewResult", "", "result", "", "(Ljava/lang/Integer;)V", "createViewBinding", "initializeComponent", "initializeData", "initializeEvents", "Companion", "app_debug"})
public final class SearchStoryFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentSearchStoryBinding> {
    private com.example.reading.presentation.view.adapter.StoryController controller;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.SearchStoryFragment.Companion Companion = null;
    
    public SearchStoryFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.SearchStoryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentSearchStoryBinding createViewBinding() {
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
    
    private final void bindViewResult(java.lang.Integer result) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/reading/presentation/view/fragment/SearchStoryFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController) {
        }
    }
}