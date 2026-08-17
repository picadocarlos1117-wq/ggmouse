package p000;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ae1 {

    /* JADX INFO: renamed from: a */
    public final eb0 f211a;

    static {
        new SparseBooleanArray();
        ki0.m3864h(!false);
        z42.m7252z(0);
    }

    public ae1(eb0 eb0Var) {
        this.f211a = eb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae1) {
            return this.f211a.equals(((ae1) obj).f211a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f211a.hashCode();
    }
}
