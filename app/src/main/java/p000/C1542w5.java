package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: w5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1542w5 {

    /* JADX INFO: renamed from: a */
    public final long f11970a;

    /* JADX INFO: renamed from: b */
    public final t02 f11971b;

    /* JADX INFO: renamed from: c */
    public final int f11972c;

    /* JADX INFO: renamed from: d */
    public final q21 f11973d;

    /* JADX INFO: renamed from: e */
    public final long f11974e;

    /* JADX INFO: renamed from: f */
    public final t02 f11975f;

    /* JADX INFO: renamed from: g */
    public final int f11976g;

    /* JADX INFO: renamed from: h */
    public final q21 f11977h;

    /* JADX INFO: renamed from: i */
    public final long f11978i;

    /* JADX INFO: renamed from: j */
    public final long f11979j;

    public C1542w5(long j, t02 t02Var, int i, q21 q21Var, long j2, t02 t02Var2, int i2, q21 q21Var2, long j3, long j4) {
        this.f11970a = j;
        this.f11971b = t02Var;
        this.f11972c = i;
        this.f11973d = q21Var;
        this.f11974e = j2;
        this.f11975f = t02Var2;
        this.f11976g = i2;
        this.f11977h = q21Var2;
        this.f11978i = j3;
        this.f11979j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1542w5.class != obj.getClass()) {
            return false;
        }
        C1542w5 c1542w5 = (C1542w5) obj;
        return this.f11970a == c1542w5.f11970a && this.f11972c == c1542w5.f11972c && this.f11974e == c1542w5.f11974e && this.f11976g == c1542w5.f11976g && this.f11978i == c1542w5.f11978i && this.f11979j == c1542w5.f11979j && hr1.m3275k(this.f11971b, c1542w5.f11971b) && hr1.m3275k(this.f11973d, c1542w5.f11973d) && hr1.m3275k(this.f11975f, c1542w5.f11975f) && hr1.m3275k(this.f11977h, c1542w5.f11977h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11970a), this.f11971b, Integer.valueOf(this.f11972c), this.f11973d, Long.valueOf(this.f11974e), this.f11975f, Integer.valueOf(this.f11976g), this.f11977h, Long.valueOf(this.f11978i), Long.valueOf(this.f11979j)});
    }
}
