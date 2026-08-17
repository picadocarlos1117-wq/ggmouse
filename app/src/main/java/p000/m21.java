package p000;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m21 {

    /* JADX INFO: renamed from: c */
    public final C0808jy f6596c;

    /* JADX INFO: renamed from: d */
    public final zy1 f6597d;

    /* JADX INFO: renamed from: e */
    public final C1521vl f6598e;

    /* JADX INFO: renamed from: f */
    public long f6599f;

    /* JADX INFO: renamed from: g */
    public int f6600g;

    /* JADX INFO: renamed from: h */
    public boolean f6601h;

    /* JADX INFO: renamed from: i */
    public k21 f6602i;

    /* JADX INFO: renamed from: j */
    public k21 f6603j;

    /* JADX INFO: renamed from: k */
    public k21 f6604k;

    /* JADX INFO: renamed from: l */
    public k21 f6605l;

    /* JADX INFO: renamed from: m */
    public int f6606m;

    /* JADX INFO: renamed from: n */
    public Object f6607n;

    /* JADX INFO: renamed from: o */
    public long f6608o;

    /* JADX INFO: renamed from: a */
    public final r02 f6594a = new r02();

    /* JADX INFO: renamed from: b */
    public final s02 f6595b = new s02();

    /* JADX INFO: renamed from: p */
    public ArrayList f6609p = new ArrayList();

    public m21(C0808jy c0808jy, zy1 zy1Var, C1521vl c1521vl, v70 v70Var) {
        this.f6596c = c0808jy;
        this.f6597d = zy1Var;
        this.f6598e = c1521vl;
    }

    /* JADX INFO: renamed from: m */
    public static q21 m4359m(t02 t02Var, Object obj, long j, long j2, s02 s02Var, r02 r02Var) {
        t02Var.mo2973g(obj, r02Var);
        t02Var.m6175n(r02Var.f9651c, s02Var);
        t02Var.mo1054b(obj);
        int i = r02Var.f9655g.f11963a;
        if (i != 0) {
            if (i == 1) {
                r02Var.m5649f(0);
            }
            r02Var.f9655g.getClass();
            r02Var.m5650g(0);
        }
        t02Var.mo2973g(obj, r02Var);
        int iM5646c = r02Var.m5646c(j);
        return iM5646c == -1 ? new q21(obj, r02Var.m5645b(j), j2) : new q21(obj, iM5646c, r02Var.m5648e(iM5646c), j2, -1);
    }

    /* JADX INFO: renamed from: a */
    public final k21 m4360a() {
        k21 k21Var = this.f6602i;
        if (k21Var == null) {
            return null;
        }
        if (k21Var == this.f6603j) {
            this.f6603j = k21Var.f5647m;
        }
        k21Var.m3762i();
        int i = this.f6606m - 1;
        this.f6606m = i;
        if (i == 0) {
            this.f6604k = null;
            k21 k21Var2 = this.f6602i;
            this.f6607n = k21Var2.f5636b;
            this.f6608o = k21Var2.f5641g.f6147a.f9312d;
        }
        this.f6602i = this.f6602i.f5647m;
        m4370k();
        return this.f6602i;
    }

    /* JADX INFO: renamed from: b */
    public final void m4361b() {
        if (this.f6606m == 0) {
            return;
        }
        k21 k21Var = this.f6602i;
        ki0.m3866j(k21Var);
        this.f6607n = k21Var.f5636b;
        this.f6608o = k21Var.f5641g.f6147a.f9312d;
        while (k21Var != null) {
            k21Var.m3762i();
            k21Var = k21Var.f5647m;
        }
        this.f6602i = null;
        this.f6604k = null;
        this.f6603j = null;
        this.f6606m = 0;
        m4370k();
    }

    /* JADX INFO: renamed from: c */
    public final l21 m4362c(t02 t02Var, k21 k21Var, long j) {
        t02 t02Var2;
        Object obj;
        long j2;
        long jLongValue;
        long j3;
        l21 l21Var = k21Var.f5641g;
        long j4 = (k21Var.f5650p + l21Var.f6151e) - j;
        if (!l21Var.f6153g) {
            q21 q21Var = l21Var.f6147a;
            Object obj2 = q21Var.f9309a;
            int i = q21Var.f9313e;
            r02 r02Var = this.f6594a;
            t02Var.mo2973g(obj2, r02Var);
            if (!q21Var.m5438b()) {
                if (i != -1) {
                    r02Var.m5649f(i);
                }
                int iM5648e = r02Var.m5648e(i);
                r02Var.m5650g(i);
                if (iM5648e != r02Var.f9655g.m6701a(i).f11504a) {
                    return m4364e(t02Var, q21Var.f9309a, q21Var.f9313e, iM5648e, l21Var.f6151e, q21Var.f9312d);
                }
                t02Var.mo2973g(obj2, r02Var);
                r02Var.m5647d(i);
                r02Var.f9655g.m6701a(i).getClass();
                return m4365f(t02Var, q21Var.f9309a, 0L, l21Var.f6151e, q21Var.f9312d);
            }
            int i2 = q21Var.f9310b;
            int i3 = r02Var.f9655g.m6701a(i2).f11504a;
            if (i3 != -1) {
                int iM6563a = r02Var.f9655g.m6701a(i2).m6563a(q21Var.f9311c);
                if (iM6563a < i3) {
                    return m4364e(t02Var, q21Var.f9309a, i2, iM6563a, l21Var.f6149c, q21Var.f9312d);
                }
                long jLongValue2 = l21Var.f6149c;
                if (jLongValue2 == -9223372036854775807L) {
                    t02Var2 = t02Var;
                    Pair pairM6174j = t02Var2.m6174j(this.f6595b, r02Var, r02Var.f9651c, -9223372036854775807L, Math.max(0L, j4));
                    if (pairM6174j != null) {
                        jLongValue2 = ((Long) pairM6174j.second).longValue();
                    }
                } else {
                    t02Var2 = t02Var;
                }
                int i4 = q21Var.f9310b;
                t02Var2.mo2973g(obj2, r02Var);
                r02Var.m5647d(i4);
                r02Var.f9655g.m6701a(i4).getClass();
                return m4365f(t02Var2, q21Var.f9309a, Math.max(0L, jLongValue2), l21Var.f6149c, q21Var.f9312d);
            }
            return null;
        }
        l21 l21Var2 = k21Var.f5641g;
        q21 q21Var2 = l21Var2.f6147a;
        long j5 = l21Var2.f6149c;
        long j6 = 0;
        int iM6172d = t02Var.m6172d(t02Var.mo1054b(q21Var2.f9309a), this.f6594a, this.f6595b, this.f6600g, this.f6601h);
        if (iM6172d == -1) {
            return null;
        }
        r02 r02Var2 = this.f6594a;
        int i5 = t02Var.mo1055f(iM6172d, r02Var2, true).f9651c;
        Object obj3 = r02Var2.f9650b;
        obj3.getClass();
        long j7 = q21Var2.f9312d;
        if (t02Var.mo1058m(i5, this.f6595b, 0L).f10192l == iM6172d) {
            Pair pairM6174j2 = t02Var.m6174j(this.f6595b, this.f6594a, i5, -9223372036854775807L, Math.max(0L, j4));
            if (pairM6174j2 == null) {
                return null;
            }
            Object obj4 = pairM6174j2.first;
            jLongValue = ((Long) pairM6174j2.second).longValue();
            k21 k21Var2 = k21Var.f5647m;
            if (k21Var2 == null || !k21Var2.f5636b.equals(obj4)) {
                long jM4373o = m4373o(obj4);
                if (jM4373o == -1) {
                    jM4373o = this.f6599f;
                    this.f6599f = 1 + jM4373o;
                }
                j3 = jM4373o;
            } else {
                j3 = k21Var2.f5641g.f6147a.f9312d;
            }
            j6 = -9223372036854775807L;
            obj = obj4;
            j2 = j3;
        } else {
            obj = obj3;
            j2 = j7;
            jLongValue = 0;
        }
        q21 q21VarM4359m = m4359m(t02Var, obj, jLongValue, j2, this.f6595b, this.f6594a);
        if (j6 != -9223372036854775807L && j5 != -9223372036854775807L) {
            int i6 = t02Var.mo2973g(q21Var2.f9309a, r02Var2).f9655g.f11963a;
            r02Var2.f9655g.getClass();
            if (i6 > 0) {
                r02Var2.m5650g(0);
            }
        }
        return m4363d(t02Var, q21VarM4359m, j6, jLongValue);
    }

    /* JADX INFO: renamed from: d */
    public final l21 m4363d(t02 t02Var, q21 q21Var, long j, long j2) {
        t02Var.mo2973g(q21Var.f9309a, this.f6594a);
        boolean zM5438b = q21Var.m5438b();
        Object obj = q21Var.f9309a;
        return zM5438b ? m4364e(t02Var, obj, q21Var.f9310b, q21Var.f9311c, j, q21Var.f9312d) : m4365f(t02Var, obj, j2, j, q21Var.f9312d);
    }

    /* JADX INFO: renamed from: e */
    public final l21 m4364e(t02 t02Var, Object obj, int i, int i2, long j, long j2) {
        q21 q21Var = new q21(obj, i, i2, j2, -1);
        r02 r02Var = this.f6594a;
        long jM5644a = t02Var.mo2973g(obj, r02Var).m5644a(i, i2);
        if (i2 == r02Var.m5648e(i)) {
            r02Var.f9655g.getClass();
        }
        r02Var.m5650g(i);
        long jMax = 0;
        if (jM5644a != -9223372036854775807L && 0 >= jM5644a) {
            jMax = Math.max(0L, jM5644a - 1);
        }
        return new l21(q21Var, jMax, j, -9223372036854775807L, jM5644a, false, false, false, false);
    }

    /* JADX INFO: renamed from: f */
    public final l21 m4365f(t02 t02Var, Object obj, long j, long j2, long j3) {
        long j4;
        r02 r02Var = this.f6594a;
        t02Var.mo2973g(obj, r02Var);
        int iM5645b = r02Var.m5645b(j);
        if (iM5645b != -1) {
            r02Var.m5649f(iM5645b);
        }
        boolean z = false;
        if (iM5645b != -1) {
            r02Var.m5650g(iM5645b);
        } else if (r02Var.f9655g.f11963a > 0) {
            r02Var.m5650g(0);
        }
        q21 q21Var = new q21(obj, iM5645b, j3);
        if (!q21Var.m5438b() && iM5645b == -1) {
            z = true;
        }
        boolean zM4368i = m4368i(t02Var, q21Var);
        boolean zM4367h = m4367h(t02Var, q21Var, z);
        if (iM5645b != -1) {
            r02Var.m5650g(iM5645b);
        }
        if (iM5645b != -1) {
            r02Var.m5647d(iM5645b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? r02Var.f9652d : j4;
        return new l21(q21Var, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, false, z, zM4368i, zM4367h);
    }

    /* JADX INFO: renamed from: g */
    public final l21 m4366g(t02 t02Var, l21 l21Var) {
        long j;
        long jM5644a;
        q21 q21Var = l21Var.f6147a;
        boolean zM5438b = q21Var.m5438b();
        int i = q21Var.f9313e;
        boolean z = !zM5438b && i == -1;
        int i2 = q21Var.f9310b;
        boolean zM4368i = m4368i(t02Var, q21Var);
        boolean zM4367h = m4367h(t02Var, q21Var, z);
        Object obj = q21Var.f9309a;
        r02 r02Var = this.f6594a;
        t02Var.mo2973g(obj, r02Var);
        if (q21Var.m5438b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            r02Var.m5647d(i);
            j = 0;
        }
        if (q21Var.m5438b()) {
            jM5644a = r02Var.m5644a(i2, q21Var.f9311c);
        } else {
            jM5644a = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? r02Var.f9652d : j;
        }
        if (q21Var.m5438b()) {
            r02Var.m5650g(i2);
        } else if (i != -1) {
            r02Var.m5650g(i);
        }
        return new l21(q21Var, l21Var.f6148b, l21Var.f6149c, j, jM5644a, false, z, zM4368i, zM4367h);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4367h(t02 t02Var, q21 q21Var, boolean z) {
        int iMo1054b = t02Var.mo1054b(q21Var.f9309a);
        if (!t02Var.mo1058m(t02Var.mo1055f(iMo1054b, this.f6594a, false).f9651c, this.f6595b, 0L).f10187g) {
            if (t02Var.m6172d(iMo1054b, this.f6594a, this.f6595b, this.f6600g, this.f6601h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4368i(t02 t02Var, q21 q21Var) {
        boolean z = !q21Var.m5438b() && q21Var.f9313e == -1;
        Object obj = q21Var.f9309a;
        if (z) {
            if (t02Var.mo1058m(t02Var.mo2973g(obj, this.f6594a).f9651c, this.f6595b, 0L).f10193m == t02Var.mo1054b(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m4369j() {
        k21 k21Var = this.f6605l;
        if (k21Var == null || k21Var.m3761h()) {
            this.f6605l = null;
            for (int i = 0; i < this.f6609p.size(); i++) {
                k21 k21Var2 = (k21) this.f6609p.get(i);
                if (!k21Var2.m3761h()) {
                    this.f6605l = k21Var2;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4370k() {
        nm0 nm0VarM5566m = qm0.m5566m();
        for (k21 k21Var = this.f6602i; k21Var != null; k21Var = k21Var.f5647m) {
            nm0VarM5566m.m3901a(k21Var.f5641g.f6147a);
        }
        k21 k21Var2 = this.f6603j;
        this.f6597d.m7387c(new RunnableC1436ta(this, nm0VarM5566m, k21Var2 == null ? null : k21Var2.f5641g.f6147a, 8));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4371l(k21 k21Var) {
        ki0.m3866j(k21Var);
        boolean z = false;
        if (k21Var != this.f6604k) {
            this.f6604k = k21Var;
            while (true) {
                k21Var = k21Var.f5647m;
                if (k21Var == null) {
                    break;
                }
                if (k21Var == this.f6603j) {
                    this.f6603j = this.f6602i;
                    z = true;
                }
                k21Var.m3762i();
                this.f6606m--;
            }
            k21 k21Var2 = this.f6604k;
            k21Var2.getClass();
            if (k21Var2.f5647m != null) {
                k21Var2.m3755b();
                k21Var2.f5647m = null;
                k21Var2.m3756c();
            }
            m4370k();
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final q21 m4372n(t02 t02Var, Object obj, long j) {
        long jM4373o;
        int iMo1054b;
        Object obj2 = obj;
        r02 r02Var = this.f6594a;
        int i = t02Var.mo2973g(obj2, r02Var).f9651c;
        Object obj3 = this.f6607n;
        if (obj3 == null || (iMo1054b = t02Var.mo1054b(obj3)) == -1 || t02Var.mo1055f(iMo1054b, r02Var, false).f9651c != i) {
            k21 k21Var = this.f6602i;
            while (true) {
                if (k21Var == null) {
                    k21 k21Var2 = this.f6602i;
                    while (true) {
                        if (k21Var2 == null) {
                            jM4373o = m4373o(obj2);
                            if (jM4373o != -1) {
                                break;
                            }
                            jM4373o = this.f6599f;
                            this.f6599f = 1 + jM4373o;
                            if (this.f6602i != null) {
                                break;
                            }
                            this.f6607n = obj2;
                            this.f6608o = jM4373o;
                            break;
                        }
                        int iMo1054b2 = t02Var.mo1054b(k21Var2.f5636b);
                        if (iMo1054b2 != -1 && t02Var.mo1055f(iMo1054b2, r02Var, false).f9651c == i) {
                            jM4373o = k21Var2.f5641g.f6147a.f9312d;
                            break;
                        }
                        k21Var2 = k21Var2.f5647m;
                    }
                } else {
                    if (k21Var.f5636b.equals(obj2)) {
                        jM4373o = k21Var.f5641g.f6147a.f9312d;
                        break;
                    }
                    k21Var = k21Var.f5647m;
                }
            }
        } else {
            jM4373o = this.f6608o;
        }
        t02Var.mo2973g(obj2, r02Var);
        int i2 = r02Var.f9651c;
        s02 s02Var = this.f6595b;
        t02Var.m6175n(i2, s02Var);
        boolean z = false;
        for (int iMo1054b3 = t02Var.mo1054b(obj); iMo1054b3 >= s02Var.f10192l; iMo1054b3--) {
            t02Var.mo1055f(iMo1054b3, r02Var, true);
            boolean z2 = r02Var.f9655g.f11963a > 0;
            z |= z2;
            if (r02Var.m5646c(r02Var.f9652d) != -1) {
                obj2 = r02Var.f9650b;
                obj2.getClass();
            }
            if (z && (!z2 || r02Var.f9652d != 0)) {
                break;
            }
        }
        return m4359m(t02Var, obj2, j, jM4373o, this.f6595b, this.f6594a);
    }

    /* JADX INFO: renamed from: o */
    public final long m4373o(Object obj) {
        for (int i = 0; i < this.f6609p.size(); i++) {
            k21 k21Var = (k21) this.f6609p.get(i);
            if (k21Var.f5636b.equals(obj)) {
                return k21Var.f5641g.f6147a.f9312d;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4374p(t02 t02Var) {
        t02 t02Var2;
        k21 k21Var;
        k21 k21Var2 = this.f6602i;
        if (k21Var2 == null) {
            return true;
        }
        int iMo1054b = t02Var.mo1054b(k21Var2.f5636b);
        while (true) {
            t02Var2 = t02Var;
            iMo1054b = t02Var2.m6172d(iMo1054b, this.f6594a, this.f6595b, this.f6600g, this.f6601h);
            while (true) {
                k21Var = k21Var2.f5647m;
                if (k21Var == null || k21Var2.f5641g.f6153g) {
                    break;
                }
                k21Var2 = k21Var;
            }
            if (iMo1054b == -1 || k21Var == null || t02Var2.mo1054b(k21Var.f5636b) != iMo1054b) {
                break;
            }
            k21Var2 = k21Var;
            t02Var = t02Var2;
        }
        boolean zM4371l = m4371l(k21Var2);
        k21Var2.f5641g = m4366g(t02Var2, k21Var2.f5641g);
        return !zM4371l;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4375q(t02 t02Var, long j, long j2) {
        boolean zM4371l;
        l21 l21VarM4366g;
        k21 k21Var = this.f6602i;
        k21 k21Var2 = null;
        while (k21Var != null) {
            l21 l21Var = k21Var.f5641g;
            if (k21Var2 != null) {
                l21 l21VarM4362c = m4362c(t02Var, k21Var2, j);
                if (l21VarM4362c == null) {
                    zM4371l = m4371l(k21Var2);
                } else if (l21Var.f6148b == l21VarM4362c.f6148b && l21Var.f6147a.equals(l21VarM4362c.f6147a)) {
                    l21VarM4366g = l21VarM4362c;
                } else {
                    zM4371l = m4371l(k21Var2);
                }
                return !zM4371l;
            }
            l21VarM4366g = m4366g(t02Var, l21Var);
            long j3 = l21VarM4366g.f6151e;
            k21Var.f5641g = l21VarM4366g.m4021a(l21Var.f6149c);
            long j4 = l21Var.f6151e;
            if (j4 == -9223372036854775807L || j4 == j3) {
                k21Var2 = k21Var;
                k21Var = k21Var.f5647m;
            } else {
                k21Var.m3764k();
                boolean z = k21Var == this.f6603j && !k21Var.f5641g.f6152f && (j2 == Long.MIN_VALUE || j2 >= ((j3 > (-9223372036854775807L) ? 1 : (j3 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : k21Var.f5650p + j3));
                if (m4371l(k21Var) || z) {
                    return false;
                }
            }
        }
        return true;
    }
}
