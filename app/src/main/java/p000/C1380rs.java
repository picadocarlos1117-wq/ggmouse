package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: rs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1380rs {

    /* JADX INFO: renamed from: a */
    public int[] f10114a;

    /* JADX INFO: renamed from: b */
    public int[] f10115b;

    /* JADX INFO: renamed from: c */
    public int f10116c;

    /* JADX INFO: renamed from: d */
    public int[] f10117d;

    /* JADX INFO: renamed from: e */
    public float[] f10118e;

    /* JADX INFO: renamed from: f */
    public int f10119f;

    /* JADX INFO: renamed from: g */
    public int[] f10120g;

    /* JADX INFO: renamed from: h */
    public String[] f10121h;

    /* JADX INFO: renamed from: i */
    public int f10122i;

    /* JADX INFO: renamed from: j */
    public int[] f10123j;

    /* JADX INFO: renamed from: k */
    public boolean[] f10124k;

    /* JADX INFO: renamed from: l */
    public int f10125l;

    /* JADX INFO: renamed from: a */
    public final void m5903a(int i, float f) {
        int i2 = this.f10119f;
        int[] iArr = this.f10117d;
        if (i2 >= iArr.length) {
            this.f10117d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f10118e;
            this.f10118e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f10117d;
        int i3 = this.f10119f;
        iArr2[i3] = i;
        float[] fArr2 = this.f10118e;
        this.f10119f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    public final void m5904b(int i, int i2) {
        int i3 = this.f10116c;
        int[] iArr = this.f10114a;
        if (i3 >= iArr.length) {
            this.f10114a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f10115b;
            this.f10115b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f10114a;
        int i4 = this.f10116c;
        iArr3[i4] = i;
        int[] iArr4 = this.f10115b;
        this.f10116c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m5905c(int i, String str) {
        int i2 = this.f10122i;
        int[] iArr = this.f10120g;
        if (i2 >= iArr.length) {
            this.f10120g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f10121h;
            this.f10121h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f10120g;
        int i3 = this.f10122i;
        iArr2[i3] = i;
        String[] strArr2 = this.f10121h;
        this.f10122i = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m5906d(int i, boolean z) {
        int i2 = this.f10125l;
        int[] iArr = this.f10123j;
        if (i2 >= iArr.length) {
            this.f10123j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f10124k;
            this.f10124k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f10123j;
        int i3 = this.f10125l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f10124k;
        this.f10125l = i3 + 1;
        zArr2[i3] = z;
    }
}
