package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class et1 extends tm0 {

    /* JADX INFO: renamed from: d */
    public final transient Object f3439d;

    public et1(Object obj) {
        obj.getClass();
        this.f3439d = obj;
    }

    @Override // p000.tm0, p000.lm0
    /* JADX INFO: renamed from: a */
    public final qm0 mo2640a() {
        return qm0.m5570t(this.f3439d);
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: b */
    public final int mo2641b(int i, Object[] objArr) {
        objArr[i] = this.f3439d;
        return i + 1;
    }

    @Override // p000.lm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3439d.equals(obj);
    }

    @Override // p000.tm0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f3439d.hashCode();
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: i */
    public final boolean mo2642i() {
        return false;
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: j */
    public final AbstractC0570dk iterator() {
        return new xp0(this.f3439d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f3439d.toString() + ']';
    }
}
