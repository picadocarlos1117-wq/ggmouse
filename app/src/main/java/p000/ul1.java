package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f11356a;

    public /* synthetic */ ul1(Object obj) {
        this.f11356a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ul1 m6507a(Serializable serializable) {
        return new ul1(serializable);
    }

    /* JADX INFO: renamed from: b */
    public static final Throwable m6508b(Object obj) {
        if (obj instanceof tl1) {
            return ((tl1) obj).f10904a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ul1) {
            return hp0.m3214e(this.f11356a, ((ul1) obj).f11356a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11356a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f11356a;
        if (obj instanceof tl1) {
            return ((tl1) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
