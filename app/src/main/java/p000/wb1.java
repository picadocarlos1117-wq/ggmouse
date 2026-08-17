package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class wb1 implements InterfaceC1375rn {

    /* JADX INFO: renamed from: a */
    public final Class f12052a;

    public wb1(Class cls) {
        cls.getClass();
        this.f12052a = cls;
    }

    @Override // p000.InterfaceC1375rn
    /* JADX INFO: renamed from: a */
    public final Class mo5862a() {
        return this.f12052a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb1) {
            return hp0.m3214e(this.f12052a, ((wb1) obj).f12052a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12052a.hashCode();
    }

    public final String toString() {
        return this.f12052a + " (Kotlin reflection is not available)";
    }
}
