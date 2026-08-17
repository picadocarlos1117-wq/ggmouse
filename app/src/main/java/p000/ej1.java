package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ej1 {

    /* JADX INFO: renamed from: a */
    public static final ej1 f3372a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ej1[] f3373b;

    static {
        ej1 ej1Var = new ej1("ALLOW", 0);
        f3372a = ej1Var;
        f3373b = new ej1[]{ej1Var, new ej1("PREVENT_WHEN_EMPTY", 1), new ej1("PREVENT", 2)};
    }

    public static ej1 valueOf(String str) {
        return (ej1) Enum.valueOf(ej1.class, str);
    }

    public static ej1[] values() {
        return (ej1[]) f3373b.clone();
    }
}
