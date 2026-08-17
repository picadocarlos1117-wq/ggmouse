package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class at0 extends AbstractC1092m1 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public Object[] f1040a;

    /* JADX INFO: renamed from: b */
    public final int f1041b;

    /* JADX INFO: renamed from: c */
    public int f1042c;

    /* JADX INFO: renamed from: d */
    public final at0 f1043d;

    /* JADX INFO: renamed from: e */
    public final bt0 f1044e;

    public at0(Object[] objArr, int i, int i2, at0 at0Var, bt0 bt0Var) {
        objArr.getClass();
        bt0Var.getClass();
        this.f1040a = objArr;
        this.f1041b = i;
        this.f1042c = i2;
        this.f1043d = at0Var;
        this.f1044e = bt0Var;
        ((AbstractList) this).modCount = ((AbstractList) bt0Var).modCount;
    }

    @Override // p000.AbstractC1092m1
    /* JADX INFO: renamed from: a */
    public final int mo701a() {
        m705i();
        return this.f1042c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m706j();
        m705i();
        int i2 = this.f1042c;
        if (i < 0 || i > i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        } else {
            m704h(this.f1041b + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m706j();
        m705i();
        int i2 = this.f1042c;
        if (i < 0 || i > i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        m703f(this.f1041b + i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC1092m1
    /* JADX INFO: renamed from: b */
    public final Object mo702b(int i) {
        m706j();
        m705i();
        int i2 = this.f1042c;
        if (i >= 0 && i < i2) {
            return m707k(this.f1041b + i);
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m706j();
        m705i();
        m708m(this.f1041b, this.f1042c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m705i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1040a;
            int i = this.f1042c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (hp0.m3214e(objArr[this.f1041b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m703f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        bt0 bt0Var = this.f1044e;
        at0 at0Var = this.f1043d;
        if (at0Var != null) {
            at0Var.m703f(i, collection, i2);
        } else {
            bt0 bt0Var2 = bt0.f1521d;
            bt0Var.m1047f(i, collection, i2);
        }
        this.f1040a = bt0Var.f1522a;
        this.f1042c += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m705i();
        int i2 = this.f1042c;
        if (i >= 0 && i < i2) {
            return this.f1040a[this.f1041b + i];
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m704h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        bt0 bt0Var = this.f1044e;
        at0 at0Var = this.f1043d;
        if (at0Var != null) {
            at0Var.m704h(i, obj);
        } else {
            bt0 bt0Var2 = bt0.f1521d;
            bt0Var.m1048h(i, obj);
        }
        this.f1040a = bt0Var.f1522a;
        this.f1042c++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m705i();
        Object[] objArr = this.f1040a;
        int i = this.f1042c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f1041b + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m705i() {
        if (((AbstractList) this.f1044e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m705i();
        for (int i = 0; i < this.f1042c; i++) {
            if (hp0.m3214e(this.f1040a[this.f1041b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m705i();
        return this.f1042c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m706j() {
        if (this.f1044e.f1524c) {
            lv1.m4291b();
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m707k(int i) {
        Object objM1051k;
        ((AbstractList) this).modCount++;
        at0 at0Var = this.f1043d;
        if (at0Var != null) {
            objM1051k = at0Var.m707k(i);
        } else {
            bt0 bt0Var = bt0.f1521d;
            objM1051k = this.f1044e.m1051k(i);
        }
        this.f1042c--;
        return objM1051k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m705i();
        for (int i = this.f1042c - 1; i >= 0; i--) {
            if (hp0.m3214e(this.f1040a[this.f1041b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m705i();
        int i2 = this.f1042c;
        if (i >= 0 && i <= i2) {
            return new zs0(this, i);
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m708m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        at0 at0Var = this.f1043d;
        if (at0Var != null) {
            at0Var.m708m(i, i2);
        } else {
            bt0 bt0Var = bt0.f1521d;
            this.f1044e.m1052m(i, i2);
        }
        this.f1042c -= i2;
    }

    /* JADX INFO: renamed from: n */
    public final int m709n(int i, int i2, Collection collection, boolean z) {
        int iM1053n;
        at0 at0Var = this.f1043d;
        if (at0Var != null) {
            iM1053n = at0Var.m709n(i, i2, collection, z);
        } else {
            bt0 bt0Var = bt0.f1521d;
            iM1053n = this.f1044e.m1053n(i, i2, collection, z);
        }
        if (iM1053n > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1042c -= iM1053n;
        return iM1053n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m706j();
        m705i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo702b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m706j();
        m705i();
        return m709n(this.f1041b, this.f1042c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m706j();
        m705i();
        return m709n(this.f1041b, this.f1042c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m706j();
        m705i();
        int i2 = this.f1042c;
        if (i < 0 || i >= i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.f1040a;
        int i3 = this.f1041b;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ki0.m3862f(i, i2, this.f1042c);
        return new at0(this.f1040a, this.f1041b + i, i2 - i, this, this.f1044e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        m705i();
        int length = objArr.length;
        int i = this.f1042c;
        Object[] objArr2 = this.f1040a;
        int i2 = this.f1041b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC1064la.m4154o0(objArr2, 0, objArr, i2, i + i2);
        int i3 = this.f1042c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m705i();
        return sc2.m6056a(this.f1040a, this.f1041b, this.f1042c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m706j();
        m705i();
        m704h(this.f1041b + this.f1042c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m705i();
        Object[] objArr = this.f1040a;
        int i = this.f1042c;
        int i2 = this.f1041b;
        int i3 = i + i2;
        objArr.getClass();
        AbstractC1337qm.m5541i(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m706j();
        m705i();
        int size = collection.size();
        m703f(this.f1041b + this.f1042c, collection, size);
        return size > 0;
    }
}
