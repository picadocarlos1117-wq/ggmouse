package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends tm0 {

    /* JADX INFO: renamed from: d */
    public final transient pk1 f7438d;

    /* JADX INFO: renamed from: e */
    public final transient ok1 f7439e;

    public nk1(pk1 pk1Var, ok1 ok1Var) {
        this.f7438d = pk1Var;
        this.f7439e = ok1Var;
    }

    @Override // p000.tm0, p000.lm0
    /* JADX INFO: renamed from: a */
    public final qm0 mo2640a() {
        return this.f7439e;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: b */
    public final int mo2641b(int i, Object[] objArr) {
        return this.f7439e.mo2641b(i, objArr);
    }

    @Override // p000.lm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7438d.get(obj) != null;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return true;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: j */
    public final AbstractC0570dk iterator() {
        return this.f7439e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7438d.f8930f;
    }
}
