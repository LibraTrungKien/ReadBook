package com.example.reading.presentation.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/reading/presentation/view/adapter/CategoryControllerV2;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "", "itemOnClickListener", "Lcom/example/reading/presentation/view/adapter/ItemOnClickListener;", "(Lcom/example/reading/presentation/view/adapter/ItemOnClickListener;)V", "buildModels", "", "data", "Holder", "app_debug"})
public final class CategoryControllerV2 extends com.airbnb.epoxy.TypedEpoxyController<java.util.List<? extends java.lang.String>> {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.presentation.view.adapter.ItemOnClickListener itemOnClickListener = null;
    
    public CategoryControllerV2(@org.jetbrains.annotations.NotNull
    com.example.reading.presentation.view.adapter.ItemOnClickListener itemOnClickListener) {
        super();
    }
    
    @java.lang.Override
    protected void buildModels(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/reading/presentation/view/adapter/CategoryControllerV2$Holder;", "Lcom/example/reading/presentation/view/base/ViewBindingEpoxyModelWithHolder;", "Lcom/example/reading/databinding/ItemStoryNameBinding;", "itemOnClickListener", "Lcom/example/reading/presentation/view/adapter/ItemOnClickListener;", "category", "", "(Lcom/example/reading/presentation/view/adapter/ItemOnClickListener;Ljava/lang/String;)V", "bindView", "", "getCategory", "", "getDefaultLayout", "initializeView", "app_debug"})
    public static final class Holder extends com.example.reading.presentation.view.base.ViewBindingEpoxyModelWithHolder<com.example.reading.databinding.ItemStoryNameBinding> {
        @org.jetbrains.annotations.NotNull
        private final com.example.reading.presentation.view.adapter.ItemOnClickListener itemOnClickListener = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String category = null;
        
        public Holder(@org.jetbrains.annotations.NotNull
        com.example.reading.presentation.view.adapter.ItemOnClickListener itemOnClickListener, @org.jetbrains.annotations.NotNull
        java.lang.String category) {
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
        
        private final int getCategory(java.lang.String category) {
            return 0;
        }
    }
}