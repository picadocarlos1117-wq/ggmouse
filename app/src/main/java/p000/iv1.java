package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class iv1 extends ie0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kq1 f5183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1289pb f5184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv1(C1289pb c1289pb, kq1 kq1Var, kq1 kq1Var2) {
        super(kq1Var);
        this.f5184c = c1289pb;
        this.f5183b = kq1Var2;
    }

    @Override // p000.ie0, p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        jq1 jq1VarMo7h = this.f5183b.mo7h(j);
        mq1 mq1Var = jq1VarMo7h.f5494a;
        long j2 = mq1Var.f7076a;
        long j3 = mq1Var.f7077b;
        long j4 = this.f5184c.f8826b;
        mq1 mq1Var2 = new mq1(j2, j3 + j4);
        mq1 mq1Var3 = jq1VarMo7h.f5495b;
        return new jq1(mq1Var2, new mq1(mq1Var3.f7076a, mq1Var3.f7077b + j4));
    }
}
