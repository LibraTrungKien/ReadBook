package com.example.reading.presentation.view.custom;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010J\u0014\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0010R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/reading/presentation/view/custom/MyToolbar;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionIndex", "binding", "Lcom/example/reading/databinding/ToolbarCustomBinding;", "bindViewAction", "", "setOnActionClick", "onActionClick", "Lkotlin/Function0;", "setOnNavigationClick", "onNavigationClicked", "ActionIcon", "app_debug"})
public final class MyToolbar extends androidx.appcompat.widget.Toolbar {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.databinding.ToolbarCustomBinding binding = null;
    private final int actionIndex = 0;
    
    @kotlin.jvm.JvmOverloads
    public MyToolbar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void bindViewAction() {
    }
    
    public final void setOnNavigationClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigationClicked) {
    }
    
    public final void setOnActionClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onActionClick) {
    }
    
    @kotlin.jvm.JvmOverloads
    public MyToolbar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/reading/presentation/view/custom/MyToolbar$ActionIcon;", "", "(Ljava/lang/String;I)V", "SETTING", "DONE", "app_debug"})
    public static enum ActionIcon {
        /*public static final*/ SETTING /* = new SETTING() */,
        /*public static final*/ DONE /* = new DONE() */;
        
        ActionIcon() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.example.reading.presentation.view.custom.MyToolbar.ActionIcon> getEntries() {
            return null;
        }
    }
}