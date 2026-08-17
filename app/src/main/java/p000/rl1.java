package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl1 extends AbstractC0018ah {
    public rl1(InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        if (interfaceC0579du == null || interfaceC0579du.getContext() == k60.f5681a) {
            return;
        }
        f40.m2713i("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p000.InterfaceC0579du
    public InterfaceC1456tu getContext() {
        return k60.f5681a;
    }
}
