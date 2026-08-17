package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class at1 extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0715hi f1045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at1(C0715hi c0715hi) {
        super("ExoPlayer:SimpleDecoder");
        this.f1045a = c0715hi;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                lv1.m4302n(e);
                return;
            }
        } while (this.f1045a.m3147h());
    }
}
