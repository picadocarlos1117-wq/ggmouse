package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hd0 {

    /* JADX INFO: renamed from: a */
    public int f4533a;

    /* JADX INFO: renamed from: d */
    public C1082ls f4536d;

    /* JADX INFO: renamed from: e */
    public C1082ls f4537e;

    /* JADX INFO: renamed from: f */
    public C1082ls f4538f;

    /* JADX INFO: renamed from: g */
    public C1082ls f4539g;

    /* JADX INFO: renamed from: h */
    public int f4540h;

    /* JADX INFO: renamed from: i */
    public int f4541i;

    /* JADX INFO: renamed from: j */
    public int f4542j;

    /* JADX INFO: renamed from: k */
    public int f4543k;

    /* JADX INFO: renamed from: q */
    public int f4549q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ id0 f4550r;

    /* JADX INFO: renamed from: b */
    public C1639ys f4534b = null;

    /* JADX INFO: renamed from: c */
    public int f4535c = 0;

    /* JADX INFO: renamed from: l */
    public int f4544l = 0;

    /* JADX INFO: renamed from: m */
    public int f4545m = 0;

    /* JADX INFO: renamed from: n */
    public int f4546n = 0;

    /* JADX INFO: renamed from: o */
    public int f4547o = 0;

    /* JADX INFO: renamed from: p */
    public int f4548p = 0;

    public hd0(id0 id0Var, int i, C1082ls c1082ls, C1082ls c1082ls2, C1082ls c1082ls3, C1082ls c1082ls4, int i2) {
        this.f4550r = id0Var;
        this.f4533a = i;
        this.f4536d = c1082ls;
        this.f4537e = c1082ls2;
        this.f4538f = c1082ls3;
        this.f4539g = c1082ls4;
        this.f4540h = id0Var.f4982w0;
        this.f4541i = id0Var.f4978s0;
        this.f4542j = id0Var.f4983x0;
        this.f4543k = id0Var.f4979t0;
        this.f4549q = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3129a(C1639ys c1639ys) {
        int i = this.f4533a;
        int i2 = this.f4549q;
        id0 id0Var = this.f4550r;
        if (i == 0) {
            int iM3422U = id0Var.m3422U(c1639ys, i2);
            if (c1639ys.f13115p0[0] == 3) {
                this.f4548p++;
                iM3422U = 0;
            }
            this.f4544l = iM3422U + (c1639ys.f13097g0 != 8 ? id0Var.f4965P0 : 0) + this.f4544l;
            int iM3421T = id0Var.m3421T(c1639ys, this.f4549q);
            if (this.f4534b == null || this.f4535c < iM3421T) {
                this.f4534b = c1639ys;
                this.f4535c = iM3421T;
                this.f4545m = iM3421T;
            }
        } else {
            int iM3422U2 = id0Var.m3422U(c1639ys, i2);
            int iM3421T2 = id0Var.m3421T(c1639ys, this.f4549q);
            if (c1639ys.f13115p0[1] == 3) {
                this.f4548p++;
                iM3421T2 = 0;
            }
            this.f4545m = iM3421T2 + (c1639ys.f13097g0 != 8 ? id0Var.f4966Q0 : 0) + this.f4545m;
            if (this.f4534b == null || this.f4535c < iM3422U2) {
                this.f4534b = c1639ys;
                this.f4535c = iM3422U2;
                this.f4544l = iM3422U2;
            }
        }
        this.f4547o++;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0105 A[PHI: r5 r9
  0x0105: PHI (r5v25 int) = (r5v23 int), (r5v26 int) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0105: PHI (r9v24 float) = (r9v22 float), (r9v27 float) binds: [B:95:0x0115, B:88:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final void m3130b(int i, boolean z, boolean z2) {
        id0 id0Var;
        int i2;
        int i3;
        C1639ys c1639ys;
        boolean z3;
        char c;
        int i4;
        float f;
        int i5;
        int i6 = this.f4547o;
        int i7 = 0;
        while (true) {
            id0Var = this.f4550r;
            if (i7 >= i6 || (i5 = this.f4546n + i7) >= id0Var.f4977b1) {
                break;
            }
            C1639ys c1639ys2 = id0Var.f4976a1[i5];
            if (c1639ys2 != null) {
                c1639ys2.m7113D();
            }
            i7++;
        }
        if (i6 == 0 || this.f4534b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.f4546n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= id0Var.f4977b1) {
                break;
            }
            C1639ys c1639ys3 = id0Var.f4976a1[i11];
            if (c1639ys3 != null && c1639ys3.f13097g0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        int i12 = this.f4533a;
        C1639ys c1639ys4 = this.f4534b;
        if (i12 == 0) {
            c1639ys4.f13103j0 = id0Var.f4954E0;
            C1082ls c1082ls = c1639ys4.f13069L;
            C1082ls c1082ls2 = c1639ys4.f13067J;
            int i13 = this.f4541i;
            if (i > 0) {
                i13 += id0Var.f4966Q0;
            }
            c1082ls2.m4273a(this.f4537e, i13);
            if (z2) {
                c1082ls.m4273a(this.f4539g, this.f4543k);
            }
            if (i > 0) {
                this.f4537e.f6501d.f13069L.m4273a(c1082ls2, 0);
            }
            if (id0Var.f4968S0 != 3 || c1639ys4.f13062E) {
                c1639ys = c1639ys4;
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < i6) {
                    int i15 = this.f4546n + (z ? (i6 - 1) - i14 : i14);
                    if (i15 < id0Var.f4977b1) {
                        c1639ys = id0Var.f4976a1[i15];
                        if (c1639ys.f13062E) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                c1639ys = c1639ys4;
                break;
            }
            int i16 = 0;
            C1639ys c1639ys5 = null;
            while (i16 < i6) {
                int i17 = z ? (i6 - 1) - i16 : i16;
                int i18 = this.f4546n + i17;
                if (i18 >= id0Var.f4977b1) {
                    return;
                }
                C1639ys c1639ys6 = id0Var.f4976a1[i18];
                if (c1639ys6 == null) {
                    i6 = i6;
                    z3 = z4;
                    i9 = i9;
                    c = 3;
                } else {
                    C1082ls c1082ls3 = c1639ys6.f13067J;
                    C1082ls c1082ls4 = c1639ys6.f13069L;
                    C1082ls c1082ls5 = c1639ys6.f13066I;
                    z3 = z4;
                    if (i16 == 0) {
                        c1639ys6.m7127f(c1082ls5, this.f4536d, this.f4540h);
                    }
                    if (i17 == 0) {
                        int i19 = id0Var.f4953D0;
                        float f2 = id0Var.f4959J0;
                        if (z) {
                            f2 = 1.0f - f2;
                        }
                        if (this.f4546n == 0 && (i4 = id0Var.f4955F0) != -1) {
                            f = id0Var.f4961L0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        } else if (!z2 || (i4 = id0Var.f4957H0) == -1) {
                            i4 = i19;
                            f = f2;
                        } else {
                            f = id0Var.f4963N0;
                            if (z) {
                                f = 1.0f - f;
                            }
                        }
                        c1639ys6.f13101i0 = i4;
                        c1639ys6.f13091d0 = f;
                    }
                    if (i16 == i6 - 1) {
                        c1639ys6.m7127f(c1639ys6.f13068K, this.f4538f, this.f4542j);
                    }
                    if (c1639ys5 != null) {
                        C1082ls c1082ls6 = c1639ys5.f13068K;
                        c1082ls5.m4273a(c1082ls6, id0Var.f4965P0);
                        if (i16 == i8) {
                            int i20 = this.f4540h;
                            if (c1082ls5.m4280h()) {
                                c1082ls5.f6505h = i20;
                            }
                        }
                        c1082ls6.m4273a(c1082ls5, 0);
                        if (i16 == i9 + 1) {
                            int i21 = this.f4542j;
                            if (c1082ls6.m4280h()) {
                                c1082ls6.f6505h = i21;
                            }
                        }
                    }
                    if (c1639ys6 != c1639ys4) {
                        int i22 = id0Var.f4968S0;
                        c = 3;
                        if (i22 == 3 && c1639ys.f13062E && c1639ys6 != c1639ys && c1639ys6.f13062E) {
                            c1639ys6.f13070M.m4273a(c1639ys.f13070M, 0);
                        } else if (i22 == 0) {
                            c1082ls3.m4273a(c1082ls2, 0);
                        } else if (i22 == 1) {
                            c1082ls4.m4273a(c1082ls, 0);
                        } else if (z3) {
                            c1082ls3.m4273a(this.f4537e, this.f4541i);
                            c1082ls4.m4273a(this.f4539g, this.f4543k);
                        } else {
                            c1082ls3.m4273a(c1082ls2, 0);
                            c1082ls4.m4273a(c1082ls, 0);
                        }
                    } else {
                        c = 3;
                    }
                    c1639ys5 = c1639ys6;
                }
                i16++;
                z4 = z3;
                i9 = i9;
                i6 = i6;
            }
            return;
        }
        int i23 = i6;
        boolean z5 = z4;
        int i24 = i9;
        c1639ys4.f13101i0 = id0Var.f4953D0;
        C1082ls c1082ls7 = c1639ys4.f13066I;
        C1082ls c1082ls8 = c1639ys4.f13068K;
        int i25 = this.f4540h;
        if (i > 0) {
            i25 += id0Var.f4965P0;
        }
        if (z) {
            c1082ls8.m4273a(this.f4538f, i25);
            if (z2) {
                c1082ls7.m4273a(this.f4536d, this.f4542j);
            }
            if (i > 0) {
                this.f4538f.f6501d.f13066I.m4273a(c1082ls8, 0);
            }
        } else {
            c1082ls7.m4273a(this.f4536d, i25);
            if (z2) {
                c1082ls8.m4273a(this.f4538f, this.f4542j);
            }
            if (i > 0) {
                this.f4536d.f6501d.f13068K.m4273a(c1082ls7, 0);
            }
        }
        int i26 = 0;
        C1639ys c1639ys7 = null;
        while (true) {
            int i27 = i23;
            if (i26 >= i27 || (i2 = this.f4546n + i26) >= id0Var.f4977b1) {
                return;
            }
            C1639ys c1639ys8 = id0Var.f4976a1[i2];
            if (c1639ys8 == null) {
                i23 = i27;
            } else {
                C1082ls c1082ls9 = c1639ys8.f13066I;
                C1082ls c1082ls10 = c1639ys8.f13067J;
                C1082ls c1082ls11 = c1639ys8.f13068K;
                if (i26 == 0) {
                    c1639ys8.m7127f(c1082ls10, this.f4537e, this.f4541i);
                    int i28 = id0Var.f4954E0;
                    float f3 = id0Var.f4960K0;
                    if (this.f4546n == 0) {
                        int i29 = id0Var.f4956G0;
                        i23 = i27;
                        i3 = -1;
                        if (i29 != -1) {
                            f3 = id0Var.f4962M0;
                        }
                        i28 = i29;
                        c1639ys8.f13103j0 = i28;
                        c1639ys8.f13093e0 = f3;
                    } else {
                        i23 = i27;
                        i3 = -1;
                    }
                    if (z2 && (i29 = id0Var.f4958I0) != i3) {
                        f3 = id0Var.f4964O0;
                        i28 = i29;
                    }
                    c1639ys8.f13103j0 = i28;
                    c1639ys8.f13093e0 = f3;
                } else {
                    i23 = i27;
                }
                if (i26 == i23 - 1) {
                    c1639ys8.m7127f(c1639ys8.f13069L, this.f4539g, this.f4543k);
                }
                if (c1639ys7 != null) {
                    C1082ls c1082ls12 = c1639ys7.f13069L;
                    c1082ls10.m4273a(c1082ls12, id0Var.f4966Q0);
                    if (i26 == i8) {
                        int i30 = this.f4541i;
                        if (c1082ls10.m4280h()) {
                            c1082ls10.f6505h = i30;
                        }
                    }
                    c1082ls12.m4273a(c1082ls10, 0);
                    if (i26 == i24 + 1) {
                        int i31 = this.f4543k;
                        if (c1082ls12.m4280h()) {
                            c1082ls12.f6505h = i31;
                        }
                    }
                }
                if (c1639ys8 != c1639ys4) {
                    int i32 = id0Var.f4967R0;
                    if (z) {
                        if (i32 == 0) {
                            c1082ls11.m4273a(c1082ls8, 0);
                        } else if (i32 == 1) {
                            c1082ls9.m4273a(c1082ls7, 0);
                        } else if (i32 == 2) {
                            c1082ls9.m4273a(c1082ls7, 0);
                            c1082ls11.m4273a(c1082ls8, 0);
                        }
                    } else if (i32 == 0) {
                        c1082ls9.m4273a(c1082ls7, 0);
                    } else if (i32 == 1) {
                        c1082ls11.m4273a(c1082ls8, 0);
                    } else if (i32 == 2) {
                        if (z5) {
                            c1082ls9.m4273a(this.f4536d, this.f4540h);
                            c1082ls11.m4273a(this.f4538f, this.f4542j);
                        } else {
                            c1082ls9.m4273a(c1082ls7, 0);
                            c1082ls11.m4273a(c1082ls8, 0);
                        }
                    }
                }
                c1639ys7 = c1639ys8;
            }
            i26++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3131c() {
        int i = this.f4533a;
        int i2 = this.f4545m;
        return i == 1 ? i2 - this.f4550r.f4966Q0 : i2;
    }

    /* JADX INFO: renamed from: d */
    public final int m3132d() {
        int i = this.f4533a;
        int i2 = this.f4544l;
        return i == 0 ? i2 - this.f4550r.f4965P0 : i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m3133e(int i) {
        id0 id0Var;
        int i2;
        int i3 = this.f4548p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4547o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            id0Var = this.f4550r;
            if (i6 >= i4 || (i2 = this.f4546n + i6) >= id0Var.f4977b1) {
                break;
            }
            C1639ys c1639ys = id0Var.f4976a1[i2];
            if (this.f4533a == 0) {
                if (c1639ys != null) {
                    int[] iArr = c1639ys.f13115p0;
                    if (iArr[0] == 3 && c1639ys.f13117r == 0) {
                        id0Var.m3423V(1, i5, iArr[1], c1639ys.m7131k(), c1639ys);
                    }
                }
            } else if (c1639ys != null) {
                int[] iArr2 = c1639ys.f13115p0;
                if (iArr2[1] == 3 && c1639ys.f13118s == 0) {
                    int i7 = i5;
                    id0Var.m3423V(iArr2[0], c1639ys.m7135q(), 1, i7, c1639ys);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.f4544l = 0;
        this.f4545m = 0;
        this.f4534b = null;
        this.f4535c = 0;
        int i8 = this.f4547o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.f4546n + i9;
            if (i10 >= id0Var.f4977b1) {
                return;
            }
            C1639ys c1639ys2 = id0Var.f4976a1[i10];
            if (this.f4533a == 0) {
                int iM7135q = c1639ys2.m7135q();
                int i11 = id0Var.f4965P0;
                if (c1639ys2.f13097g0 == 8) {
                    i11 = 0;
                }
                this.f4544l = iM7135q + i11 + this.f4544l;
                int iM3421T = id0Var.m3421T(c1639ys2, this.f4549q);
                if (this.f4534b == null || this.f4535c < iM3421T) {
                    this.f4534b = c1639ys2;
                    this.f4535c = iM3421T;
                    this.f4545m = iM3421T;
                }
            } else {
                int iM3422U = id0Var.m3422U(c1639ys2, this.f4549q);
                int iM3421T2 = id0Var.m3421T(c1639ys2, this.f4549q);
                int i12 = id0Var.f4966Q0;
                if (c1639ys2.f13097g0 == 8) {
                    i12 = 0;
                }
                this.f4545m = iM3421T2 + i12 + this.f4545m;
                if (this.f4534b == null || this.f4535c < iM3422U) {
                    this.f4534b = c1639ys2;
                    this.f4535c = iM3422U;
                    this.f4544l = iM3422U;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3134f(int i, C1082ls c1082ls, C1082ls c1082ls2, C1082ls c1082ls3, C1082ls c1082ls4, int i2, int i3, int i4, int i5, int i6) {
        this.f4533a = i;
        this.f4536d = c1082ls;
        this.f4537e = c1082ls2;
        this.f4538f = c1082ls3;
        this.f4539g = c1082ls4;
        this.f4540h = i2;
        this.f4541i = i3;
        this.f4542j = i4;
        this.f4543k = i5;
        this.f4549q = i6;
    }
}
