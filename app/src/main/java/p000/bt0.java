package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bt0 extends AbstractC1092m1 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d */
    public static final bt0 f1521d;

    /* JADX INFO: renamed from: a */
    public Object[] f1522a;

    /* JADX INFO: renamed from: b */
    public int f1523b;

    /* JADX INFO: renamed from: c */
    public boolean f1524c;

    static {
        bt0 bt0Var = new bt0(0);
        bt0Var.f1524c = true;
        f1521d = bt0Var;
    }

    public bt0(int i) {
        if (i >= 0) {
            this.f1522a = new Object[i];
        } else {
            f40.m2713i("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // p000.AbstractC1092m1
    /* JADX INFO: renamed from: a */
    public final int mo701a() {
        return this.f1523b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m1049i();
        int i2 = this.f1523b;
        if (i < 0 || i > i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m1050j(i, 1);
        this.f1522a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m1049i();
        int i2 = this.f1523b;
        if (i < 0 || i > i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return false;
        }
        int size = collection.size();
        m1047f(i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC1092m1
    /* JADX INFO: renamed from: b */
    public final Object mo702b(int i) {
        m1049i();
        int i2 = this.f1523b;
        if (i >= 0 && i < i2) {
            return m1051k(i);
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m1049i();
        m1052m(0, this.f1523b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1522a;
            int i = this.f1523b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (hp0.m3214e(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m1047f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m1050j(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1522a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f1523b;
        if (i >= 0 && i < i2) {
            return this.f1522a[i];
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m1048h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m1050j(i, 1);
        this.f1522a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f1522a;
        int i = this.f1523b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m1049i() {
        if (this.f1524c) {
            lv1.m4291b();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f1523b; i++) {
            if (hp0.m3214e(this.f1522a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1523b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final void m1050j(int i, int i2) {
        int i3 = this.f1523b + i2;
        if (i3 < 0) {
            ca0.m1173e();
            return;
        }
        Object[] objArr = this.f1522a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f1522a = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f1522a;
        AbstractC1064la.m4154o0(objArr2, i + i2, objArr2, i, this.f1523b);
        this.f1523b += i2;
    }

    /* JADX INFO: renamed from: k */
    public final Object m1051k(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f1522a;
        Object obj = objArr[i];
        AbstractC1064la.m4154o0(objArr, i, objArr, i + 1, this.f1523b);
        Object[] objArr2 = this.f1522a;
        int i2 = this.f1523b - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f1523b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f1523b - 1; i >= 0; i--) {
            if (hp0.m3214e(this.f1522a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f1523b;
        if (i >= 0 && i <= i2) {
            return new zs0(this, i);
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m1052m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f1522a;
        AbstractC1064la.m4154o0(objArr, i, objArr, i + i2, this.f1523b);
        Object[] objArr2 = this.f1522a;
        int i3 = this.f1523b;
        sc2.m6047R(objArr2, i3 - i2, i3);
        this.f1523b -= i2;
    }

    /* JADX INFO: renamed from: n */
    public final int m1053n(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f1522a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f1522a;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC1064la.m4154o0(objArr, i + i4, objArr, i2 + i, this.f1523b);
        Object[] objArr3 = this.f1522a;
        int i7 = this.f1523b;
        sc2.m6047R(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1523b -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m1049i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo702b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m1049i();
        return m1053n(0, this.f1523b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m1049i();
        return m1053n(0, this.f1523b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1049i();
        int i2 = this.f1523b;
        if (i < 0 || i >= i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return null;
        }
        Object[] objArr = this.f1522a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        ki0.m3862f(i, i2, this.f1523b);
        return new at0(this.f1522a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f1523b;
        Object[] objArr2 = this.f1522a;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC1064la.m4154o0(objArr2, 0, objArr, 0, i);
        int i2 = this.f1523b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return sc2.m6056a(this.f1522a, 0, this.f1523b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1049i();
        int i = this.f1523b;
        ((AbstractList) this).modCount++;
        m1050j(i, 1);
        this.f1522a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f1522a;
        int i = this.f1523b;
        objArr.getClass();
        AbstractC1337qm.m5541i(i, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m1049i();
        int size = collection.size();
        m1047f(this.f1523b, collection, size);
        return size > 0;
    }
}
