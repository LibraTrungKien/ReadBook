package com.example.reading.presentation.view.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/example/reading/presentation/view/fragment/PostStoryFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentPostStoryBinding;", "()V", "viewModel", "Lcom/example/reading/presentation/viewmodel/PostStoryViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/PostStoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindView", "", "bindViewImage", "image", "", "bindViewProgress", "isVisible", "", "clearData", "createViewBinding", "initializeData", "initializeEvents", "postStory", "putStory", "requestPermission", "showCategoryPopup", "anchor", "Landroid/view/View;", "showStoryPopup", "Companion", "app_debug"})
public final class PostStoryFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentPostStoryBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.PostStoryFragment.Companion Companion = null;
    
    public PostStoryFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.PostStoryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentPostStoryBinding createViewBinding() {
        return null;
    }
    
    @java.lang.Override
    public void initializeEvents() {
    }
    
    private final void requestPermission() {
    }
    
    private final void clearData() {
    }
    
    private final void showCategoryPopup(android.view.View anchor) {
    }
    
    @java.lang.Override
    public void initializeData() {
    }
    
    @java.lang.Override
    public void bindView() {
    }
    
    private final void bindViewProgress(boolean isVisible) {
    }
    
    private final void bindViewImage(java.lang.String image) {
    }
    
    private final void showStoryPopup(android.view.View anchor) {
    }
    
    private final void putStory() {
    }
    
    private final void postStory() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/reading/presentation/view/fragment/PostStoryFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController) {
        }
    }
}