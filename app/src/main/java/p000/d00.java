package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 {

    /* JADX INFO: renamed from: a */
    public final String f2693a;

    /* JADX INFO: renamed from: b */
    public int f2694b;

    /* JADX INFO: renamed from: c */
    public long f2695c;

    /* JADX INFO: renamed from: d */
    public final q21 f2696d;

    /* JADX INFO: renamed from: e */
    public boolean f2697e;

    /* JADX INFO: renamed from: f */
    public boolean f2698f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ e00 f2699g;

    public d00(e00 e00Var, String str, int i, q21 q21Var) {
        this.f2699g = e00Var;
        this.f2693a = str;
        this.f2694b = i;
        this.f2695c = q21Var == null ? -1L : q21Var.f9312d;
        if (q21Var == null || !q21Var.m5438b()) {
            return;
        }
        this.f2696d = q21Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2156a(C1542w5 c1542w5) {
        q21 q21Var = c1542w5.f11973d;
        t02 t02Var = c1542w5.f11971b;
        if (q21Var == null) {
            return this.f2694b != c1542w5.f11972c;
        }
        long j = this.f2695c;
        if (j == -1) {
            return false;
        }
        if (q21Var.f9312d > j) {
            return true;
        }
        q21 q21Var2 = this.f2696d;
        if (q21Var2 == null) {
            return false;
        }
        int i = q21Var2.f9310b;
        int iMo1054b = t02Var.mo1054b(q21Var.f9309a);
        int iMo1054b2 = t02Var.mo1054b(q21Var2.f9309a);
        if (q21Var.f9312d < q21Var2.f9312d || iMo1054b < iMo1054b2) {
            return false;
        }
        if (iMo1054b > iMo1054b2) {
            return true;
        }
        if (!q21Var.m5438b()) {
            int i2 = q21Var.f9313e;
            return i2 == -1 || i2 > i;
        }
        int i3 = q21Var.f9310b;
        int i4 = q21Var.f9311c;
        if (i3 <= i) {
            return i3 == i && i4 > q21Var2.f9311c;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2157b(t02 t02Var, t02 t02Var2) {
        q21 q21Var;
        int i = this.f2694b;
        if (i < t02Var.mo1059o()) {
            e00 e00Var = this.f2699g;
            s02 s02Var = e00Var.f3092a;
            t02Var.m6175n(i, s02Var);
            int i2 = s02Var.f10192l;
            while (true) {
                if (i2 > s02Var.f10193m) {
                    i = -1;
                    break;
                }
                int iMo1054b = t02Var2.mo1054b(t02Var.mo1057l(i2));
                if (iMo1054b != -1) {
                    i = t02Var2.mo1055f(iMo1054b, e00Var.f3093b, false).f9651c;
                    break;
                }
                i2++;
            }
        } else if (i >= t02Var2.mo1059o()) {
            i = -1;
            break;
        }
        this.f2694b = i;
        return i != -1 && ((q21Var = this.f2696d) == null || t02Var2.mo1054b(q21Var.f9309a) != -1);
    }
}
