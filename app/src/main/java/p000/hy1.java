package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hy1 implements ey1, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f4747a;

    public hy1(Object obj) {
        this.f4747a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hy1) {
            return hr1.m3275k(this.f4747a, ((hy1) obj).f4747a);
        }
        return false;
    }

    @Override // p000.ey1
    public final Object get() {
        return this.f4747a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4747a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f4747a + ")";
    }
}
