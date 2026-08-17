package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class op1 {

    /* JADX INFO: renamed from: a */
    public static final op1 f8418a;

    /* JADX INFO: renamed from: b */
    public static final op1 f8419b;

    /* JADX INFO: renamed from: c */
    public static final op1 f8420c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ op1[] f8421d;

    static {
        op1 op1Var = new op1("NETWORK_UNMETERED", 0);
        f8418a = op1Var;
        op1 op1Var2 = new op1("DEVICE_IDLE", 1);
        f8419b = op1Var2;
        op1 op1Var3 = new op1("DEVICE_CHARGING", 2);
        f8420c = op1Var3;
        f8421d = new op1[]{op1Var, op1Var2, op1Var3};
    }

    public static op1 valueOf(String str) {
        return (op1) Enum.valueOf(op1.class, str);
    }

    public static op1[] values() {
        return (op1[]) f8421d.clone();
    }
}
