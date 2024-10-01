package com.example.reading.presentation.view.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0017J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/example/reading/presentation/view/fragment/StoryFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentStoryBinding;", "()V", "commentAdapter", "Lcom/example/reading/presentation/view/adapter/CommentAdapter;", "controller", "Lcom/example/reading/presentation/view/adapter/ChapterController;", "indexStar", "", "isSelected", "", "viewModel", "Lcom/example/reading/presentation/viewmodel/StoryViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/StoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindView", "", "checkStarRate", "index", "createViewBinding", "initializeComponent", "initializeData", "initializeEvents", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openStoryDetail", "Companion", "app_debug"})
public final class StoryFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentStoryBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.presentation.view.adapter.CommentAdapter commentAdapter = null;
    private com.example.reading.presentation.view.adapter.ChapterController controller;
    private int indexStar = 4;
    private boolean isSelected = false;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.StoryFragment.Companion Companion = null;
    
    public StoryFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.StoryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentStoryBinding createViewBinding() {
        return null;
    }
    
    @java.lang.Override
    public void initializeComponent() {
    }
    
    @java.lang.Override
    public void initializeEvents() {
    }
    
    private final void checkStarRate(int index) {
    }
    
    @java.lang.Override
    public void initializeData() {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public void bindView() {
    }
    
    private final void openStoryDetail() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/reading/presentation/view/fragment/StoryFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "story", "Lcom/example/reading/domain/model/Story;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
        com.example.reading.domain.model.Story story) {
        }
    }
}