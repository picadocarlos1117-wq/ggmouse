package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qo0 f7043b;

    public /* synthetic */ mm1(qo0 qo0Var, int i) {
        this.f7042a = i;
        this.f7043b = qo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7042a;
        qo0 qo0Var = this.f7043b;
        switch (i) {
            case 0:
                dx0 dx0Var = (dx0) qo0Var.f9549c;
                dx0Var.f3071z = true;
                InterfaceC1413so interfaceC1413so = dx0Var.f3066u;
                C1174o9 c1174o9 = dx0Var.f3064s;
                interfaceC1413so.mo4775x((nv1) c1174o9.f7699b, (EnumC1376ro) c1174o9.f7700c, (j51) c1174o9.f7701d);
                break;
            default:
                dx0 dx0Var2 = (dx0) qo0Var.f9549c;
                if (!dx0Var2.f3071z) {
                    dx0Var2.f3066u.mo4768p();
                }
                break;
        }
    }
}
