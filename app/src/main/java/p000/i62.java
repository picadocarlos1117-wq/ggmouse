package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i62 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1290pc f4841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4842c;

    public /* synthetic */ i62(C1290pc c1290pc, Object obj, int i) {
        this.f4840a = i;
        this.f4841b = c1290pc;
        this.f4842c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4840a) {
            case 0:
                C1290pc c1290pc = this.f4841b;
                m62 m62Var = (m62) this.f4842c;
                c80 c80Var = c1290pc.f8840b;
                int i = z42.f13274a;
                f80 f80Var = c80Var.f1699a;
                f80Var.f3693e0 = m62Var;
                f80Var.f3704l.m714e(25, new C0731hy(m62Var));
                break;
            default:
                C1290pc c1290pc2 = this.f4841b;
                C1422sx c1422sx = (C1422sx) this.f4842c;
                synchronized (c1422sx) {
                }
                c80 c80Var2 = c1290pc2.f8840b;
                int i2 = z42.f13274a;
                C0808jy c0808jy = c80Var2.f1699a.f3710r;
                C1542w5 c1542w5M3720g = c0808jy.m3720g((q21) c0808jy.f5591d.f11145e);
                c0808jy.m3724k(c1542w5M3720g, 1020, new C1521vl(c1542w5M3720g, (Object) c1422sx, 4));
                break;
        }
    }
}
