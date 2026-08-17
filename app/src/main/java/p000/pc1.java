package p000;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pc1 implements mu0 {

    /* JADX INFO: renamed from: a */
    public C0688gs f8844a = C0688gs.m3052a(EnumC0651fs.f3888d);

    /* JADX INFO: renamed from: b */
    public sc1 f8845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tc1 f8846c;

    public pc1(tc1 tc1Var) {
        this.f8846c = tc1Var;
    }

    @Override // p000.mu0
    /* JADX INFO: renamed from: a */
    public final void mo1228a(C0688gs c0688gs) {
        tc1.f10830u.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0688gs, this.f8845b.f10353a});
        this.f8844a = c0688gs;
        tc1 tc1Var = this.f8846c;
        if (tc1Var.f10833n.m2378c() && ((sc1) tc1Var.f10832m.get(tc1Var.f10833n.m2376a())).f10355c == this) {
            tc1Var.m6267u(this.f8845b);
        }
    }
}
