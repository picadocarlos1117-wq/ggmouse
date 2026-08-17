package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r61 {

    /* JADX INFO: renamed from: a */
    public int f9742a;

    /* JADX INFO: renamed from: b */
    public int f9743b;

    /* JADX INFO: renamed from: c */
    public int f9744c;

    /* JADX INFO: renamed from: d */
    public int f9745d;

    /* JADX INFO: renamed from: e */
    public int f9746e;

    /* JADX INFO: renamed from: f */
    public int f9747f;

    /* JADX INFO: renamed from: g */
    public Serializable f9748g;

    /* JADX INFO: renamed from: a */
    public boolean m5716a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f9742a = i2;
        this.f9748g = hp0.f4644h[3 - i3];
        int i6 = hp0.f4645i[i5];
        this.f9744c = i6;
        if (i2 == 2) {
            this.f9744c = i6 / 2;
        } else if (i2 == 0) {
            this.f9744c = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    l41.m4049r();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.f9747f = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? hp0.f4646j[i4 - 1] : hp0.f4647k[i4 - 1];
            this.f9746e = i9;
            this.f9743b = (((i9 * 12) / this.f9744c) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? hp0.f4648l[i4 - 1] : hp0.f4649m[i4 - 1];
                this.f9746e = i10;
                this.f9743b = ((i10 * 144) / this.f9744c) + i7;
            } else {
                int i11 = hp0.f4650n[i4 - 1];
                this.f9746e = i11;
                this.f9743b = (((i3 == 1 ? 72 : 144) * i11) / this.f9744c) + i7;
            }
        }
        this.f9745d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
