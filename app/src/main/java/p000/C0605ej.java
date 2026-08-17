package p000;

/* JADX INFO: renamed from: ej */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605ej {

    /* JADX INFO: renamed from: a */
    public final int f3355a;

    /* JADX INFO: renamed from: b */
    public int f3356b;

    /* JADX INFO: renamed from: c */
    public int f3357c;

    /* JADX INFO: renamed from: d */
    public long f3358d;

    /* JADX INFO: renamed from: e */
    public final boolean f3359e;

    /* JADX INFO: renamed from: f */
    public final dc1 f3360f;

    /* JADX INFO: renamed from: g */
    public final dc1 f3361g;

    /* JADX INFO: renamed from: h */
    public int f3362h;

    /* JADX INFO: renamed from: i */
    public int f3363i;

    public C0605ej(dc1 dc1Var, dc1 dc1Var2, boolean z) throws fc1 {
        this.f3361g = dc1Var;
        this.f3360f = dc1Var2;
        this.f3359e = z;
        dc1Var2.m2316F(12);
        this.f3355a = dc1Var2.m2341x();
        dc1Var.m2316F(12);
        this.f3363i = dc1Var.m2341x();
        o21.m4663j("first_chunk must be 1", dc1Var.m2324g() == 1);
        this.f3356b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2588a() {
        int i = this.f3356b + 1;
        this.f3356b = i;
        if (i == this.f3355a) {
            return false;
        }
        boolean z = this.f3359e;
        dc1 dc1Var = this.f3360f;
        this.f3358d = z ? dc1Var.m2342y() : dc1Var.m2339v();
        if (this.f3356b == this.f3362h) {
            dc1 dc1Var2 = this.f3361g;
            this.f3357c = dc1Var2.m2341x();
            dc1Var2.m2317G(4);
            int i2 = this.f3363i - 1;
            this.f3363i = i2;
            this.f3362h = i2 > 0 ? dc1Var2.m2341x() - 1 : -1;
        }
        return true;
    }
}
