package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class br1 implements Executor {

    /* JADX INFO: renamed from: c */
    public static final Logger f1510c = Logger.getLogger(br1.class.getName());

    /* JADX INFO: renamed from: a */
    public boolean f1511a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f1512b;

    /* JADX INFO: renamed from: a */
    public final void m1043a() {
        while (true) {
            Runnable runnable = (Runnable) this.f1512b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f1510c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p32.m5188s(runnable, "'task' must not be null.");
        if (this.f1511a) {
            if (this.f1512b == null) {
                this.f1512b = new ArrayDeque(4);
            }
            this.f1512b.add(runnable);
            return;
        }
        this.f1511a = true;
        try {
            runnable.run();
            if (this.f1512b != null) {
                m1043a();
            }
            this.f1511a = false;
        } catch (Throwable th) {
            try {
                f1510c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f1512b != null) {
                    m1043a();
                }
                this.f1511a = false;
            }
        }
    }
}
