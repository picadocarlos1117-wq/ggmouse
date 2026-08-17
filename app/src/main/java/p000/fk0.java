package p000;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 {

    /* JADX INFO: renamed from: a */
    public final int f3840a;

    /* JADX INFO: renamed from: b */
    public final long f3841b;

    /* JADX INFO: renamed from: c */
    public final tm0 f3842c;

    public fk0(int i, long j, Set set) {
        this.f3840a = i;
        this.f3841b = j;
        this.f3842c = tm0.m6292n(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fk0.class != obj.getClass()) {
            return false;
        }
        fk0 fk0Var = (fk0) obj;
        return this.f3840a == fk0Var.f3840a && this.f3841b == fk0Var.f3841b && hr1.m3275k(this.f3842c, fk0Var.f3842c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3840a), Long.valueOf(this.f3841b), this.f3842c});
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7362d("maxAttempts", String.valueOf(this.f3840a));
        c1679zvM5176k0.m7360b("hedgingDelayNanos", this.f3841b);
        c1679zvM5176k0.m7359a(this.f3842c, "nonFatalStatusCodes");
        return c1679zvM5176k0.toString();
    }
}
