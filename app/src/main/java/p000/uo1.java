package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f11373a;

    public uo1(ExecutorService executorService) {
        this.f11373a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f11373a.execute(new RunnableC1621ya(runnable, 26));
    }
}
