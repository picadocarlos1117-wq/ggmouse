package p000;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class az1 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f1099a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final Method f1100b;

    static {
        new HashMap();
        try {
            f1100b = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.w("SystemServiceHelper", Log.getStackTraceString(e));
        }
    }
}
