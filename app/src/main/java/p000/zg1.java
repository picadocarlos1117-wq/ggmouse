package p000;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 extends AbstractC0791jh {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0769ix f13404h;

    /* JADX INFO: renamed from: i */
    public final C1521vl f13405i;

    /* JADX INFO: renamed from: j */
    public final g40 f13406j;

    /* JADX INFO: renamed from: k */
    public final bz1 f13407k;

    /* JADX INFO: renamed from: l */
    public final int f13408l;

    /* JADX INFO: renamed from: m */
    public final boolean f13409m;

    /* JADX INFO: renamed from: n */
    public boolean f13410n = true;

    /* JADX INFO: renamed from: o */
    public long f13411o = -9223372036854775807L;

    /* JADX INFO: renamed from: p */
    public boolean f13412p;

    /* JADX INFO: renamed from: q */
    public boolean f13413q;

    /* JADX INFO: renamed from: r */
    public C1534vy f13414r;

    /* JADX INFO: renamed from: s */
    public z11 f13415s;

    public zg1(z11 z11Var, InterfaceC0769ix interfaceC0769ix, C1521vl c1521vl, g40 g40Var, bz1 bz1Var, int i, boolean z) {
        this.f13415s = z11Var;
        this.f13404h = interfaceC0769ix;
        this.f13405i = c1521vl;
        this.f13406j = g40Var;
        this.f13407k = bz1Var;
        this.f13408l = i;
        this.f13409m = z;
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: a */
    public final j21 mo1020a(q21 q21Var, C0547cy c0547cy, long j) {
        InterfaceC0807jx interfaceC0807jxMo2265f = this.f13404h.mo2265f();
        C1534vy c1534vy = this.f13414r;
        if (c1534vy != null) {
            interfaceC0807jxMo2265f.mo991p(c1534vy);
        }
        w11 w11Var = mo3634g().f13231b;
        w11Var.getClass();
        Uri uri = w11Var.f11899a;
        ki0.m3866j(this.f5388g);
        return new wg1(uri, interfaceC0807jxMo2265f, new C1174o9((a90) this.f13405i.f11701b, 4), this.f13406j, new c40(this.f5385d.f1664c, 0, q21Var), this.f13407k, new c40(this.f5384c.f1664c, 0, q21Var), this, c0547cy, this.f13408l, this.f13409m, z42.m7216D(w11Var.f11903e), null);
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: g */
    public final synchronized z11 mo3634g() {
        return this.f13415s;
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: k */
    public final void mo3637k(C1534vy c1534vy) {
        this.f13414r = c1534vy;
        Looper.myLooper().getClass();
        ki0.m3866j(this.f5388g);
        this.f13406j.getClass();
        m7307s();
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: m */
    public final void mo1022m(j21 j21Var) {
        wg1 wg1Var = (wg1) j21Var;
        if (wg1Var.f12135B) {
            for (xo1 xo1Var : wg1Var.f12173y) {
                xo1Var.m6938f();
                ay0 ay0Var = xo1Var.f12668h;
                if (ay0Var != null) {
                    ay0Var.m763B(xo1Var.f12665e);
                    xo1Var.f12668h = null;
                    xo1Var.f12667g = null;
                }
            }
        }
        C1174o9 c1174o9 = wg1Var.f12165q;
        fx0 fx0Var = (fx0) c1174o9.f7699b;
        uu0 uu0Var = (uu0) c1174o9.f7700c;
        if (uu0Var != null) {
            uu0Var.m6541a(true);
        }
        fx0Var.execute(new RunnableC1621ya(wg1Var, 15));
        ((ca0) fx0Var.f3918c).accept(fx0Var.f3917b);
        wg1Var.f12170v.removeCallbacksAndMessages(null);
        wg1Var.f12171w = null;
        wg1Var.f12153T = true;
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: o */
    public final void mo1023o() {
        this.f13406j.getClass();
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: r */
    public final synchronized void mo3642r(z11 z11Var) {
        this.f13415s = z11Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m7307s() {
        t02 bt1Var = new bt1(this.f13411o, this.f13412p, this.f13413q, mo3634g());
        if (this.f13410n) {
            bt1Var = new xg1(bt1Var);
        }
        m3638l(bt1Var);
    }

    /* JADX INFO: renamed from: t */
    public final void m7308t(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f13411o;
        }
        if (!this.f13410n && this.f13411o == j && this.f13412p == z && this.f13413q == z2) {
            return;
        }
        this.f13411o = j;
        this.f13412p = z;
        this.f13413q = z2;
        this.f13410n = false;
        m7307s();
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: i */
    public final void mo1021i() {
    }
}
