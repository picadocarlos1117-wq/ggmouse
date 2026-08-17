package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ky0 {

    /* JADX INFO: renamed from: a */
    public static final jy0 f6078a;

    /* JADX INFO: renamed from: b */
    public static final jy0 f6079b;

    static {
        jy0 jy0Var = null;
        try {
            jy0Var = (jy0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6078a = jy0Var;
        f6079b = new jy0();
    }
}
