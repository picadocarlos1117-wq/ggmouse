package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kk1 extends qm0 {

    /* JADX INFO: renamed from: e */
    public static final kk1 f5896e = new kk1(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f5897c;

    /* JADX INFO: renamed from: d */
    public final transient int f5898d;

    public kk1(Object[] objArr, int i) {
        this.f5897c = objArr;
        this.f5898d = i;
    }

    @Override // p000.qm0, p000.lm0
    /* JADX INFO: renamed from: b */
    public final int mo2641b(int i, Object[] objArr) {
        Object[] objArr2 = this.f5897c;
        int i2 = this.f5898d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: e */
    public final Object[] mo3895e() {
        return this.f5897c;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: f */
    public final int mo3896f() {
        return this.f5898d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p32.m5183o(i, this.f5898d);
        Object obj = this.f5897c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: h */
    public final int mo3897h() {
        return 0;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5898d;
    }
}
