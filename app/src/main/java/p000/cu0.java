package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final List f2625a;

    /* JADX INFO: renamed from: b */
    public final yg0 f2626b;

    public cu0(List list, yg0 yg0Var) {
        list.getClass();
        this.f2625a = list;
        this.f2626b = yg0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f2626b.apply(this.f2625a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2625a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new bu0(this, this.f2625a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f2626b.apply(this.f2625a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f2625a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2625a.size();
    }
}
