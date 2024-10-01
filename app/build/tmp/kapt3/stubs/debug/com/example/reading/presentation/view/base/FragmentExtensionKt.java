package com.example.reading.presentation.view.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001az\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2#\u0010\t\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u0001H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2\'\b\u0002\u0010\u000e\u001a!\u0012\u0017\u0012\u00150\u000fj\u0002`\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\n\u001a\"\u0010\u0013\u001a\u00020\u0001*\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017\u00a8\u0006\u0018"}, d2 = {"apiCall", "", "T", "Landroidx/fragment/app/Fragment;", "liveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/reading/presentation/view/base/ApiResult;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "onError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "handleException", "throwable", "", "onButtonClicked", "Lkotlin/Function0;", "app_debug"})
public final class FragmentExtensionKt {
    
    public static final <T extends java.lang.Object>void apiCall(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$apiCall, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.example.reading.presentation.view.base.ApiResult<T>> liveData, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Exception, java.lang.Boolean> onError) {
    }
    
    public static final void handleException(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$handleException, @org.jetbrains.annotations.Nullable
    java.lang.Throwable throwable, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClicked) {
    }
}