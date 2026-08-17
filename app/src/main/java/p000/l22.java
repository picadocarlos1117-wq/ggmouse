package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class l22 {

    /* JADX INFO: renamed from: b */
    public static final l22 f6156b;

    /* JADX INFO: renamed from: a */
    public final qm0 f6157a;

    static {
        om0 om0Var = qm0.f9540b;
        f6156b = new l22(kk1.f5896e);
        z42.m7252z(0);
    }

    public l22(kk1 kk1Var) {
        this.f6157a = qm0.m5567n(kk1Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4023a(int i) {
        int i2 = 0;
        while (true) {
            qm0 qm0Var = this.f6157a;
            if (i2 >= qm0Var.size()) {
                return false;
            }
            k22 k22Var = (k22) qm0Var.get(i2);
            for (boolean z : k22Var.f5655e) {
                if (z) {
                    if (k22Var.f5652b.f12804c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l22.class != obj.getClass()) {
            return false;
        }
        return this.f6157a.equals(((l22) obj).f6157a);
    }

    public final int hashCode() {
        return this.f6157a.hashCode();
    }
}
