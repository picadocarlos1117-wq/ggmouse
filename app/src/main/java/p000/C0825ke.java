package p000;

/* JADX INFO: renamed from: ke */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class C0825ke implements kq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5779a;

    /* JADX INFO: renamed from: b */
    public final long f5780b;

    /* JADX INFO: renamed from: c */
    public final Object f5781c;

    public C0825ke(long j, long j2) {
        this.f5779a = 2;
        this.f5780b = j;
        mq1 mq1Var = j2 == 0 ? mq1.f7075c : new mq1(0L, j2);
        this.f5781c = new jq1(mq1Var, mq1Var);
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: c */
    public final boolean mo6c() {
        switch (this.f5779a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: h */
    public final jq1 mo7h(long j) {
        int i = this.f5779a;
        int i2 = 1;
        Object obj = this.f5781c;
        switch (i) {
            case 0:
                C1068le c1068le = (C1068le) obj;
                jq1 jq1VarM4563b = c1068le.f6334i[0].m4563b(j);
                while (true) {
                    C1151nn[] c1151nnArr = c1068le.f6334i;
                    if (i2 >= c1151nnArr.length) {
                        return jq1VarM4563b;
                    }
                    jq1 jq1VarM4563b2 = c1151nnArr[i2].m4563b(j);
                    if (jq1VarM4563b2.f5494a.f7077b < jq1VarM4563b.f5494a.f7077b) {
                        jq1VarM4563b = jq1VarM4563b2;
                    }
                    i2++;
                }
                break;
            case 1:
                db0 db0Var = (db0) obj;
                ki0.m3866j(db0Var.f2869k);
                C0558d8 c0558d8 = db0Var.f2869k;
                long[] jArr = (long[]) c0558d8.f2821b;
                long[] jArr2 = (long[]) c0558d8.f2822c;
                int iM7230d = z42.m7230d(jArr, z42.m7234h((((long) db0Var.f2863e) * j) / 1000000, 0L, db0Var.f2868j - 1), false);
                long j2 = iM7230d == -1 ? 0L : jArr[iM7230d];
                long j3 = iM7230d != -1 ? jArr2[iM7230d] : 0L;
                int i3 = db0Var.f2863e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.f5780b;
                mq1 mq1Var = new mq1(j4, j3 + j5);
                if (j4 == j || iM7230d == jArr.length - 1) {
                    return new jq1(mq1Var, mq1Var);
                }
                int i4 = iM7230d + 1;
                return new jq1(mq1Var, new mq1((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (jq1) obj;
        }
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: j */
    public final long mo8j() {
        switch (this.f5779a) {
            case 0:
                return this.f5780b;
            case 1:
                return ((db0) this.f5781c).m2308b();
            default:
                return this.f5780b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0825ke(long j) {
        this(j, 0L);
        this.f5779a = 2;
    }

    public /* synthetic */ C0825ke(Object obj, int i, long j) {
        this.f5779a = i;
        this.f5781c = obj;
        this.f5780b = j;
    }
}
