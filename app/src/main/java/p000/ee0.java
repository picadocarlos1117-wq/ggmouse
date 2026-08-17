package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ee0 implements InterfaceC0541cs {
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0541cs mo2109a();

    @Override // p000.yx0
    /* JADX INFO: renamed from: b */
    public void mo2577b(nv1 nv1Var) {
        mo2109a().mo2577b(nv1Var);
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: c */
    public final Runnable mo2578c(xx0 xx0Var) {
        return mo2109a().mo2578c(xx0Var);
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: g */
    public final vo0 mo2579g() {
        return mo2109a().mo2579g();
    }

    @Override // p000.InterfaceC0541cs
    public final C1437tb getAttributes() {
        return mo2109a().getAttributes();
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: h */
    public void mo2580h(nv1 nv1Var) {
        mo2109a().mo2580h(nv1Var);
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(mo2109a(), "delegate");
        return c1679zvM5176k0.toString();
    }
}
