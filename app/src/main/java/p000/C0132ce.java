package p000;

/* JADX INFO: renamed from: ce */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0132ce extends j81 {

    /* JADX INFO: renamed from: a */
    public final i81 f1777a;

    /* JADX INFO: renamed from: b */
    public final h81 f1778b;

    public C0132ce(i81 i81Var, h81 h81Var) {
        this.f1777a = i81Var;
        this.f1778b = h81Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j81) {
            j81 j81Var = (j81) obj;
            i81 i81Var = this.f1777a;
            if (i81Var != null ? i81Var.equals(((C0132ce) j81Var).f1777a) : ((C0132ce) j81Var).f1777a == null) {
                h81 h81Var = this.f1778b;
                if (h81Var != null ? h81Var.equals(((C0132ce) j81Var).f1778b) : ((C0132ce) j81Var).f1778b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        i81 i81Var = this.f1777a;
        int iHashCode = ((i81Var == null ? 0 : i81Var.hashCode()) ^ 1000003) * 1000003;
        h81 h81Var = this.f1778b;
        return iHashCode ^ (h81Var != null ? h81Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1777a + ", mobileSubtype=" + this.f1778b + "}";
    }
}
