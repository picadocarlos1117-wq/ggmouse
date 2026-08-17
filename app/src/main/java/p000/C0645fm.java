package p000;

import java.util.List;

/* JADX INFO: renamed from: fm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0645fm extends AbstractC1570wx implements qx1 {

    /* JADX INFO: renamed from: n */
    public qx1 f3850n;

    /* JADX INFO: renamed from: o */
    public long f3851o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f3852p = 0;

    /* JADX INFO: renamed from: q */
    public Object f3853q;

    public C0645fm(C0715hi c0715hi) {
        super(1);
        this.f3853q = c0715hi;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: c */
    public final int mo2822c(long j) {
        qx1 qx1Var = this.f3850n;
        qx1Var.getClass();
        return qx1Var.mo2822c(j - this.f3851o);
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: d */
    public final long mo2823d(int i) {
        qx1 qx1Var = this.f3850n;
        qx1Var.getClass();
        return qx1Var.mo2823d(i) + this.f3851o;
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: e */
    public final List mo2824e(long j) {
        qx1 qx1Var = this.f3850n;
        qx1Var.getClass();
        return qx1Var.mo2824e(j - this.f3851o);
    }

    @Override // p000.qx1
    /* JADX INFO: renamed from: g */
    public final int mo2825g() {
        qx1 qx1Var = this.f3850n;
        qx1Var.getClass();
        return qx1Var.mo2825g();
    }

    @Override // p000.AbstractC1570wx
    /* JADX INFO: renamed from: r */
    public final void mo2826r() {
        this.f7542b = 0;
        this.f12349g = 0L;
        this.f12350m = false;
        this.f3850n = null;
    }

    @Override // p000.AbstractC1570wx
    /* JADX INFO: renamed from: s */
    public final void mo2827s() {
        switch (this.f3852p) {
            case 0:
                AbstractC0682gm abstractC0682gm = (AbstractC0682gm) ((C1521vl) this.f3853q).f11701b;
                mo2826r();
                abstractC0682gm.f4236b.add(this);
                break;
            default:
                ((C0715hi) this.f3853q).m3150k(this);
                break;
        }
    }

    public /* synthetic */ C0645fm() {
        super(1);
    }
}
