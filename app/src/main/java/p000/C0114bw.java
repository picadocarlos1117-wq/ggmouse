package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: bw */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0114bw extends yz0 {

    /* JADX INFO: renamed from: q */
    public final RectF f1561q;

    public C0114bw(C0114bw c0114bw) {
        super(c0114bw);
        this.f1561q = c0114bw.f1561q;
    }

    @Override // p000.yz0, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0545cw c0545cw = new C0545cw(this);
        c0545cw.f2650C = this;
        c0545cw.invalidateSelf();
        return c0545cw;
    }

    public C0114bw(pr1 pr1Var, RectF rectF) {
        super(pr1Var);
        this.f1561q = rectF;
    }
}
