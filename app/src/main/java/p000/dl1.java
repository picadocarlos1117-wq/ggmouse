package p000;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends Thread {

    /* JADX INFO: renamed from: a */
    public final int f2964a;

    public dl1(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f2964a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2964a);
        super.run();
    }
}
