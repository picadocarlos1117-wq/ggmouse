package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cc1 {

    /* JADX INFO: renamed from: a */
    public final Object f1757a;

    /* JADX INFO: renamed from: b */
    public final Object f1758b;

    public cc1(CharSequence charSequence, Drawable drawable) {
        this.f1757a = charSequence;
        this.f1758b = drawable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cc1)) {
            return false;
        }
        cc1 cc1Var = (cc1) obj;
        return i91.m3395a(cc1Var.f1757a, this.f1757a) && i91.m3395a(cc1Var.f1758b, this.f1758b);
    }

    public final int hashCode() {
        Object obj = this.f1757a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1758b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f1757a + " " + this.f1758b + "}";
    }
}
