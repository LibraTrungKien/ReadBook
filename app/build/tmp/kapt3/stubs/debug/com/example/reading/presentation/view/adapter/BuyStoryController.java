package com.example.reading.presentation.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010\n\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/reading/presentation/view/adapter/BuyStoryController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcom/example/reading/domain/model/Story;", "interactor", "Lcom/example/reading/presentation/view/adapter/BuyStoryController$Interactor;", "(Lcom/example/reading/presentation/view/adapter/BuyStoryController$Interactor;)V", "buildModel", "", "story", "buildModels", "data", "Interactor", "app_debug"})
public final class BuyStoryController extends com.airbnb.epoxy.TypedEpoxyController<java.util.List<? extends com.example.reading.domain.model.Story>> {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.presentation.view.adapter.BuyStoryController.Interactor interactor = null;
    
    public BuyStoryController(@org.jetbrains.annotations.NotNull
    com.example.reading.presentation.view.adapter.BuyStoryController.Interactor interactor) {
        super();
    }
    
    @java.lang.Override
    protected void buildModels(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.reading.domain.model.Story> data) {
    }
    
    private final void buildModel(com.example.reading.domain.model.Story story, com.example.reading.presentation.view.adapter.BuyStoryController.Interactor interactor) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/reading/presentation/view/adapter/BuyStoryController$Interactor;", "", "findNavController", "Landroidx/navigation/NavController;", "app_debug"})
    public static abstract interface Interactor {
        
        @org.jetbrains.annotations.NotNull
        public abstract androidx.navigation.NavController findNavController();
    }
}