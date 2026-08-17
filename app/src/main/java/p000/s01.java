package p000;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s01 extends ny1 implements ch0 {

    /* JADX INFO: renamed from: a */
    public int f10177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v01 f10178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(v01 v01Var, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.f10178b = v01Var;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        return new s01(this.f10178b, interfaceC0579du);
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        return ((s01) create((CoroutineScope) obj, (InterfaceC0579du) obj2)).invokeSuspend(z32.f13265a);
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        int i = this.f10177a;
        if (i != 0) {
            if (i == 1) {
                ua0.m6440Z(obj);
                return obj;
            }
            f40.m2719o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ua0.m6440Z(obj);
        r01 r01Var = this.f10178b.f11472a;
        this.f10177a = 1;
        Object objM5639b = r01Var.m5639b(this);
        EnumC1530vu enumC1530vu = EnumC1530vu.f11768a;
        return objM5639b == enumC1530vu ? enumC1530vu : objM5639b;
    }
}
