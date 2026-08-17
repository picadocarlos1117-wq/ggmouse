package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: td */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1439td extends AbstractC1517vh {

    /* JADX INFO: renamed from: a */
    public final ArrayList f10842a;

    public C1439td(ArrayList arrayList) {
        this.f10842a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1517vh)) {
            return false;
        }
        return this.f10842a.equals(((C1439td) ((AbstractC1517vh) obj)).f10842a);
    }

    public final int hashCode() {
        return this.f10842a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f10842a + "}";
    }
}
