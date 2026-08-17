package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ro */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1376ro {

    /* JADX INFO: renamed from: a */
    public static final EnumC1376ro f10079a;

    /* JADX INFO: renamed from: b */
    public static final EnumC1376ro f10080b;

    /* JADX INFO: renamed from: c */
    public static final EnumC1376ro f10081c;

    /* JADX INFO: renamed from: d */
    public static final EnumC1376ro f10082d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC1376ro[] f10083e;

    static {
        EnumC1376ro enumC1376ro = new EnumC1376ro("PROCESSED", 0);
        f10079a = enumC1376ro;
        EnumC1376ro enumC1376ro2 = new EnumC1376ro("REFUSED", 1);
        f10080b = enumC1376ro2;
        EnumC1376ro enumC1376ro3 = new EnumC1376ro("DROPPED", 2);
        f10081c = enumC1376ro3;
        EnumC1376ro enumC1376ro4 = new EnumC1376ro("MISCARRIED", 3);
        f10082d = enumC1376ro4;
        f10083e = new EnumC1376ro[]{enumC1376ro, enumC1376ro2, enumC1376ro3, enumC1376ro4};
    }

    public static EnumC1376ro valueOf(String str) {
        return (EnumC1376ro) Enum.valueOf(EnumC1376ro.class, str);
    }

    public static EnumC1376ro[] values() {
        return (EnumC1376ro[]) f10083e.clone();
    }
}
