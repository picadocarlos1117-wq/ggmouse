package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ag1 extends cb1 {

    /* JADX INFO: renamed from: a */
    public final Object f232a;

    public ag1(Object obj) {
        this.f232a = obj;
    }

    @Override // p000.cb1
    /* JADX INFO: renamed from: a */
    public final Object mo151a() {
        return this.f232a;
    }

    @Override // p000.cb1
    /* JADX INFO: renamed from: b */
    public final boolean mo152b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ag1) {
            return this.f232a.equals(((ag1) obj).f232a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f232a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f232a + ")";
    }
}
