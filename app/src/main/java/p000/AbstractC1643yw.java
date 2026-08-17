package p000;

/* JADX INFO: renamed from: yw */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1643yw {

    /* JADX INFO: renamed from: a */
    public static final C1310pw f13157a;

    /* JADX INFO: renamed from: b */
    public static final C1347qw f13158b;

    static {
        C1310pw c1310pw = new C1310pw(1);
        c1310pw.f9182d = -1;
        f13157a = c1310pw;
        C1347qw c1347qw = new C1347qw();
        c1347qw.f9591e = -1;
        f13158b = c1347qw;
    }

    /* JADX INFO: renamed from: a */
    public static C1310pw m7156a(C0733i c0733i) {
        if (c0733i.f4753c < 1) {
            return f13157a;
        }
        C1310pw c1310pw = new C1310pw(c0733i, 1);
        c1310pw.f9182d = -1;
        return c1310pw;
    }

    /* JADX INFO: renamed from: b */
    public static C1347qw m7157b(C0733i c0733i) {
        if (c0733i.f4753c < 1) {
            return f13158b;
        }
        C1347qw c1347qw = new C1347qw(c0733i);
        c1347qw.f9591e = -1;
        return c1347qw;
    }
}
