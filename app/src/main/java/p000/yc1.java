package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class yc1 {

    /* JADX INFO: renamed from: a */
    public final C0022al f12951a;

    /* JADX INFO: renamed from: b */
    public final j51 f12952b;

    /* JADX INFO: renamed from: c */
    public final u51 f12953c;

    public yc1(u51 u51Var, j51 j51Var, C0022al c0022al) {
        p32.m5188s(u51Var, FirebaseAnalytics.Param.METHOD);
        this.f12953c = u51Var;
        p32.m5188s(j51Var, "headers");
        this.f12952b = j51Var;
        p32.m5188s(c0022al, "callOptions");
        this.f12951a = c0022al;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yc1.class == obj.getClass()) {
            yc1 yc1Var = (yc1) obj;
            if (hr1.m3275k(this.f12951a, yc1Var.f12951a) && hr1.m3275k(this.f12952b, yc1Var.f12952b) && hr1.m3275k(this.f12953c, yc1Var.f12953c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12951a, this.f12952b, this.f12953c});
    }

    public final String toString() {
        return "[method=" + this.f12953c + " headers=" + this.f12952b + " callOptions=" + this.f12951a + "]";
    }
}
