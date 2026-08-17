package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends wr1 {

    /* JADX INFO: renamed from: h */
    public static final RectF f11391h = new RectF();

    /* JADX INFO: renamed from: b */
    public final float f11392b;

    /* JADX INFO: renamed from: c */
    public final float f11393c;

    /* JADX INFO: renamed from: d */
    public final float f11394d;

    /* JADX INFO: renamed from: e */
    public final float f11395e;

    /* JADX INFO: renamed from: f */
    public float f11396f;

    /* JADX INFO: renamed from: g */
    public float f11397g;

    public ur1(float f, float f2, float f3, float f4) {
        this.f11392b = f;
        this.f11393c = f2;
        this.f11394d = f3;
        this.f11395e = f4;
    }

    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final void mo6527a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12256a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.f11394d;
        float f2 = this.f11395e;
        RectF rectF = f11391h;
        rectF.set(this.f11392b, this.f11393c, f, f2);
        path.arcTo(rectF, this.f11396f, this.f11397g, false);
        path.transform(matrix);
    }
}
