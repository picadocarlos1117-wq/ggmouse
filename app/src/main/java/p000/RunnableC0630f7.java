package p000;

import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: f7 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0630f7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C1359r7 f3645b;

    public /* synthetic */ RunnableC0630f7(LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7, int i) {
        this.f3644a = i;
        this.f3645b = layoutInflaterFactory2C1359r7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f3644a;
        LayoutInflaterFactory2C1359r7 layoutInflaterFactory2C1359r7 = this.f3645b;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C1359r7.f9783e0 & 1) != 0) {
                    layoutInflaterFactory2C1359r7.m5735v(0);
                }
                if ((layoutInflaterFactory2C1359r7.f9783e0 & 4096) != 0) {
                    layoutInflaterFactory2C1359r7.m5735v(108);
                }
                layoutInflaterFactory2C1359r7.f9782d0 = false;
                layoutInflaterFactory2C1359r7.f9783e0 = 0;
                break;
            default:
                layoutInflaterFactory2C1359r7.f9754B.showAtLocation(layoutInflaterFactory2C1359r7.f9753A, 55, 0, 0);
                b82 b82Var = layoutInflaterFactory2C1359r7.f9756D;
                if (b82Var != null) {
                    b82Var.m943b();
                }
                if (layoutInflaterFactory2C1359r7.f9757E && (viewGroup = layoutInflaterFactory2C1359r7.f9758F) != null) {
                    WeakHashMap weakHashMap = i72.f4849a;
                    if (v62.m6587c(viewGroup)) {
                        layoutInflaterFactory2C1359r7.f9753A.setAlpha(TouchPipeline.SIZE);
                        b82 b82VarM3369a = i72.m3369a(layoutInflaterFactory2C1359r7.f9753A);
                        b82VarM3369a.m942a(1.0f);
                        layoutInflaterFactory2C1359r7.f9756D = b82VarM3369a;
                        b82VarM3369a.m945d(new C0704h7(this, 0));
                    }
                }
                layoutInflaterFactory2C1359r7.f9753A.setAlpha(1.0f);
                layoutInflaterFactory2C1359r7.f9753A.setVisibility(0);
                break;
        }
    }
}
