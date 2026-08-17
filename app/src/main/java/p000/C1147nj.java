package p000;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: renamed from: nj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1147nj implements eh0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7428a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7429b;

    public /* synthetic */ C1147nj(Object obj, int i) {
        this.f7428a = i;
        this.f7429b = obj;
    }

    @Override // p000.eh0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7428a;
        Object obj4 = this.f7429b;
        switch (i) {
            case 0:
                return BufferedChannel.m3934xa189d599((BufferedChannel) obj4, (SelectInstance) obj, obj2, obj3);
            case 1:
                return CancellableContinuationImpl.resume$lambda$13$lambda$12((og0) obj4, (Throwable) obj, obj2, (InterfaceC1456tu) obj3);
            case 2:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) obj4, (SelectInstance) obj, obj2, obj3);
            default:
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) obj4, (Throwable) obj, (z32) obj2, (InterfaceC1456tu) obj3);
        }
    }
}
