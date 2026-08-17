package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a80 implements xt0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f88b;

    public /* synthetic */ a80(boolean z, int i) {
        this.f87a = i;
        this.f88b = z;
    }

    @Override // p000.xt0
    public final void invoke(Object obj) {
        int i = this.f87a;
        boolean z = this.f88b;
        ce1 ce1Var = (ce1) obj;
        switch (i) {
            case 0:
                ce1Var.onShuffleModeEnabledChanged(z);
                break;
            default:
                ce1Var.onSkipSilenceEnabledChanged(z);
                break;
        }
    }
}
