package com.example.reading.data.locadatasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/reading/data/locadatasource/AppStorageLocalDataSource;", "", "appStorage", "Lcom/example/reading/data/sharedpreferences/AppStorage;", "(Lcom/example/reading/data/sharedpreferences/AppStorage;)V", "coroutineContext", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext$delegate", "Lkotlin/Lazy;", "getInfoAccount", "Lcom/example/reading/data/dto/AccountDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPermission", "", "removeAccount", "", "saveAccount", "accountDTO", "(Lcom/example/reading/data/dto/AccountDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppStorageLocalDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.data.sharedpreferences.AppStorage appStorage = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy coroutineContext$delegate = null;
    
    @javax.inject.Inject
    public AppStorageLocalDataSource(@org.jetbrains.annotations.NotNull
    com.example.reading.data.sharedpreferences.AppStorage appStorage) {
        super();
    }
    
    private final kotlinx.coroutines.CoroutineDispatcher getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.data.dto.AccountDTO accountDTO, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getInfoAccount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.data.dto.AccountDTO> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object removeAccount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPermission(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
}