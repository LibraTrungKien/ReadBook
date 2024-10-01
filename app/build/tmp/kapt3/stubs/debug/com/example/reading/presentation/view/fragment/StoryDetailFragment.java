package com.example.reading.presentation.view.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/example/reading/presentation/view/fragment/StoryDetailFragment;", "Lcom/example/reading/presentation/view/base/BaseFragment;", "Lcom/example/reading/databinding/FragmentStoryDetailBinding;", "()V", "viewModel", "Lcom/example/reading/presentation/viewmodel/StoryDetailViewModel;", "getViewModel", "()Lcom/example/reading/presentation/viewmodel/StoryDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindView", "", "bindViewContent", "chapter", "Lcom/example/reading/domain/model/Chapter;", "bindViewImageChap", "bindViewNext", "bindViewPrevious", "bindViewTitle", "createViewBinding", "initializeEvents", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class StoryDetailFragment extends com.example.reading.presentation.view.base.BaseFragment<com.example.reading.databinding.FragmentStoryDetailBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.fragment.StoryDetailFragment.Companion Companion = null;
    
    public StoryDetailFragment() {
        super();
    }
    
    private final com.example.reading.presentation.viewmodel.StoryDetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.databinding.FragmentStoryDetailBinding createViewBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void initializeEvents() {
    }
    
    @java.lang.Override
    public void bindView() {
    }
    
    private final void bindViewTitle(com.example.reading.domain.model.Chapter chapter) {
    }
    
    private final void bindViewContent(com.example.reading.domain.model.Chapter chapter) {
    }
    
    private final void bindViewImageChap(com.example.reading.domain.model.Chapter chapter) {
    }
    
    private final void bindViewNext() {
    }
    
    private final void bindViewPrevious() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/reading/presentation/view/fragment/StoryDetailFragment$Companion;", "", "()V", "open", "", "navController", "Landroidx/navigation/NavController;", "story", "Lcom/example/reading/domain/model/Story;", "index", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void open(@org.jetbrains.annotations.NotNull
        androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
        com.example.reading.domain.model.Story story, int index) {
        }
    }
}