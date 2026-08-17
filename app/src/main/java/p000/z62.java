package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z62 {
    /* JADX INFO: renamed from: a */
    public static bb2 m7254a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        bb2 bb2VarM960g = bb2.m960g(null, rootWindowInsets);
        ya2 ya2Var = bb2VarM960g.f1285a;
        ya2Var.mo6023p(bb2VarM960g);
        ya2Var.mo6017d(view.getRootView());
        return bb2VarM960g;
    }

    /* JADX INFO: renamed from: b */
    public static int m7255b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m7256c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m7257d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
