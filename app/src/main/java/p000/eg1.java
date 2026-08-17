package p000;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eg1 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f3343a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f3344b;

    static {
        HashMap map = new HashMap();
        f3344b = map;
        map.put(cg1.f1791a, 0);
        map.put(cg1.f1792b, 1);
        map.put(cg1.f1793c, 2);
        for (cg1 cg1Var : map.keySet()) {
            f3343a.append(((Integer) f3344b.get(cg1Var)).intValue(), cg1Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m2586a(cg1 cg1Var) {
        Integer num = (Integer) f3344b.get(cg1Var);
        if (num != null) {
            return num.intValue();
        }
        C0694gy.m3081g(cg1Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static cg1 m2587b(int i) {
        cg1 cg1Var = (cg1) f3343a.get(i);
        if (cg1Var != null) {
            return cg1Var;
        }
        f40.m2713i(jd0.m3609g(i, "Unknown Priority for value "));
        return null;
    }
}
