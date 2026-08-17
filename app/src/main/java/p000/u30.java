package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u30 {
    /* JADX INFO: renamed from: a */
    public static int m6379a(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m6380b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    /* JADX INFO: renamed from: c */
    public static Drawable m6381c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6382d(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: e */
    public static void m6383e(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }
}
