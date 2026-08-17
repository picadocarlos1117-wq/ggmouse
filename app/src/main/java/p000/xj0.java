package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xj0 extends xb2 {

    /* JADX INFO: renamed from: e */
    public final int f12621e;

    /* JADX INFO: renamed from: f */
    public final int f12622f;

    public xj0(wj0 wj0Var) {
        super(wj0Var);
        this.f12621e = wj0Var.f12191e;
        this.f12622f = wj0Var.f12192f;
    }

    @Override // p000.xb2
    /* JADX INFO: renamed from: a */
    public final byte[] mo3113a() {
        byte[] bArrMo3113a = super.mo3113a();
        sc2.m6081y(0, 16, bArrMo3113a);
        sc2.m6081y(this.f12621e, 20, bArrMo3113a);
        sc2.m6081y(this.f12622f, 24, bArrMo3113a);
        return bArrMo3113a;
    }
}
