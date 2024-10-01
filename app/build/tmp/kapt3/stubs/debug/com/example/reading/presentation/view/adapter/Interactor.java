package com.example.reading.presentation.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/reading/presentation/view/adapter/Interactor;", "", "deleteStory", "", "story", "Lcom/example/reading/domain/model/Story;", "getNavController", "Landroidx/navigation/NavController;", "app_debug"})
public abstract interface Interactor {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.navigation.NavController getNavController();
    
    public abstract void deleteStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story);
}