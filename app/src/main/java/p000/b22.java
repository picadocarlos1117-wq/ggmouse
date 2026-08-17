package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class b22 {

    /* JADX INFO: renamed from: a */
    public final int f1133a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1134b;

    /* JADX INFO: renamed from: c */
    public final int f1135c;

    /* JADX INFO: renamed from: d */
    public final int f1136d;

    public b22(int i, int i2, int i3, byte[] bArr) {
        this.f1133a = i;
        this.f1134b = bArr;
        this.f1135c = i2;
        this.f1136d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b22.class != obj.getClass()) {
            return false;
        }
        b22 b22Var = (b22) obj;
        return this.f1133a == b22Var.f1133a && this.f1135c == b22Var.f1135c && this.f1136d == b22Var.f1136d && Arrays.equals(this.f1134b, b22Var.f1134b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f1134b) + (this.f1133a * 31)) * 31) + this.f1135c) * 31) + this.f1136d;
    }
}
