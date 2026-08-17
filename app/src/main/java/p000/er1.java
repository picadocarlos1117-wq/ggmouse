package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class er1 implements Executor, Runnable {

    /* JADX INFO: renamed from: d */
    public static final Logger f3423d = Logger.getLogger(er1.class.getName());

    /* JADX INFO: renamed from: e */
    public static final p32 f3424e;

    /* JADX INFO: renamed from: a */
    public final Executor f3425a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue f3426b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    public volatile int f3427c = 0;

    static {
        p32 dr1Var;
        try {
            dr1Var = new cr1(AtomicIntegerFieldUpdater.newUpdater(er1.class, "c"));
        } catch (Throwable th) {
            f3423d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            dr1Var = new dr1();
        }
        f3424e = dr1Var;
    }

    public er1(Executor executor) {
        p32.m5188s(executor, "'executor' must not be null.");
        this.f3425a = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m2639a(Runnable runnable) {
        p32 p32Var = f3424e;
        if (p32Var.mo2118d0(this)) {
            try {
                this.f3425a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f3426b.remove(runnable);
                }
                p32Var.mo2119e0(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p32.m5188s(runnable, "'r' must not be null.");
        this.f3426b.add(runnable);
        m2639a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        p32 p32Var = f3424e;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f3426b;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    f3423d.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            } catch (Throwable th) {
                p32Var.mo2119e0(this);
                throw th;
            }
        }
        p32Var.mo2119e0(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        m2639a(null);
    }
}
