package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mo */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1115mo {

    /* JADX INFO: renamed from: a */
    public static final EnumC1115mo f7055a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1115mo[] f7056b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1115mo EF0;

    static {
        EnumC1115mo enumC1115mo = new EnumC1115mo("UNKNOWN", 0);
        EnumC1115mo enumC1115mo2 = new EnumC1115mo("ANDROID_FIREBASE", 1);
        f7055a = enumC1115mo2;
        f7056b = new EnumC1115mo[]{enumC1115mo, enumC1115mo2};
    }

    public static EnumC1115mo valueOf(String str) {
        return (EnumC1115mo) Enum.valueOf(EnumC1115mo.class, str);
    }

    public static EnumC1115mo[] values() {
        return (EnumC1115mo[]) f7056b.clone();
    }
}
