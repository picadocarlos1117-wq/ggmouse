package p000;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lk1 extends qm0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mk1 f6383c;

    public lk1(mk1 mk1Var) {
        this.f6383c = mk1Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mk1 mk1Var = this.f6383c;
        p32.m5183o(i, mk1Var.f7032f);
        Object[] objArr = mk1Var.f7031e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6383c.f7032f;
    }
}
