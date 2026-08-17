package p000;

/* JADX INFO: renamed from: ji */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0792ji implements x80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5390a;

    /* JADX INFO: renamed from: b */
    public final x80 f5391b;

    public C0792ji(byte b, int i) {
        this.f5390a = i;
        switch (i) {
            case 1:
                this.f5391b = new ct1(35152, 2, "image/png");
                break;
            default:
                this.f5391b = new ct1(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: b */
    public final int mo124b(y80 y80Var, bb0 bb0Var) {
        int i = this.f5390a;
        x80 x80Var = this.f5391b;
        switch (i) {
            case 0:
                return ((ct1) x80Var).mo124b(y80Var, bb0Var);
            case 1:
                return ((ct1) x80Var).mo124b(y80Var, bb0Var);
            default:
                return x80Var.mo124b(y80Var, bb0Var);
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: e */
    public final boolean mo125e(y80 y80Var) {
        int i = this.f5390a;
        x80 x80Var = this.f5391b;
        switch (i) {
            case 0:
                return ((ct1) x80Var).mo125e(y80Var);
            case 1:
                return ((ct1) x80Var).mo125e(y80Var);
            default:
                return x80Var.mo125e(y80Var);
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: f */
    public final void mo126f(long j, long j2) {
        int i = this.f5390a;
        x80 x80Var = this.f5391b;
        switch (i) {
            case 0:
                ((ct1) x80Var).mo126f(j, j2);
                break;
            case 1:
                ((ct1) x80Var).mo126f(j, j2);
                break;
            default:
                x80Var.mo126f(j, j2);
                break;
        }
    }

    @Override // p000.x80
    /* JADX INFO: renamed from: k */
    public final void mo127k(z80 z80Var) {
        int i = this.f5390a;
        x80 x80Var = this.f5391b;
        switch (i) {
            case 0:
                ((ct1) x80Var).mo127k(z80Var);
                break;
            case 1:
                ((ct1) x80Var).mo127k(z80Var);
                break;
            default:
                x80Var.mo127k(z80Var);
                break;
        }
    }

    @Override // p000.x80
    public final void release() {
        switch (this.f5390a) {
            case 0:
            case 1:
                break;
            default:
                this.f5391b.release();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3643a() {
    }

    /* JADX INFO: renamed from: c */
    private final void m3644c() {
    }

    public C0792ji(int i) {
        this.f5390a = 2;
        if ((i & 1) != 0) {
            this.f5391b = new ct1(65496, 2, "image/jpeg");
        } else {
            this.f5391b = new cq0();
        }
    }
}
