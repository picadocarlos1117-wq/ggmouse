package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r01 {

    /* JADX INFO: renamed from: a */
    public final MeasurementManager f9648a;

    public r01(Context context) {
        Object systemService = context.getSystemService((Class<Object>) AbstractC1449tn.m6295c());
        systemService.getClass();
        this.f9648a = AbstractC1449tn.m6293a(systemService);
    }

    /* JADX INFO: renamed from: a */
    public Object m5638a(v10 v10Var, InterfaceC0579du interfaceC0579du) {
        new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1).initCancellability();
        AbstractC1449tn.m6297e();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public Object m5639b(InterfaceC0579du interfaceC0579du) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1);
        cancellableContinuationImpl.initCancellability();
        this.f9648a.getMeasurementApiStatus(new q01(0), new C0690gu(cancellableContinuationImpl));
        return cancellableContinuationImpl.getResult();
    }

    /* JADX INFO: renamed from: c */
    public Object m5640c(Uri uri, InputEvent inputEvent, InterfaceC0579du interfaceC0579du) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1);
        cancellableContinuationImpl.initCancellability();
        this.f9648a.registerSource(uri, inputEvent, new q01(0), new C0690gu(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == EnumC1530vu.f11768a ? result : z32.f13265a;
    }

    /* JADX INFO: renamed from: d */
    public Object m5641d(Uri uri, InterfaceC0579du interfaceC0579du) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1);
        cancellableContinuationImpl.initCancellability();
        this.f9648a.registerTrigger(uri, new q01(0), new C0690gu(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == EnumC1530vu.f11768a ? result : z32.f13265a;
    }

    /* JADX INFO: renamed from: e */
    public Object m5642e(c92 c92Var, InterfaceC0579du interfaceC0579du) {
        new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1).initCancellability();
        AbstractC1449tn.m6304l();
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public Object m5643f(d92 d92Var, InterfaceC0579du interfaceC0579du) {
        new CancellableContinuationImpl(p32.m5148O(interfaceC0579du), 1).initCancellability();
        AbstractC1449tn.m6305m();
        throw null;
    }
}
