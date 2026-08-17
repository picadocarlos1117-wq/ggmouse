package p000;

/* JADX INFO: renamed from: em */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608em extends ux1 implements Comparable {

    /* JADX INFO: renamed from: t */
    public long f3383t;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0608em c0608em = (C0608em) obj;
        if (m4599i(4) != c0608em.m4599i(4)) {
            return m4599i(4) ? 1 : -1;
        }
        long j = this.f11797p - c0608em.f11797p;
        if (j == 0) {
            j = this.f3383t - c0608em.f3383t;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
