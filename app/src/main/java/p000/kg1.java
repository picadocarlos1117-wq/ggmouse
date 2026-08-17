package p000;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kg1 implements ms0 {

    /* JADX INFO: renamed from: n */
    public static final kg1 f5797n = new kg1();

    /* JADX INFO: renamed from: a */
    public int f5798a;

    /* JADX INFO: renamed from: b */
    public int f5799b;

    /* JADX INFO: renamed from: e */
    public Handler f5802e;

    /* JADX INFO: renamed from: c */
    public boolean f5800c = true;

    /* JADX INFO: renamed from: d */
    public boolean f5801d = true;

    /* JADX INFO: renamed from: f */
    public final os0 f5803f = new os0(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC1430t4 f5804g = new RunnableC1430t4(this, 26);

    /* JADX INFO: renamed from: m */
    public final pn0 f5805m = new pn0(this);

    /* JADX INFO: renamed from: a */
    public final void m3827a() {
        int i = this.f5799b + 1;
        this.f5799b = i;
        if (i == 1) {
            if (this.f5800c) {
                this.f5803f.m5053e(ds0.ON_RESUME);
                this.f5800c = false;
            } else {
                Handler handler = this.f5802e;
                handler.getClass();
                handler.removeCallbacks(this.f5804g);
            }
        }
    }

    @Override // p000.ms0
    public final fs0 getLifecycle() {
        return this.f5803f;
    }
}
