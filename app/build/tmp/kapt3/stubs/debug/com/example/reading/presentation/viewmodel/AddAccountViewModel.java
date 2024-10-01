package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/reading/presentation/viewmodel/AddAccountViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "account", "Lcom/example/reading/domain/model/Account;", "getAccount", "()Lcom/example/reading/domain/model/Account;", "setAccount", "(Lcom/example/reading/domain/model/Account;)V", "againPassword", "", "checkPassword", "", "copyAgainPassword", "", "value", "copyDisplayName", "copyGmail", "copyPassword", "registerAccount", "Landroidx/lifecycle/LiveData;", "Lcom/example/reading/presentation/view/base/ApiResult;", "validateData", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AddAccountViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    private com.example.reading.domain.model.Account account;
    @org.jetbrains.annotations.NotNull
    private java.lang.String againPassword = "";
    
    @javax.inject.Inject
    public AddAccountViewModel(@org.jetbrains.annotations.NotNull
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
    
    public final void copyDisplayName(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void copyGmail(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void copyPassword(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void copyAgainPassword(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.reading.presentation.view.base.ApiResult<java.lang.Boolean>> registerAccount() {
        return null;
    }
    
    public final boolean checkPassword() {
        return false;
    }
    
    public final boolean validateData() {
        return false;
    }
}