package p000;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1426t0 extends AbstractC1463u0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC1463u0 f10663a;

    /* JADX INFO: renamed from: b */
    public final int f10664b;

    /* JADX INFO: renamed from: c */
    public final int f10665c;

    public C1426t0(AbstractC1463u0 abstractC1463u0, int i, int i2) {
        this.f10663a = abstractC1463u0;
        this.f10664b = i;
        ki0.m3862f(i, i2, abstractC1463u0.mo6170a());
        this.f10665c = i2 - i;
    }

    @Override // p000.AbstractC1463u0
    /* JADX INFO: renamed from: a */
    public final int mo6170a() {
        return this.f10665c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f10665c;
        if (i < 0 || i >= i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return null;
        }
        return this.f10663a.get(this.f10664b + i);
    }

    @Override // p000.AbstractC1463u0, java.util.List
    public final List subList(int i, int i2) {
        ki0.m3862f(i, i2, this.f10665c);
        int i3 = this.f10664b;
        return new C1426t0(this.f10663a, i + i3, i3 + i2);
    }
}
