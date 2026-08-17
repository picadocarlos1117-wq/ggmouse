package p000;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: e5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0591e5 implements m50 {

    /* JADX INFO: renamed from: w */
    public static final byte[] f3192w = {73, 68, 51};

    /* JADX INFO: renamed from: a */
    public final boolean f3193a;

    /* JADX INFO: renamed from: d */
    public final String f3196d;

    /* JADX INFO: renamed from: e */
    public final int f3197e;

    /* JADX INFO: renamed from: f */
    public String f3198f;

    /* JADX INFO: renamed from: g */
    public c22 f3199g;

    /* JADX INFO: renamed from: h */
    public c22 f3200h;

    /* JADX INFO: renamed from: l */
    public boolean f3204l;

    /* JADX INFO: renamed from: m */
    public boolean f3205m;

    /* JADX INFO: renamed from: p */
    public int f3208p;

    /* JADX INFO: renamed from: q */
    public boolean f3209q;

    /* JADX INFO: renamed from: s */
    public int f3211s;

    /* JADX INFO: renamed from: u */
    public c22 f3213u;

    /* JADX INFO: renamed from: v */
    public long f3214v;

    /* JADX INFO: renamed from: b */
    public final C0141cm f3194b = new C0141cm(new byte[7], 7);

    /* JADX INFO: renamed from: c */
    public final dc1 f3195c = new dc1(Arrays.copyOf(f3192w, 10));

    /* JADX INFO: renamed from: i */
    public int f3201i = 0;

    /* JADX INFO: renamed from: j */
    public int f3202j = 0;

    /* JADX INFO: renamed from: k */
    public int f3203k = 256;

    /* JADX INFO: renamed from: n */
    public int f3206n = -1;

    /* JADX INFO: renamed from: o */
    public int f3207o = -1;

    /* JADX INFO: renamed from: r */
    public long f3210r = -9223372036854775807L;

    /* JADX INFO: renamed from: t */
    public long f3212t = -9223372036854775807L;

    public C0591e5(String str, int i, boolean z) {
        this.f3193a = z;
        this.f3196d = str;
        this.f3197e = i;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01f7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.f3199g.getClass();
        int i7 = z42.f13274a;
        while (dc1Var.m2318a() > 0) {
            int i8 = this.f3201i;
            byte b2 = -1;
            dc1 dc1Var2 = this.f3195c;
            int i9 = 3;
            C0141cm c0141cm = this.f3194b;
            int i10 = 4;
            int i11 = 0;
            int i12 = 1;
            if (i8 == 0) {
                byte[] bArr = dc1Var.f2882a;
                int i13 = dc1Var.f2883b;
                int i14 = dc1Var.f2884c;
                while (true) {
                    if (i13 < i14) {
                        int i15 = i13 + 1;
                        int i16 = i9;
                        int i17 = bArr[i13];
                        int i18 = i17 & 255;
                        if (this.f3203k == 512 && (((65280 | ((((byte) i18) & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.f3205m) {
                                int i19 = i13 - 1;
                                dc1Var.m2316F(i13);
                                byte[] bArr2 = c0141cm.f1858b;
                                if (dc1Var.m2318a() < i12) {
                                    b = -1;
                                } else {
                                    dc1Var.m2322e(i11, i12, bArr2);
                                    c0141cm.m1246q(i10);
                                    int iM1238i = c0141cm.m1238i(i12);
                                    int i20 = this.f3206n;
                                    if (i20 == -1 || iM1238i == i20) {
                                        if (this.f3207o != -1) {
                                            byte[] bArr3 = c0141cm.f1858b;
                                            if (dc1Var.m2318a() >= i12) {
                                                dc1Var.m2322e(i11, i12, bArr3);
                                                c0141cm.m1246q(2);
                                                i4 = 4;
                                                if (c0141cm.m1238i(4) != this.f3207o) {
                                                    b = -1;
                                                } else {
                                                    dc1Var.m2316F(i15);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = c0141cm.f1858b;
                                        if (dc1Var.m2318a() >= i4) {
                                            dc1Var.m2322e(i11, i4, bArr4);
                                            c0141cm.m1246q(14);
                                            int iM1238i2 = c0141cm.m1238i(13);
                                            if (iM1238i2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = dc1Var.f2882a;
                                                int i21 = dc1Var.f2884c;
                                                int i22 = i19 + iM1238i2;
                                                if (i22 < i21) {
                                                    byte b3 = bArr5[i22];
                                                    b = -1;
                                                    if (b3 == -1) {
                                                        int i23 = i22 + 1;
                                                        if (i23 != i21) {
                                                            int i24 = bArr5[i23];
                                                            if ((((65280 | ((i24 & 255) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((i24 & 8) >> 3) == iM1238i) {
                                                            }
                                                        }
                                                    } else if (b3 == 73 && ((i5 = i22 + 1) == i21 || (bArr5[i5] == 68 && ((i6 = i22 + 2) == i21 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.f3208p = (i17 & 8) >> 3;
                            this.f3204l = (i17 & 1) == 0;
                            if (this.f3205m) {
                                this.f3201i = i16;
                                this.f3202j = 0;
                            } else {
                                this.f3201i = 1;
                                this.f3202j = 0;
                            }
                            dc1Var.m2316F(i15);
                        } else {
                            b = b2;
                            i = i12;
                        }
                        int i25 = this.f3203k;
                        int i26 = i18 | i25;
                        if (i26 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f3203k = 768;
                        } else if (i26 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f3203k = UserVerificationMethods.USER_VERIFY_NONE;
                        } else if (i26 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.f3203k = 1024;
                        } else if (i26 != 1075) {
                            c = 256;
                            if (i25 != 256) {
                                this.f3203k = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i12 = i;
                            b2 = b;
                            i10 = 4;
                            i11 = i3;
                            i9 = i2;
                        } else {
                            this.f3201i = 2;
                            this.f3202j = 3;
                            this.f3211s = 0;
                            dc1Var2.m2316F(0);
                            dc1Var.m2316F(i15);
                        }
                        i13 = i15;
                        i12 = i;
                        b2 = b;
                        i10 = 4;
                        i11 = i3;
                        i9 = i2;
                    } else {
                        dc1Var.m2316F(i13);
                    }
                }
            } else if (i8 != 1) {
                if (i8 == 2) {
                    byte[] bArr6 = dc1Var2.f2882a;
                    int iMin = Math.min(dc1Var.m2318a(), 10 - this.f3202j);
                    dc1Var.m2322e(this.f3202j, iMin, bArr6);
                    int i27 = this.f3202j + iMin;
                    this.f3202j = i27;
                    if (i27 == 10) {
                        this.f3200h.mo1115b(dc1Var2, 10, 0);
                        dc1Var2.m2316F(6);
                        c22 c22Var = this.f3200h;
                        int iM2336s = dc1Var2.m2336s() + 10;
                        this.f3201i = 4;
                        this.f3202j = 10;
                        this.f3213u = c22Var;
                        this.f3214v = 0L;
                        this.f3211s = iM2336s;
                    }
                } else if (i8 == 3) {
                    int i28 = this.f3204l ? 7 : 5;
                    byte[] bArr7 = c0141cm.f1858b;
                    int iMin2 = Math.min(dc1Var.m2318a(), i28 - this.f3202j);
                    dc1Var.m2322e(this.f3202j, iMin2, bArr7);
                    int i29 = this.f3202j + iMin2;
                    this.f3202j = i29;
                    if (i29 == i28) {
                        c0141cm.m1246q(0);
                        if (this.f3209q) {
                            c0141cm.m1249t(10);
                        } else {
                            int iM1238i3 = c0141cm.m1238i(2) + 1;
                            if (iM1238i3 != 2) {
                                AbstractC1337qm.m5542i0("AdtsReader", "Detected audio object type: " + iM1238i3 + ", but assuming AAC LC.");
                                iM1238i3 = 2;
                            }
                            c0141cm.m1249t(5);
                            int iM1238i4 = c0141cm.m1238i(3);
                            int i30 = this.f3207o;
                            byte[] bArr8 = {(byte) (((iM1238i3 << 3) & 248) | ((i30 >> 1) & 7)), (byte) (((iM1238i4 << 3) & 120) | ((i30 << 7) & 128))};
                            C0586e0 c0586e0M3845P = ki0.m3845P(new C0141cm(bArr8, 2), false);
                            ae0 ae0Var = new ae0();
                            ae0Var.f185a = this.f3198f;
                            ae0Var.f197m = v51.m6582l("audio/mp4a-latm");
                            ae0Var.f194j = c0586e0M3845P.f3087a;
                            ae0Var.f175B = c0586e0M3845P.f3089c;
                            ae0Var.f176C = c0586e0M3845P.f3088b;
                            ae0Var.f200p = Collections.singletonList(bArr8);
                            ae0Var.f188d = this.f3196d;
                            ae0Var.f190f = this.f3197e;
                            be0 be0Var = new be0(ae0Var);
                            this.f3210r = 1024000000 / ((long) be0Var.f1318D);
                            this.f3199g.mo1117d(be0Var);
                            this.f3209q = true;
                        }
                        c0141cm.m1249t(4);
                        int iM1238i5 = c0141cm.m1238i(13);
                        int i31 = iM1238i5 - 7;
                        if (this.f3204l) {
                            i31 = iM1238i5 - 9;
                        }
                        c22 c22Var2 = this.f3199g;
                        long j = this.f3210r;
                        this.f3201i = 4;
                        this.f3202j = 0;
                        this.f3213u = c22Var2;
                        this.f3214v = j;
                        this.f3211s = i31;
                    }
                } else {
                    if (i8 != 4) {
                        l41.m4046o();
                        return;
                    }
                    int iMin3 = Math.min(dc1Var.m2318a(), this.f3211s - this.f3202j);
                    this.f3213u.mo1115b(dc1Var, iMin3, 0);
                    int i32 = this.f3202j + iMin3;
                    this.f3202j = i32;
                    if (i32 == this.f3211s) {
                        ki0.m3864h(this.f3212t != -9223372036854775807L);
                        this.f3213u.mo1114a(this.f3212t, 1, this.f3211s, 0, null);
                        this.f3212t += this.f3214v;
                        this.f3201i = 0;
                        this.f3202j = 0;
                        this.f3203k = 256;
                    }
                }
            } else if (dc1Var.m2318a() != 0) {
                c0141cm.f1858b[0] = dc1Var.f2882a[dc1Var.f2883b];
                c0141cm.m1246q(2);
                int iM1238i6 = c0141cm.m1238i(4);
                int i33 = this.f3207o;
                if (i33 == -1 || iM1238i6 == i33) {
                    if (!this.f3205m) {
                        this.f3205m = true;
                        this.f3206n = this.f3208p;
                        this.f3207o = iM1238i6;
                    }
                    this.f3201i = 3;
                    this.f3202j = 0;
                } else {
                    this.f3205m = false;
                    this.f3201i = 0;
                    this.f3202j = 0;
                    this.f3203k = 256;
                }
            }
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f3212t = -9223372036854775807L;
        this.f3205m = false;
        this.f3201i = 0;
        this.f3202j = 0;
        this.f3203k = 256;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f3212t = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f3198f = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 1);
        this.f3199g = c22VarMo750n;
        this.f3213u = c22VarMo750n;
        if (!this.f3193a) {
            this.f3200h = new t20();
            return;
        }
        qk0Var.m5498a();
        qk0Var.m5500c();
        c22 c22VarMo750n2 = z80Var.mo750n(qk0Var.f9521c, 5);
        this.f3200h = c22VarMo750n2;
        ae0 ae0Var = new ae0();
        qk0Var.m5500c();
        ae0Var.f185a = (String) qk0Var.f9523e;
        ae0Var.f197m = v51.m6582l("application/id3");
        c22VarMo750n2.mo1117d(new be0(ae0Var));
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
    }
}
