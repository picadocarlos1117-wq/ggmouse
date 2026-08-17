package p000;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y42 {

    /* JADX INFO: renamed from: a */
    public static final String[] f12842a = new String[0];

    /* JADX INFO: renamed from: b */
    public static final Charset f12843b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static Object[] m6998a(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            for (Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
