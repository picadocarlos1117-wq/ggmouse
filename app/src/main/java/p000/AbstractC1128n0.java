package p000;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.logging.Logger;

/* JADX INFO: renamed from: n0 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1128n0 implements InterfaceC1339qo, uv1 {

    /* JADX INFO: renamed from: g */
    public static final Logger f7156g = Logger.getLogger(AbstractC1128n0.class.getName());

    /* JADX INFO: renamed from: a */
    public final C0558d8 f7157a;

    /* JADX INFO: renamed from: b */
    public final gg0 f7158b;

    /* JADX INFO: renamed from: c */
    public final boolean f7159c;

    /* JADX INFO: renamed from: d */
    public final boolean f7160d;

    /* JADX INFO: renamed from: e */
    public j51 f7161e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f7162f;

    public AbstractC1128n0(ax0 ax0Var, kv1 kv1Var, C0558d8 c0558d8, j51 j51Var, C0022al c0022al, boolean z) {
        p32.m5188s(j51Var, "headers");
        p32.m5188s(c0558d8, "transportTracer");
        this.f7157a = c0558d8;
        this.f7159c = !Boolean.TRUE.equals(c0022al.m168a(vi0.f11687n));
        this.f7160d = z;
        if (!z) {
            this.f7158b = new v41(this, ax0Var, kv1Var);
            this.f7161e = j51Var;
            return;
        }
        C1054l0 c1054l0 = new C1054l0();
        c1054l0.f6124e = this;
        p32.m5188s(j51Var, "headers");
        c1054l0.f6121b = j51Var;
        c1054l0.f6122c = kv1Var;
        this.f7158b = c1054l0;
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: a */
    public final void mo1025a(boolean z) {
        this.f7158b.mo2979a(z);
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: b */
    public final boolean mo1026b() {
        return ((v91) this).f11594l.m6419i() && !this.f7162f;
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: c */
    public final void mo1027c(k50 k50Var) {
        this.f7158b.mo2980c(k50Var);
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: d */
    public final void mo1028d(int i) {
        this.f7158b.mo2981d(i);
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: e */
    public final void mo1029e(C1681zx c1681zx) {
        u91 u91Var = ((v91) this).f11594l;
        p32.m5193x(u91Var.f11208j == null, "Already called start");
        p32.m5188s(c1681zx, "decompressorRegistry");
        u91Var.f11209k = c1681zx;
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: f */
    public final void mo1030f(nv1 nv1Var) {
        p32.m5177l(!nv1Var.m4612e(), "Should not cancel with OK status");
        this.f7162f = true;
        pn0 pn0Var = ((v91) this).f11595m;
        pn0Var.getClass();
        jc1.m3599c();
        try {
            synchronized (((v91) pn0Var.f8968a).f11594l.f11220v) {
                ((v91) pn0Var.f8968a).f11594l.m6415d(nv1Var, true, null);
            }
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p000.uv1
    public final void flush() {
        gg0 gg0Var = this.f7158b;
        if (gg0Var.isClosed()) {
            return;
        }
        gg0Var.flush();
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: g */
    public final void mo1031g(zj0 zj0Var) {
        zj0Var.m7315f(((v91) this).f11596n.f10817a.get(rc2.f9889b), "remote_addr");
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: h */
    public final void mo1032h(C1274ox c1274ox) {
        j51 j51Var = this.f7161e;
        d51 d51Var = vi0.f11676c;
        j51Var.m3561a(d51Var);
        this.f7161e.m3566f(d51Var, Long.valueOf(Math.max(0L, c1274ox.m5076b())));
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: i */
    public final void mo1033i(kh1 kh1Var) {
        gg0 gg0Var = this.f7158b;
        try {
            if (!gg0Var.isClosed()) {
                gg0Var.mo2982e(kh1Var);
            }
        } finally {
            vi0.m6630b(kh1Var);
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: j */
    public final void mo1034j() {
        v91 v91Var = (v91) this;
        if (v91Var.f11594l.f11212n) {
            return;
        }
        v91Var.f11594l.f11212n = true;
        this.f7158b.close();
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: k */
    public final void mo1035k(int i) {
        u91 u91Var = ((v91) this).f11594l;
        u91Var.getClass();
        jc1.m3598b();
        RunnableC0120c2 runnableC0120c2 = new RunnableC0120c2(i, 0, u91Var);
        synchronized (u91Var.f11220v) {
            runnableC0120c2.run();
        }
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: l */
    public final void mo1036l(int i) {
        ((v91) this).f11594l.f11199a.f10218b = i;
    }

    @Override // p000.InterfaceC1339qo
    /* JADX INFO: renamed from: m */
    public final void mo1037m(InterfaceC1413so interfaceC1413so) {
        v91 v91Var = (v91) this;
        u91 u91Var = v91Var.f11594l;
        p32.m5193x(u91Var.f11208j == null, "Already called setListener");
        p32.m5188s(interfaceC1413so, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        u91Var.f11208j = interfaceC1413so;
        if (this.f7160d) {
            return;
        }
        v91Var.f11595m.m5293o(this.f7161e, null);
        this.f7161e = null;
    }

    @Override // p000.uv1
    /* JADX INFO: renamed from: n */
    public final void mo1038n() {
        u91 u91Var = ((v91) this).f11594l;
        s41 s41Var = u91Var.f11202d;
        s41Var.f10217a = u91Var;
        u91Var.f11199a = s41Var;
    }

    /* JADX INFO: renamed from: o */
    public final void m4495o(fa1 fa1Var, boolean z, boolean z2, int i) {
        C1073lj c1073lj;
        p32.m5177l(fa1Var != null || z, "null frame before EOS");
        pn0 pn0Var = ((v91) this).f11595m;
        pn0Var.getClass();
        jc1.m3599c();
        try {
            if (fa1Var == null) {
                c1073lj = v91.f11589p;
            } else {
                c1073lj = fa1Var.f3733a;
                int i2 = (int) c1073lj.f6361b;
                if (i2 > 0) {
                    u91 u91Var = ((v91) pn0Var.f8968a).f11594l;
                    synchronized (u91Var.f11200b) {
                        u91Var.f11203e += i2;
                    }
                }
            }
            synchronized (((v91) pn0Var.f8968a).f11594l.f11220v) {
                u91.m6411b(((v91) pn0Var.f8968a).f11594l, c1073lj, z, z2);
                C0558d8 c0558d8 = ((v91) pn0Var.f8968a).f7157a;
                if (i == 0) {
                    c0558d8.getClass();
                } else {
                    c0558d8.getClass();
                    ((bz1) c0558d8.f2821b).m1083f();
                }
            }
            jc1.f5363a.getClass();
        } catch (Throwable th) {
            try {
                jc1.f5363a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
