package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class qy1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Runnable f9606a;

    /* JADX INFO: renamed from: b */
    public boolean f9607b;

    /* JADX INFO: renamed from: c */
    public boolean f9608c;

    public qy1(Runnable runnable) {
        this.f9606a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9607b) {
            return;
        }
        this.f9608c = true;
        this.f9606a.run();
    }
}
