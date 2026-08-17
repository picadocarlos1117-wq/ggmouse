package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 {
    private static final /* synthetic */ ds0[] $VALUES;
    public static final bs0 Companion;
    public static final ds0 ON_ANY;
    public static final ds0 ON_CREATE;
    public static final ds0 ON_DESTROY;
    public static final ds0 ON_PAUSE;
    public static final ds0 ON_RESUME;
    public static final ds0 ON_START;
    public static final ds0 ON_STOP;

    static {
        ds0 ds0Var = new ds0("ON_CREATE", 0);
        ON_CREATE = ds0Var;
        ds0 ds0Var2 = new ds0("ON_START", 1);
        ON_START = ds0Var2;
        ds0 ds0Var3 = new ds0("ON_RESUME", 2);
        ON_RESUME = ds0Var3;
        ds0 ds0Var4 = new ds0("ON_PAUSE", 3);
        ON_PAUSE = ds0Var4;
        ds0 ds0Var5 = new ds0("ON_STOP", 4);
        ON_STOP = ds0Var5;
        ds0 ds0Var6 = new ds0("ON_DESTROY", 5);
        ON_DESTROY = ds0Var6;
        ds0 ds0Var7 = new ds0("ON_ANY", 6);
        ON_ANY = ds0Var7;
        $VALUES = new ds0[]{ds0Var, ds0Var2, ds0Var3, ds0Var4, ds0Var5, ds0Var6, ds0Var7};
        Companion = new bs0();
    }

    public static ds0 valueOf(String str) {
        return (ds0) Enum.valueOf(ds0.class, str);
    }

    public static ds0[] values() {
        return (ds0[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a */
    public final es0 m2383a() {
        switch (cs0.f2606a[ordinal()]) {
            case 1:
            case 2:
                return es0.f3435c;
            case 3:
            case 4:
                return es0.f3436d;
            case 5:
                return es0.f3437e;
            case 6:
                return es0.f3433a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
