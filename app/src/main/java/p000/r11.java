package p000;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r11 {
    /* JADX INFO: renamed from: a */
    public static Uri m5656a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* JADX INFO: renamed from: b */
    public static void m5657b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
