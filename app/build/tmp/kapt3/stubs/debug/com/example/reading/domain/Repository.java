package com.example.reading.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0018\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u001d\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u001f\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010 \u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010!\u001a\u00020\"H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010#\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010%\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\'\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00170*H&J\u0019\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010.\u001a\u00020\u001cH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J!\u00100\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0019\u00103\u001a\u00020\u00032\u0006\u00103\u001a\u000204H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0019\u00106\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u00107\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020:H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0019\u0010<\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0011\u0010=\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010?\u001a\u00020@H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ!\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ\u0019\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020GH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010H\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/example/reading/domain/Repository;", "", "addFavourite", "", "story", "Lcom/example/reading/domain/model/Story;", "(Lcom/example/reading/domain/model/Story;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addHistory", "", "deleteAccount", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavourite", "deleteHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStory", "deleteStoryFavourite", "editAccount", "Lcom/example/reading/domain/model/Account;", "account", "(Lcom/example/reading/domain/model/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllAccount", "", "fetchAllStory", "getAllStory", "getAllStoryNotApprove", "getCommentsByStoryId", "Lcom/example/reading/domain/model/Comment;", "storyId", "getHistory", "getInfoAccount", "getPermission", "getProductById", "Lcom/example/reading/domain/model/Products;", "getRateByStoryId", "getStoryByAuthor", "author", "getStoryByCategory", "category", "getStoryById", "getStoryFavourites", "Lkotlinx/coroutines/flow/Flow;", "getUserById", "userId", "insertComment", "comment", "(Lcom/example/reading/domain/model/Comment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRated", "authorId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/example/reading/domain/model/Login;", "(Lcom/example/reading/domain/model/Login;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postStory", "putStory", "rateStory", "rateDataModel", "Lcom/example/reading/domain/model/RateDataModel;", "(Lcom/example/reading/domain/model/RateDataModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerAccount", "removeAccount", "searchStoryByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProduct", "products", "(Lcom/example/reading/domain/model/Products;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "file", "Lokhttp3/MultipartBody$Part;", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Repository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Login login, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchAllStory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllStory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Story>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchStoryByName(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Story>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStoryByCategory(int category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Story>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addHistory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addFavourite(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteFavourite(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getHistory(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Story>> $completion);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.reading.domain.model.Story>> getStoryFavourites();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteStoryFavourite(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStoryByAuthor(int author, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Story>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object putStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object postStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getInfoAccount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.domain.model.Account> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeAccount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getPermission(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Story story, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Account account, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object fetchAllAccount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Account>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAccount(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object editAccount(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Account account, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.domain.model.Account> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductById(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.domain.model.Products> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Products products, int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.domain.model.Products> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getStoryById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.domain.model.Story> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertComment(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.Comment comment, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Comment>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCommentsByStoryId(int storyId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Comment>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllStoryNotApprove(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.reading.domain.model.Story>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserById(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.reading.domain.model.Account> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRateByStoryId(int storyId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object rateStory(@org.jetbrains.annotations.NotNull
    com.example.reading.domain.model.RateDataModel rateDataModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isRated(int storyId, int authorId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}