package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 extends de0 {

    /* JADX INFO: renamed from: a */
    public final so0 f3466a;

    /* JADX INFO: renamed from: b */
    public final o21 f3467b;

    /* JADX INFO: renamed from: c */
    public final Executor f3468c;

    /* JADX INFO: renamed from: d */
    public final u51 f3469d;

    /* JADX INFO: renamed from: e */
    public final C1307pt f3470e;

    /* JADX INFO: renamed from: f */
    public C0022al f3471f;

    /* JADX INFO: renamed from: g */
    public AbstractC0610eo f3472g;

    public ex0(so0 so0Var, ix0 ix0Var, Executor executor, u51 u51Var, C0022al c0022al) {
        this.f3466a = so0Var;
        this.f3467b = ix0Var;
        this.f3469d = u51Var;
        Executor executor2 = c0022al.f259b;
        executor = executor2 != null ? executor2 : executor;
        this.f3468c = executor;
        C1668zk c1668zkM167b = C0022al.m167b(c0022al);
        c1668zkM167b.f13440b = executor;
        this.f3471f = new C0022al(c1668zkM167b);
        this.f3470e = C1307pt.m5325b();
    }

    @Override // p000.de0, p000.AbstractC0610eo
    public final void cancel(String str, Throwable th) {
        AbstractC0610eo abstractC0610eo = this.f3472g;
        if (abstractC0610eo != null) {
            abstractC0610eo.cancel(str, th);
        }
    }

    @Override // p000.de0
    public final AbstractC0610eo delegate() {
        return this.f3472g;
    }

    @Override // p000.de0, p000.AbstractC0610eo
    public final void start(AbstractC0143co abstractC0143co, j51 j51Var) {
        C0022al c0022al = this.f3471f;
        u51 u51Var = this.f3469d;
        p32.m5188s(u51Var, FirebaseAnalytics.Param.METHOD);
        p32.m5188s(j51Var, "headers");
        p32.m5188s(c0022al, "callOptions");
        qo0 qo0VarMo6123a = this.f3466a.mo6123a();
        nv1 nv1Var = (nv1) qo0VarMo6123a.f9548b;
        if (!nv1Var.m4612e()) {
            this.f3468c.execute(new l10(this, abstractC0143co, vi0.m6636h(nv1Var)));
            this.f3472g = ox0.f8515s0;
            return;
        }
        wx0 wx0Var = (wx0) qo0VarMo6123a.f9549c;
        ux0 ux0Var = (ux0) wx0Var.f12352b.get(u51Var.f11126b);
        if (ux0Var == null) {
            ux0Var = (ux0) wx0Var.f12353c.get(u51Var.f11127c);
        }
        if (ux0Var == null) {
            ux0Var = wx0Var.f12351a;
        }
        if (ux0Var != null) {
            this.f3471f = this.f3471f.m169c(ux0.f11442g, ux0Var);
        }
        AbstractC0610eo abstractC0610eoMo92Z = this.f3467b.mo92Z(u51Var, this.f3471f);
        this.f3472g = abstractC0610eoMo92Z;
        abstractC0610eoMo92Z.start(abstractC0143co, j51Var);
    }
}
