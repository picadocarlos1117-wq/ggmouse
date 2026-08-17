package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ju0 {

    /* JADX INFO: renamed from: e */
    public static final ju0 f5526e = new ju0(null, null, nv1.f7550e, false);

    /* JADX INFO: renamed from: a */
    public final o21 f5527a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1450to f5528b;

    /* JADX INFO: renamed from: c */
    public final nv1 f5529c;

    /* JADX INFO: renamed from: d */
    public final boolean f5530d;

    public ju0(o21 o21Var, AbstractC1450to abstractC1450to, nv1 nv1Var, boolean z) {
        this.f5527a = o21Var;
        this.f5528b = abstractC1450to;
        p32.m5188s(nv1Var, "status");
        this.f5529c = nv1Var;
        this.f5530d = z;
    }

    /* JADX INFO: renamed from: a */
    public static ju0 m3708a(nv1 nv1Var) {
        p32.m5177l(!nv1Var.m4612e(), "error status shouldn't be OK");
        return new ju0(null, null, nv1Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static ju0 m3709b(o21 o21Var, pb1 pb1Var) {
        p32.m5188s(o21Var, "subchannel");
        return new ju0(o21Var, pb1Var, nv1.f7550e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ju0)) {
            return false;
        }
        ju0 ju0Var = (ju0) obj;
        return hr1.m3275k(this.f5527a, ju0Var.f5527a) && hr1.m3275k(this.f5529c, ju0Var.f5529c) && hr1.m3275k(this.f5528b, ju0Var.f5528b) && this.f5530d == ju0Var.f5530d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5527a, this.f5529c, this.f5528b, Boolean.valueOf(this.f5530d)});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f5527a, "subchannel");
        c1679zvM5176k0.m7359a(this.f5528b, "streamTracerFactory");
        c1679zvM5176k0.m7359a(this.f5529c, "status");
        c1679zvM5176k0.m7361c("drop", this.f5530d);
        return c1679zvM5176k0.toString();
    }
}
