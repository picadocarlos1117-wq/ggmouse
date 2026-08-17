package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kl1 {
    /* JADX INFO: renamed from: a */
    public static Drawable m3898a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m3899b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
