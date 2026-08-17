package p000;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v20 {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f11496a;

    public v20(DisplayCutout displayCutout) {
        this.f11496a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v20.class != obj.getClass()) {
            return false;
        }
        return i91.m3395a(this.f11496a, ((v20) obj).f11496a);
    }

    public final int hashCode() {
        return this.f11496a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f11496a + "}";
    }
}
