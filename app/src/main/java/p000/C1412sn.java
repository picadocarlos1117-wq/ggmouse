package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: sn */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1412sn implements jq0, InterfaceC1375rn {

    /* JADX INFO: renamed from: b */
    public static final Map f10441b;

    /* JADX INFO: renamed from: a */
    public final Class f10442a;

    static {
        List listM6124n0 = AbstractC1414sp.m6124n0(mg0.class, og0.class, ch0.class, eh0.class, fh0.class, gh0.class, hh0.class, ih0.class, jh0.class, kh0.class, ng0.class, pg0.class, qg0.class, rg0.class, sg0.class, tg0.class, ug0.class, vg0.class, wg0.class, xg0.class, zg0.class, ah0.class, bh0.class);
        ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(listM6124n0));
        int i = 0;
        for (Object obj : listM6124n0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new bc1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f10441b = qy0.m5621k0(arrayList);
    }

    public C1412sn(Class cls) {
        cls.getClass();
        this.f10442a = cls;
    }

    @Override // p000.InterfaceC1375rn
    /* JADX INFO: renamed from: a */
    public final Class mo5862a() {
        return this.f10442a;
    }

    /* JADX INFO: renamed from: b */
    public final String m6121b() {
        String strM5168g0;
        Class cls = this.f10442a;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM5168g1 = p32.m5168g0(cls.getName());
                return strM5168g1 == null ? cls.getSimpleName() : strM5168g1;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM5168g0 = p32.m5168g0(componentType.getName())) != null) {
                strConcat = strM5168g0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return zv1.m7379S0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iIndexOf = simpleName.indexOf(36, 0);
            return iIndexOf == -1 ? simpleName : simpleName.substring(iIndexOf + 1, simpleName.length());
        }
        return zv1.m7379S0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6122c(Object obj) {
        Class clsM6462u = this.f10442a;
        clsM6462u.getClass();
        Map map = f10441b;
        map.getClass();
        Integer num = (Integer) map.get(clsM6462u);
        if (num != null) {
            return p32.m5150Q(num.intValue(), obj);
        }
        if (clsM6462u.isPrimitive()) {
            clsM6462u = ua0.m6462u(gk1.m3006a(clsM6462u));
        }
        return clsM6462u.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1412sn) && ua0.m6462u(this).equals(ua0.m6462u((jq0) obj));
    }

    public final int hashCode() {
        return ua0.m6462u(this).hashCode();
    }

    public final String toString() {
        return this.f10442a + " (Kotlin reflection is not available)";
    }
}
