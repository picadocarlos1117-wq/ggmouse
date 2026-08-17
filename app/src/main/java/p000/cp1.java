package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 implements gp1 {

    /* JADX INFO: renamed from: a */
    public final hp1 f2586a;

    /* JADX INFO: renamed from: b */
    public boolean f2587b;

    /* JADX INFO: renamed from: c */
    public Bundle f2588c;

    /* JADX INFO: renamed from: d */
    public final uy1 f2589d;

    public cp1(hp1 hp1Var, w72 w72Var) {
        hp1Var.getClass();
        this.f2586a = hp1Var;
        this.f2589d = new uy1(new ka1(w72Var, 3));
    }

    @Override // p000.gp1
    /* JADX INFO: renamed from: a */
    public final Bundle mo359a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2588c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((dp1) this.f2589d.m6544a()).f2992b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo359a = ((zo1) entry.getValue()).f13511e.mo359a();
            if (!hp0.m3214e(bundleMo359a, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleMo359a);
            }
        }
        this.f2587b = false;
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final void m2111b() {
        if (this.f2587b) {
            return;
        }
        Bundle bundleM3233a = this.f2586a.m3233a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2588c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM3233a != null) {
            bundle.putAll(bundleM3233a);
        }
        this.f2588c = bundle;
        this.f2587b = true;
    }
}
