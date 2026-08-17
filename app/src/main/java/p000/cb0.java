package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 extends xv1 {

    /* JADX INFO: renamed from: n */
    public db0 f1740n;

    /* JADX INFO: renamed from: o */
    public C0642fj f1741o;

    @Override // p000.xv1
    /* JADX INFO: renamed from: b */
    public final long mo1199b(dc1 dc1Var) {
        byte[] bArr = dc1Var.f2882a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            dc1Var.m2317G(4);
            dc1Var.m2311A();
        }
        int iM5786h0 = rc2.m5786h0(i, dc1Var);
        dc1Var.m2316F(0);
        return iM5786h0;
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: c */
    public final boolean mo1200c(dc1 dc1Var, long j, qo0 qo0Var) {
        byte[] bArr = dc1Var.f2882a;
        db0 db0Var = this.f1740n;
        if (db0Var == null) {
            db0 db0Var2 = new db0(bArr, 17);
            this.f1740n = db0Var2;
            qo0Var.f9548b = db0Var2.m2309c(Arrays.copyOfRange(bArr, 9, dc1Var.f2884c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            C0642fj c0642fj = this.f1741o;
            if (c0642fj != null) {
                c0642fj.f3824a = j;
                qo0Var.f9549c = c0642fj;
            }
            ((be0) qo0Var.f9548b).getClass();
            return false;
        }
        C0558d8 c0558d8M6045O = sc2.m6045O(dc1Var);
        db0 db0Var3 = new db0(db0Var.f2859a, db0Var.f2860b, db0Var.f2861c, db0Var.f2862d, db0Var.f2863e, db0Var.f2865g, db0Var.f2866h, db0Var.f2868j, c0558d8M6045O, db0Var.f2870l);
        this.f1740n = db0Var3;
        C0642fj c0642fj2 = new C0642fj();
        c0642fj2.f3826c = db0Var3;
        c0642fj2.f3827d = c0558d8M6045O;
        c0642fj2.f3824a = -1L;
        c0642fj2.f3825b = -1L;
        this.f1741o = c0642fj2;
        return true;
    }

    @Override // p000.xv1
    /* JADX INFO: renamed from: d */
    public final void mo1201d(boolean z) {
        super.mo1201d(z);
        if (z) {
            this.f1740n = null;
            this.f1741o = null;
        }
    }
}
