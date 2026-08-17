package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v71 {

    /* JADX INFO: renamed from: a */
    public final nv1 f11573a;

    /* JADX INFO: renamed from: b */
    public final Object f11574b;

    public v71(nv1 nv1Var) {
        this.f11574b = null;
        p32.m5188s(nv1Var, "status");
        this.f11573a = nv1Var;
        p32.m5179m(!nv1Var.m4612e(), "cannot use OK status: %s", nv1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v71.class == obj.getClass()) {
            v71 v71Var = (v71) obj;
            if (hr1.m3275k(this.f11573a, v71Var.f11573a) && hr1.m3275k(this.f11574b, v71Var.f11574b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11573a, this.f11574b});
    }

    public final String toString() {
        Object obj = this.f11574b;
        if (obj != null) {
            C1679zv c1679zvM5176k0 = p32.m5176k0(this);
            c1679zvM5176k0.m7359a(obj, "config");
            return c1679zvM5176k0.toString();
        }
        C1679zv c1679zvM5176k1 = p32.m5176k0(this);
        c1679zvM5176k1.m7359a(this.f11573a, "error");
        return c1679zvM5176k1.toString();
    }

    public v71(Object obj) {
        this.f11574b = obj;
        this.f11573a = null;
    }
}
