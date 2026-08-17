package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w80 {

    /* JADX INFO: renamed from: a */
    public static final v80 f12024a = new v80();

    /* JADX INFO: renamed from: b */
    public static final v80 f12025b;

    static {
        v80 v80Var = null;
        try {
            v80Var = (v80) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12025b = v80Var;
    }
}
