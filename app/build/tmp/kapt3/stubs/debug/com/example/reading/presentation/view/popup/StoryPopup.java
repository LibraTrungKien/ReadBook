package com.example.reading.presentation.view.popup;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/reading/presentation/view/popup/StoryPopup;", "Landroid/widget/PopupWindow;", "stories", "", "Lcom/example/reading/domain/model/Story;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "binding", "Lcom/example/reading/databinding/PopupStoriesBinding;", "controller", "Lcom/example/reading/presentation/view/adapter/StoryNameController;", "inflate", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflate", "()Landroid/view/LayoutInflater;", "inflate$delegate", "Lkotlin/Lazy;", "onItemClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "story", "", "initializeComponent", "Companion", "app_debug"})
public final class StoryPopup extends android.widget.PopupWindow {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.reading.domain.model.Story> stories = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private com.example.reading.databinding.PopupStoriesBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy inflate$delegate = null;
    private com.example.reading.presentation.view.adapter.StoryNameController controller;
    private kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> onItemClicked;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.view.popup.StoryPopup.Companion Companion = null;
    
    public StoryPopup(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.reading.domain.model.Story> stories, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    private final android.view.LayoutInflater getInflate() {
        return null;
    }
    
    private final void initializeComponent() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\r\u00a8\u0006\u0011"}, d2 = {"Lcom/example/reading/presentation/view/popup/StoryPopup$Companion;", "", "()V", "show", "", "stories", "", "Lcom/example/reading/domain/model/Story;", "context", "Landroid/content/Context;", "anchor", "Landroid/view/View;", "onItemClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "story", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void show(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.reading.domain.model.Story> stories, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.view.View anchor, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.reading.domain.model.Story, kotlin.Unit> onItemClicked) {
        }
    }
}