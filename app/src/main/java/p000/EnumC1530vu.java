package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vu */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1530vu {

    /* JADX INFO: renamed from: a */
    public static final EnumC1530vu f11768a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1530vu[] f11769b;

    static {
        EnumC1530vu enumC1530vu = new EnumC1530vu("COROUTINE_SUSPENDED", 0);
        f11768a = enumC1530vu;
        f11769b = new EnumC1530vu[]{enumC1530vu, new EnumC1530vu("UNDECIDED", 1), new EnumC1530vu("RESUMED", 2)};
    }

    public static EnumC1530vu valueOf(String str) {
        return (EnumC1530vu) Enum.valueOf(EnumC1530vu.class, str);
    }

    public static EnumC1530vu[] values() {
        return (EnumC1530vu[]) f11769b.clone();
    }
}
