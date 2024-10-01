package com.example.reading.data.converter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bH\u0007J&\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/reading/data/converter/ChapterConverter;", "", "()V", "chapters2String", "", "chapters", "Ljava/util/ArrayList;", "Lcom/example/reading/domain/model/Chapter;", "Lkotlin/collections/ArrayList;", "string2Chapters", "data", "app_debug"})
public final class ChapterConverter {
    
    public ChapterConverter() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String chapters2String(@org.jetbrains.annotations.Nullable
    java.util.ArrayList<com.example.reading.domain.model.Chapter> chapters) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.util.ArrayList<com.example.reading.domain.model.Chapter> string2Chapters(@org.jetbrains.annotations.Nullable
    java.lang.String data) {
        return null;
    }
}