
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0015"}, d2 = {"LFileUtils;", "", "()V", "getDataColumn", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getRealPath", "fileUri", "getRealPathFromURI_API19", "isDownloadsDocument", "", "isExternalStorageDocument", "isGooglePhotosUri", "isMediaDocument", "app_debug"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull
    public static final FileUtils INSTANCE = null;
    
    private FileUtils() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRealPath(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri fileUri) {
        return null;
    }
    
    /**
     * Get a file path from a Uri. This will get the the path for Storage Access
     * Framework Documents, as well as the _data field for the MediaStore and
     * other file-based ContentProviders.
     *
     * @param context The context.
     * @param uri     The Uri to query.
     * @author paulburke
     */
    @android.annotation.SuppressLint(value = {"NewApi"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRealPathFromURI_API19(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    /**
     * Get the value of the data column for this Uri. This is useful for
     * MediaStore Uris, and other file-based ContentProviders.
     *
     * @param context       The context.
     * @param uri           The Uri to query.
     * @param selection     (Optional) Filter used in the query.
     * @param selectionArgs (Optional) Selection arguments used in the query.
     * @return The value of the _data column, which is typically a file path.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDataColumn(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.net.Uri uri, @org.jetbrains.annotations.Nullable
    java.lang.String selection, @org.jetbrains.annotations.Nullable
    java.lang.String[] selectionArgs) {
        return null;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    public final boolean isExternalStorageDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    public final boolean isDownloadsDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    public final boolean isMediaDocument(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is Google Photos.
     */
    public final boolean isGooglePhotosUri(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return false;
    }
}