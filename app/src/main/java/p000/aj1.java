package p000;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 implements ks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251a;

    /* JADX INFO: renamed from: b */
    public final Object f252b;

    public /* synthetic */ aj1(Object obj, int i) {
        this.f251a = i;
        this.f252b = obj;
    }

    @Override // p000.ks0
    /* JADX INFO: renamed from: c */
    public final void mo157c(ms0 ms0Var, ds0 ds0Var) {
        int i = this.f251a;
        Object obj = this.f252b;
        switch (i) {
            case 0:
                jp1 jp1Var = (jp1) obj;
                if (ds0Var != ds0.ON_CREATE) {
                    f40.m2711g("Next event must be ON_CREATE");
                    return;
                }
                ms0Var.getLifecycle().mo2849b(this);
                Bundle bundleM3233a = jp1Var.getSavedStateRegistry().m3233a("androidx.savedstate.Restarter");
                if (bundleM3233a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM3233a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    f40.m2719o("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, aj1.class.getClassLoader()).asSubclass(fp1.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(jp1Var instanceof w72)) {
                                    f40.m2719o("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    return;
                                }
                                v72 viewModelStore = ((w72) jp1Var).getViewModelStore();
                                hp1 savedStateRegistry = jp1Var.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f11575a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    r72 r72Var = (r72) linkedHashMap.get(str3);
                                    r72Var.getClass();
                                    hr1.m3266b(r72Var, savedStateRegistry, jp1Var.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.m3236d();
                                }
                            } catch (Exception e) {
                                l41.m4043l(AbstractC1308pu.m5339f("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        l41.m4043l(jd0.m3615m("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                new HashMap();
                yh0[] yh0VarArr = (yh0[]) obj;
                if (yh0VarArr.length > 0) {
                    yh0 yh0Var = yh0VarArr[0];
                    throw null;
                }
                if (yh0VarArr.length <= 0) {
                    return;
                }
                yh0 yh0Var2 = yh0VarArr[0];
                throw null;
            default:
                if (ds0Var != ds0.ON_CREATE) {
                    l41.m4053v(ds0Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    ms0Var.getLifecycle().mo2849b(this);
                    ((cp1) obj).m2111b();
                    return;
                }
        }
    }
}
