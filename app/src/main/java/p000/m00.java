package p000;

import android.transition.Transition;
import androidx.fragment.app.AbstractC0041e;
import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import androidx.fragment.app.C0061y;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 extends AbstractC0041e {

    /* JADX INFO: renamed from: c */
    public final Object f6576c;

    /* JADX INFO: renamed from: d */
    public final boolean f6577d;

    /* JADX INFO: renamed from: e */
    public final Object f6578e;

    public m00(C0061y c0061y, C1112ml c1112ml, boolean z, boolean z2) {
        super(c0061y, c1112ml);
        int i = c0061y.f767a;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0061y.f769c;
        if (i == 2) {
            this.f6576c = z ? abstractComponentCallbacksC0048l.getReenterTransition() : abstractComponentCallbacksC0048l.getEnterTransition();
            this.f6577d = z ? abstractComponentCallbacksC0048l.getAllowReturnTransitionOverlap() : abstractComponentCallbacksC0048l.getAllowEnterTransitionOverlap();
        } else {
            this.f6576c = z ? abstractComponentCallbacksC0048l.getReturnTransition() : abstractComponentCallbacksC0048l.getExitTransition();
            this.f6577d = true;
        }
        if (!z2) {
            this.f6578e = null;
        } else if (z) {
            this.f6578e = abstractComponentCallbacksC0048l.getSharedElementReturnTransition();
        } else {
            this.f6578e = abstractComponentCallbacksC0048l.getSharedElementEnterTransition();
        }
    }

    /* JADX INFO: renamed from: c */
    public final xf0 m4341c(Object obj) {
        if (obj == null) {
            return null;
        }
        vf0 vf0Var = qf0.f9494a;
        if (obj instanceof Transition) {
            return vf0Var;
        }
        xf0 xf0Var = qf0.f9495b;
        if (xf0Var != null && xf0Var.mo977e(obj)) {
            return xf0Var;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = this.f680a.f769c;
        sb.append(" for fragment ");
        sb.append(abstractComponentCallbacksC0048l);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
