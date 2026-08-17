package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cx0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ox0 f2654a;

    public cx0(ox0 ox0Var) {
        this.f2654a = ox0Var;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = ox0.f8508l0;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder("[");
        ox0 ox0Var = this.f2654a;
        sb.append(ox0Var.f8550i);
        sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
        logger.log(level, sb.toString(), th);
        if (ox0Var.f8523H) {
            return;
        }
        ox0Var.f8523H = true;
        ox0Var.m5081L0(true);
        ox0Var.m5085Q0(false);
        bx0 bx0Var = new bx0(th);
        ox0Var.f8522G = bx0Var;
        ox0Var.f8528M.m5103f(bx0Var);
        ox0Var.f8540Y.m4319D0(null);
        ox0Var.f8538W.mo2841G(4, "PANIC! Entering TRANSIENT_FAILURE");
        ox0Var.f8570z.m3482b(EnumC0651fs.f3887c);
    }
}
