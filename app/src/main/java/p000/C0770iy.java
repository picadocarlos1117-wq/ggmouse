package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: iy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0770iy implements xt0, InterfaceC0578dt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f5195a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5197c;

    public /* synthetic */ C0770iy(C1542w5 c1542w5, int i, long j, long j2) {
        this.f5197c = c1542w5;
        this.f5196b = i;
        this.f5195a = j;
    }

    @Override // p000.InterfaceC0578dt
    public void accept(Object obj) {
        zx1 zx1Var = (zx1) this.f5197c;
        C1122mv c1122mv = (C1122mv) obj;
        ki0.m3866j(zx1Var.f13607h);
        byte[] bArrM1077g = bz1.m1077g(c1122mv.f7103a, c1122mv.f7105c);
        dc1 dc1Var = zx1Var.f13602c;
        dc1Var.getClass();
        dc1Var.m2314D(bArrM1077g.length, bArrM1077g);
        zx1Var.f13600a.mo1115b(dc1Var, bArrM1077g.length, 0);
        long j = c1122mv.f7104b;
        be0 be0Var = zx1Var.f13607h;
        long j2 = this.f5195a;
        if (j == -9223372036854775807L) {
            ki0.m3864h(be0Var.f1346s == Long.MAX_VALUE);
        } else {
            long j3 = be0Var.f1346s;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        zx1Var.f13600a.mo1114a(j2, this.f5196b, bArrM1077g.length, 0, null);
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        C1542w5 c1542w5 = (C1542w5) this.f5197c;
        h21 h21Var = (h21) obj;
        HashMap map = h21Var.f4403g;
        HashMap map2 = h21Var.f4404h;
        q21 q21Var = c1542w5.f11973d;
        if (q21Var != null) {
            String strM2439c = h21Var.f4398b.m2439c(c1542w5.f11971b, q21Var);
            Long l = (Long) map2.get(strM2439c);
            Long l2 = (Long) map.get(strM2439c);
            map2.put(strM2439c, Long.valueOf((l == null ? 0L : l.longValue()) + this.f5195a));
            map.put(strM2439c, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.f5196b)));
        }
    }

    public /* synthetic */ C0770iy(zx1 zx1Var, long j, int i) {
        this.f5197c = zx1Var;
        this.f5195a = j;
        this.f5196b = i;
    }
}
