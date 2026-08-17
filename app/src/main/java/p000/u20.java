package p000;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u20 {
    /* JADX INFO: renamed from: a */
    public static DisplayCutout m6373a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: b */
    public static List<Rect> m6374b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: c */
    public static int m6375c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: d */
    public static int m6376d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: e */
    public static int m6377e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: f */
    public static int m6378f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
