package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: cy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0547cy {

    /* JADX INFO: renamed from: c */
    public int f2657c;

    /* JADX INFO: renamed from: d */
    public int f2658d;

    /* JADX INFO: renamed from: a */
    public final boolean f2655a = true;

    /* JADX INFO: renamed from: b */
    public final int f2656b = 65536;

    /* JADX INFO: renamed from: e */
    public int f2659e = 0;

    /* JADX INFO: renamed from: f */
    public C1468u5[] f2660f = new C1468u5[100];

    /* JADX INFO: renamed from: a */
    public final synchronized void m2136a(int i) {
        boolean z = i < this.f2657c;
        this.f2657c = i;
        if (z) {
            m2137b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2137b() {
        int iMax = Math.max(0, z42.m7231e(this.f2657c, this.f2656b) - this.f2658d);
        int i = this.f2659e;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.f2660f, iMax, i, (Object) null);
        this.f2659e = iMax;
    }
}
