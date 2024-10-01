package com.example.reading.presentation.view;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/example/reading/presentation/view/Interactor;", "", "findNavController", "Landroidx/navigation/NavController;", "getFragment", "Landroidx/fragment/app/Fragment;", "getStory", "Lcom/example/reading/domain/model/Story;", "getViewModel", "Landroidx/lifecycle/ViewModel;", "isFromSearch", "", "app_debug"})
public abstract interface Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.navigation.NavController findNavController();
    
    public abstract boolean isFromSearch();
    
    @org.jetbrains.annotations.Nullable
    public abstract com.example.reading.domain.model.Story getStory();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.ViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.fragment.app.Fragment getFragment();
}