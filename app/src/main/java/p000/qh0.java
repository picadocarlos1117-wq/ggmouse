package p000;

import java.util.function.BiFunction;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh0 implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ch0 f9511b;

    public /* synthetic */ qh0(ch0 ch0Var, int i) {
        this.f9510a = i;
        this.f9511b = ch0Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f9510a;
        ch0 ch0Var = this.f9511b;
        switch (i) {
            case 0:
                return ((kc0) ch0Var).invoke(obj, (Throwable) obj2);
            default:
                return FutureKt.setupCancellation$lambda$3(ch0Var, obj, (Throwable) obj2);
        }
    }
}
