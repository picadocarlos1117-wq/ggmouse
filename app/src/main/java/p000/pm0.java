package p000;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 extends qm0 {

    /* JADX INFO: renamed from: c */
    public final transient int f8941c;

    /* JADX INFO: renamed from: d */
    public final transient int f8942d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qm0 f8943e;

    public pm0(qm0 qm0Var, int i, int i2) {
        this.f8943e = qm0Var;
        this.f8941c = i;
        this.f8942d = i2;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: e */
    public final Object[] mo3895e() {
        return this.f8943e.mo3895e();
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: f */
    public final int mo3896f() {
        return this.f8943e.mo3897h() + this.f8941c + this.f8942d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p32.m5183o(i, this.f8942d);
        return this.f8943e.get(i + this.f8941c);
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: h */
    public final int mo3897h() {
        return this.f8943e.mo3897h() + this.f8941c;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return true;
    }

    @Override // p000.qm0, p000.lm0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.qm0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8942d;
    }

    @Override // p000.qm0, java.util.List
    /* JADX INFO: renamed from: v */
    public final qm0 subList(int i, int i2) {
        p32.m5190u(i, i2, this.f8942d);
        int i3 = this.f8941c;
        return this.f8943e.subList(i + i3, i2 + i3);
    }

    @Override // p000.qm0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
