package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m92 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f6722a;

    /* JADX INFO: renamed from: b */
    public final i92 f6723b;

    public m92(int i, i92 i92Var) {
        this.f6722a = i;
        this.f6723b = i92Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f6722a, ((m92) obj).f6722a);
    }
}
