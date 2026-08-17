package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: un */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1486un {

    /* JADX INFO: renamed from: a */
    public final HashMap f11365a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f11366b;

    public C1486un(HashMap map) {
        this.f11366b = map;
        for (Map.Entry entry : map.entrySet()) {
            ds0 ds0Var = (ds0) entry.getValue();
            List arrayList = (List) this.f11365a.get(ds0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f11365a.put(ds0Var, arrayList);
            }
            arrayList.add((C1523vn) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6512a(List list, ms0 ms0Var, ds0 ds0Var, ls0 ls0Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1523vn c1523vn = (C1523vn) list.get(size);
                Method method = c1523vn.f11718b;
                try {
                    int i = c1523vn.f11717a;
                    if (i == 0) {
                        method.invoke(ls0Var, null);
                    } else if (i == 1) {
                        method.invoke(ls0Var, ms0Var);
                    } else if (i == 2) {
                        method.invoke(ls0Var, ms0Var, ds0Var);
                    }
                } catch (IllegalAccessException e) {
                    ca0.m1184p(e);
                    return;
                } catch (InvocationTargetException e2) {
                    l41.m4043l("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
