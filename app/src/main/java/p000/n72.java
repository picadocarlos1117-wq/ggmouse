package p000;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n72 {
    /* JADX INFO: renamed from: a */
    public static int m4503a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4504b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    /* JADX INFO: renamed from: c */
    public static void m4505c(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }
}
