package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class zs1 {

    /* JADX INFO: renamed from: d */
    public static Object[] f13551d;

    /* JADX INFO: renamed from: e */
    public static int f13552e;

    /* JADX INFO: renamed from: f */
    public static Object[] f13553f;

    /* JADX INFO: renamed from: g */
    public static int f13554g;

    /* JADX INFO: renamed from: a */
    public int[] f13555a = AbstractC1337qm.f9534b;

    /* JADX INFO: renamed from: b */
    public Object[] f13556b = AbstractC1337qm.f9535c;

    /* JADX INFO: renamed from: c */
    public int f13557c = 0;

    /* JADX INFO: renamed from: c */
    public static void m7343c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (zs1.class) {
                try {
                    if (f13554g < 10) {
                        objArr[0] = f13553f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f13553f = objArr;
                        f13554g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (zs1.class) {
                try {
                    if (f13552e < 10) {
                        objArr[0] = f13551d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f13551d = objArr;
                        f13552e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7344a(int i) {
        if (i == 8) {
            synchronized (zs1.class) {
                try {
                    Object[] objArr = f13553f;
                    if (objArr != null) {
                        this.f13556b = objArr;
                        f13553f = (Object[]) objArr[0];
                        this.f13555a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f13554g--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (zs1.class) {
                try {
                    Object[] objArr2 = f13551d;
                    if (objArr2 != null) {
                        this.f13556b = objArr2;
                        f13551d = (Object[]) objArr2[0];
                        this.f13555a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f13552e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f13555a = new int[i];
        this.f13556b = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    public final void m7345b(int i) {
        int i2 = this.f13557c;
        int[] iArr = this.f13555a;
        if (iArr.length < i) {
            Object[] objArr = this.f13556b;
            m7344a(i);
            if (this.f13557c > 0) {
                System.arraycopy(iArr, 0, this.f13555a, 0, i2);
                System.arraycopy(objArr, 0, this.f13556b, 0, i2 << 1);
            }
            m7343c(iArr, objArr, i2);
        }
        if (this.f13557c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f13557c;
        if (i > 0) {
            int[] iArr = this.f13555a;
            Object[] objArr = this.f13556b;
            this.f13555a = AbstractC1337qm.f9534b;
            this.f13556b = AbstractC1337qm.f9535c;
            this.f13557c = 0;
            m7343c(iArr, objArr, i);
        }
        if (this.f13557c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m7347e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m7349g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m7346d(int i, Object obj) {
        int i2 = this.f13557c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM5534e = AbstractC1337qm.m5534e(i2, i, this.f13555a);
            if (iM5534e < 0 || obj.equals(this.f13556b[iM5534e << 1])) {
                return iM5534e;
            }
            int i3 = iM5534e + 1;
            while (i3 < i2 && this.f13555a[i3] == i) {
                if (obj.equals(this.f13556b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM5534e - 1; i4 >= 0 && this.f13555a[i4] == i; i4--) {
                if (obj.equals(this.f13556b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m7347e(Object obj) {
        return obj == null ? m7348f() : m7346d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof zs1) {
                zs1 zs1Var = (zs1) obj;
                if (this.f13557c != zs1Var.f13557c) {
                    return false;
                }
                for (int i = 0; i < this.f13557c; i++) {
                    Object objM7350h = m7350h(i);
                    Object objM7352j = m7352j(i);
                    Object orDefault = zs1Var.getOrDefault(objM7350h, null);
                    if (objM7352j == null) {
                        if (orDefault != null || !zs1Var.containsKey(objM7350h)) {
                            return false;
                        }
                    } else if (!objM7352j.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f13557c != map.size()) {
                    return false;
                }
                for (int i2 = 0; i2 < this.f13557c; i2++) {
                    Object objM7350h2 = m7350h(i2);
                    Object objM7352j2 = m7352j(i2);
                    Object obj2 = map.get(objM7350h2);
                    if (objM7352j2 == null) {
                        if (obj2 != null || !map.containsKey(objM7350h2)) {
                            return false;
                        }
                    } else if (!objM7352j2.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m7348f() {
        int i = this.f13557c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM5534e = AbstractC1337qm.m5534e(i, 0, this.f13555a);
            if (iM5534e < 0 || this.f13556b[iM5534e << 1] == null) {
                return iM5534e;
            }
            int i2 = iM5534e + 1;
            while (i2 < i && this.f13555a[i2] == 0) {
                if (this.f13556b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM5534e - 1; i3 >= 0 && this.f13555a[i3] == 0; i3--) {
                if (this.f13556b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m7349g(Object obj) {
        int i = this.f13557c * 2;
        Object[] objArr = this.f13556b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM7347e = m7347e(obj);
        return iM7347e >= 0 ? this.f13556b[(iM7347e << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m7350h(int i) {
        return this.f13556b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f13555a;
        Object[] objArr = this.f13556b;
        int i = this.f13557c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m7351i(int i) {
        Object[] objArr = this.f13556b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f13557c;
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.f13555a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                int i6 = i4 - i;
                System.arraycopy(iArr, i5, iArr, i, i6);
                Object[] objArr2 = this.f13556b;
                System.arraycopy(objArr2, i5 << 1, objArr2, i2, i6 << 1);
            }
            Object[] objArr3 = this.f13556b;
            int i7 = i4 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            m7344a(i3 > 8 ? i3 + (i3 >> 1) : 8);
            if (i3 != this.f13557c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f13555a, 0, i);
                System.arraycopy(objArr, 0, this.f13556b, 0, i2);
            }
            if (i < i4) {
                int i8 = i + 1;
                int i9 = i4 - i;
                System.arraycopy(iArr, i8, this.f13555a, i, i9);
                System.arraycopy(objArr, i8 << 1, this.f13556b, i2, i9 << 1);
            }
        }
        if (i3 != this.f13557c) {
            throw new ConcurrentModificationException();
        }
        this.f13557c = i4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f13557c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m7352j(int i) {
        return this.f13556b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iM7346d;
        int i2 = this.f13557c;
        if (obj == null) {
            iM7346d = m7348f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM7346d = m7346d(iHashCode, obj);
        }
        if (iM7346d >= 0) {
            int i3 = (iM7346d << 1) + 1;
            Object[] objArr = this.f13556b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iM7346d;
        int[] iArr = this.f13555a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f13556b;
            m7344a(i5);
            if (i2 != this.f13557c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f13555a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f13556b, 0, objArr2.length);
            }
            m7343c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f13555a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f13556b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f13557c - i4) << 1);
        }
        int i7 = this.f13557c;
        if (i2 == i7) {
            int[] iArr4 = this.f13555a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f13556b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f13557c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM7347e = m7347e(obj);
        if (iM7347e < 0) {
            return false;
        }
        Object objM7352j = m7352j(iM7347e);
        if (obj2 != objM7352j && (obj2 == null || !obj2.equals(objM7352j))) {
            return false;
        }
        m7351i(iM7347e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM7347e = m7347e(obj);
        if (iM7347e < 0) {
            return false;
        }
        Object objM7352j = m7352j(iM7347e);
        if (objM7352j != obj2 && (obj2 == null || !obj2.equals(objM7352j))) {
            return false;
        }
        int i = (iM7347e << 1) + 1;
        Object[] objArr = this.f13556b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }

    public final int size() {
        return this.f13557c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f13557c * 28);
        sb.append('{');
        for (int i = 0; i < this.f13557c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM7350h = m7350h(i);
            if (objM7350h != this) {
                sb.append(objM7350h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM7352j = m7352j(i);
            if (objM7352j != this) {
                sb.append(objM7352j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object remove(Object obj) {
        int iM7347e = m7347e(obj);
        if (iM7347e >= 0) {
            return m7351i(iM7347e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM7347e = m7347e(obj);
        if (iM7347e < 0) {
            return null;
        }
        int i = (iM7347e << 1) + 1;
        Object[] objArr = this.f13556b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }
}
