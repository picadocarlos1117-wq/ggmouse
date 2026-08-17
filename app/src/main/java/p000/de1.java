package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class de1 {

    /* JADX INFO: renamed from: a */
    public final Object f2907a;

    /* JADX INFO: renamed from: b */
    public final int f2908b;

    /* JADX INFO: renamed from: c */
    public final z11 f2909c;

    /* JADX INFO: renamed from: d */
    public final Object f2910d;

    /* JADX INFO: renamed from: e */
    public final int f2911e;

    /* JADX INFO: renamed from: f */
    public final long f2912f;

    /* JADX INFO: renamed from: g */
    public final long f2913g;

    /* JADX INFO: renamed from: h */
    public final int f2914h;

    /* JADX INFO: renamed from: i */
    public final int f2915i;

    static {
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
        z42.m7252z(5);
        z42.m7252z(6);
    }

    public de1(Object obj, int i, z11 z11Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f2907a = obj;
        this.f2908b = i;
        this.f2909c = z11Var;
        this.f2910d = obj2;
        this.f2911e = i2;
        this.f2912f = j;
        this.f2913g = j2;
        this.f2914h = i3;
        this.f2915i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && de1.class == obj.getClass()) {
            de1 de1Var = (de1) obj;
            if (this.f2908b == de1Var.f2908b && this.f2911e == de1Var.f2911e && this.f2912f == de1Var.f2912f && this.f2913g == de1Var.f2913g && this.f2914h == de1Var.f2914h && this.f2915i == de1Var.f2915i && hr1.m3275k(this.f2909c, de1Var.f2909c) && hr1.m3275k(this.f2907a, de1Var.f2907a) && hr1.m3275k(this.f2910d, de1Var.f2910d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2907a, Integer.valueOf(this.f2908b), this.f2909c, this.f2910d, Integer.valueOf(this.f2911e), Long.valueOf(this.f2912f), Long.valueOf(this.f2913g), Integer.valueOf(this.f2914h), Integer.valueOf(this.f2915i)});
    }
}
