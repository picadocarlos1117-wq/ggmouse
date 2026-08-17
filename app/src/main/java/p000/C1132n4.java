package p000;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1132n4 implements ks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f7205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0777j4 f7206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0815k4 f7207c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1356r4 f7208d;

    public C1132n4(AbstractC1356r4 abstractC1356r4, String str, InterfaceC0777j4 interfaceC0777j4, AbstractC0815k4 abstractC0815k4) {
        this.f7208d = abstractC1356r4;
        this.f7205a = str;
        this.f7206b = interfaceC0777j4;
        this.f7207c = abstractC0815k4;
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        boolean zEquals = ds0.ON_START.equals(ds0Var);
        String str = this.f7205a;
        AbstractC1356r4 abstractC1356r4 = this.f7208d;
        if (!zEquals) {
            if (ds0.ON_STOP.equals(ds0Var)) {
                abstractC1356r4.f9713e.remove(str);
                return;
            } else {
                if (ds0.ON_DESTROY.equals(ds0Var)) {
                    abstractC1356r4.m5693f(str);
                    return;
                }
                return;
            }
        }
        HashMap map = abstractC1356r4.f9713e;
        Bundle bundle = abstractC1356r4.f9715g;
        HashMap map2 = abstractC1356r4.f9714f;
        AbstractC0815k4 abstractC0815k4 = this.f7207c;
        InterfaceC0777j4 interfaceC0777j4 = this.f7206b;
        map.put(str, new C1282p4(abstractC0815k4, interfaceC0777j4));
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            interfaceC0777j4.onActivityResult(obj);
        }
        C0738i4 c0738i4 = (C0738i4) bundle.getParcelable(str);
        if (c0738i4 != null) {
            bundle.remove(str);
            interfaceC0777j4.onActivityResult(abstractC0815k4.mo3771c(c0738i4.f4811a, c0738i4.f4812b));
        }
    }
}
