package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: g1 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0661g1 extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a */
    public final Object f3939a;

    /* JADX INFO: renamed from: b */
    public Collection f3940b;

    /* JADX INFO: renamed from: c */
    public final C0661g1 f3941c;

    /* JADX INFO: renamed from: d */
    public final Collection f3942d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y61 f3943e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ y61 f3944f;

    public C0661g1(y61 y61Var, Object obj, List list, C0661g1 c0661g1) {
        this.f3944f = y61Var;
        this.f3943e = y61Var;
        this.f3939a = obj;
        this.f3940b = list;
        this.f3941c = c0661g1;
        this.f3942d = c0661g1 == null ? null : c0661g1.f3940b;
    }

    /* JADX INFO: renamed from: a */
    public final void m2881a() {
        C0661g1 c0661g1 = this.f3941c;
        if (c0661g1 != null) {
            c0661g1.m2881a();
        } else {
            this.f3943e.f12852d.put(this.f3939a, this.f3940b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2882b();
        boolean zIsEmpty = this.f3940b.isEmpty();
        boolean zAdd = this.f3940b.add(obj);
        if (zAdd) {
            this.f3943e.f12853e++;
            if (zIsEmpty) {
                m2881a();
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f3940b).addAll(i, collection);
        if (zAddAll) {
            this.f3944f.f12853e += this.f3940b.size() - size;
            if (size == 0) {
                m2881a();
            }
        }
        return zAddAll;
    }

    /* JADX INFO: renamed from: b */
    public final void m2882b() {
        Collection collection;
        C0661g1 c0661g1 = this.f3941c;
        if (c0661g1 != null) {
            c0661g1.m2882b();
            if (c0661g1.f3940b != this.f3942d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f3940b.isEmpty() || (collection = (Collection) this.f3943e.f12852d.get(this.f3939a)) == null) {
                return;
            }
            this.f3940b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f3940b.clear();
        this.f3943e.f12853e -= size;
        m2883e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m2882b();
        return this.f3940b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m2882b();
        return this.f3940b.containsAll(collection);
    }

    /* JADX INFO: renamed from: e */
    public final void m2883e() {
        C0661g1 c0661g1 = this.f3941c;
        if (c0661g1 != null) {
            c0661g1.m2883e();
        } else if (this.f3940b.isEmpty()) {
            this.f3943e.f12852d.remove(this.f3939a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m2882b();
        return this.f3940b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        m2882b();
        return ((List) this.f3940b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m2882b();
        return this.f3940b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m2882b();
        return ((List) this.f3940b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m2882b();
        return new C1574x0(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m2882b();
        return ((List) this.f3940b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m2882b();
        return new C0624f1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m2882b();
        boolean zRemove = this.f3940b.remove(obj);
        if (zRemove) {
            this.f3943e.f12853e--;
            m2883e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f3940b.removeAll(collection);
        if (zRemoveAll) {
            this.f3943e.f12853e += this.f3940b.size() - size;
            m2883e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f3940b.retainAll(collection);
        if (zRetainAll) {
            this.f3943e.f12853e += this.f3940b.size() - size;
            m2883e();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m2882b();
        return ((List) this.f3940b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m2882b();
        return this.f3940b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m2882b();
        List listSubList = ((List) this.f3940b).subList(i, i2);
        C0661g1 c0661g1 = this.f3941c;
        if (c0661g1 == null) {
            c0661g1 = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        y61 y61Var = this.f3944f;
        Object obj = this.f3939a;
        return z ? new C0119c1(y61Var, obj, listSubList, c0661g1) : new C0661g1(y61Var, obj, listSubList, c0661g1);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m2882b();
        return this.f3940b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m2882b();
        return new C0624f1(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m2882b();
        Object objRemove = ((List) this.f3940b).remove(i);
        this.f3944f.f12853e--;
        m2883e();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m2882b();
        boolean zIsEmpty = this.f3940b.isEmpty();
        ((List) this.f3940b).add(i, obj);
        this.f3944f.f12853e++;
        if (zIsEmpty) {
            m2881a();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f3940b.addAll(collection);
        if (zAddAll) {
            this.f3943e.f12853e += this.f3940b.size() - size;
            if (size == 0) {
                m2881a();
            }
        }
        return zAddAll;
    }
}
