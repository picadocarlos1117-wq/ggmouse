package p000;

import androidx.fragment.app.AbstractC0056t;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 {

    /* JADX INFO: renamed from: b */
    public static final zs1 f1780b = new zs1();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0056t f1781a;

    public cf0(AbstractC0056t abstractC0056t) {
        this.f1781a = abstractC0056t;
    }

    /* JADX INFO: renamed from: a */
    public static Class m1211a(String str, ClassLoader classLoader) throws ClassNotFoundException {
        zs1 zs1Var = f1780b;
        zs1 zs1Var2 = (zs1) zs1Var.getOrDefault(classLoader, null);
        if (zs1Var2 == null) {
            zs1Var2 = new zs1();
            zs1Var.put(classLoader, zs1Var2);
        }
        Class cls = (Class) zs1Var2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        zs1Var2.put(str, cls2);
        return cls2;
    }

    /* JADX INFO: renamed from: b */
    public static Class m1212b(String str, ClassLoader classLoader) {
        try {
            return m1211a(str, classLoader);
        } catch (ClassCastException e) {
            throw new C0656fx(jd0.m3615m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0656fx(jd0.m3615m("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }
}
