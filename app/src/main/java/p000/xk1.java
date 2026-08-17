package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 {

    /* JADX INFO: renamed from: c */
    public static final xk1 f12632c = new xk1(0, false);

    /* JADX INFO: renamed from: a */
    public final int f12633a;

    /* JADX INFO: renamed from: b */
    public final boolean f12634b;

    public xk1(int i, boolean z) {
        this.f12633a = i;
        this.f12634b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xk1.class != obj.getClass()) {
            return false;
        }
        xk1 xk1Var = (xk1) obj;
        return this.f12633a == xk1Var.f12633a && this.f12634b == xk1Var.f12634b;
    }

    public final int hashCode() {
        return (this.f12633a << 1) + (this.f12634b ? 1 : 0);
    }
}
