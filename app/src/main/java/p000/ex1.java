package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 {

    /* JADX INFO: renamed from: a */
    public static final ex1 f3473a;

    /* JADX INFO: renamed from: b */
    public static final ex1 f3474b;

    /* JADX INFO: renamed from: c */
    public static final ex1 f3475c;

    /* JADX INFO: renamed from: d */
    public static final ex1 f3476d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ex1[] f3477e;

    static {
        ex1 ex1Var = new ex1("COMPOSITE_FILTER", 0);
        f3473a = ex1Var;
        ex1 ex1Var2 = new ex1("FIELD_FILTER", 1);
        f3474b = ex1Var2;
        ex1 ex1Var3 = new ex1("UNARY_FILTER", 2);
        f3475c = ex1Var3;
        ex1 ex1Var4 = new ex1("FILTERTYPE_NOT_SET", 3);
        f3476d = ex1Var4;
        f3477e = new ex1[]{ex1Var, ex1Var2, ex1Var3, ex1Var4};
    }

    public static ex1 valueOf(String str) {
        return (ex1) Enum.valueOf(ex1.class, str);
    }

    public static ex1[] values() {
        return (ex1[]) f3477e.clone();
    }
}
