package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ok1 extends qm0 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f7829c;

    /* JADX INFO: renamed from: d */
    public final transient int f7830d;

    /* JADX INFO: renamed from: e */
    public final transient int f7831e;

    public ok1(Object[] objArr, int i, int i2) {
        this.f7829c = objArr;
        this.f7830d = i;
        this.f7831e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p32.m5183o(i, this.f7831e);
        Object obj = this.f7829c[(i * 2) + this.f7830d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7831e;
    }
}
