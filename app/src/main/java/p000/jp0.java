package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes3.dex */
public final class jp0 extends AbstractC0616eu {

    /* JADX INFO: renamed from: a */
    public int f5486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og0 f5487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(InterfaceC0579du interfaceC0579du, InterfaceC1456tu interfaceC1456tu, og0 og0Var) {
        super(interfaceC0579du, interfaceC1456tu);
        this.f5487b = og0Var;
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f5486a;
        if (i == 0) {
            this.f5486a = 1;
            ua0.m6440Z(obj);
            og0 og0Var = this.f5487b;
            p32.m5166f(1, og0Var);
            return og0Var.invoke(this);
        }
        if (i != 1) {
            f40.m2719o("This coroutine had already completed");
            return null;
        }
        this.f5486a = 2;
        ua0.m6440Z(obj);
        return obj;
    }
}
