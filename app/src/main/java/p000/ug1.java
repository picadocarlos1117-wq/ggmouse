package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 implements yo1 {

    /* JADX INFO: renamed from: a */
    public final int f11289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wg1 f11290b;

    public ug1(wg1 wg1Var, int i) {
        this.f11290b = wg1Var;
        this.f11289a = i;
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: b */
    public final boolean mo3797b() {
        wg1 wg1Var = this.f11290b;
        return !wg1Var.m6780C() && wg1Var.f12173y[this.f11289a].m6941i(wg1Var.f12152S);
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: h */
    public final void mo3798h() throws IOException {
        int i = this.f11289a;
        wg1 wg1Var = this.f11290b;
        xo1 xo1Var = wg1Var.f12173y[i];
        ay0 ay0Var = xo1Var.f12668h;
        if (ay0Var != null && ay0Var.m788x() == 1) {
            a40 a40VarM785u = xo1Var.f12668h.m785u();
            a40VarM785u.getClass();
            throw a40VarM785u;
        }
        C1174o9 c1174o9 = wg1Var.f12165q;
        int iM1085l = wg1Var.f12157d.m1085l(wg1Var.f12142I);
        IOException iOException = (IOException) c1174o9.f7701d;
        if (iOException != null) {
            throw iOException;
        }
        uu0 uu0Var = (uu0) c1174o9.f7700c;
        if (uu0Var != null) {
            if (iM1085l == Integer.MIN_VALUE) {
                iM1085l = uu0Var.f11422a;
            }
            IOException iOException2 = uu0Var.f11425d;
            if (iOException2 != null && uu0Var.f11426e > iM1085l) {
                throw iOException2;
            }
        }
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: i */
    public final int mo3799i(long j) {
        int iM6939g;
        wg1 wg1Var = this.f11290b;
        int i = this.f11289a;
        boolean z = false;
        if (wg1Var.m6780C()) {
            return 0;
        }
        wg1Var.m6786v(i);
        xo1 xo1Var = wg1Var.f12173y[i];
        boolean z2 = wg1Var.f12152S;
        synchronized (xo1Var) {
            int iM6940h = xo1Var.m6940h(xo1Var.f12679s);
            int i2 = xo1Var.f12679s;
            int i3 = xo1Var.f12676p;
            if ((i2 != i3) && j >= xo1Var.f12674n[iM6940h]) {
                if (j <= xo1Var.f12682v || !z2) {
                    iM6939g = xo1Var.m6939g(iM6940h, i3 - i2, j, true);
                    if (iM6939g == -1) {
                    }
                } else {
                    iM6939g = i3 - i2;
                }
            }
            iM6939g = 0;
        }
        synchronized (xo1Var) {
            if (iM6939g >= 0) {
                try {
                    if (xo1Var.f12679s + iM6939g <= xo1Var.f12676p) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ki0.m3857c(z);
            xo1Var.f12679s += iM6939g;
        }
        if (iM6939g == 0) {
            wg1Var.m6787w(i);
        }
        return iM6939g;
    }

    @Override // p000.yo1
    /* JADX INFO: renamed from: m */
    public final int mo3800m(C0558d8 c0558d8, C1533vx c1533vx, int i) {
        int i2;
        wg1 wg1Var = this.f11290b;
        int i3 = this.f11289a;
        if (wg1Var.m6780C()) {
            return -3;
        }
        wg1Var.m6786v(i3);
        xo1 xo1Var = wg1Var.f12173y[i3];
        boolean z = wg1Var.f12152S;
        xo1Var.getClass();
        boolean z2 = (i & 2) != 0;
        C1583x9 c1583x9 = xo1Var.f12662b;
        synchronized (xo1Var) {
            try {
                c1533vx.f11796o = false;
                int i4 = xo1Var.f12679s;
                i2 = -5;
                if (i4 != xo1Var.f12676p) {
                    be0 be0Var = ((wo1) xo1Var.f12663c.m804f(xo1Var.f12677q + i4)).f12243a;
                    if (z2 || be0Var != xo1Var.f12667g) {
                        xo1Var.m6943k(be0Var, c0558d8);
                    } else {
                        int iM6940h = xo1Var.m6940h(xo1Var.f12679s);
                        if (xo1Var.m6942j(iM6940h)) {
                            c1533vx.f7542b = xo1Var.f12673m[iM6940h];
                            if (xo1Var.f12679s == xo1Var.f12676p - 1 && (z || xo1Var.f12683w)) {
                                c1533vx.m4597b(536870912);
                            }
                            c1533vx.f11797p = xo1Var.f12674n[iM6940h];
                            c1583x9.f12494a = xo1Var.f12672l[iM6940h];
                            c1583x9.f12495b = xo1Var.f12671k[iM6940h];
                            c1583x9.f12496c = xo1Var.f12675o[iM6940h];
                            i2 = -4;
                        } else {
                            c1533vx.f11796o = true;
                            i2 = -3;
                        }
                    }
                } else if (z || xo1Var.f12683w) {
                    c1533vx.f7542b = 4;
                    c1533vx.f11797p = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    be0 be0Var2 = xo1Var.f12686z;
                    if (be0Var2 == null || (!z2 && be0Var2 == xo1Var.f12667g)) {
                        i2 = -3;
                    } else {
                        xo1Var.m6943k(be0Var2, c0558d8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !c1533vx.m4599i(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                vo1 vo1Var = xo1Var.f12661a;
                C1583x9 c1583x10 = xo1Var.f12662b;
                if (z3) {
                    vo1.m6648e(vo1Var.f11736e, c1533vx, c1583x10, vo1Var.f11734c);
                } else {
                    vo1Var.f11736e = vo1.m6648e(vo1Var.f11736e, c1533vx, c1583x10, vo1Var.f11734c);
                }
            }
            if (!z3) {
                xo1Var.f12679s++;
            }
        }
        if (i2 == -3) {
            wg1Var.m6787w(i3);
        }
        return i2;
    }
}
