package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 {

    /* JADX INFO: renamed from: a */
    public static final pb2 f8833a;

    /* JADX INFO: renamed from: b */
    public static final pb2 f8834b;

    /* JADX INFO: renamed from: c */
    public static final pb2 f8835c;

    /* JADX INFO: renamed from: d */
    public static final pb2 f8836d;

    /* JADX INFO: renamed from: e */
    public static final pb2 f8837e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ pb2[] f8838f;

    static {
        pb2 pb2Var = new pb2("UPDATE", 0);
        f8833a = pb2Var;
        pb2 pb2Var2 = new pb2("DELETE", 1);
        f8834b = pb2Var2;
        pb2 pb2Var3 = new pb2("VERIFY", 2);
        f8835c = pb2Var3;
        pb2 pb2Var4 = new pb2("TRANSFORM", 3);
        f8836d = pb2Var4;
        pb2 pb2Var5 = new pb2("OPERATION_NOT_SET", 4);
        f8837e = pb2Var5;
        f8838f = new pb2[]{pb2Var, pb2Var2, pb2Var3, pb2Var4, pb2Var5};
    }

    public static pb2 valueOf(String str) {
        return (pb2) Enum.valueOf(pb2.class, str);
    }

    public static pb2[] values() {
        return (pb2[]) f8838f.clone();
    }
}
