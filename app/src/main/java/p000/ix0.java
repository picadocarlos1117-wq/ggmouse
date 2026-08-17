package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ix0 extends o21 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ lx0 f5194i;

    public ix0(lx0 lx0Var) {
        this.f5194i = lx0Var;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: Z */
    public final AbstractC0610eo mo92Z(u51 u51Var, C0022al c0022al) {
        ox0 ox0Var = this.f5194i.f6545l;
        Logger logger = ox0.f8508l0;
        Executor executor = c0022al.f259b;
        if (executor == null) {
            executor = ox0Var.f8560p;
        }
        C0798jo c0798jo = new C0798jo(u51Var, executor, c0022al, ox0Var.f8551i0, ox0Var.f8533R ? null : this.f5194i.f6545l.f8558n.f12998a.f9834d, this.f5194i.f6545l.f8536U);
        c0798jo.f5479o = this.f5194i.f6545l.f8566v;
        return c0798jo;
    }
}
