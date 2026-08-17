package p000;

import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 {

    /* JADX INFO: renamed from: a */
    public final long f11479a;

    /* JADX INFO: renamed from: b */
    public final long f11480b;

    /* JADX INFO: renamed from: c */
    public final long f11481c;

    /* JADX INFO: renamed from: d */
    public final float f11482d;

    /* JADX INFO: renamed from: e */
    public final float f11483e;

    static {
        new u11().m6371a();
        z42.m7252z(0);
        z42.m7252z(1);
        z42.m7252z(2);
        z42.m7252z(3);
        z42.m7252z(4);
    }

    public v11(u11 u11Var) {
        long j = u11Var.f11085a;
        long j2 = u11Var.f11086b;
        long j3 = u11Var.f11087c;
        float f = u11Var.f11088d;
        float f2 = u11Var.f11089e;
        this.f11479a = j;
        this.f11480b = j2;
        this.f11481c = j3;
        this.f11482d = f;
        this.f11483e = f2;
    }

    /* JADX INFO: renamed from: a */
    public final u11 m6551a() {
        u11 u11Var = new u11();
        u11Var.f11085a = this.f11479a;
        u11Var.f11086b = this.f11480b;
        u11Var.f11087c = this.f11481c;
        u11Var.f11088d = this.f11482d;
        u11Var.f11089e = this.f11483e;
        return u11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11)) {
            return false;
        }
        v11 v11Var = (v11) obj;
        return this.f11479a == v11Var.f11479a && this.f11480b == v11Var.f11480b && this.f11481c == v11Var.f11481c && this.f11482d == v11Var.f11482d && this.f11483e == v11Var.f11483e;
    }

    public final int hashCode() {
        long j = this.f11479a;
        long j2 = this.f11480b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f11481c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.f11482d;
        int iFloatToIntBits = (i2 + (f != TouchPipeline.SIZE ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f11483e;
        return iFloatToIntBits + (f2 != TouchPipeline.SIZE ? Float.floatToIntBits(f2) : 0);
    }
}
