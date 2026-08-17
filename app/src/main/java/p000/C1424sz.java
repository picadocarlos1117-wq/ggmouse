package p000;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: sz */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1424sz implements ks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10653a;

    /* JADX INFO: renamed from: b */
    public final Object f10654b;

    /* JADX INFO: renamed from: c */
    public final Object f10655c;

    public C1424sz(ls0 ls0Var) {
        this.f10653a = 2;
        this.f10654b = ls0Var;
        C1560wn c1560wn = C1560wn.f12233c;
        Class<?> cls = ls0Var.getClass();
        C1486un c1486un = (C1486un) c1560wn.f12234a.get(cls);
        this.f10655c = c1486un == null ? c1560wn.m6810a(cls, null) : c1486un;
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        int i = this.f10653a;
        Object obj = this.f10654b;
        Object obj2 = this.f10655c;
        switch (i) {
            case 0:
                u50 u50Var = (u50) obj;
                int i2 = AbstractC1387rz.f10161a[ds0Var.ordinal()];
                if (i2 == 3) {
                    AbstractC1675zr.m7335a(Looper.getMainLooper()).postDelayed(new w50(), 500L);
                    u50Var.f11124a.mo2849b(u50Var);
                } else if (i2 == 7) {
                    f40.m2713i("ON_ANY must not been send by anybody");
                }
                ks0 ks0Var = (ks0) obj2;
                if (ks0Var != null) {
                    ks0Var.mo157c(ms0Var, ds0Var);
                }
                break;
            case 1:
                if (ds0Var == ds0.ON_START) {
                    ((fs0) obj).mo2849b(this);
                    ((hp1) obj2).m3236d();
                }
                break;
            default:
                ls0 ls0Var = (ls0) obj;
                HashMap map = ((C1486un) obj2).f11365a;
                C1486un.m6512a((List) map.get(ds0Var), ms0Var, ds0Var, ls0Var);
                C1486un.m6512a((List) map.get(ds0.ON_ANY), ms0Var, ds0Var, ls0Var);
                break;
        }
    }

    public /* synthetic */ C1424sz(int i, Object obj, Object obj2) {
        this.f10653a = i;
        this.f10654b = obj;
        this.f10655c = obj2;
    }
}
