package p000;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 implements ks0, CoroutineScope {

    /* JADX INFO: renamed from: a */
    public final fs0 f4693a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1456tu f4694b;

    public hs0(fs0 fs0Var, InterfaceC1456tu interfaceC1456tu) {
        interfaceC1456tu.getClass();
        this.f4693a = fs0Var;
        this.f4694b = interfaceC1456tu;
        if (((os0) fs0Var).f8452d == es0.f3433a) {
            JobKt__JobKt.cancel$default(interfaceC1456tu, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        fs0 fs0Var = this.f4693a;
        if (((os0) fs0Var).f8452d.compareTo(es0.f3433a) <= 0) {
            fs0Var.mo2849b(this);
            JobKt__JobKt.cancel$default(this.f4694b, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final InterfaceC1456tu getCoroutineContext() {
        return this.f4694b;
    }
}
