package p000;

/* JADX INFO: renamed from: as */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0073as {

    /* JADX INFO: renamed from: a */
    public boolean f1039a;

    /* JADX INFO: renamed from: a */
    public synchronized boolean m699a() {
        if (this.f1039a) {
            return false;
        }
        this.f1039a = true;
        notifyAll();
        return true;
    }
}
