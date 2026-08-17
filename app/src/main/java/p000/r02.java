package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r02 {

    /* JADX INFO: renamed from: a */
    public Object f9649a;

    /* JADX INFO: renamed from: b */
    public Object f9650b;

    /* JADX INFO: renamed from: c */
    public int f9651c;

    /* JADX INFO: renamed from: d */
    public long f9652d;

    /* JADX INFO: renamed from: e */
    public long f9653e;

    /* JADX INFO: renamed from: f */
    public boolean f9654f;

    /* JADX INFO: renamed from: g */
    public C1541w4 f9655g = C1541w4.f11961c;

    static {
        AbstractC1308pu.m5349p(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    public final long m5644a(int i, int i2) {
        C1504v4 c1504v4M6701a = this.f9655g.m6701a(i);
        if (c1504v4M6701a.f11504a != -1) {
            return c1504v4M6701a.f11509f[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m5645b(long j) {
        C1504v4 c1504v4M6701a;
        int i;
        C1541w4 c1541w4 = this.f9655g;
        long j2 = this.f9652d;
        int i2 = c1541w4.f11963a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c1541w4.m6701a(i3).getClass();
                c1541w4.m6701a(i3).getClass();
                if (0 > j && ((i = (c1504v4M6701a = c1541w4.m6701a(i3)).f11504a) == -1 || c1504v4M6701a.m6563a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m5646c(long j) {
        C1541w4 c1541w4 = this.f9655g;
        int i = c1541w4.f11963a - 1;
        c1541w4.m6702b(i);
        while (i >= 0 && j != Long.MIN_VALUE) {
            c1541w4.m6701a(i).getClass();
            if (j >= 0) {
                break;
            }
            i--;
        }
        if (i >= 0) {
            C1504v4 c1504v4M6701a = c1541w4.m6701a(i);
            int i2 = c1504v4M6701a.f11504a;
            if (i2 != -1) {
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = c1504v4M6701a.f11508e[i3];
                    if (i4 != 0 && i4 != 1) {
                    }
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m5647d(int i) {
        this.f9655g.m6701a(i).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final int m5648e(int i) {
        return this.f9655g.m6701a(i).m6563a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !r02.class.equals(obj.getClass())) {
            return false;
        }
        r02 r02Var = (r02) obj;
        Object obj2 = this.f9649a;
        Object obj3 = r02Var.f9649a;
        int i = z42.f13274a;
        return Objects.equals(obj2, obj3) && Objects.equals(this.f9650b, r02Var.f9650b) && this.f9651c == r02Var.f9651c && this.f9652d == r02Var.f9652d && this.f9653e == r02Var.f9653e && this.f9654f == r02Var.f9654f && Objects.equals(this.f9655g, r02Var.f9655g);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5649f(int i) {
        C1541w4 c1541w4 = this.f9655g;
        if (i != c1541w4.f11963a - 1) {
            return false;
        }
        c1541w4.m6702b(i);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5650g(int i) {
        this.f9655g.m6701a(i).getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m5651h(Object obj, Object obj2, int i, long j, long j2, C1541w4 c1541w4, boolean z) {
        this.f9649a = obj;
        this.f9650b = obj2;
        this.f9651c = i;
        this.f9652d = j;
        this.f9653e = j2;
        this.f9655g = c1541w4;
        this.f9654f = z;
    }

    public final int hashCode() {
        Object obj = this.f9649a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f9650b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9651c) * 31;
        long j = this.f9652d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f9653e;
        return this.f9655g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f9654f ? 1 : 0)) * 31);
    }
}
