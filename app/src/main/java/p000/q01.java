package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q01 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9288a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9288a) {
            case 0:
                runnable.run();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m5386a(Runnable runnable) {
    }
}
