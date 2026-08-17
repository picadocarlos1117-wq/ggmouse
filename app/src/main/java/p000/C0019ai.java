package p000;

/* JADX INFO: renamed from: ai */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0019ai implements kq1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0136ci f234a;

    /* JADX INFO: renamed from: b */
    public final long f235b;

    /* JADX INFO: renamed from: c */
    public final long f236c;

    /* JADX INFO: renamed from: d */
    public final long f237d;

    /* JADX INFO: renamed from: e */
    public final long f238e;

    /* JADX INFO: renamed from: f */
    public final long f239f;

    public C0019ai(InterfaceC0136ci interfaceC0136ci, long j, long j2, long j3, long j4, long j5) {
        this.f234a = interfaceC0136ci;
        this.f235b = j;
        this.f236c = j2;
        this.f237d = j3;
        this.f238e = j4;
        this.f239f = j5;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        return true;
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        mq1 mq1Var = new mq1(j, C0100bi.m994a(this.f234a.mo1221f(j), 0L, this.f236c, this.f237d, this.f238e, this.f239f));
        return new jq1(mq1Var, mq1Var);
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        return this.f235b;
    }
}
