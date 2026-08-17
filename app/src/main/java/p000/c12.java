package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class c12 {

    /* JADX INFO: renamed from: a */
    public static final c12 f1623a;

    /* JADX INFO: renamed from: b */
    public static final c12 f1624b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ c12[] f1625c;

    /* JADX INFO: Fake field, exist only in values array */
    c12 EF0;

    static {
        c12 c12Var = new c12("FAKE", 0);
        c12 c12Var2 = new c12("MTLS", 1);
        f1623a = c12Var2;
        c12 c12Var3 = new c12("CUSTOM_MANAGERS", 2);
        f1624b = c12Var3;
        f1625c = new c12[]{c12Var, c12Var2, c12Var3};
    }

    public static c12 valueOf(String str) {
        return (c12) Enum.valueOf(c12.class, str);
    }

    public static c12[] values() {
        return (c12[]) f1625c.clone();
    }
}
