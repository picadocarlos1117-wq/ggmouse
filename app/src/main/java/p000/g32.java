package p000;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g32 implements x80 {

    /* JADX INFO: renamed from: a */
    public final int f4043a;

    /* JADX INFO: renamed from: b */
    public final List f4044b;

    /* JADX INFO: renamed from: c */
    public final dc1 f4045c = new dc1(new byte[9400], 0);

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f4046d;

    /* JADX INFO: renamed from: e */
    public final C0719hm f4047e;

    /* JADX INFO: renamed from: f */
    public final wx1 f4048f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f4049g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f4050h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f4051i;

    /* JADX INFO: renamed from: j */
    public final th1 f4052j;

    /* JADX INFO: renamed from: k */
    public za0 f4053k;

    /* JADX INFO: renamed from: l */
    public z80 f4054l;

    /* JADX INFO: renamed from: m */
    public int f4055m;

    /* JADX INFO: renamed from: n */
    public boolean f4056n;

    /* JADX INFO: renamed from: o */
    public boolean f4057o;

    /* JADX INFO: renamed from: p */
    public boolean f4058p;

    /* JADX INFO: renamed from: q */
    public int f4059q;

    public g32(int i, wx1 wx1Var, y02 y02Var, C0719hm c0719hm) {
        this.f4047e = c0719hm;
        this.f4043a = i;
        this.f4048f = wx1Var;
        this.f4044b = Collections.singletonList(y02Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4050h = sparseBooleanArray;
        this.f4051i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f4049g = sparseArray;
        this.f4046d = new SparseIntArray();
        this.f4052j = new th1(1);
        this.f4054l = z80.f13306h;
        this.f4059q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (i32) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new hq1(new qo0(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r25v0, types: [y80] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [gx] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [i32] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        Object r4;
        int i;
        Object r7;
        i32 i32Var;
        long jM5521V;
        long jMo2420i = y80Var.mo2420i();
        byte b = 0;
        if (this.f4056n) {
            long j = -9223372036854775807L;
            th1 th1Var = this.f4052j;
            if (jMo2420i != -1 && !th1Var.f10886d) {
                int i2 = this.f4059q;
                y02 y02Var = th1Var.f10884b;
                dc1 dc1Var = th1Var.f10885c;
                if (i2 <= 0) {
                    th1Var.m6282a(y80Var);
                    return b;
                }
                if (th1Var.f10888f) {
                    if (th1Var.f10890h == -9223372036854775807L) {
                        th1Var.m6282a(y80Var);
                        return b;
                    }
                    if (th1Var.f10887e) {
                        long j2 = th1Var.f10889g;
                        if (j2 == -9223372036854775807L) {
                            th1Var.m6282a(y80Var);
                            return b;
                        }
                        th1Var.f10891i = y02Var.m6985c(th1Var.f10890h) - y02Var.m6984b(j2);
                        th1Var.m6282a(y80Var);
                        return b;
                    }
                    int iMin = (int) Math.min(112800L, y80Var.mo2420i());
                    if (y80Var.getPosition() != 0) {
                        bb0Var.f1280a = 0L;
                        return 1;
                    }
                    dc1Var.m2313C(iMin);
                    y80Var.mo2422l();
                    y80Var.mo2413a(b, iMin, dc1Var.f2882a);
                    int i3 = dc1Var.f2884c;
                    for (int i4 = dc1Var.f2883b; i4 < i3; i4++) {
                        if (dc1Var.f2882a[i4] == 71) {
                            jM5521V = AbstractC1337qm.m5521V(dc1Var, i4, i2);
                            if (jM5521V != -9223372036854775807L) {
                                th1Var.f10889g = jM5521V;
                                th1Var.f10887e = true;
                                return b;
                            }
                        }
                    }
                    jM5521V = -9223372036854775807L;
                    th1Var.f10889g = jM5521V;
                    th1Var.f10887e = true;
                    return b;
                }
                long jMo2420i2 = y80Var.mo2420i();
                int iMin2 = (int) Math.min(112800L, jMo2420i2);
                long j3 = jMo2420i2 - ((long) iMin2);
                if (y80Var.getPosition() != j3) {
                    bb0Var.f1280a = j3;
                    return 1;
                }
                dc1Var.m2313C(iMin2);
                y80Var.mo2422l();
                y80Var.mo2413a(b, iMin2, dc1Var.f2882a);
                int i5 = dc1Var.f2883b;
                int i6 = dc1Var.f2884c;
                for (int i7 = i6 - 188; i7 >= i5; i7--) {
                    byte[] bArr = dc1Var.f2882a;
                    int i8 = b;
                    for (int i9 = -4; i9 <= 4; i9++) {
                        int i10 = (i9 * 188) + i7;
                        if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                            i8++;
                            if (i8 == 5) {
                                long jM5521V2 = AbstractC1337qm.m5521V(dc1Var, i7, i2);
                                if (jM5521V2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jM5521V2;
                                break;
                            }
                        } else {
                            i8 = b;
                        }
                    }
                }
                th1Var.f10890h = j;
                th1Var.f10888f = true;
                return b;
            }
            if (this.f4057o) {
                i = 1;
            } else {
                this.f4057o = true;
                long j4 = th1Var.f10891i;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    za0 za0Var = new za0(new k50(b, 11), new C0082b0(this.f4059q, th1Var.f10884b), j4, j4 + 1, 0L, jMo2420i, 188L, 940);
                    this.f4053k = za0Var;
                    this.f4054l.mo752q(za0Var.f13323a);
                } else {
                    i = 1;
                    this.f4054l.mo752q(new C0825ke(j4));
                }
            }
            if (this.f4058p) {
                this.f4058p = b;
                mo126f(0L, 0L);
                if (y80Var.getPosition() != 0) {
                    bb0Var.f1280a = 0L;
                    return i;
                }
            }
            za0 za0Var2 = this.f4053k;
            if (za0Var2 != null && za0Var2.f13325c != null) {
                return za0Var2.m7277b(y80Var, bb0Var);
            }
            r4 = y80Var;
        } else {
            r4 = y80Var;
            i = 1;
            b = b;
        }
        dc1 dc1Var2 = this.f4045c;
        byte[] bArr2 = dc1Var2.f2882a;
        if (9400 - dc1Var2.f2883b < 188) {
            int iM2318a = dc1Var2.m2318a();
            if (iM2318a > 0) {
                System.arraycopy(bArr2, dc1Var2.f2883b, bArr2, b, iM2318a);
            }
            dc1Var2.m2314D(iM2318a, bArr2);
        }
        while (true) {
            int iM2318a2 = dc1Var2.m2318a();
            Object r8 = this.f4049g;
            if (iM2318a2 >= 188) {
                int i11 = dc1Var2.f2883b;
                int i12 = dc1Var2.f2884c;
                byte[] bArr3 = dc1Var2.f2882a;
                while (i11 < i12 && bArr3[i11] != 71) {
                    i11++;
                }
                dc1Var2.m2316F(i11);
                int i13 = i11 + 188;
                int i14 = dc1Var2.f2884c;
                if (i13 > i14) {
                    return b;
                }
                int iM2324g = dc1Var2.m2324g();
                if ((8388608 & iM2324g) != 0) {
                    dc1Var2.m2316F(i13);
                    return b;
                }
                Object r6 = (4194304 & iM2324g) != 0 ? 1 : b;
                int i15 = (2096896 & iM2324g) >> 8;
                Object r9 = (iM2324g & 32) != 0 ? 1 : b;
                if ((iM2324g & 16) != 0) {
                    i32Var = (i32) r8.get(i15);
                } else {
                    r7 = 0;
                }
                if (r7 == 0) {
                    r7 = i32Var;
                    dc1Var2.m2316F(i13);
                    return b;
                }
                int i16 = iM2324g & 15;
                SparseIntArray sparseIntArray = this.f4046d;
                int i17 = sparseIntArray.get(i15, i16 - 1);
                sparseIntArray.put(i15, i16);
                if (i17 == i16) {
                    r7 = i32Var;
                    dc1Var2.m2316F(i13);
                    return b;
                }
                if (i16 != ((i17 + 1) & 15)) {
                    r7 = i32Var;
                    r7.mo3243c();
                }
                if (r9 != 0) {
                    int iM2337t = dc1Var2.m2337t();
                    r6 = (r6 == true ? 1 : 0) | ((dc1Var2.m2337t() & 64) != 0 ? 2 : b);
                    dc1Var2.m2317G(iM2337t - 1);
                }
                boolean z = this.f4056n;
                if (z || !this.f4051i.get(i15, b)) {
                    dc1Var2.m2315E(i13);
                    r7.mo3241a(r6, dc1Var2);
                    dc1Var2.m2315E(i14);
                }
                if (!z && this.f4056n && jMo2420i != -1) {
                    this.f4058p = true;
                }
                dc1Var2.m2316F(i13);
                return b;
            }
            int i18 = dc1Var2.f2884c;
            int i19 = r4.read(bArr2, i18, 9400 - i18);
            if (i19 == -1) {
                for (Object r10 = b; r10 < r8.size(); r10++) {
                    i32 i32Var2 = (i32) r8.valueAt(r10);
                    if (i32Var2 instanceof mc1) {
                        mc1 mc1Var = (mc1) i32Var2;
                        if (mc1Var.f6757c == 3 && mc1Var.f6764j == -1) {
                            mc1Var.mo3241a(i, new dc1());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            dc1Var2.m2315E(i18 + i19);
            i = 1;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        byte[] bArr = this.f4045c.f2882a;
        C0584dz c0584dz = (C0584dz) y80Var;
        c0584dz.mo2416e(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c0584dz.mo2423m(i);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        za0 za0Var;
        long j3;
        SparseArray sparseArray = this.f4049g;
        List list = this.f4044b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y02 y02Var = (y02) list.get(i);
            synchronized (y02Var) {
                j3 = y02Var.f12797b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jM6986d = y02Var.m6986d();
                z = (jM6986d == -9223372036854775807L || jM6986d == 0 || jM6986d == j2) ? false : true;
            }
            if (z) {
                y02Var.m6987e(j2);
            }
        }
        if (j2 != 0 && (za0Var = this.f4053k) != null) {
            za0Var.m7278d(j2);
        }
        this.f4045c.m2313C(0);
        this.f4046d.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((i32) sparseArray.valueAt(i2)).mo3243c();
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        if ((this.f4043a & 1) == 0) {
            z80Var = new C1174o9(z80Var, this.f4048f);
        }
        this.f4054l = z80Var;
    }

    @Override // p000.x80
    public final void release() {
    }
}
