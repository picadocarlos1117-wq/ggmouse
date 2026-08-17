package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 implements m50 {

    /* JADX INFO: renamed from: a */
    public final C1174o9 f5027a;

    /* JADX INFO: renamed from: b */
    public final boolean f5028b;

    /* JADX INFO: renamed from: c */
    public final boolean f5029c;

    /* JADX INFO: renamed from: g */
    public long f5033g;

    /* JADX INFO: renamed from: i */
    public String f5035i;

    /* JADX INFO: renamed from: j */
    public c22 f5036j;

    /* JADX INFO: renamed from: k */
    public hj0 f5037k;

    /* JADX INFO: renamed from: l */
    public boolean f5038l;

    /* JADX INFO: renamed from: n */
    public boolean f5040n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f5034h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final i80 f5030d = new i80(7);

    /* JADX INFO: renamed from: e */
    public final i80 f5031e = new i80(8);

    /* JADX INFO: renamed from: f */
    public final i80 f5032f = new i80(6);

    /* JADX INFO: renamed from: m */
    public long f5039m = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final dc1 f5041o = new dc1();

    public ij0(C1174o9 c1174o9, boolean z, boolean z2) {
        this.f5027a = c1174o9;
        this.f5028b = z;
        this.f5029c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0200  */
    /* JADX WARN: Code duplicated, block: B:51:0x020a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0210  */
    /* JADX WARN: Code duplicated, block: B:91:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x027c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0293  */
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
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        long j;
        i80 i80Var;
        hj0 hj0Var;
        boolean z;
        boolean z2;
        long j2;
        int i5;
        long j3;
        int i6;
        hj0 hj0Var2;
        int i7;
        gj0 gj0Var;
        gj0 gj0Var2;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ki0.m3866j(this.f5036j);
        int i11 = z42.f13274a;
        int i12 = dc1Var.f2883b;
        int i13 = dc1Var.f2884c;
        byte[] bArr2 = dc1Var.f2882a;
        this.f5033g += (long) dc1Var.m2318a();
        int i14 = 0;
        this.f5036j.mo1115b(dc1Var, dc1Var.m2318a(), 0);
        while (true) {
            int iM4692z = o21.m4692z(bArr2, i12, i13, this.f5034h);
            if (iM4692z == i13) {
                m3437b(i12, i13, bArr2);
                return;
            }
            int i15 = iM4692z + 3;
            int i16 = bArr2[i15] & 31;
            int i17 = iM4692z - i12;
            if (i17 > 0) {
                m3437b(i12, iM4692z, bArr2);
            }
            int i18 = i13 - iM4692z;
            long j4 = this.f5033g - ((long) i18);
            int i19 = i17 < 0 ? -i17 : i14;
            long j5 = this.f5039m;
            C1652z4 c1652z4 = (C1652z4) this.f5027a.f7701d;
            boolean z4 = this.f5038l;
            i80 i80Var2 = this.f5031e;
            i80 i80Var3 = this.f5030d;
            if (!z4 || this.f5037k.f4590c) {
                i80Var3.m3385d(i19);
                i80Var2.m3385d(i19);
                boolean z5 = this.f5038l;
                boolean z6 = i80Var3.f4865e;
                i = i18;
                if (z5) {
                    i2 = i13;
                    bArr = bArr2;
                    i3 = i15;
                    i4 = i16;
                    j = j4;
                    if (z6) {
                        t71 t71VarM4670m0 = o21.m4670m0(3, i80Var3.f4863c, (byte[]) i80Var3.f4866f);
                        int i20 = t71VarM4670m0.f10796s;
                        c1652z4.getClass();
                        ki0.m3864h(i20 >= 0);
                        c1652z4.f13266a = i20;
                        c1652z4.m7198i(i20);
                        this.f5037k.f4591d.append(t71VarM4670m0.f10781d, t71VarM4670m0);
                        i80Var3.m3387f();
                    } else if (i80Var2.f4865e) {
                        C0141cm c0141cm = new C0141cm((byte[]) i80Var2.f4866f, 4, i80Var2.f4863c);
                        int iM1242m = c0141cm.m1242m();
                        int iM1242m2 = c0141cm.m1242m();
                        c0141cm.m1248s();
                        this.f5037k.f4592e.append(iM1242m, new s71(iM1242m, iM1242m2, c0141cm.m1237h()));
                        i80Var2.m3387f();
                    }
                } else if (z6 && i80Var2.f4865e) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf((byte[]) i80Var3.f4866f, i80Var3.f4863c));
                    arrayList.add(Arrays.copyOf((byte[]) i80Var2.f4866f, i80Var2.f4863c));
                    i2 = i13;
                    t71 t71VarM4670m1 = o21.m4670m0(3, i80Var3.f4863c, (byte[]) i80Var3.f4866f);
                    int i21 = t71VarM4670m1.f10796s;
                    bArr = bArr2;
                    i3 = i15;
                    j = j4;
                    C0141cm c0141cm2 = new C0141cm((byte[]) i80Var2.f4866f, 4, i80Var2.f4863c);
                    int iM1242m3 = c0141cm2.m1242m();
                    int iM1242m4 = c0141cm2.m1242m();
                    c0141cm2.m1248s();
                    s71 s71Var = new s71(iM1242m3, iM1242m4, c0141cm2.m1237h());
                    int i22 = t71VarM4670m1.f10778a;
                    int i23 = t71VarM4670m1.f10779b;
                    int i24 = t71VarM4670m1.f10780c;
                    byte[] bArr3 = AbstractC0574dp.f2986a;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i22), Integer.valueOf(i23), Integer.valueOf(i24));
                    c22 c22Var = this.f5036j;
                    ae0 ae0Var = new ae0();
                    i4 = i16;
                    ae0Var.f185a = this.f5035i;
                    ae0Var.f197m = v51.m6582l("video/avc");
                    ae0Var.f194j = str;
                    ae0Var.f204t = t71VarM4670m1.f10782e;
                    ae0Var.f205u = t71VarM4670m1.f10783f;
                    ae0Var.f174A = new C1673zp(t71VarM4670m1.f10793p, t71VarM4670m1.f10794q, t71VarM4670m1.f10795r, null, t71VarM4670m1.f10785h + 8, t71VarM4670m1.f10786i + 8);
                    ae0Var.f208x = t71VarM4670m1.f10784g;
                    ae0Var.f200p = arrayList;
                    ae0Var.f199o = i21;
                    c22Var.mo1117d(new be0(ae0Var));
                    this.f5038l = true;
                    c1652z4.getClass();
                    ki0.m3864h(i21 >= 0);
                    c1652z4.f13266a = i21;
                    c1652z4.m7198i(i21);
                    this.f5037k.f4591d.append(t71VarM4670m1.f10781d, t71VarM4670m1);
                    this.f5037k.f4592e.append(iM1242m3, s71Var);
                    i80Var3.m3387f();
                    i80Var2.m3387f();
                }
                i80Var = this.f5032f;
                if (i80Var.m3385d(i19)) {
                    int iM4689x0 = o21.m4689x0(i80Var.f4863c, (byte[]) i80Var.f4866f);
                    byte[] bArr4 = (byte[]) i80Var.f4866f;
                    dc1 dc1Var2 = this.f5041o;
                    dc1Var2.m2314D(iM4689x0, bArr4);
                    dc1Var2.m2316F(4);
                    c1652z4.m7190a(j5, dc1Var2);
                }
                hj0Var = this.f5037k;
                z = this.f5038l;
                if (hj0Var.f4596i == 9) {
                    if (z && hj0Var.f4602o) {
                        j2 = hj0Var.f4597j;
                        i5 = i + ((int) (j - j2));
                        j3 = hj0Var.f4604q;
                        if (j3 != -9223372036854775807L) {
                            hj0Var.f4588a.mo1114a(j3, hj0Var.f4605r ? 1 : 0, (int) (j2 - hj0Var.f4603p), i5, null);
                        }
                    }
                    hj0Var.f4603p = hj0Var.f4597j;
                    hj0Var.f4604q = hj0Var.f4599l;
                    z2 = false;
                    hj0Var.f4605r = false;
                    hj0Var.f4602o = true;
                } else {
                    if (hj0Var.f4590c) {
                        gj0Var = hj0Var.f4601n;
                        gj0Var2 = hj0Var.f4600m;
                        if (gj0Var.f4200a) {
                            if (gj0Var2.f4200a) {
                                t71 t71Var = gj0Var.f4202c;
                                ki0.m3866j(t71Var);
                                t71 t71Var2 = gj0Var2.f4202c;
                                ki0.m3866j(t71Var2);
                                int i25 = t71Var2.f10790m;
                                if (gj0Var.f4205f == gj0Var2.f4205f || gj0Var.f4206g != gj0Var2.f4206g || gj0Var.f4207h != gj0Var2.f4207h || ((gj0Var.f4208i && gj0Var2.f4208i && gj0Var.f4209j != gj0Var2.f4209j) || (((i8 = gj0Var.f4203d) != (i9 = gj0Var2.f4203d) && (i8 == 0 || i9 == 0)) || (((i10 = t71Var.f10790m) == 0 && i25 == 0 && (gj0Var.f4212m != gj0Var2.f4212m || gj0Var.f4213n != gj0Var2.f4213n)) || ((i10 == 1 && i25 == 1 && (gj0Var.f4214o != gj0Var2.f4214o || gj0Var.f4215p != gj0Var2.f4215p)) || (z3 = gj0Var.f4210k) != gj0Var2.f4210k || (z3 && gj0Var.f4211l != gj0Var2.f4211l)))))) {
                                }
                            }
                            if (z) {
                                j2 = hj0Var.f4597j;
                                i5 = i + ((int) (j - j2));
                                j3 = hj0Var.f4604q;
                                if (j3 != -9223372036854775807L) {
                                    hj0Var.f4588a.mo1114a(j3, hj0Var.f4605r ? 1 : 0, (int) (j2 - hj0Var.f4603p), i5, null);
                                }
                            }
                            hj0Var.f4603p = hj0Var.f4597j;
                            hj0Var.f4604q = hj0Var.f4599l;
                            z2 = false;
                            hj0Var.f4605r = false;
                            hj0Var.f4602o = true;
                        }
                    }
                    z2 = false;
                }
                hj0Var.m3159a();
                if (hj0Var.f4605r) {
                    this.f5040n = z2;
                }
                long j6 = this.f5039m;
                if (this.f5038l || this.f5037k.f4590c) {
                    i6 = i4;
                    i80Var3.m3388g(i6);
                    i80Var2.m3388g(i6);
                } else {
                    i6 = i4;
                }
                i80Var.m3388g(i6);
                hj0Var2 = this.f5037k;
                boolean z7 = this.f5040n;
                hj0Var2.f4596i = i6;
                hj0Var2.f4599l = j6;
                hj0Var2.f4597j = j;
                hj0Var2.f4606s = z7;
                if ((!hj0Var2.f4589b && i6 == 1) || (hj0Var2.f4590c && (i6 == 5 || i6 == 1 || i6 == 2))) {
                    gj0 gj0Var3 = hj0Var2.f4600m;
                    hj0Var2.f4600m = hj0Var2.f4601n;
                    hj0Var2.f4601n = gj0Var3;
                    i7 = 0;
                    gj0Var3.f4201b = false;
                    gj0Var3.f4200a = false;
                    hj0Var2.f4595h = 0;
                    hj0Var2.f4598k = true;
                }
                i14 = i7;
                i13 = i2;
                bArr2 = bArr;
                i12 = i3;
            } else {
                i = i18;
            }
            i2 = i13;
            bArr = bArr2;
            i3 = i15;
            i4 = i16;
            j = j4;
            i80Var = this.f5032f;
            if (i80Var.m3385d(i19)) {
                int iM4689x1 = o21.m4689x0(i80Var.f4863c, (byte[]) i80Var.f4866f);
                byte[] bArr5 = (byte[]) i80Var.f4866f;
                dc1 dc1Var3 = this.f5041o;
                dc1Var3.m2314D(iM4689x1, bArr5);
                dc1Var3.m2316F(4);
                c1652z4.m7190a(j5, dc1Var3);
            }
            hj0Var = this.f5037k;
            z = this.f5038l;
            if (hj0Var.f4596i == 9) {
                if (z) {
                    j2 = hj0Var.f4597j;
                    i5 = i + ((int) (j - j2));
                    j3 = hj0Var.f4604q;
                    if (j3 != -9223372036854775807L) {
                        hj0Var.f4588a.mo1114a(j3, hj0Var.f4605r ? 1 : 0, (int) (j2 - hj0Var.f4603p), i5, null);
                    }
                }
                hj0Var.f4603p = hj0Var.f4597j;
                hj0Var.f4604q = hj0Var.f4599l;
                z2 = false;
                hj0Var.f4605r = false;
                hj0Var.f4602o = true;
            } else {
                if (hj0Var.f4590c) {
                    gj0Var = hj0Var.f4601n;
                    gj0Var2 = hj0Var.f4600m;
                    if (gj0Var.f4200a) {
                        if (gj0Var2.f4200a) {
                            t71 t71Var3 = gj0Var.f4202c;
                            ki0.m3866j(t71Var3);
                            t71 t71Var4 = gj0Var2.f4202c;
                            ki0.m3866j(t71Var4);
                            int i26 = t71Var4.f10790m;
                            if (gj0Var.f4205f == gj0Var2.f4205f) {
                            }
                        }
                        if (z) {
                            j2 = hj0Var.f4597j;
                            i5 = i + ((int) (j - j2));
                            j3 = hj0Var.f4604q;
                            if (j3 != -9223372036854775807L) {
                                hj0Var.f4588a.mo1114a(j3, hj0Var.f4605r ? 1 : 0, (int) (j2 - hj0Var.f4603p), i5, null);
                            }
                        }
                        hj0Var.f4603p = hj0Var.f4597j;
                        hj0Var.f4604q = hj0Var.f4599l;
                        z2 = false;
                        hj0Var.f4605r = false;
                        hj0Var.f4602o = true;
                    }
                }
                z2 = false;
            }
            hj0Var.m3159a();
            if (hj0Var.f4605r) {
                this.f5040n = z2;
            }
            long j7 = this.f5039m;
            if (this.f5038l) {
                i6 = i4;
                i80Var3.m3388g(i6);
                i80Var2.m3388g(i6);
            } else {
                i6 = i4;
                i80Var3.m3388g(i6);
                i80Var2.m3388g(i6);
            }
            i80Var.m3388g(i6);
            hj0Var2 = this.f5037k;
            boolean z8 = this.f5040n;
            hj0Var2.f4596i = i6;
            hj0Var2.f4599l = j7;
            hj0Var2.f4597j = j;
            hj0Var2.f4606s = z8;
            i7 = !hj0Var2.f4589b ? 0 : 0;
            i14 = i7;
            i13 = i2;
            bArr2 = bArr;
            i12 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    /* JADX INFO: renamed from: b */
    public final void m3437b(int i, int i2, byte[] bArr) {
        boolean zM1237h;
        boolean zM1237h2;
        boolean z;
        boolean z2;
        int iM1242m;
        int i3;
        int iM1238i;
        int i4;
        int iM1243n;
        int iM1243n2;
        if (!this.f5038l || this.f5037k.f4590c) {
            this.f5030d.m3382a(i, i2, bArr);
            this.f5031e.m3382a(i, i2, bArr);
        }
        this.f5032f.m3382a(i, i2, bArr);
        hj0 hj0Var = this.f5037k;
        SparseArray sparseArray = hj0Var.f4592e;
        C0141cm c0141cm = hj0Var.f4593f;
        if (hj0Var.f4598k) {
            int i5 = i2 - i;
            byte[] bArr2 = hj0Var.f4594g;
            int length = bArr2.length;
            int i6 = hj0Var.f4595h + i5;
            if (length < i6) {
                hj0Var.f4594g = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i, hj0Var.f4594g, hj0Var.f4595h, i5);
            int i7 = hj0Var.f4595h + i5;
            hj0Var.f4595h = i7;
            c0141cm.f1858b = hj0Var.f4594g;
            c0141cm.f1860d = 0;
            c0141cm.f1859c = i7;
            c0141cm.f1861e = 0;
            c0141cm.m1230a();
            if (c0141cm.m1233d(8)) {
                c0141cm.m1248s();
                int iM1238i2 = c0141cm.m1238i(2);
                c0141cm.m1249t(5);
                if (c0141cm.m1234e()) {
                    c0141cm.m1242m();
                    if (c0141cm.m1234e()) {
                        int iM1242m2 = c0141cm.m1242m();
                        if (!hj0Var.f4590c) {
                            hj0Var.f4598k = false;
                            gj0 gj0Var = hj0Var.f4601n;
                            gj0Var.f4204e = iM1242m2;
                            gj0Var.f4201b = true;
                            return;
                        }
                        if (c0141cm.m1234e()) {
                            int iM1242m3 = c0141cm.m1242m();
                            if (sparseArray.indexOfKey(iM1242m3) < 0) {
                                hj0Var.f4598k = false;
                                return;
                            }
                            s71 s71Var = (s71) sparseArray.get(iM1242m3);
                            SparseArray sparseArray2 = hj0Var.f4591d;
                            int i8 = s71Var.f10272a;
                            boolean z3 = s71Var.f10273b;
                            t71 t71Var = (t71) sparseArray2.get(i8);
                            boolean z4 = t71Var.f10787j;
                            int i9 = t71Var.f10791n;
                            int i10 = t71Var.f10789l;
                            if (z4) {
                                if (!c0141cm.m1233d(2)) {
                                    return;
                                } else {
                                    c0141cm.m1249t(2);
                                }
                            }
                            if (c0141cm.m1233d(i10)) {
                                int iM1238i3 = c0141cm.m1238i(i10);
                                if (!t71Var.f10788k) {
                                    if (c0141cm.m1233d(1)) {
                                        zM1237h = c0141cm.m1237h();
                                        if (!zM1237h) {
                                            zM1237h2 = false;
                                        } else {
                                            if (!c0141cm.m1233d(1)) {
                                                return;
                                            }
                                            zM1237h2 = c0141cm.m1237h();
                                            z = true;
                                        }
                                        if (hj0Var.f4596i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iM1242m = 0;
                                        } else if (!c0141cm.m1234e()) {
                                            return;
                                        } else {
                                            iM1242m = c0141cm.m1242m();
                                        }
                                        i3 = t71Var.f10790m;
                                        if (i3 != 0) {
                                            if (c0141cm.m1233d(i9)) {
                                                iM1238i = c0141cm.m1238i(i9);
                                                if (!z3 && !zM1237h) {
                                                    if (!c0141cm.m1234e()) {
                                                        return;
                                                    }
                                                    iM1243n2 = c0141cm.m1243n();
                                                    i4 = 0;
                                                }
                                                iM1243n = 0;
                                                gj0 gj0Var2 = hj0Var.f4601n;
                                                gj0Var2.f4202c = t71Var;
                                                gj0Var2.f4203d = iM1238i2;
                                                gj0Var2.f4204e = iM1242m2;
                                                gj0Var2.f4205f = iM1238i3;
                                                gj0Var2.f4206g = iM1242m3;
                                                gj0Var2.f4207h = zM1237h;
                                                gj0Var2.f4208i = z;
                                                gj0Var2.f4209j = zM1237h2;
                                                gj0Var2.f4210k = z2;
                                                gj0Var2.f4211l = iM1242m;
                                                gj0Var2.f4212m = iM1238i;
                                                gj0Var2.f4213n = iM1243n2;
                                                gj0Var2.f4214o = i4;
                                                gj0Var2.f4215p = iM1243n;
                                                gj0Var2.f4200a = true;
                                                gj0Var2.f4201b = true;
                                                hj0Var.f4598k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || t71Var.f10792o) {
                                            iM1238i = 0;
                                        } else {
                                            if (!c0141cm.m1234e()) {
                                                return;
                                            }
                                            int iM1243n3 = c0141cm.m1243n();
                                            if (!z3 || zM1237h) {
                                                i4 = iM1243n3;
                                                iM1238i = 0;
                                                iM1243n2 = 0;
                                                iM1243n = 0;
                                            } else {
                                                if (!c0141cm.m1234e()) {
                                                    return;
                                                }
                                                iM1243n = c0141cm.m1243n();
                                                iM1243n2 = 0;
                                                i4 = iM1243n3;
                                                iM1238i = 0;
                                            }
                                        }
                                        gj0 gj0Var3 = hj0Var.f4601n;
                                        gj0Var3.f4202c = t71Var;
                                        gj0Var3.f4203d = iM1238i2;
                                        gj0Var3.f4204e = iM1242m2;
                                        gj0Var3.f4205f = iM1238i3;
                                        gj0Var3.f4206g = iM1242m3;
                                        gj0Var3.f4207h = zM1237h;
                                        gj0Var3.f4208i = z;
                                        gj0Var3.f4209j = zM1237h2;
                                        gj0Var3.f4210k = z2;
                                        gj0Var3.f4211l = iM1242m;
                                        gj0Var3.f4212m = iM1238i;
                                        gj0Var3.f4213n = iM1243n2;
                                        gj0Var3.f4214o = i4;
                                        gj0Var3.f4215p = iM1243n;
                                        gj0Var3.f4200a = true;
                                        gj0Var3.f4201b = true;
                                        hj0Var.f4598k = false;
                                        i4 = 0;
                                        iM1243n2 = 0;
                                        iM1243n = 0;
                                        gj0 gj0Var4 = hj0Var.f4601n;
                                        gj0Var4.f4202c = t71Var;
                                        gj0Var4.f4203d = iM1238i2;
                                        gj0Var4.f4204e = iM1242m2;
                                        gj0Var4.f4205f = iM1238i3;
                                        gj0Var4.f4206g = iM1242m3;
                                        gj0Var4.f4207h = zM1237h;
                                        gj0Var4.f4208i = z;
                                        gj0Var4.f4209j = zM1237h2;
                                        gj0Var4.f4210k = z2;
                                        gj0Var4.f4211l = iM1242m;
                                        gj0Var4.f4212m = iM1238i;
                                        gj0Var4.f4213n = iM1243n2;
                                        gj0Var4.f4214o = i4;
                                        gj0Var4.f4215p = iM1243n;
                                        gj0Var4.f4200a = true;
                                        gj0Var4.f4201b = true;
                                        hj0Var.f4598k = false;
                                    }
                                    return;
                                }
                                zM1237h = false;
                                zM1237h2 = false;
                                z = zM1237h2;
                                if (hj0Var.f4596i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iM1242m = 0;
                                } else if (!c0141cm.m1234e()) {
                                    return;
                                } else {
                                    iM1242m = c0141cm.m1242m();
                                }
                                i3 = t71Var.f10790m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iM1238i = 0;
                                } else {
                                    if (c0141cm.m1233d(i9)) {
                                        return;
                                    }
                                    iM1238i = c0141cm.m1238i(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iM1243n2 = 0;
                                iM1243n = 0;
                                gj0 gj0Var5 = hj0Var.f4601n;
                                gj0Var5.f4202c = t71Var;
                                gj0Var5.f4203d = iM1238i2;
                                gj0Var5.f4204e = iM1242m2;
                                gj0Var5.f4205f = iM1238i3;
                                gj0Var5.f4206g = iM1242m3;
                                gj0Var5.f4207h = zM1237h;
                                gj0Var5.f4208i = z;
                                gj0Var5.f4209j = zM1237h2;
                                gj0Var5.f4210k = z2;
                                gj0Var5.f4211l = iM1242m;
                                gj0Var5.f4212m = iM1238i;
                                gj0Var5.f4213n = iM1243n2;
                                gj0Var5.f4214o = i4;
                                gj0Var5.f4215p = iM1243n;
                                gj0Var5.f4200a = true;
                                gj0Var5.f4201b = true;
                                hj0Var.f4598k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f5033g = 0L;
        this.f5040n = false;
        this.f5039m = -9223372036854775807L;
        o21.m4667l(this.f5034h);
        this.f5030d.m3387f();
        this.f5031e.m3387f();
        this.f5032f.m3387f();
        ((C1652z4) this.f5027a.f7701d).m7198i(0);
        hj0 hj0Var = this.f5037k;
        if (hj0Var != null) {
            hj0Var.f4598k = false;
            hj0Var.f4602o = false;
            gj0 gj0Var = hj0Var.f4601n;
            gj0Var.f4201b = false;
            gj0Var.f4200a = false;
        }
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
        ki0.m3866j(this.f5036j);
        int i = z42.f13274a;
        if (z) {
            ((C1652z4) this.f5027a.f7701d).m7198i(0);
            hj0 hj0Var = this.f5037k;
            long j = this.f5033g;
            hj0Var.m3159a();
            hj0Var.f4597j = j;
            long j2 = hj0Var.f4604q;
            if (j2 != -9223372036854775807L) {
                boolean z2 = hj0Var.f4605r;
                hj0Var.f4588a.mo1114a(j2, z2 ? 1 : 0, (int) (j - hj0Var.f4603p), 0, null);
            }
            hj0Var.f4602o = false;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f5039m = j;
        this.f5040n = ((i & 2) != 0) | this.f5040n;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f5035i = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 2);
        this.f5036j = c22VarMo750n;
        this.f5037k = new hj0(c22VarMo750n, this.f5028b, this.f5029c);
        this.f5027a.m4766m(z80Var, qk0Var);
    }
}
