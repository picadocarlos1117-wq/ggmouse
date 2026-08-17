package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u82 extends xv1 {

    /* JADX INFO: renamed from: n */
    public j22 f11177n;

    /* JADX INFO: renamed from: o */
    public int f11178o;

    /* JADX INFO: renamed from: p */
    public boolean f11179p;

    /* JADX INFO: renamed from: q */
    public r61 f11180q;

    /* JADX INFO: renamed from: r */
    public ak0 f11181r;

    @Override // p000.xv1
    /* JADX INFO: renamed from: a */
    public final void mo6406a(long j) {
        this.f12743g = j;
        this.f11179p = j != 0;
        r61 r61Var = this.f11180q;
        this.f11178o = r61Var != null ? r61Var.f9746e : 0;
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: b */
    public final long mo1199b(dc1 dc1Var) {
        byte b = dc1Var.f2882a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        j22 j22Var = this.f11177n;
        ki0.m3866j(j22Var);
        boolean z = ((C0073as[]) j22Var.f5245e)[(b >> 1) & (255 >>> (8 - j22Var.f5241a))].f1039a;
        r61 r61Var = (r61) j22Var.f5242b;
        int i = !z ? r61Var.f9746e : r61Var.f9747f;
        long j = this.f11179p ? (this.f11178o + i) / 4 : 0;
        byte[] bArr = dc1Var.f2882a;
        int length = bArr.length;
        int i2 = dc1Var.f2884c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            dc1Var.m2314D(bArrCopyOf.length, bArrCopyOf);
        } else {
            dc1Var.m2315E(i2);
        }
        byte[] bArr2 = dc1Var.f2882a;
        int i3 = dc1Var.f2884c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.f11179p = true;
        this.f11178o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b2  */
    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // p000.xv1
    /* JADX INFO: renamed from: c */
    public final boolean mo1200c(dc1 dc1Var, long j, qo0 qo0Var) throws fc1 {
        j22 j22Var;
        if (this.f11177n != null) {
            ((be0) qo0Var.f9548b).getClass();
            return false;
        }
        r61 r61Var = this.f11180q;
        int i = 4;
        if (r61Var != null) {
            ak0 ak0Var = this.f11181r;
            if (ak0Var == null) {
                this.f11181r = rc2.m5788i0(dc1Var, true, true);
            } else {
                int i2 = dc1Var.f2884c;
                byte[] bArr = new byte[i2];
                System.arraycopy(dc1Var.f2882a, 0, bArr, 0, i2);
                int i3 = r61Var.f9742a;
                int i4 = 5;
                rc2.m5808v0(5, dc1Var, false);
                int iM2337t = dc1Var.m2337t() + 1;
                C0141cm c0141cm = new C0141cm(dc1Var.f2882a);
                int i5 = 8;
                c0141cm.m1249t(dc1Var.f2883b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < iM2337t) {
                        int i8 = i5;
                        if (c0141cm.m1238i(24) != 5653314) {
                            throw fc1.m2799a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c0141cm.f1860d * 8) + c0141cm.f1861e));
                        }
                        int iM1238i = c0141cm.m1238i(16);
                        int iM1238i2 = c0141cm.m1238i(24);
                        if (c0141cm.m1237h()) {
                            c0141cm.m1249t(i4);
                            int iM1238i3 = 0;
                            while (iM1238i3 < iM1238i2) {
                                int i9 = 0;
                                for (int i10 = iM1238i2 - iM1238i3; i10 > 0; i10 >>>= 1) {
                                    i9++;
                                }
                                iM1238i3 += c0141cm.m1238i(i9);
                            }
                        } else {
                            boolean zM1237h = c0141cm.m1237h();
                            for (int i11 = 0; i11 < iM1238i2; i11++) {
                                if (!zM1237h) {
                                    c0141cm.m1249t(i4);
                                } else if (c0141cm.m1237h()) {
                                    c0141cm.m1249t(i4);
                                }
                            }
                        }
                        int iM1238i4 = c0141cm.m1238i(4);
                        if (iM1238i4 > 2) {
                            throw fc1.m2799a(null, "lookup type greater than 2 not decodable: " + iM1238i4);
                        }
                        if (iM1238i4 == 1 || iM1238i4 == 2) {
                            c0141cm.m1249t(32);
                            c0141cm.m1249t(32);
                            int iM1238i5 = c0141cm.m1238i(4) + 1;
                            c0141cm.m1249t(1);
                            c0141cm.m1249t((int) ((iM1238i4 == 1 ? iM1238i != 0 ? (long) Math.floor(Math.pow(iM1238i2, 1.0d / ((double) iM1238i))) : 0L : ((long) iM1238i2) * ((long) iM1238i)) * ((long) iM1238i5)));
                        }
                        i6++;
                        i5 = i8;
                        i4 = 5;
                    } else {
                        int i12 = i5;
                        int i13 = 6;
                        int iM1238i6 = c0141cm.m1238i(6) + 1;
                        for (int i14 = 0; i14 < iM1238i6; i14++) {
                            if (c0141cm.m1238i(16) != 0) {
                                throw fc1.m2799a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i15 = 1;
                        int iM1238i7 = c0141cm.m1238i(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 >= iM1238i7) {
                                int iM1238i8 = c0141cm.m1238i(i13) + 1;
                                int i18 = 0;
                                while (i18 < iM1238i8) {
                                    if (c0141cm.m1238i(16) > 2) {
                                        throw fc1.m2799a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c0141cm.m1249t(24);
                                    c0141cm.m1249t(24);
                                    c0141cm.m1249t(24);
                                    int iM1238i9 = c0141cm.m1238i(i13) + 1;
                                    int i19 = 8;
                                    c0141cm.m1249t(8);
                                    int[] iArr = new int[iM1238i9];
                                    for (int i20 = 0; i20 < iM1238i9; i20++) {
                                        iArr[i20] = ((c0141cm.m1237h() ? c0141cm.m1238i(5) : 0) * 8) + c0141cm.m1238i(3);
                                    }
                                    int i21 = 0;
                                    while (i21 < iM1238i9) {
                                        int i22 = 0;
                                        while (i22 < i19) {
                                            if ((iArr[i21] & (1 << i22)) != 0) {
                                                c0141cm.m1249t(i19);
                                            }
                                            i22++;
                                            i19 = 8;
                                        }
                                        i21++;
                                        i19 = 8;
                                    }
                                    i18++;
                                    i13 = 6;
                                }
                                int iM1238i10 = c0141cm.m1238i(i13) + 1;
                                for (int i23 = 0; i23 < iM1238i10; i23++) {
                                    int iM1238i11 = c0141cm.m1238i(16);
                                    if (iM1238i11 != 0) {
                                        AbstractC1337qm.m5549m("VorbisUtil", "mapping type other than 0 not supported: " + iM1238i11);
                                    } else {
                                        int iM1238i12 = c0141cm.m1237h() ? c0141cm.m1238i(4) + 1 : 1;
                                        if (c0141cm.m1237h()) {
                                            int iM1238i13 = c0141cm.m1238i(8) + 1;
                                            for (int i24 = 0; i24 < iM1238i13; i24++) {
                                                int i25 = i3 - 1;
                                                int i26 = 0;
                                                for (int i27 = i25; i27 > 0; i27 >>>= 1) {
                                                    i26++;
                                                }
                                                c0141cm.m1249t(i26);
                                                int i28 = 0;
                                                while (i25 > 0) {
                                                    i28++;
                                                    i25 >>>= 1;
                                                }
                                                c0141cm.m1249t(i28);
                                            }
                                        }
                                        if (c0141cm.m1238i(2) != 0) {
                                            throw fc1.m2799a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM1238i12 > 1) {
                                            for (int i29 = 0; i29 < i3; i29++) {
                                                c0141cm.m1249t(4);
                                            }
                                        }
                                        for (int i30 = 0; i30 < iM1238i12; i30++) {
                                            c0141cm.m1249t(8);
                                            c0141cm.m1249t(8);
                                            c0141cm.m1249t(8);
                                        }
                                    }
                                }
                                int iM1238i14 = c0141cm.m1238i(6);
                                int i31 = iM1238i14 + 1;
                                C0073as[] c0073asArr = new C0073as[i31];
                                for (int i32 = 0; i32 < i31; i32++) {
                                    boolean zM1237h2 = c0141cm.m1237h();
                                    c0141cm.m1238i(16);
                                    c0141cm.m1238i(16);
                                    c0141cm.m1238i(8);
                                    C0073as c0073as = new C0073as();
                                    c0073as.f1039a = zM1237h2;
                                    c0073asArr[i32] = c0073as;
                                }
                                if (!c0141cm.m1237h()) {
                                    throw fc1.m2799a(null, "framing bit after modes not set as expected");
                                }
                                int i33 = 0;
                                while (iM1238i14 > 0) {
                                    i33++;
                                    iM1238i14 >>>= 1;
                                }
                                j22Var = new j22(r61Var, ak0Var, bArr, c0073asArr, i33);
                                break;
                            }
                            int iM1238i15 = c0141cm.m1238i(i7);
                            if (iM1238i15 == 0) {
                                int i34 = i12;
                                c0141cm.m1249t(i34);
                                c0141cm.m1249t(16);
                                c0141cm.m1249t(16);
                                c0141cm.m1249t(6);
                                c0141cm.m1249t(i34);
                                int iM1238i16 = c0141cm.m1238i(4) + 1;
                                int i35 = 0;
                                while (i35 < iM1238i16) {
                                    c0141cm.m1249t(i34);
                                    i35++;
                                    i34 = 8;
                                }
                            } else {
                                if (iM1238i15 != i15) {
                                    throw fc1.m2799a(null, "floor type greater than 1 not decodable: " + iM1238i15);
                                }
                                int iM1238i17 = c0141cm.m1238i(5);
                                int[] iArr2 = new int[iM1238i17];
                                int i36 = -1;
                                for (int i37 = 0; i37 < iM1238i17; i37++) {
                                    int iM1238i18 = c0141cm.m1238i(i);
                                    iArr2[i37] = iM1238i18;
                                    if (iM1238i18 > i36) {
                                        i36 = iM1238i18;
                                    }
                                }
                                int i38 = i36 + 1;
                                int[] iArr3 = new int[i38];
                                int i39 = 0;
                                while (i39 < i38) {
                                    iArr3[i39] = c0141cm.m1238i(i17) + 1;
                                    int iM1238i19 = c0141cm.m1238i(2);
                                    int i40 = i12;
                                    if (iM1238i19 > 0) {
                                        c0141cm.m1249t(i40);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i41 = 0;
                                    for (int i42 = 1; i41 < (i42 << iM1238i19); i42 = 1) {
                                        c0141cm.m1249t(i40);
                                        i41++;
                                        i40 = 8;
                                    }
                                    i39++;
                                    iArr3 = iArr4;
                                    i12 = 8;
                                    i17 = 3;
                                }
                                int[] iArr5 = iArr3;
                                c0141cm.m1249t(2);
                                int iM1238i20 = c0141cm.m1238i(4);
                                int i43 = 0;
                                int i44 = 0;
                                for (int i45 = 0; i45 < iM1238i17; i45++) {
                                    i43 += iArr5[iArr2[i45]];
                                    while (i44 < i43) {
                                        c0141cm.m1249t(iM1238i20);
                                        i44++;
                                    }
                                }
                            }
                            i16++;
                            i12 = 8;
                            i13 = 6;
                            i = 4;
                            i7 = 16;
                            i15 = 1;
                        }
                    }
                }
            }
            this.f11177n = j22Var;
            if (j22Var == null) {
                return true;
            }
            r61 r61Var2 = (r61) j22Var.f5242b;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) r61Var2.f9748g);
            arrayList.add((byte[]) j22Var.f5244d);
            k51 k51VarM5783f0 = rc2.m5783f0(qm0.m5568p(((ak0) j22Var.f5243c).f254b));
            ae0 ae0Var = new ae0();
            ae0Var.f197m = v51.m6582l("audio/vorbis");
            ae0Var.f192h = r61Var2.f9745d;
            ae0Var.f193i = r61Var2.f9744c;
            ae0Var.f175B = r61Var2.f9742a;
            ae0Var.f176C = r61Var2.f9743b;
            ae0Var.f200p = arrayList;
            ae0Var.f195k = k51VarM5783f0;
            qo0Var.f9548b = new be0(ae0Var);
            return true;
        }
        rc2.m5808v0(1, dc1Var, false);
        dc1Var.m2329l();
        int iM2337t2 = dc1Var.m2337t();
        int iM2329l = dc1Var.m2329l();
        int iM2326i = dc1Var.m2326i();
        if (iM2326i <= 0) {
            iM2326i = -1;
        }
        int iM2326i2 = dc1Var.m2326i();
        int i46 = iM2326i2 > 0 ? iM2326i2 : -1;
        dc1Var.m2326i();
        int iM2337t3 = dc1Var.m2337t();
        int iPow = (int) Math.pow(2.0d, iM2337t3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM2337t3 & 240) >> 4);
        dc1Var.m2337t();
        Object CopyOf = Arrays.copyOf(dc1Var.f2882a, dc1Var.f2884c);
        r61 r61Var3 = new r61();
        r61Var3.f9742a = iM2337t2;
        r61Var3.f9743b = iM2329l;
        r61Var3.f9744c = iM2326i;
        r61Var3.f9745d = i46;
        r61Var3.f9746e = iPow;
        r61Var3.f9747f = iPow2;
        r61Var3.f9748g = CopyOf;
        this.f11180q = r61Var3;
        j22Var = null;
        this.f11177n = j22Var;
        if (j22Var == null) {
            return true;
        }
        r61 r61Var4 = (r61) j22Var.f5242b;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) r61Var4.f9748g);
        arrayList2.add((byte[]) j22Var.f5244d);
        k51 k51VarM5783f1 = rc2.m5783f0(qm0.m5568p(((ak0) j22Var.f5243c).f254b));
        ae0 ae0Var2 = new ae0();
        ae0Var2.f197m = v51.m6582l("audio/vorbis");
        ae0Var2.f192h = r61Var4.f9745d;
        ae0Var2.f193i = r61Var4.f9744c;
        ae0Var2.f175B = r61Var4.f9742a;
        ae0Var2.f176C = r61Var4.f9743b;
        ae0Var2.f200p = arrayList2;
        ae0Var2.f195k = k51VarM5783f1;
        qo0Var.f9548b = new be0(ae0Var2);
        return true;
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: d */
    public final void mo1201d(boolean z) {
        super.mo1201d(z);
        if (z) {
            this.f11177n = null;
            this.f11180q = null;
            this.f11181r = null;
        }
        this.f11178o = 0;
        this.f11179p = false;
    }
}
