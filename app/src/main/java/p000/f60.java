package p000;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class f60 extends rc2 {

    /* JADX INFO: renamed from: i */
    public final e60 f3623i;

    public f60(TextView textView) {
        this.f3623i = new e60(textView);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: I */
    public final InputFilter[] mo2530I(InputFilter[] inputFilterArr) {
        return !(t50.f10753j != null) ? inputFilterArr : this.f3623i.mo2530I(inputFilterArr);
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: n0 */
    public final void mo2531n0(boolean z) {
        if (t50.f10753j != null) {
            this.f3623i.mo2531n0(z);
        }
    }

    @Override // p000.rc2
    /* JADX INFO: renamed from: o0 */
    public final void mo2532o0(boolean z) {
        boolean z2 = t50.f10753j != null;
        e60 e60Var = this.f3623i;
        if (z2) {
            e60Var.mo2532o0(z);
        } else {
            e60Var.f3218k = z;
        }
    }
}
