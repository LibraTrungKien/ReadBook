package com.example.reading.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u0016\u0010\u0010\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u0016\u0010\u0011\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/reading/domain/usecase/GetDataStoryUseCase;", "", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "data", "Ljava/util/ArrayList;", "Lcom/example/reading/presentation/model/StoryModelHolder;", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFairyTalesStories", "", "stories", "Lcom/example/reading/domain/model/Story;", "loadFairyTalesWorldStories", "loadFolkTaleStories", "loadGhostStories", "loadJokesStories", "loadNewStories", "app_debug"})
public final class GetDataStoryUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.reading.presentation.model.StoryModelHolder> data = null;
    
    @javax.inject.Inject
    public GetDataStoryUseCase(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.presentation.model.StoryModelHolder>> $completion) {
        return null;
    }
    
    private final void loadNewStories(java.util.List<com.example.reading.domain.model.Story> stories) {
    }
    
    private final void loadGhostStories(java.util.List<com.example.reading.domain.model.Story> stories) {
    }
    
    private final void loadFairyTalesWorldStories(java.util.List<com.example.reading.domain.model.Story> stories) {
    }
    
    private final void loadJokesStories(java.util.List<com.example.reading.domain.model.Story> stories) {
    }
    
    private final void loadFairyTalesStories(java.util.List<com.example.reading.domain.model.Story> stories) {
    }
    
    private final void loadFolkTaleStories(java.util.List<com.example.reading.domain.model.Story> stories) {
    }
}