package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 implements Map, Serializable {

    /* JADX INFO: renamed from: s */
    public static final ey0 f3480s;

    /* JADX INFO: renamed from: a */
    public Object[] f3481a;

    /* JADX INFO: renamed from: b */
    public Object[] f3482b;

    /* JADX INFO: renamed from: c */
    public int[] f3483c;

    /* JADX INFO: renamed from: d */
    public int[] f3484d;

    /* JADX INFO: renamed from: e */
    public int f3485e;

    /* JADX INFO: renamed from: f */
    public int f3486f;

    /* JADX INFO: renamed from: g */
    public int f3487g;

    /* JADX INFO: renamed from: m */
    public int f3488m;

    /* JADX INFO: renamed from: n */
    public int f3489n;

    /* JADX INFO: renamed from: o */
    public fy0 f3490o;

    /* JADX INFO: renamed from: p */
    public gy0 f3491p;

    /* JADX INFO: renamed from: q */
    public fy0 f3492q;

    /* JADX INFO: renamed from: r */
    public boolean f3493r;

    static {
        ey0 ey0Var = new ey0(0);
        ey0Var.f3493r = true;
        f3480s = ey0Var;
    }

    public ey0(int i) {
        if (i < 0) {
            f40.m2713i("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f3481a = objArr;
        this.f3482b = null;
        this.f3483c = iArr;
        this.f3484d = new int[iHighestOneBit];
        this.f3485e = 2;
        this.f3486f = 0;
        this.f3487g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m2651a(Object obj) {
        m2652b();
        while (true) {
            int iM2658h = m2658h(obj);
            int i = this.f3485e * 2;
            int length = this.f3484d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f3484d;
                int i3 = iArr[iM2658h];
                if (i3 <= 0) {
                    int i4 = this.f3486f;
                    Object[] objArr = this.f3481a;
                    if (i4 >= objArr.length) {
                        m2655e(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f3486f = i5;
                    objArr[i4] = obj;
                    this.f3483c[i4] = iM2658h;
                    iArr[iM2658h] = i5;
                    this.f3489n++;
                    this.f3488m++;
                    if (i2 > this.f3485e) {
                        this.f3485e = i2;
                    }
                    return i4;
                }
                if (hp0.m3214e(this.f3481a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m2659i(this.f3484d.length * 2);
                    break;
                }
                iM2658h = iM2658h == 0 ? this.f3484d.length - 1 : iM2658h - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2652b() {
        if (this.f3493r) {
            lv1.m4291b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2653c(boolean z) {
        int i;
        Object[] objArr = this.f3482b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f3486f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f3483c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f3481a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f3484d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        sc2.m6047R(this.f3481a, i3, i);
        if (objArr != null) {
            sc2.m6047R(objArr, i3, this.f3486f);
        }
        this.f3486f = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        m2652b();
        int i = this.f3486f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f3483c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f3484d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        sc2.m6047R(this.f3481a, 0, this.f3486f);
        Object[] objArr = this.f3482b;
        if (objArr != null) {
            sc2.m6047R(objArr, 0, this.f3486f);
        }
        this.f3489n = 0;
        this.f3486f = 0;
        this.f3488m++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m2656f(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m2657g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2654d(Collection collection) {
        boolean zM3214e;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM2656f = m2656f(entry.getKey());
                    if (iM2656f < 0) {
                        zM3214e = false;
                    } else {
                        Object[] objArr = this.f3482b;
                        objArr.getClass();
                        zM3214e = hp0.m3214e(objArr[iM2656f], entry.getValue());
                    }
                    if (!zM3214e) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m2655e(int i) {
        Object[] objArr = this.f3481a;
        int length = objArr.length;
        int i2 = this.f3486f;
        int i3 = length - i2;
        int i4 = i2 - this.f3489n;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m2653c(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            ca0.m1173e();
            return;
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f3481a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f3482b;
            this.f3482b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f3483c = Arrays.copyOf(this.f3483c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f3484d.length) {
                m2659i(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        fy0 fy0Var = this.f3492q;
        if (fy0Var != null) {
            return fy0Var;
        }
        fy0 fy0Var2 = new fy0(this, 0);
        this.f3492q = fy0Var2;
        return fy0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f3489n == map.size() && m2654d(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public final int m2656f(Object obj) {
        int iM2658h = m2658h(obj);
        int i = this.f3485e;
        while (true) {
            int i2 = this.f3484d[iM2658h];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (hp0.m3214e(this.f3481a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM2658h = iM2658h == 0 ? this.f3484d.length - 1 : iM2658h - 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m2657g(Object obj) {
        int i = this.f3486f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f3483c[i] >= 0) {
                Object[] objArr = this.f3482b;
                objArr.getClass();
                if (hp0.m3214e(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM2656f = m2656f(obj);
        if (iM2656f < 0) {
            return null;
        }
        Object[] objArr = this.f3482b;
        objArr.getClass();
        return objArr[iM2656f];
    }

    /* JADX INFO: renamed from: h */
    public final int m2658h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f3487g;
    }

    @Override // java.util.Map
    public final int hashCode() {
        by0 by0Var = new by0(this, 0);
        int i = 0;
        while (by0Var.hasNext()) {
            int i2 = by0Var.f3073a;
            ey0 ey0Var = (ey0) by0Var.f3076d;
            if (i2 >= ey0Var.f3486f) {
                ca0.m1185q();
                return 0;
            }
            by0Var.f3073a = i2 + 1;
            by0Var.f3074b = i2;
            Object obj = ey0Var.f3481a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ey0Var.f3482b;
            objArr.getClass();
            Object obj2 = objArr[by0Var.f3074b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            by0Var.m2410e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m2659i(int i) {
        int[] iArr;
        this.f3488m++;
        int i2 = 0;
        if (this.f3486f > this.f3489n) {
            m2653c(false);
        }
        this.f3484d = new int[i];
        this.f3487g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f3486f) {
            int i3 = i2 + 1;
            int iM2658h = m2658h(this.f3481a[i2]);
            int i4 = this.f3485e;
            while (true) {
                iArr = this.f3484d;
                if (iArr[iM2658h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    f40.m2719o("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM2658h = iM2658h == 0 ? iArr.length - 1 : iM2658h - 1;
            }
            iArr[iM2658h] = i3;
            this.f3483c[i2] = iM2658h;
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3489n == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m2660j(int i) {
        Object[] objArr = this.f3481a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.f3482b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f3483c[i];
        int i2 = this.f3485e * 2;
        int length2 = this.f3484d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.f3484d.length - 1 : length - 1;
            i4++;
            int i6 = this.f3485e;
            int[] iArr = this.f3484d;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int iM2658h = m2658h(this.f3481a[i8]) - length;
                        int[] iArr2 = this.f3484d;
                        if ((iM2658h & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.f3483c[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.f3483c[i] = -1;
            this.f3489n--;
            this.f3488m++;
        } while (i3 >= 0);
        this.f3484d[i5] = -1;
        this.f3483c[i] = -1;
        this.f3489n--;
        this.f3488m++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        fy0 fy0Var = this.f3490o;
        if (fy0Var != null) {
            return fy0Var;
        }
        fy0 fy0Var2 = new fy0(this, 1);
        this.f3490o = fy0Var2;
        return fy0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m2652b();
        int iM2651a = m2651a(obj);
        Object[] objArr = this.f3482b;
        if (objArr == null) {
            int length = this.f3481a.length;
            if (length < 0) {
                f40.m2713i("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f3482b = objArr;
        }
        if (iM2651a >= 0) {
            objArr[iM2651a] = obj2;
            return null;
        }
        int i = (-iM2651a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        m2652b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m2655e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM2651a = m2651a(entry.getKey());
            Object[] objArr = this.f3482b;
            if (objArr == null) {
                int length = this.f3481a.length;
                if (length < 0) {
                    f40.m2713i("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f3482b = objArr;
                }
            }
            if (iM2651a >= 0) {
                objArr[iM2651a] = entry.getValue();
            } else {
                int i = (-iM2651a) - 1;
                if (!hp0.m3214e(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m2652b();
        int iM2656f = m2656f(obj);
        if (iM2656f < 0) {
            return null;
        }
        Object[] objArr = this.f3482b;
        objArr.getClass();
        Object obj2 = objArr[iM2656f];
        m2660j(iM2656f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3489n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f3489n * 3) + 2);
        sb.append("{");
        int i = 0;
        by0 by0Var = new by0(this, 0);
        while (by0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = by0Var.f3073a;
            ey0 ey0Var = (ey0) by0Var.f3076d;
            if (i2 >= ey0Var.f3486f) {
                ca0.m1185q();
                return null;
            }
            by0Var.f3073a = i2 + 1;
            by0Var.f3074b = i2;
            Object obj = ey0Var.f3481a[i2];
            if (obj == ey0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ey0Var.f3482b;
            objArr.getClass();
            Object obj2 = objArr[by0Var.f3074b];
            if (obj2 == ey0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            by0Var.m2410e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        gy0 gy0Var = this.f3491p;
        if (gy0Var != null) {
            return gy0Var;
        }
        gy0 gy0Var2 = new gy0(this);
        this.f3491p = gy0Var2;
        return gy0Var2;
    }
}
