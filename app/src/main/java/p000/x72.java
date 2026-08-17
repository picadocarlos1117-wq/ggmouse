package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x72 extends AbstractC0727hu {

    /* JADX INFO: renamed from: a */
    public vz0 f12475a;

    @Override // p000.AbstractC0727hu
    /* JADX INFO: renamed from: k */
    public boolean mo1632k(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo1645v(coordinatorLayout, view, i);
        if (this.f12475a == null) {
            this.f12475a = new vz0(view);
        }
        vz0 vz0Var = this.f12475a;
        View view2 = vz0Var.f11875a;
        vz0Var.f11876b = view2.getTop();
        vz0Var.f11877c = view2.getLeft();
        vz0 vz0Var2 = this.f12475a;
        View view3 = vz0Var2.f11875a;
        int top = 0 - (view3.getTop() - vz0Var2.f11876b);
        WeakHashMap weakHashMap = i72.f4849a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - vz0Var2.f11877c));
        return true;
    }

    /* JADX INFO: renamed from: v */
    public void mo1645v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m301q(view, i);
    }
}
