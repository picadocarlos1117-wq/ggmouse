package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 extends rl1 {

    /* JADX INFO: renamed from: a */
    public int f5125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og0 f5126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(og0 og0Var, InterfaceC0579du interfaceC0579du) {
        super(interfaceC0579du);
        this.f5126b = og0Var;
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f5125a;
        if (i == 0) {
            this.f5125a = 1;
            ua0.m6440Z(obj);
            og0 og0Var = this.f5126b;
            p32.m5166f(1, og0Var);
            return og0Var.invoke(this);
        }
        if (i != 1) {
            f40.m2719o("This coroutine had already completed");
            return null;
        }
        this.f5125a = 2;
        ua0.m6440Z(obj);
        return obj;
    }
}
