package com.example.reading.presentation.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/reading/presentation/view/adapter/AccountController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcom/example/reading/domain/model/Account;", "onMenuClick", "Lcom/example/reading/presentation/view/adapter/OnMenuClick;", "(Lcom/example/reading/presentation/view/adapter/OnMenuClick;)V", "buildModels", "", "data", "Holder", "app_debug"})
public final class AccountController extends com.airbnb.epoxy.TypedEpoxyController<java.util.List<? extends com.example.reading.domain.model.Account>> {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.presentation.view.adapter.OnMenuClick onMenuClick = null;
    
    public AccountController(@org.jetbrains.annotations.NotNull
    com.example.reading.presentation.view.adapter.OnMenuClick onMenuClick) {
        super();
    }
    
    @java.lang.Override
    protected void buildModels(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.reading.domain.model.Account> data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/reading/presentation/view/adapter/AccountController$Holder;", "Lcom/example/reading/presentation/view/base/ViewBindingEpoxyModelWithHolder;", "Lcom/example/reading/databinding/ItemAccountBinding;", "onMenuClick", "Lcom/example/reading/presentation/view/adapter/OnMenuClick;", "account", "Lcom/example/reading/domain/model/Account;", "(Lcom/example/reading/presentation/view/adapter/OnMenuClick;Lcom/example/reading/domain/model/Account;)V", "bindView", "", "getDefaultLayout", "", "initializeView", "app_debug"})
    public static final class Holder extends com.example.reading.presentation.view.base.ViewBindingEpoxyModelWithHolder<com.example.reading.databinding.ItemAccountBinding> {
        @org.jetbrains.annotations.NotNull
        private final com.example.reading.presentation.view.adapter.OnMenuClick onMenuClick = null;
        @org.jetbrains.annotations.NotNull
        private final com.example.reading.domain.model.Account account = null;
        
        public Holder(@org.jetbrains.annotations.NotNull
        com.example.reading.presentation.view.adapter.OnMenuClick onMenuClick, @org.jetbrains.annotations.NotNull
        com.example.reading.domain.model.Account account) {
            super();
        }
        
        @java.lang.Override
        protected int getDefaultLayout() {
            return 0;
        }
        
        @java.lang.Override
        public void initializeView() {
        }
        
        @java.lang.Override
        public void bindView() {
        }
    }
}