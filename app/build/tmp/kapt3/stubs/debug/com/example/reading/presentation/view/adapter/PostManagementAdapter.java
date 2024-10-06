package com.example.reading.presentation.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u00102\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014\u00a8\u0006%"}, d2 = {"Lcom/example/reading/presentation/view/adapter/PostManagementAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/reading/presentation/view/adapter/PostManagementAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "Lcom/example/reading/domain/model/Story;", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "onApproveClicked", "Lkotlin/Function1;", "", "getOnApproveClicked", "()Lkotlin/jvm/functions/Function1;", "setOnApproveClicked", "(Lkotlin/jvm/functions/Function1;)V", "onDeclineClicked", "getOnDeclineClicked", "setOnDeclineClicked", "onItemClicked", "getOnItemClicked", "setOnItemClicked", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class PostManagementAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.reading.presentation.view.adapter.PostManagementAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> onApproveClicked;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> onDeclineClicked;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> onItemClicked;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.reading.domain.model.Story> data;
    
    public PostManagementAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.reading.domain.model.Story, kotlin.Unit> getOnApproveClicked() {
        return null;
    }
    
    public final void setOnApproveClicked(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.reading.domain.model.Story, kotlin.Unit> getOnDeclineClicked() {
        return null;
    }
    
    public final void setOnDeclineClicked(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.reading.domain.model.Story, kotlin.Unit> getOnItemClicked() {
        return null;
    }
    
    public final void setOnItemClicked(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.reading.domain.model.Story> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.reading.domain.model.Story> value) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.presentation.view.adapter.PostManagementAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.reading.presentation.view.adapter.PostManagementAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/reading/presentation/view/adapter/PostManagementAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/reading/databinding/ItemPostBinding;", "(Lcom/example/reading/presentation/view/adapter/PostManagementAdapter;Lcom/example/reading/databinding/ItemPostBinding;)V", "bindView", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.reading.databinding.ItemPostBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.reading.databinding.ItemPostBinding binding) {
            super(null);
        }
        
        public final void bindView() {
        }
    }
}