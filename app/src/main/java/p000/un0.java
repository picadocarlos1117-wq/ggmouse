package p000;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class un0 {

    /* JADX INFO: renamed from: e */
    public static final un0 f11367e = new un0(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f11368a;

    /* JADX INFO: renamed from: b */
    public final int f11369b;

    /* JADX INFO: renamed from: c */
    public final int f11370c;

    /* JADX INFO: renamed from: d */
    public final int f11371d;

    public un0(int i, int i2, int i3, int i4) {
        this.f11368a = i;
        this.f11369b = i2;
        this.f11370c = i3;
        this.f11371d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static un0 m6513a(un0 un0Var, un0 un0Var2) {
        return m6514b(Math.max(un0Var.f11368a, un0Var2.f11368a), Math.max(un0Var.f11369b, un0Var2.f11369b), Math.max(un0Var.f11370c, un0Var2.f11370c), Math.max(un0Var.f11371d, un0Var2.f11371d));
    }

    /* JADX INFO: renamed from: b */
    public static un0 m6514b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f11367e : new un0(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static un0 m6515c(Insets insets) {
        return m6514b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: d */
    public final Insets m6516d() {
        return tn0.m6306a(this.f11368a, this.f11369b, this.f11370c, this.f11371d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || un0.class != obj.getClass()) {
            return false;
        }
        un0 un0Var = (un0) obj;
        return this.f11371d == un0Var.f11371d && this.f11368a == un0Var.f11368a && this.f11370c == un0Var.f11370c && this.f11369b == un0Var.f11369b;
    }

    public final int hashCode() {
        return (((((this.f11368a * 31) + this.f11369b) * 31) + this.f11370c) * 31) + this.f11371d;
    }

    public final String toString() {
        return "Insets{left=" + this.f11368a + ", top=" + this.f11369b + ", right=" + this.f11370c + ", bottom=" + this.f11371d + '}';
    }
}
