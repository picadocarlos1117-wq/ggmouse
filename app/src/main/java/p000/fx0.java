package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3916a = 1;

    /* JADX INFO: renamed from: b */
    public Executor f3917b;

    /* JADX INFO: renamed from: c */
    public final Object f3918c;

    public fx0(pn0 pn0Var) {
        p32.m5188s(pn0Var, "executorPool");
        this.f3918c = pn0Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Executor executor;
        switch (this.f3916a) {
            case 0:
                synchronized (this) {
                    try {
                        if (this.f3917b == null) {
                            Executor executor2 = (Executor) ds1.m2384a((cs1) ((pn0) this.f3918c).f8968a);
                            Executor executor3 = this.f3917b;
                            if (executor2 == null) {
                                throw new NullPointerException(p32.m5153T("%s.getObject()", executor3));
                            }
                            this.f3917b = executor2;
                        }
                        executor = this.f3917b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                executor.execute(runnable);
                return;
            default:
                this.f3917b.execute(runnable);
                return;
        }
    }

    public fx0(ExecutorService executorService, ca0 ca0Var) {
        this.f3917b = executorService;
        this.f3918c = ca0Var;
    }
}
