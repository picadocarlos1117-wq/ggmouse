package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class lp0 extends AbstractC0616eu {

    /* JADX INFO: renamed from: a */
    public int f6482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ch0 f6483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(InterfaceC0579du interfaceC0579du, InterfaceC1456tu interfaceC1456tu, ch0 ch0Var, Object obj) {
        super(interfaceC0579du, interfaceC1456tu);
        this.f6483b = ch0Var;
        this.f6484c = obj;
        interfaceC0579du.getClass();
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f6482a;
        if (i != 0) {
            if (i != 1) {
                f40.m2719o("This coroutine had already completed");
                return null;
            }
            this.f6482a = 2;
            ua0.m6440Z(obj);
            return obj;
        }
        this.f6482a = 1;
        ua0.m6440Z(obj);
        ch0 ch0Var = this.f6483b;
        ch0Var.getClass();
        p32.m5166f(2, ch0Var);
        return ch0Var.invoke(this.f6484c, this);
    }
}
