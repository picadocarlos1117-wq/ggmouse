package p000;

import com.example.ssmousepro.injection.InjectionProtocol;

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
public final class u90 {

    /* JADX INFO: renamed from: b */
    public static final u90 f11182b;

    /* JADX INFO: renamed from: c */
    public static final u90 f11183c;

    /* JADX INFO: renamed from: d */
    public static final u90[] f11184d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ u90[] f11185e;

    /* JADX INFO: renamed from: a */
    public final int f11186a;

    /* JADX INFO: Fake field, exist only in values array */
    u90 EF0;

    static {
        aq0 aq0Var = aq0.DOUBLE;
        u90 u90Var = new u90("DOUBLE", 0, 0, 1, aq0Var);
        aq0 aq0Var2 = aq0.FLOAT;
        u90 u90Var2 = new u90("FLOAT", 1, 1, 1, aq0Var2);
        aq0 aq0Var3 = aq0.LONG;
        u90 u90Var3 = new u90("INT64", 2, 2, 1, aq0Var3);
        u90 u90Var4 = new u90("UINT64", 3, 3, 1, aq0Var3);
        aq0 aq0Var4 = aq0.INT;
        u90 u90Var5 = new u90("INT32", 4, 4, 1, aq0Var4);
        u90 u90Var6 = new u90("FIXED64", 5, 5, 1, aq0Var3);
        u90 u90Var7 = new u90("FIXED32", 6, 6, 1, aq0Var4);
        aq0 aq0Var5 = aq0.BOOLEAN;
        u90 u90Var8 = new u90("BOOL", 7, 7, 1, aq0Var5);
        aq0 aq0Var6 = aq0.STRING;
        u90 u90Var9 = new u90("STRING", 8, 8, 1, aq0Var6);
        aq0 aq0Var7 = aq0.MESSAGE;
        u90 u90Var10 = new u90("MESSAGE", 9, 9, 1, aq0Var7);
        aq0 aq0Var8 = aq0.BYTE_STRING;
        u90 u90Var11 = new u90("BYTES", 10, 10, 1, aq0Var8);
        u90 u90Var12 = new u90("UINT32", 11, 11, 1, aq0Var4);
        aq0 aq0Var9 = aq0.ENUM;
        u90 u90Var13 = new u90("ENUM", 12, 12, 1, aq0Var9);
        u90 u90Var14 = new u90("SFIXED32", 13, 13, 1, aq0Var4);
        u90 u90Var15 = new u90("SFIXED64", 14, 14, 1, aq0Var3);
        u90 u90Var16 = new u90("SINT32", 15, 15, 1, aq0Var4);
        u90 u90Var17 = new u90("SINT64", 16, 16, 1, aq0Var3);
        u90 u90Var18 = new u90("GROUP", 17, 17, 1, aq0Var7);
        u90 u90Var19 = new u90("DOUBLE_LIST", 18, 18, 2, aq0Var);
        u90 u90Var20 = new u90("FLOAT_LIST", 19, 19, 2, aq0Var2);
        u90 u90Var21 = new u90("INT64_LIST", 20, 20, 2, aq0Var3);
        u90 u90Var22 = new u90("UINT64_LIST", 21, 21, 2, aq0Var3);
        u90 u90Var23 = new u90("INT32_LIST", 22, 22, 2, aq0Var4);
        u90 u90Var24 = new u90("FIXED64_LIST", 23, 23, 2, aq0Var3);
        u90 u90Var25 = new u90("FIXED32_LIST", 24, 24, 2, aq0Var4);
        u90 u90Var26 = new u90("BOOL_LIST", 25, 25, 2, aq0Var5);
        u90 u90Var27 = new u90("STRING_LIST", 26, 26, 2, aq0Var6);
        u90 u90Var28 = new u90("MESSAGE_LIST", 27, 27, 2, aq0Var7);
        u90 u90Var29 = new u90("BYTES_LIST", 28, 28, 2, aq0Var8);
        u90 u90Var30 = new u90("UINT32_LIST", 29, 29, 2, aq0Var4);
        u90 u90Var31 = new u90("ENUM_LIST", 30, 30, 2, aq0Var9);
        u90 u90Var32 = new u90("SFIXED32_LIST", 31, 31, 2, aq0Var4);
        u90 u90Var33 = new u90("SFIXED64_LIST", 32, 32, 2, aq0Var3);
        u90 u90Var34 = new u90("SINT32_LIST", 33, 33, 2, aq0Var4);
        u90 u90Var35 = new u90("SINT64_LIST", 34, 34, 2, aq0Var3);
        u90 u90Var36 = new u90("DOUBLE_LIST_PACKED", 35, 35, 3, aq0Var);
        f11182b = u90Var36;
        u90 u90Var37 = new u90("FLOAT_LIST_PACKED", 36, 36, 3, aq0Var2);
        u90 u90Var38 = new u90("INT64_LIST_PACKED", 37, 37, 3, aq0Var3);
        u90 u90Var39 = new u90("UINT64_LIST_PACKED", 38, 38, 3, aq0Var3);
        u90 u90Var40 = new u90("INT32_LIST_PACKED", 39, 39, 3, aq0Var4);
        u90 u90Var41 = new u90("FIXED64_LIST_PACKED", 40, 40, 3, aq0Var3);
        u90 u90Var42 = new u90("FIXED32_LIST_PACKED", 41, 41, 3, aq0Var4);
        u90 u90Var43 = new u90("BOOL_LIST_PACKED", 42, 42, 3, aq0Var5);
        u90 u90Var44 = new u90("UINT32_LIST_PACKED", 43, 43, 3, aq0Var4);
        u90 u90Var45 = new u90("ENUM_LIST_PACKED", 44, 44, 3, aq0Var9);
        u90 u90Var46 = new u90("SFIXED32_LIST_PACKED", 45, 45, 3, aq0Var4);
        u90 u90Var47 = new u90("SFIXED64_LIST_PACKED", 46, 46, 3, aq0Var3);
        u90 u90Var48 = new u90("SINT32_LIST_PACKED", 47, 47, 3, aq0Var4);
        u90 u90Var49 = new u90("SINT64_LIST_PACKED", 48, 48, 3, aq0Var3);
        f11183c = u90Var49;
        f11185e = new u90[]{u90Var, u90Var2, u90Var3, u90Var4, u90Var5, u90Var6, u90Var7, u90Var8, u90Var9, u90Var10, u90Var11, u90Var12, u90Var13, u90Var14, u90Var15, u90Var16, u90Var17, u90Var18, u90Var19, u90Var20, u90Var21, u90Var22, u90Var23, u90Var24, u90Var25, u90Var26, u90Var27, u90Var28, u90Var29, u90Var30, u90Var31, u90Var32, u90Var33, u90Var34, u90Var35, u90Var36, u90Var37, u90Var38, u90Var39, u90Var40, u90Var41, u90Var42, u90Var43, u90Var44, u90Var45, u90Var46, u90Var47, u90Var48, u90Var49, new u90("GROUP_LIST", 49, 49, 2, aq0Var7), new u90(InjectionProtocol.MAP, 50, 50, 4, aq0.VOID)};
        u90[] u90VarArrValues = values();
        f11184d = new u90[u90VarArrValues.length];
        for (u90 u90Var50 : u90VarArrValues) {
            f11184d[u90Var50.f11186a] = u90Var50;
        }
    }

    public u90(String str, int i, int i2, int i3, aq0 aq0Var) {
        super(str, i);
        this.f11186a = i2;
        int iM5359z = AbstractC1308pu.m5359z(i3);
        if (iM5359z == 1 || iM5359z == 3) {
            aq0Var.getClass();
        }
        if (i3 == 1) {
            aq0Var.ordinal();
        }
    }

    public static u90 valueOf(String str) {
        return (u90) Enum.valueOf(u90.class, str);
    }

    public static u90[] values() {
        return (u90[]) f11185e.clone();
    }
}
