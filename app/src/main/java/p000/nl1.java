package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 {

    /* JADX INFO: renamed from: a */
    public final Resources f7446a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f7447b;

    public nl1(Resources resources, Resources.Theme theme) {
        this.f7446a = resources;
        this.f7447b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nl1.class == obj.getClass()) {
            nl1 nl1Var = (nl1) obj;
            if (this.f7446a.equals(nl1Var.f7446a) && i91.m3395a(this.f7447b, nl1Var.f7447b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return i91.m3396b(this.f7446a, this.f7447b);
    }
}
