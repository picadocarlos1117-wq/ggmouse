package p000;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 extends ww0 {

    /* JADX INFO: renamed from: k */
    public static final ReferenceQueue f10152k = new ReferenceQueue();

    /* JADX INFO: renamed from: l */
    public static final ConcurrentHashMap f10153l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m */
    public static final Logger f10154m = Logger.getLogger(rx0.class.getName());

    /* JADX INFO: renamed from: i */
    public final ox0 f10155i;

    /* JADX INFO: renamed from: j */
    public final qx0 f10156j;

    public rx0(ox0 ox0Var) {
        this.f10155i = ox0Var;
        this.f10156j = new qx0(this, ox0Var, f10152k, f10153l);
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: C0 */
    public final boolean mo85C0(long j) {
        return this.f10155i.mo85C0(j);
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: D0 */
    public final void mo86D0() {
        this.f10155i.mo86D0();
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: E0 */
    public final EnumC0651fs mo87E0() {
        return this.f10155i.mo87E0();
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: F0 */
    public final void mo88F0(EnumC0651fs enumC0651fs, ri0 ri0Var) {
        this.f10155i.mo88F0(enumC0651fs, ri0Var);
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: G0 */
    public final ww0 mo89G0() {
        qx0 qx0Var = this.f10156j;
        if (!qx0Var.f9603e.getAndSet(true)) {
            qx0Var.clear();
        }
        ox0 ox0Var = this.f10155i;
        ox0Var.m5084P0();
        return ox0Var;
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: H0 */
    public final ww0 mo90H0() {
        qx0 qx0Var = this.f10156j;
        if (!qx0Var.f9603e.getAndSet(true)) {
            qx0Var.clear();
        }
        ox0 ox0Var = this.f10155i;
        ox0Var.mo90H0();
        return ox0Var;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: Z */
    public final AbstractC0610eo mo92Z(u51 u51Var, C0022al c0022al) {
        return this.f10155i.f8517B.mo92Z(u51Var, c0022al);
    }

    public final String toString() {
        C1679zv c1679zvM5176k0 = p32.m5176k0(this);
        c1679zvM5176k0.m7359a(this.f10155i, "delegate");
        return c1679zvM5176k0.toString();
    }
}
