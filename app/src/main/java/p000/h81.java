package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f4472a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ h81[] f4473b;

    /* JADX INFO: Fake field, exist only in values array */
    h81 EF1;

    static {
        h81 h81Var = new h81("UNKNOWN_MOBILE_SUBTYPE", 0);
        h81 h81Var2 = new h81("GPRS", 1);
        h81 h81Var3 = new h81("EDGE", 2);
        h81 h81Var4 = new h81("UMTS", 3);
        h81 h81Var5 = new h81("CDMA", 4);
        h81 h81Var6 = new h81("EVDO_0", 5);
        h81 h81Var7 = new h81("EVDO_A", 6);
        h81 h81Var8 = new h81("RTT", 7);
        h81 h81Var9 = new h81("HSDPA", 8);
        h81 h81Var10 = new h81("HSUPA", 9);
        h81 h81Var11 = new h81("HSPA", 10);
        h81 h81Var12 = new h81("IDEN", 11);
        h81 h81Var13 = new h81("EVDO_B", 12);
        h81 h81Var14 = new h81("LTE", 13);
        h81 h81Var15 = new h81("EHRPD", 14);
        h81 h81Var16 = new h81("HSPAP", 15);
        h81 h81Var17 = new h81("GSM", 16);
        h81 h81Var18 = new h81("TD_SCDMA", 17);
        h81 h81Var19 = new h81("IWLAN", 18);
        h81 h81Var20 = new h81("LTE_CA", 19);
        f4473b = new h81[]{h81Var, h81Var2, h81Var3, h81Var4, h81Var5, h81Var6, h81Var7, h81Var8, h81Var9, h81Var10, h81Var11, h81Var12, h81Var13, h81Var14, h81Var15, h81Var16, h81Var17, h81Var18, h81Var19, h81Var20, new h81("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f4472a = sparseArray;
        sparseArray.put(0, h81Var);
        sparseArray.put(1, h81Var2);
        sparseArray.put(2, h81Var3);
        sparseArray.put(3, h81Var4);
        sparseArray.put(4, h81Var5);
        sparseArray.put(5, h81Var6);
        sparseArray.put(6, h81Var7);
        sparseArray.put(7, h81Var8);
        sparseArray.put(8, h81Var9);
        sparseArray.put(9, h81Var10);
        sparseArray.put(10, h81Var11);
        sparseArray.put(11, h81Var12);
        sparseArray.put(12, h81Var13);
        sparseArray.put(13, h81Var14);
        sparseArray.put(14, h81Var15);
        sparseArray.put(15, h81Var16);
        sparseArray.put(16, h81Var17);
        sparseArray.put(17, h81Var18);
        sparseArray.put(18, h81Var19);
        sparseArray.put(19, h81Var20);
    }

    public static h81 valueOf(String str) {
        return (h81) Enum.valueOf(h81.class, str);
    }

    public static h81[] values() {
        return (h81[]) f4473b.clone();
    }
}
