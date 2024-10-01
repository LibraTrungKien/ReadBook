package com.example.reading.presentation.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/reading/presentation/model/Category;", "", "Companion", "app_debug"})
public abstract interface Category {
    public static final int GHOST = 0;
    public static final int FAIRY_TALES = 1;
    public static final int JOKES = 2;
    public static final int FAIRY_TALES_VI = 3;
    public static final int FOLK_TALE = 4;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.presentation.model.Category.Companion Companion = null;
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/reading/presentation/model/Category$Companion;", "", "()V", "FAIRY_TALES", "", "FAIRY_TALES_VI", "FOLK_TALE", "GHOST", "JOKES", "getName", "", "category", "app_debug"})
    public static final class Companion {
        public static final int GHOST = 0;
        public static final int FAIRY_TALES = 1;
        public static final int JOKES = 2;
        public static final int FAIRY_TALES_VI = 3;
        public static final int FOLK_TALE = 4;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName(int category) {
            return null;
        }
    }
}