package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0704h7 extends o21 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4462i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f4463j;

    public /* synthetic */ C0704h7(Object obj, int i) {
        this.f4462i = i;
        this.f4463j = obj;
    }

    @Override // p000.o21, p000.d82
    /* JADX INFO: renamed from: e */
    public void mo2289e() {
        int i = this.f4462i;
        Object obj = this.f4463j;
        switch (i) {
            case 0:
                ((RunnableC0630f7) obj).f3645b.f9753A.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = (LayoutInflaterFactory2C1359r7) obj;
                layoutInflaterFactory2C1359r7.f9753A.setVisibility(0);
                if (layoutInflaterFactory2C1359r7.f9753A.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1359r7.f9753A.getParent();
                    WeakHashMap weakHashMap = i72.f4849a;
                    w62.m6726c(view);
                }
                break;
        }
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: f */
    public final void mo139f() {
        int i = this.f4462i;
        Object obj = this.f4463j;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = ((RunnableC0630f7) obj).f3645b;
                layoutInflaterFactory2C1359r7.f9753A.setAlpha(1.0f);
                layoutInflaterFactory2C1359r7.f9756D.m945d(null);
                layoutInflaterFactory2C1359r7.f9756D = null;
                break;
            case 1:
                LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r8 = (LayoutInflaterFactory2C1359r7) obj;
                layoutInflaterFactory2C1359r8.f9753A.setAlpha(1.0f);
                layoutInflaterFactory2C1359r8.f9756D.m945d(null);
                layoutInflaterFactory2C1359r8.f9756D = null;
                break;
            default:
                LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r9 = (LayoutInflaterFactory2C1359r7) ((C0558d8) obj).f2822c;
                layoutInflaterFactory2C1359r9.f9753A.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C1359r9.f9754B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1359r9.f9753A.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1359r9.f9753A.getParent();
                    WeakHashMap weakHashMap = i72.f4849a;
                    w62.m6726c(view);
                }
                layoutInflaterFactory2C1359r9.f9753A.m216e();
                layoutInflaterFactory2C1359r9.f9756D.m945d(null);
                layoutInflaterFactory2C1359r9.f9756D = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1359r9.f9758F;
                WeakHashMap weakHashMap2 = i72.f4849a;
                w62.m6726c(viewGroup);
                break;
        }
    }
}
