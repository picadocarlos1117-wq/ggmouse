package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 {

    /* JADX INFO: renamed from: a */
    public final eb0 f1354a;

    public be1(eb0 eb0Var) {
        this.f1354a = eb0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m971a(int... iArr) {
        for (int i : iArr) {
            if (this.f1354a.f3306a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be1) {
            return this.f1354a.equals(((be1) obj).f1354a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1354a.hashCode();
    }
}
