package p000;

import java.util.List;

/* JADX INFO: renamed from: ey */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0620ey implements xt0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3478a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f3479b;

    public /* synthetic */ C0620ey(C1542w5 c1542w5, List list) {
        this.f3479b = list;
    }

    @Override // p000.xt0
    public final void invoke(Object obj) {
        switch (this.f3478a) {
            case 0:
                ((h21) obj).getClass();
                break;
            default:
                ((ce1) obj).onCues(this.f3479b);
                break;
        }
    }
}
