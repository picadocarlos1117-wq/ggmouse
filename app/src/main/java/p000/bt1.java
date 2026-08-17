package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bt1 extends t02 {

    /* JADX INFO: renamed from: g */
    public static final Object f1525g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f1526b;

    /* JADX INFO: renamed from: c */
    public final long f1527c;

    /* JADX INFO: renamed from: d */
    public final boolean f1528d;

    /* JADX INFO: renamed from: e */
    public final z11 f1529e;

    /* JADX INFO: renamed from: f */
    public final v11 f1530f;

    static {
        bb0 bb0Var = new bb0();
        om0 om0Var = qm0.f9540b;
        kk1 kk1Var = kk1.f5896e;
        List list = Collections.EMPTY_LIST;
        kk1 kk1Var2 = kk1.f5896e;
        u11 u11Var = new u11();
        x11 x11Var = x11.f12412a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new w11(uri, null, null, list, kk1Var2, -9223372036854775807L);
        }
        bb0Var.m957a();
        u11Var.m6371a();
        d21 d21Var = d21.f2726B;
    }

    public bt1(long j, boolean z, boolean z2, z11 z11Var) {
        v11 v11Var = z2 ? z11Var.f13232c : null;
        this.f1526b = j;
        this.f1527c = j;
        this.f1528d = z;
        z11Var.getClass();
        this.f1529e = z11Var;
        this.f1530f = v11Var;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: b */
    public final int mo1054b(Object obj) {
        return f1525g != obj ? -1 : 0;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: f */
    public final r02 mo1055f(int i, r02 r02Var, boolean z) {
        ki0.m3860e(i, 1);
        Object obj = z ? f1525g : null;
        r02Var.getClass();
        r02Var.m5651h(null, obj, 0, this.f1526b, 0L, C1541w4.f11961c, false);
        return r02Var;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: h */
    public final int mo1056h() {
        return 1;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: l */
    public final Object mo1057l(int i) {
        ki0.m3860e(i, 1);
        return f1525g;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: m */
    public final s02 mo1058m(int i, s02 s02Var, long j) {
        ki0.m3860e(i, 1);
        Object obj = s02.f10179o;
        s02Var.m5933b(this.f1529e, this.f1528d, false, this.f1530f, 0L, this.f1527c);
        return s02Var;
    }

    @Override // p000.t02
    /* JADX INFO: renamed from: o */
    public final int mo1059o() {
        return 1;
    }
}
