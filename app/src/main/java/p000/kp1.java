package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements u72 {

    /* JADX INFO: renamed from: a */
    public final Application f5979a;

    /* JADX INFO: renamed from: b */
    public final t72 f5980b;

    /* JADX INFO: renamed from: c */
    public final Bundle f5981c;

    /* JADX INFO: renamed from: d */
    public final fs0 f5982d;

    /* JADX INFO: renamed from: e */
    public final hp1 f5983e;

    public kp1(Application application, jp1 jp1Var, Bundle bundle) {
        t72 t72Var;
        this.f5983e = jp1Var.getSavedStateRegistry();
        this.f5982d = jp1Var.getLifecycle();
        this.f5981c = bundle;
        this.f5979a = application;
        if (application != null) {
            if (t72.f10797d == null) {
                t72.f10797d = new t72(application);
            }
            t72Var = t72.f10797d;
            t72Var.getClass();
        } else {
            t72Var = new t72(null);
        }
        this.f5980b = t72Var;
    }

    @Override // p000.u72
    /* JADX INFO: renamed from: a */
    public final r72 mo738a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m3996b(cls, canonicalName);
        }
        f40.m2713i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final r72 m3996b(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        fs0 fs0Var = this.f5982d;
        if (fs0Var == null) {
            C0694gy.m3079e("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC0556d6.class.isAssignableFrom(cls);
        Constructor constructorM4269a = (!zIsAssignableFrom || this.f5979a == null) ? lp1.m4269a(cls, lp1.f6486b) : lp1.m4269a(cls, lp1.f6485a);
        if (constructorM4269a == null) {
            if (this.f5979a != null) {
                return this.f5980b.mo738a(cls);
            }
            if (ax0.f1092b == null) {
                ax0.f1092b = new ax0(16);
            }
            ax0 ax0Var = ax0.f1092b;
            ax0Var.getClass();
            return ax0Var.mo738a(cls);
        }
        hp1 hp1Var = this.f5983e;
        hp1Var.getClass();
        Bundle bundle = this.f5981c;
        Bundle bundleM3233a = hp1Var.m3233a(str);
        Class[] clsArr = zo1.f13506f;
        zo1 zo1VarM3217k = hp0.m3217k(bundleM3233a, bundle);
        ap1 ap1Var = new ap1(str, zo1VarM3217k);
        ap1Var.m697d(hp1Var, fs0Var);
        es0 es0Var = ((os0) fs0Var).f8452d;
        if (es0Var == es0.f3434b || es0Var.compareTo(es0.f3436d) >= 0) {
            hp1Var.m3236d();
        } else {
            fs0Var.mo2848a(new C1424sz(1, fs0Var, hp1Var));
        }
        r72 r72VarM4270b = (!zIsAssignableFrom || (application = this.f5979a) == null) ? lp1.m4270b(cls, constructorM4269a, zo1VarM3217k) : lp1.m4270b(cls, constructorM4269a, application, zo1VarM3217k);
        r72VarM4270b.getClass();
        s72 s72Var = r72VarM4270b.f9806a;
        if (s72Var == null) {
            return r72VarM4270b;
        }
        if (s72Var.f10277d) {
            s72.m6002a(ap1Var);
            return r72VarM4270b;
        }
        synchronized (s72Var.f10274a) {
            autoCloseable = (AutoCloseable) s72Var.f10275b.put("androidx.lifecycle.savedstate.vm.tag", ap1Var);
        }
        s72.m6002a(autoCloseable);
        return r72VarM4270b;
    }

    @Override // p000.u72
    /* JADX INFO: renamed from: e */
    public final r72 mo742e(Class cls, a71 a71Var) {
        bz1 bz1Var = bz1.f1583m;
        LinkedHashMap linkedHashMap = a71Var.f1067a;
        String str = (String) linkedHashMap.get(bz1Var);
        if (str == null) {
            f40.m2719o("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(hp0.f4651o) == null || linkedHashMap.get(hp0.f4652p) == null) {
            if (this.f5982d != null) {
                return m3996b(cls, str);
            }
            f40.m2719o("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(t72.f10798e);
        boolean zIsAssignableFrom = AbstractC0556d6.class.isAssignableFrom(cls);
        Constructor constructorM4269a = (!zIsAssignableFrom || application == null) ? lp1.m4269a(cls, lp1.f6486b) : lp1.m4269a(cls, lp1.f6485a);
        if (constructorM4269a == null) {
            return this.f5980b.mo742e(cls, a71Var);
        }
        return (!zIsAssignableFrom || application == null) ? lp1.m4270b(cls, constructorM4269a, hp0.m3218l(a71Var)) : lp1.m4270b(cls, constructorM4269a, application, hp0.m3218l(a71Var));
    }
}
