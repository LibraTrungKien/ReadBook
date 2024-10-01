package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020$J\u0006\u0010\u0010\u001a\u00020$J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020$J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00061"}, d2 = {"Lcom/example/reading/presentation/viewmodel/StoryViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "_authorLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/reading/domain/model/Account;", "_commentLiveData", "", "Lcom/example/reading/domain/model/Comment;", "_isRatedLiveData", "", "_rateLiveData", "", "account", "getAccount", "()Lcom/example/reading/domain/model/Account;", "setAccount", "(Lcom/example/reading/domain/model/Account;)V", "authorLiveData", "Landroidx/lifecycle/LiveData;", "getAuthorLiveData", "()Landroidx/lifecycle/LiveData;", "commentLiveData", "getCommentLiveData", "isRatedLiveData", "rateLiveData", "getRateLiveData", "story", "Lcom/example/reading/domain/model/Story;", "getStory", "()Lcom/example/reading/domain/model/Story;", "setStory", "(Lcom/example/reading/domain/model/Story;)V", "addComment", "", "content", "", "addFavourite", "getCommentById", "getInfoAuthor", "getRateByStory", "initializeArgument", "bundle", "Landroid/os/Bundle;", "isRated", "rateStory", "rate", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class StoryViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    public com.example.reading.domain.model.Story story;
    @org.jetbrains.annotations.NotNull
    private com.example.reading.domain.model.Account account;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.reading.domain.model.Comment>> _commentLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.reading.domain.model.Account> _authorLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _rateLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isRatedLiveData = null;
    
    @javax.inject.Inject
    public StoryViewModel(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.Repository repository) {
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
    public final com.example.reading.domain.model.Account getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Account p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.reading.domain.model.Comment>> getCommentLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.reading.domain.model.Account> getAuthorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getRateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isRatedLiveData() {
        return null;
    }
    
    public final void initializeArgument(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
    }
    
    public final void addFavourite() {
    }
    
    public final void addComment(@org.jetbrains.annotations.NotNull
    java.lang.String content) {
    }
    
    public final void getCommentById() {
    }
    
    public final void getInfoAuthor() {
    }
    
    public final void getAccount() {
    }
    
    public final void getRateByStory() {
    }
    
    public final void isRated() {
    }
    
    public final void rateStory(int rate) {
    }
}