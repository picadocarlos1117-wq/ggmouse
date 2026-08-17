package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 extends hp0 {

    /* JADX INFO: renamed from: s */
    public C0599ed f4357s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ ox0 f4358t;

    public gx0(ox0 ox0Var) {
        this.f4358t = ox0Var;
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: A */
    public final ry1 mo3070A() {
        return this.f4358t.f8565u;
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: K */
    public final void mo3071K() {
        ry1 ry1Var = this.f4358t.f8565u;
        ry1Var.m5930d();
        ry1Var.execute(new RunnableC1621ya(this, 17));
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: T */
    public final void mo2595T(EnumC0651fs enumC0651fs, lu0 lu0Var) {
        ry1 ry1Var = this.f4358t.f8565u;
        ry1Var.m5930d();
        p32.m5188s(enumC0651fs, "newState");
        p32.m5188s(lu0Var, "newPicker");
        ry1Var.execute(new i10(this, lu0Var, enumC0651fs, 3));
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: m */
    public final o21 mo2597m(iu0 iu0Var) {
        ox0 ox0Var = this.f4358t;
        ox0Var.f8565u.m5930d();
        p32.m5193x(!ox0Var.f8532Q, "Channel is being terminated");
        return new nx0(ox0Var, iu0Var);
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: u */
    public final AbstractC1337qm mo3072u() {
        return this.f4358t.f8538W;
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: z */
    public final ScheduledExecutorService mo3073z() {
        return this.f4358t.f8559o;
    }
}
