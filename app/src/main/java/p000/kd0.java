package p000;

import com.example.ssmousepro.injection.InjectionProtocol;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 implements x80 {

    /* JADX INFO: renamed from: a */
    public final dc1 f5758a = new dc1(4);

    /* JADX INFO: renamed from: b */
    public final dc1 f5759b = new dc1(9);

    /* JADX INFO: renamed from: c */
    public final dc1 f5760c = new dc1(11);

    /* JADX INFO: renamed from: d */
    public final dc1 f5761d = new dc1();

    /* JADX INFO: renamed from: e */
    public final up1 f5762e;

    /* JADX INFO: renamed from: f */
    public z80 f5763f;

    /* JADX INFO: renamed from: g */
    public int f5764g;

    /* JADX INFO: renamed from: h */
    public boolean f5765h;

    /* JADX INFO: renamed from: i */
    public long f5766i;

    /* JADX INFO: renamed from: j */
    public int f5767j;

    /* JADX INFO: renamed from: k */
    public int f5768k;

    /* JADX INFO: renamed from: l */
    public int f5769l;

    /* JADX INFO: renamed from: m */
    public long f5770m;

    /* JADX INFO: renamed from: n */
    public boolean f5771n;

    /* JADX INFO: renamed from: o */
    public C1475uc f5772o;

    /* JADX INFO: renamed from: p */
    public n62 f5773p;

    public kd0() {
        up1 up1Var = new up1(new t20(), 2);
        up1Var.f11383c = -9223372036854775807L;
        up1Var.f11384d = new long[0];
        up1Var.f11385e = new long[0];
        this.f5762e = up1Var;
        this.f5764g = 1;
    }

    /* JADX INFO: renamed from: a */
    public final dc1 m3818a(y80 y80Var) {
        int i = this.f5769l;
        dc1 dc1Var = this.f5761d;
        byte[] bArr = dc1Var.f2882a;
        if (i > bArr.length) {
            dc1Var.m2314D(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            dc1Var.m2316F(0);
        }
        dc1Var.m2315E(this.f5769l);
        y80Var.readFully(dc1Var.f2882a, 0, this.f5769l);
        return dc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:139:0x0383  */
    /* JADX WARN: Code duplicated, block: B:145:0x0398  */
    /* JADX WARN: Code duplicated, block: B:146:0x039c  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x028e  */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        long j4;
        int i2;
        ki0.m3866j(this.f5763f);
        while (true) {
            int i3 = this.f5764g;
            if (i3 == 1) {
                dc1 dc1Var = this.f5759b;
                if (!y80Var.mo2414b(dc1Var.f2882a, 0, 9, true)) {
                    return -1;
                }
                dc1Var.m2316F(0);
                dc1Var.m2317G(4);
                int iM2337t = dc1Var.m2337t();
                boolean z4 = (iM2337t & 4) != 0;
                boolean z5 = (iM2337t & 1) != 0;
                if (z4 && this.f5772o == null) {
                    i2 = 2;
                    this.f5772o = new C1475uc(this.f5763f.mo750n(8, 1), 2);
                } else {
                    i2 = 2;
                }
                if (z5 && this.f5773p == null) {
                    this.f5773p = new n62(this.f5763f.mo750n(9, i2));
                }
                this.f5763f.mo748k();
                this.f5767j = dc1Var.m2324g() - 5;
                this.f5764g = i2;
            } else if (i3 == 2) {
                y80Var.mo2423m(this.f5767j);
                this.f5767j = 0;
                this.f5764g = 3;
            } else if (i3 == 3) {
                dc1 dc1Var2 = this.f5760c;
                if (!y80Var.mo2414b(dc1Var2.f2882a, 0, 11, true)) {
                    return -1;
                }
                dc1Var2.m2316F(0);
                this.f5768k = dc1Var2.m2337t();
                this.f5769l = dc1Var2.m2340w();
                this.f5770m = dc1Var2.m2340w();
                this.f5770m = (((long) (dc1Var2.m2337t() << 24)) | this.f5770m) * 1000;
                dc1Var2.m2317G(3);
                this.f5764g = 4;
            } else {
                if (i3 != 4) {
                    l41.m4046o();
                    return 0;
                }
                boolean z6 = this.f5765h;
                up1 up1Var = this.f5762e;
                if (z6) {
                    j = this.f5766i + this.f5770m;
                } else {
                    if (up1Var.f11383c == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.f5770m;
                    }
                    i = this.f5768k;
                    if (i == 8 || this.f5772o == null) {
                        int i4 = 4;
                        if (i == 9 || this.f5773p == null) {
                            j3 = -9223372036854775807L;
                            if (i == 18 || this.f5771n) {
                                y80Var.mo2423m(this.f5769l);
                                z = false;
                                z2 = false;
                            } else {
                                dc1 dc1VarM3818a = m3818a(y80Var);
                                up1Var.getClass();
                                if (dc1VarM3818a.m2337t() == 2 && "onMetaData".equals(up1.m6521k(dc1VarM3818a)) && dc1VarM3818a.m2318a() != 0 && dc1VarM3818a.m2337t() == 8) {
                                    HashMap mapM6520j = up1.m6520j(dc1VarM3818a);
                                    Object obj = mapM6520j.get("duration");
                                    if (obj instanceof Double) {
                                        double dDoubleValue = ((Double) obj).doubleValue();
                                        if (dDoubleValue > 0.0d) {
                                            up1Var.f11383c = (long) (dDoubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = mapM6520j.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            up1Var.f11384d = new long[size];
                                            up1Var.f11385e = new long[size];
                                            for (int i5 = 0; i5 < size; i5++) {
                                                Object obj5 = list.get(i5);
                                                Object obj6 = list2.get(i5);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    up1Var.f11384d = new long[0];
                                                    up1Var.f11385e = new long[0];
                                                    break;
                                                }
                                                up1Var.f11384d[i5] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                up1Var.f11385e[i5] = ((Double) obj5).longValue();
                                            }
                                        }
                                    }
                                }
                                long j5 = up1Var.f11383c;
                                if (j5 != -9223372036854775807L) {
                                    this.f5763f.mo752q(new gn0(up1Var.f11385e, up1Var.f11384d, j5));
                                    this.f5771n = true;
                                }
                                z2 = true;
                                z = false;
                            }
                        } else {
                            if (!this.f5771n) {
                                this.f5763f.mo752q(new C0825ke(-9223372036854775807L));
                                this.f5771n = true;
                            }
                            n62 n62Var = this.f5773p;
                            dc1 dc1VarM3818a2 = m3818a(y80Var);
                            n62Var.getClass();
                            int iM2337t2 = dc1VarM3818a2.m2337t();
                            int i6 = (iM2337t2 >> 4) & 15;
                            int i7 = iM2337t2 & 15;
                            if (i7 != 7) {
                                throw new cz1(jd0.m3609g(i7, "Video format not supported: "));
                            }
                            n62Var.f7297h = i6;
                            if (i6 != 5) {
                                dc1 dc1Var3 = n62Var.f7292c;
                                c22 c22Var = (c22) n62Var.f2692b;
                                dc1 dc1Var4 = n62Var.f7293d;
                                int iM2337t3 = dc1VarM3818a2.m2337t();
                                byte[] bArr = dc1VarM3818a2.f2882a;
                                j3 = -9223372036854775807L;
                                int i8 = dc1VarM3818a2.f2883b;
                                int i9 = i8 + 1;
                                dc1VarM3818a2.f2883b = i9;
                                int i10 = ((bArr[i8] & 255) << 24) >> 8;
                                int i11 = i8 + 2;
                                dc1VarM3818a2.f2883b = i11;
                                int i12 = i10 | ((bArr[i9] & 255) << 8);
                                dc1VarM3818a2.f2883b = i8 + 3;
                                long j6 = (((long) (i12 | (bArr[i11] & 255))) * 1000) + j2;
                                if (iM2337t3 != 0 || n62Var.f7295f) {
                                    if (iM2337t3 == 1 && n62Var.f7295f) {
                                        int i13 = n62Var.f7297h == 1 ? 1 : 0;
                                        if (n62Var.f7296g || i13 != 0) {
                                            byte[] bArr2 = dc1Var4.f2882a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i14 = 4 - n62Var.f7294e;
                                            int i15 = 0;
                                            while (dc1VarM3818a2.m2318a() > 0) {
                                                dc1VarM3818a2.m2322e(i14, n62Var.f7294e, dc1Var4.f2882a);
                                                dc1Var4.m2316F(0);
                                                int iM2341x = dc1Var4.m2341x();
                                                dc1Var3.m2316F(0);
                                                c22Var.mo1115b(dc1Var3, i4, 0);
                                                c22Var.mo1115b(dc1VarM3818a2, iM2341x, 0);
                                                i15 = i15 + 4 + iM2341x;
                                                i4 = 4;
                                            }
                                            ((c22) n62Var.f2692b).mo1114a(j6, i13, i15, 0, null);
                                            n62Var.f7296g = true;
                                            z3 = true;
                                        }
                                    }
                                    z = z3;
                                    z2 = true;
                                } else {
                                    byte[] bArr3 = new byte[dc1VarM3818a2.m2318a()];
                                    dc1 dc1Var5 = new dc1(bArr3);
                                    dc1VarM3818a2.m2322e(0, dc1VarM3818a2.m2318a(), bArr3);
                                    C0748ie c0748ieM3425a = C0748ie.m3425a(dc1Var5);
                                    n62Var.f7294e = c0748ieM3425a.f4989b;
                                    ae0 ae0Var = new ae0();
                                    ae0Var.f197m = v51.m6582l("video/avc");
                                    ae0Var.f194j = c0748ieM3425a.f4999l;
                                    ae0Var.f204t = c0748ieM3425a.f4990c;
                                    ae0Var.f205u = c0748ieM3425a.f4991d;
                                    ae0Var.f208x = c0748ieM3425a.f4998k;
                                    ae0Var.f200p = c0748ieM3425a.f4988a;
                                    c22Var.mo1117d(new be0(ae0Var));
                                    n62Var.f7295f = true;
                                }
                                z3 = false;
                                if (z3) {
                                }
                                z2 = true;
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            z2 = true;
                        }
                    } else {
                        if (!this.f5771n) {
                            this.f5763f.mo752q(new C0825ke(-9223372036854775807L));
                            this.f5771n = true;
                        }
                        C1475uc c1475uc = this.f5772o;
                        dc1 dc1VarM3818a3 = m3818a(y80Var);
                        c22 c22Var2 = (c22) c1475uc.f2692b;
                        if (c1475uc.f11252c) {
                            dc1VarM3818a3.m2317G(1);
                        } else {
                            int iM2337t4 = dc1VarM3818a3.m2337t();
                            int i16 = (iM2337t4 >> 4) & 15;
                            c1475uc.f11254e = i16;
                            if (i16 == 2) {
                                int i17 = C1475uc.f11251f[(iM2337t4 >> 2) & 3];
                                ae0 ae0Var2 = new ae0();
                                ae0Var2.f197m = v51.m6582l("audio/mpeg");
                                ae0Var2.f175B = 1;
                                ae0Var2.f176C = i17;
                                c22Var2.mo1117d(new be0(ae0Var2));
                                c1475uc.f11253d = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                ae0 ae0Var3 = new ae0();
                                ae0Var3.f197m = v51.m6582l(str);
                                ae0Var3.f175B = 1;
                                ae0Var3.f176C = 8000;
                                c22Var2.mo1117d(new be0(ae0Var3));
                                c1475uc.f11253d = true;
                            } else if (i16 != 10) {
                                throw new cz1("Audio format not supported: " + c1475uc.f11254e);
                            }
                            c1475uc.f11252c = true;
                        }
                        c22 c22Var3 = (c22) c1475uc.f2692b;
                        if (c1475uc.f11254e == 2) {
                            int iM2318a = dc1VarM3818a3.m2318a();
                            c22Var3.mo1115b(dc1VarM3818a3, iM2318a, 0);
                            ((c22) c1475uc.f2692b).mo1114a(j2, 1, iM2318a, 0, null);
                        } else {
                            int iM2337t5 = dc1VarM3818a3.m2337t();
                            if (iM2337t5 != 0 || c1475uc.f11253d) {
                                if (c1475uc.f11254e != 10 || iM2337t5 == 1) {
                                    int iM2318a2 = dc1VarM3818a3.m2318a();
                                    c22Var3.mo1115b(dc1VarM3818a3, iM2318a2, 0);
                                    ((c22) c1475uc.f2692b).mo1114a(j2, 1, iM2318a2, 0, null);
                                }
                                z2 = true;
                                j3 = -9223372036854775807L;
                            } else {
                                int iM2318a3 = dc1VarM3818a3.m2318a();
                                byte[] bArr4 = new byte[iM2318a3];
                                dc1VarM3818a3.m2322e(0, iM2318a3, bArr4);
                                C0586e0 c0586e0M3845P = ki0.m3845P(new C0141cm(bArr4, iM2318a3), false);
                                ae0 ae0Var4 = new ae0();
                                ae0Var4.f197m = v51.m6582l("audio/mp4a-latm");
                                ae0Var4.f194j = c0586e0M3845P.f3087a;
                                ae0Var4.f175B = c0586e0M3845P.f3089c;
                                ae0Var4.f176C = c0586e0M3845P.f3088b;
                                ae0Var4.f200p = Collections.singletonList(bArr4);
                                c22Var3.mo1117d(new be0(ae0Var4));
                                c1475uc.f11253d = true;
                            }
                            z = false;
                            z2 = true;
                            j3 = -9223372036854775807L;
                        }
                        z = true;
                        z2 = true;
                        j3 = -9223372036854775807L;
                    }
                    if (!this.f5765h && z) {
                        this.f5765h = true;
                        if (up1Var.f11383c == j3) {
                            j4 = -this.f5770m;
                        } else {
                            j4 = 0;
                        }
                        this.f5766i = j4;
                    }
                    this.f5767j = 4;
                    this.f5764g = 2;
                    if (z2) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.f5768k;
                if (i == 8) {
                    int i18 = 4;
                    if (i == 9) {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        } else {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        }
                    } else {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        } else {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        }
                    }
                } else {
                    int i19 = 4;
                    if (i == 9) {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        } else {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        }
                    } else {
                        j3 = -9223372036854775807L;
                        if (i == 18) {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        } else {
                            y80Var.mo2423m(this.f5769l);
                            z = false;
                            z2 = false;
                        }
                    }
                }
                if (!this.f5765h) {
                    this.f5765h = true;
                    if (up1Var.f11383c == j3) {
                        j4 = -this.f5770m;
                    } else {
                        j4 = 0;
                    }
                    this.f5766i = j4;
                }
                this.f5767j = 4;
                this.f5764g = 2;
                if (z2) {
                    return 0;
                }
            }
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        dc1 dc1Var = this.f5758a;
        C0584dz c0584dz = (C0584dz) y80Var;
        c0584dz.mo2416e(dc1Var.f2882a, 0, 3, false);
        dc1Var.m2316F(0);
        if (dc1Var.m2340w() == 4607062) {
            c0584dz.mo2416e(dc1Var.f2882a, 0, 2, false);
            dc1Var.m2316F(0);
            if ((dc1Var.m2343z() & InjectionProtocol.MOUSE_POLL_HZ_PADRAO) == 0) {
                c0584dz.mo2416e(dc1Var.f2882a, 0, 4, false);
                dc1Var.m2316F(0);
                int iM2324g = dc1Var.m2324g();
                c0584dz.f3082f = 0;
                c0584dz.m2421k(iM2324g, false);
                c0584dz.mo2416e(dc1Var.f2882a, 0, 4, false);
                dc1Var.m2316F(0);
                if (dc1Var.m2324g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        if (j == 0) {
            this.f5764g = 1;
            this.f5765h = false;
        } else {
            this.f5764g = 3;
        }
        this.f5767j = 0;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        this.f5763f = z80Var;
    }

    @Override // p000.x80
    public final void release() {
    }
}
