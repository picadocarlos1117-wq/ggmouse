package p000;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class du0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a */
    public final List f3012a;

    /* JADX INFO: renamed from: b */
    public final yg0 f3013b;

    public du0(List list, yg0 yg0Var) {
        list.getClass();
        this.f3012a = list;
        this.f3013b = yg0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3012a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new bu0(this, this.f3012a.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.f3012a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3012a.size();
    }
}
