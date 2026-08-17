package p000;

import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nf0 {

    /* JADX INFO: renamed from: a */
    public static final mf0 f7396a = mf0.f6990a;

    /* JADX INFO: renamed from: a */
    public static mf0 m4539a(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l) {
        while (abstractComponentCallbacksC0048l != null) {
            if (abstractComponentCallbacksC0048l.isAdded()) {
                abstractComponentCallbacksC0048l.getParentFragmentManager().getClass();
            }
            abstractComponentCallbacksC0048l = abstractComponentCallbacksC0048l.getParentFragment();
        }
        return f7396a;
    }

    /* JADX INFO: renamed from: b */
    public static void m4540b(l82 l82Var) {
        if (AbstractC0056t.m363G(3)) {
            l82Var.f6264a.getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4541c(AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l, String str) {
        str.getClass();
        m4540b(new lf0(abstractComponentCallbacksC0048l, "Attempting to reuse fragment " + abstractComponentCallbacksC0048l + " with previous ID " + str));
        m4539a(abstractComponentCallbacksC0048l).getClass();
    }
}
