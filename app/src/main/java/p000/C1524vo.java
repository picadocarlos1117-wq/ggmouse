package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: vo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1524vo {

    /* JADX INFO: renamed from: a */
    public String f11725a;

    /* JADX INFO: renamed from: b */
    public C1437tb f11726b;

    /* JADX INFO: renamed from: c */
    public zk0 f11727c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1524vo)) {
            return false;
        }
        C1524vo c1524vo = (C1524vo) obj;
        return this.f11725a.equals(c1524vo.f11725a) && this.f11726b.equals(c1524vo.f11726b) && hr1.m3275k(null, null) && hr1.m3275k(this.f11727c, c1524vo.f11727c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11725a, this.f11726b, null, this.f11727c});
    }
}
