package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00102\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/reading/presentation/viewmodel/ManagerStoryViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "_dataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/reading/domain/model/Story;", "account", "Lcom/example/reading/domain/model/Account;", "getAccount", "()Lcom/example/reading/domain/model/Account;", "setAccount", "(Lcom/example/reading/domain/model/Account;)V", "dataLiveData", "Landroidx/lifecycle/LiveData;", "getDataLiveData", "()Landroidx/lifecycle/LiveData;", "deleteStory", "Lcom/example/reading/presentation/view/base/ApiResult;", "", "story", "getStories", "initializeArgument", "bundle", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ManagerStoryViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.reading.domain.model.Story>> _dataLiveData = null;
    public com.example.reading.domain.model.Account account;
    
    @javax.inject.Inject
    public ManagerStoryViewModel(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.reading.domain.model.Story>> getDataLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.reading.domain.model.Account getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Account p0) {
    }
    
    public final void initializeArgument(@org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
    }
    
    public final void getStories() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.reading.presentation.view.base.ApiResult<kotlin.Unit>> deleteStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story) {
        return null;
    }
}