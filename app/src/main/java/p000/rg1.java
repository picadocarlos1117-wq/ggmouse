package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wg1 f10018b;

    public /* synthetic */ rg1(wg1 wg1Var, int i) {
        this.f10017a = i;
        this.f10018b = wg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10017a;
        wg1 wg1Var = this.f10018b;
        switch (i) {
            case 0:
                wg1Var.f12147N = true;
                break;
            case 1:
                wg1Var.m6785u();
                break;
            default:
                if (!wg1Var.f12153T) {
                    i21 i21Var = wg1Var.f12171w;
                    i21Var.getClass();
                    i21Var.mo3332i(wg1Var);
                }
                break;
        }
    }
}
