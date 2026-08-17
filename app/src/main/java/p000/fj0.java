package p000;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fj0 implements m50 {

    /* JADX INFO: renamed from: l */
    public static final float[] f3828l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final qo0 f3829a;

    /* JADX INFO: renamed from: b */
    public final dc1 f3830b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f3831c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final dj0 f3832d;

    /* JADX INFO: renamed from: e */
    public final i80 f3833e;

    /* JADX INFO: renamed from: f */
    public ej0 f3834f;

    /* JADX INFO: renamed from: g */
    public long f3835g;

    /* JADX INFO: renamed from: h */
    public String f3836h;

    /* JADX INFO: renamed from: i */
    public c22 f3837i;

    /* JADX INFO: renamed from: j */
    public boolean f3838j;

    /* JADX INFO: renamed from: k */
    public long f3839k;

    public fj0(qo0 qo0Var) {
        this.f3829a = qo0Var;
        dj0 dj0Var = new dj0();
        dj0Var.f2953e = new byte[128];
        this.f3832d = dj0Var;
        this.f3839k = -9223372036854775807L;
        this.f3833e = new i80(178);
        this.f3830b = new dc1();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0232  */
    @Override // p000.m50
    /* JADX INFO: renamed from: a */
    public final void mo1129a(dc1 dc1Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        ki0.m3866j(this.f3834f);
        ki0.m3866j(this.f3837i);
        int i5 = dc1Var.f2883b;
        int i6 = dc1Var.f2884c;
        byte[] bArr = dc1Var.f2882a;
        this.f3835g += (long) dc1Var.m2318a();
        int i7 = 0;
        this.f3837i.mo1115b(dc1Var, dc1Var.m2318a(), 0);
        while (true) {
            int iM4692z = o21.m4692z(bArr, i5, i6, this.f3831c);
            dj0 dj0Var = this.f3832d;
            i80 i80Var = this.f3833e;
            if (iM4692z == i6) {
                if (!this.f3838j) {
                    dj0Var.m2361a(i5, i6, bArr);
                }
                this.f3834f.m2589a(i5, i6, bArr);
                if (i80Var != null) {
                    i80Var.m3382a(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i8 = iM4692z + 3;
            byte b = dc1Var.f2882a[i8];
            int i9 = b & 255;
            int i10 = iM4692z - i5;
            if (this.f3838j) {
                i = i6;
                i2 = i8;
            } else {
                if (i10 > 0) {
                    dj0Var.m2361a(i5, iM4692z, bArr);
                }
                int i11 = i10 < 0 ? -i10 : i7;
                int i12 = dj0Var.f2950b;
                if (i12 != 0) {
                    i = i6;
                    if (i12 == 1) {
                        i2 = i8;
                        i4 = 0;
                        if (i9 != 181) {
                            AbstractC1337qm.m5542i0("H263Reader", "Unexpected start code value");
                            dj0Var.f2949a = false;
                            dj0Var.f2951c = 0;
                            dj0Var.f2950b = 0;
                        } else {
                            dj0Var.f2950b = 2;
                        }
                    } else if (i12 != 2) {
                        i2 = i8;
                        if (i12 != 3) {
                            if (i12 != 4) {
                                l41.m4046o();
                                return;
                            }
                            if (i9 == 179 || i9 == 181) {
                                dj0Var.f2951c -= i11;
                                dj0Var.f2949a = false;
                                c22 c22Var = this.f3837i;
                                int i13 = dj0Var.f2952d;
                                String str = this.f3836h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(dj0Var.f2953e, dj0Var.f2951c);
                                C0141cm c0141cm = new C0141cm(bArrCopyOf, bArrCopyOf.length);
                                c0141cm.m1250u(i13);
                                c0141cm.m1250u(4);
                                c0141cm.m1248s();
                                c0141cm.m1249t(8);
                                if (c0141cm.m1237h()) {
                                    c0141cm.m1249t(4);
                                    c0141cm.m1249t(3);
                                }
                                int iM1238i = c0141cm.m1238i(4);
                                if (iM1238i == 15) {
                                    int iM1238i2 = c0141cm.m1238i(8);
                                    int iM1238i3 = c0141cm.m1238i(8);
                                    if (iM1238i3 == 0) {
                                        AbstractC1337qm.m5542i0("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iM1238i2 / iM1238i3;
                                    }
                                } else if (iM1238i < 7) {
                                    f = f3828l[iM1238i];
                                } else {
                                    AbstractC1337qm.m5542i0("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (c0141cm.m1237h()) {
                                    c0141cm.m1249t(2);
                                    c0141cm.m1249t(1);
                                    if (c0141cm.m1237h()) {
                                        c0141cm.m1249t(15);
                                        c0141cm.m1248s();
                                        c0141cm.m1249t(15);
                                        c0141cm.m1248s();
                                        c0141cm.m1249t(15);
                                        c0141cm.m1248s();
                                        c0141cm.m1249t(3);
                                        c0141cm.m1249t(11);
                                        c0141cm.m1248s();
                                        c0141cm.m1249t(15);
                                        c0141cm.m1248s();
                                    }
                                }
                                if (c0141cm.m1238i(2) != 0) {
                                    AbstractC1337qm.m5542i0("H263Reader", "Unhandled video object layer shape");
                                }
                                c0141cm.m1248s();
                                int iM1238i4 = c0141cm.m1238i(16);
                                c0141cm.m1248s();
                                if (c0141cm.m1237h()) {
                                    if (iM1238i4 == 0) {
                                        AbstractC1337qm.m5542i0("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i14 = 0;
                                        for (int i15 = iM1238i4 - 1; i15 > 0; i15 >>= 1) {
                                            i14++;
                                        }
                                        c0141cm.m1249t(i14);
                                    }
                                }
                                c0141cm.m1248s();
                                int iM1238i5 = c0141cm.m1238i(13);
                                c0141cm.m1248s();
                                int iM1238i6 = c0141cm.m1238i(13);
                                c0141cm.m1248s();
                                c0141cm.m1248s();
                                ae0 ae0Var = new ae0();
                                ae0Var.f185a = str;
                                ae0Var.f197m = v51.m6582l("video/mp4v-es");
                                ae0Var.f204t = iM1238i5;
                                ae0Var.f205u = iM1238i6;
                                ae0Var.f208x = f;
                                ae0Var.f200p = Collections.singletonList(bArrCopyOf);
                                c22Var.mo1117d(new be0(ae0Var));
                                this.f3838j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            AbstractC1337qm.m5542i0("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            dj0Var.f2949a = false;
                            dj0Var.f2951c = 0;
                            dj0Var.f2950b = 0;
                        } else {
                            i4 = 0;
                            dj0Var.f2952d = dj0Var.f2951c;
                            dj0Var.f2950b = 4;
                        }
                    } else {
                        i2 = i8;
                        i4 = 0;
                        if (i9 > 31) {
                            AbstractC1337qm.m5542i0("H263Reader", "Unexpected start code value");
                            dj0Var.f2949a = false;
                            dj0Var.f2951c = 0;
                            dj0Var.f2950b = 0;
                        } else {
                            dj0Var.f2950b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i8;
                    i4 = 0;
                    if (i9 == 176) {
                        dj0Var.f2950b = 1;
                        dj0Var.f2949a = true;
                    }
                }
                dj0Var.m2361a(i4, 3, dj0.f2948f);
            }
            this.f3834f.m2589a(i5, iM4692z, bArr);
            if (i80Var == null) {
                z = true;
            } else {
                if (i10 > 0) {
                    i80Var.m3382a(i5, iM4692z, bArr);
                    i3 = 0;
                } else {
                    i3 = -i10;
                }
                if (i80Var.m3385d(i3)) {
                    int iM4689x0 = o21.m4689x0(i80Var.f4863c, (byte[]) i80Var.f4866f);
                    int i16 = z42.f13274a;
                    byte[] bArr2 = (byte[]) i80Var.f4866f;
                    dc1 dc1Var2 = this.f3830b;
                    dc1Var2.m2314D(iM4689x0, bArr2);
                    this.f3829a.m5581D(this.f3839k, dc1Var2);
                }
                if (i9 == 178) {
                    z = true;
                    if (dc1Var.f2882a[iM4692z + 2] == 1) {
                        i80Var.m3388g(i9);
                    }
                } else {
                    z = true;
                }
            }
            int i17 = i - iM4692z;
            this.f3834f.m2590b(i17, this.f3838j, this.f3835g - ((long) i17));
            ej0 ej0Var = this.f3834f;
            long j = this.f3839k;
            ej0Var.f3368e = i9;
            ej0Var.f3367d = false;
            ej0Var.f3365b = (i9 == 182 || i9 == 179) ? z : false;
            ej0Var.f3366c = i9 == 182 ? z : false;
            i7 = 0;
            ej0Var.f3369f = 0;
            ej0Var.f3371h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: c */
    public final void mo1130c() {
        o21.m4667l(this.f3831c);
        dj0 dj0Var = this.f3832d;
        dj0Var.f2949a = false;
        dj0Var.f2951c = 0;
        dj0Var.f2950b = 0;
        ej0 ej0Var = this.f3834f;
        if (ej0Var != null) {
            ej0Var.f3365b = false;
            ej0Var.f3366c = false;
            ej0Var.f3367d = false;
            ej0Var.f3368e = -1;
        }
        i80 i80Var = this.f3833e;
        if (i80Var != null) {
            i80Var.m3387f();
        }
        this.f3835g = 0L;
        this.f3839k = -9223372036854775807L;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: d */
    public final void mo1131d(boolean z) {
        ki0.m3866j(this.f3834f);
        if (z) {
            this.f3834f.m2590b(0, this.f3838j, this.f3835g);
            ej0 ej0Var = this.f3834f;
            ej0Var.f3365b = false;
            ej0Var.f3366c = false;
            ej0Var.f3367d = false;
            ej0Var.f3368e = -1;
        }
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: e */
    public final void mo1132e(int i, long j) {
        this.f3839k = j;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: f */
    public final void mo1133f(z80 z80Var, qk0 qk0Var) {
        qk0Var.m5498a();
        qk0Var.m5500c();
        this.f3836h = (String) qk0Var.f9523e;
        qk0Var.m5500c();
        c22 c22VarMo750n = z80Var.mo750n(qk0Var.f9521c, 2);
        this.f3837i = c22VarMo750n;
        this.f3834f = new ej0(c22VarMo750n);
        this.f3829a.m5582E(z80Var, qk0Var);
    }
}
