package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ts1 {

    /* JADX INFO: renamed from: a */
    public static final Map f11014a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a */
    public static void m6335a(ss1 ss1Var) {
        ArrayList arrayList = new ArrayList();
        Map map = f11014a;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == ss1Var) {
                arrayList.add((String) entry.getKey());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            map.remove((String) obj);
        }
    }
}
