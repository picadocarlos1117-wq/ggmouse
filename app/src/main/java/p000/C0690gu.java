package p000;

import android.p001os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: renamed from: gu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690gu extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    public final CancellableContinuationImpl f4321a;

    public C0690gu(CancellableContinuationImpl cancellableContinuationImpl) {
        super(false);
        this.f4321a = cancellableContinuationImpl;
    }

    public final void onError(Throwable th) {
        th.getClass();
        if (compareAndSet(false, true)) {
            this.f4321a.resumeWith(new tl1(th));
        }
    }

    public final void onResult(Object obj) {
        obj.getClass();
        if (compareAndSet(false, true)) {
            this.f4321a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
