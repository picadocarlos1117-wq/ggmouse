package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 {

    /* JADX INFO: renamed from: a */
    public static final cg1 f1791a;

    /* JADX INFO: renamed from: b */
    public static final cg1 f1792b;

    /* JADX INFO: renamed from: c */
    public static final cg1 f1793c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cg1[] f1794d;

    static {
        cg1 cg1Var = new cg1("DEFAULT", 0);
        f1791a = cg1Var;
        cg1 cg1Var2 = new cg1("VERY_LOW", 1);
        f1792b = cg1Var2;
        cg1 cg1Var3 = new cg1("HIGHEST", 2);
        f1793c = cg1Var3;
        f1794d = new cg1[]{cg1Var, cg1Var2, cg1Var3};
    }

    public static cg1 valueOf(String str) {
        return (cg1) Enum.valueOf(cg1.class, str);
    }

    public static cg1[] values() {
        return (cg1[]) f1794d.clone();
    }
}
