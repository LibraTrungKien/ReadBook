package com.example.reading.data.sharedpreferences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/reading/data/sharedpreferences/AppStorage;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "editor$delegate", "Lkotlin/Lazy;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "getAccount", "Lcom/example/reading/data/dto/AccountDTO;", "getPermission", "", "removeAccount", "", "saveAccount", "accountDTO", "Companion", "app_debug"})
public final class AppStorage {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String name = "ACCOUNT";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sharedPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy editor$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.reading.data.sharedpreferences.AppStorage.Companion Companion = null;
    
    @javax.inject.Inject
    public AppStorage(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void saveAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.data.dto.AccountDTO accountDTO) {
    }
    
    public final int getPermission() {
        return 0;
    }
    
    public final void removeAccount() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.reading.data.dto.AccountDTO getAccount() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/reading/data/sharedpreferences/AppStorage$Companion;", "", "()V", "name", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}