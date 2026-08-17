package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xv1 {

    /* JADX INFO: renamed from: b */
    public c22 f12738b;

    /* JADX INFO: renamed from: c */
    public z80 f12739c;

    /* JADX INFO: renamed from: d */
    public o91 f12740d;

    /* JADX INFO: renamed from: e */
    public long f12741e;

    /* JADX INFO: renamed from: f */
    public long f12742f;

    /* JADX INFO: renamed from: g */
    public long f12743g;

    /* JADX INFO: renamed from: h */
    public int f12744h;

    /* JADX INFO: renamed from: i */
    public int f12745i;

    /* JADX INFO: renamed from: k */
    public long f12747k;

    /* JADX INFO: renamed from: l */
    public boolean f12748l;

    /* JADX INFO: renamed from: m */
    public boolean f12749m;

    /* JADX INFO: renamed from: a */
    public final m91 f12737a = new m91();

    /* JADX INFO: renamed from: j */
    public qo0 f12746j = new qo0(19, false);

    /* JADX INFO: renamed from: a */
    public void mo6406a(long j) {
        this.f12743g = j;
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo1199b(dc1 dc1Var);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1200c(dc1 dc1Var, long j, qo0 qo0Var);

    /* JADX INFO: renamed from: d */
    public void mo1201d(boolean z) {
        if (z) {
            this.f12746j = new qo0(19, false);
            this.f12742f = 0L;
            this.f12744h = 0;
        } else {
            this.f12744h = 1;
        }
        this.f12741e = -1L;
        this.f12743g = 0L;
    }
}
