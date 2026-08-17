package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: wr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564wr extends eb1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Comparator[] f12254a;

    public C1564wr(C1667zj c1667zj, C1667zj c1667zj2) {
        this.f12254a = new Comparator[]{c1667zj, c1667zj2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f12254a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1564wr) {
            return Arrays.equals(this.f12254a, ((C1564wr) obj).f12254a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12254a);
    }

    public final String toString() {
        return AbstractC1308pu.m5342i(new StringBuilder("Ordering.compound("), Arrays.toString(this.f12254a), ")");
    }
}
