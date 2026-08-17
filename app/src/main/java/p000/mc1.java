package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mc1 implements i32 {

    /* JADX INFO: renamed from: a */
    public final m50 f6755a;

    /* JADX INFO: renamed from: b */
    public final C0141cm f6756b = new C0141cm(new byte[10], 10);

    /* JADX INFO: renamed from: c */
    public int f6757c = 0;

    /* JADX INFO: renamed from: d */
    public int f6758d;

    /* JADX INFO: renamed from: e */
    public y02 f6759e;

    /* JADX INFO: renamed from: f */
    public boolean f6760f;

    /* JADX INFO: renamed from: g */
    public boolean f6761g;

    /* JADX INFO: renamed from: h */
    public boolean f6762h;

    /* JADX INFO: renamed from: i */
    public int f6763i;

    /* JADX INFO: renamed from: j */
    public int f6764j;

    /* JADX INFO: renamed from: k */
    public boolean f6765k;

    /* JADX INFO: renamed from: l */
    public long f6766l;

    public mc1(m50 m50Var) {
        this.f6755a = m50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [cm] */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [m50] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.i32
    /* JADX INFO: renamed from: a */
    public final void mo3241a(int i, dc1 dc1Var) {
        int i2;
        Object r7;
        int i3;
        int i4;
        Object r11;
        ki0.m3866j(this.f6759e);
        int i5 = i & 1;
        Object r4 = this.f6755a;
        int i6 = 2;
        Object r8 = 0;
        if (i5 != 0) {
            int i7 = this.f6757c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    AbstractC1337qm.m5542i0("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i7 != 3) {
                        l41.m4046o();
                        return;
                    }
                    if (this.f6764j != -1) {
                        AbstractC1337qm.m5542i0("PesReader", "Unexpected start indicator: expected " + this.f6764j + " more bytes");
                    }
                    r4.mo1131d(dc1Var.f2884c == 0);
                }
            }
            this.f6757c = 1;
            this.f6758d = 0;
        }
        int i8 = i;
        while (dc1Var.m2318a() > 0) {
            int i9 = this.f6757c;
            if (i9 != 0) {
                Object r12 = this.f6756b;
                if (i9 != 1) {
                    if (i9 == i6) {
                        if (m4419d(dc1Var, r12.f1858b, Math.min(10, this.f6763i)) && m4419d(dc1Var, null, this.f6763i)) {
                            r12.m1246q(r8);
                            this.f6766l = -9223372036854775807L;
                            if (this.f6760f) {
                                r12.m1249t(4);
                                long jM1238i = ((long) r12.m1238i(3)) << 30;
                                r12.m1249t(1);
                                long jM1238i2 = ((long) (r12.m1238i(15) << 15)) | jM1238i;
                                r12.m1249t(1);
                                long jM1238i3 = jM1238i2 | ((long) r12.m1238i(15));
                                r12.m1249t(1);
                                if (!this.f6762h && this.f6761g) {
                                    r12.m1249t(4);
                                    long jM1238i4 = ((long) r12.m1238i(3)) << 30;
                                    r12.m1249t(1);
                                    long jM1238i5 = jM1238i4 | ((long) (r12.m1238i(15) << 15));
                                    r12.m1249t(1);
                                    long jM1238i6 = jM1238i5 | ((long) r12.m1238i(15));
                                    r12.m1249t(1);
                                    this.f6759e.m6984b(jM1238i6);
                                    this.f6762h = true;
                                }
                                this.f6766l = this.f6759e.m6984b(jM1238i3);
                            }
                            i8 |= this.f6765k ? 4 : 0;
                            r4.mo1132e(i8, this.f6766l);
                            this.f6757c = 3;
                            this.f6758d = 0;
                            r8 = 0;
                            i6 = 2;
                        }
                    } else {
                        if (i9 != 3) {
                            l41.m4046o();
                            return;
                        }
                        int iM2318a = dc1Var.m2318a();
                        int i10 = this.f6764j;
                        if (i10 == -1) {
                            r11 = r8;
                        } else {
                            i4 = iM2318a - i10;
                        }
                        if (r11 > 0) {
                            r11 = i4;
                            iM2318a -= r11;
                            dc1Var.m2315E(dc1Var.f2883b + iM2318a);
                        }
                        r11 = i4;
                        r4.mo1129a(dc1Var);
                        int i11 = this.f6764j;
                        if (i11 != -1) {
                            int i12 = i11 - iM2318a;
                            this.f6764j = i12;
                            if (i12 == 0) {
                                r4.mo1131d(r8);
                                this.f6757c = 1;
                                this.f6758d = r8;
                            }
                        }
                    }
                    i2 = i6;
                    r7 = r8;
                } else {
                    Object r9 = r8;
                    if (m4419d(dc1Var, r12.f1858b, 9)) {
                        r12.m1246q(r9 == true ? 1 : 0);
                        int iM1238i = r12.m1238i(24);
                        if (iM1238i != 1) {
                            jd0.m3621s(iM1238i, "Unexpected start code prefix: ", "PesReader");
                            this.f6764j = -1;
                            i3 = 0;
                            i2 = 2;
                        } else {
                            r12.m1249t(8);
                            int iM1238i2 = r12.m1238i(16);
                            r12.m1249t(5);
                            this.f6765k = r12.m1237h();
                            i2 = 2;
                            r12.m1249t(2);
                            this.f6760f = r12.m1237h();
                            this.f6761g = r12.m1237h();
                            r12.m1249t(6);
                            int iM1238i3 = r12.m1238i(8);
                            this.f6763i = iM1238i3;
                            if (iM1238i2 == 0) {
                                this.f6764j = -1;
                            } else {
                                int i13 = (iM1238i2 - 3) - iM1238i3;
                                this.f6764j = i13;
                                if (i13 < 0) {
                                    AbstractC1337qm.m5542i0("PesReader", "Found negative packet payload size: " + this.f6764j);
                                    this.f6764j = -1;
                                }
                            }
                            i3 = 2;
                        }
                        this.f6757c = i3;
                        r7 = 0;
                        this.f6758d = 0;
                    } else {
                        i2 = 2;
                        r7 = r9;
                    }
                }
            } else {
                i2 = i6;
                r7 = r8;
                dc1Var.m2317G(dc1Var.m2318a());
            }
            r8 = r7;
            i6 = i2;
        }
    }

    @Override // p000.i32
    /* JADX INFO: renamed from: b */
    public final void mo3242b(y02 y02Var, z80 z80Var, qk0 qk0Var) {
        this.f6759e = y02Var;
        this.f6755a.mo1133f(z80Var, qk0Var);
    }

    @Override // p000.i32
    /* JADX INFO: renamed from: c */
    public final void mo3243c() {
        this.f6757c = 0;
        this.f6758d = 0;
        this.f6762h = false;
        this.f6755a.mo1130c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4419d(dc1 dc1Var, byte[] bArr, int i) {
        int iMin = Math.min(dc1Var.m2318a(), i - this.f6758d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            dc1Var.m2317G(iMin);
        } else {
            dc1Var.m2322e(this.f6758d, iMin, bArr);
        }
        int i2 = this.f6758d + iMin;
        this.f6758d = i2;
        return i2 == i;
    }
}
