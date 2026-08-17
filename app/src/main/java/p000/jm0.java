package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jm0 {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m3669a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m3670b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m3671c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m3672d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
