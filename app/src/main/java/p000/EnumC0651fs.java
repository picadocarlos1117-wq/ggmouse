package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fs */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0651fs {

    /* JADX INFO: renamed from: a */
    public static final EnumC0651fs f3885a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0651fs f3886b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0651fs f3887c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0651fs f3888d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0651fs f3889e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0651fs[] f3890f;

    static {
        EnumC0651fs enumC0651fs = new EnumC0651fs("CONNECTING", 0);
        f3885a = enumC0651fs;
        EnumC0651fs enumC0651fs2 = new EnumC0651fs("READY", 1);
        f3886b = enumC0651fs2;
        EnumC0651fs enumC0651fs3 = new EnumC0651fs("TRANSIENT_FAILURE", 2);
        f3887c = enumC0651fs3;
        EnumC0651fs enumC0651fs4 = new EnumC0651fs("IDLE", 3);
        f3888d = enumC0651fs4;
        EnumC0651fs enumC0651fs5 = new EnumC0651fs("SHUTDOWN", 4);
        f3889e = enumC0651fs5;
        f3890f = new EnumC0651fs[]{enumC0651fs, enumC0651fs2, enumC0651fs3, enumC0651fs4, enumC0651fs5};
    }

    public static EnumC0651fs valueOf(String str) {
        return (EnumC0651fs) Enum.valueOf(EnumC0651fs.class, str);
    }

    public static EnumC0651fs[] values() {
        return (EnumC0651fs[]) f3890f.clone();
    }
}
