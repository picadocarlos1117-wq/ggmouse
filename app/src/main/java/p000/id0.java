package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class id0 extends hk0 {

    /* JADX INFO: renamed from: A0 */
    public int f4950A0;

    /* JADX INFO: renamed from: B0 */
    public C1332qh f4951B0;

    /* JADX INFO: renamed from: C0 */
    public ch1 f4952C0;

    /* JADX INFO: renamed from: D0 */
    public int f4953D0;

    /* JADX INFO: renamed from: E0 */
    public int f4954E0;

    /* JADX INFO: renamed from: F0 */
    public int f4955F0;

    /* JADX INFO: renamed from: G0 */
    public int f4956G0;

    /* JADX INFO: renamed from: H0 */
    public int f4957H0;

    /* JADX INFO: renamed from: I0 */
    public int f4958I0;

    /* JADX INFO: renamed from: J0 */
    public float f4959J0;

    /* JADX INFO: renamed from: K0 */
    public float f4960K0;

    /* JADX INFO: renamed from: L0 */
    public float f4961L0;

    /* JADX INFO: renamed from: M0 */
    public float f4962M0;

    /* JADX INFO: renamed from: N0 */
    public float f4963N0;

    /* JADX INFO: renamed from: O0 */
    public float f4964O0;

    /* JADX INFO: renamed from: P0 */
    public int f4965P0;

    /* JADX INFO: renamed from: Q0 */
    public int f4966Q0;

    /* JADX INFO: renamed from: R0 */
    public int f4967R0;

    /* JADX INFO: renamed from: S0 */
    public int f4968S0;

    /* JADX INFO: renamed from: T0 */
    public int f4969T0;

    /* JADX INFO: renamed from: U0 */
    public int f4970U0;

    /* JADX INFO: renamed from: V0 */
    public int f4971V0;

    /* JADX INFO: renamed from: W0 */
    public ArrayList f4972W0;

    /* JADX INFO: renamed from: X0 */
    public C1639ys[] f4973X0;

    /* JADX INFO: renamed from: Y0 */
    public C1639ys[] f4974Y0;

    /* JADX INFO: renamed from: Z0 */
    public int[] f4975Z0;

    /* JADX INFO: renamed from: a1 */
    public C1639ys[] f4976a1;

    /* JADX INFO: renamed from: b1 */
    public int f4977b1;

    /* JADX INFO: renamed from: s0 */
    public int f4978s0;

    /* JADX INFO: renamed from: t0 */
    public int f4979t0;

    /* JADX INFO: renamed from: u0 */
    public int f4980u0;

    /* JADX INFO: renamed from: v0 */
    public int f4981v0;

    /* JADX INFO: renamed from: w0 */
    public int f4982w0;

    /* JADX INFO: renamed from: x0 */
    public int f4983x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f4984y0;

    /* JADX INFO: renamed from: z0 */
    public int f4985z0;

    @Override // p000.hk0
    /* JADX INFO: renamed from: S */
    public final void mo3175S() {
        for (int i = 0; i < this.f4612r0; i++) {
            C1639ys c1639ys = this.f4611q0[i];
            if (c1639ys != null) {
                c1639ys.f13063F = true;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final int m3421T(C1639ys c1639ys, int i) {
        C1639ys c1639ys2;
        if (c1639ys != null) {
            int[] iArr = c1639ys.f13115p0;
            if (iArr[1] == 3) {
                int i2 = c1639ys.f13118s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c1639ys.f13125z * i);
                        if (i3 != c1639ys.m7131k()) {
                            c1639ys.f13096g = true;
                            m3423V(iArr[0], c1639ys.m7135q(), 1, i3, c1639ys);
                        }
                        return i3;
                    }
                    c1639ys2 = c1639ys;
                    if (i2 == 1) {
                        return c1639ys2.m7131k();
                    }
                    if (i2 == 3) {
                        return (int) ((c1639ys2.m7135q() * c1639ys2.f13080W) + 0.5f);
                    }
                }
            } else {
                c1639ys2 = c1639ys;
            }
            return c1639ys2.m7131k();
        }
        return 0;
    }

    /* JADX INFO: renamed from: U */
    public final int m3422U(C1639ys c1639ys, int i) {
        C1639ys c1639ys2;
        if (c1639ys != null) {
            int[] iArr = c1639ys.f13115p0;
            if (iArr[0] == 3) {
                int i2 = c1639ys.f13117r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c1639ys.f13122w * i);
                        if (i3 != c1639ys.m7135q()) {
                            c1639ys.f13096g = true;
                            m3423V(1, i3, iArr[1], c1639ys.m7131k(), c1639ys);
                        }
                        return i3;
                    }
                    c1639ys2 = c1639ys;
                    if (i2 == 1) {
                        return c1639ys2.m7135q();
                    }
                    if (i2 == 3) {
                        return (int) ((c1639ys2.m7131k() * c1639ys2.f13080W) + 0.5f);
                    }
                }
            } else {
                c1639ys2 = c1639ys;
            }
            return c1639ys2.m7135q();
        }
        return 0;
    }

    /* JADX INFO: renamed from: V */
    public final void m3423V(int i, int i2, int i3, int i4, C1639ys c1639ys) {
        ch1 ch1Var;
        C1639ys c1639ys2;
        C1332qh c1332qh = this.f4951B0;
        while (true) {
            ch1Var = this.f4952C0;
            if (ch1Var != null || (c1639ys2 = this.f13077T) == null) {
                break;
            } else {
                this.f4952C0 = ((C1676zs) c1639ys2).f13540u0;
            }
        }
        c1332qh.f9500a = i;
        c1332qh.f9501b = i3;
        c1332qh.f9502c = i2;
        c1332qh.f9503d = i4;
        ch1Var.m1220d(c1639ys, c1332qh);
        c1639ys.m7122O(c1332qh.f9504e);
        c1639ys.m7119L(c1332qh.f9505f);
        c1639ys.f13062E = c1332qh.f9507h;
        c1639ys.m7116I(c1332qh.f9506g);
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: b */
    public final void mo3424b(xs0 xs0Var, boolean z) {
        C1639ys c1639ys;
        float f;
        int i;
        ArrayList arrayList = this.f4972W0;
        super.mo3424b(xs0Var, z);
        C1639ys c1639ys2 = this.f13077T;
        boolean z2 = c1639ys2 != null && ((C1676zs) c1639ys2).f13541v0;
        int i2 = this.f4969T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((hd0) arrayList.get(i3)).m3130b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((hd0) arrayList.get(i4)).m3130b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f4975Z0 != null && this.f4974Y0 != null && this.f4973X0 != null) {
                for (int i5 = 0; i5 < this.f4977b1; i5++) {
                    this.f4976a1[i5].m7113D();
                }
                int[] iArr = this.f4975Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.f4959J0;
                C1639ys c1639ys3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f4959J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    C1639ys c1639ys4 = this.f4974Y0[i];
                    if (c1639ys4 != null) {
                        C1082ls c1082ls = c1639ys4.f13066I;
                        if (c1639ys4.f13097g0 != 8) {
                            if (i8 == 0) {
                                c1639ys4.m7127f(c1082ls, this.f13066I, this.f4982w0);
                                c1639ys4.f13101i0 = this.f4953D0;
                                c1639ys4.f13091d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                c1639ys4.m7127f(c1639ys4.f13068K, this.f13068K, this.f4983x0);
                            }
                            if (i8 > 0 && c1639ys3 != null) {
                                C1082ls c1082ls2 = c1639ys3.f13068K;
                                c1639ys4.m7127f(c1082ls, c1082ls2, this.f4965P0);
                                c1639ys3.m7127f(c1082ls2, c1082ls, 0);
                            }
                            c1639ys3 = c1639ys4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    C1639ys c1639ys5 = this.f4973X0[i9];
                    if (c1639ys5 != null) {
                        C1082ls c1082ls3 = c1639ys5.f13067J;
                        if (c1639ys5.f13097g0 != 8) {
                            if (i9 == 0) {
                                c1639ys5.m7127f(c1082ls3, this.f13067J, this.f4978s0);
                                c1639ys5.f13103j0 = this.f4954E0;
                                c1639ys5.f13093e0 = this.f4960K0;
                            }
                            if (i9 == i7 - 1) {
                                c1639ys5.m7127f(c1639ys5.f13069L, this.f13069L, this.f4979t0);
                            }
                            if (i9 > 0 && c1639ys3 != null) {
                                C1082ls c1082ls4 = c1639ys3.f13069L;
                                c1639ys5.m7127f(c1082ls3, c1082ls4, this.f4966Q0);
                                c1639ys3.m7127f(c1082ls4, c1082ls3, 0);
                            }
                            c1639ys3 = c1639ys5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f4971V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        C1639ys[] c1639ysArr = this.f4976a1;
                        if (i12 < c1639ysArr.length && (c1639ys = c1639ysArr[i12]) != null && c1639ys.f13097g0 != 8) {
                            C1639ys c1639ys6 = this.f4974Y0[i10];
                            C1639ys c1639ys7 = this.f4973X0[i11];
                            if (c1639ys != c1639ys6) {
                                c1639ys.m7127f(c1639ys.f13066I, c1639ys6.f13066I, 0);
                                c1639ys.m7127f(c1639ys.f13068K, c1639ys6.f13068K, 0);
                            }
                            if (c1639ys != c1639ys7) {
                                c1639ys.m7127f(c1639ys.f13067J, c1639ys7.f13067J, 0);
                                c1639ys.m7127f(c1639ys.f13069L, c1639ys7.f13069L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((hd0) arrayList.get(0)).m3130b(0, z2, true);
        }
        this.f4984y0 = false;
    }
}
