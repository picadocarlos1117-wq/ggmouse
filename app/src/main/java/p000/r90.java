package p000;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class r90 extends oj1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s90 f9830a;

    public r90(s90 s90Var) {
        this.f9830a = s90Var;
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: b */
    public final void mo4807b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        s90 s90Var = this.f9830a;
        int i3 = s90Var.f10287a;
        int iComputeVerticalScrollRange = s90Var.f10305s.computeVerticalScrollRange();
        int i4 = s90Var.f10304r;
        s90Var.f10306t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = s90Var.f10305s.computeHorizontalScrollRange();
        int i5 = s90Var.f10303q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        s90Var.f10307u = z;
        boolean z2 = s90Var.f10306t;
        if (!z2 && !z) {
            if (s90Var.f10308v != 0) {
                s90Var.m6011f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            s90Var.f10298l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            s90Var.f10297k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (s90Var.f10307u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            s90Var.f10301o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            s90Var.f10300n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = s90Var.f10308v;
        if (i6 == 0 || i6 == 1) {
            s90Var.m6011f(1);
        }
    }
}
