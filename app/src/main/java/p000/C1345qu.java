package p000;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;

/* JADX INFO: renamed from: qu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1345qu extends or0 implements og0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0571dl f9580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Deferred f9581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345qu(C0571dl c0571dl, Deferred deferred) {
        super(1);
        this.f9580a = c0571dl;
        this.f9581b = deferred;
    }

    @Override // p000.og0
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C0571dl c0571dl = this.f9580a;
        if (th == null) {
            Object completed = this.f9581b.getCompleted();
            c0571dl.f2962d = true;
            C0644fl c0644fl = c0571dl.f2960b;
            if (c0644fl != null && c0644fl.f3845b.set(completed)) {
                c0571dl.f2959a = null;
                c0571dl.f2960b = null;
                c0571dl.f2961c = null;
            }
        } else if (th instanceof CancellationException) {
            c0571dl.f2962d = true;
            C0644fl c0644fl2 = c0571dl.f2960b;
            if (c0644fl2 != null && c0644fl2.f3845b.cancel(true)) {
                c0571dl.f2959a = null;
                c0571dl.f2960b = null;
                c0571dl.f2961c = null;
            }
        } else {
            c0571dl.f2962d = true;
            C0644fl c0644fl3 = c0571dl.f2960b;
            if (c0644fl3 != null && c0644fl3.f3845b.setException(th)) {
                c0571dl.f2959a = null;
                c0571dl.f2960b = null;
                c0571dl.f2961c = null;
            }
        }
        return z32.f13265a;
    }
}
