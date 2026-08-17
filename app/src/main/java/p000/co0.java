package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 extends ao0 {

    /* JADX INFO: renamed from: d */
    public static final co0 f1877d = new co0(1, 0, 1);

    @Override // p000.ao0
    public final boolean equals(Object obj) {
        if (!(obj instanceof co0)) {
            return false;
        }
        if (isEmpty() && ((co0) obj).isEmpty()) {
            return true;
        }
        co0 co0Var = (co0) obj;
        return this.f1008a == co0Var.f1008a && this.f1009b == co0Var.f1009b;
    }

    @Override // p000.ao0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1008a * 31) + this.f1009b;
    }

    @Override // p000.ao0
    public final boolean isEmpty() {
        return this.f1008a > this.f1009b;
    }

    @Override // p000.ao0
    public final String toString() {
        return this.f1008a + ".." + this.f1009b;
    }
}
