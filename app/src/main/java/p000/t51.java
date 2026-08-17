package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class t51 {

    /* JADX INFO: renamed from: a */
    public static final t51 f10762a;

    /* JADX INFO: renamed from: b */
    public static final t51 f10763b;

    /* JADX INFO: renamed from: c */
    public static final t51 f10764c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ t51[] f10765d;

    static {
        t51 t51Var = new t51("UNARY", 0);
        f10762a = t51Var;
        t51 t51Var2 = new t51("CLIENT_STREAMING", 1);
        t51 t51Var3 = new t51("SERVER_STREAMING", 2);
        f10763b = t51Var3;
        t51 t51Var4 = new t51("BIDI_STREAMING", 3);
        f10764c = t51Var4;
        f10765d = new t51[]{t51Var, t51Var2, t51Var3, t51Var4, new t51("UNKNOWN", 4)};
    }

    public static t51 valueOf(String str) {
        return (t51) Enum.valueOf(t51.class, str);
    }

    public static t51[] values() {
        return (t51[]) f10765d.clone();
    }
}
