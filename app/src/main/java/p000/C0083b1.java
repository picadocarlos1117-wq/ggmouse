package p000;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: b1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0083b1 extends C0587e1 implements NavigableSet {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y61 f1121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083b1(y61 y61Var, NavigableMap navigableMap) {
        super(y61Var, navigableMap);
        this.f1121e = y61Var;
    }

    @Override // p000.C0587e1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo822a() {
        return (NavigableMap) ((SortedMap) this.f13210b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo822a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1648z0) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0083b1(this.f1121e, mo822a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo822a().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C0083b1(this.f1121e, mo822a().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo822a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo822a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C1574x0 c1574x0 = (C1574x0) iterator();
        if (!c1574x0.hasNext()) {
            return null;
        }
        Object next = c1574x0.next();
        c1574x0.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C0083b1(this.f1121e, mo822a().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C0083b1(this.f1121e, mo822a().tailMap(obj, z));
    }

    @Override // p000.C0587e1, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // p000.C0587e1, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p000.C0587e1, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
