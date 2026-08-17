package p000;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1509v9 extends hp0 {

    /* JADX INFO: renamed from: t */
    public static volatile C1509v9 f11587t;

    /* JADX INFO: renamed from: s */
    public final o00 f11588s = new o00();

    /* JADX INFO: renamed from: U */
    public static C1509v9 m6610U() {
        if (f11587t != null) {
            return f11587t;
        }
        synchronized (C1509v9.class) {
            try {
                if (f11587t == null) {
                    f11587t = new C1509v9();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11587t;
    }
}
