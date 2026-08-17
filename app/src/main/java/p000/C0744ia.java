package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0744ia extends ai0 implements InterfaceC0821ka {
    @Override // p000.InterfaceC0821ka
    /* JADX INFO: renamed from: a */
    public final List mo3398a() {
        return Collections.unmodifiableList(((C0783ja) this.instance).mo3398a());
    }

    /* JADX INFO: renamed from: c */
    public final void m3399c(List list) {
        copyOnWrite();
        C0783ja.m3580g((C0783ja) this.instance, list);
    }

    /* JADX INFO: renamed from: d */
    public final void m3400d(e52 e52Var) {
        copyOnWrite();
        C0783ja.m3579f((C0783ja) this.instance, e52Var);
    }

    /* JADX INFO: renamed from: e */
    public final e52 m3401e(int i) {
        return ((C0783ja) this.instance).m3584j(i);
    }

    /* JADX INFO: renamed from: f */
    public final int m3402f() {
        return ((C0783ja) this.instance).m3585k();
    }

    /* JADX INFO: renamed from: g */
    public final void m3403g(int i) {
        copyOnWrite();
        C0783ja.m3581h((C0783ja) this.instance, i);
    }
}
