package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qy0 extends ua0 {
    /* JADX INFO: renamed from: i0 */
    public static int m5619i0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: j0 */
    public static Map m5620j0(bc1... bc1VarArr) {
        if (bc1VarArr.length <= 0) {
            return o60.f7669a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5619i0(bc1VarArr.length));
        for (bc1 bc1Var : bc1VarArr) {
            linkedHashMap.put(bc1Var.f1292a, bc1Var.f1293b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: k0 */
    public static Map m5621k0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return o60.f7669a;
        }
        int i = 0;
        if (size == 1) {
            bc1 bc1Var = (bc1) arrayList.get(0);
            bc1Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(bc1Var.f1292a, bc1Var.f1293b);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5619i0(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            bc1 bc1Var2 = (bc1) obj;
            linkedHashMap.put(bc1Var2.f1292a, bc1Var2.f1293b);
        }
        return linkedHashMap;
    }
}
