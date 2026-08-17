package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e22 {

    /* JADX INFO: renamed from: a */
    public final y12 f3180a;

    /* JADX INFO: renamed from: b */
    public final qm0 f3181b;

    static {
        z42.m7252z(0);
        z42.m7252z(1);
    }

    public e22(y12 y12Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= y12Var.f12802a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f3180a = y12Var;
        this.f3181b = qm0.m5567n(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e22.class == obj.getClass()) {
            e22 e22Var = (e22) obj;
            if (this.f3180a.equals(e22Var.f3180a) && this.f3181b.equals(e22Var.f3181b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3181b.hashCode() * 31) + this.f3180a.hashCode();
    }
}
