package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ie */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0748ie {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4988a;

    /* JADX INFO: renamed from: b */
    public final int f4989b;

    /* JADX INFO: renamed from: c */
    public final int f4990c;

    /* JADX INFO: renamed from: d */
    public final int f4991d;

    /* JADX INFO: renamed from: e */
    public final int f4992e;

    /* JADX INFO: renamed from: f */
    public final int f4993f;

    /* JADX INFO: renamed from: g */
    public final int f4994g;

    /* JADX INFO: renamed from: h */
    public final int f4995h;

    /* JADX INFO: renamed from: i */
    public final int f4996i;

    /* JADX INFO: renamed from: j */
    public final int f4997j;

    /* JADX INFO: renamed from: k */
    public final float f4998k;

    /* JADX INFO: renamed from: l */
    public final String f4999l;

    public C0748ie(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f4988a = arrayList;
        this.f4989b = i;
        this.f4990c = i2;
        this.f4991d = i3;
        this.f4992e = i4;
        this.f4993f = i5;
        this.f4994g = i6;
        this.f4995h = i7;
        this.f4996i = i8;
        this.f4997j = i9;
        this.f4998k = f;
        this.f4999l = str;
    }

    /* JADX INFO: renamed from: a */
    public static C0748ie m3425a(dc1 dc1Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            dc1Var.m2317G(4);
            int iM2337t = (dc1Var.m2337t() & 3) + 1;
            if (iM2337t == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2337t2 = dc1Var.m2337t() & 31;
            for (int i9 = 0; i9 < iM2337t2; i9++) {
                int iM2343z = dc1Var.m2343z();
                int i10 = dc1Var.f2883b;
                dc1Var.m2317G(iM2343z);
                byte[] bArr = dc1Var.f2882a;
                byte[] bArr2 = new byte[iM2343z + 4];
                System.arraycopy(AbstractC0574dp.f2986a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iM2343z);
                arrayList.add(bArr2);
            }
            int iM2337t3 = dc1Var.m2337t();
            for (int i11 = 0; i11 < iM2337t3; i11++) {
                int iM2343z2 = dc1Var.m2343z();
                int i12 = dc1Var.f2883b;
                dc1Var.m2317G(iM2343z2);
                byte[] bArr3 = dc1Var.f2882a;
                byte[] bArr4 = new byte[iM2343z2 + 4];
                System.arraycopy(AbstractC0574dp.f2986a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iM2343z2);
                arrayList.add(bArr4);
            }
            if (iM2337t2 > 0) {
                t71 t71VarM4670m0 = o21.m4670m0(iM2337t, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = t71VarM4670m0.f10782e;
                int i14 = t71VarM4670m0.f10783f;
                int i15 = t71VarM4670m0.f10785h + 8;
                int i16 = t71VarM4670m0.f10786i + 8;
                int i17 = t71VarM4670m0.f10793p;
                int i18 = t71VarM4670m0.f10794q;
                int i19 = t71VarM4670m0.f10795r;
                int i20 = t71VarM4670m0.f10796s;
                float f2 = t71VarM4670m0.f10784g;
                int i21 = t71VarM4670m0.f10778a;
                int i22 = t71VarM4670m0.f10779b;
                int i23 = t71VarM4670m0.f10780c;
                byte[] bArr5 = AbstractC0574dp.f2986a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new C0748ie(arrayList, iM2337t, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw fc1.m2799a(e, "Error parsing AVC config");
        }
    }
}
