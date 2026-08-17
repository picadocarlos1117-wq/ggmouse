package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class wa2 extends ua2 {

    /* JADX INFO: renamed from: n */
    public un0 f12042n;

    /* JADX INFO: renamed from: o */
    public un0 f12043o;

    /* JADX INFO: renamed from: p */
    public un0 f12044p;

    public wa2(bb2 bb2Var, WindowInsets windowInsets) {
        super(bb2Var, windowInsets);
        this.f12042n = null;
        this.f12043o = null;
        this.f12044p = null;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: g */
    public un0 mo6737g() {
        if (this.f12043o == null) {
            this.f12043o = un0.m6515c(this.f10341c.getMandatorySystemGestureInsets());
        }
        return this.f12043o;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: i */
    public un0 mo6738i() {
        if (this.f12042n == null) {
            this.f12042n = un0.m6515c(this.f10341c.getSystemGestureInsets());
        }
        return this.f12042n;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: k */
    public un0 mo6739k() {
        if (this.f12044p == null) {
            this.f12044p = un0.m6515c(this.f10341c.getTappableElementInsets());
        }
        return this.f12044p;
    }

    @Override // p000.sa2, p000.ya2
    /* JADX INFO: renamed from: l */
    public bb2 mo6020l(int i, int i2, int i3, int i4) {
        return bb2.m960g(null, this.f10341c.inset(i, i2, i3, i4));
    }

    @Override // p000.ta2, p000.ya2
    /* JADX INFO: renamed from: q */
    public void mo6263q(un0 un0Var) {
    }
}
