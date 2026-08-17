package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q21 {

    /* JADX INFO: renamed from: a */
    public final Object f9309a;

    /* JADX INFO: renamed from: b */
    public final int f9310b;

    /* JADX INFO: renamed from: c */
    public final int f9311c;

    /* JADX INFO: renamed from: d */
    public final long f9312d;

    /* JADX INFO: renamed from: e */
    public final int f9313e;

    public q21(Object obj, int i, int i2, long j, int i3) {
        this.f9309a = obj;
        this.f9310b = i;
        this.f9311c = i2;
        this.f9312d = j;
        this.f9313e = i3;
    }

    /* JADX INFO: renamed from: a */
    public final q21 m5437a(Object obj) {
        if (this.f9309a.equals(obj)) {
            return this;
        }
        return new q21(obj, this.f9310b, this.f9311c, this.f9312d, this.f9313e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5438b() {
        return this.f9310b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q21)) {
            return false;
        }
        q21 q21Var = (q21) obj;
        return this.f9309a.equals(q21Var.f9309a) && this.f9310b == q21Var.f9310b && this.f9311c == q21Var.f9311c && this.f9312d == q21Var.f9312d && this.f9313e == q21Var.f9313e;
    }

    public final int hashCode() {
        return ((((((((this.f9309a.hashCode() + 527) * 31) + this.f9310b) * 31) + this.f9311c) * 31) + ((int) this.f9312d)) * 31) + this.f9313e;
    }

    public q21(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public q21(Object obj, int i, long j) {
        this(obj, -1, -1, j, i);
    }

    public q21(Object obj) {
        this(-1L, obj);
    }
}
