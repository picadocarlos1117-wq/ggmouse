package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC0066e;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q50 {

    /* JADX INFO: renamed from: a */
    public int f9390a;

    /* JADX INFO: renamed from: b */
    public final Object f9391b;

    /* JADX INFO: renamed from: c */
    public final Object f9392c;

    public q50(AbstractC0066e abstractC0066e) {
        this.f9390a = Integer.MIN_VALUE;
        this.f9392c = new Rect();
        this.f9391b = abstractC0066e;
    }

    /* JADX INFO: renamed from: a */
    public static q50 m5448a(AbstractC0066e abstractC0066e, int i) {
        if (i == 0) {
            return new fb1(abstractC0066e, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new fb1(abstractC0066e, i2);
        }
        f40.m2713i("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2785b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo2786c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo2787d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo2788e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo2789f();

    /* JADX INFO: renamed from: g */
    public abstract int mo2790g();

    /* JADX INFO: renamed from: h */
    public abstract int mo2791h();

    /* JADX INFO: renamed from: i */
    public abstract int mo2792i();

    /* JADX INFO: renamed from: j */
    public abstract int mo2793j();

    /* JADX INFO: renamed from: k */
    public abstract int mo2794k();

    /* JADX INFO: renamed from: l */
    public abstract int mo2795l();

    /* JADX INFO: renamed from: m */
    public abstract int mo2796m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo2797n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo2798o(int i);

    public q50(s50 s50Var) {
        this.f9390a = 0;
        this.f9392c = new C0658fz();
        this.f9391b = s50Var;
    }
}
