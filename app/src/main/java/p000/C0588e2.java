package p000;

import java.util.Objects;

/* JADX INFO: renamed from: e2 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0588e2 implements m50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3158a;

    /* JADX INFO: renamed from: b */
    public final C0141cm f3159b;

    /* JADX INFO: renamed from: c */
    public final dc1 f3160c;

    /* JADX INFO: renamed from: d */
    public final String f3161d;

    /* JADX INFO: renamed from: e */
    public final int f3162e;

    /* JADX INFO: renamed from: f */
    public String f3163f;

    /* JADX INFO: renamed from: g */
    public c22 f3164g;

    /* JADX INFO: renamed from: h */
    public int f3165h;

    /* JADX INFO: renamed from: i */
    public int f3166i;

    /* JADX INFO: renamed from: j */
    public boolean f3167j;

    /* JADX INFO: renamed from: k */
    public long f3168k;

    /* JADX INFO: renamed from: l */
    public be0 f3169l;

    /* JADX INFO: renamed from: m */
    public int f3170m;

    /* JADX INFO: renamed from: n */
    public long f3171n;

    public C0588e2(String str, int i, int i2) {
        this.f3158a = i2;
        switch (i2) {
            case 1:
                C0141cm c0141cm = new C0141cm(new byte[16], 16);
                this.f3159b = c0141cm;
                this.f3160c = new dc1(c0141cm.f1858b);
                this.f3165h = 0;
                this.f3166i = 0;
                this.f3167j = false;
                this.f3171n = -9223372036854775807L;
                this.f3161d = str;
                this.f3162e = i;
                break;
            default:
                C0141cm c0141cm2 = new C0141cm(new byte[128], 128);
                this.f3159b = c0141cm2;
                this.f3160c = new dc1(c0141cm2.f1858b);
                this.f3165h = 0;
                this.f3171n = -9223372036854775807L;
                this.f3161d = str;
                this.f3162e = i;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x035e  */
    /* JADX WARN: Code duplicated, block: B:186:0x036c  */
    /* JADX WARN: Code duplicated, block: B:188:0x0374  */
    /* JADX WARN: Code duplicated, block: B:195:0x0388  */
    /* JADX WARN: Code duplicated, block: B:197:0x038c  */
    /* JADX WARN: Code duplicated, block: B:198:0x0391  */
    /* JADX WARN: Code duplicated, block: B:200:0x0394  */
    /* JADX WARN: Code duplicated, block: B:202:0x039a  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:205:0x03a6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iM1238i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        dc1Var = dc1Var;
        int i18 = this.f3158a;
        int i19 = this.f3162e;
        String str2 = this.f3161d;
        C0141cm c0141cm = this.f3159b;
        long j2 = -9223372036854775807L;
        int i20 = 0;
        int i21 = 1;
        int i22 = 2;
        dc1 dc1Var2 = this.f3160c;
        int i23 = 16;
        switch (i18) {
            case 0:
                ki0.m3866j(this.f3164g);
                while (dc1Var.m2318a() > 0) {
                    int i24 = this.f3165h;
                    if (i24 == 0) {
                        while (true) {
                            if (dc1Var.m2318a() <= 0) {
                                i20 = 0;
                                i21 = 1;
                                i22 = 2;
                            } else if (this.f3167j) {
                                int iM2337t = dc1Var.m2337t();
                                if (iM2337t == 119) {
                                    this.f3167j = false;
                                    this.f3165h = 1;
                                    byte[] bArr = dc1Var2.f2882a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f3166i = 2;
                                    i21 = 1;
                                    i22 = 2;
                                    i20 = 0;
                                } else {
                                    this.f3167j = iM2337t == 11;
                                }
                            } else {
                                this.f3167j = dc1Var.m2337t() == 11;
                            }
                        }
                    } else if (i24 == i21) {
                        byte[] bArr2 = dc1Var2.f2882a;
                        int iMin = Math.min(dc1Var.m2318a(), 128 - this.f3166i);
                        dc1Var.m2322e(this.f3166i, iMin, bArr2);
                        int i25 = this.f3166i + iMin;
                        this.f3166i = i25;
                        if (i25 == 128) {
                            c0141cm.m1246q(i20);
                            int[] iArr = hp0.f4640d;
                            int[] iArr2 = hp0.f4638b;
                            int iM1236g = c0141cm.m1236g();
                            c0141cm.m1249t(40);
                            int i26 = c0141cm.m1238i(5) > 10 ? i21 : 0;
                            c0141cm.m1246q(iM1236g);
                            if (i26 != 0) {
                                c0141cm.m1249t(i23);
                                int iM1238i2 = c0141cm.m1238i(i22);
                                if (iM1238i2 == 0) {
                                    i6 = 0;
                                } else if (iM1238i2 != i21) {
                                    i6 = iM1238i2 != i22 ? -1 : i22;
                                } else {
                                    i6 = i21;
                                }
                                c0141cm.m1249t(3);
                                iM1238i = (c0141cm.m1238i(11) + i21) * i22;
                                int iM1238i3 = c0141cm.m1238i(i22);
                                if (iM1238i3 == 3) {
                                    i5 = hp0.f4639c[c0141cm.m1238i(i22)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int iM1238i4 = c0141cm.m1238i(i22);
                                    int i27 = hp0.f4637a[iM1238i4];
                                    i5 = iArr2[iM1238i3];
                                    i7 = iM1238i4;
                                    i8 = i27;
                                }
                                i4 = i8 * 256;
                                int i28 = (iM1238i * i5) / (i8 * 32);
                                int iM1238i5 = c0141cm.m1238i(3);
                                boolean zM1237h = c0141cm.m1237h();
                                i3 = iArr[iM1238i5] + (zM1237h ? 1 : 0);
                                c0141cm.m1249t(10);
                                if (c0141cm.m1237h()) {
                                    c0141cm.m1249t(8);
                                }
                                if (iM1238i5 == 0) {
                                    c0141cm.m1249t(5);
                                    if (c0141cm.m1237h()) {
                                        c0141cm.m1249t(8);
                                    }
                                }
                                if (i6 == 1 && c0141cm.m1237h()) {
                                    c0141cm.m1249t(16);
                                }
                                if (c0141cm.m1237h()) {
                                    if (iM1238i5 > 2) {
                                        c0141cm.m1249t(2);
                                    }
                                    if ((iM1238i5 & 1) == 0 || iM1238i5 <= 2) {
                                        i13 = 6;
                                    } else {
                                        i13 = 6;
                                        c0141cm.m1249t(6);
                                    }
                                    if ((iM1238i5 & 4) != 0) {
                                        c0141cm.m1249t(i13);
                                    }
                                    if (zM1237h && c0141cm.m1237h()) {
                                        c0141cm.m1249t(5);
                                    }
                                    if (i6 != 0) {
                                        i9 = i7;
                                    } else {
                                        if (c0141cm.m1237h()) {
                                            i14 = 6;
                                            c0141cm.m1249t(6);
                                        } else {
                                            i14 = 6;
                                        }
                                        if (iM1238i5 == 0 && c0141cm.m1237h()) {
                                            c0141cm.m1249t(i14);
                                        }
                                        if (c0141cm.m1237h()) {
                                            c0141cm.m1249t(i14);
                                        }
                                        int iM1238i6 = c0141cm.m1238i(2);
                                        if (iM1238i6 == 1) {
                                            c0141cm.m1249t(5);
                                        } else if (iM1238i6 == 2) {
                                            c0141cm.m1249t(12);
                                        } else {
                                            if (iM1238i6 == 3) {
                                                int iM1238i7 = c0141cm.m1238i(5);
                                                if (c0141cm.m1237h()) {
                                                    c0141cm.m1249t(5);
                                                    if (c0141cm.m1237h()) {
                                                        i16 = 4;
                                                        c0141cm.m1249t(4);
                                                    } else {
                                                        i16 = 4;
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(i16);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(i16);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(i16);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(i16);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(i16);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(i16);
                                                    }
                                                    if (c0141cm.m1237h()) {
                                                        if (c0141cm.m1237h()) {
                                                            c0141cm.m1249t(i16);
                                                        }
                                                        if (c0141cm.m1237h()) {
                                                            c0141cm.m1249t(i16);
                                                        }
                                                    }
                                                }
                                                if (c0141cm.m1237h()) {
                                                    c0141cm.m1249t(5);
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(7);
                                                        if (c0141cm.m1237h()) {
                                                            c0141cm.m1249t(8);
                                                            i15 = 2;
                                                        } else {
                                                            i15 = 2;
                                                        }
                                                    } else {
                                                        i15 = 2;
                                                    }
                                                } else {
                                                    i15 = 2;
                                                }
                                                c0141cm.m1249t((iM1238i7 + i15) * 8);
                                                c0141cm.m1232c();
                                            }
                                            if (iM1238i5 < i15) {
                                                if (c0141cm.m1237h()) {
                                                    c0141cm.m1249t(14);
                                                }
                                                if (iM1238i5 == 0 && c0141cm.m1237h()) {
                                                    c0141cm.m1249t(14);
                                                }
                                            }
                                            if (c0141cm.m1237h()) {
                                                i9 = i7;
                                                if (i9 == 0) {
                                                    c0141cm.m1249t(5);
                                                } else {
                                                    for (i17 = 0; i17 < i8; i17++) {
                                                        if (c0141cm.m1237h()) {
                                                            c0141cm.m1249t(5);
                                                        }
                                                    }
                                                }
                                            } else {
                                                i9 = i7;
                                            }
                                        }
                                        i15 = 2;
                                        if (iM1238i5 < i15) {
                                            if (c0141cm.m1237h()) {
                                                c0141cm.m1249t(14);
                                            }
                                            if (iM1238i5 == 0) {
                                                c0141cm.m1249t(14);
                                            }
                                        }
                                        if (c0141cm.m1237h()) {
                                            i9 = i7;
                                            if (i9 == 0) {
                                                c0141cm.m1249t(5);
                                            } else {
                                                while (i17 < i8) {
                                                    if (c0141cm.m1237h()) {
                                                        c0141cm.m1249t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i9 = i7;
                                        }
                                    }
                                } else {
                                    i9 = i7;
                                }
                                if (c0141cm.m1237h()) {
                                    c0141cm.m1249t(5);
                                    if (iM1238i5 == 2) {
                                        c0141cm.m1249t(4);
                                    }
                                    if (iM1238i5 >= 6) {
                                        c0141cm.m1249t(2);
                                    }
                                    if (c0141cm.m1237h()) {
                                        i12 = 8;
                                        c0141cm.m1249t(8);
                                    } else {
                                        i12 = 8;
                                    }
                                    if (iM1238i5 == 0 && c0141cm.m1237h()) {
                                        c0141cm.m1249t(i12);
                                    }
                                    i10 = 3;
                                    if (iM1238i3 < 3) {
                                        c0141cm.m1248s();
                                    }
                                } else {
                                    i10 = 3;
                                }
                                if (i6 == 0 && i9 != i10) {
                                    c0141cm.m1248s();
                                }
                                if (i6 == 2 && (i9 == i10 || c0141cm.m1237h())) {
                                    i11 = 6;
                                    c0141cm.m1249t(6);
                                } else {
                                    i11 = 6;
                                }
                                str = (c0141cm.m1237h() && c0141cm.m1238i(i11) == 1 && c0141cm.m1238i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i28;
                            } else {
                                c0141cm.m1249t(32);
                                int iM1238i8 = c0141cm.m1238i(2);
                                String str3 = iM1238i8 == 3 ? null : "audio/ac3";
                                int iM1238i9 = c0141cm.m1238i(6);
                                i = hp0.f4641e[iM1238i9 / 2] * 1000;
                                int iM3225t = hp0.m3225t(iM1238i8, iM1238i9);
                                c0141cm.m1249t(8);
                                int iM1238i10 = c0141cm.m1238i(3);
                                if ((iM1238i10 & 1) == 0 || iM1238i10 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    c0141cm.m1249t(2);
                                }
                                if ((iM1238i10 & 4) != 0) {
                                    c0141cm.m1249t(i2);
                                }
                                if (iM1238i10 == i2) {
                                    c0141cm.m1249t(i2);
                                }
                                int i29 = iM1238i8 < 3 ? iArr2[iM1238i8] : -1;
                                i3 = iArr[iM1238i10] + (c0141cm.m1237h() ? 1 : 0);
                                i4 = 1536;
                                str = str3;
                                iM1238i = iM3225t;
                                i5 = i29;
                            }
                            be0 be0Var = this.f3169l;
                            if (be0Var == null || i3 != be0Var.f1317C || i5 != be0Var.f1318D || !Objects.equals(str, be0Var.f1341n)) {
                                ae0 ae0Var = new ae0();
                                ae0Var.f185a = this.f3163f;
                                ae0Var.f197m = v51.m6582l(str);
                                ae0Var.f175B = i3;
                                ae0Var.f176C = i5;
                                ae0Var.f188d = str2;
                                ae0Var.f190f = i19;
                                ae0Var.f193i = i;
                                if ("audio/ac3".equals(str)) {
                                    ae0Var.f192h = i;
                                }
                                be0 be0Var2 = new be0(ae0Var);
                                this.f3169l = be0Var2;
                                this.f3164g.mo1117d(be0Var2);
                            }
                            this.f3170m = iM1238i;
                            this.f3168k = (((long) i4) * 1000000) / ((long) this.f3169l.f1318D);
                            dc1Var2.m2316F(0);
                            this.f3164g.mo1115b(dc1Var2, 128, 0);
                            this.f3165h = 2;
                            i22 = 2;
                            i20 = 0;
                            i21 = 1;
                        } else {
                            dc1Var = dc1Var;
                        }
                    } else if (i24 == i22) {
                        int iMin2 = Math.min(dc1Var.m2318a(), this.f3170m - this.f3166i);
                        this.f3164g.mo1115b(dc1Var, iMin2, i20);
                        int i30 = this.f3166i + iMin2;
                        this.f3166i = i30;
                        if (i30 == this.f3170m) {
                            ki0.m3864h(this.f3171n != -9223372036854775807L ? i21 : i20);
                            this.f3164g.mo1114a(this.f3171n, 1, this.f3170m, 0, null);
                            this.f3171n += this.f3168k;
                            this.f3165h = i20;
                        }
                    }
                    i23 = 16;
                }
                break;
            default:
                ki0.m3866j(this.f3164g);
                while (dc1Var.m2318a() > 0) {
                    int i31 = this.f3165h;
                    if (i31 == 0) {
                        j = j2;
                        while (dc1Var.m2318a() > 0) {
                            if (this.f3167j) {
                                int iM2337t2 = dc1Var.m2337t();
                                this.f3167j = iM2337t2 == 172;
                                if (iM2337t2 == 64 || iM2337t2 == 65) {
                                    byte b = iM2337t2 == 65;
                                    this.f3165h = 1;
                                    byte[] bArr3 = dc1Var2.f2882a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (b == true ? 65 : 64);
                                    this.f3166i = 2;
                                }
                            } else {
                                this.f3167j = dc1Var.m2337t() == 172;
                            }
                        }
                    } else if (i31 == 1) {
                        j = j2;
                        byte[] bArr4 = dc1Var2.f2882a;
                        int iMin3 = Math.min(dc1Var.m2318a(), 16 - this.f3166i);
                        dc1Var.m2322e(this.f3166i, iMin3, bArr4);
                        int i32 = this.f3166i + iMin3;
                        this.f3166i = i32;
                        if (i32 == 16) {
                            c0141cm.m1246q(0);
                            C0699h2 c0699h2M4657e0 = o21.m4657e0(c0141cm);
                            int i33 = c0699h2M4657e0.f4392a;
                            be0 be0Var3 = this.f3169l;
                            if (be0Var3 == null || 2 != be0Var3.f1317C || i33 != be0Var3.f1318D || !"audio/ac4".equals(be0Var3.f1341n)) {
                                ae0 ae0Var2 = new ae0();
                                ae0Var2.f185a = this.f3163f;
                                ae0Var2.f197m = v51.m6582l("audio/ac4");
                                ae0Var2.f175B = 2;
                                ae0Var2.f176C = i33;
                                ae0Var2.f188d = str2;
                                ae0Var2.f190f = i19;
                                be0 be0Var4 = new be0(ae0Var2);
                                this.f3169l = be0Var4;
                                this.f3164g.mo1117d(be0Var4);
                            }
                            this.f3170m = c0699h2M4657e0.f4393b;
                            this.f3168k = (((long) c0699h2M4657e0.f4394c) * 1000000) / ((long) this.f3169l.f1318D);
                            dc1Var2.m2316F(0);
                            this.f3164g.mo1115b(dc1Var2, 16, 0);
                            this.f3165h = 2;
                        }
                    } else if (i31 == 2) {
                        int iMin4 = Math.min(dc1Var.m2318a(), this.f3170m - this.f3166i);
                        this.f3164g.mo1115b(dc1Var, iMin4, 0);
                        int i34 = this.f3166i + iMin4;
                        this.f3166i = i34;
                        if (i34 == this.f3170m) {
                            ki0.m3864h(this.f3171n != j2);
                            this.f3164g.mo1114a(this.f3171n, 1, this.f3170m, 0, null);
                            j = j2;
                            this.f3171n += this.f3168k;
                            this.f3165h = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        switch (this.f3158a) {
            case 0:
                this.f3165h = 0;
                this.f3166i = 0;
                this.f3167j = false;
                this.f3171n = -9223372036854775807L;
                break;
            default:
                this.f3165h = 0;
                this.f3166i = 0;
                this.f3167j = false;
                this.f3171n = -9223372036854775807L;
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
        int i = this.f3158a;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        switch (this.f3158a) {
            case 0:
                this.f3171n = j;
                break;
            default:
                this.f3171n = j;
                break;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        switch (this.f3158a) {
            case 0:
                qk0Var.m5498a();
                qk0Var.m5500c();
                this.f3163f = (String) qk0Var.f9523e;
                qk0Var.m5500c();
                this.f3164g = z80Var.mo750n(qk0Var.f9521c, 1);
                break;
            default:
                qk0Var.m5498a();
                qk0Var.m5500c();
                this.f3163f = (String) qk0Var.f9523e;
                qk0Var.m5500c();
                this.f3164g = z80Var.mo750n(qk0Var.f9521c, 1);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m2448b(boolean z) {
    }

    /* JADX INFO: renamed from: g */
    private final void m2449g(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0588e2() {
        this(null, 0, 0);
        this.f3158a = 0;
    }
}
