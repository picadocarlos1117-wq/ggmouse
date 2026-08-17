package p000;

import android.sun.security.util.DerValue;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kj0 implements m50 {

    /* JADX INFO: renamed from: a */
    public final C1174o9 f5873a;

    /* JADX INFO: renamed from: b */
    public String f5874b;

    /* JADX INFO: renamed from: c */
    public c22 f5875c;

    /* JADX INFO: renamed from: d */
    public jj0 f5876d;

    /* JADX INFO: renamed from: e */
    public boolean f5877e;

    /* JADX INFO: renamed from: l */
    public long f5884l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f5878f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final i80 f5879g = new i80(32);

    /* JADX INFO: renamed from: h */
    public final i80 f5880h = new i80(33);

    /* JADX INFO: renamed from: i */
    public final i80 f5881i = new i80(34);

    /* JADX INFO: renamed from: j */
    public final i80 f5882j = new i80(39);

    /* JADX INFO: renamed from: k */
    public final i80 f5883k = new i80(40);

    /* JADX INFO: renamed from: m */
    public long f5885m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final dc1 f5886n = new dc1();

    public kj0(C1174o9 c1174o9) {
        this.f5873a = c1174o9;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) {
        boolean z;
        i80 i80Var;
        i80 i80Var2;
        i80 i80Var3;
        i80 i80Var4;
        boolean zM3385d;
        dc1 dc1Var2;
        i80 i80Var5;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        ki0.m3866j(this.f5875c);
        int i2 = z42.f13274a;
        while (dc1Var.m2318a() > 0) {
            int i3 = dc1Var.f2883b;
            int i4 = dc1Var.f2884c;
            byte[] bArr = dc1Var.f2882a;
            this.f5884l += (long) dc1Var.m2318a();
            int i5 = 0;
            this.f5875c.mo1115b(dc1Var, dc1Var.m2318a(), 0);
            while (i3 < i4) {
                int iM4692z = o21.m4692z(bArr, i3, i4, this.f5878f);
                if (iM4692z == i4) {
                    m3889b(i3, i4, bArr);
                    return;
                }
                int i6 = iM4692z + 3;
                int i7 = (bArr[i6] & 126) >> 1;
                int i8 = iM4692z - i3;
                if (i8 > 0) {
                    m3889b(i3, iM4692z, bArr);
                }
                int i9 = i4 - iM4692z;
                long j = this.f5884l - ((long) i9);
                int i10 = i8 < 0 ? -i8 : i5;
                long j2 = this.f5885m;
                C1652z4 c1652z4 = (C1652z4) this.f5873a.f7701d;
                jj0 jj0Var = this.f5876d;
                boolean z5 = this.f5877e;
                if (jj0Var.f5429j && jj0Var.f5426g) {
                    jj0Var.f5432m = jj0Var.f5422c;
                    jj0Var.f5429j = false;
                } else {
                    if (jj0Var.f5427h || jj0Var.f5426g) {
                        if (z5 && jj0Var.f5428i) {
                            jj0Var.m3653a(((int) (j - jj0Var.f5421b)) + i9);
                        }
                        jj0Var.f5430k = jj0Var.f5421b;
                        jj0Var.f5431l = jj0Var.f5424e;
                        jj0Var.f5432m = jj0Var.f5422c;
                        jj0Var.f5428i = true;
                    }
                    z = this.f5877e;
                    i80Var = this.f5879g;
                    i80Var2 = this.f5880h;
                    i80Var3 = this.f5881i;
                    if (!z) {
                        i80Var.m3385d(i10);
                        i80Var2.m3385d(i10);
                        i80Var3.m3385d(i10);
                        if (!i80Var.f4865e && i80Var2.f4865e && i80Var3.f4865e) {
                            String str = this.f5874b;
                            int i11 = i80Var.f4863c;
                            byte[] bArr2 = new byte[i80Var2.f4863c + i11 + i80Var3.f4863c];
                            System.arraycopy((byte[]) i80Var.f4866f, 0, bArr2, 0, i11);
                            System.arraycopy((byte[]) i80Var2.f4866f, 0, bArr2, i80Var.f4863c, i80Var2.f4863c);
                            System.arraycopy((byte[]) i80Var3.f4866f, 0, bArr2, i80Var.f4863c + i80Var2.f4863c, i80Var3.f4863c);
                            String strM2374a = null;
                            q71 q71VarM4666k0 = o21.m4666k0((byte[]) i80Var2.f4866f, 3, i80Var2.f4863c, null);
                            m71 m71Var = q71VarM4666k0.f9428a;
                            if (m71Var != null) {
                                strM2374a = AbstractC0574dp.m2374a(m71Var.f6682a, m71Var.f6683b, m71Var.f6684c, m71Var.f6685d, m71Var.f6686e, m71Var.f6687f);
                            }
                            ae0 ae0Var = new ae0();
                            ae0Var.f185a = str;
                            ae0Var.f197m = v51.m6582l("video/hevc");
                            ae0Var.f194j = strM2374a;
                            ae0Var.f204t = q71VarM4666k0.f9431d;
                            ae0Var.f205u = q71VarM4666k0.f9432e;
                            ae0Var.f174A = new C1673zp(q71VarM4666k0.f9435h, q71VarM4666k0.f9436i, q71VarM4666k0.f9437j, null, q71VarM4666k0.f9429b + 8, q71VarM4666k0.f9430c + 8);
                            ae0Var.f208x = q71VarM4666k0.f9433f;
                            ae0Var.f199o = q71VarM4666k0.f9434g;
                            ae0Var.f200p = Collections.singletonList(bArr2);
                            be0 be0Var = new be0(ae0Var);
                            this.f5875c.mo1117d(be0Var);
                            int i12 = be0Var.f1343p;
                            p32.m5192w(i12 != -1);
                            c1652z4.getClass();
                            ki0.m3864h(i12 >= 0);
                            c1652z4.f13266a = i12;
                            c1652z4.m7198i(i12);
                            this.f5877e = true;
                        }
                    }
                    i80Var4 = this.f5882j;
                    zM3385d = i80Var4.m3385d(i10);
                    dc1Var2 = this.f5886n;
                    if (zM3385d) {
                        dc1Var2.m2314D(o21.m4689x0(i80Var4.f4863c, (byte[]) i80Var4.f4866f), (byte[]) i80Var4.f4866f);
                        dc1Var2.m2317G(5);
                        c1652z4.m7190a(j2, dc1Var2);
                    }
                    i80Var5 = this.f5883k;
                    if (i80Var5.m3385d(i10)) {
                        dc1Var2.m2314D(o21.m4689x0(i80Var5.f4863c, (byte[]) i80Var5.f4866f), (byte[]) i80Var5.f4866f);
                        dc1Var2.m2317G(5);
                        c1652z4.m7190a(j2, dc1Var2);
                    }
                    long j3 = this.f5885m;
                    jj0 jj0Var2 = this.f5876d;
                    boolean z6 = this.f5877e;
                    jj0Var2.f5426g = false;
                    jj0Var2.f5427h = false;
                    jj0Var2.f5424e = j3;
                    jj0Var2.f5423d = 0;
                    jj0Var2.f5421b = j;
                    if (i7 >= 32 || i7 == 40) {
                        z2 = true;
                        i = 0;
                    } else {
                        if (!jj0Var2.f5428i || jj0Var2.f5429j) {
                            i = 0;
                        } else {
                            if (z6) {
                                jj0Var2.m3653a(i9);
                            }
                            i = 0;
                            jj0Var2.f5428i = false;
                        }
                        if ((32 > i7 || i7 > 35) && i7 != 39) {
                            z2 = true;
                        } else {
                            z2 = true;
                            jj0Var2.f5427h = !jj0Var2.f5429j;
                            jj0Var2.f5429j = true;
                        }
                    }
                    if (i7 >= 16 || i7 > 21) {
                        z3 = i;
                    } else {
                        z3 = z2 ? 1 : 0;
                    }
                    jj0Var2.f5422c = z3;
                    z4 = z2;
                    if (z3 == 0 && i7 > 9) {
                        z4 = z2;
                        z4 = i;
                    }
                    z4 = z2;
                    jj0Var2.f5425f = z4;
                    if (!this.f5877e) {
                        i80Var.m3388g(i7);
                        i80Var2.m3388g(i7);
                        i80Var3.m3388g(i7);
                    }
                    i80Var4.m3388g(i7);
                    i80Var5.m3388g(i7);
                    i5 = i;
                    i3 = i6;
                    i4 = i4;
                    bArr = bArr;
                }
                i4 = i4;
                bArr = bArr;
                z = this.f5877e;
                i80Var = this.f5879g;
                i80Var2 = this.f5880h;
                i80Var3 = this.f5881i;
                if (!z) {
                    i80Var.m3385d(i10);
                    i80Var2.m3385d(i10);
                    i80Var3.m3385d(i10);
                    if (!i80Var.f4865e) {
                    }
                }
                i80Var4 = this.f5882j;
                zM3385d = i80Var4.m3385d(i10);
                dc1Var2 = this.f5886n;
                if (zM3385d) {
                    dc1Var2.m2314D(o21.m4689x0(i80Var4.f4863c, (byte[]) i80Var4.f4866f), (byte[]) i80Var4.f4866f);
                    dc1Var2.m2317G(5);
                    c1652z4.m7190a(j2, dc1Var2);
                }
                i80Var5 = this.f5883k;
                if (i80Var5.m3385d(i10)) {
                    dc1Var2.m2314D(o21.m4689x0(i80Var5.f4863c, (byte[]) i80Var5.f4866f), (byte[]) i80Var5.f4866f);
                    dc1Var2.m2317G(5);
                    c1652z4.m7190a(j2, dc1Var2);
                }
                long j4 = this.f5885m;
                jj0 jj0Var3 = this.f5876d;
                boolean z7 = this.f5877e;
                jj0Var3.f5426g = false;
                jj0Var3.f5427h = false;
                jj0Var3.f5424e = j4;
                jj0Var3.f5423d = 0;
                jj0Var3.f5421b = j;
                if (i7 >= 32) {
                    z2 = true;
                    i = 0;
                } else {
                    z2 = true;
                    i = 0;
                }
                if (i7 >= 16) {
                    z3 = i;
                } else {
                    z3 = i;
                }
                jj0Var3.f5422c = z3;
                z4 = z2;
                if (z3 == 0) {
                    z4 = z2;
                    z4 = i;
                }
                z4 = z2;
                jj0Var3.f5425f = z4;
                if (!this.f5877e) {
                    i80Var.m3388g(i7);
                    i80Var2.m3388g(i7);
                    i80Var3.m3388g(i7);
                }
                i80Var4.m3388g(i7);
                i80Var5.m3388g(i7);
                i5 = i;
                i3 = i6;
                i4 = i4;
                bArr = bArr;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3889b(int i, int i2, byte[] bArr) {
        jj0 jj0Var = this.f5876d;
        if (jj0Var.f5425f) {
            int i3 = jj0Var.f5423d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                jj0Var.f5426g = (bArr[i4] & DerValue.TAG_CONTEXT) != 0;
                jj0Var.f5425f = false;
            } else {
                jj0Var.f5423d = (i2 - i) + i3;
            }
        }
        if (!this.f5877e) {
            this.f5879g.m3382a(i, i2, bArr);
            this.f5880h.m3382a(i, i2, bArr);
            this.f5881i.m3382a(i, i2, bArr);
        }
        this.f5882j.m3382a(i, i2, bArr);
        this.f5883k.m3382a(i, i2, bArr);
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        this.f5884l = 0L;
        this.f5885m = -9223372036854775807L;
        o21.m4667l(this.f5878f);
        this.f5879g.m3387f();
        this.f5880h.m3387f();
        this.f5881i.m3387f();
        this.f5882j.m3387f();
        this.f5883k.m3387f();
        ((C1652z4) this.f5873a.f7701d).m7198i(0);
        jj0 jj0Var = this.f5876d;
        if (jj0Var != null) {
            jj0Var.f5425f = false;
            jj0Var.f5426g = false;
            jj0Var.f5427h = false;
            jj0Var.f5428i = false;
            jj0Var.f5429j = false;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
        ki0.m3866j(this.f5875c);
        int i = z42.f13274a;
        if (z) {
            ((C1652z4) this.f5873a.f7701d).m7198i(0);
            jj0 jj0Var = this.f5876d;
            long j = this.f5884l;
            jj0Var.f5432m = jj0Var.f5422c;
            jj0Var.m3653a((int) (j - jj0Var.f5421b));
            jj0Var.f5430k = jj0Var.f5421b;
            jj0Var.f5421b = j;
            jj0Var.m3653a(0);
            jj0Var.f5428i = false;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f5885m = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f5874b = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 2);
        this.f5875c = c22VarMo750n;
        this.f5876d = new jj0(c22VarMo750n);
        this.f5873a.m4766m(z80Var, qk0Var);
    }
}
