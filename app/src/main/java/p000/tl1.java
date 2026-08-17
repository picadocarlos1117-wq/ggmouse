package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f10904a;

    public tl1(Throwable th) {
        th.getClass();
        this.f10904a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tl1) {
            return hp0.m3214e(this.f10904a, ((tl1) obj).f10904a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10904a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10904a + ')';
    }
}
