package p000;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0773j0 extends cb1 {

    /* JADX INFO: renamed from: a */
    public static final C0773j0 f5226a = new C0773j0();

    @Override // p000.cb1
    /* JADX INFO: renamed from: a */
    public final Object mo151a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p000.cb1
    /* JADX INFO: renamed from: b */
    public final boolean mo152b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
