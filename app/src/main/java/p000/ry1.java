package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f10158a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue f10159b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10160c = new AtomicReference();

    public ry1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f10158a = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: a */
    public final void m5927a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f10159b;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f10160c;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.f10158a.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public final void m5928b(Runnable runnable) {
        p32.m5188s(runnable, "runnable is null");
        this.f10159b.add(runnable);
    }

    /* JADX INFO: renamed from: c */
    public final qo0 m5929c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        qy1 qy1Var = new qy1(runnable);
        return new qo0(qy1Var, scheduledExecutorService.schedule(new i10(this, qy1Var, runnable, 7), j, timeUnit));
    }

    /* JADX INFO: renamed from: d */
    public final void m5930d() {
        p32.m5193x(Thread.currentThread() == this.f10160c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m5928b(runnable);
        m5927a();
    }
}
