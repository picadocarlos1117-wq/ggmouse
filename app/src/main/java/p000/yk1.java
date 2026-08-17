package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 implements Comparable {

    /* JADX INFO: renamed from: b */
    public long f13008b = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final ArrayList f13007a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f13008b, ((yk1) obj).f13008b);
    }
}
