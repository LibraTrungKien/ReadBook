package com.example.reading.presentation.view.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/reading/presentation/view/adapter/AuthorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/reading/presentation/view/adapter/AuthorAdapter$ViewHolder;", "()V", "images", "", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "ViewHolder", "app_debug"})
public final class AuthorAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.reading.presentation.view.adapter.AuthorAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> images;
    
    @javax.inject.Inject
    public AuthorAdapter() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.reading.presentation.view.adapter.AuthorAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.reading.presentation.view.adapter.AuthorAdapter.ViewHolder holder, int position) {
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> images) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/reading/presentation/view/adapter/AuthorAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/reading/databinding/ItemImageArthorBinding;", "(Lcom/example/reading/databinding/ItemImageArthorBinding;)V", "bindView", "", "image", "", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.reading.databinding.ItemImageArthorBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.reading.databinding.ItemImageArthorBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"CheckResult"})
        public final void bindView(@org.jetbrains.annotations.NotNull
        java.lang.String image) {
        }
    }
}