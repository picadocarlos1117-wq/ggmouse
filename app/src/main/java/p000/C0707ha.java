package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: ha */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0707ha implements Collection, Set {

    /* JADX INFO: renamed from: d */
    public static Object[] f4483d;

    /* JADX INFO: renamed from: e */
    public static int f4484e;

    /* JADX INFO: renamed from: f */
    public static Object[] f4485f;

    /* JADX INFO: renamed from: g */
    public static int f4486g;

    /* JADX INFO: renamed from: m */
    public static final Object f4487m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f4488n = new Object();

    /* JADX INFO: renamed from: a */
    public int[] f4489a;

    /* JADX INFO: renamed from: b */
    public Object[] f4490b;

    /* JADX INFO: renamed from: c */
    public int f4491c;

    public C0707ha(int i) {
        if (i == 0) {
            this.f4489a = AbstractC1337qm.f9534b;
            this.f4490b = AbstractC1337qm.f9535c;
        } else {
            m3118a(i);
        }
        this.f4491c = 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m3117b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f4488n) {
                try {
                    if (f4486g < 10) {
                        objArr[0] = f4485f;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f4485f = objArr;
                        f4486g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f4487m) {
                try {
                    if (f4484e < 10) {
                        objArr[0] = f4483d;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4483d = objArr;
                        f4484e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3118a(int i) {
        if (i == 8) {
            synchronized (f4488n) {
                try {
                    Object[] objArr = f4485f;
                    if (objArr != null) {
                        try {
                            this.f4490b = objArr;
                            f4485f = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f4489a = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f4486g--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f4485f = null;
                        f4486g = 0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (f4487m) {
                try {
                    Object[] objArr2 = f4483d;
                    if (objArr2 != null) {
                        try {
                            this.f4490b = objArr2;
                            f4483d = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f4489a = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f4484e--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f4483d = null;
                        f4484e = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f4489a = new int[i];
        this.f4490b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM3119e;
        int i2 = this.f4491c;
        if (obj == null) {
            iM3119e = m3120f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM3119e = m3119e(iHashCode, obj);
        }
        if (iM3119e >= 0) {
            return false;
        }
        int i3 = ~iM3119e;
        int[] iArr = this.f4489a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f4490b;
            m3118a(i4);
            if (i2 != this.f4491c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f4489a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4490b, 0, objArr.length);
            }
            m3117b(iArr, objArr, i2);
        }
        if (i3 < i2) {
            int[] iArr3 = this.f4489a;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f4490b;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f4491c;
        if (i2 == i7) {
            int[] iArr4 = this.f4489a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f4490b[i3] = obj;
                this.f4491c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4491c;
        int i = this.f4491c;
        int[] iArr = this.f4489a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4490b;
            m3118a(size);
            int i2 = this.f4491c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f4489a, 0, i2);
                System.arraycopy(objArr, 0, this.f4490b, 0, this.f4491c);
            }
            m3117b(iArr, objArr, this.f4491c);
        }
        if (this.f4491c != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f4491c;
        if (i != 0) {
            int[] iArr = this.f4489a;
            Object[] objArr = this.f4490b;
            this.f4489a = AbstractC1337qm.f9534b;
            this.f4490b = AbstractC1337qm.f9535c;
            this.f4491c = 0;
            m3117b(iArr, objArr, i);
        }
        if (this.f4491c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m3120f() : m3119e(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final int m3119e(int i, Object obj) {
        int i2 = this.f4491c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM5534e = AbstractC1337qm.m5534e(i2, i, this.f4489a);
            if (iM5534e < 0 || obj.equals(this.f4490b[iM5534e])) {
                return iM5534e;
            }
            int i3 = iM5534e + 1;
            while (i3 < i2 && this.f4489a[i3] == i) {
                if (obj.equals(this.f4490b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM5534e - 1; i4 >= 0 && this.f4489a[i4] == i; i4--) {
                if (obj.equals(this.f4490b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4491c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f4491c; i++) {
                try {
                    if (!set.contains(this.f4490b[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m3120f() {
        int i = this.f4491c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM5534e = AbstractC1337qm.m5534e(i, 0, this.f4489a);
            if (iM5534e < 0 || this.f4490b[iM5534e] == null) {
                return iM5534e;
            }
            int i2 = iM5534e + 1;
            while (i2 < i && this.f4489a[i2] == 0) {
                if (this.f4490b[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM5534e - 1; i3 >= 0 && this.f4489a[i3] == 0; i3--) {
                if (this.f4490b[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3121h(int i) {
        int i2 = this.f4491c;
        Object[] objArr = this.f4490b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f4489a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                int i5 = i3 - i;
                System.arraycopy(iArr, i4, iArr, i, i5);
                Object[] objArr2 = this.f4490b;
                System.arraycopy(objArr2, i4, objArr2, i, i5);
            }
            this.f4490b[i3] = null;
        } else {
            m3118a(i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f4489a, 0, i);
                System.arraycopy(objArr, 0, this.f4490b, 0, i);
            }
            if (i < i3) {
                int i6 = i + 1;
                int i7 = i3 - i;
                System.arraycopy(iArr, i6, this.f4489a, i, i7);
                System.arraycopy(objArr, i6, this.f4490b, i, i7);
            }
        }
        if (i2 != this.f4491c) {
            throw new ConcurrentModificationException();
        }
        this.f4491c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4489a;
        int i = this.f4491c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4491c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0128ca(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM3120f = obj == null ? m3120f() : m3119e(obj.hashCode(), obj);
        if (iM3120f < 0) {
            return false;
        }
        m3121h(iM3120f);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f4491c - 1; i >= 0; i--) {
            if (!collection.contains(this.f4490b[i])) {
                m3121h(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4491c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f4491c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4491c);
        }
        System.arraycopy(this.f4490b, 0, objArr, 0, this.f4491c);
        int length = objArr.length;
        int i = this.f4491c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4491c * 14);
        sb.append('{');
        for (int i = 0; i < this.f4491c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f4490b[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f4491c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4490b, 0, objArr, 0, i);
        return objArr;
    }
}
