package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: nq */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1154nq extends eb1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final C1473ua f7506a;

    public C1154nq(C1473ua c1473ua) {
        this.f7506a = c1473ua;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f7506a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1154nq) && this.f7506a == ((C1154nq) obj).f7506a;
    }

    public final int hashCode() {
        return this.f7506a.hashCode();
    }

    public final String toString() {
        return this.f7506a.toString();
    }
}
