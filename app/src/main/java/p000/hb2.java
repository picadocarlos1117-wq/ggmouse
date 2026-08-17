package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class hb2 {

    /* JADX INFO: renamed from: c */
    public static final db2 f4513c;

    /* JADX INFO: renamed from: d */
    public static final eb2 f4514d;

    /* JADX INFO: renamed from: e */
    public static final fb2 f4515e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hb2[] f4516f;

    /* JADX INFO: renamed from: a */
    public final ib2 f4517a;

    /* JADX INFO: renamed from: b */
    public final int f4518b;

    /* JADX INFO: Fake field, exist only in values array */
    hb2 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    hb2 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    hb2 EF2;

    static {
        hb2 hb2Var = new hb2("DOUBLE", 0, ib2.DOUBLE, 1);
        hb2 hb2Var2 = new hb2("FLOAT", 1, ib2.FLOAT, 5);
        ib2 ib2Var = ib2.LONG;
        hb2 hb2Var3 = new hb2("INT64", 2, ib2Var, 0);
        hb2 hb2Var4 = new hb2("UINT64", 3, ib2Var, 0);
        ib2 ib2Var2 = ib2.INT;
        hb2 hb2Var5 = new hb2("INT32", 4, ib2Var2, 0);
        hb2 hb2Var6 = new hb2("FIXED64", 5, ib2Var, 1);
        hb2 hb2Var7 = new hb2("FIXED32", 6, ib2Var2, 5);
        hb2 hb2Var8 = new hb2("BOOL", 7, ib2.BOOLEAN, 0);
        db2 db2Var = new db2("STRING", 8, ib2.STRING, 2);
        f4513c = db2Var;
        ib2 ib2Var3 = ib2.MESSAGE;
        eb2 eb2Var = new eb2("GROUP", 9, ib2Var3, 3);
        f4514d = eb2Var;
        fb2 fb2Var = new fb2("MESSAGE", 10, ib2Var3, 2);
        f4515e = fb2Var;
        f4516f = new hb2[]{hb2Var, hb2Var2, hb2Var3, hb2Var4, hb2Var5, hb2Var6, hb2Var7, hb2Var8, db2Var, eb2Var, fb2Var, new gb2("BYTES", 11, ib2.BYTE_STRING, 2), new hb2("UINT32", 12, ib2Var2, 0), new hb2("ENUM", 13, ib2.ENUM, 0), new hb2("SFIXED32", 14, ib2Var2, 5), new hb2("SFIXED64", 15, ib2Var, 1), new hb2("SINT32", 16, ib2Var2, 0), new hb2("SINT64", 17, ib2Var, 0)};
    }

    public hb2(String str, int i, ib2 ib2Var, int i2) {
        super(str, i);
        this.f4517a = ib2Var;
        this.f4518b = i2;
    }

    public static hb2 valueOf(String str) {
        return (hb2) Enum.valueOf(hb2.class, str);
    }

    public static hb2[] values() {
        return (hb2[]) f4516f.clone();
    }
}
