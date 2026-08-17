package p000;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qj1 {

    /* JADX INFO: renamed from: a */
    public SparseArray f9515a;

    /* JADX INFO: renamed from: b */
    public int f9516b;

    /* JADX INFO: renamed from: c */
    public Set f9517c;

    /* JADX INFO: renamed from: a */
    public final pj1 m5497a(int i) {
        SparseArray sparseArray = this.f9515a;
        pj1 pj1Var = (pj1) sparseArray.get(i);
        if (pj1Var != null) {
            return pj1Var;
        }
        pj1 pj1Var2 = new pj1();
        sparseArray.put(i, pj1Var2);
        return pj1Var2;
    }
}
