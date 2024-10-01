package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001c0\u001bJ\u0006\u0010\u001d\u001a\u00020\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/reading/presentation/viewmodel/RegisterViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "account", "Lcom/example/reading/domain/model/Account;", "getAccount", "()Lcom/example/reading/domain/model/Account;", "setAccount", "(Lcom/example/reading/domain/model/Account;)V", "againPassword", "", "code", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "checkDuplicate", "", "copyAgainPassword", "", "value", "copyEmail", "copyName", "copyPassword", "registerAccount", "Landroidx/lifecycle/LiveData;", "Lcom/example/reading/presentation/view/base/ApiResult;", "validateData", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    @org.jetbrains.annotations.NotNull
    private com.example.reading.domain.model.Account account;
    @org.jetbrains.annotations.NotNull
    private java.lang.String againPassword = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String code = "";
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
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
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void copyName(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void copyPassword(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void copyEmail(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void copyAgainPassword(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.reading.presentation.view.base.ApiResult<java.lang.Boolean>> registerAccount() {
        return null;
    }
    
    public final boolean validateData() {
        return false;
    }
    
    public final boolean checkDuplicate() {
        return false;
    }
}