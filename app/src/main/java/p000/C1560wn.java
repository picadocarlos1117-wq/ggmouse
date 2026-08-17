package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: wn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1560wn {

    /* JADX INFO: renamed from: c */
    public static final C1560wn f12233c = new C1560wn();

    /* JADX INFO: renamed from: a */
    public final HashMap f12234a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f12235b = new HashMap();

    /* JADX INFO: renamed from: b */
    public static void m6809b(HashMap map, C1523vn c1523vn, ds0 ds0Var, Class cls) {
        ds0 ds0Var2 = (ds0) map.get(c1523vn);
        if (ds0Var2 == null || ds0Var == ds0Var2) {
            if (ds0Var2 == null) {
                map.put(c1523vn, ds0Var);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1523vn.f11718b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ds0Var2 + ", new value " + ds0Var);
    }

    /* JADX INFO: renamed from: a */
    public final C1486un m6810a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f12234a;
        if (superclass != null) {
            C1486un c1486unM6810a = (C1486un) map2.get(superclass);
            if (c1486unM6810a == null) {
                c1486unM6810a = m6810a(superclass, null);
            }
            map.putAll(c1486unM6810a.f11366b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1486un c1486unM6810a2 = (C1486un) map2.get(cls2);
            if (c1486unM6810a2 == null) {
                c1486unM6810a2 = m6810a(cls2, null);
            }
            for (Map.Entry entry : c1486unM6810a2.f11366b.entrySet()) {
                m6809b(map, (C1523vn) entry.getKey(), (ds0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            va1 va1Var = (va1) method.getAnnotation(va1.class);
            if (va1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!ms0.class.isAssignableFrom(parameterTypes[0])) {
                        f40.m2713i("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                ds0 ds0VarValue = va1Var.value();
                if (parameterTypes.length > 1) {
                    if (!ds0.class.isAssignableFrom(parameterTypes[1])) {
                        f40.m2713i("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (ds0VarValue != ds0.ON_ANY) {
                        f40.m2713i("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    f40.m2713i("cannot have more than 2 params");
                    return null;
                }
                m6809b(map, new C1523vn(i, method), ds0VarValue, cls);
                z = true;
            }
        }
        C1486un c1486un = new C1486un(map);
        map2.put(cls, c1486un);
        this.f12235b.put(cls, Boolean.valueOf(z));
        return c1486un;
    }
}
