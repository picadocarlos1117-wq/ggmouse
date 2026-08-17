package p000;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gs0 extends ny1 implements ch0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hs0 f4307b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(hs0 hs0Var, InterfaceC0579du interfaceC0579du) {
        super(2, interfaceC0579du);
        this.f4307b = hs0Var;
    }

    @Override // p000.AbstractC0018ah
    public final InterfaceC0579du create(Object obj, InterfaceC0579du interfaceC0579du) {
        gs0 gs0Var = new gs0(this.f4307b, interfaceC0579du);
        gs0Var.f4306a = obj;
        return gs0Var;
    }

    @Override // p000.ch0
    public final Object invoke(Object obj, Object obj2) {
        gs0 gs0Var = (gs0) create((CoroutineScope) obj, (InterfaceC0579du) obj2);
        z32 z32Var = z32.f13265a;
        gs0Var.invokeSuspend(z32Var);
        return z32Var;
    }

    @Override // p000.AbstractC0018ah
    public final Object invokeSuspend(Object obj) {
        ua0.m6440Z(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f4306a;
        hs0 hs0Var = this.f4307b;
        fs0 fs0Var = hs0Var.f4693a;
        if (((os0) fs0Var).f8452d.compareTo(es0.f3434b) >= 0) {
            fs0Var.mo2848a(hs0Var);
        } else {
            JobKt__JobKt.cancel$default(coroutineScope.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
        return z32.f13265a;
    }
}
