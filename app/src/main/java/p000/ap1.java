package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ap1 implements ks0, Closeable {

    /* JADX INFO: renamed from: a */
    public final String f1016a;

    /* JADX INFO: renamed from: b */
    public final zo1 f1017b;

    /* JADX INFO: renamed from: c */
    public boolean f1018c;

    public ap1(String str, zo1 zo1Var) {
        this.f1016a = str;
        this.f1017b = zo1Var;
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        if (ds0Var == ds0.ON_DESTROY) {
            this.f1018c = false;
            ms0Var.getLifecycle().mo2849b(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m697d(hp1 hp1Var, fs0 fs0Var) {
        hp1Var.getClass();
        fs0Var.getClass();
        if (this.f1018c) {
            f40.m2719o("Already attached to lifecycleOwner");
            return;
        }
        this.f1018c = true;
        fs0Var.mo2848a(this);
        hp1Var.m3235c(this.f1016a, this.f1017b.f13511e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
