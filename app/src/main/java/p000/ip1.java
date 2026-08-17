package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ip1 {

    /* JADX INFO: renamed from: a */
    public final jp1 f5127a;

    /* JADX INFO: renamed from: b */
    public final hp1 f5128b = new hp1();

    /* JADX INFO: renamed from: c */
    public boolean f5129c;

    public ip1(jp1 jp1Var) {
        this.f5127a = jp1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3471a() {
        jp1 jp1Var = this.f5127a;
        fs0 lifecycle = jp1Var.getLifecycle();
        if (((os0) lifecycle).f8452d != es0.f3434b) {
            f40.m2719o("Restarter must be created only during owner's initialization stage");
            return;
        }
        lifecycle.mo2848a(new aj1(jp1Var, 0));
        final hp1 hp1Var = this.f5128b;
        if (hp1Var.f4656b) {
            f40.m2719o("SavedStateRegistry was already attached.");
            return;
        }
        lifecycle.mo2848a(new ks0() { // from class: ep1
            @Override // p000.ks0
            /* JADX INFO: renamed from: c */
            public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
                hp1 hp1Var2 = hp1Var;
                hp1Var2.getClass();
                if (ds0Var == ds0.ON_START) {
                    hp1Var2.f4660f = true;
                } else if (ds0Var == ds0.ON_STOP) {
                    hp1Var2.f4660f = false;
                }
            }
        });
        hp1Var.f4656b = true;
        this.f5129c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m3472b(Bundle bundle) {
        if (!this.f5129c) {
            m3471a();
        }
        fs0 lifecycle = this.f5127a.getLifecycle();
        if (((os0) lifecycle).f8452d.compareTo(es0.f3436d) >= 0) {
            l41.m4053v(((os0) lifecycle).f8452d, "performRestore cannot be called when owner is ");
            return;
        }
        hp1 hp1Var = this.f5128b;
        if (!hp1Var.f4656b) {
            f40.m2719o("You must call performAttach() before calling performRestore(Bundle).");
        } else if (hp1Var.f4658d) {
            f40.m2719o("SavedStateRegistry was already restored.");
        } else {
            hp1Var.f4657c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            hp1Var.f4658d = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3473c(Bundle bundle) {
        bundle.getClass();
        hp1 hp1Var = this.f5128b;
        hp1Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = hp1Var.f4657c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        to1 to1Var = hp1Var.f4655a;
        to1Var.getClass();
        ro1 ro1Var = new ro1(to1Var);
        to1Var.f10915c.put(ro1Var, Boolean.FALSE);
        while (ro1Var.hasNext()) {
            Map.Entry entry = (Map.Entry) ro1Var.next();
            bundle2.putBundle((String) entry.getKey(), ((gp1) entry.getValue()).mo359a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
