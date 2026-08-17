package p000;

import androidx.fragment.app.AbstractComponentCallbacksC0048l;
import androidx.fragment.app.C0061y;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l00 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6125a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f6126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6127c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6128d;

    public l00(gp0 gp0Var, cp0 cp0Var, boolean z) {
        this.f6128d = gp0Var;
        this.f6127c = cp0Var;
        this.f6126b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6125a;
        boolean z = this.f6126b;
        Object obj = this.f6127c;
        Object obj2 = this.f6128d;
        switch (i) {
            case 0:
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = ((C0061y) obj).f769c;
                AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l2 = ((C0061y) obj2).f769c;
                vf0 vf0Var = qf0.f9494a;
                if (!z) {
                    abstractComponentCallbacksC0048l.getEnterTransitionCallback();
                } else {
                    abstractComponentCallbacksC0048l2.getEnterTransitionCallback();
                }
                break;
            default:
                ((gp0) obj2).f4280t.m2155h((cp0) obj, z);
                break;
        }
    }

    public l00(C0061y c0061y, C0061y c0061y2, boolean z, C0633fa c0633fa) {
        this.f6127c = c0061y;
        this.f6128d = c0061y2;
        this.f6126b = z;
    }
}
