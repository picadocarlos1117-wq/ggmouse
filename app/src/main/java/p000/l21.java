package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l21 {

    /* JADX INFO: renamed from: a */
    public final q21 f6147a;

    /* JADX INFO: renamed from: b */
    public final long f6148b;

    /* JADX INFO: renamed from: c */
    public final long f6149c;

    /* JADX INFO: renamed from: d */
    public final long f6150d;

    /* JADX INFO: renamed from: e */
    public final long f6151e;

    /* JADX INFO: renamed from: f */
    public final boolean f6152f;

    /* JADX INFO: renamed from: g */
    public final boolean f6153g;

    /* JADX INFO: renamed from: h */
    public final boolean f6154h;

    /* JADX INFO: renamed from: i */
    public final boolean f6155i;

    public l21(q21 q21Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        ki0.m3857c(!z4 || z2);
        ki0.m3857c(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        ki0.m3857c(z5);
        this.f6147a = q21Var;
        this.f6148b = j;
        this.f6149c = j2;
        this.f6150d = j3;
        this.f6151e = j4;
        this.f6152f = z;
        this.f6153g = z2;
        this.f6154h = z3;
        this.f6155i = z4;
    }

    /* JADX INFO: renamed from: a */
    public final l21 m4021a(long j) {
        if (j == this.f6149c) {
            return this;
        }
        return new l21(this.f6147a, this.f6148b, j, this.f6150d, this.f6151e, this.f6152f, this.f6153g, this.f6154h, this.f6155i);
    }

    /* JADX INFO: renamed from: b */
    public final l21 m4022b(long j) {
        if (j == this.f6148b) {
            return this;
        }
        return new l21(this.f6147a, j, this.f6149c, this.f6150d, this.f6151e, this.f6152f, this.f6153g, this.f6154h, this.f6155i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l21.class == obj.getClass()) {
            l21 l21Var = (l21) obj;
            if (this.f6148b == l21Var.f6148b && this.f6149c == l21Var.f6149c && this.f6150d == l21Var.f6150d && this.f6151e == l21Var.f6151e && this.f6152f == l21Var.f6152f && this.f6153g == l21Var.f6153g && this.f6154h == l21Var.f6154h && this.f6155i == l21Var.f6155i) {
                q21 q21Var = l21Var.f6147a;
                int i = z42.f13274a;
                if (Objects.equals(this.f6147a, q21Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f6147a.hashCode() + 527) * 31) + ((int) this.f6148b)) * 31) + ((int) this.f6149c)) * 31) + ((int) this.f6150d)) * 31) + ((int) this.f6151e)) * 31) + (this.f6152f ? 1 : 0)) * 31) + (this.f6153g ? 1 : 0)) * 31) + (this.f6154h ? 1 : 0)) * 31) + (this.f6155i ? 1 : 0);
    }
}
