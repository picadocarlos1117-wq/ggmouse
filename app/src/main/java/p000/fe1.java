package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe1 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3772a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3773b;

    public /* synthetic */ fe1(Object obj, int i) {
        this.f3772a = i;
        this.f3773b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        int i9 = this.f3772a;
        Object obj = this.f3773b;
        switch (i9) {
            case 0:
                re1 re1Var = (re1) obj;
                int i10 = re1Var.f9989q;
                PopupWindow popupWindow = re1Var.f9987p;
                int i11 = i4 - i2;
                int i12 = i8 - i6;
                if ((i3 - i != i7 - i5 || i11 != i12) && popupWindow.isShowing()) {
                    re1Var.m5833q();
                    popupWindow.update(view, (re1Var.getWidth() - popupWindow.getWidth()) - i10, (-popupWindow.getHeight()) - i10, -1, -1);
                }
                break;
            default:
                we1 we1Var = (we1) obj;
                re1 re1Var2 = we1Var.f12094a;
                int width = (re1Var2.getWidth() - re1Var2.getPaddingLeft()) - re1Var2.getPaddingRight();
                int height3 = (re1Var2.getHeight() - re1Var2.getPaddingBottom()) - re1Var2.getPaddingTop();
                ViewGroup viewGroup = we1Var.f12096c;
                int iM6762c = we1.m6762c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iM6762c, we1.m6762c(we1Var.f12104k) + we1.m6762c(we1Var.f12102i));
                ViewGroup viewGroup2 = we1Var.f12097d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (we1Var.f12091A != z) {
                    we1Var.f12091A = z;
                    view.post(new se1(we1Var, 1));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!we1Var.f12091A && z2) {
                    view.post(new se1(we1Var, 2));
                    break;
                }
                break;
        }
    }
}
