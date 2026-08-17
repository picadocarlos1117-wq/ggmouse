package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 {

    /* JADX INFO: renamed from: a */
    public final pn0 f4080a;

    /* JADX INFO: renamed from: b */
    public final c62 f4081b;

    /* JADX INFO: renamed from: c */
    public final b62 f4082c = new b62();

    /* JADX INFO: renamed from: d */
    public final C0716hj f4083d = new C0716hj();

    /* JADX INFO: renamed from: e */
    public final C0716hj f4084e = new C0716hj();

    /* JADX INFO: renamed from: f */
    public final C0799jp f4085f;

    /* JADX INFO: renamed from: g */
    public m62 f4086g;

    /* JADX INFO: renamed from: h */
    public m62 f4087h;

    /* JADX INFO: renamed from: i */
    public long f4088i;

    /* JADX INFO: renamed from: j */
    public long f4089j;

    public g62(pn0 pn0Var, c62 c62Var) {
        this.f4080a = pn0Var;
        this.f4081b = c62Var;
        C0799jp c0799jp = new C0799jp();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c0799jp.f5482a = 0;
        c0799jp.f5483b = 0;
        c0799jp.f5485d = new long[iHighestOneBit];
        c0799jp.f5484c = iHighestOneBit - 1;
        this.f4085f = c0799jp;
        this.f4087h = m62.f6671d;
        this.f4089j = -9223372036854775807L;
    }
}
