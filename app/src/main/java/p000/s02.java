package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s02 {

    /* JADX INFO: renamed from: o */
    public static final Object f10179o = new Object();

    /* JADX INFO: renamed from: p */
    public static final z11 f10180p;

    /* JADX INFO: renamed from: a */
    public Object f10181a = f10179o;

    /* JADX INFO: renamed from: b */
    public z11 f10182b = f10180p;

    /* JADX INFO: renamed from: c */
    public long f10183c;

    /* JADX INFO: renamed from: d */
    public long f10184d;

    /* JADX INFO: renamed from: e */
    public long f10185e;

    /* JADX INFO: renamed from: f */
    public boolean f10186f;

    /* JADX INFO: renamed from: g */
    public boolean f10187g;

    /* JADX INFO: renamed from: h */
    public v11 f10188h;

    /* JADX INFO: renamed from: i */
    public boolean f10189i;

    /* JADX INFO: renamed from: j */
    public long f10190j;

    /* JADX INFO: renamed from: k */
    public long f10191k;

    /* JADX INFO: renamed from: l */
    public int f10192l;

    /* JADX INFO: renamed from: m */
    public int f10193m;

    /* JADX INFO: renamed from: n */
    public long f10194n;

    static {
        bb0 bb0Var = new bb0();
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        List list = Collections.EMPTY_LIST;
        kk1 kk1Var2 = kk1.f5896e;
        u11 u11Var = new u11();
        x11 x11Var = x11.f12412a;
        Uri uri = Uri.EMPTY;
        f10180p = new z11("androidx.media3.common.Timeline", new t11(bb0Var), uri != null ? new w11(uri, null, null, list, kk1Var2, -9223372036854775807L) : null, new v11(u11Var), d21.f2726B, x11Var);
        AbstractC1308pu.m5349p(1, 2, 3, 4, 5);
        AbstractC1308pu.m5349p(6, 7, 8, 9, 10);
        z42.m7252z(11);
        z42.m7252z(12);
        z42.m7252z(13);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5932a() {
        return this.f10188h != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m5933b(z11 z11Var, boolean z, boolean z2, v11 v11Var, long j, long j2) {
        this.f10181a = f10179o;
        this.f10182b = z11Var != null ? z11Var : f10180p;
        if (z11Var != null) {
            w11 w11Var = z11Var.f13231b;
        }
        this.f10183c = -9223372036854775807L;
        this.f10184d = -9223372036854775807L;
        this.f10185e = -9223372036854775807L;
        this.f10186f = z;
        this.f10187g = z2;
        this.f10188h = v11Var;
        this.f10190j = j;
        this.f10191k = j2;
        this.f10192l = 0;
        this.f10193m = 0;
        this.f10194n = 0L;
        this.f10189i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !s02.class.equals(obj.getClass())) {
            return false;
        }
        s02 s02Var = (s02) obj;
        return Objects.equals(this.f10181a, s02Var.f10181a) && Objects.equals(this.f10182b, s02Var.f10182b) && Objects.equals(this.f10188h, s02Var.f10188h) && this.f10183c == s02Var.f10183c && this.f10184d == s02Var.f10184d && this.f10185e == s02Var.f10185e && this.f10186f == s02Var.f10186f && this.f10187g == s02Var.f10187g && this.f10189i == s02Var.f10189i && this.f10190j == s02Var.f10190j && this.f10191k == s02Var.f10191k && this.f10192l == s02Var.f10192l && this.f10193m == s02Var.f10193m && this.f10194n == s02Var.f10194n;
    }

    public final int hashCode() {
        int iHashCode = (this.f10182b.hashCode() + ((this.f10181a.hashCode() + 217) * 31)) * 961;
        v11 v11Var = this.f10188h;
        int iHashCode2 = v11Var == null ? 0 : v11Var.hashCode();
        long j = this.f10183c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f10184d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f10185e;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f10186f ? 1 : 0)) * 31) + (this.f10187g ? 1 : 0)) * 31) + (this.f10189i ? 1 : 0)) * 31;
        long j4 = this.f10190j;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f10191k;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f10192l) * 31) + this.f10193m) * 31;
        long j6 = this.f10194n;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
