package com.example.reading.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/reading/presentation/viewmodel/PostManagementViewModel;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lcom/example/reading/domain/Repository;", "(Lcom/example/reading/domain/Repository;)V", "_dataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/reading/domain/model/Story;", "dataLiveData", "Landroidx/lifecycle/LiveData;", "getDataLiveData", "()Landroidx/lifecycle/LiveData;", "getStoryNotYetApprove", "", "updateStatusStory", "story", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class PostManagementViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.reading.domain.Repository appRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.reading.domain.model.Story>> _dataLiveData = null;
    
    @javax.inject.Inject
    public PostManagementViewModel(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.Repository appRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.reading.domain.model.Story>> getDataLiveData() {
        return null;
    }
    
    public final void getStoryNotYetApprove() {
    }
    
    public final void updateStatusStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story) {
    }
}