package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1548wb f3409b;

    public /* synthetic */ ep0(C1548wb c1548wb, int i) {
        this.f3408a = i;
        this.f3409b = c1548wb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3408a) {
            case 0:
                C1548wb c1548wb = this.f3409b;
                gp0 gp0Var = (gp0) c1548wb.f12048d;
                gp0Var.f4274n = null;
                if (gp0Var.f4284x == null) {
                    cp0 cp0Var = gp0Var.f4281u;
                    cp0 cp0Var2 = (cp0) c1548wb.f12047c;
                    if (cp0Var == cp0Var2) {
                        gp0Var.f4282v = cp0Var2;
                        gp0 gp0Var2 = (gp0) this.f3409b.f12048d;
                        gp0Var2.f4281u = null;
                        gp0.m3031a(gp0Var2, EnumC0651fs.f3886b);
                    }
                } else {
                    p32.m5193x(gp0Var.f4282v == null, "Unexpected non-null activeTransport");
                    C1548wb c1548wb2 = this.f3409b;
                    ((cp0) c1548wb2.f12047c).mo2580h(((gp0) c1548wb2.f12048d).f4284x);
                }
                break;
            default:
                C1548wb c1548wb3 = this.f3409b;
                ((gp0) c1548wb3.f12048d).f4279s.remove((cp0) c1548wb3.f12047c);
                if (((gp0) this.f3409b.f12048d).f4283w.f4304a == EnumC0651fs.f3889e && ((gp0) this.f3409b.f12048d).f4279s.isEmpty()) {
                    gp0 gp0Var3 = (gp0) this.f3409b.f12048d;
                    gp0Var3.f4271k.execute(new zo0(gp0Var3, 2));
                    break;
                }
                break;
        }
    }
}
