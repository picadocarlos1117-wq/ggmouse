package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t21 implements InterfaceC0578dt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c40 f10705a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ su0 f10706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b21 f10707c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IOException f10708d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f10709e;

    public /* synthetic */ t21(c40 c40Var, su0 su0Var, b21 b21Var, IOException iOException, boolean z) {
        this.f10705a = c40Var;
        this.f10706b = su0Var;
        this.f10707c = b21Var;
        this.f10708d = iOException;
        this.f10709e = z;
    }

    @Override // p000.InterfaceC0578dt
    public final void accept(Object obj) {
        v21 v21Var = (v21) obj;
        c40 c40Var = this.f10705a;
        v21Var.mo67e(c40Var.f1662a, c40Var.f1663b, this.f10706b, this.f10707c, this.f10708d, this.f10709e);
    }
}
