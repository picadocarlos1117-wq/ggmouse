package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: qy */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1349qy implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Handler f9605b;

    public /* synthetic */ ExecutorC1349qy(Handler handler, int i) {
        this.f9604a = i;
        this.f9605b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f9604a;
        this.f9605b.post(runnable);
    }
}
