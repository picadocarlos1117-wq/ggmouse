package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ci0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f1814a;

    /* JADX INFO: renamed from: b */
    public final hb2 f1815b;

    /* JADX INFO: renamed from: c */
    public final boolean f1816c;

    public ci0(io0 io0Var, int i, hb2 hb2Var, boolean z, boolean z2) {
        this.f1814a = i;
        this.f1815b = hb2Var;
        this.f1816c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1814a - ((ci0) obj).f1814a;
    }
}
