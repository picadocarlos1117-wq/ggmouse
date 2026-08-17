package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vc2 extends qd2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11631g;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f11632m;

    public /* synthetic */ vc2(Object obj, int i) {
        this.f11631g = i;
        this.f11632m = obj;
    }

    @Override // p000.qd2
    /* JADX INFO: renamed from: b */
    public final void mo1743b() {
        switch (this.f11631g) {
            case 0:
                xc2 xc2Var = ((wc2) this.f11632m).f12065a;
                xc2Var.f12563b.m5254b("unlinkToDeath", new Object[0]);
                xc2Var.f12575n.asBinder().unlinkToDeath(xc2Var.f12572k, 0);
                xc2Var.f12575n = null;
                xc2Var.f12568g = false;
                return;
            default:
                synchronized (((xc2) this.f11632m).f12567f) {
                    try {
                        if (((xc2) this.f11632m).f12573l.get() > 0 && ((xc2) this.f11632m).f12573l.decrementAndGet() > 0) {
                            ((xc2) this.f11632m).f12563b.m5254b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        xc2 xc2Var2 = (xc2) this.f11632m;
                        if (xc2Var2.f12575n != null) {
                            xc2Var2.f12563b.m5254b("Unbind from service.", new Object[0]);
                            xc2 xc2Var3 = (xc2) this.f11632m;
                            xc2Var3.f12562a.unbindService(xc2Var3.f12574m);
                            xc2 xc2Var4 = (xc2) this.f11632m;
                            xc2Var4.f12568g = false;
                            xc2Var4.f12575n = null;
                            xc2Var4.f12574m = null;
                        }
                        ((xc2) this.f11632m).m6916e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
