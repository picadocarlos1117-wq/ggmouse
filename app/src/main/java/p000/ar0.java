package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final ar0 f1037b = new ar0();

    /* JADX INFO: renamed from: a */
    public final int f1038a = 131594;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ar0 ar0Var = (ar0) obj;
        ar0Var.getClass();
        return this.f1038a - ar0Var.f1038a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ar0 ar0Var = obj instanceof ar0 ? (ar0) obj : null;
        return ar0Var != null && this.f1038a == ar0Var.f1038a;
    }

    public final int hashCode() {
        return this.f1038a;
    }

    public final String toString() {
        return "2.2.10";
    }
}
