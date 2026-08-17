package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12630a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uq0 f12631b;

    public xk0(uq0 uq0Var, long j) {
        this.f12631b = uq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12630a;
        uq0 uq0Var = this.f12631b;
        switch (i) {
            case 0:
                uq0Var.getClass();
                break;
            default:
                ((y91) uq0Var.f11388a.f8968a).mo2577b(nv1.f7559n.m4614g("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public xk0(uq0 uq0Var, Throwable th) {
        this.f12631b = uq0Var;
    }
}
