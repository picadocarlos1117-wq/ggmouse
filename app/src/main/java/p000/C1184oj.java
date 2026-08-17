package p000;

import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: renamed from: oj */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1184oj implements eh0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7820a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7821b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7822c;

    public /* synthetic */ C1184oj(int i, Object obj, Object obj2) {
        this.f7820a = i;
        this.f7822c = obj;
        this.f7821b = obj2;
    }

    @Override // p000.eh0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7820a) {
            case 0:
                return BufferedChannel.bindCancellationFun$lambda$89((og0) this.f7822c, this.f7821b, (Throwable) obj, obj2, (InterfaceC1456tu) obj3);
            default:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0((MutexImpl) this.f7822c, this.f7821b, (Throwable) obj, obj2, (InterfaceC1456tu) obj3);
        }
    }
}
