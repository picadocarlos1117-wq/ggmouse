package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl0 {
    /* JADX INFO: renamed from: a */
    public static Drawable m5857a(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    /* JADX INFO: renamed from: b */
    public static Icon m5858b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
