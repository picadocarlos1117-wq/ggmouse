package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 extends kr1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f5994a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f5994a.iterator();
        it.getClass();
        sf1 sf1Var = this.f5995b;
        sf1Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (sf1Var.apply(next)) {
                return next;
            }
        }
        ca0.m1185q();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new lr1(((SortedSet) this.f5994a).headSet(obj), this.f5995b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f5994a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f5995b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new lr1(((SortedSet) this.f5994a).subSet(obj, obj2), this.f5995b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new lr1(((SortedSet) this.f5994a).tailSet(obj), this.f5995b);
    }
}
