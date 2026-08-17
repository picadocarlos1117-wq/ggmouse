package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0129cb implements Runnable {

    /* JADX INFO: renamed from: g */
    public static Handler f1733g;

    /* JADX INFO: renamed from: e */
    public boolean f1738e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0561db f1739f;

    /* JADX INFO: renamed from: b */
    public volatile int f1735b = 1;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f1736c = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f1737d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final z51 f1734a = new z51(this, new y51(this));

    public RunnableC0129cb(AbstractC0561db abstractC0561db) {
        this.f1739f = abstractC0561db;
    }

    /* JADX INFO: renamed from: a */
    public final void m1198a(Object obj) {
        Handler handler;
        synchronized (RunnableC0129cb.class) {
            try {
                if (f1733g == null) {
                    f1733g = new Handler(Looper.getMainLooper());
                }
                handler = f1733g;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new RunnableC1466u3(27, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1738e = false;
        this.f1739f.executePendingTask();
    }
}
