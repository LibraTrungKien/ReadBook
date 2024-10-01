package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/reading/presentation/viewmodel/SplashViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "_dataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "account", "Lcom/example/reading/domain/model/Account;", "getAccount", "()Lcom/example/reading/domain/model/Account;", "setAccount", "(Lcom/example/reading/domain/model/Account;)V", "dataLiveData", "Landroidx/lifecycle/LiveData;", "getDataLiveData", "()Landroidx/lifecycle/LiveData;", "getInfoAccount", "", "hasAccount", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SplashViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    public com.example.reading.domain.model.Account account;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLiveData = null;
    
    @javax.inject.Inject
    public SplashViewModel(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.reading.domain.model.Account getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Account p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLiveData() {
        return null;
    }
    
    public final void getInfoAccount() {
    }
    
    private final boolean hasAccount(com.example.reading.domain.model.Account account) {
        return false;
    }
}