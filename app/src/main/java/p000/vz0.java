package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vz0 implements ha1 {

    /* JADX INFO: renamed from: a */
    public final View f11875a;

    /* JADX INFO: renamed from: b */
    public int f11876b;

    /* JADX INFO: renamed from: c */
    public int f11877c;

    public vz0(View view, int i, int i2) {
        this.f11876b = i;
        this.f11875a = view;
        this.f11877c = i2;
    }

    @Override // p000.ha1
    /* JADX INFO: renamed from: v */
    public bb2 mo786v(View view, bb2 bb2Var) {
        int i = bb2Var.f1285a.mo6018f(7).f11369b;
        int i2 = this.f11876b;
        View view2 = this.f11875a;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f11877c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return bb2Var;
    }

    public vz0(View view) {
        this.f11875a = view;
    }
}
