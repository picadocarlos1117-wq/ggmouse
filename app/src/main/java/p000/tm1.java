package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tm1 extends eb1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final eb1 f10907a;

    public tm1(eb1 eb1Var) {
        this.f10907a = eb1Var;
    }

    @Override // p000.eb1
    /* JADX INFO: renamed from: a */
    public final eb1 mo2565a() {
        return this.f10907a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f10907a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tm1) {
            return this.f10907a.equals(((tm1) obj).f10907a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f10907a.hashCode();
    }

    public final String toString() {
        return this.f10907a + ".reverse()";
    }
}
