package p000;

/* JADX INFO: renamed from: x5 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1579x5 {

    /* JADX INFO: renamed from: a */
    public static final Class f12452a;

    /* JADX INFO: renamed from: b */
    public static final boolean f12453b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f12452a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f12453b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6867a() {
        return (f12452a == null || f12453b) ? false : true;
    }
}
