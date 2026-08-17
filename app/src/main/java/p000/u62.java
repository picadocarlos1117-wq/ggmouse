package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u62 {
    /* JADX INFO: renamed from: a */
    public static Rect m6390a(View view) {
        return view.getClipBounds();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6391b(View view) {
        return view.isInLayout();
    }

    /* JADX INFO: renamed from: c */
    public static void m6392c(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
