package p000;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 implements m50 {

    /* JADX INFO: renamed from: a */
    public final dc1 f9326a;

    /* JADX INFO: renamed from: c */
    public final String f9328c;

    /* JADX INFO: renamed from: d */
    public final int f9329d;

    /* JADX INFO: renamed from: e */
    public String f9330e;

    /* JADX INFO: renamed from: f */
    public c22 f9331f;

    /* JADX INFO: renamed from: h */
    public int f9333h;

    /* JADX INFO: renamed from: i */
    public int f9334i;

    /* JADX INFO: renamed from: j */
    public long f9335j;

    /* JADX INFO: renamed from: k */
    public be0 f9336k;

    /* JADX INFO: renamed from: l */
    public int f9337l;

    /* JADX INFO: renamed from: m */
    public int f9338m;

    /* JADX INFO: renamed from: g */
    public int f9332g = 0;

    /* JADX INFO: renamed from: p */
    public long f9341p = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f9327b = new AtomicInteger();

    /* JADX INFO: renamed from: n */
    public int f9339n = -1;

    /* JADX INFO: renamed from: o */
    public int f9340o = -1;

    public q40(String str, int i, int i2) {
        this.f9326a = new dc1(new byte[i2]);
        this.f9328c = str;
        this.f9329d = i;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0476  */
    /* JADX WARN: Code duplicated, block: B:181:0x047e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0481 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0483  */
    /* JADX WARN: Code duplicated, block: B:187:0x0493  */
    /* JADX WARN: Code duplicated, block: B:189:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b0  */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) throws fc1 {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        int i7;
        int i8;
        int iM1238i;
        int iM1238i2;
        int iM1238i3;
        int i9;
        long jM7222J;
        int i10;
        long jM7222J2;
        int i11;
        int i12;
        int i13;
        int i14;
        ki0.m3866j(this.f9331f);
        while (dc1Var.m2318a() > 0) {
            int i15 = this.f9332g;
            int i16 = 8;
            dc1 dc1Var2 = this.f9326a;
            switch (i15) {
                case 0:
                    while (dc1Var.m2318a() > 0) {
                        int i17 = this.f9334i << 8;
                        this.f9334i = i17;
                        int iM2337t = i17 | dc1Var.m2337t();
                        this.f9334i = iM2337t;
                        if (iM2337t == 2147385345 || iM2337t == -25230976 || iM2337t == 536864768 || iM2337t == -14745368) {
                            i = 1;
                        } else if (iM2337t == 1683496997 || iM2337t == 622876772) {
                            i = 2;
                        } else if (iM2337t == 1078008818 || iM2337t == -233094848) {
                            i = 3;
                        } else {
                            i = (iM2337t == 1908687592 || iM2337t == -398277519) ? 4 : 0;
                        }
                        this.f9338m = i;
                        if (i != 0) {
                            byte[] bArr = dc1Var2.f2882a;
                            bArr[0] = (byte) ((iM2337t >> 24) & 255);
                            bArr[1] = (byte) ((iM2337t >> 16) & 255);
                            bArr[2] = (byte) ((iM2337t >> 8) & 255);
                            bArr[3] = (byte) (iM2337t & 255);
                            this.f9333h = 4;
                            this.f9334i = 0;
                            if (i != 3 && i != 4) {
                                if (i == 1) {
                                    this.f9332g = 1;
                                } else {
                                    this.f9332g = 2;
                                }
                            }
                            this.f9332g = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m5443b(dc1Var, dc1Var2.f2882a, 18)) {
                        byte[] bArr2 = dc1Var2.f2882a;
                        if (this.f9336k == null) {
                            String str = this.f9330e;
                            C0141cm c0141cmM3875w = ki0.m3875w(bArr2);
                            c0141cmM3875w.m1249t(60);
                            int i18 = ki0.f5831c[c0141cmM3875w.m1238i(6)];
                            int i19 = ki0.f5832d[c0141cmM3875w.m1238i(4)];
                            int iM1238i4 = c0141cmM3875w.m1238i(5);
                            int i20 = iM1238i4 >= 29 ? -1 : (ki0.f5833e[iM1238i4] * 1000) / 2;
                            c0141cmM3875w.m1249t(10);
                            int i21 = i18 + (c0141cmM3875w.m1238i(2) > 0 ? 1 : 0);
                            ae0 ae0Var = new ae0();
                            ae0Var.f185a = str;
                            ae0Var.f197m = v51.m6582l("audio/vnd.dts");
                            ae0Var.f192h = i20;
                            ae0Var.f175B = i21;
                            ae0Var.f176C = i19;
                            ae0Var.f201q = null;
                            ae0Var.f188d = this.f9328c;
                            ae0Var.f190f = this.f9329d;
                            be0 be0Var = new be0(ae0Var);
                            this.f9336k = be0Var;
                            this.f9331f.mo1117d(be0Var);
                        }
                        byte b5 = bArr2[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b4 = bArr2[9];
                            } else if (b5 != 31) {
                                i2 = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b = bArr2[7];
                            } else {
                                i6 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b4 = bArr2[8];
                            }
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i3 = (i3 * 16) / 14;
                            }
                            this.f9337l = i3;
                            if (b5 != -2) {
                                if (b5 != -1) {
                                    i4 = (bArr2[4] & 7) << 4;
                                    b3 = bArr2[7];
                                } else if (b5 != 31) {
                                    i4 = (bArr2[4] & 1) << 6;
                                    b2 = bArr2[5];
                                } else {
                                    i4 = (bArr2[5] & 7) << 4;
                                    b3 = bArr2[6];
                                }
                                i5 = b3 & 60;
                                this.f9335j = rc2.m5793l(z42.m7220H(this.f9336k.f1318D, (((i5 >> 2) | i4) + 1) * 32));
                                dc1Var2.m2316F(0);
                                this.f9331f.mo1115b(dc1Var2, 18, 0);
                                this.f9332g = 6;
                            } else {
                                i4 = (bArr2[5] & 1) << 6;
                                b2 = bArr2[4];
                            }
                            i5 = b2 & 252;
                            this.f9335j = rc2.m5793l(z42.m7220H(this.f9336k.f1318D, (((i5 >> 2) | i4) + 1) * 32));
                            dc1Var2.m2316F(0);
                            this.f9331f.mo1115b(dc1Var2, 18, 0);
                            this.f9332g = 6;
                        } else {
                            i2 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b = bArr2[6];
                        }
                        i3 = (i2 | ((b & 240) >> 4)) + 1;
                        z = false;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f9337l = i3;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i4 = (bArr2[4] & 7) << 4;
                                b3 = bArr2[7];
                            } else if (b5 != 31) {
                                i4 = (bArr2[4] & 1) << 6;
                                b2 = bArr2[5];
                            } else {
                                i4 = (bArr2[5] & 7) << 4;
                                b3 = bArr2[6];
                            }
                            i5 = b3 & 60;
                            this.f9335j = rc2.m5793l(z42.m7220H(this.f9336k.f1318D, (((i5 >> 2) | i4) + 1) * 32));
                            dc1Var2.m2316F(0);
                            this.f9331f.mo1115b(dc1Var2, 18, 0);
                            this.f9332g = 6;
                        } else {
                            i4 = (bArr2[5] & 1) << 6;
                            b2 = bArr2[4];
                        }
                        i5 = b2 & 252;
                        this.f9335j = rc2.m5793l(z42.m7220H(this.f9336k.f1318D, (((i5 >> 2) | i4) + 1) * 32));
                        dc1Var2.m2316F(0);
                        this.f9331f.mo1115b(dc1Var2, 18, 0);
                        this.f9332g = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m5443b(dc1Var, dc1Var2.f2882a, 7)) {
                        C0141cm c0141cmM3875w2 = ki0.m3875w(dc1Var2.f2882a);
                        c0141cmM3875w2.m1249t(42);
                        this.f9339n = c0141cmM3875w2.m1238i(c0141cmM3875w2.m1237h() ? 12 : 8) + 1;
                        this.f9332g = 3;
                    }
                    break;
                case 3:
                    if (m5443b(dc1Var, dc1Var2.f2882a, this.f9339n)) {
                        C0141cm c0141cmM3875w3 = ki0.m3875w(dc1Var2.f2882a);
                        c0141cmM3875w3.m1249t(40);
                        int iM1238i5 = c0141cmM3875w3.m1238i(2);
                        if (c0141cmM3875w3.m1237h()) {
                            i7 = 20;
                            i8 = 12;
                        } else {
                            i7 = 16;
                            i8 = 8;
                        }
                        c0141cmM3875w3.m1249t(i8);
                        int iM1238i6 = c0141cmM3875w3.m1238i(i7) + 1;
                        boolean zM1237h = c0141cmM3875w3.m1237h();
                        if (zM1237h) {
                            iM1238i = c0141cmM3875w3.m1238i(2);
                            iM1238i2 = (c0141cmM3875w3.m1238i(3) + 1) * UserVerificationMethods.USER_VERIFY_NONE;
                            if (c0141cmM3875w3.m1237h()) {
                                c0141cmM3875w3.m1249t(36);
                            }
                            int iM1238i7 = c0141cmM3875w3.m1238i(3) + 1;
                            int iM1238i8 = c0141cmM3875w3.m1238i(3) + 1;
                            if (iM1238i7 != 1 || iM1238i8 != 1) {
                                throw fc1.m2800b("Multiple audio presentations or assets not supported");
                            }
                            int i22 = iM1238i5 + 1;
                            int iM1238i9 = c0141cmM3875w3.m1238i(i22);
                            int i23 = 0;
                            while (i23 < i22) {
                                if (((iM1238i9 >> i23) & 1) == 1) {
                                    c0141cmM3875w3.m1249t(i16);
                                }
                                i23++;
                                i16 = 8;
                            }
                            if (c0141cmM3875w3.m1237h()) {
                                c0141cmM3875w3.m1249t(2);
                                int iM1238i10 = (c0141cmM3875w3.m1238i(2) + 1) << 2;
                                int iM1238i11 = c0141cmM3875w3.m1238i(2) + 1;
                                for (int i24 = 0; i24 < iM1238i11; i24++) {
                                    c0141cmM3875w3.m1249t(iM1238i10);
                                }
                            }
                        } else {
                            iM1238i = -1;
                            iM1238i2 = 0;
                        }
                        c0141cmM3875w3.m1249t(i7);
                        c0141cmM3875w3.m1249t(12);
                        if (zM1237h) {
                            if (c0141cmM3875w3.m1237h()) {
                                c0141cmM3875w3.m1249t(4);
                            }
                            if (c0141cmM3875w3.m1237h()) {
                                c0141cmM3875w3.m1249t(24);
                            }
                            if (c0141cmM3875w3.m1237h()) {
                                c0141cmM3875w3.m1250u(c0141cmM3875w3.m1238i(10) + 1);
                            }
                            c0141cmM3875w3.m1249t(5);
                            i9 = ki0.f5834f[c0141cmM3875w3.m1238i(4)];
                            iM1238i3 = c0141cmM3875w3.m1238i(8) + 1;
                        } else {
                            iM1238i3 = -1;
                            i9 = -2147483647;
                        }
                        if (zM1237h) {
                            if (iM1238i == 0) {
                                i10 = 32000;
                            } else if (iM1238i == 1) {
                                i10 = 44100;
                            } else {
                                if (iM1238i != 2) {
                                    throw fc1.m2799a(null, "Unsupported reference clock code in DTS HD header: " + iM1238i);
                                }
                                i10 = 48000;
                            }
                            int i25 = z42.f13274a;
                            jM7222J = z42.m7222J(iM1238i2, 1000000L, i10, RoundingMode.DOWN);
                        } else {
                            jM7222J = -9223372036854775807L;
                        }
                        m5444g(new C0586e0("audio/vnd.dts.hd;profile=lbr", iM1238i3, i9, iM1238i6, jM7222J));
                        this.f9337l = iM1238i6;
                        this.f9335j = jM7222J == -9223372036854775807L ? 0L : jM7222J;
                        dc1Var2.m2316F(0);
                        this.f9331f.mo1115b(dc1Var2, this.f9339n, 0);
                        this.f9332g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (m5443b(dc1Var, dc1Var2.f2882a, 6)) {
                        C0141cm c0141cmM3875w4 = ki0.m3875w(dc1Var2.f2882a);
                        c0141cmM3875w4.m1249t(32);
                        int iM3847R = ki0.m3847R(c0141cmM3875w4, ki0.f5839k) + 1;
                        this.f9340o = iM3847R;
                        int i26 = this.f9333h;
                        if (i26 > iM3847R) {
                            int i27 = i26 - iM3847R;
                            this.f9333h = i26 - i27;
                            dc1Var.m2316F(dc1Var.f2883b - i27);
                        }
                        this.f9332g = 5;
                    }
                    break;
                case 5:
                    if (m5443b(dc1Var, dc1Var2.f2882a, this.f9340o)) {
                        byte[] bArr3 = dc1Var2.f2882a;
                        C0141cm c0141cmM3875w5 = ki0.m3875w(bArr3);
                        int i28 = c0141cmM3875w5.m1238i(32) == 1078008818 ? 1 : 0;
                        int iM3847R2 = ki0.m3847R(c0141cmM3875w5, ki0.f5835g);
                        int i29 = iM3847R2 + 1;
                        if (i28 == 0) {
                            jM7222J2 = -9223372036854775807L;
                            i11 = -2147483647;
                        } else {
                            if (!c0141cmM3875w5.m1237h()) {
                                throw fc1.m2800b("Only supports full channel mask-based audio presentation");
                            }
                            int i30 = iM3847R2 - 1;
                            int i31 = ((bArr3[i30] << 8) & 65535) | (bArr3[iM3847R2] & 255);
                            int i32 = z42.f13274a;
                            int i33 = 65535;
                            for (int i34 = 0; i34 < i30; i34++) {
                                byte b6 = bArr3[i34];
                                int i35 = (((i33 >> 12) & 255) ^ ((b6 & 255) >> 4)) & 255;
                                int i36 = (i33 << 4) & 65535;
                                int[] iArr = z42.f13285l;
                                int i37 = (iArr[i35] ^ i36) & 65535;
                                i33 = (((i37 << 4) & 65535) ^ iArr[((b6 & 15) ^ ((i37 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i31 != i33) {
                                throw fc1.m2799a(null, "CRC check failed");
                            }
                            int iM1238i12 = c0141cmM3875w5.m1238i(2);
                            if (iM1238i12 != 0) {
                                if (iM1238i12 == 1) {
                                    i13 = 480;
                                } else {
                                    if (iM1238i12 != 2) {
                                        throw fc1.m2799a(null, "Unsupported base duration index in DTS UHD header: " + iM1238i12);
                                    }
                                    i13 = 384;
                                }
                                i12 = 3;
                            } else {
                                i12 = 3;
                                i13 = UserVerificationMethods.USER_VERIFY_NONE;
                            }
                            int iM1238i13 = (c0141cmM3875w5.m1238i(i12) + 1) * i13;
                            int iM1238i14 = c0141cmM3875w5.m1238i(2);
                            if (iM1238i14 == 0) {
                                i14 = 32000;
                            } else if (iM1238i14 == 1) {
                                i14 = 44100;
                            } else {
                                if (iM1238i14 != 2) {
                                    throw fc1.m2799a(null, "Unsupported clock rate index in DTS UHD header: " + iM1238i14);
                                }
                                i14 = 48000;
                            }
                            if (c0141cmM3875w5.m1237h()) {
                                c0141cmM3875w5.m1249t(36);
                            }
                            int iM1238i15 = i14 * (1 << c0141cmM3875w5.m1238i(2));
                            jM7222J2 = z42.m7222J(iM1238i13, 1000000L, i14, RoundingMode.DOWN);
                            i11 = iM1238i15;
                        }
                        int iM3847R3 = 0;
                        for (int i38 = 0; i38 < i28; i38++) {
                            iM3847R3 += ki0.m3847R(c0141cmM3875w5, ki0.f5836h);
                        }
                        AtomicInteger atomicInteger = this.f9327b;
                        if (i28 != 0) {
                            atomicInteger.set(ki0.m3847R(c0141cmM3875w5, ki0.f5837i));
                        }
                        int iM3847R4 = iM3847R3 + (atomicInteger.get() != 0 ? ki0.m3847R(c0141cmM3875w5, ki0.f5838j) : 0) + i29;
                        C0586e0 c0586e0 = new C0586e0("audio/vnd.dts.uhd;profile=p2", 2, i11, iM3847R4, jM7222J2);
                        if (this.f9338m == 3) {
                            m5444g(c0586e0);
                        }
                        this.f9337l = iM3847R4;
                        this.f9335j = jM7222J2 == -9223372036854775807L ? 0L : jM7222J2;
                        dc1Var2.m2316F(0);
                        this.f9331f.mo1115b(dc1Var2, this.f9340o, 0);
                        this.f9332g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(dc1Var.m2318a(), this.f9337l - this.f9333h);
                    this.f9331f.mo1115b(dc1Var, iMin, 0);
                    int i39 = this.f9333h + iMin;
                    this.f9333h = i39;
                    if (i39 == this.f9337l) {
                        ki0.m3864h(this.f9341p != -9223372036854775807L);
                        this.f9331f.mo1114a(this.f9341p, this.f9338m == 4 ? 0 : 1, this.f9337l, 0, null);
                        this.f9341p += this.f9335j;
                        this.f9332g = 0;
                    }
                    break;
                default:
                    l41.m4046o();
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5443b(dc1 dc1Var, byte[] bArr, int i) {
        int iMin = Math.min(dc1Var.m2318a(), i - this.f9333h);
        dc1Var.m2322e(this.f9333h, iMin, bArr);
        int i2 = this.f9333h + iMin;
        this.f9333h = i2;
        return i2 == i;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f9332g = 0;
        this.f9333h = 0;
        this.f9334i = 0;
        this.f9341p = -9223372036854775807L;
        this.f9327b.set(0);
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f9341p = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f9330e = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        this.f9331f = z80Var.mo750n(qk0Var.f9521c, 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m5444g(C0586e0 c0586e0) {
        int i = c0586e0.f3088b;
        String str = c0586e0.f3087a;
        int i2 = c0586e0.f3089c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        be0 be0Var = this.f9336k;
        if (be0Var != null && i2 == be0Var.f1317C && i == be0Var.f1318D && str.equals(be0Var.f1341n)) {
            return;
        }
        be0 be0Var2 = this.f9336k;
        ae0 ae0Var = be0Var2 == null ? new ae0() : be0Var2.m969a();
        ae0Var.f185a = this.f9330e;
        ae0Var.f197m = v51.m6582l(str);
        ae0Var.f175B = i2;
        ae0Var.f176C = i;
        ae0Var.f188d = this.f9328c;
        ae0Var.f190f = this.f9329d;
        be0 be0Var3 = new be0(ae0Var);
        this.f9336k = be0Var3;
        this.f9331f.mo1117d(be0Var3);
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
    }
}
