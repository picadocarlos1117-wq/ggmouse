package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class j82 extends i82 {
    @Override // p000.p32
    /* JADX INFO: renamed from: M */
    public final float mo3576M(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000.p32
    /* JADX INFO: renamed from: f0 */
    public final void mo3577f0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.i82
    /* JADX INFO: renamed from: p0 */
    public final void mo3389p0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.i82
    /* JADX INFO: renamed from: q0 */
    public final void mo3390q0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.i82
    /* JADX INFO: renamed from: r0 */
    public final void mo3391r0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.i82
    /* JADX INFO: renamed from: s0 */
    public final void mo3392s0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
