package p000;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vr1 extends wr1 {

    /* JADX INFO: renamed from: b */
    public float f11755b;

    /* JADX INFO: renamed from: c */
    public float f11756c;

    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final void mo6527a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12256a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f11755b, this.f11756c);
        path.transform(matrix);
    }
}
