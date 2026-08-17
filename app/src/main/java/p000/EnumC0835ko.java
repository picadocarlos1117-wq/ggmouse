package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0835ko {

    /* JADX INFO: renamed from: a */
    public static final EnumC0835ko f5944a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0835ko[] f5945b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0835ko EF0;

    static {
        EnumC0835ko enumC0835ko = new EnumC0835ko("BLOCKING", 0);
        EnumC0835ko enumC0835ko2 = new EnumC0835ko("FUTURE", 1);
        EnumC0835ko enumC0835ko3 = new EnumC0835ko("ASYNC", 2);
        f5944a = enumC0835ko3;
        f5945b = new EnumC0835ko[]{enumC0835ko, enumC0835ko2, enumC0835ko3};
    }

    public static EnumC0835ko valueOf(String str) {
        return (EnumC0835ko) Enum.valueOf(EnumC0835ko.class, str);
    }

    public static EnumC0835ko[] values() {
        return (EnumC0835ko[]) f5945b.clone();
    }
}
