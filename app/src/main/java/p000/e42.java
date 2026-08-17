package p000;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e42 extends AbstractList implements yr0, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final xr0 f3191a;

    public e42(xr0 xr0Var) {
        this.f3191a = xr0Var;
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: g */
    public final List mo2499g() {
        return Collections.unmodifiableList(this.f3191a.f12695b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f3191a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d42 d42Var = new d42();
        d42Var.f2783a = this.f3191a.iterator();
        return d42Var;
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: l */
    public final void mo2500l(AbstractC0753ik abstractC0753ik) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        c42 c42Var = new c42();
        c42Var.f1665a = this.f3191a.listIterator(i);
        return c42Var;
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: r */
    public final Object mo2502r(int i) {
        return this.f3191a.f12695b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3191a.f12695b.size();
    }

    @Override // p000.yr0
    /* JADX INFO: renamed from: o */
    public final yr0 mo2501o() {
        return this;
    }
}
