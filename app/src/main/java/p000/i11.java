package p000;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i11 {

    /* JADX INFO: renamed from: a */
    public final String f4772a;

    /* JADX INFO: renamed from: b */
    public final boolean f4773b;

    /* JADX INFO: renamed from: c */
    public final boolean f4774c;

    public i11(String str, boolean z, boolean z2) {
        this.f4772a = str;
        this.f4773b = z;
        this.f4774c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == i11.class) {
            i11 i11Var = (i11) obj;
            if (TextUtils.equals(this.f4772a, i11Var.f4772a) && this.f4773b == i11Var.f4773b && this.f4774c == i11Var.f4774c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC1308pu.m5336c(31, 31, this.f4772a) + (this.f4773b ? 1231 : 1237)) * 31) + (this.f4774c ? 1231 : 1237);
    }
}
