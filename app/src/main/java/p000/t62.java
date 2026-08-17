package p000;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t62 {
    /* JADX INFO: renamed from: a */
    public static int m6237a() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: b */
    public static Display m6238b(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: c */
    public static int m6239c(View view) {
        return view.getLabelFor();
    }

    /* JADX INFO: renamed from: d */
    public static int m6240d(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: e */
    public static int m6241e(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: f */
    public static int m6242f(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6243g(View view) {
        return view.isPaddingRelative();
    }

    /* JADX INFO: renamed from: h */
    public static void m6244h(View view, int i) {
        view.setLabelFor(i);
    }

    /* JADX INFO: renamed from: i */
    public static void m6245i(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* JADX INFO: renamed from: j */
    public static void m6246j(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: k */
    public static void m6247k(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
