package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f3306a;

    public eb0(SparseBooleanArray sparseBooleanArray) {
        this.f3306a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m2564a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f3306a;
        ki0.m3860e(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb0)) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        SparseBooleanArray sparseBooleanArray = eb0Var.f3306a;
        int i = z42.f13274a;
        SparseBooleanArray sparseBooleanArray2 = this.f3306a;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            if (m2564a(i2) != eb0Var.m2564a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = z42.f13274a;
        SparseBooleanArray sparseBooleanArray = this.f3306a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + m2564a(i2);
        }
        return size;
    }
}
