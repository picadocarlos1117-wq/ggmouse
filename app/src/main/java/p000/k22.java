package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class k22 {

    /* JADX INFO: renamed from: a */
    public final int f5651a;

    /* JADX INFO: renamed from: b */
    public final y12 f5652b;

    /* JADX INFO: renamed from: c */
    public final boolean f5653c;

    /* JADX INFO: renamed from: d */
    public final int[] f5654d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f5655e;

    static {
        z42.m7252z(0);
        z42.m7252z(1);
        z42.m7252z(3);
        z42.m7252z(4);
    }

    public k22(y12 y12Var, boolean z, int[] iArr, boolean[] zArr) {
        int i = y12Var.f12802a;
        this.f5651a = i;
        boolean z2 = false;
        ki0.m3857c(i == iArr.length && i == zArr.length);
        this.f5652b = y12Var;
        if (z && i > 1) {
            z2 = true;
        }
        this.f5653c = z2;
        this.f5654d = (int[]) iArr.clone();
        this.f5655e = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3765a(int i) {
        return this.f5654d[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k22.class == obj.getClass()) {
            k22 k22Var = (k22) obj;
            if (this.f5653c == k22Var.f5653c && this.f5652b.equals(k22Var.f5652b) && Arrays.equals(this.f5654d, k22Var.f5654d) && Arrays.equals(this.f5655e, k22Var.f5655e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5655e) + ((Arrays.hashCode(this.f5654d) + (((this.f5652b.hashCode() * 31) + (this.f5653c ? 1 : 0)) * 31)) * 31);
    }
}
