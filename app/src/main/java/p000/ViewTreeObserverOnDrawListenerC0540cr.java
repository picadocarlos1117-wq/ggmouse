package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: cr */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0540cr implements InterfaceExecutorC0109br, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b */
    public Runnable f2602b;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractActivityC0613er f2604d;

    /* JADX INFO: renamed from: a */
    public final long f2601a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c */
    public boolean f2603c = false;

    public ViewTreeObserverOnDrawListenerC0540cr(AbstractActivityC0613er abstractActivityC0613er) {
        this.f2604d = abstractActivityC0613er;
    }

    /* JADX INFO: renamed from: a */
    public final void m2117a(View view) {
        if (this.f2603c) {
            return;
        }
        this.f2603c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2602b = runnable;
        View decorView = this.f2604d.getWindow().getDecorView();
        if (!this.f2603c) {
            decorView.postOnAnimation(new RunnableC1430t4(this, 8));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f2602b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2601a) {
                this.f2603c = false;
                this.f2604d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2602b = null;
        lg0 lg0Var = this.f2604d.mFullyDrawnReporter;
        synchronized (lg0Var.f6347a) {
            z = lg0Var.f6348b;
        }
        if (z) {
            this.f2603c = false;
            this.f2604d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2604d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
