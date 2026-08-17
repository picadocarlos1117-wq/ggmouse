package p000;

import com.example.ssmousepro.injection.InjectionMetrics;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s61 implements m50 {

    /* JADX INFO: renamed from: e */
    public String f10254e;

    /* JADX INFO: renamed from: f */
    public c22 f10255f;

    /* JADX INFO: renamed from: i */
    public boolean f10258i;

    /* JADX INFO: renamed from: k */
    public int f10260k;

    /* JADX INFO: renamed from: l */
    public int f10261l;

    /* JADX INFO: renamed from: n */
    public int f10263n;

    /* JADX INFO: renamed from: o */
    public int f10264o;

    /* JADX INFO: renamed from: s */
    public int f10268s;

    /* JADX INFO: renamed from: u */
    public boolean f10270u;

    /* JADX INFO: renamed from: d */
    public int f10253d = 0;

    /* JADX INFO: renamed from: a */
    public final dc1 f10250a = new dc1(new byte[15], 2);

    /* JADX INFO: renamed from: b */
    public final C0141cm f10251b = new C0141cm();

    /* JADX INFO: renamed from: c */
    public final dc1 f10252c = new dc1();

    /* JADX INFO: renamed from: p */
    public final t61 f10265p = new t61();

    /* JADX INFO: renamed from: q */
    public int f10266q = -2147483647;

    /* JADX INFO: renamed from: r */
    public int f10267r = -1;

    /* JADX INFO: renamed from: t */
    public long f10269t = -1;

    /* JADX INFO: renamed from: j */
    public boolean f10259j = true;

    /* JADX INFO: renamed from: m */
    public boolean f10262m = true;

    /* JADX INFO: renamed from: g */
    public double f10256g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h */
    public double f10257h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b0  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c1, please report this as an issue */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) throws fc1 {
        int i;
        int i2;
        int iM1238i;
        int iM1238i2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        kk1 kk1VarM5571u;
        int iM1238i3;
        long j3;
        boolean z;
        int i4;
        ki0.m3866j(this.f10255f);
        while (dc1Var.m2318a() > 0) {
            int i5 = this.f10253d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                dc1 dc1Var2 = this.f10252c;
                t61 t61Var = this.f10265p;
                if (i5 == 1) {
                    int iM2318a = dc1Var.m2318a();
                    dc1 dc1Var3 = this.f10250a;
                    int iMin = Math.min(iM2318a, dc1Var3.m2318a());
                    dc1Var.m2322e(dc1Var3.f2883b, iMin, dc1Var3.f2882a);
                    dc1Var3.m2317G(iMin);
                    if (dc1Var3.m2318a() == 0) {
                        int i9 = dc1Var3.f2884c;
                        byte[] bArr2 = dc1Var3.f2882a;
                        C0141cm c0141cm = this.f10251b;
                        c0141cm.m1244o(i9, bArr2);
                        c0141cm.m1235f();
                        int iM6044N = sc2.m6044N(c0141cm, 3, 8, 8);
                        t61Var.f10768a = iM6044N;
                        if (iM6044N != -1) {
                            ki0.m3857c(Math.max(Math.max(2, 8), 32) <= 63);
                            rc2.m5791k(rc2.m5791k(3L, 255L), 4294967296L);
                            if (c0141cm.m1231b() < 2) {
                                j3 = -1;
                            } else {
                                long jM1240k = c0141cm.m1240k(2);
                                if (jM1240k == 3) {
                                    if (c0141cm.m1231b() >= 8) {
                                        long jM1240k2 = c0141cm.m1240k(8);
                                        jM1240k += jM1240k2;
                                        if (jM1240k2 == 255) {
                                            if (c0141cm.m1231b() >= 32) {
                                                jM1240k = c0141cm.m1240k(32) + jM1240k;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jM1240k;
                            }
                            t61Var.f10769b = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw fc1.m2800b("Contains sub-stream with an invalid packet label " + t61Var.f10769b);
                                }
                                if (j3 == 0) {
                                    int i10 = t61Var.f10768a;
                                    if (i10 == 1) {
                                        throw fc1.m2799a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw fc1.m2799a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw fc1.m2799a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM6044N2 = sc2.m6044N(c0141cm, 11, 24, 24);
                                t61Var.f10770c = iM6044N2;
                                if (iM6044N2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.f10263n = 0;
                            this.f10264o = t61Var.f10770c + i9 + this.f10264o;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            dc1Var3.m2316F(i4);
                            this.f10255f.mo1115b(dc1Var3, dc1Var3.f2884c, i4);
                            dc1Var3.m2313C(2);
                            dc1Var2.m2313C(t61Var.f10770c);
                            this.f10262m = true;
                            this.f10253d = 2;
                        } else {
                            int i11 = dc1Var3.f2884c;
                            if (i11 < 15) {
                                dc1Var3.m2315E(i11 + 1);
                                this.f10262m = false;
                            }
                        }
                    } else {
                        this.f10262m = false;
                    }
                } else {
                    if (i5 != 2) {
                        l41.m4046o();
                        return;
                    }
                    int i12 = t61Var.f10768a;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = dc1Var.f2883b;
                        int iMin2 = Math.min(dc1Var.m2318a(), dc1Var2.m2318a());
                        dc1Var.m2322e(dc1Var2.f2883b, iMin2, dc1Var2.f2882a);
                        dc1Var2.m2317G(iMin2);
                        dc1Var.m2316F(i13);
                    }
                    int iMin3 = Math.min(dc1Var.m2318a(), t61Var.f10770c - this.f10263n);
                    this.f10255f.mo1115b(dc1Var, iMin3, 0);
                    int i14 = this.f10263n + iMin3;
                    this.f10263n = i14;
                    if (i14 != t61Var.f10770c) {
                        continue;
                    } else {
                        int i15 = t61Var.f10768a;
                        if (i15 == 1) {
                            byte[] bArr3 = dc1Var2.f2882a;
                            C0141cm c0141cm2 = new C0141cm(bArr3, bArr3.length);
                            int iM1238i4 = c0141cm2.m1238i(8);
                            int iM1238i5 = c0141cm2.m1238i(5);
                            if (iM1238i5 != 31) {
                                switch (iM1238i5) {
                                    case 0:
                                        iM1238i2 = 96000;
                                        break;
                                    case 1:
                                        iM1238i2 = 88200;
                                        break;
                                    case 2:
                                        iM1238i2 = 64000;
                                        break;
                                    case 3:
                                        iM1238i2 = 48000;
                                        break;
                                    case 4:
                                        iM1238i2 = 44100;
                                        break;
                                    case 5:
                                        iM1238i2 = 32000;
                                        break;
                                    case 6:
                                        iM1238i2 = 24000;
                                        break;
                                    case 7:
                                        iM1238i2 = 22050;
                                        break;
                                    case 8:
                                        iM1238i2 = 16000;
                                        break;
                                    case 9:
                                        iM1238i2 = 12000;
                                        break;
                                    case 10:
                                        iM1238i2 = 11025;
                                        break;
                                    case 11:
                                        iM1238i2 = 8000;
                                        break;
                                    case 12:
                                        iM1238i2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw fc1.m2800b("Unsupported sampling rate index " + iM1238i5);
                                    case 15:
                                        iM1238i2 = 57600;
                                        break;
                                    case 16:
                                        iM1238i2 = 51200;
                                        break;
                                    case 17:
                                        iM1238i2 = 40000;
                                        break;
                                    case 18:
                                        iM1238i2 = 38400;
                                        break;
                                    case 19:
                                        iM1238i2 = 34150;
                                        break;
                                    case 20:
                                        iM1238i2 = 28800;
                                        break;
                                    case 21:
                                        iM1238i2 = 25600;
                                        break;
                                    case 22:
                                        iM1238i2 = 20000;
                                        break;
                                    case 23:
                                        iM1238i2 = 19200;
                                        break;
                                    case 24:
                                        iM1238i2 = 17075;
                                        break;
                                    case 25:
                                        iM1238i2 = 14400;
                                        break;
                                    case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                                        iM1238i2 = 12800;
                                        break;
                                    case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                                        iM1238i2 = 9600;
                                        break;
                                }
                            } else {
                                iM1238i2 = c0141cm2.m1238i(24);
                            }
                            int iM1238i6 = c0141cm2.m1238i(3);
                            if (iM1238i6 == 0) {
                                i3 = 768;
                            } else if (iM1238i6 == 1) {
                                i3 = 1024;
                            } else if (iM1238i6 == 2 || iM1238i6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iM1238i6 != 4) {
                                    throw fc1.m2800b("Unsupported coreSbrFrameLengthIndex " + iM1238i6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iM1238i6 == 0 || iM1238i6 == 1) {
                                c = 0;
                            } else if (iM1238i6 == 2) {
                                c = 2;
                            } else if (iM1238i6 == 3) {
                                c = 3;
                            } else {
                                if (iM1238i6 != 4) {
                                    throw fc1.m2800b("Unsupported coreSbrFrameLengthIndex " + iM1238i6);
                                }
                                c = 1;
                            }
                            c0141cm2.m1249t(2);
                            sc2.m6049T(c0141cm2);
                            int iM1238i7 = c0141cm2.m1238i(5);
                            int i17 = 0;
                            int iM6044N3 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iM1238i7 + 1) {
                                    int iM1238i8 = c0141cm2.m1238i(3);
                                    iM6044N3 = sc2.m6044N(c0141cm2, 5, 8, 16) + 1 + iM6044N3;
                                    if ((iM1238i8 == 0 || iM1238i8 == 2) && c0141cm2.m1237h()) {
                                        sc2.m6049T(c0141cm2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iM6044N4 = sc2.m6044N(c0141cm2, 4, 8, 16) + 1;
                                    c0141cm2.m1248s();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iM6044N4) {
                                            int iM1238i9 = c0141cm2.m1238i(2);
                                            if (iM1238i9 == 0) {
                                                c0141cm2.m1249t(i7);
                                                if (c0141cm2.m1237h()) {
                                                    c0141cm2.m1249t(13);
                                                }
                                                if (c > 0) {
                                                    sc2.m6048S(c0141cm2);
                                                }
                                            } else if (iM1238i9 == i18) {
                                                c0141cm2.m1249t(i7);
                                                boolean zM1237h = c0141cm2.m1237h();
                                                if (zM1237h) {
                                                    c0141cm2.m1249t(13);
                                                }
                                                if (zM1237h) {
                                                    c0141cm2.m1248s();
                                                }
                                                if (c > 0) {
                                                    sc2.m6048S(c0141cm2);
                                                    iM1238i3 = c0141cm2.m1238i(2);
                                                } else {
                                                    iM1238i3 = 0;
                                                }
                                                if (iM1238i3 > 0) {
                                                    c0141cm2.m1249t(6);
                                                    int iM1238i10 = c0141cm2.m1238i(2);
                                                    c0141cm2.m1249t(4);
                                                    if (c0141cm2.m1237h()) {
                                                        c0141cm2.m1249t(5);
                                                    }
                                                    if (iM1238i3 == 2 || iM1238i3 == i7) {
                                                        c0141cm2.m1249t(6);
                                                    }
                                                    if (iM1238i10 == 2) {
                                                        c0141cm2.m1248s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM6044N3 - 1) / Math.log(2.0d))) + 1;
                                                int iM1238i11 = c0141cm2.m1238i(2);
                                                if (iM1238i11 > 0 && c0141cm2.m1237h()) {
                                                    c0141cm2.m1249t(iFloor);
                                                }
                                                if (c0141cm2.m1237h()) {
                                                    c0141cm2.m1249t(iFloor);
                                                }
                                                if (c == 0 && iM1238i11 == 0) {
                                                    c0141cm2.m1248s();
                                                }
                                            } else if (iM1238i9 == i7) {
                                                sc2.m6044N(c0141cm2, 4, i6, i19);
                                                int iM6044N5 = sc2.m6044N(c0141cm2, 4, i6, i19);
                                                if (c0141cm2.m1237h()) {
                                                    sc2.m6044N(c0141cm2, i6, i19, 0);
                                                }
                                                c0141cm2.m1248s();
                                                if (iM6044N5 > 0) {
                                                    c0141cm2.m1249t(iM6044N5 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (c0141cm2.m1237h()) {
                                                int i21 = 8;
                                                int iM6044N6 = sc2.m6044N(c0141cm2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iM6044N6) {
                                                    int iM6044N7 = sc2.m6044N(c0141cm2, 4, i21, 16);
                                                    int iM6044N8 = sc2.m6044N(c0141cm2, 4, i21, 16);
                                                    if (iM6044N7 == 7) {
                                                        int iM1238i12 = c0141cm2.m1238i(4) + 1;
                                                        c0141cm2.m1249t(4);
                                                        byte[] bArr4 = new byte[iM1238i12];
                                                        for (int i23 = 0; i23 < iM1238i12; i23++) {
                                                            bArr4[i23] = (byte) c0141cm2.m1238i(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        c0141cm2.m1249t(iM6044N8 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM1238i2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.f10266q = (int) (((double) iM1238i2) * d);
                                                    this.f10267r = (int) (((double) i16) * d);
                                                    j = this.f10269t;
                                                    j2 = t61Var.f10769b;
                                                    if (j != j2) {
                                                        this.f10269t = j2;
                                                        String strConcat = iM1238i4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM1238i4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            kk1VarM5571u = null;
                                                        } else {
                                                            kk1VarM5571u = qm0.m5571u(z42.f13279f, bArr);
                                                        }
                                                        ae0 ae0Var = new ae0();
                                                        ae0Var.f185a = this.f10254e;
                                                        ae0Var.f197m = v51.m6582l("audio/mhm1");
                                                        ae0Var.f176C = this.f10266q;
                                                        ae0Var.f194j = strConcat;
                                                        ae0Var.f200p = kk1VarM5571u;
                                                        this.f10255f.mo1117d(new be0(ae0Var));
                                                    }
                                                    i2 = 1;
                                                    this.f10270u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f10266q = (int) (((double) iM1238i2) * d);
                                                    this.f10267r = (int) (((double) i16) * d);
                                                    j = this.f10269t;
                                                    j2 = t61Var.f10769b;
                                                    if (j != j2) {
                                                        this.f10269t = j2;
                                                        if (iM1238i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            kk1VarM5571u = null;
                                                        } else {
                                                            kk1VarM5571u = null;
                                                        }
                                                        ae0 ae0Var2 = new ae0();
                                                        ae0Var2.f185a = this.f10254e;
                                                        ae0Var2.f197m = v51.m6582l("audio/mhm1");
                                                        ae0Var2.f176C = this.f10266q;
                                                        ae0Var2.f194j = strConcat;
                                                        ae0Var2.f200p = kk1VarM5571u;
                                                        this.f10255f.mo1117d(new be0(ae0Var2));
                                                    }
                                                    i2 = 1;
                                                    this.f10270u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.f10266q = (int) (((double) iM1238i2) * d);
                                                    this.f10267r = (int) (((double) i16) * d);
                                                    j = this.f10269t;
                                                    j2 = t61Var.f10769b;
                                                    if (j != j2) {
                                                        this.f10269t = j2;
                                                        if (iM1238i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            kk1VarM5571u = null;
                                                        } else {
                                                            kk1VarM5571u = null;
                                                        }
                                                        ae0 ae0Var3 = new ae0();
                                                        ae0Var3.f185a = this.f10254e;
                                                        ae0Var3.f197m = v51.m6582l("audio/mhm1");
                                                        ae0Var3.f176C = this.f10266q;
                                                        ae0Var3.f194j = strConcat;
                                                        ae0Var3.f200p = kk1VarM5571u;
                                                        this.f10255f.mo1117d(new be0(ae0Var3));
                                                    }
                                                    i2 = 1;
                                                    this.f10270u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.f10266q = (int) (((double) iM1238i2) * d);
                                                    this.f10267r = (int) (((double) i16) * d);
                                                    j = this.f10269t;
                                                    j2 = t61Var.f10769b;
                                                    if (j != j2) {
                                                        this.f10269t = j2;
                                                        if (iM1238i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            kk1VarM5571u = null;
                                                        } else {
                                                            kk1VarM5571u = null;
                                                        }
                                                        ae0 ae0Var4 = new ae0();
                                                        ae0Var4.f185a = this.f10254e;
                                                        ae0Var4.f197m = v51.m6582l("audio/mhm1");
                                                        ae0Var4.f176C = this.f10266q;
                                                        ae0Var4.f194j = strConcat;
                                                        ae0Var4.f200p = kk1VarM5571u;
                                                        this.f10255f.mo1117d(new be0(ae0Var4));
                                                    }
                                                    i2 = 1;
                                                    this.f10270u = true;
                                                    break;
                                                default:
                                                    throw fc1.m2800b("Unsupported sampling rate " + iM1238i2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = dc1Var2.f2882a;
                                C0141cm c0141cm3 = new C0141cm(bArr5, bArr5.length);
                                if (c0141cm3.m1237h()) {
                                    c0141cm3.m1249t(2);
                                    iM1238i = c0141cm3.m1238i(13);
                                } else {
                                    iM1238i = 0;
                                }
                                this.f10268s = iM1238i;
                            } else if (i15 == 2) {
                                if (this.f10270u) {
                                    this.f10259j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.f10267r - this.f10268s)) * 1000000.0d) / ((double) this.f10266q);
                                long jRound = Math.round(this.f10256g);
                                if (this.f10258i) {
                                    this.f10258i = false;
                                    this.f10256g = this.f10257h;
                                } else {
                                    this.f10256g += d2;
                                }
                                this.f10255f.mo1114a(jRound, i, this.f10264o, 0, null);
                                this.f10270u = false;
                                this.f10268s = 0;
                                this.f10264o = 0;
                            }
                            i2 = 1;
                        }
                        this.f10253d = i2;
                    }
                }
            } else {
                int i24 = this.f10260k;
                if ((i24 & 2) == 0) {
                    dc1Var.m2316F(dc1Var.f2884c);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (dc1Var.m2318a() > 0) {
                                int i25 = this.f10261l << 8;
                                this.f10261l = i25;
                                int iM2337t = i25 | dc1Var.m2337t();
                                this.f10261l = iM2337t;
                                if ((iM2337t & 16777215) == 12583333) {
                                    dc1Var.m2316F(dc1Var.f2883b - 3);
                                    this.f10261l = 0;
                                }
                            }
                        }
                    }
                    this.f10253d = 1;
                }
            }
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f10253d = 0;
        this.f10261l = 0;
        this.f10250a.m2313C(2);
        this.f10263n = 0;
        this.f10264o = 0;
        this.f10266q = -2147483647;
        this.f10267r = -1;
        this.f10268s = 0;
        this.f10269t = -1L;
        this.f10270u = false;
        this.f10258i = false;
        this.f10262m = true;
        this.f10259j = true;
        this.f10256g = -9.223372036854776E18d;
        this.f10257h = -9.223372036854776E18d;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f10260k = i;
        if (!this.f10259j && (this.f10264o != 0 || !this.f10262m)) {
            this.f10258i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.f10258i) {
                this.f10257h = j;
            } else {
                this.f10256g = j;
            }
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f10254e = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        this.f10255f = z80Var.mo750n(qk0Var.f9521c, 1);
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
    }
}
