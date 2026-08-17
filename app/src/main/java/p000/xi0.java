package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 extends C1639ys {

    /* JADX INFO: renamed from: q0 */
    public float f12609q0 = -1.0f;

    /* JADX INFO: renamed from: r0 */
    public int f12610r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public int f12611s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public C1082ls f12612t0 = this.f13067J;

    /* JADX INFO: renamed from: u0 */
    public int f12613u0 = 0;

    /* JADX INFO: renamed from: v0 */
    public boolean f12614v0;

    public xi0() {
        this.f13075R.clear();
        this.f13075R.add(this.f12612t0);
        int length = this.f13074Q.length;
        for (int i = 0; i < length; i++) {
            this.f13074Q[i] = this.f12612t0;
        }
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: A */
    public final boolean mo6773A() {
        return this.f12614v0;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: B */
    public final boolean mo6774B() {
        return this.f12614v0;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: Q */
    public final void mo6930Q(xs0 xs0Var, boolean z) {
        if (this.f13077T == null) {
            return;
        }
        C1082ls c1082ls = this.f12612t0;
        xs0Var.getClass();
        int iM6955n = xs0.m6955n(c1082ls);
        if (this.f12613u0 == 1) {
            this.f13082Y = iM6955n;
            this.f13083Z = 0;
            m7119L(this.f13077T.m7131k());
            m7122O(0);
            return;
        }
        this.f13082Y = 0;
        this.f13083Z = iM6955n;
        m7122O(this.f13077T.m7135q());
        m7119L(0);
    }

    /* JADX INFO: renamed from: R */
    public final void m6931R(int i) {
        this.f12612t0.m4284l(i);
        this.f12614v0 = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m6932S(int i) {
        if (this.f12613u0 == i) {
            return;
        }
        this.f12613u0 = i;
        ArrayList arrayList = this.f13075R;
        arrayList.clear();
        if (this.f12613u0 == 1) {
            this.f12612t0 = this.f13066I;
        } else {
            this.f12612t0 = this.f13067J;
        }
        arrayList.add(this.f12612t0);
        C1082ls[] c1082lsArr = this.f13074Q;
        int length = c1082lsArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c1082lsArr[i2] = this.f12612t0;
        }
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: b */
    public final void mo3424b(xs0 xs0Var, boolean z) {
        C1676zs c1676zs = (C1676zs) this.f13077T;
        if (c1676zs == null) {
            return;
        }
        Object objMo6933i = c1676zs.mo6933i(2);
        Object objMo6933i2 = c1676zs.mo6933i(4);
        C1639ys c1639ys = this.f13077T;
        boolean z2 = c1639ys != null && c1639ys.f13115p0[0] == 2;
        if (this.f12613u0 == 0) {
            objMo6933i = c1676zs.mo6933i(3);
            objMo6933i2 = c1676zs.mo6933i(5);
            C1639ys c1639ys2 = this.f13077T;
            z2 = c1639ys2 != null && c1639ys2.f13115p0[1] == 2;
        }
        if (this.f12614v0) {
            C1082ls c1082ls = this.f12612t0;
            if (c1082ls.f6500c) {
                au1 au1VarM6966k = xs0Var.m6966k(c1082ls);
                xs0Var.m6959d(au1VarM6966k, this.f12612t0.m4276d());
                if (this.f12610r0 != -1) {
                    if (z2) {
                        xs0Var.m6961f(xs0Var.m6966k(objMo6933i2), au1VarM6966k, 0, 5);
                    }
                } else if (this.f12611s0 != -1 && z2) {
                    au1 au1VarM6966k2 = xs0Var.m6966k(objMo6933i2);
                    xs0Var.m6961f(au1VarM6966k, xs0Var.m6966k(objMo6933i), 0, 5);
                    xs0Var.m6961f(au1VarM6966k2, au1VarM6966k, 0, 5);
                }
                this.f12614v0 = false;
                return;
            }
        }
        if (this.f12610r0 != -1) {
            au1 au1VarM6966k3 = xs0Var.m6966k(this.f12612t0);
            xs0Var.m6960e(au1VarM6966k3, xs0Var.m6966k(objMo6933i), this.f12610r0, 8);
            if (z2) {
                xs0Var.m6961f(xs0Var.m6966k(objMo6933i2), au1VarM6966k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f12611s0 != -1) {
            au1 au1VarM6966k4 = xs0Var.m6966k(this.f12612t0);
            au1 au1VarM6966k5 = xs0Var.m6966k(objMo6933i2);
            xs0Var.m6960e(au1VarM6966k4, au1VarM6966k5, -this.f12611s0, 8);
            if (z2) {
                xs0Var.m6961f(au1VarM6966k4, xs0Var.m6966k(objMo6933i), 0, 5);
                xs0Var.m6961f(au1VarM6966k5, au1VarM6966k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f12609q0 != -1.0f) {
            au1 au1VarM6966k6 = xs0Var.m6966k(this.f12612t0);
            au1 au1VarM6966k7 = xs0Var.m6966k(objMo6933i2);
            float f = this.f12609q0;
            C0670ga c0670gaM6967l = xs0Var.m6967l();
            c0670gaM6967l.f4115d.m134g(au1VarM6966k6, -1.0f);
            c0670gaM6967l.f4115d.m134g(au1VarM6966k7, f);
            xs0Var.m6958c(c0670gaM6967l);
        }
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: c */
    public final boolean mo6777c() {
        return true;
    }

    @Override // p000.C1639ys
    /* JADX INFO: renamed from: i */
    public final C1082ls mo6933i(int i) {
        int iM5359z = AbstractC1308pu.m5359z(i);
        if (iM5359z != 1) {
            if (iM5359z != 2) {
                if (iM5359z != 3) {
                    if (iM5359z != 4) {
                        return null;
                    }
                }
            }
            if (this.f12613u0 == 0) {
                return this.f12612t0;
            }
            return null;
        }
        if (this.f12613u0 == 1) {
            return this.f12612t0;
        }
        return null;
    }
}
