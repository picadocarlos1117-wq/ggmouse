package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class tv0 implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final Logger f11021b = Logger.getLogger(tv0.class.getName());

    /* JADX INFO: renamed from: a */
    public final Runnable f11022a;

    public tv0(Runnable runnable) {
        this.f11022a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f11022a;
        try {
            runnable.run();
        } catch (Throwable th) {
            f11021b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Object obj = k02.f5629a;
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            f40.m2711g(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f11022a + ")";
    }
}
