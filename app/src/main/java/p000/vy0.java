package p000;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 extends mb2 {

    /* JADX INFO: renamed from: l */
    public final boolean f11857l;

    /* JADX INFO: renamed from: m */
    public final s02 f11858m;

    /* JADX INFO: renamed from: n */
    public final r02 f11859n;

    /* JADX INFO: renamed from: o */
    public ty0 f11860o;

    /* JADX INFO: renamed from: p */
    public sy0 f11861p;

    /* JADX INFO: renamed from: q */
    public boolean f11862q;

    /* JADX INFO: renamed from: r */
    public boolean f11863r;

    /* JADX INFO: renamed from: s */
    public boolean f11864s;

    public vy0(AbstractC0791jh abstractC0791jh, boolean z) {
        super(abstractC0791jh);
        this.f11857l = z && abstractC0791jh.mo3635h();
        this.f11858m = new s02();
        this.f11859n = new r02();
        t02 t02VarMo3633f = abstractC0791jh.mo3633f();
        if (t02VarMo3633f == null) {
            this.f11860o = new ty0(new uy0(abstractC0791jh.mo3634g()), s02.f10179o, ty0.f11035e);
        } else {
            this.f11860o = new ty0(t02VarMo3633f, null, null);
            this.f11864s = true;
        }
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final sy0 mo1020a(q21 q21Var, C0547cy c0547cy, long j) {
        sy0 sy0Var = new sy0(q21Var, c0547cy, j);
        ki0.m3864h(sy0Var.f10649d == null);
        AbstractC0791jh abstractC0791jh = this.f6749k;
        sy0Var.f10649d = abstractC0791jh;
        if (!this.f11863r) {
            this.f11861p = sy0Var;
            if (!this.f11862q) {
                this.f11862q = true;
                m5049w(null, abstractC0791jh);
            }
            return sy0Var;
        }
        Object obj = q21Var.f9309a;
        if (this.f11860o.f11037d != null && obj.equals(ty0.f11035e)) {
            obj = this.f11860o.f11037d;
        }
        sy0Var.m6169k(q21Var.m5437a(obj));
        return sy0Var;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6670B(long j) {
        sy0 sy0Var = this.f11861p;
        int iMo1054b = this.f11860o.mo1054b(sy0Var.f10646a.f9309a);
        if (iMo1054b == -1) {
            return false;
        }
        ty0 ty0Var = this.f11860o;
        r02 r02Var = this.f11859n;
        ty0Var.mo1055f(iMo1054b, r02Var, false);
        long j2 = r02Var.f9652d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        sy0Var.f10652g = j;
        return true;
    }

    @Override // p000.AbstractC0791jh
    /* JADX INFO: renamed from: m */
    public final void mo1022m(j21 j21Var) {
        sy0 sy0Var = (sy0) j21Var;
        if (sy0Var.f10650e != null) {
            AbstractC0791jh abstractC0791jh = sy0Var.f10649d;
            abstractC0791jh.getClass();
            abstractC0791jh.mo1022m(sy0Var.f10650e);
        }
        if (j21Var == this.f11861p) {
            this.f11861p = null;
        }
    }

    @Override // p000.AbstractC1234or, p000.AbstractC0791jh
    /* JADX INFO: renamed from: o */
    public final void mo1023o() {
        this.f11863r = false;
        this.f11862q = false;
        super.mo1023o();
    }

    @Override // p000.mb2, p000.AbstractC0791jh
    /* JADX INFO: renamed from: r */
    public final void mo3642r(z11 z11Var) {
        if (this.f11864s) {
            ty0 ty0Var = this.f11860o;
            this.f11860o = new ty0(new ff1(this.f11860o.f6780b, z11Var), ty0Var.f11036c, ty0Var.f11037d);
        } else {
            this.f11860o = new ty0(new uy0(z11Var), s02.f10179o, ty0.f11035e);
        }
        this.f6749k.mo3642r(z11Var);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: x */
    public final q21 mo4417x(q21 q21Var) {
        Object obj = q21Var.f9309a;
        Object obj2 = this.f11860o.f11037d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = ty0.f11035e;
        }
        return q21Var.m5437a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p000.mb2
    /* JADX INFO: renamed from: y */
    public final void mo1024y(t02 t02Var) {
        long j;
        ty0 ty0Var;
        q21 q21VarM5437a;
        ty0 ty0Var2;
        if (this.f11863r) {
            ty0 ty0Var3 = this.f11860o;
            this.f11860o = new ty0(t02Var, ty0Var3.f11036c, ty0Var3.f11037d);
            sy0 sy0Var = this.f11861p;
            if (sy0Var != null) {
                m6670B(sy0Var.f10652g);
            }
        } else {
            if (!t02Var.m6176p()) {
                s02 s02Var = this.f11858m;
                t02Var.m6175n(0, s02Var);
                long j2 = s02Var.f10190j;
                Object obj = s02Var.f10181a;
                sy0 sy0Var2 = this.f11861p;
                if (sy0Var2 != null) {
                    long j3 = sy0Var2.f10647b;
                    ty0 ty0Var4 = this.f11860o;
                    Object obj2 = sy0Var2.f10646a.f9309a;
                    r02 r02Var = this.f11859n;
                    ty0Var4.mo2973g(obj2, r02Var);
                    long j4 = r02Var.f9653e + j3;
                    this.f11860o.mo1058m(0, s02Var, 0L);
                    if (j4 != s02Var.f10190j) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairM6173i = t02Var.m6173i(this.f11858m, this.f11859n, 0, j);
                Object obj3 = pairM6173i.first;
                long jLongValue = ((Long) pairM6173i.second).longValue();
                if (this.f11864s) {
                    ty0 ty0Var5 = this.f11860o;
                    ty0Var = new ty0(t02Var, ty0Var5.f11036c, ty0Var5.f11037d);
                } else {
                    ty0Var = new ty0(t02Var, obj, obj3);
                }
                this.f11860o = ty0Var;
                sy0 sy0Var3 = this.f11861p;
                if (sy0Var3 != null && m6670B(jLongValue)) {
                    q21 q21Var = sy0Var3.f10646a;
                    Object obj4 = q21Var.f9309a;
                    if (this.f11860o.f11037d != null && obj4.equals(ty0.f11035e)) {
                        obj4 = this.f11860o.f11037d;
                    }
                    q21VarM5437a = q21Var.m5437a(obj4);
                }
                this.f11864s = true;
                this.f11863r = true;
                m3638l(this.f11860o);
                if (q21VarM5437a != null) {
                    sy0 sy0Var4 = this.f11861p;
                    sy0Var4.getClass();
                    sy0Var4.m6169k(q21VarM5437a);
                }
            }
            if (this.f11864s) {
                ty0 ty0Var6 = this.f11860o;
                ty0Var2 = new ty0(t02Var, ty0Var6.f11036c, ty0Var6.f11037d);
            } else {
                ty0Var2 = new ty0(t02Var, s02.f10179o, ty0.f11035e);
            }
            this.f11860o = ty0Var2;
        }
        q21VarM5437a = null;
        this.f11864s = true;
        this.f11863r = true;
        m3638l(this.f11860o);
        if (q21VarM5437a != null) {
            sy0 sy0Var5 = this.f11861p;
            sy0Var5.getClass();
            sy0Var5.m6169k(q21VarM5437a);
        }
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: z */
    public final void mo4418z() {
        if (this.f11857l) {
            return;
        }
        this.f11862q = true;
        m5049w(null, this.f6749k);
    }

    @Override // p000.AbstractC1234or, p000.AbstractC0791jh
    /* JADX INFO: renamed from: i */
    public final void mo1021i() {
    }
}
