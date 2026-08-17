package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: da */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0560da implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0633fa f2831a;

    public C0560da(C0633fa c0633fa) {
        this.f2831a = c0633fa;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2831a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2831a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f2831a.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return this.f2831a.f13557c == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0633fa c0633fa = this.f2831a;
        int iHashCode = 0;
        for (int i = c0633fa.f13557c - 1; i >= 0; i--) {
            Object objM7350h = c0633fa.m7350h(i);
            iHashCode += objM7350h == null ? 0 : objM7350h.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2831a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0128ca(this.f2831a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0633fa c0633fa = this.f2831a;
        int iM7347e = c0633fa.m7347e(obj);
        if (iM7347e < 0) {
            return false;
        }
        c0633fa.m7351i(iM7347e);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0633fa c0633fa = this.f2831a;
        int i = c0633fa.f13557c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0633fa.remove(it.next());
        }
        return i != c0633fa.f13557c;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f2831a.m2779k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2831a.f13557c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0633fa c0633fa = this.f2831a;
        int i = c0633fa.f13557c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0633fa.m7350h(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f2831a.m2780l(0, objArr);
    }
}
