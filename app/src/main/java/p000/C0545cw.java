package p000;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: cw */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0545cw extends zz0 {

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ int f2649D = 0;

    /* JADX INFO: renamed from: C */
    public C0114bw f2650C;

    @Override // p000.zz0
    /* JADX INFO: renamed from: e */
    public final void mo2130e(Canvas canvas) {
        if (this.f2650C.f1561q.isEmpty()) {
            super.mo2130e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f2650C.f1561q);
        super.mo2130e(canvas);
        canvas.restore();
    }

    @Override // p000.zz0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f2650C = new C0114bw(this.f2650C);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m2131n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f2650C.f1561q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
