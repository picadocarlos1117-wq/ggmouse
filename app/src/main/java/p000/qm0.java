package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qm0 extends lm0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final om0 f9540b = new om0(kk1.f5896e, 0);

    /* JADX INFO: renamed from: k */
    public static kk1 m5565k(int i, Object[] objArr) {
        return i == 0 ? kk1.f5896e : new kk1(objArr, i);
    }

    /* JADX INFO: renamed from: m */
    public static nm0 m5566m() {
        return new nm0(4);
    }

    /* JADX INFO: renamed from: n */
    public static qm0 m5567n(Collection collection) {
        if (!(collection instanceof lm0)) {
            Object[] array = collection.toArray();
            o21.m4665k(array.length, array);
            return m5565k(array.length, array);
        }
        qm0 qm0VarMo2640a = ((lm0) collection).mo2640a();
        if (!qm0VarMo2640a.mo2642i()) {
            return qm0VarMo2640a;
        }
        Object[] array2 = qm0VarMo2640a.toArray(lm0.f6386a);
        return m5565k(array2.length, array2);
    }

    /* JADX INFO: renamed from: p */
    public static kk1 m5568p(Object[] objArr) {
        if (objArr.length == 0) {
            return kk1.f5896e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        o21.m4665k(objArr2.length, objArr2);
        return m5565k(objArr2.length, objArr2);
    }

    /* JADX INFO: renamed from: s */
    public static kk1 m5569s(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        o21.m4665k(5, objArr);
        return m5565k(5, objArr);
    }

    /* JADX INFO: renamed from: t */
    public static kk1 m5570t(Object obj) {
        Object[] objArr = {obj};
        o21.m4665k(1, objArr);
        return m5565k(1, objArr);
    }

    /* JADX INFO: renamed from: u */
    public static kk1 m5571u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        o21.m4665k(2, objArr);
        return m5565k(2, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: b */
    public int mo2641b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p000.lm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && hr1.m3275k(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (hr1.m3275k(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.lm0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: j */
    public final AbstractC0570dk iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final om0 listIterator(int i) {
        p32.m5189t(i, size());
        return isEmpty() ? f9540b : new om0(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public qm0 subList(int i, int i2) {
        p32.m5190u(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? kk1.f5896e : new pm0(this, i, i3);
    }

    @Override // p000.lm0
    /* JADX INFO: renamed from: a */
    public final qm0 mo2640a() {
        return this;
    }
}
