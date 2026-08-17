package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 {

    /* JADX INFO: renamed from: f */
    public static final a42 f44f = new a42(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f45a;

    /* JADX INFO: renamed from: b */
    public int[] f46b;

    /* JADX INFO: renamed from: c */
    public Object[] f47c;

    /* JADX INFO: renamed from: d */
    public int f48d;

    /* JADX INFO: renamed from: e */
    public boolean f49e;

    public a42(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f48d = -1;
        this.f45a = i;
        this.f46b = iArr;
        this.f47c = objArr;
        this.f49e = z;
    }

    /* JADX INFO: renamed from: e */
    public static a42 m75e(a42 a42Var, a42 a42Var2) {
        int i = a42Var.f45a + a42Var2.f45a;
        int[] iArrCopyOf = Arrays.copyOf(a42Var.f46b, i);
        System.arraycopy(a42Var2.f46b, 0, iArrCopyOf, a42Var.f45a, a42Var2.f45a);
        Object[] objArrCopyOf = Arrays.copyOf(a42Var.f47c, i);
        System.arraycopy(a42Var2.f47c, 0, objArrCopyOf, a42Var.f45a, a42Var2.f45a);
        return new a42(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: a */
    public final void m76a() {
        if (this.f49e) {
            return;
        }
        lv1.m4291b();
    }

    /* JADX INFO: renamed from: b */
    public final void m77b(int i) {
        int[] iArr = this.f46b;
        if (i > iArr.length) {
            int i2 = this.f45a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f46b = Arrays.copyOf(iArr, i);
            this.f47c = Arrays.copyOf(this.f47c, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m78c() {
        int iM4584c;
        int iM4586e;
        int iM4584c2;
        int i = this.f48d;
        if (i != -1) {
            return i;
        }
        int iM5335b = 0;
        for (int i2 = 0; i2 < this.f45a; i2++) {
            int i3 = this.f46b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        AbstractC0753ik abstractC0753ik = (AbstractC0753ik) this.f47c[i2];
                        int iM4584c3 = AbstractC1153np.m4584c(i4);
                        int size = abstractC0753ik.size();
                        iM5335b = AbstractC1308pu.m5335b(size, size, iM4584c3, iM5335b);
                    } else if (i5 == 3) {
                        iM4584c = AbstractC1153np.m4584c(i4) * 2;
                        iM4586e = ((a42) this.f47c[i2]).m78c();
                    } else {
                        if (i5 != 5) {
                            lv1.m4302n(rp0.m5883d());
                            return 0;
                        }
                        ((Integer) this.f47c[i2]).getClass();
                        iM4584c2 = AbstractC1153np.m4584c(i4) + 4;
                    }
                } else {
                    ((Long) this.f47c[i2]).getClass();
                    iM4584c2 = AbstractC1153np.m4584c(i4) + 8;
                }
                iM5335b = iM4584c2 + iM5335b;
            } else {
                long jLongValue = ((Long) this.f47c[i2]).longValue();
                iM4584c = AbstractC1153np.m4584c(i4);
                iM4586e = AbstractC1153np.m4586e(jLongValue);
            }
            iM5335b = iM4586e + iM4584c + iM5335b;
        }
        this.f48d = iM5335b;
        return iM5335b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m79d(int i, AbstractC0762ip abstractC0762ip) throws qp0 {
        int iMo2635z;
        m76a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m80f(i, Long.valueOf(abstractC0762ip.mo2628r()));
            return true;
        }
        if (i3 == 1) {
            m80f(i, Long.valueOf(abstractC0762ip.mo2625o()));
            return true;
        }
        if (i3 == 2) {
            m80f(i, abstractC0762ip.mo2621k());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw rp0.m5883d();
            }
            m80f(i, Integer.valueOf(abstractC0762ip.mo2624n()));
            return true;
        }
        a42 a42Var = new a42();
        do {
            iMo2635z = abstractC0762ip.mo2635z();
            if (iMo2635z == 0) {
                break;
            }
        } while (a42Var.m79d(iMo2635z, abstractC0762ip));
        abstractC0762ip.mo2615a((i2 << 3) | 4);
        m80f(i, a42Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a42)) {
            return false;
        }
        a42 a42Var = (a42) obj;
        int i = this.f45a;
        if (i == a42Var.f45a) {
            int[] iArr = this.f46b;
            int[] iArr2 = a42Var.f46b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f47c;
            Object[] objArr2 = a42Var.f47c;
            int i3 = this.f45a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m80f(int i, Object obj) {
        m76a();
        m77b(this.f45a + 1);
        int[] iArr = this.f46b;
        int i2 = this.f45a;
        iArr[i2] = i;
        this.f47c[i2] = obj;
        this.f45a = i2 + 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m81g(ay0 ay0Var) {
        if (this.f45a == 0) {
            return;
        }
        ay0Var.getClass();
        AbstractC1153np abstractC1153np = (AbstractC1153np) ay0Var.f1096b;
        for (int i = 0; i < this.f45a; i++) {
            int i2 = this.f46b[i];
            Object obj = this.f47c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                abstractC1153np.mo3995z(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                abstractC1153np.mo3983n(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                abstractC1153np.mo3979j(i3, (AbstractC0753ik) obj);
            } else if (i4 == 3) {
                abstractC1153np.mo3992w(i3, 3);
                ((a42) obj).m81g(ay0Var);
                abstractC1153np.mo3992w(i3, 4);
            } else {
                if (i4 != 5) {
                    ca0.m1184p(rp0.m5883d());
                    return;
                }
                abstractC1153np.mo3981l(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.f45a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f46b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f47c;
        int i6 = this.f45a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public a42() {
        this(0, new int[8], new Object[8], true);
    }
}
