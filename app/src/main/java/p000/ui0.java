package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ui0 {

    /* JADX INFO: renamed from: c */
    public static final ui0 f11303c;

    /* JADX INFO: renamed from: d */
    public static final ui0[] f11304d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ui0[] f11305e;

    /* JADX INFO: renamed from: a */
    public final int f11306a;

    /* JADX INFO: renamed from: b */
    public final nv1 f11307b;

    /* JADX INFO: Fake field, exist only in values array */
    ui0 EF0;

    static {
        nv1 nv1Var = nv1.f7559n;
        ui0 ui0Var = new ui0("NO_ERROR", 0, 0, nv1Var);
        nv1 nv1Var2 = nv1.f7558m;
        ui0 ui0Var2 = new ui0("PROTOCOL_ERROR", 1, 1, nv1Var2);
        ui0 ui0Var3 = new ui0("INTERNAL_ERROR", 2, 2, nv1Var2);
        f11303c = ui0Var3;
        f11305e = new ui0[]{ui0Var, ui0Var2, ui0Var3, new ui0("FLOW_CONTROL_ERROR", 3, 3, nv1Var2), new ui0("SETTINGS_TIMEOUT", 4, 4, nv1Var2), new ui0("STREAM_CLOSED", 5, 5, nv1Var2), new ui0("FRAME_SIZE_ERROR", 6, 6, nv1Var2), new ui0("REFUSED_STREAM", 7, 7, nv1Var), new ui0("CANCEL", 8, 8, nv1.f7551f), new ui0("COMPRESSION_ERROR", 9, 9, nv1Var2), new ui0("CONNECT_ERROR", 10, 10, nv1Var2), new ui0("ENHANCE_YOUR_CALM", 11, 11, nv1.f7556k.m4614g("Bandwidth exhausted")), new ui0("INADEQUATE_SECURITY", 12, 12, nv1.f7554i.m4614g("Permission denied as protocol is not secure enough to call")), new ui0("HTTP_1_1_REQUIRED", 13, 13, nv1.f7552g)};
        ui0[] ui0VarArrValues = values();
        ui0[] ui0VarArr = new ui0[ui0VarArrValues[ui0VarArrValues.length - 1].f11306a + 1];
        for (ui0 ui0Var4 : ui0VarArrValues) {
            ui0VarArr[ui0Var4.f11306a] = ui0Var4;
        }
        f11304d = ui0VarArr;
    }

    public ui0(String str, int i, int i2, nv1 nv1Var) {
        super(str, i);
        this.f11306a = i2;
        String str2 = "HTTP/2 error code: " + name();
        this.f11307b = nv1Var.m4614g(nv1Var.f7563b != null ? AbstractC1308pu.m5342i(AbstractC1308pu.m5346m(str2, " ("), nv1Var.f7563b, ")") : str2);
    }

    public static ui0 valueOf(String str) {
        return (ui0) Enum.valueOf(ui0.class, str);
    }

    public static ui0[] values() {
        return (ui0[]) f11305e.clone();
    }
}
