package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: y9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1620y9 extends AbstractC1092m1 {

    /* JADX INFO: renamed from: d */
    public static final Object[] f12864d = new Object[0];

    /* JADX INFO: renamed from: a */
    public int f12865a;

    /* JADX INFO: renamed from: b */
    public Object[] f12866b = f12864d;

    /* JADX INFO: renamed from: c */
    public int f12867c;

    @Override // p000.AbstractC1092m1
    /* JADX INFO: renamed from: a */
    public final int mo701a() {
        return this.f12867c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f12867c;
        if (i < 0 || i > i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m7051m();
        m7046f(this.f12867c + 1);
        int iM7050k = m7050k(this.f12865a + i);
        int i3 = this.f12867c;
        if (i < ((i3 + 1) >> 1)) {
            if (iM7050k == 0) {
                Object[] objArr = this.f12866b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM7050k - 1;
            }
            int length2 = this.f12865a;
            if (length2 == 0) {
                Object[] objArr2 = this.f12866b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.f12865a;
            Object[] objArr3 = this.f12866b;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                AbstractC1064la.m4154o0(objArr3, i5, objArr3, i5 + 1, length + 1);
            } else {
                AbstractC1064la.m4154o0(objArr3, i5 - 1, objArr3, i5, objArr3.length);
                Object[] objArr4 = this.f12866b;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC1064la.m4154o0(objArr4, 0, objArr4, 1, length + 1);
            }
            this.f12866b[length] = obj;
            this.f12865a = i4;
        } else {
            int iM7050k2 = m7050k(i3 + this.f12865a);
            Object[] objArr5 = this.f12866b;
            if (iM7050k < iM7050k2) {
                AbstractC1064la.m4154o0(objArr5, iM7050k + 1, objArr5, iM7050k, iM7050k2);
            } else {
                AbstractC1064la.m4154o0(objArr5, 1, objArr5, 0, iM7050k2);
                Object[] objArr6 = this.f12866b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1064la.m4154o0(objArr6, iM7050k + 1, objArr6, iM7050k, objArr6.length - 1);
            }
            this.f12866b[iM7050k] = obj;
        }
        this.f12867c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f12867c;
        if (i < 0 || i > i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f12867c) {
            return addAll(collection);
        }
        m7051m();
        m7046f(collection.size() + this.f12867c);
        int iM7050k = m7050k(this.f12867c + this.f12865a);
        int iM7050k2 = m7050k(this.f12865a + i);
        int size = collection.size();
        if (i >= ((this.f12867c + 1) >> 1)) {
            int i3 = iM7050k2 + size;
            Object[] objArr = this.f12866b;
            if (iM7050k2 < iM7050k) {
                int i4 = size + iM7050k;
                if (i4 <= objArr.length) {
                    AbstractC1064la.m4154o0(objArr, i3, objArr, iM7050k2, iM7050k);
                } else if (i3 >= objArr.length) {
                    AbstractC1064la.m4154o0(objArr, i3 - objArr.length, objArr, iM7050k2, iM7050k);
                } else {
                    int length = iM7050k - (i4 - objArr.length);
                    AbstractC1064la.m4154o0(objArr, 0, objArr, length, iM7050k);
                    Object[] objArr2 = this.f12866b;
                    AbstractC1064la.m4154o0(objArr2, i3, objArr2, iM7050k2, length);
                }
            } else {
                AbstractC1064la.m4154o0(objArr, size, objArr, 0, iM7050k);
                Object[] objArr3 = this.f12866b;
                if (i3 >= objArr3.length) {
                    AbstractC1064la.m4154o0(objArr3, i3 - objArr3.length, objArr3, iM7050k2, objArr3.length);
                } else {
                    AbstractC1064la.m4154o0(objArr3, 0, objArr3, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.f12866b;
                    AbstractC1064la.m4154o0(objArr4, i3, objArr4, iM7050k2, objArr4.length - size);
                }
            }
            m7045e(iM7050k2, collection);
            return true;
        }
        int i5 = this.f12865a;
        int length2 = i5 - size;
        Object[] objArr5 = this.f12866b;
        if (iM7050k2 < i5) {
            AbstractC1064la.m4154o0(objArr5, length2, objArr5, i5, objArr5.length);
            Object[] objArr6 = this.f12866b;
            if (size >= iM7050k2) {
                AbstractC1064la.m4154o0(objArr6, objArr6.length - size, objArr6, 0, iM7050k2);
            } else {
                AbstractC1064la.m4154o0(objArr6, objArr6.length - size, objArr6, 0, size);
                Object[] objArr7 = this.f12866b;
                AbstractC1064la.m4154o0(objArr7, 0, objArr7, size, iM7050k2);
            }
        } else if (length2 >= 0) {
            AbstractC1064la.m4154o0(objArr5, length2, objArr5, i5, iM7050k2);
        } else {
            length2 += objArr5.length;
            int i6 = iM7050k2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC1064la.m4154o0(objArr5, length2, objArr5, i5, iM7050k2);
            } else {
                AbstractC1064la.m4154o0(objArr5, length2, objArr5, i5, i5 + length3);
                Object[] objArr8 = this.f12866b;
                AbstractC1064la.m4154o0(objArr8, 0, objArr8, this.f12865a + length3, iM7050k2);
            }
        }
        this.f12865a = length2;
        m7045e(m7048i(iM7050k2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m7051m();
        m7046f(this.f12867c + 1);
        int length = this.f12865a;
        if (length == 0) {
            Object[] objArr = this.f12866b;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f12865a = i;
        this.f12866b[i] = obj;
        this.f12867c++;
    }

    public final void addLast(Object obj) {
        m7051m();
        m7046f(mo701a() + 1);
        this.f12866b[m7050k(mo701a() + this.f12865a)] = obj;
        this.f12867c = mo701a() + 1;
    }

    @Override // p000.AbstractC1092m1
    /* JADX INFO: renamed from: b */
    public final Object mo702b(int i) {
        int i2 = this.f12867c;
        if (i < 0 || i >= i2) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == mo701a() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m7051m();
        int iM7050k = m7050k(this.f12865a + i);
        Object[] objArr = this.f12866b;
        Object obj = objArr[iM7050k];
        int i3 = this.f12867c >> 1;
        int i4 = this.f12865a;
        if (i < i3) {
            if (iM7050k >= i4) {
                AbstractC1064la.m4154o0(objArr, i4 + 1, objArr, i4, iM7050k);
            } else {
                AbstractC1064la.m4154o0(objArr, 1, objArr, 0, iM7050k);
                Object[] objArr2 = this.f12866b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f12865a;
                AbstractC1064la.m4154o0(objArr2, i5 + 1, objArr2, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f12866b;
            int i6 = this.f12865a;
            objArr3[i6] = null;
            this.f12865a = m7047h(i6);
        } else {
            int iM7050k2 = m7050k((mo701a() - 1) + i4);
            Object[] objArr4 = this.f12866b;
            if (iM7050k <= iM7050k2) {
                AbstractC1064la.m4154o0(objArr4, iM7050k, objArr4, iM7050k + 1, iM7050k2 + 1);
            } else {
                AbstractC1064la.m4154o0(objArr4, iM7050k, objArr4, iM7050k + 1, objArr4.length);
                Object[] objArr5 = this.f12866b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC1064la.m4154o0(objArr5, 0, objArr5, 1, iM7050k2 + 1);
            }
            this.f12866b[iM7050k2] = null;
        }
        this.f12867c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m7051m();
            m7049j(this.f12865a, m7050k(mo701a() + this.f12865a));
        }
        this.f12865a = 0;
        this.f12867c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m7045e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f12866b.length;
        while (i < length && it.hasNext()) {
            this.f12866b[i] = it.next();
            i++;
        }
        int i2 = this.f12865a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f12866b[i3] = it.next();
        }
        this.f12867c = collection.size() + this.f12867c;
    }

    /* JADX INFO: renamed from: f */
    public final void m7046f(int i) {
        if (i < 0) {
            f40.m2719o("Deque is too big.");
            return;
        }
        Object[] objArr = this.f12866b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f12864d) {
            if (i < 10) {
                i = 10;
            }
            this.f12866b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC1064la.m4154o0(objArr, 0, objArr2, this.f12865a, objArr.length);
        Object[] objArr3 = this.f12866b;
        int length2 = objArr3.length;
        int i3 = this.f12865a;
        AbstractC1064la.m4154o0(objArr3, length2 - i3, objArr2, 0, i3);
        this.f12865a = 0;
        this.f12866b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo701a = mo701a();
        if (i >= 0 && i < iMo701a) {
            return this.f12866b[m7050k(this.f12865a + i)];
        }
        f40.m2718n(AbstractC1308pu.m5338e("index: ", i, iMo701a, ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final int m7047h(int i) {
        Object[] objArr = this.f12866b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: i */
    public final int m7048i(int i) {
        return i < 0 ? i + this.f12866b.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM7050k = m7050k(mo701a() + this.f12865a);
        int length = this.f12865a;
        if (length < iM7050k) {
            while (length < iM7050k) {
                if (hp0.m3214e(obj, this.f12866b[length])) {
                    i = this.f12865a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM7050k) {
            return -1;
        }
        int length2 = this.f12866b.length;
        while (length < length2) {
            if (hp0.m3214e(obj, this.f12866b[length])) {
                i = this.f12865a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM7050k; i2++) {
            if (hp0.m3214e(obj, this.f12866b[i2])) {
                length = i2 + this.f12866b.length;
                i = this.f12865a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo701a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m7049j(int i, int i2) {
        Object[] objArr = this.f12866b;
        if (i < i2) {
            AbstractC1064la.m4155p0(objArr, null, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            AbstractC1064la.m4155p0(this.f12866b, null, 0, i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m7050k(int i) {
        Object[] objArr = this.f12866b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iM7050k = m7050k(this.f12867c + this.f12865a);
        int i2 = this.f12865a;
        if (i2 < iM7050k) {
            length = iM7050k - 1;
            if (i2 <= length) {
                while (!hp0.m3214e(obj, this.f12866b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f12865a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM7050k) {
            do {
                iM7050k--;
                objArr = this.f12866b;
                if (-1 >= iM7050k) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f12865a;
                    if (i3 <= length) {
                        while (!hp0.m3214e(obj, this.f12866b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f12865a;
                    }
                }
                return length - i;
            } while (!hp0.m3214e(obj, objArr[iM7050k]));
            length = iM7050k + this.f12866b.length;
            i = this.f12865a;
            return length - i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m7051m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo702b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM7050k;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f12866b.length != 0) {
            int iM7050k2 = m7050k(this.f12867c + this.f12865a);
            int i = this.f12865a;
            if (i < iM7050k2) {
                iM7050k = i;
                while (true) {
                    objArr = this.f12866b;
                    if (i >= iM7050k2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f12866b[iM7050k] = obj;
                        iM7050k++;
                    }
                    i++;
                }
                AbstractC1064la.m4155p0(objArr, null, iM7050k, iM7050k2);
            } else {
                int length = this.f12866b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f12866b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f12866b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM7050k = m7050k(i2);
                for (int i3 = 0; i3 < iM7050k2; i3++) {
                    Object[] objArr3 = this.f12866b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f12866b[iM7050k] = obj3;
                        iM7050k = m7047h(iM7050k);
                    }
                }
                z = z2;
            }
            if (z) {
                m7051m();
                this.f12867c = m7048i(iM7050k - this.f12865a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m7051m();
        Object[] objArr = this.f12866b;
        int i = this.f12865a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f12865a = m7047h(i);
        this.f12867c = mo701a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m7051m();
        int iM7050k = m7050k((size() - 1) + this.f12865a);
        Object[] objArr = this.f12866b;
        Object obj = objArr[iM7050k];
        objArr[iM7050k] = null;
        this.f12867c = mo701a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ki0.m3862f(i, i2, this.f12867c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f12867c) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo702b(i);
            return;
        }
        m7051m();
        int i4 = this.f12867c - i2;
        int i5 = this.f12865a;
        if (i < i4) {
            int iM7050k = m7050k((i - 1) + i5);
            int iM7050k2 = m7050k(this.f12865a + (i2 - 1));
            while (i > 0) {
                int i6 = iM7050k + 1;
                int iMin = Math.min(i, Math.min(i6, iM7050k2 + 1));
                Object[] objArr = this.f12866b;
                int i7 = iM7050k2 - iMin;
                int i8 = iM7050k - iMin;
                AbstractC1064la.m4154o0(objArr, i7 + 1, objArr, i8 + 1, i6);
                iM7050k = m7048i(i8);
                iM7050k2 = m7048i(i7);
                i -= iMin;
            }
            int iM7050k3 = m7050k(this.f12865a + i3);
            m7049j(this.f12865a, iM7050k3);
            this.f12865a = iM7050k3;
        } else {
            int iM7050k4 = m7050k(i5 + i2);
            int iM7050k5 = m7050k(this.f12865a + i);
            int i9 = this.f12867c;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f12866b;
                i2 = Math.min(i9, Math.min(objArr2.length - iM7050k4, objArr2.length - iM7050k5));
                Object[] objArr3 = this.f12866b;
                int i10 = iM7050k4 + i2;
                AbstractC1064la.m4154o0(objArr3, iM7050k5, objArr3, iM7050k4, i10);
                iM7050k4 = m7050k(i10);
                iM7050k5 = m7050k(iM7050k5 + i2);
            }
            int iM7050k6 = m7050k(this.f12867c + this.f12865a);
            m7049j(m7048i(iM7050k6 - i3), iM7050k6);
        }
        this.f12867c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM7050k;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f12866b.length != 0) {
            int iM7050k2 = m7050k(this.f12867c + this.f12865a);
            int i = this.f12865a;
            if (i < iM7050k2) {
                iM7050k = i;
                while (true) {
                    objArr = this.f12866b;
                    if (i >= iM7050k2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f12866b[iM7050k] = obj;
                        iM7050k++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC1064la.m4155p0(objArr, null, iM7050k, iM7050k2);
            } else {
                int length = this.f12866b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f12866b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f12866b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM7050k = m7050k(i2);
                for (int i3 = 0; i3 < iM7050k2; i3++) {
                    Object[] objArr3 = this.f12866b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f12866b[iM7050k] = obj3;
                        iM7050k = m7047h(iM7050k);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m7051m();
                this.f12867c = m7048i(iM7050k - this.f12865a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo701a = mo701a();
        if (i < 0 || i >= iMo701a) {
            f40.m2718n(AbstractC1308pu.m5338e("index: ", i, iMo701a, ", size: "));
            return null;
        }
        int iM7050k = m7050k(this.f12865a + i);
        Object[] objArr = this.f12866b;
        Object obj2 = objArr[iM7050k];
        objArr[iM7050k] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f12867c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM7050k = m7050k(this.f12867c + this.f12865a);
        int i2 = this.f12865a;
        if (i2 < iM7050k) {
            AbstractC1064la.m4154o0(this.f12866b, 0, objArr, i2, iM7050k);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f12866b;
            AbstractC1064la.m4154o0(objArr2, 0, objArr, this.f12865a, objArr2.length);
            Object[] objArr3 = this.f12866b;
            AbstractC1064la.m4154o0(objArr3, objArr3.length - this.f12865a, objArr, 0, iM7050k);
        }
        int i3 = this.f12867c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo701a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m7051m();
        m7046f(collection.size() + mo701a());
        m7045e(m7050k(mo701a() + this.f12865a), collection);
        return true;
    }
}
