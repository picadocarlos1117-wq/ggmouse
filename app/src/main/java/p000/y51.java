package p000;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RunnableC0129cb f12847a;

    public y51(RunnableC0129cb runnableC0129cb) {
        this.f12847a = runnableC0129cb;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        RunnableC0129cb runnableC0129cb = this.f12847a;
        runnableC0129cb.f1737d.set(true);
        Object objOnLoadInBackground = null;
        try {
            Process.setThreadPriority(10);
            objOnLoadInBackground = runnableC0129cb.f1739f.onLoadInBackground();
            Binder.flushPendingCommands();
            runnableC0129cb.m1198a(objOnLoadInBackground);
            return objOnLoadInBackground;
        } catch (Throwable th) {
            try {
                runnableC0129cb.f1736c.set(true);
                throw th;
            } catch (Throwable th2) {
                runnableC0129cb.m1198a(objOnLoadInBackground);
                throw th2;
            }
        }
    }
}
