package com.example.reading.presentation.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J>\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000b0\n\"\u0004\b\u0000\u0010\f2\u001c\u0010\r\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/reading/presentation/view/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext$delegate", "Lkotlin/Lazy;", "callSafeApiWithLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/reading/presentation/view/base/ApiResult;", "T", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy coroutineContext$delegate = null;
    
    public BaseViewModel() {
        super();
    }
    
    private final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>androidx.lifecycle.LiveData<com.example.reading.presentation.view.base.ApiResult<T>> callSafeApiWithLiveData(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> call) {
        return null;
    }
}