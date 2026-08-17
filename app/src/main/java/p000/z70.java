package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z70 implements yt0, xt0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f80 f13300a;

    public /* synthetic */ z70(f80 f80Var) {
        this.f13300a = f80Var;
    }

    @Override // p000.yt0
    /* JADX INFO: renamed from: a */
    public void mo2405a(Object obj, eb0 eb0Var) {
        ((ce1) obj).onEvents(this.f13300a.f3694f, new be1(eb0Var));
    }

    @Override // p000.xt0
    public void invoke(Object obj) {
        ((ce1) obj).onAvailableCommandsChanged(this.f13300a.f3671N);
    }
}
