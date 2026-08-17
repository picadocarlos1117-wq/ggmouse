package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: zj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1667zj extends eb1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final yg0 f13428a;

    /* JADX INFO: renamed from: b */
    public final eb1 f13429b;

    public C1667zj(yg0 yg0Var, eb1 eb1Var) {
        this.f13428a = yg0Var;
        this.f13429b = eb1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        yg0 yg0Var = this.f13428a;
        return this.f13429b.compare(yg0Var.apply(obj), yg0Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1667zj)) {
            return false;
        }
        C1667zj c1667zj = (C1667zj) obj;
        return this.f13428a.equals(c1667zj.f13428a) && this.f13429b.equals(c1667zj.f13429b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13428a, this.f13429b});
    }

    public final String toString() {
        return this.f13429b + ".onResultOf(" + this.f13428a + ")";
    }
}
