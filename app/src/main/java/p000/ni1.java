package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ni1 implements InterfaceC1230on {

    /* JADX INFO: renamed from: m */
    public static final ni1 f7415m = new ni1(3, 1);

    /* JADX INFO: renamed from: n */
    public static final ni1 f7416n = new ni1(3, 2);

    /* JADX INFO: renamed from: o */
    public static final ni1 f7417o = new ni1(3, 3);

    /* JADX INFO: renamed from: p */
    public static final ni1 f7418p = new ni1(5, 1);

    /* JADX INFO: renamed from: q */
    public static final ni1 f7419q = new ni1(5, 2);

    /* JADX INFO: renamed from: r */
    public static final ni1 f7420r = new ni1(5, 3);

    /* JADX INFO: renamed from: a */
    public final int f7421a;

    /* JADX INFO: renamed from: b */
    public final int f7422b;

    /* JADX INFO: renamed from: c */
    public final int f7423c;

    /* JADX INFO: renamed from: d */
    public final int f7424d;

    /* JADX INFO: renamed from: e */
    public final int f7425e;

    /* JADX INFO: renamed from: f */
    public final aw0 f7426f;

    /* JADX INFO: renamed from: g */
    public final int f7427g;

    public ni1(int i, int i2) {
        if (i == 3) {
            this.f7421a = 68;
            this.f7422b = 32;
            this.f7423c = 48;
            on1 on1Var = new on1();
            sc2.m6075s(on1Var);
            AbstractC0728hv.m3295a();
            on1Var.mo733o();
            this.f7426f = on1Var;
        } else {
            if (i != 5) {
                f40.m2713i("No valid version. Please choose one of the following: 3, 5");
                throw null;
            }
            this.f7421a = 96;
            this.f7422b = 36;
            this.f7423c = 64;
            this.f7426f = new qn1();
        }
        int i3 = this.f7421a;
        int i4 = this.f7422b;
        int i5 = this.f7423c;
        this.f7424d = i3 + i4 + i5;
        this.f7425e = i4 + i5;
        this.f7427g = i2;
    }
}
