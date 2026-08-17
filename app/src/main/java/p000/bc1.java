package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bc1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f1292a;

    /* JADX INFO: renamed from: b */
    public final Object f1293b;

    public bc1(Object obj, Object obj2) {
        this.f1292a = obj;
        this.f1293b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m966a() {
        return this.f1293b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc1)) {
            return false;
        }
        bc1 bc1Var = (bc1) obj;
        return hp0.m3214e(this.f1292a, bc1Var.f1292a) && hp0.m3214e(this.f1293b, bc1Var.f1293b);
    }

    public final int hashCode() {
        Object obj = this.f1292a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1293b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1292a + ", " + this.f1293b + ')';
    }
}
