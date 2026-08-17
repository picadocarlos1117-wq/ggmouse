package p000;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class p12 extends o21 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8663i;

    /* JADX INFO: renamed from: j */
    public boolean f8664j;

    /* JADX INFO: renamed from: k */
    public int f8665k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f8666l;

    public p12(c82 c82Var) {
        this.f8663i = 1;
        this.f8666l = c82Var;
        this.f8664j = false;
        this.f8665k = 0;
    }

    @Override // p000.o21, p000.d82
    /* JADX INFO: renamed from: a */
    public void mo2288a() {
        switch (this.f8663i) {
            case 0:
                this.f8664j = true;
                break;
        }
    }

    @Override // p000.o21, p000.d82
    /* JADX INFO: renamed from: e */
    public final void mo2289e() {
        int i = this.f8663i;
        Object obj = this.f8666l;
        switch (i) {
            case 0:
                ((q12) obj).f9293a.setVisibility(0);
                break;
            default:
                if (!this.f8664j) {
                    this.f8664j = true;
                    d82 d82Var = ((c82) obj).f1703d;
                    if (d82Var != null) {
                        d82Var.mo2289e();
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: f */
    public final void mo139f() {
        int i = this.f8663i;
        Object obj = this.f8666l;
        switch (i) {
            case 0:
                if (!this.f8664j) {
                    ((q12) obj).f9293a.setVisibility(this.f8665k);
                }
                break;
            default:
                int i2 = this.f8665k + 1;
                this.f8665k = i2;
                c82 c82Var = (c82) obj;
                if (i2 == c82Var.f1700a.size()) {
                    d82 d82Var = c82Var.f1703d;
                    if (d82Var != null) {
                        d82Var.mo139f();
                    }
                    this.f8665k = 0;
                    this.f8664j = false;
                    c82Var.f1704e = false;
                }
                break;
        }
    }

    public p12(q12 q12Var, int i) {
        this.f8663i = 0;
        this.f8666l = q12Var;
        this.f8665k = i;
        this.f8664j = false;
    }
}
