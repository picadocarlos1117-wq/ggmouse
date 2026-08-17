package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g82 {

    /* JADX INFO: renamed from: a */
    public static final i82 f4100a;

    /* JADX INFO: renamed from: b */
    public static final C1076lm f4101b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4100a = new j82();
        } else {
            f4100a = new i82();
        }
        f4101b = new C1076lm("translationAlpha", 5, Float.class);
        new C1076lm("clipBounds", 6, Rect.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m2942a(View view, int i, int i2, int i3, int i4) {
        f4100a.mo3389p0(view, i, i2, i3, i4);
    }
}
