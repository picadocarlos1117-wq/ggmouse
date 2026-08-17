package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class oo0 {

    /* JADX INFO: renamed from: a */
    public static final oo0 f8409a;

    /* JADX INFO: renamed from: b */
    public static final oo0 f8410b;

    /* JADX INFO: renamed from: c */
    public static final oo0 f8411c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ oo0[] f8412d;

    /* JADX INFO: Fake field, exist only in values array */
    oo0 EF0;

    static {
        oo0 oo0Var = new oo0("CT_UNKNOWN", 0);
        oo0 oo0Var2 = new oo0("CT_INFO", 1);
        f8409a = oo0Var2;
        oo0 oo0Var3 = new oo0("CT_WARNING", 2);
        f8410b = oo0Var3;
        oo0 oo0Var4 = new oo0("CT_ERROR", 3);
        f8411c = oo0Var4;
        f8412d = new oo0[]{oo0Var, oo0Var2, oo0Var3, oo0Var4};
    }

    public static oo0 valueOf(String str) {
        return (oo0) Enum.valueOf(oo0.class, str);
    }

    public static oo0[] values() {
        return (oo0[]) f8412d.clone();
    }
}
