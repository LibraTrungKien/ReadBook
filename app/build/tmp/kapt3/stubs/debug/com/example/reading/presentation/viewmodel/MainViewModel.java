package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010)\u001a\u00020\fJ\u0006\u0010$\u001a\u00020\fJ\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020+R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b\'\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/reading/presentation/viewmodel/MainViewModel;", "Lcom/example/reading/presentation/view/base/BaseViewModel;", "getDataStoryUseCase", "Lcom/example/reading/domain/usecase/GetDataStoryUseCase;", "repository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/usecase/GetDataStoryUseCase;Lcom/example/reading/domain/Repository;)V", "_dataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/reading/presentation/model/StoryModelHolder;", "_dataUserLiveData", "", "account", "Lcom/example/reading/domain/model/Account;", "getAccount", "()Lcom/example/reading/domain/model/Account;", "setAccount", "(Lcom/example/reading/domain/model/Account;)V", "dataLiveData", "Landroidx/lifecycle/LiveData;", "getDataLiveData", "()Landroidx/lifecycle/LiveData;", "dataUserLiveData", "getDataUserLiveData", "imageProfile", "", "getImageProfile", "()Ljava/lang/String;", "setImageProfile", "(Ljava/lang/String;)V", "images", "Ljava/util/ArrayList;", "Lcom/denzcoskun/imageslider/models/SlideModel;", "getImages", "()Ljava/util/ArrayList;", "isFirst", "", "()I", "setFirst", "(I)V", "isAdmin", "loadAd", "", "loadData", "loadDataUser", "logout", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends com.example.reading.presentation.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.usecase.GetDataStoryUseCase getDataStoryUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository repository = null;
    private int isFirst = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.denzcoskun.imageslider.models.SlideModel> images = null;
    public com.example.reading.domain.model.Account account;
    @org.jetbrains.annotations.NotNull
    private java.lang.String imageProfile = "";
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.reading.presentation.model.StoryModelHolder>> _dataLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataUserLiveData;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.usecase.GetDataStoryUseCase getDataStoryUseCase, @org.jetbrains.annotations.NotNull
    com.example.reading.domain.Repository repository) {
        super();
    }
    
    public final int isFirst() {
        return 0;
    }
    
    public final void setFirst(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.denzcoskun.imageslider.models.SlideModel> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.reading.domain.model.Account getAccount() {
        return null;
    }
    
    public final void setAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Account p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageProfile() {
        return null;
    }
    
    public final void setImageProfile(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.reading.presentation.model.StoryModelHolder>> getDataLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataUserLiveData() {
        return null;
    }
    
    public final void loadAd() {
    }
    
    public final void loadDataUser() {
    }
    
    public final void loadData() {
    }
    
    public final void logout() {
    }
    
    public final boolean isFirst() {
        return false;
    }
    
    public final boolean isAdmin() {
        return false;
    }
}