package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j62 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1290pc f5307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5308b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f5309c;

    public /* synthetic */ j62(C1290pc c1290pc, Object obj, long j) {
        this.f5307a = c1290pc;
        this.f5308b = obj;
        this.f5309c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c80 c80Var = this.f5307a.f8840b;
        int i = z42.f13274a;
        f80 f80Var = c80Var.f1699a;
        C0808jy c0808jy = f80Var.f3710r;
        C1542w5 c1542w5M3723j = c0808jy.m3723j();
        Object obj = this.f5308b;
        c0808jy.m3724k(c1542w5M3723j, 26, new C1521vl(c1542w5M3723j, obj, this.f5309c));
        if (f80Var.f3673P == obj) {
            f80Var.f3704l.m714e(26, new C0694gy(24));
        }
    }
}
