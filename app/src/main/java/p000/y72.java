package p000;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y72 {
    /* JADX INFO: renamed from: a */
    public static boolean m7030a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7031b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static void m7032c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m7033d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    public static void m7034e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7035f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* JADX INFO: renamed from: g */
    public static void m7036g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
