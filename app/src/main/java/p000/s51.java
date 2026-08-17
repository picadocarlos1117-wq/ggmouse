package p000;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s51 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f10236a;

    /* JADX INFO: renamed from: b */
    public c60 f10237b;

    public s51(int i) {
        this.f10236a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m5979a(c60 c60Var, int i, int i2) {
        int iM1135a = c60Var.m1135a(i);
        SparseArray sparseArray = this.f10236a;
        s51 s51Var = sparseArray == null ? null : (s51) sparseArray.get(iM1135a);
        if (s51Var == null) {
            s51Var = new s51(1);
            sparseArray.put(c60Var.m1135a(i), s51Var);
        }
        if (i2 > i) {
            s51Var.m5979a(c60Var, i + 1, i2);
        } else {
            s51Var.f10237b = c60Var;
        }
    }
}
