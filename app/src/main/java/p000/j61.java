package p000;

import com.example.ssmousepro.OverlayDisplayBinder;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j61 implements x80 {

    /* JADX INFO: renamed from: e */
    public final t20 f5292e;

    /* JADX INFO: renamed from: f */
    public z80 f5293f;

    /* JADX INFO: renamed from: g */
    public c22 f5294g;

    /* JADX INFO: renamed from: h */
    public c22 f5295h;

    /* JADX INFO: renamed from: i */
    public int f5296i;

    /* JADX INFO: renamed from: j */
    public k51 f5297j;

    /* JADX INFO: renamed from: l */
    public long f5299l;

    /* JADX INFO: renamed from: m */
    public long f5300m;

    /* JADX INFO: renamed from: n */
    public long f5301n;

    /* JADX INFO: renamed from: o */
    public int f5302o;

    /* JADX INFO: renamed from: p */
    public oq1 f5303p;

    /* JADX INFO: renamed from: q */
    public boolean f5304q;

    /* JADX INFO: renamed from: r */
    public boolean f5305r;

    /* JADX INFO: renamed from: s */
    public long f5306s;

    /* JADX INFO: renamed from: a */
    public final dc1 f5288a = new dc1(10);

    /* JADX INFO: renamed from: b */
    public final r61 f5289b = new r61();

    /* JADX INFO: renamed from: c */
    public final xh0 f5290c = new xh0();

    /* JADX INFO: renamed from: k */
    public long f5298k = -9223372036854775807L;

    /* JADX INFO: renamed from: d */
    public final cm0 f5291d = new cm0(0);

    public j61() {
        t20 t20Var = new t20();
        this.f5292e = t20Var;
        this.f5295h = t20Var;
        this.f5301n = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final void m3571a() {
        oq1 oq1Var = this.f5303p;
        if ((oq1Var instanceof C0802js) && ((C0802js) oq1Var).mo6c()) {
            long j = this.f5301n;
            if (j == -1 || j == this.f5303p.mo2724a()) {
                return;
            }
            C0802js c0802js = (C0802js) this.f5303p;
            this.f5303p = new C0802js(this.f5301n, c0802js.f5511h, c0802js.f5512i, c0802js.f5513j, c0802js.f5514k);
            z80 z80Var = this.f5293f;
            z80Var.getClass();
            z80Var.mo752q(this.f5303p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0251  */
    /* JADX WARN: Code duplicated, block: B:111:0x0260  */
    /* JADX WARN: Code duplicated, block: B:117:0x0273  */
    /* JADX WARN: Code duplicated, block: B:120:0x0279  */
    /* JADX WARN: Code duplicated, block: B:121:0x027d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0283  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:215:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:70:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bb A[LOOP:4: B:81:0x01b9->B:82:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f2  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws Throwable {
        Throwable th;
        int i;
        int i2;
        long j;
        int iMo1116c;
        int i3;
        int i4;
        int iM2324g;
        int iM2324g2;
        int iM2341x;
        long jM2339v;
        long[] jArr;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        long position;
        int i9;
        long jMo2420i;
        long jM7220H;
        long j3;
        oq1 c0802js;
        long jM7220H2;
        int i10;
        long[] jArr2;
        int i11;
        x51 x51Var;
        oq1 c0802js2;
        long jM7216D;
        int iM2337t;
        ki0.m3866j(this.f5294g);
        int i12 = z42.f13274a;
        int i13 = this.f5296i;
        r61 r61Var = this.f5289b;
        if (i13 == 0) {
            try {
                m3573d(y80Var, false);
            } catch (EOFException unused) {
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        oq1 oq1Var = this.f5303p;
        dc1 dc1Var = this.f5288a;
        if (oq1Var == null) {
            dc1 dc1Var2 = new dc1(r61Var.f9743b);
            j = 1000000;
            y80Var.mo2413a(0, r61Var.f9743b, dc1Var2.f2882a);
            int i14 = r61Var.f9742a & 1;
            int i15 = r61Var.f9745d;
            th = null;
            if (i14 != 0) {
                if (i15 != 1) {
                    i4 = 36;
                } else {
                    i4 = 21;
                }
            } else if (i15 != 1) {
                i4 = 21;
            } else {
                i4 = 13;
            }
            if (dc1Var2.f2884c >= i4 + 4) {
                dc1Var2.m2316F(i4);
                iM2324g = dc1Var2.m2324g();
                if (iM2324g != 1483304551 && iM2324g != 1231971951) {
                    if (dc1Var2.f2884c >= 40) {
                        dc1Var2.m2316F(36);
                        if (dc1Var2.m2324g() == 1447187017) {
                            iM2324g = 1447187017;
                        } else {
                            iM2324g = 0;
                        }
                    } else {
                        iM2324g = 0;
                    }
                }
            } else if (dc1Var2.f2884c >= 40) {
                dc1Var2.m2316F(36);
                if (dc1Var2.m2324g() == 1447187017) {
                    iM2324g = 1447187017;
                } else {
                    iM2324g = 0;
                }
            } else {
                iM2324g = 0;
            }
            xh0 xh0Var = this.f5290c;
            if (iM2324g == 1231971951) {
                iM2324g2 = dc1Var2.m2324g();
                if ((iM2324g2 & 1) != 0) {
                    iM2341x = dc1Var2.m2341x();
                } else {
                    iM2341x = -1;
                }
                if ((iM2324g2 & 2) != 0) {
                    jM2339v = dc1Var2.m2339v();
                } else {
                    jM2339v = -1;
                }
                if ((iM2324g2 & 4) == 4) {
                    jArr2 = new long[100];
                    i11 = 0;
                    for (i10 = 100; i11 < i10; i10 = 100) {
                        long[] jArr3 = jArr2;
                        jArr3[i11] = dc1Var2.m2337t();
                        i11++;
                        jArr2 = jArr3;
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iM2324g2 & 8) != 0) {
                    dc1Var2.m2317G(4);
                }
                if (dc1Var2.m2318a() >= 24) {
                    dc1Var2.m2317G(21);
                    int iM2340w = dc1Var2.m2340w();
                    i6 = (16773120 & iM2340w) >> 12;
                    i5 = iM2340w & 4095;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                j2 = iM2341x;
                i7 = r61Var.f9743b;
                int i16 = r61Var.f9744c;
                i8 = r61Var.f9746e;
                int i17 = r61Var.f9747f;
                if ((xh0Var.f12605a != -1 || xh0Var.f12606b == -1) && i6 != -1 && i5 != -1) {
                    xh0Var.f12605a = i6;
                    xh0Var.f12606b = i5;
                }
                position = y80Var.getPosition();
                if (y80Var.mo2420i() != -1 || jM2339v == -1) {
                    i9 = i8;
                } else {
                    i9 = i8;
                    long j4 = position + jM2339v;
                    if (y80Var.mo2420i() != j4) {
                        AbstractC1337qm.m5508C("Data size mismatch between stream (" + y80Var.mo2420i() + ") and Xing frame (" + j4 + "), using Xing value.");
                    }
                }
                y80Var.mo2423m(r61Var.f9743b);
                if (iM2324g == 1483304551) {
                    if (j2 != -1 || j2 == 0) {
                        jM7220H2 = -9223372036854775807L;
                    } else {
                        jM7220H2 = z42.m7220H(i16, (j2 * ((long) i17)) - 1);
                    }
                    if (jM7220H2 == -9223372036854775807L) {
                        c0802js = null;
                    } else {
                        c0802js = (jM2339v != -1 || jArr == null) ? new oc2(position, i7, jM7220H2, i9, -1L, null) : new oc2(position, i7, jM7220H2, i9, jM2339v, jArr);
                    }
                } else {
                    jMo2420i = y80Var.mo2420i();
                    if (j2 != -1 || j2 == 0) {
                        jM7220H = -9223372036854775807L;
                    } else {
                        jM7220H = z42.m7220H(i16, (((long) i17) * j2) - 1);
                    }
                    if (jM7220H != -9223372036854775807L) {
                        if (jM2339v != -1) {
                            jMo2420i = position + jM2339v;
                            j3 = jM2339v - ((long) i7);
                        } else if (jMo2420i != -1) {
                            j3 = (jMo2420i - position) - ((long) i7);
                        } else {
                            c0802js = null;
                        }
                        long j5 = jMo2420i;
                        long j6 = j3;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        c0802js = new C0802js(j5, position + ((long) i7), rc2.m5793l(z42.m7222J(j6, 8000000L, jM7220H, roundingMode)), rc2.m5793l(rc2.m5762C(j6, j2, roundingMode)), false);
                    } else {
                        c0802js = null;
                    }
                }
            } else {
                if (iM2324g == 1447187017) {
                    long jMo2420i2 = y80Var.mo2420i();
                    long position2 = y80Var.getPosition();
                    dc1Var2.m2317G(6);
                    long jM2324g = ((long) r61Var.f9743b) + position2 + ((long) dc1Var2.m2324g());
                    int iM2324g3 = dc1Var2.m2324g();
                    if (iM2324g3 <= 0) {
                        c0802js = null;
                        break;
                    }
                    int i18 = r61Var.f9744c;
                    long jM7222J = z42.m7222J(iM2324g3, ((long) (i18 >= 32000 ? 1152 : 576)) * 1000000, i18, RoundingMode.DOWN);
                    int iM2343z = dc1Var2.m2343z();
                    int iM2343z2 = dc1Var2.m2343z();
                    int iM2343z3 = dc1Var2.m2343z();
                    dc1Var2.m2317G(2);
                    long j7 = position2 + ((long) r61Var.f9743b);
                    long[] jArr4 = new long[iM2343z];
                    long[] jArr5 = new long[iM2343z];
                    int i19 = 0;
                    while (true) {
                        if (i19 >= iM2343z) {
                            long[] jArr6 = jArr4;
                            long[] jArr7 = jArr5;
                            if (jMo2420i2 != -1 && jMo2420i2 != jM2324g) {
                                AbstractC1337qm.m5542i0("VbriSeeker", "VBRI data size mismatch: " + jMo2420i2 + ", " + jM2324g);
                            }
                            if (jM2324g != j7) {
                                AbstractC1337qm.m5542i0("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jM2324g + ", " + j7 + "\nSeeking will be inaccurate.");
                                jM2324g = Math.max(jM2324g, j7);
                            }
                            c0802js = new f52(jArr6, jArr7, jM7222J, jM2324g, r61Var.f9746e);
                            break;
                        }
                        long[] jArr8 = jArr4;
                        long[] jArr9 = jArr5;
                        jArr8[i19] = (((long) i19) * jM7222J) / ((long) iM2343z);
                        jArr9[i19] = j7;
                        if (iM2343z3 == 1) {
                            iM2337t = dc1Var2.m2337t();
                        } else if (iM2343z3 == 2) {
                            iM2337t = dc1Var2.m2343z();
                        } else if (iM2343z3 == 3) {
                            iM2337t = dc1Var2.m2340w();
                        } else {
                            if (iM2343z3 != 4) {
                                c0802js = null;
                                break;
                            }
                            iM2337t = dc1Var2.m2341x();
                        }
                        j7 += ((long) iM2343z2) * ((long) iM2337t);
                        i19++;
                        iM2343z3 = iM2343z3;
                        jArr4 = jArr8;
                        jArr5 = jArr9;
                    }
                    y80Var.mo2423m(r61Var.f9743b);
                } else if (iM2324g != 1483304551) {
                    y80Var.mo2422l();
                    c0802js = null;
                } else {
                    iM2324g2 = dc1Var2.m2324g();
                    if ((iM2324g2 & 1) != 0) {
                        iM2341x = dc1Var2.m2341x();
                    } else {
                        iM2341x = -1;
                    }
                    if ((iM2324g2 & 2) != 0) {
                        jM2339v = dc1Var2.m2339v();
                    } else {
                        jM2339v = -1;
                    }
                    if ((iM2324g2 & 4) == 4) {
                        jArr2 = new long[100];
                        i11 = 0;
                        while (i11 < i10) {
                            long[] jArr10 = jArr2;
                            jArr10[i11] = dc1Var2.m2337t();
                            i11++;
                            jArr2 = jArr10;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iM2324g2 & 8) != 0) {
                        dc1Var2.m2317G(4);
                    }
                    if (dc1Var2.m2318a() >= 24) {
                        dc1Var2.m2317G(21);
                        int iM2340w2 = dc1Var2.m2340w();
                        i6 = (16773120 & iM2340w2) >> 12;
                        i5 = iM2340w2 & 4095;
                    } else {
                        i5 = -1;
                        i6 = -1;
                    }
                    j2 = iM2341x;
                    i7 = r61Var.f9743b;
                    int i110 = r61Var.f9744c;
                    i8 = r61Var.f9746e;
                    int i111 = r61Var.f9747f;
                    if (xh0Var.f12605a != -1) {
                        xh0Var.f12605a = i6;
                        xh0Var.f12606b = i5;
                    } else {
                        xh0Var.f12605a = i6;
                        xh0Var.f12606b = i5;
                    }
                    position = y80Var.getPosition();
                    if (y80Var.mo2420i() != -1) {
                        i9 = i8;
                    } else {
                        i9 = i8;
                    }
                    y80Var.mo2423m(r61Var.f9743b);
                    if (iM2324g == 1483304551) {
                        if (j2 != -1) {
                            jM7220H2 = -9223372036854775807L;
                        } else {
                            jM7220H2 = -9223372036854775807L;
                        }
                        if (jM7220H2 == -9223372036854775807L) {
                            c0802js = null;
                        } else if (jM2339v != -1) {
                        }
                    } else {
                        jMo2420i = y80Var.mo2420i();
                        if (j2 != -1) {
                            jM7220H = -9223372036854775807L;
                        } else {
                            jM7220H = -9223372036854775807L;
                        }
                        if (jM7220H != -9223372036854775807L) {
                            if (jM2339v != -1) {
                                jMo2420i = position + jM2339v;
                                j3 = jM2339v - ((long) i7);
                            } else if (jMo2420i != -1) {
                                j3 = (jMo2420i - position) - ((long) i7);
                            } else {
                                c0802js = null;
                            }
                            long j8 = jMo2420i;
                            long j9 = j3;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            c0802js = new C0802js(j8, position + ((long) i7), rc2.m5793l(z42.m7222J(j9, 8000000L, jM7220H, roundingMode2)), rc2.m5793l(rc2.m5762C(j9, j2, roundingMode2)), false);
                        } else {
                            c0802js = null;
                        }
                    }
                }
                xh0Var = xh0Var;
            }
            k51 k51Var = this.f5297j;
            long position3 = y80Var.getPosition();
            if (k51Var == null) {
                x51Var = null;
                break;
            }
            f51[] f51VarArr = k51Var.f5679a;
            int length = f51VarArr.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    x51Var = null;
                    break;
                }
                f51 f51Var = f51VarArr[i20];
                if (f51Var instanceof w51) {
                    w51 w51Var = (w51) f51Var;
                    int[] iArr = w51Var.f11983e;
                    if (k51Var == null) {
                        jM7216D = -9223372036854775807L;
                        break;
                    }
                    f51[] f51VarArr2 = k51Var.f5679a;
                    int length2 = f51VarArr2.length;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= length2) {
                            jM7216D = -9223372036854775807L;
                            break;
                        }
                        f51 f51Var2 = f51VarArr2[i21];
                        if (f51Var2 instanceof tz1) {
                            tz1 tz1Var = (tz1) f51Var2;
                            if (tz1Var.f1432a.equals("TLEN")) {
                                jM7216D = z42.m7216D(Long.parseLong((String) tz1Var.f11077c.get(0)));
                                break;
                            }
                        }
                        i21++;
                    }
                    int length3 = iArr.length;
                    int i22 = length3 + 1;
                    long[] jArr11 = new long[i22];
                    long[] jArr12 = new long[i22];
                    jArr11[0] = position3;
                    jArr12[0] = 0;
                    long j10 = 0;
                    long j11 = position3;
                    int i23 = 1;
                    while (i23 <= length3) {
                        int i24 = i23 - 1;
                        int i25 = i23;
                        j11 += (long) (w51Var.f11981c + iArr[i24]);
                        j10 += (long) (w51Var.f11982d + w51Var.f11984f[i24]);
                        jArr11[i25] = j11;
                        jArr12[i25] = j10;
                        i23 = i25 + 1;
                        length3 = length3;
                    }
                    x51Var = new x51(jArr11, jArr12, jM7216D);
                    break;
                }
                i20++;
            }
            if (this.f5304q) {
                c0802js2 = new nq1(-9223372036854775807L);
            } else {
                if (x51Var != null) {
                    c0802js = x51Var;
                } else if (c0802js == null) {
                    c0802js = null;
                }
                if (c0802js != null) {
                    c0802js.mo6c();
                    c0802js2 = c0802js;
                } else {
                    y80Var.mo2413a(0, 4, dc1Var.f2882a);
                    dc1Var.m2316F(0);
                    r61Var.m5716a(dc1Var.m2324g());
                    c0802js2 = new C0802js(y80Var.mo2420i(), y80Var.getPosition(), r61Var.f9746e, r61Var.f9743b, false);
                }
            }
            this.f5303p = c0802js2;
            this.f5293f.mo752q(c0802js2);
            ae0 ae0Var = new ae0();
            ae0Var.f197m = v51.m6582l((String) r61Var.f9748g);
            ae0Var.f198n = 4096;
            ae0Var.f175B = r61Var.f9745d;
            ae0Var.f176C = r61Var.f9744c;
            ae0Var.f178E = xh0Var.f12605a;
            ae0Var.f179F = xh0Var.f12606b;
            ae0Var.f195k = this.f5297j;
            if (this.f5303p.mo2726i() != -2147483647) {
                ae0Var.f192h = this.f5303p.mo2726i();
            }
            this.f5295h.mo1117d(new be0(ae0Var));
            this.f5300m = y80Var.getPosition();
        } else {
            th = null;
            j = 1000000;
            if (this.f5300m != 0) {
                long position4 = y80Var.getPosition();
                long j12 = this.f5300m;
                if (position4 < j12) {
                    y80Var.mo2423m((int) (j12 - position4));
                }
            }
        }
        if (this.f5302o == 0) {
            y80Var.mo2422l();
            if (m3572c(y80Var)) {
                i = -1;
            } else {
                dc1Var.m2316F(0);
                int iM2324g4 = dc1Var.m2324g();
                if (((-128000) & iM2324g4) != (((long) this.f5296i) & (-128000)) || hp0.m3228x(iM2324g4) == -1) {
                    y80Var.mo2423m(1);
                    this.f5296i = 0;
                } else {
                    r61Var.m5716a(iM2324g4);
                    if (this.f5298k == -9223372036854775807L) {
                        this.f5298k = this.f5303p.mo2725d(y80Var.getPosition());
                    }
                    this.f5302o = r61Var.f9743b;
                    this.f5301n = y80Var.getPosition() + ((long) r61Var.f9743b);
                    if (this.f5303p instanceof hn0) {
                        long j13 = ((this.f5299l + ((long) r61Var.f9747f)) * j) / ((long) r61Var.f9744c);
                        throw th;
                    }
                    iMo1116c = this.f5295h.mo1116c(y80Var, this.f5302o, true);
                    if (iMo1116c == -1) {
                        i = -1;
                    } else {
                        i3 = this.f5302o - iMo1116c;
                        this.f5302o = i3;
                        if (i3 <= 0) {
                            this.f5295h.mo1114a(((this.f5299l * j) / ((long) r61Var.f9744c)) + this.f5298k, 1, r61Var.f9743b, 0, null);
                            this.f5299l += (long) r61Var.f9747f;
                            this.f5302o = 0;
                            i = 0;
                        }
                    }
                }
                i = 0;
            }
        } else {
            iMo1116c = this.f5295h.mo1116c(y80Var, this.f5302o, true);
            if (iMo1116c == -1) {
                i = -1;
            } else {
                i3 = this.f5302o - iMo1116c;
                this.f5302o = i3;
                if (i3 <= 0) {
                    i = 0;
                } else {
                    this.f5295h.mo1114a(((this.f5299l * j) / ((long) r61Var.f9744c)) + this.f5298k, 1, r61Var.f9743b, 0, null);
                    this.f5299l += (long) r61Var.f9747f;
                    this.f5302o = 0;
                    i = 0;
                }
            }
        }
        i2 = -1;
        if (i == i2) {
            oq1 oq1Var2 = this.f5303p;
            if (oq1Var2 instanceof hn0) {
                if (oq1Var2.mo8j() != ((this.f5299l * j) / ((long) r61Var.f9744c)) + this.f5298k) {
                    ((hn0) this.f5303p).getClass();
                    throw th;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3572c(y80 y80Var) {
        oq1 oq1Var = this.f5303p;
        if (oq1Var != null) {
            long jMo2724a = oq1Var.mo2724a();
            if (jMo2724a == -1 || y80Var.mo2417f() <= jMo2724a - 4) {
            }
            return true;
        }
        try {
            return !y80Var.mo2416e(this.f5288a.f2882a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3573d(y80 y80Var, boolean z) throws EOFException {
        int iMo2417f;
        int i;
        int iM3228x;
        int i2 = z ? 32768 : OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING;
        y80Var.mo2422l();
        if (y80Var.getPosition() == 0) {
            dc1 dc1Var = this.f5291d.f1862a;
            int i3 = 0;
            k51 k51VarM193f0 = null;
            while (true) {
                try {
                    y80Var.mo2413a(0, 10, dc1Var.f2882a);
                    dc1Var.m2316F(0);
                    if (dc1Var.m2340w() != 4801587) {
                        break;
                    }
                    dc1Var.m2317G(3);
                    int iM2336s = dc1Var.m2336s();
                    int i4 = iM2336s + 10;
                    if (k51VarM193f0 == null) {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(dc1Var.f2882a, 0, bArr, 0, 10);
                        y80Var.mo2413a(10, iM2336s, bArr);
                        k51VarM193f0 = new am0(null).m193f0(i4, bArr);
                    } else {
                        y80Var.mo2418g(iM2336s);
                    }
                    i3 += i4;
                } catch (EOFException unused) {
                }
            }
            y80Var.mo2422l();
            y80Var.mo2418g(i3);
            this.f5297j = k51VarM193f0;
            if (k51VarM193f0 != null) {
                this.f5290c.m6928b(k51VarM193f0);
            }
            iMo2417f = (int) y80Var.mo2417f();
            if (!z) {
                y80Var.mo2423m(iMo2417f);
            }
            i = 0;
        } else {
            iMo2417f = 0;
            i = 0;
        }
        int i5 = i;
        int i6 = i5;
        while (true) {
            if (m3572c(y80Var)) {
                if (i5 > 0) {
                    break;
                }
                m3571a();
                f40.m2708d();
                return false;
            }
            dc1 dc1Var2 = this.f5288a;
            dc1Var2.m2316F(0);
            int iM2324g = dc1Var2.m2324g();
            if ((i == 0 || ((-128000) & iM2324g) == (((long) i) & (-128000))) && (iM3228x = hp0.m3228x(iM2324g)) != -1) {
                i5++;
                if (i5 != 1) {
                    if (i5 == 4) {
                        break;
                    }
                } else {
                    this.f5289b.m5716a(iM2324g);
                    i = iM2324g;
                }
                y80Var.mo2418g(iM3228x - 4);
            } else {
                int i7 = i6 + 1;
                if (i6 == i2) {
                    if (z) {
                        return false;
                    }
                    m3571a();
                    f40.m2708d();
                    return false;
                }
                if (z) {
                    y80Var.mo2422l();
                    y80Var.mo2418g(iMo2417f + i7);
                } else {
                    y80Var.mo2423m(1);
                }
                i5 = 0;
                i6 = i7;
                i = 0;
            }
        }
        if (z) {
            y80Var.mo2423m(iMo2417f + i6);
        } else {
            y80Var.mo2422l();
        }
        this.f5296i = i;
        return true;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        return m3573d(y80Var, true);
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f5296i = 0;
        this.f5298k = -9223372036854775807L;
        this.f5299l = 0L;
        this.f5302o = 0;
        this.f5306s = j2;
        if (this.f5303p instanceof hn0) {
            throw null;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f5293f = z80Var;
        c22 c22VarMo750n = z80Var.mo750n(0, 1);
        this.f5294g = c22VarMo750n;
        this.f5295h = c22VarMo750n;
        this.f5293f.mo748k();
    }

    @Override // p000.x80
    public final void release() {
    }
}
