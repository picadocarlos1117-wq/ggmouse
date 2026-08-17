package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 extends o21 {

    /* JADX INFO: renamed from: j */
    public final String f6543j;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ox0 f6545l;

    /* JADX INFO: renamed from: i */
    public final AtomicReference f6542i = new AtomicReference(ox0.f8514r0);

    /* JADX INFO: renamed from: k */
    public final ix0 f6544k = new ix0(this);

    public lx0(ox0 ox0Var, String str) {
        this.f6545l = ox0Var;
        p32.m5188s(str, "authority");
        this.f6543j = str;
    }

    /* JADX INFO: renamed from: C0 */
    public final AbstractC0610eo m4318C0(u51 u51Var, C0022al c0022al) {
        so0 so0Var = (so0) this.f6542i.get();
        ix0 ix0Var = this.f6544k;
        if (so0Var == null) {
            return ix0Var.mo92Z(u51Var, c0022al);
        }
        if (!(so0Var instanceof vx0)) {
            return new ex0(so0Var, ix0Var, this.f6545l.f8560p, u51Var, c0022al);
        }
        wx0 wx0Var = ((vx0) so0Var).f11800b;
        ux0 ux0Var = (ux0) wx0Var.f12352b.get(u51Var.f11126b);
        if (ux0Var == null) {
            ux0Var = (ux0) wx0Var.f12353c.get(u51Var.f11127c);
        }
        if (ux0Var == null) {
            ux0Var = wx0Var.f12351a;
        }
        if (ux0Var != null) {
            c0022al = c0022al.m169c(ux0.f11442g, ux0Var);
        }
        return ix0Var.mo92Z(u51Var, c0022al);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m4319D0(so0 so0Var) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f6542i;
        so0 so0Var2 = (so0) atomicReference.get();
        atomicReference.set(so0Var);
        if (so0Var2 != ox0.f8514r0 || (linkedHashSet = this.f6545l.f8525J) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((kx0) it.next()).m4008d();
        }
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: Z */
    public final AbstractC0610eo mo92Z(u51 u51Var, C0022al c0022al) {
        ox0 ox0Var = this.f6545l;
        ry1 ry1Var = ox0Var.f8565u;
        AtomicReference atomicReference = this.f6542i;
        Object obj = atomicReference.get();
        yw0 yw0Var = ox0.f8514r0;
        if (obj != yw0Var) {
            return m4318C0(u51Var, c0022al);
        }
        ry1Var.execute(new jx0(this, 2));
        if (atomicReference.get() != yw0Var) {
            return m4318C0(u51Var, c0022al);
        }
        if (ox0Var.f8530O.get()) {
            return new k10(2);
        }
        kx0 kx0Var = new kx0(this, C1307pt.m5325b(), u51Var, c0022al);
        ry1Var.execute(new RunnableC1466u3(25, this, kx0Var));
        return kx0Var;
    }
}
