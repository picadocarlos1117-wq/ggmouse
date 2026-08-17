package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 {

    /* JADX INFO: renamed from: a */
    public final List f5045a;

    /* JADX INFO: renamed from: b */
    public final int f5046b;

    /* JADX INFO: renamed from: c */
    public final int f5047c;

    /* JADX INFO: renamed from: d */
    public final int f5048d;

    /* JADX INFO: renamed from: e */
    public final int f5049e;

    /* JADX INFO: renamed from: f */
    public final int f5050f;

    /* JADX INFO: renamed from: g */
    public final int f5051g;

    /* JADX INFO: renamed from: h */
    public final int f5052h;

    /* JADX INFO: renamed from: i */
    public final float f5053i;

    /* JADX INFO: renamed from: j */
    public final int f5054j;

    /* JADX INFO: renamed from: k */
    public final String f5055k;

    /* JADX INFO: renamed from: l */
    public final C0599ed f5056l;

    public ik0(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, String str, C0599ed c0599ed) {
        this.f5045a = list;
        this.f5046b = i;
        this.f5047c = i2;
        this.f5048d = i3;
        this.f5049e = i4;
        this.f5050f = i5;
        this.f5051g = i6;
        this.f5052h = i7;
        this.f5053i = f;
        this.f5054j = i8;
        this.f5055k = str;
        this.f5056l = c0599ed;
    }

    /* JADX INFO: renamed from: a */
    public static ik0 m3444a(dc1 dc1Var, boolean z, C0599ed c0599ed) {
        boolean z2;
        p71 p71VarM4664j0;
        int i = 4;
        try {
            if (z) {
                dc1Var.m2317G(4);
            } else {
                dc1Var.m2317G(21);
            }
            int iM2337t = dc1Var.m2337t() & 3;
            int iM2337t2 = dc1Var.m2337t();
            int i2 = dc1Var.f2883b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iM2337t2) {
                    break;
                }
                dc1Var.m2317G(1);
                int iM2343z = dc1Var.m2343z();
                for (int i6 = 0; i6 < iM2343z; i6++) {
                    int iM2343z2 = dc1Var.m2343z();
                    i5 += iM2343z2 + 4;
                    dc1Var.m2317G(iM2343z2);
                }
                i4++;
            }
            dc1Var.m2316F(i2);
            byte[] bArr = new byte[i5];
            C0599ed c0599ed2 = c0599ed;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String strM2374a = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < iM2337t2) {
                int iM2337t3 = dc1Var.m2337t() & 63;
                int iM2343z3 = dc1Var.m2343z();
                int i16 = i3;
                C0599ed c0599edM4668l0 = c0599ed2;
                while (i16 < iM2343z3) {
                    boolean z3 = z2;
                    int iM2343z4 = dc1Var.m2343z();
                    int i17 = iM2337t;
                    System.arraycopy(o21.f7628c, i3, bArr, i15, i);
                    int i18 = i15 + 4;
                    System.arraycopy(dc1Var.f2882a, dc1Var.f2883b, bArr, i18, iM2343z4);
                    if (iM2337t3 == 32 && i16 == 0) {
                        c0599edM4668l0 = o21.m4668l0(i18, i18 + iM2343z4, bArr);
                    } else {
                        if (iM2337t3 == 33 && i16 == 0) {
                            q71 q71VarM4666k0 = o21.m4666k0(bArr, i18, i18 + iM2343z4, c0599edM4668l0);
                            i7 = q71VarM4666k0.f9429b + 8;
                            i8 = q71VarM4666k0.f9430c + 8;
                            int i19 = q71VarM4666k0.f9435h;
                            int i20 = q71VarM4666k0.f9436i;
                            i9 = i19;
                            int i21 = q71VarM4666k0.f9437j;
                            float f2 = q71VarM4666k0.f9433f;
                            int i22 = q71VarM4666k0.f9434g;
                            m71 m71Var = q71VarM4666k0.f9428a;
                            if (m71Var != null) {
                                strM2374a = AbstractC0574dp.m2374a(m71Var.f6682a, m71Var.f6683b, m71Var.f6684c, m71Var.f6685d, m71Var.f6686e, m71Var.f6687f);
                            }
                            i13 = i22;
                            f = f2;
                            i11 = i21;
                            i10 = i20;
                        } else if (iM2337t3 == 39 && i16 == 0 && (p71VarM4664j0 = o21.m4664j0(i18, i18 + iM2343z4, bArr)) != null && c0599edM4668l0 != null) {
                            i3 = 0;
                            i12 = p71VarM4664j0.f8786b == ((l71) ((qm0) c0599edM4668l0.f3313a).get(0)).f6207b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i15 = i18 + iM2343z4;
                    dc1Var.m2317G(iM2343z4);
                    i16++;
                    z2 = z3;
                    iM2337t = i17;
                    i = 4;
                }
                i14++;
                c0599ed2 = c0599edM4668l0;
                i = 4;
            }
            return new ik0(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM2337t + 1, i7, i8, i9, i10, i11, i12, f, i13, strM2374a, c0599ed2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw fc1.m2799a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
