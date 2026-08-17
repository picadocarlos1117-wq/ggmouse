package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends rl1 {

    /* JADX INFO: renamed from: a */
    public int f5976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ch0 f5977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(ch0 ch0Var, Object obj, InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        this.f5977b = ch0Var;
        this.f5978c = obj;
        interfaceC0579du.getClass();
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f5976a;
        if (i != 0) {
            if (i != 1) {
                f40.m2719o("This coroutine had already completed");
                return null;
            }
            this.f5976a = 2;
            ua0.m6440Z(obj);
            return obj;
        }
        this.f5976a = 1;
        ua0.m6440Z(obj);
        ch0 ch0Var = this.f5977b;
        ch0Var.getClass();
        p32.m5166f(2, ch0Var);
        return ch0Var.invoke(this.f5978c, this);
    }
}
