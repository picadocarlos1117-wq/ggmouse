package p000;

/* JADX INFO: renamed from: ml */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1112ml {

    /* JADX INFO: renamed from: a */
    public boolean f7033a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1075ll f7034b;

    /* JADX INFO: renamed from: c */
    public boolean f7035c;

    /* JADX INFO: renamed from: a */
    public final void m4429a(InterfaceC1075ll interfaceC1075ll) {
        synchronized (this) {
            while (this.f7035c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7034b == interfaceC1075ll) {
                return;
            }
            this.f7034b = interfaceC1075ll;
            if (this.f7033a) {
                interfaceC1075ll.onCancel();
            }
        }
    }
}
