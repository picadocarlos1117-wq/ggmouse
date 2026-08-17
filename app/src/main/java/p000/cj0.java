package p000;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cj0 implements m50 {

    /* JADX INFO: renamed from: q */
    public static final double[] f1830q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f1831a;

    /* JADX INFO: renamed from: b */
    public c22 f1832b;

    /* JADX INFO: renamed from: c */
    public final qo0 f1833c;

    /* JADX INFO: renamed from: d */
    public final dc1 f1834d;

    /* JADX INFO: renamed from: e */
    public final i80 f1835e;

    /* JADX INFO: renamed from: f */
    public final boolean[] f1836f = new boolean[4];

    /* JADX INFO: renamed from: g */
    public final bj0 f1837g;

    /* JADX INFO: renamed from: h */
    public long f1838h;

    /* JADX INFO: renamed from: i */
    public boolean f1839i;

    /* JADX INFO: renamed from: j */
    public boolean f1840j;

    /* JADX INFO: renamed from: k */
    public long f1841k;

    /* JADX INFO: renamed from: l */
    public long f1842l;

    /* JADX INFO: renamed from: m */
    public long f1843m;

    /* JADX INFO: renamed from: n */
    public long f1844n;

    /* JADX INFO: renamed from: o */
    public boolean f1845o;

    /* JADX INFO: renamed from: p */
    public boolean f1846p;

    public cj0(qo0 qo0Var) {
        this.f1833c = qo0Var;
        bj0 bj0Var = new bj0();
        bj0Var.f1388d = new byte[128];
        this.f1837g = bj0Var;
        if (qo0Var != null) {
            this.f1835e = new i80(178);
            this.f1834d = new dc1();
        } else {
            this.f1835e = null;
            this.f1834d = null;
        }
        this.f1842l = -9223372036854775807L;
        this.f1844n = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
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
        bj0 bj0Var;
        i80 i80Var;
        int i;
        boolean z;
        boolean z2;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j;
        ki0.m3866j(this.f1832b);
        int i5 = dc1Var.f2883b;
        int i6 = dc1Var.f2884c;
        byte[] bArr = dc1Var.f2882a;
        this.f1838h += (long) dc1Var.m2318a();
        boolean z3 = false;
        this.f1832b.mo1115b(dc1Var, dc1Var.m2318a(), 0);
        while (true) {
            int iM4692z = o21.m4692z(bArr, i5, i6, this.f1836f);
            bj0Var = this.f1837g;
            i80Var = this.f1835e;
            if (iM4692z == i6) {
                break;
            }
            int i7 = iM4692z + 3;
            int i8 = dc1Var.f2882a[i7] & 255;
            int i9 = iM4692z - i5;
            if (this.f1840j) {
                i = i6;
            } else {
                if (i9 > 0) {
                    bj0Var.m997a(i5, iM4692z, bArr);
                }
                Object r12 = i9 < 0 ? -i9 : z3;
                if (bj0Var.f1385a) {
                    Object r15 = bj0Var.f1386b - r12;
                    bj0Var.f1386b = r15;
                    if (bj0Var.f1387c == 0 && i8 == 181) {
                        bj0Var.f1387c = r15;
                        i = i6;
                    } else {
                        bj0Var.f1385a = z3;
                        String str = this.f1831a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf((byte[]) bj0Var.f1388d, bj0Var.f1386b);
                        int i10 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        i = i6;
                        int i11 = ((b & 255) >> 4) | (i10 << 4);
                        int i12 = (bArrCopyOf[6] & 255) | ((b & 15) << 8);
                        int i13 = (bArrCopyOf[7] & 240) >> 4;
                        if (i13 == 2) {
                            f = i12 * 4;
                            i3 = i11 * 3;
                        } else if (i13 != 3) {
                            if (i13 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i12 * 121;
                                i3 = i11 * 100;
                            }
                            ae0 ae0Var = new ae0();
                            ae0Var.f185a = str;
                            ae0Var.f197m = v51.m6582l("video/mpeg2");
                            ae0Var.f204t = i11;
                            ae0Var.f205u = i12;
                            ae0Var.f208x = f2;
                            ae0Var.f200p = Collections.singletonList(bArrCopyOf);
                            be0 be0Var = new be0(ae0Var);
                            i4 = (bArrCopyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j = 0;
                            } else {
                                double d = f1830q[i4];
                                byte b2 = bArrCopyOf[bj0Var.f1387c + 9];
                                int i14 = (b2 & 96) >> 5;
                                int i15 = b2 & 31;
                                if (i14 != i15) {
                                    d *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(be0Var, Long.valueOf(j));
                            this.f1832b.mo1117d((be0) pairCreate.first);
                            this.f1841k = ((Long) pairCreate.second).longValue();
                            this.f1840j = true;
                        } else {
                            f = i12 * 16;
                            i3 = i11 * 9;
                        }
                        f2 = f / i3;
                        ae0 ae0Var2 = new ae0();
                        ae0Var2.f185a = str;
                        ae0Var2.f197m = v51.m6582l("video/mpeg2");
                        ae0Var2.f204t = i11;
                        ae0Var2.f205u = i12;
                        ae0Var2.f208x = f2;
                        ae0Var2.f200p = Collections.singletonList(bArrCopyOf);
                        be0 be0Var2 = new be0(ae0Var2);
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                            j = 0;
                        } else {
                            j = 0;
                        }
                        Pair pairCreate2 = Pair.create(be0Var2, Long.valueOf(j));
                        this.f1832b.mo1117d((be0) pairCreate2.first);
                        this.f1841k = ((Long) pairCreate2.second).longValue();
                        this.f1840j = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        bj0Var.f1385a = true;
                    }
                }
                bj0Var.m997a(0, 3, bj0.f1384e);
            }
            if (i80Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    i80Var.m3382a(i5, iM4692z, bArr);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (i80Var.m3385d(i2)) {
                    int iM4689x0 = o21.m4689x0(i80Var.f4863c, (byte[]) i80Var.f4866f);
                    int i16 = z42.f13274a;
                    byte[] bArr2 = (byte[]) i80Var.f4866f;
                    dc1 dc1Var2 = this.f1834d;
                    dc1Var2.m2314D(iM4689x0, bArr2);
                    this.f1833c.m5581D(this.f1844n, dc1Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (dc1Var.f2882a[iM4692z + 2] == 1) {
                        i80Var.m3388g(i8);
                    }
                } else {
                    z = true;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i17 = i - iM4692z;
                if (this.f1846p && this.f1840j) {
                    long j2 = this.f1844n;
                    if (j2 != -9223372036854775807L) {
                        this.f1832b.mo1114a(j2, this.f1845o ? 1 : 0, ((int) (this.f1838h - this.f1843m)) - i17, i17, null);
                    }
                }
                if (!this.f1839i || this.f1846p) {
                    this.f1843m = this.f1838h - ((long) i17);
                    long j3 = this.f1842l;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.f1844n;
                        j3 = j4 != -9223372036854775807L ? j4 + this.f1841k : -9223372036854775807L;
                    }
                    this.f1844n = j3;
                    z3 = false;
                    this.f1845o = false;
                    this.f1842l = -9223372036854775807L;
                    z2 = true;
                    this.f1839i = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                this.f1846p = i8 == 0 ? z2 : z3;
            } else {
                if (i8 == 184) {
                    this.f1845o = z;
                }
                z3 = false;
            }
            i5 = i7;
            i6 = i;
        }
        if (!this.f1840j) {
            bj0Var.m997a(i5, i6, bArr);
        }
        if (i80Var != null) {
            i80Var.m3382a(i5, i6, bArr);
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        o21.m4667l(this.f1836f);
        bj0 bj0Var = this.f1837g;
        bj0Var.f1385a = false;
        bj0Var.f1386b = 0;
        bj0Var.f1387c = 0;
        i80 i80Var = this.f1835e;
        if (i80Var != null) {
            i80Var.m3387f();
        }
        this.f1838h = 0L;
        this.f1839i = false;
        this.f1842l = -9223372036854775807L;
        this.f1844n = -9223372036854775807L;
    }

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
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
        ki0.m3866j(this.f1832b);
        if (z) {
            boolean z2 = this.f1845o;
            this.f1832b.mo1114a(this.f1844n, z2 ? 1 : 0, (int) (this.f1838h - this.f1843m), 0, null);
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f1842l = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f1831a = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        this.f1832b = z80Var.mo750n(qk0Var.f9521c, 2);
        qo0 qo0Var = this.f1833c;
        if (qo0Var != null) {
            qo0Var.m5582E(z80Var, qk0Var);
        }
    }
}
