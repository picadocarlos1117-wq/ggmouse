package p000;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 extends o21 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f120i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ da2 f121j;

    public /* synthetic */ aa2(da2 da2Var, int i) {
        this.f120i = i;
        this.f121j = da2Var;
    }

    @Override // p000.d82
    /* JADX INFO: renamed from: f */
    public final void mo139f() {
        View view;
        int i = this.f120i;
        da2 da2Var = this.f121j;
        switch (i) {
            case 0:
                if (da2Var.f2849o && (view = da2Var.f2841g) != null) {
                    view.setTranslationY(TouchPipeline.SIZE);
                    da2Var.f2838d.setTranslationY(TouchPipeline.SIZE);
                }
                da2Var.f2838d.setVisibility(8);
                da2Var.f2838d.setTransitioning(false);
                da2Var.f2853s = null;
                C0558d8 c0558d8 = da2Var.f2845k;
                if (c0558d8 != null) {
                    c0558d8.mo70c(da2Var.f2844j);
                    da2Var.f2844j = null;
                    da2Var.f2845k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = da2Var.f2837c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = i72.f4849a;
                    w62.m6726c(actionBarOverlayLayout);
                }
                break;
            default:
                da2Var.f2853s = null;
                da2Var.f2838d.requestLayout();
                break;
        }
    }
}
