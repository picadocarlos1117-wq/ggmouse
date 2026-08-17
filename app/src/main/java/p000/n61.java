package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 implements x80, kq1 {

    /* JADX INFO: renamed from: A */
    public m61[] f7260A;

    /* JADX INFO: renamed from: B */
    public long[][] f7261B;

    /* JADX INFO: renamed from: C */
    public int f7262C;

    /* JADX INFO: renamed from: D */
    public long f7263D;

    /* JADX INFO: renamed from: E */
    public int f7264E;

    /* JADX INFO: renamed from: F */
    public g61 f7265F;

    /* JADX INFO: renamed from: a */
    public final wx1 f7266a;

    /* JADX INFO: renamed from: b */
    public final int f7267b;

    /* JADX INFO: renamed from: c */
    public final dc1 f7268c;

    /* JADX INFO: renamed from: d */
    public final dc1 f7269d;

    /* JADX INFO: renamed from: e */
    public final dc1 f7270e;

    /* JADX INFO: renamed from: f */
    public final dc1 f7271f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f7272g;

    /* JADX INFO: renamed from: h */
    public final qq1 f7273h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f7274i;

    /* JADX INFO: renamed from: j */
    public kk1 f7275j;

    /* JADX INFO: renamed from: k */
    public int f7276k;

    /* JADX INFO: renamed from: l */
    public int f7277l;

    /* JADX INFO: renamed from: m */
    public long f7278m;

    /* JADX INFO: renamed from: n */
    public int f7279n;

    /* JADX INFO: renamed from: o */
    public dc1 f7280o;

    /* JADX INFO: renamed from: p */
    public int f7281p;

    /* JADX INFO: renamed from: q */
    public int f7282q;

    /* JADX INFO: renamed from: r */
    public int f7283r;

    /* JADX INFO: renamed from: s */
    public int f7284s;

    /* JADX INFO: renamed from: t */
    public boolean f7285t;

    /* JADX INFO: renamed from: u */
    public boolean f7286u;

    /* JADX INFO: renamed from: v */
    public boolean f7287v;

    /* JADX INFO: renamed from: w */
    public long f7288w;

    /* JADX INFO: renamed from: x */
    public boolean f7289x;

    /* JADX INFO: renamed from: y */
    public long f7290y;

    /* JADX INFO: renamed from: z */
    public z80 f7291z;

    public n61(wx1 wx1Var, int i) {
        this.f7266a = wx1Var;
        this.f7267b = i;
        om0 om0Var = qm0.f9540b;
        this.f7275j = kk1.f5896e;
        this.f7276k = (i & 4) != 0 ? 3 : 0;
        this.f7273h = new qq1();
        this.f7274i = new ArrayList();
        this.f7271f = new dc1(16);
        this.f7272g = new ArrayDeque();
        this.f7268c = new dc1(o21.f7628c);
        this.f7269d = new dc1(5);
        this.f7270e = new dc1();
        this.f7281p = -1;
        this.f7291z = z80.f13306h;
        this.f7260A = new m61[0];
        this.f7285t = (i & 32) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:250:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:251:0x04fe  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) throws fc1 {
        int i;
        int i2;
        char c;
        boolean z;
        boolean z2;
        k61 k61Var;
        while (true) {
            int i3 = this.f7276k;
            ArrayDeque arrayDeque = this.f7272g;
            int i4 = this.f7267b;
            dc1 dc1Var = this.f7270e;
            int i5 = 4;
            int i6 = 0;
            int i7 = 2;
            if (i3 == 0) {
                int i8 = this.f7279n;
                dc1 dc1Var2 = this.f7271f;
                if (i8 == 0) {
                    if (!y80Var.mo2414b(dc1Var2.f2882a, 0, 8, true)) {
                        if (this.f7264E != 2 || (i4 & 2) == 0) {
                            return -1;
                        }
                        c22 c22VarMo750n = this.f7291z.mo750n(0, 4);
                        g61 g61Var = this.f7265F;
                        k51 k51Var = g61Var == null ? null : new k51(g61Var);
                        ae0 ae0Var = new ae0();
                        ae0Var.f195k = k51Var;
                        c22VarMo750n.mo1117d(new be0(ae0Var));
                        this.f7291z.mo748k();
                        this.f7291z.mo752q(new C0825ke(-9223372036854775807L));
                        return -1;
                    }
                    this.f7279n = 8;
                    dc1Var2.m2316F(0);
                    this.f7278m = dc1Var2.m2339v();
                    this.f7277l = dc1Var2.m2324g();
                }
                long j = this.f7278m;
                if (j == 1) {
                    y80Var.readFully(dc1Var2.f2882a, 8, 8);
                    this.f7279n += 8;
                    this.f7278m = dc1Var2.m2342y();
                } else if (j == 0) {
                    long jMo2420i = y80Var.mo2420i();
                    if (jMo2420i == -1 && (k61Var = (k61) arrayDeque.peek()) != null) {
                        jMo2420i = k61Var.f5682g;
                    }
                    if (jMo2420i != -1) {
                        this.f7278m = (jMo2420i - y80Var.getPosition()) + ((long) this.f7279n);
                    }
                }
                long j2 = this.f7278m;
                int i9 = this.f7279n;
                if (j2 < i9) {
                    throw fc1.m2800b("Atom size less than header length (unsupported).");
                }
                int i10 = this.f7277l;
                if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1701082724) {
                    long position = y80Var.getPosition();
                    long j3 = this.f7278m;
                    long j4 = this.f7279n;
                    long j5 = (position + j3) - j4;
                    if (j3 != j4 && this.f7277l == 1835365473) {
                        dc1Var.m2313C(8);
                        y80Var.mo2413a(0, 8, dc1Var.f2882a);
                        byte[] bArr = AbstractC0793jj.f5419a;
                        int i11 = dc1Var.f2883b;
                        dc1Var.m2317G(4);
                        if (dc1Var.m2324g() != 1751411826) {
                            i11 += 4;
                        }
                        dc1Var.m2316F(i11);
                        y80Var.mo2423m(dc1Var.f2883b);
                        y80Var.mo2422l();
                    }
                    arrayDeque.push(new k61(this.f7277l, j5));
                    if (this.f7278m == this.f7279n) {
                        m4502l(j5);
                    } else {
                        this.f7276k = 0;
                        this.f7279n = 0;
                    }
                } else if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                    ki0.m3864h(i9 == 8);
                    ki0.m3864h(this.f7278m <= 2147483647L);
                    dc1 dc1Var3 = new dc1((int) this.f7278m);
                    System.arraycopy(dc1Var2.f2882a, 0, dc1Var3.f2882a, 0, 8);
                    this.f7280o = dc1Var3;
                    this.f7276k = 1;
                } else {
                    long position2 = y80Var.getPosition();
                    long j6 = this.f7279n;
                    long j7 = position2 - j6;
                    if (this.f7277l == 1836086884) {
                        this.f7265F = new g61(0L, j7, -9223372036854775807L, j7 + j6, this.f7278m - j6);
                    }
                    this.f7280o = null;
                    this.f7276k = 1;
                }
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i12 = 4;
                        long position3 = y80Var.getPosition();
                        if (this.f7281p == -1) {
                            int i13 = 0;
                            int i14 = -1;
                            int i15 = -1;
                            boolean z3 = true;
                            boolean z4 = true;
                            long j8 = Long.MAX_VALUE;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            while (true) {
                                m61[] m61VarArr = this.f7260A;
                                if (i13 >= m61VarArr.length) {
                                    break;
                                }
                                m61 m61Var = m61VarArr[i13];
                                int i16 = m61Var.f6670e;
                                d22 d22Var = m61Var.f6667b;
                                if (i16 != d22Var.f2755b) {
                                    long j11 = d22Var.f2756c[i16];
                                    long[][] jArr = this.f7261B;
                                    int i17 = z42.f13274a;
                                    long j12 = jArr[i13][i16];
                                    long j13 = j11 - position3;
                                    boolean z5 = j13 < 0 || j13 >= 262144;
                                    if ((!z5 && z4) || (z5 == z4 && j13 < j10)) {
                                        i15 = i13;
                                        j9 = j12;
                                        z4 = z5;
                                        j10 = j13;
                                    }
                                    if (j12 < j8) {
                                        i14 = i13;
                                        j8 = j12;
                                        z3 = z5;
                                    }
                                }
                                i13++;
                            }
                            if (j8 == Long.MAX_VALUE || !z3 || j9 < j8 + 10485760) {
                                i14 = i15;
                            }
                            this.f7281p = i14;
                            if (i14 == -1) {
                                return -1;
                            }
                        }
                        m61 m61Var2 = this.f7260A[this.f7281p];
                        c22 c22Var = m61Var2.f6668c;
                        v12 v12Var = m61Var2.f6666a;
                        d22 d22Var2 = m61Var2.f6667b;
                        int i18 = m61Var2.f6670e;
                        long j14 = d22Var2.f2756c[i18] + this.f7290y;
                        int i19 = d22Var2.f2757d[i18];
                        f32 f32Var = m61Var2.f6669d;
                        long j15 = (j14 - position3) + ((long) this.f7282q);
                        if (j15 < 0 || j15 >= 262144) {
                            bb0Var.f1280a = j14;
                            return 1;
                        }
                        int i20 = v12Var.f11491h;
                        be0 be0Var = v12Var.f11490g;
                        if (i20 == 1) {
                            j15 += 8;
                            i19 -= 8;
                        }
                        y80Var.mo2423m((int) j15);
                        if (!Objects.equals(be0Var.f1341n, "video/avc")) {
                            this.f7285t = true;
                        }
                        int i21 = v12Var.f11494k;
                        if (i21 == 0) {
                            if ("audio/ac4".equals(be0Var.f1341n)) {
                                if (this.f7283r == 0) {
                                    o21.m4637C(i19, dc1Var);
                                    c22Var.mo1115b(dc1Var, 7, 0);
                                    this.f7283r += 7;
                                }
                                i19 += 7;
                            } else if (f32Var != null) {
                                f32Var.m2704c(y80Var);
                            }
                            while (true) {
                                int i22 = this.f7283r;
                                if (i22 >= i19) {
                                    break;
                                }
                                int iMo1116c = c22Var.mo1116c(y80Var, i19 - i22, false);
                                this.f7282q += iMo1116c;
                                this.f7283r += iMo1116c;
                                this.f7284s -= iMo1116c;
                            }
                        } else {
                            dc1 dc1Var4 = this.f7269d;
                            byte[] bArr2 = dc1Var4.f2882a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[2] = 0;
                            int i23 = i21 + 1;
                            int i24 = 4 - i21;
                            while (this.f7283r < i19) {
                                int i25 = this.f7284s;
                                if (i25 == 0) {
                                    y80Var.readFully(bArr2, i24, i23);
                                    this.f7282q += i23;
                                    dc1Var4.m2316F(0);
                                    int iM2324g = dc1Var4.m2324g();
                                    if (iM2324g < 1) {
                                        throw fc1.m2799a(null, "Invalid NAL length");
                                    }
                                    this.f7284s = iM2324g - 1;
                                    dc1 dc1Var5 = this.f7268c;
                                    dc1Var5.m2316F(0);
                                    int i26 = i12;
                                    c22Var.mo1115b(dc1Var5, i26, 0);
                                    c22Var.mo1115b(dc1Var4, 1, 0);
                                    this.f7283r += 5;
                                    i19 += i24;
                                    if (!this.f7285t && o21.m4648S(bArr2[i26])) {
                                        this.f7285t = true;
                                    }
                                } else {
                                    int iMo1116c2 = c22Var.mo1116c(y80Var, i25, false);
                                    this.f7282q += iMo1116c2;
                                    this.f7283r += iMo1116c2;
                                    this.f7284s -= iMo1116c2;
                                }
                                i12 = 4;
                            }
                        }
                        int i27 = i19;
                        long j16 = d22Var2.f2759f[i18];
                        int i28 = d22Var2.f2760g[i18];
                        if (!this.f7285t) {
                            i28 |= 67108864;
                        }
                        int i29 = i28;
                        if (f32Var != null) {
                            f32Var.m2703b(c22Var, j16, i29, i27, 0, null);
                            if (i18 + 1 == d22Var2.f2755b) {
                                f32Var.m2702a(c22Var, null);
                            }
                        } else {
                            c22Var.mo1114a(j16, i29, i27, 0, null);
                        }
                        m61Var2.f6670e++;
                        this.f7281p = -1;
                        this.f7282q = 0;
                        this.f7283r = 0;
                        this.f7284s = 0;
                        this.f7285t = (i4 & 32) == 0;
                        return 0;
                    }
                    if (i3 != 3) {
                        l41.m4046o();
                        return 0;
                    }
                    qq1 qq1Var = this.f7273h;
                    ArrayList arrayList = qq1Var.f9561a;
                    int i30 = qq1Var.f9562b;
                    if (i30 != 0) {
                        if (i30 != 1) {
                            short s = 2817;
                            int i31 = 8;
                            short s2 = 2192;
                            if (i30 == 2) {
                                long jMo2420i2 = y80Var.mo2420i();
                                int i32 = qq1Var.f9563c - 20;
                                dc1 dc1Var6 = new dc1(i32);
                                y80Var.readFully(dc1Var6.f2882a, 0, i32);
                                int i33 = 0;
                                while (i33 < i32 / 12) {
                                    dc1Var6.m2317G(i7);
                                    byte[] bArr3 = dc1Var6.f2882a;
                                    int i34 = dc1Var6.f2883b;
                                    int i35 = i7;
                                    int i36 = i34 + 1;
                                    dc1Var6.f2883b = i36;
                                    int i37 = bArr3[i34] & 255;
                                    dc1Var6.f2883b = i34 + 2;
                                    short s3 = (short) (i37 | ((bArr3[i36] & 255) << 8));
                                    if (s3 != s2 && s3 != 2816 && s3 != s) {
                                        if (s3 != 2819 && s3 != 2820) {
                                            dc1Var6.m2317G(i31);
                                        }
                                        i33++;
                                        i32 = i32;
                                        i7 = i35;
                                        s2 = 2192;
                                        s = 2817;
                                        i31 = 8;
                                    }
                                    arrayList.add(new pq1((jMo2420i2 - ((long) qq1Var.f9563c)) - ((long) dc1Var6.m2326i()), dc1Var6.m2326i()));
                                    i33++;
                                    i32 = i32;
                                    i7 = i35;
                                    s2 = 2192;
                                    s = 2817;
                                    i31 = 8;
                                }
                                if (arrayList.isEmpty()) {
                                    bb0Var.f1280a = 0L;
                                } else {
                                    qq1Var.f9562b = 3;
                                    bb0Var.f1280a = ((pq1) arrayList.get(0)).f9044a;
                                }
                            } else {
                                if (i30 != 3) {
                                    l41.m4046o();
                                    return 0;
                                }
                                long position4 = y80Var.getPosition();
                                int iMo2420i = (int) ((y80Var.mo2420i() - y80Var.getPosition()) - ((long) qq1Var.f9563c));
                                dc1 dc1Var7 = new dc1(iMo2420i);
                                y80Var.readFully(dc1Var7.f2882a, 0, iMo2420i);
                                int i38 = 0;
                                while (i38 < arrayList.size()) {
                                    pq1 pq1Var = (pq1) arrayList.get(i38);
                                    int i39 = i6;
                                    dc1Var7.m2316F((int) (pq1Var.f9044a - position4));
                                    dc1Var7.m2317G(i5);
                                    int iM2326i = dc1Var7.m2326i();
                                    Charset charset = StandardCharsets.UTF_8;
                                    int i40 = i39;
                                    String strM2335r = dc1Var7.m2335r(iM2326i, charset);
                                    int i41 = i5;
                                    switch (strM2335r.hashCode()) {
                                        case -1711564334:
                                            if (!strM2335r.equals("SlowMotion_Data")) {
                                                i2 = -1;
                                            } else {
                                                i2 = i40;
                                            }
                                            break;
                                        case -1332107749:
                                            if (!strM2335r.equals("Super_SlowMotion_Edit_Data")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 1;
                                            }
                                            break;
                                        case -1251387154:
                                            if (!strM2335r.equals("Super_SlowMotion_Data")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 2;
                                            }
                                            break;
                                        case -830665521:
                                            if (!strM2335r.equals("Super_SlowMotion_Deflickering_On")) {
                                                i2 = -1;
                                            } else {
                                                i2 = 3;
                                            }
                                            break;
                                        case 1760745220:
                                            if (!strM2335r.equals("Super_SlowMotion_BGM")) {
                                                i2 = -1;
                                            } else {
                                                i2 = i41;
                                            }
                                            break;
                                        default:
                                            i2 = -1;
                                            break;
                                    }
                                    switch (i2) {
                                        case 0:
                                            c = 2192;
                                            break;
                                        case 1:
                                            c = 2819;
                                            break;
                                        case 2:
                                            c = 2816;
                                            break;
                                        case 3:
                                            c = 2820;
                                            break;
                                        case 4:
                                            c = 2817;
                                            break;
                                        default:
                                            throw fc1.m2799a(null, "Invalid SEF name");
                                    }
                                    int i42 = pq1Var.f9045b - (iM2326i + 8);
                                    if (c == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List listM5603a0 = qq1.f9560e.m5603a0(dc1Var7.m2335r(i42, charset));
                                        int i43 = i40;
                                        while (i43 < listM5603a0.size()) {
                                            List listM5603a1 = qq1.f9559d.m5603a0((CharSequence) listM5603a0.get(i43));
                                            if (listM5603a1.size() != 3) {
                                                throw fc1.m2799a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new kt1(Long.parseLong((String) listM5603a1.get(i40)), Long.parseLong((String) listM5603a1.get(1)), 1 << (Integer.parseInt((String) listM5603a1.get(2)) - 1)));
                                                i43++;
                                                i40 = 0;
                                            } catch (NumberFormatException e) {
                                                throw fc1.m2799a(e, null);
                                            }
                                        }
                                        this.f7274i.add(new lt1(arrayList2));
                                    } else if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                                        l41.m4046o();
                                        return i40;
                                    }
                                    i38++;
                                    i5 = i41;
                                    i6 = 0;
                                }
                                bb0Var.f1280a = 0L;
                            }
                        } else {
                            dc1 dc1Var8 = new dc1(8);
                            y80Var.readFully(dc1Var8.f2882a, 0, 8);
                            qq1Var.f9563c = dc1Var8.m2326i() + 8;
                            if (dc1Var8.m2324g() != 1397048916) {
                                bb0Var.f1280a = 0L;
                            } else {
                                bb0Var.f1280a = y80Var.getPosition() - ((long) (qq1Var.f9563c - 12));
                                qq1Var.f9562b = 2;
                            }
                        }
                        i = 1;
                    } else {
                        long jMo2420i3 = y80Var.mo2420i();
                        bb0Var.f1280a = (jMo2420i3 == -1 || jMo2420i3 < 8) ? 0L : jMo2420i3 - 8;
                        i = 1;
                        qq1Var.f9562b = 1;
                    }
                    if (bb0Var.f1280a != 0) {
                        return i;
                    }
                    this.f7276k = 0;
                    this.f7279n = 0;
                    return i;
                }
                long j17 = this.f7278m - ((long) this.f7279n);
                long position5 = y80Var.getPosition() + j17;
                dc1 dc1Var9 = this.f7280o;
                if (dc1Var9 != null) {
                    y80Var.readFully(dc1Var9.f2882a, this.f7279n, (int) j17);
                    if (this.f7277l == 1718909296) {
                        this.f7286u = true;
                        dc1Var9.m2316F(8);
                        int iM2324g2 = dc1Var9.m2324g();
                        int i44 = iM2324g2 != 1751476579 ? iM2324g2 != 1903435808 ? 0 : 1 : 2;
                        if (i44 == 0) {
                            dc1Var9.m2317G(4);
                            do {
                                if (dc1Var9.m2318a() <= 0) {
                                    i44 = 0;
                                    break;
                                }
                                int iM2324g3 = dc1Var9.m2324g();
                                i44 = iM2324g3 != 1751476579 ? iM2324g3 != 1903435808 ? 0 : 1 : 2;
                            } while (i44 == 0);
                        }
                        this.f7264E = i44;
                    } else if (!arrayDeque.isEmpty()) {
                        ((k61) arrayDeque.peek()).f5683m.add(new l61(this.f7277l, dc1Var9));
                    }
                } else {
                    if (!this.f7286u && this.f7277l == 1835295092) {
                        this.f7264E = 1;
                    }
                    if (j17 < 262144) {
                        y80Var.mo2423m((int) j17);
                    } else {
                        bb0Var.f1280a = y80Var.getPosition() + j17;
                        z = true;
                    }
                    m4502l(position5);
                    if (this.f7287v) {
                        this.f7289x = true;
                        bb0Var.f1280a = this.f7288w;
                        this.f7287v = false;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (z2 && this.f7276k != 2) {
                        return 1;
                    }
                }
                z = false;
                m4502l(position5);
                if (this.f7287v) {
                    this.f7289x = true;
                    bb0Var.f1280a = this.f7288w;
                    this.f7287v = false;
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    continue;
                }
            }
        }
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        kk1 kk1VarM5570t;
        ut1 ut1VarM3263N = hr1.m3263N(y80Var, false, (this.f7267b & 2) != 0);
        if (ut1VarM3263N != null) {
            kk1VarM5570t = qm0.m5570t(ut1VarM3263N);
        } else {
            om0 om0Var = qm0.f9540b;
            kk1VarM5570t = kk1.f5896e;
        }
        this.f7275j = kk1VarM5570t;
        return ut1VarM3263N == null;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        this.f7272g.clear();
        this.f7279n = 0;
        this.f7281p = -1;
        this.f7282q = 0;
        this.f7283r = 0;
        this.f7284s = 0;
        this.f7285t = (this.f7267b & 32) == 0;
        if (j == 0) {
            if (this.f7276k != 3) {
                this.f7276k = 0;
                this.f7279n = 0;
                return;
            } else {
                qq1 qq1Var = this.f7273h;
                qq1Var.f9561a.clear();
                qq1Var.f9562b = 0;
                this.f7274i.clear();
                return;
            }
        }
        for (m61 m61Var : this.f7260A) {
            d22 d22Var = m61Var.f6667b;
            int iM7230d = z42.m7230d(d22Var.f2759f, j2, false);
            while (true) {
                if (iM7230d < 0) {
                    iM7230d = -1;
                    break;
                } else if ((d22Var.f2760g[iM7230d] & 1) != 0) {
                    break;
                } else {
                    iM7230d--;
                }
            }
            if (iM7230d == -1) {
                iM7230d = d22Var.m2205a(j2);
            }
            m61Var.f6670e = iM7230d;
            f32 f32Var = m61Var.f6669d;
            if (f32Var != null) {
                f32Var.f3605b = false;
                f32Var.f3606c = 0;
            }
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: g */
    public final List mo2808g() {
        return this.f7275j;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[LOOP:2: B:37:0x0087->B:41:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[LOOP:3: B:51:0x00b2->B:55:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ba A[EDGE_INSN: B:81:0x00ba->B:54:0x00ba BREAK  A[LOOP:3: B:51:0x00b2->B:55:0x00bc], SYNTHETIC] */
    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        long jMin;
        m61[] m61VarArr;
        int i2;
        d22 d22Var;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM7230d;
        int iM2205a;
        int iM7230d2;
        int iM2205a2;
        m61[] m61VarArr2 = this.f7260A;
        int length = m61VarArr2.length;
        mq1 mq1Var = mq1.f7075c;
        if (length == 0) {
            return new jq1(mq1Var, mq1Var);
        }
        int i3 = this.f7262C;
        boolean z = false;
        int i4 = -1;
        long jMin2 = -1;
        if (i3 != -1) {
            d22 d22Var2 = m61VarArr2[i3].f6667b;
            long[] jArr3 = d22Var2.f2759f;
            int iM7230d3 = z42.m7230d(jArr3, j, false);
            while (true) {
                if (iM7230d3 < 0) {
                    iM7230d3 = -1;
                    break;
                }
                if ((d22Var2.f2760g[iM7230d3] & 1) != 0) {
                    break;
                }
                iM7230d3--;
            }
            if (iM7230d3 == -1) {
                iM7230d3 = d22Var2.m2205a(j);
            }
            long[] jArr4 = d22Var2.f2756c;
            if (iM7230d3 == -1) {
                return new jq1(mq1Var, mq1Var);
            }
            j3 = jArr3[iM7230d3];
            j2 = jArr4[iM7230d3];
            if (j3 < j && iM7230d3 < d22Var2.f2755b - 1 && (iM2205a2 = d22Var2.m2205a(j)) != -1 && iM2205a2 != iM7230d3) {
                j4 = jArr3[iM2205a2];
                jMin2 = jArr4[iM2205a2];
            }
            i = 0;
            jMin = j2;
            while (true) {
                m61VarArr = this.f7260A;
                if (i < m61VarArr.length) {
                    break;
                }
                if (i != this.f7262C) {
                    d22Var = m61VarArr[i].f6667b;
                    jArr = d22Var.f2756c;
                    iArr = d22Var.f2760g;
                    jArr2 = d22Var.f2759f;
                    iM7230d = z42.m7230d(jArr2, j3, z);
                    while (true) {
                        if (iM7230d >= 0) {
                            iM2205a = i4;
                            break;
                        }
                        if ((iArr[iM7230d] & 1) != 0) {
                            iM2205a = iM7230d;
                            break;
                        }
                        iM7230d--;
                    }
                    if (iM2205a == i4) {
                        iM2205a = d22Var.m2205a(j3);
                    }
                    if (iM2205a == i4) {
                        jMin = Math.min(jArr[iM2205a], jMin);
                    }
                    if (j4 != -9223372036854775807L) {
                        z = false;
                        iM7230d2 = z42.m7230d(jArr2, j4, false);
                        while (true) {
                            if (iM7230d2 >= 0) {
                                iM7230d2 = -1;
                                break;
                            }
                            if ((iArr[iM7230d2] & 1) != 0) {
                                break;
                            }
                            iM7230d2--;
                        }
                        i2 = -1;
                        if (iM7230d2 == -1) {
                            iM7230d2 = d22Var.m2205a(j4);
                        }
                        if (iM7230d2 == -1) {
                            jMin2 = jMin2;
                        } else {
                            jMin2 = Math.min(jArr[iM7230d2], jMin2);
                        }
                    } else {
                        jMin2 = jMin2;
                        z = false;
                        i2 = -1;
                    }
                } else {
                    i2 = i4;
                }
                i++;
                i4 = i2;
            }
            mq1 mq1Var2 = new mq1(j3, jMin);
            return j4 == -9223372036854775807L ? new jq1(mq1Var2, mq1Var2) : new jq1(mq1Var2, new mq1(j4, jMin2));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        i = 0;
        jMin = j2;
        while (true) {
            m61VarArr = this.f7260A;
            if (i < m61VarArr.length) {
                break;
                break;
            }
            if (i != this.f7262C) {
                d22Var = m61VarArr[i].f6667b;
                jArr = d22Var.f2756c;
                iArr = d22Var.f2760g;
                jArr2 = d22Var.f2759f;
                iM7230d = z42.m7230d(jArr2, j3, z);
                while (true) {
                    if (iM7230d >= 0) {
                        iM2205a = i4;
                        break;
                    }
                    if ((iArr[iM7230d] & 1) != 0) {
                        iM2205a = iM7230d;
                        break;
                    }
                    iM7230d--;
                }
                if (iM2205a == i4) {
                    iM2205a = d22Var.m2205a(j3);
                }
                if (iM2205a == i4) {
                    jMin = Math.min(jArr[iM2205a], jMin);
                }
                if (j4 != -9223372036854775807L) {
                    z = false;
                    iM7230d2 = z42.m7230d(jArr2, j4, false);
                    while (true) {
                        if (iM7230d2 >= 0) {
                            iM7230d2 = -1;
                            break;
                        }
                        if ((iArr[iM7230d2] & 1) != 0) {
                            break;
                            break;
                        }
                        iM7230d2--;
                    }
                    i2 = -1;
                    if (iM7230d2 == -1) {
                        iM7230d2 = d22Var.m2205a(j4);
                    }
                    if (iM7230d2 == -1) {
                        jMin2 = jMin2;
                    } else {
                        jMin2 = Math.min(jArr[iM7230d2], jMin2);
                    }
                } else {
                    jMin2 = jMin2;
                    z = false;
                    i2 = -1;
                }
            } else {
                i2 = i4;
            }
            i++;
            i4 = i2;
        }
        mq1 mq1Var3 = new mq1(j3, jMin);
        if (j4 == -9223372036854775807L) {
        }
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f7263D;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        if ((this.f7267b & 16) == 0) {
            z80Var = new C1174o9(z80Var, this.f7266a);
        }
        this.f7291z = z80Var;
    }

    /* JADX WARN: Code duplicated, block: B:288:0x0566 A[EDGE_INSN: B:288:0x0566->B:291:0x058a BREAK  A[LOOP:9: B:247:0x04e3->B:289:0x0579]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:430:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m4502l(long j) {
        ArrayList arrayList;
        k51 k51Var;
        ArrayDeque arrayDeque;
        boolean z;
        ArrayList arrayList2;
        k51 k51Var2;
        k51 k51Var3;
        k51 k51Var4;
        ArrayList arrayList3;
        k51 k51VarM3802a;
        int i;
        int i2;
        int i3;
        ArrayDeque arrayDeque2;
        boolean z2;
        int i4;
        ArrayList arrayList4;
        k51 k51Var5;
        k51 k51VarM3803b;
        k51 k51Var6;
        int iM2338u;
        k51 k51Var7;
        f51 f51VarM3258I;
        p01 p01VarM3280p;
        int i5;
        p01 p01Var;
        while (true) {
            ArrayDeque arrayDeque3 = this.f7272g;
            if (arrayDeque3.isEmpty() || ((k61) arrayDeque3.peek()).f5682g != j) {
                break;
            }
            k61 k61Var = (k61) arrayDeque3.pop();
            if (k61Var.f7542b == 1836019574) {
                k61 k61VarM3804r = k61Var.m3804r(1835365473);
                ArrayList arrayList5 = new ArrayList();
                boolean z3 = true;
                int i6 = 4;
                int i7 = 1684108385;
                long j2 = 0;
                int i8 = this.f7267b;
                int i9 = 8;
                if (k61VarM3804r != null) {
                    byte[] bArr = AbstractC0793jj.f5419a;
                    l61 l61VarM3805s = k61VarM3804r.m3805s(1751411826);
                    l61 l61VarM3805s2 = k61VarM3804r.m3805s(1801812339);
                    l61 l61VarM3805s3 = k61VarM3804r.m3805s(1768715124);
                    if (l61VarM3805s == null || l61VarM3805s2 == null || l61VarM3805s3 == null) {
                        k51Var = null;
                    } else {
                        dc1 dc1Var = l61VarM3805s.f6194g;
                        dc1Var.m2316F(16);
                        if (dc1Var.m2324g() != 1835299937) {
                            k51Var = null;
                        } else {
                            dc1 dc1Var2 = l61VarM3805s2.f6194g;
                            dc1Var2.m2316F(12);
                            int iM2324g = dc1Var2.m2324g();
                            String[] strArr = new String[iM2324g];
                            int i10 = 0;
                            while (i10 < iM2324g) {
                                int iM2324g2 = dc1Var2.m2324g();
                                dc1Var2.m2317G(i6);
                                strArr[i10] = dc1Var2.m2335r(iM2324g2 - 8, StandardCharsets.UTF_8);
                                i10++;
                                i6 = 4;
                            }
                            dc1 dc1Var3 = l61VarM3805s3.f6194g;
                            dc1Var3.m2316F(8);
                            ArrayList arrayList6 = new ArrayList();
                            while (dc1Var3.m2318a() > i9) {
                                int i11 = dc1Var3.f2883b;
                                int iM2324g3 = dc1Var3.m2324g();
                                int iM2324g4 = dc1Var3.m2324g() - 1;
                                if (iM2324g4 < 0 || iM2324g4 >= iM2324g) {
                                    jd0.m3621s(iM2324g4, "Skipped metadata with unknown key index: ", "BoxParsers");
                                } else {
                                    String str = strArr[iM2324g4];
                                    int i12 = i11 + iM2324g3;
                                    while (true) {
                                        int i13 = dc1Var3.f2883b;
                                        if (i13 >= i12) {
                                            p01Var = null;
                                            break;
                                        }
                                        int iM2324g5 = dc1Var3.m2324g();
                                        if (dc1Var3.m2324g() == i7) {
                                            int iM2324g6 = dc1Var3.m2324g();
                                            int iM2324g7 = dc1Var3.m2324g();
                                            int i14 = iM2324g5 - 16;
                                            byte[] bArr2 = new byte[i14];
                                            dc1Var3.m2322e(0, i14, bArr2);
                                            p01Var = new p01(str, bArr2, iM2324g7, iM2324g6);
                                            break;
                                        }
                                        dc1Var3.m2316F(i13 + iM2324g5);
                                        i7 = 1684108385;
                                    }
                                    if (p01Var != null) {
                                        arrayList6.add(p01Var);
                                    }
                                }
                                dc1Var3.m2316F(i11 + iM2324g3);
                                i9 = 8;
                                i7 = 1684108385;
                            }
                            if (arrayList6.isEmpty()) {
                                k51Var = null;
                            } else {
                                k51Var = new k51(arrayList6);
                            }
                        }
                    }
                    if (this.f7289x) {
                        ki0.m3866j(k51Var);
                        p01 p01VarM3280p2 = hr1.m3280p(k51Var, "editable.tracks.samples.location");
                        if (p01VarM3280p2 != null && p01VarM3280p2.f8607b[0] == 0) {
                            this.f7290y = this.f7288w + 16;
                        }
                        p01 p01VarM3280p3 = hr1.m3280p(k51Var, "editable.tracks.map");
                        ki0.m3866j(p01VarM3280p3);
                        ArrayList arrayListM5096a = p01VarM3280p3.m5096a();
                        ArrayList arrayList7 = new ArrayList(arrayListM5096a.size());
                        for (int i15 = 0; i15 < arrayListM5096a.size(); i15++) {
                            int iIntValue = ((Integer) arrayListM5096a.get(i15)).intValue();
                            if (iIntValue == 0) {
                                i5 = 1;
                            } else if (iIntValue == 1) {
                                i5 = 2;
                            } else if (iIntValue != 2) {
                                i5 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i5 = 3;
                            }
                            arrayList7.add(Integer.valueOf(i5));
                        }
                        arrayList = arrayList7;
                    } else {
                        if (k51Var != null && (i8 & 64) != 0 && (p01VarM3280p = hr1.m3280p(k51Var, "editable.tracks.offset")) != null) {
                            long jM2342y = new dc1(p01VarM3280p.f8607b).m2342y();
                            if (jM2342y > 0) {
                                this.f7288w = jM2342y;
                                this.f7287v = true;
                                arrayDeque = arrayDeque3;
                            }
                            arrayDeque.clear();
                            if (!this.f7287v) {
                                this.f7276k = 2;
                            }
                        }
                        arrayList = arrayList5;
                    }
                } else {
                    arrayList = arrayList5;
                    k51Var = null;
                }
                ArrayList arrayList8 = new ArrayList();
                boolean z4 = this.f7264E == 1;
                xh0 xh0Var = new xh0();
                l61 l61VarM3805s4 = k61Var.m3805s(1969517665);
                if (l61VarM3805s4 != null) {
                    byte[] bArr3 = AbstractC0793jj.f5419a;
                    dc1 dc1Var4 = l61VarM3805s4.f6194g;
                    int i16 = 8;
                    dc1Var4.m2316F(8);
                    k51 k51Var8 = new k51(new f51[0]);
                    while (dc1Var4.m2318a() >= i16) {
                        int i17 = dc1Var4.f2883b;
                        int iM2324g8 = dc1Var4.m2324g();
                        int iM2324g9 = dc1Var4.m2324g();
                        if (iM2324g9 == 1835365473) {
                            dc1Var4.m2316F(i17);
                            int i18 = i17 + iM2324g8;
                            dc1Var4.m2317G(i16);
                            int i19 = dc1Var4.f2883b;
                            dc1Var4.m2317G(4);
                            boolean z5 = z3;
                            if (dc1Var4.m2324g() != 1751411826) {
                                i19 += 4;
                            }
                            dc1Var4.m2316F(i19);
                            while (true) {
                                int i20 = dc1Var4.f2883b;
                                if (i20 < i18) {
                                    int iM2324g10 = dc1Var4.m2324g();
                                    arrayDeque2 = arrayDeque3;
                                    if (dc1Var4.m2324g() == 1768715124) {
                                        dc1Var4.m2316F(i20);
                                        int i21 = i20 + iM2324g10;
                                        dc1Var4.m2317G(8);
                                        ArrayList arrayList9 = new ArrayList();
                                        while (true) {
                                            int i22 = dc1Var4.f2883b;
                                            if (i22 >= i21) {
                                                break;
                                            }
                                            int iM2324g11 = dc1Var4.m2324g() + i22;
                                            int iM2324g12 = dc1Var4.m2324g();
                                            int i23 = i21;
                                            int i24 = (iM2324g12 >> 24) & 255;
                                            boolean z6 = z4;
                                            int i25 = iM2324g8;
                                            ArrayList arrayList10 = arrayList8;
                                            if (i24 == 169 || i24 == 253) {
                                                int i26 = 16777215 & iM2324g12;
                                                if (i26 == 6516084) {
                                                    int iM2324g13 = dc1Var4.m2324g();
                                                    if (dc1Var4.m2324g() == 1684108385) {
                                                        dc1Var4.m2317G(8);
                                                        String strM2333p = dc1Var4.m2333p(iM2324g13 - 16);
                                                        f51VarM3258I = new C0649fq("und", strM2333p, strM2333p);
                                                    } else {
                                                        AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse comment attribute: ".concat(nu0.m4596h(iM2324g12)));
                                                        f51VarM3258I = null;
                                                    }
                                                    dc1Var4.m2316F(iM2324g11);
                                                } else {
                                                    if (i26 == 7233901 || i26 == 7631467) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TIT2");
                                                    } else if (i26 == 6516589 || i26 == 7828084) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TCOM");
                                                    } else if (i26 == 6578553) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TDRC");
                                                    } else if (i26 == 4280916) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TPE1");
                                                    } else if (i26 == 7630703) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TSSE");
                                                    } else if (i26 == 6384738) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TALB");
                                                    } else if (i26 == 7108978) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "USLT");
                                                    } else if (i26 == 6776174) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TCON");
                                                    } else if (i26 == 6779504) {
                                                        f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TIT1");
                                                    } else {
                                                        AbstractC1337qm.m5547l("Skipped unknown metadata entry: ".concat(nu0.m4596h(iM2324g12)));
                                                        dc1Var4.m2316F(iM2324g11);
                                                        f51VarM3258I = null;
                                                    }
                                                    dc1Var4.m2316F(iM2324g11);
                                                }
                                            } else {
                                                if (iM2324g12 == 1735291493) {
                                                    try {
                                                        String strM2373a = dm0.m2373a(hr1.m3256G(dc1Var4) - 1);
                                                        if (strM2373a != null) {
                                                            f51VarM3258I = new tz1("TCON", null, qm0.m5570t(strM2373a));
                                                        } else {
                                                            AbstractC1337qm.m5542i0("MetadataUtil", "Failed to parse standard genre code");
                                                            f51VarM3258I = null;
                                                        }
                                                    } catch (Throwable th) {
                                                        dc1Var4.m2316F(iM2324g11);
                                                        throw th;
                                                    }
                                                } else if (iM2324g12 == 1684632427) {
                                                    f51VarM3258I = hr1.m3255F(iM2324g12, dc1Var4, "TPOS");
                                                } else if (iM2324g12 == 1953655662) {
                                                    f51VarM3258I = hr1.m3255F(iM2324g12, dc1Var4, "TRCK");
                                                } else if (iM2324g12 == 1953329263) {
                                                    f51VarM3258I = hr1.m3257H(iM2324g12, "TBPM", dc1Var4, z5, false);
                                                } else if (iM2324g12 == 1668311404) {
                                                    f51VarM3258I = hr1.m3257H(iM2324g12, "TCMP", dc1Var4, true, true);
                                                } else if (iM2324g12 == 1668249202) {
                                                    f51VarM3258I = hr1.m3254E(dc1Var4);
                                                } else if (iM2324g12 == 1631670868) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TPE2");
                                                } else if (iM2324g12 == 1936682605) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TSOT");
                                                } else if (iM2324g12 == 1936679276) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TSOA");
                                                } else if (iM2324g12 == 1936679282) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TSOP");
                                                } else if (iM2324g12 == 1936679265) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TSO2");
                                                } else if (iM2324g12 == 1936679791) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TSOC");
                                                } else if (iM2324g12 == 1920233063) {
                                                    f51VarM3258I = hr1.m3257H(iM2324g12, "ITUNESADVISORY", dc1Var4, false, false);
                                                } else if (iM2324g12 == 1885823344) {
                                                    f51VarM3258I = hr1.m3257H(iM2324g12, "ITUNESGAPLESS", dc1Var4, false, true);
                                                } else if (iM2324g12 == 1936683886) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TVSHOWSORT");
                                                } else if (iM2324g12 == 1953919848) {
                                                    f51VarM3258I = hr1.m3258I(iM2324g12, dc1Var4, "TVSHOW");
                                                } else if (iM2324g12 == 757935405) {
                                                    String strM2333p2 = null;
                                                    String strM2333p3 = null;
                                                    int i27 = -1;
                                                    int i28 = -1;
                                                    while (true) {
                                                        int i29 = dc1Var4.f2883b;
                                                        if (i29 >= iM2324g11) {
                                                            break;
                                                        }
                                                        int iM2324g14 = dc1Var4.m2324g();
                                                        int iM2324g15 = dc1Var4.m2324g();
                                                        int i30 = i28;
                                                        dc1Var4.m2317G(4);
                                                        if (iM2324g15 == 1835360622) {
                                                            strM2333p2 = dc1Var4.m2333p(iM2324g14 - 12);
                                                        } else if (iM2324g15 == 1851878757) {
                                                            strM2333p3 = dc1Var4.m2333p(iM2324g14 - 12);
                                                        } else {
                                                            if (iM2324g15 == 1684108385) {
                                                                i27 = i29;
                                                                i28 = iM2324g14;
                                                            } else {
                                                                i28 = i30;
                                                            }
                                                            dc1Var4.m2317G(iM2324g14 - 12);
                                                        }
                                                        i28 = i30;
                                                    }
                                                    int i31 = i28;
                                                    if (strM2333p2 == null || strM2333p3 == null || i27 == -1) {
                                                        f51VarM3258I = null;
                                                    } else {
                                                        dc1Var4.m2316F(i27);
                                                        dc1Var4.m2317G(16);
                                                        f51VarM3258I = new to0(strM2333p2, strM2333p3, dc1Var4.m2333p(i31 - 16));
                                                    }
                                                } else {
                                                    AbstractC1337qm.m5547l("Skipped unknown metadata entry: ".concat(nu0.m4596h(iM2324g12)));
                                                    dc1Var4.m2316F(iM2324g11);
                                                    f51VarM3258I = null;
                                                }
                                                dc1Var4.m2316F(iM2324g11);
                                            }
                                            if (f51VarM3258I != null) {
                                                arrayList9.add(f51VarM3258I);
                                            }
                                            i21 = i23;
                                            z4 = z6;
                                            iM2324g8 = i25;
                                            arrayList8 = arrayList10;
                                            z5 = true;
                                        }
                                        z2 = z4;
                                        i4 = iM2324g8;
                                        arrayList4 = arrayList8;
                                        if (!arrayList9.isEmpty()) {
                                            k51Var7 = new k51(arrayList9);
                                            break;
                                        }
                                        break;
                                    }
                                    dc1Var4.m2316F(i20 + iM2324g10);
                                    arrayDeque3 = arrayDeque2;
                                    z5 = true;
                                } else {
                                    arrayDeque2 = arrayDeque3;
                                    z2 = z4;
                                    i4 = iM2324g8;
                                    arrayList4 = arrayList8;
                                }
                                k51Var7 = null;
                                break;
                            }
                            k51Var8 = k51Var8.m3803b(k51Var7);
                            i16 = 8;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            z2 = z4;
                            i4 = iM2324g8;
                            arrayList4 = arrayList8;
                            if (iM2324g9 == 1936553057) {
                                dc1Var4.m2316F(i17);
                                int i32 = i17 + i4;
                                dc1Var4.m2317G(12);
                                while (true) {
                                    int i33 = dc1Var4.f2883b;
                                    if (i33 < i32) {
                                        int iM2324g16 = dc1Var4.m2324g();
                                        if (dc1Var4.m2324g() == 1935766900) {
                                            if (iM2324g16 >= 16) {
                                                dc1Var4.m2317G(4);
                                                int i34 = -1;
                                                int i35 = 0;
                                                for (int i36 = 0; i36 < 2; i36++) {
                                                    int iM2337t = dc1Var4.m2337t();
                                                    int iM2337t2 = dc1Var4.m2337t();
                                                    if (iM2337t == 0) {
                                                        i34 = iM2337t2;
                                                    } else if (iM2337t == 1) {
                                                        i35 = iM2337t2;
                                                    }
                                                }
                                                if (i34 != 12) {
                                                    if (i34 != 13) {
                                                        if (i34 != 21) {
                                                            iM2338u = -2147483647;
                                                        } else {
                                                            i16 = 8;
                                                            if (dc1Var4.m2318a() >= 8 && dc1Var4.f2883b + 8 <= i32) {
                                                                int iM2324g17 = dc1Var4.m2324g();
                                                                int iM2324g18 = dc1Var4.m2324g();
                                                                if (iM2324g17 >= 12 && iM2324g18 == 1936877170) {
                                                                    iM2338u = dc1Var4.m2338u();
                                                                }
                                                            }
                                                            iM2338u = -2147483647;
                                                        }
                                                        if (iM2338u == -2147483647) {
                                                            k51Var6 = new k51(new rt1(i35, iM2338u));
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    iM2338u = 120;
                                                } else {
                                                    iM2338u = 240;
                                                }
                                                i16 = 8;
                                                if (iM2338u == -2147483647) {
                                                    k51Var6 = new k51(new rt1(i35, iM2338u));
                                                    break;
                                                }
                                                break;
                                            }
                                            k51Var6 = null;
                                            i16 = 8;
                                            break;
                                        }
                                        dc1Var4.m2316F(i33 + iM2324g16);
                                    } else {
                                        i16 = 8;
                                    }
                                    k51Var6 = null;
                                    break;
                                }
                                k51VarM3803b = k51Var8.m3803b(k51Var6);
                            } else {
                                i16 = 8;
                                if (iM2324g9 == -1451722374) {
                                    short sM2334q = dc1Var4.m2334q();
                                    dc1Var4.m2317G(2);
                                    String strM2335r = dc1Var4.m2335r(sM2334q, StandardCharsets.UTF_8);
                                    int iMax = Math.max(strM2335r.lastIndexOf(43), strM2335r.lastIndexOf(45));
                                    try {
                                        k51Var5 = new k51(new o61(Float.parseFloat(strM2335r.substring(0, iMax)), Float.parseFloat(strM2335r.substring(iMax, strM2335r.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        k51Var5 = null;
                                    }
                                    k51VarM3803b = k51Var8.m3803b(k51Var5);
                                }
                            }
                            k51Var8 = k51VarM3803b;
                        }
                        dc1Var4.m2316F(i17 + i4);
                        arrayDeque3 = arrayDeque2;
                        z4 = z2;
                        arrayList8 = arrayList4;
                        z3 = true;
                    }
                    arrayDeque = arrayDeque3;
                    z = z4;
                    arrayList2 = arrayList8;
                    xh0Var.m6928b(k51Var8);
                    k51Var2 = k51Var8;
                } else {
                    arrayDeque = arrayDeque3;
                    z = z4;
                    arrayList2 = arrayList8;
                    k51Var2 = null;
                }
                l61 l61VarM3805s5 = k61Var.m3805s(1836476516);
                l61VarM3805s5.getClass();
                k51 k51Var9 = new k51(AbstractC0793jj.m3648d(l61VarM3805s5.f6194g));
                ArrayList arrayListM3651g = AbstractC0793jj.m3651g(k61Var, xh0Var, -9223372036854775807L, null, (i8 & 1) != 0, z, new l41(7));
                if (this.f7289x) {
                    boolean z7 = arrayList.size() == arrayListM3651g.size();
                    Locale locale = Locale.US;
                    ki0.m3865i(z7, "The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of editable video tracks (" + arrayListM3651g.size() + ")");
                }
                int size = -1;
                int i37 = 0;
                int i38 = 0;
                long j3 = -9223372036854775807L;
                while (i37 < arrayListM3651g.size()) {
                    d22 d22Var = (d22) arrayListM3651g.get(i37);
                    if (d22Var.f2755b == 0) {
                        k51Var3 = k51Var2;
                        k51Var4 = k51Var;
                        arrayList3 = arrayList2;
                    } else {
                        v12 v12Var = d22Var.f2754a;
                        long j4 = v12Var.f11488e;
                        be0 be0Var = v12Var.f11490g;
                        int i39 = v12Var.f11485b;
                        long j5 = j4 != -9223372036854775807L ? j4 : d22Var.f2761h;
                        long jMax = Math.max(j3, j5);
                        k51 k51Var10 = k51Var;
                        int i40 = i38 + 1;
                        m61 m61Var = new m61(v12Var, d22Var, this.f7291z.mo750n(i38, i39));
                        boolean zEquals = "audio/true-hd".equals(be0Var.f1341n);
                        int i41 = d22Var.f2758e;
                        int i42 = zEquals ? i41 * 16 : i41 + 30;
                        ae0 ae0VarM969a = be0Var.m969a();
                        ae0VarM969a.f198n = i42;
                        if (i39 == 2) {
                            int i43 = be0Var.f1333f;
                            if ((i8 & 8) != 0) {
                                i43 |= size == -1 ? 1 : 2;
                            }
                            if (be0Var.f1350w == -1.0f && j5 > 0 && (i3 = d22Var.f2755b) > 0) {
                                ae0VarM969a.f206v = i3 / (j5 / 1000000.0f);
                            }
                            if (this.f7289x) {
                                i43 |= 32768;
                                ae0VarM969a.f191g = ((Integer) arrayList.get(i37)).intValue();
                            }
                            ae0VarM969a.f190f = i43;
                        }
                        if (i39 == 1 && (i = xh0Var.f12605a) != -1 && (i2 = xh0Var.f12606b) != -1) {
                            ae0VarM969a.f178E = i;
                            ae0VarM969a.f179F = i2;
                        }
                        ArrayList arrayList11 = this.f7274i;
                        k51 k51Var11 = arrayList11.isEmpty() ? null : new k51(arrayList11);
                        k51 k51Var12 = k51Var2;
                        k51[] k51VarArr = {k51Var11, k51Var12, k51Var9};
                        k51 k51Var13 = new k51(new f51[0]);
                        if (k51Var10 != null) {
                            k51Var4 = k51Var10;
                            int i44 = 0;
                            while (true) {
                                f51[] f51VarArr = k51Var4.f5679a;
                                k51Var3 = k51Var12;
                                if (i44 >= f51VarArr.length) {
                                    break;
                                }
                                f51 f51Var = f51VarArr[i44];
                                if (f51Var instanceof p01) {
                                    p01 p01Var2 = (p01) f51Var;
                                    if (!p01Var2.f8606a.equals("com.android.capture.fps")) {
                                        k51VarM3802a = k51Var13.m3802a(p01Var2);
                                    } else if (i39 == 2) {
                                        k51VarM3802a = k51Var13.m3802a(p01Var2);
                                    }
                                    k51Var13 = k51VarM3802a;
                                }
                                i44++;
                                k51Var12 = k51Var3;
                            }
                        } else {
                            k51Var3 = k51Var12;
                            k51Var4 = k51Var10;
                        }
                        for (int i45 = 0; i45 < 3; i45++) {
                            k51Var13 = k51Var13.m3803b(k51VarArr[i45]);
                        }
                        if (k51Var13.f5679a.length > 0) {
                            ae0VarM969a.f195k = k51Var13;
                        }
                        m61Var.f6668c.mo1117d(new be0(ae0VarM969a));
                        if (i39 == 2 && size == -1) {
                            size = arrayList2.size();
                        }
                        arrayList3 = arrayList2;
                        arrayList3.add(m61Var);
                        i38 = i40;
                        j3 = jMax;
                    }
                    i37++;
                    arrayList2 = arrayList3;
                    k51Var = k51Var4;
                    arrayListM3651g = arrayListM3651g;
                    k51Var2 = k51Var3;
                }
                this.f7262C = size;
                this.f7263D = j3;
                m61[] m61VarArr = (m61[]) arrayList2.toArray(new m61[0]);
                this.f7260A = m61VarArr;
                long[][] jArr = new long[m61VarArr.length][];
                int[] iArr = new int[m61VarArr.length];
                long[] jArr2 = new long[m61VarArr.length];
                boolean[] zArr = new boolean[m61VarArr.length];
                for (int i46 = 0; i46 < m61VarArr.length; i46++) {
                    jArr[i46] = new long[m61VarArr[i46].f6667b.f2755b];
                    jArr2[i46] = m61VarArr[i46].f6667b.f2759f[0];
                }
                int i47 = 0;
                while (i47 < m61VarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i48 = -1;
                    for (int i49 = 0; i49 < m61VarArr.length; i49++) {
                        if (!zArr[i49]) {
                            long j7 = jArr2[i49];
                            if (j7 <= j6) {
                                i48 = i49;
                                j6 = j7;
                            }
                        }
                    }
                    int i50 = iArr[i48];
                    long[] jArr3 = jArr[i48];
                    jArr3[i50] = j2;
                    d22 d22Var2 = m61VarArr[i48].f6667b;
                    j2 += (long) d22Var2.f2757d[i50];
                    int i51 = i50 + 1;
                    iArr[i48] = i51;
                    if (i51 < jArr3.length) {
                        jArr2[i48] = d22Var2.f2759f[i51];
                    } else {
                        zArr[i48] = true;
                        i47++;
                    }
                }
                this.f7261B = jArr;
                this.f7291z.mo748k();
                this.f7291z.mo752q(this);
                arrayDeque.clear();
                if (!this.f7287v) {
                    this.f7276k = 2;
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((k61) arrayDeque3.peek()).f5684n.add(k61Var);
            }
        }
        if (this.f7276k != 2) {
            this.f7276k = 0;
            this.f7279n = 0;
        }
    }

    @Override // p000.x80
    public final void release() {
    }
}
