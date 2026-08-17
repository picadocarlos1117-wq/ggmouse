package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gr1 {

    /* JADX INFO: renamed from: a */
    public final ou0 f4302a;

    /* JADX INFO: renamed from: b */
    public final Object f4303b;

    public gr1(ou0 ou0Var, Object obj) {
        this.f4302a = ou0Var;
        this.f4303b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gr1.class == obj.getClass()) {
            gr1 gr1Var = (gr1) obj;
            if (hr1.m3275k(this.f4302a, gr1Var.f4302a) && hr1.m3275k(this.f4303b, gr1Var.f4303b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4302a, this.f4303b});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f4302a, "provider");
        c1679zvM5176k0.m7359a(this.f4303b, "config");
        return c1679zvM5176k0.toString();
    }
}
