package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fv0 {

    /* JADX INFO: renamed from: a */
    public final long f3901a;

    /* JADX INFO: renamed from: b */
    public final float f3902b;

    /* JADX INFO: renamed from: c */
    public final long f3903c;

    public fv0(ev0 ev0Var) {
        this.f3901a = ev0Var.f3444a;
        this.f3902b = ev0Var.f3445b;
        this.f3903c = ev0Var.f3446c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        return this.f3901a == fv0Var.f3901a && this.f3902b == fv0Var.f3902b && this.f3903c == fv0Var.f3903c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3901a), Float.valueOf(this.f3902b), Long.valueOf(this.f3903c)});
    }
}
