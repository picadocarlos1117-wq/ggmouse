package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1361r9 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Object f9826a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f9827b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ExecutorC1398s9 f9828c;

    /* JADX INFO: renamed from: d */
    public Runnable f9829d;

    public ExecutorC1361r9(ExecutorC1398s9 executorC1398s9) {
        this.f9828c = executorC1398s9;
    }

    /* JADX INFO: renamed from: a */
    public final void m5745a() {
        synchronized (this.f9826a) {
            try {
                Runnable runnable = (Runnable) this.f9827b.poll();
                this.f9829d = runnable;
                if (runnable != null) {
                    this.f9828c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f9826a) {
            try {
                this.f9827b.add(new RunnableC1467u4(2, this, runnable));
                if (this.f9829d == null) {
                    m5745a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
