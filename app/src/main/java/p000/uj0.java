package p000;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11314a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11315b;

    public /* synthetic */ uj0(Object obj, int i) {
        this.f11314a = i;
        this.f11315b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.f11314a;
        Object obj = this.f11315b;
        switch (i) {
            case 0:
                HandlerDispatcherKt.postFrameCallback$lambda$6((CancellableContinuation) obj, j);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
