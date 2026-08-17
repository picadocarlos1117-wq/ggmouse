package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iq1 {

    /* JADX INFO: renamed from: a */
    public static final iq1 f5130a;

    /* JADX INFO: renamed from: b */
    public static final iq1 f5131b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ iq1[] f5132c;

    static {
        iq1 iq1Var = new iq1("NONE", 0);
        f5130a = iq1Var;
        iq1 iq1Var2 = new iq1("INTEGRITY", 1);
        iq1 iq1Var3 = new iq1("PRIVACY_AND_INTEGRITY", 2);
        f5131b = iq1Var3;
        f5132c = new iq1[]{iq1Var, iq1Var2, iq1Var3};
    }

    public static iq1 valueOf(String str) {
        return (iq1) Enum.valueOf(iq1.class, str);
    }

    public static iq1[] values() {
        return (iq1[]) f5132c.clone();
    }
}
