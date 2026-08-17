package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class i81 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f4867a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ i81[] f4868b;

    /* JADX INFO: Fake field, exist only in values array */
    i81 EF1;

    static {
        i81 i81Var = new i81("MOBILE", 0);
        i81 i81Var2 = new i81("WIFI", 1);
        i81 i81Var3 = new i81("MOBILE_MMS", 2);
        i81 i81Var4 = new i81("MOBILE_SUPL", 3);
        i81 i81Var5 = new i81("MOBILE_DUN", 4);
        i81 i81Var6 = new i81("MOBILE_HIPRI", 5);
        i81 i81Var7 = new i81("WIMAX", 6);
        i81 i81Var8 = new i81("BLUETOOTH", 7);
        i81 i81Var9 = new i81("DUMMY", 8);
        i81 i81Var10 = new i81("ETHERNET", 9);
        i81 i81Var11 = new i81("MOBILE_FOTA", 10);
        i81 i81Var12 = new i81("MOBILE_IMS", 11);
        i81 i81Var13 = new i81("MOBILE_CBS", 12);
        i81 i81Var14 = new i81("WIFI_P2P", 13);
        i81 i81Var15 = new i81("MOBILE_IA", 14);
        i81 i81Var16 = new i81("MOBILE_EMERGENCY", 15);
        i81 i81Var17 = new i81("PROXY", 16);
        i81 i81Var18 = new i81("VPN", 17);
        i81 i81Var19 = new i81("NONE", 18);
        f4868b = new i81[]{i81Var, i81Var2, i81Var3, i81Var4, i81Var5, i81Var6, i81Var7, i81Var8, i81Var9, i81Var10, i81Var11, i81Var12, i81Var13, i81Var14, i81Var15, i81Var16, i81Var17, i81Var18, i81Var19};
        SparseArray sparseArray = new SparseArray();
        f4867a = sparseArray;
        sparseArray.put(0, i81Var);
        sparseArray.put(1, i81Var2);
        sparseArray.put(2, i81Var3);
        sparseArray.put(3, i81Var4);
        sparseArray.put(4, i81Var5);
        sparseArray.put(5, i81Var6);
        sparseArray.put(6, i81Var7);
        sparseArray.put(7, i81Var8);
        sparseArray.put(8, i81Var9);
        sparseArray.put(9, i81Var10);
        sparseArray.put(10, i81Var11);
        sparseArray.put(11, i81Var12);
        sparseArray.put(12, i81Var13);
        sparseArray.put(13, i81Var14);
        sparseArray.put(14, i81Var15);
        sparseArray.put(15, i81Var16);
        sparseArray.put(16, i81Var17);
        sparseArray.put(17, i81Var18);
        sparseArray.put(-1, i81Var19);
    }

    public static i81 valueOf(String str) {
        return (i81) Enum.valueOf(i81.class, str);
    }

    public static i81[] values() {
        return (i81[]) f4868b.clone();
    }
}
