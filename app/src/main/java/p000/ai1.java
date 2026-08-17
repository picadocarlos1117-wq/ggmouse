package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ai1 {

    /* JADX INFO: renamed from: a */
    public static final ai1 f240a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ai1[] f241b;

    static {
        ai1 ai1Var = new ai1("DEFAULT", 0);
        f240a = ai1Var;
        ai1 ai1Var2 = new ai1("UNMETERED_ONLY", 1);
        ai1 ai1Var3 = new ai1("UNMETERED_OR_DAILY", 2);
        ai1 ai1Var4 = new ai1("FAST_IF_RADIO_AWAKE", 3);
        ai1 ai1Var5 = new ai1("NEVER", 4);
        ai1 ai1Var6 = new ai1("UNRECOGNIZED", 5);
        f241b = new ai1[]{ai1Var, ai1Var2, ai1Var3, ai1Var4, ai1Var5, ai1Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, ai1Var);
        sparseArray.put(1, ai1Var2);
        sparseArray.put(2, ai1Var3);
        sparseArray.put(3, ai1Var4);
        sparseArray.put(4, ai1Var5);
        sparseArray.put(-1, ai1Var6);
    }

    public static ai1 valueOf(String str) {
        return (ai1) Enum.valueOf(ai1.class, str);
    }

    public static ai1[] values() {
        return (ai1[]) f241b.clone();
    }
}
