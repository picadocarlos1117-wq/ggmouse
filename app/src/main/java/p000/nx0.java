package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 extends o21 {

    /* JADX INFO: renamed from: i */
    public final iu0 f7570i;

    /* JADX INFO: renamed from: j */
    public final vo0 f7571j;

    /* JADX INFO: renamed from: k */
    public final C1374rm f7572k;

    /* JADX INFO: renamed from: l */
    public final C1485um f7573l;

    /* JADX INFO: renamed from: m */
    public List f7574m;

    /* JADX INFO: renamed from: n */
    public gp0 f7575n;

    /* JADX INFO: renamed from: o */
    public boolean f7576o;

    /* JADX INFO: renamed from: p */
    public boolean f7577p;

    /* JADX INFO: renamed from: q */
    public qo0 f7578q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ ox0 f7579r;

    public nx0(ox0 ox0Var, iu0 iu0Var) {
        this.f7579r = ox0Var;
        List list = iu0Var.f5160b;
        this.f7574m = list;
        Logger logger = ox0.f8508l0;
        this.f7570i = iu0Var;
        vo0 vo0Var = new vo0("Subchannel", ox0Var.f8517B.f6543j, vo0.f11728d.incrementAndGet());
        this.f7571j = vo0Var;
        bz1 bz1Var = ox0Var.f8564t;
        C1485um c1485um = new C1485um(vo0Var, bz1Var.m1083f(), "Subchannel for " + list);
        this.f7573l = c1485um;
        this.f7572k = new C1374rm(c1485um, bz1Var);
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: E */
    public final List mo4183E() {
        this.f7579r.f8565u.m5930d();
        p32.m5193x(this.f7576o, "not started");
        return this.f7574m;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: F */
    public final AbstractC1337qm mo4184F() {
        return this.f7572k;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: O */
    public final Object mo4185O() {
        p32.m5193x(this.f7576o, "Subchannel is not started");
        return this.f7575n;
    }

    @Override // p000.o21
    public final C1437tb getAttributes() {
        return this.f7570i.f5161c;
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: q0 */
    public final void mo4186q0() {
        this.f7579r.f8565u.m5930d();
        p32.m5193x(this.f7576o, "not started");
        gp0 gp0Var = this.f7575n;
        if (gp0Var.f4282v != null) {
            return;
        }
        gp0Var.f4271k.execute(new zo0(gp0Var, 1));
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: r0 */
    public final void mo4187r0() {
        qo0 qo0Var;
        ox0 ox0Var = this.f7579r;
        ox0Var.f8565u.m5930d();
        if (this.f7575n == null) {
            this.f7577p = true;
            return;
        }
        if (!this.f7577p) {
            this.f7577p = true;
        } else {
            if (!ox0Var.f8532Q || (qo0Var = this.f7578q) == null) {
                return;
            }
            qo0Var.m5579B();
            this.f7578q = null;
        }
        if (!ox0Var.f8532Q) {
            this.f7578q = ox0Var.f8565u.m5929c(new tv0(new RunnableC1621ya(this, 18)), 5L, TimeUnit.SECONDS, ox0Var.f8558n.f12998a.f9834d);
        } else {
            gp0 gp0Var = this.f7575n;
            gp0Var.f4271k.execute(new ap0(gp0Var, ox0.f8511o0, 0));
        }
    }

    public final String toString() {
        return this.f7571j.toString();
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: u0 */
    public final void mo2366u0(mu0 mu0Var) {
        ox0 ox0Var = this.f7579r;
        ox0Var.f8565u.m5930d();
        p32.m5193x(!this.f7576o, "already started");
        p32.m5193x(!this.f7577p, "already shutdown");
        p32.m5193x(!ox0Var.f8532Q, "Channel is being terminated");
        this.f7576o = true;
        List list = this.f7570i.f5160b;
        String str = ox0Var.f8517B.f6543j;
        bz1 bz1Var = ox0Var.f8516A;
        C1631yk c1631yk = ox0Var.f8558n;
        ScheduledExecutorService scheduledExecutorService = c1631yk.f12998a.f9834d;
        ey1 ey1Var = ox0Var.f8568x;
        ry1 ry1Var = ox0Var.f8565u;
        qo0 qo0Var = new qo0(4, this, mu0Var);
        ro0 ro0Var = ox0Var.f8539X;
        ox0Var.f8535T.getClass();
        gp0 gp0Var = new gp0(list, str, bz1Var, c1631yk, scheduledExecutorService, ey1Var, ry1Var, qo0Var, ro0Var, new C0599ed(1), this.f7573l, this.f7571j, this.f7572k, ox0Var.f8518C);
        ox0Var.f8537V.m6510b(new po0("Child Subchannel started", oo0.f8409a, ox0Var.f8564t.m1083f(), gp0Var));
        this.f7575n = gp0Var;
        ox0Var.f8524I.add(gp0Var);
    }

    @Override // p000.o21
    /* JADX INFO: renamed from: z0 */
    public final void mo4188z0(List list) {
        this.f7579r.f8565u.m5930d();
        this.f7574m = list;
        gp0 gp0Var = this.f7575n;
        gp0Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p32.m5188s(it.next(), "newAddressGroups contains null entry");
        }
        p32.m5177l(!list.isEmpty(), "newAddressGroups is empty");
        gp0Var.f4271k.execute(new RunnableC1466u3(21, gp0Var, Collections.unmodifiableList(new ArrayList(list))));
    }
}
