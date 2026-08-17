package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vg1 {

    /* JADX INFO: renamed from: a */
    public final int f11655a;

    /* JADX INFO: renamed from: b */
    public final boolean f11656b;

    public vg1(int i, boolean z) {
        this.f11655a = i;
        this.f11656b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vg1.class != obj.getClass()) {
            return false;
        }
        vg1 vg1Var = (vg1) obj;
        return this.f11655a == vg1Var.f11655a && this.f11656b == vg1Var.f11656b;
    }

    public final int hashCode() {
        return (this.f11655a * 31) + (this.f11656b ? 1 : 0);
    }
}
