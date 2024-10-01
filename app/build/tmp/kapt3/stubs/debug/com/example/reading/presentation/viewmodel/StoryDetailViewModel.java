package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006 "}, d2 = {"Lcom/example/reading/presentation/viewmodel/StoryDetailViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "()V", "_dataLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/reading/domain/model/Chapter;", "currentChap", "getCurrentChap", "()Lcom/example/reading/domain/model/Chapter;", "setCurrentChap", "(Lcom/example/reading/domain/model/Chapter;)V", "currentIndex", "", "dataLiveData", "Landroidx/lifecycle/LiveData;", "getDataLiveData", "()Landroidx/lifecycle/LiveData;", "story", "Lcom/example/reading/domain/model/Story;", "getStory", "()Lcom/example/reading/domain/model/Story;", "setStory", "(Lcom/example/reading/domain/model/Story;)V", "initializeArguments", "", "bundle", "Landroid/os/Bundle;", "isEndChap", "", "isFirstChap", "nextChap", "previousChap", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class StoryDetailViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    public com.example.reading.domain.model.Story story;
    private int currentIndex = 1;
    public com.example.reading.domain.model.Chapter currentChap;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.reading.domain.model.Chapter> _dataLiveData;
    
    @javax.inject.Inject
    public StoryDetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.reading.domain.model.Story getStory() {
        return null;
    }
    
    public final void setStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.reading.domain.model.Chapter getCurrentChap() {
        return null;
    }
    
    public final void setCurrentChap(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Chapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.reading.domain.model.Chapter> getDataLiveData() {
        return null;
    }
    
    public final void initializeArguments(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
    }
    
    public final void nextChap() {
    }
    
    public final void previousChap() {
    }
    
    public final boolean isEndChap() {
        return false;
    }
    
    public final boolean isFirstChap() {
        return false;
    }
}