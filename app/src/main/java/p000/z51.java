package p000;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class z51 extends FutureTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RunnableC0129cb f13291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(RunnableC0129cb runnableC0129cb, y51 y51Var) {
        super(y51Var);
        this.f13291a = runnableC0129cb;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC0129cb runnableC0129cb = this.f13291a;
        AtomicBoolean atomicBoolean = runnableC0129cb.f1737d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            runnableC0129cb.m1198a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            runnableC0129cb.m1198a(null);
        } catch (ExecutionException e2) {
            l41.m4043l("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            l41.m4043l("An error occurred while executing doInBackground()", th);
        }
    }
}
