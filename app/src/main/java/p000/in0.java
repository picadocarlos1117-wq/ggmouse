package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 {

    /* JADX INFO: renamed from: a */
    public final int f5109a;

    /* JADX INFO: renamed from: b */
    public final Object f5110b;

    public in0(int i, Object obj) {
        this.f5109a = i;
        this.f5110b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in0)) {
            return false;
        }
        in0 in0Var = (in0) obj;
        return this.f5109a == in0Var.f5109a && hp0.m3214e(this.f5110b, in0Var.f5110b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5109a) * 31;
        Object obj = this.f5110b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f5109a + ", value=" + this.f5110b + ')';
    }
}
