package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class u80 {

    /* JADX INFO: renamed from: a */
    public static volatile u80 f11175a;

    /* JADX INFO: renamed from: b */
    public static final u80 f11176b;

    static {
        u80 u80Var = new u80();
        Map map = Collections.EMPTY_MAP;
        f11176b = u80Var;
    }

    /* JADX INFO: renamed from: a */
    public static u80 m6404a() {
        u80 u80Var;
        u80 u80Var2 = f11175a;
        if (u80Var2 != null) {
            return u80Var2;
        }
        synchronized (u80.class) {
            try {
                u80Var = f11175a;
                if (u80Var == null) {
                    Class cls = t80.f10801a;
                    u80 u80Var3 = null;
                    if (cls != null) {
                        try {
                            u80Var3 = (u80) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    u80Var = u80Var3 != null ? u80Var3 : f11176b;
                    f11175a = u80Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u80Var;
    }
}
