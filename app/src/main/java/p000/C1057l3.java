package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1057l3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6159b;

    public /* synthetic */ C1057l3(Object obj, int i) {
        this.f6158a = i;
        this.f6159b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6158a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6159b;
                actionBarOverlayLayout.f401B = null;
                actionBarOverlayLayout.f416p = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f6158a;
        Object obj = this.f6159b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f401B = null;
                actionBarOverlayLayout.f416p = false;
                break;
            case 1:
                C0740i6 c0740i6 = (C0740i6) obj;
                ArrayList arrayList = new ArrayList(c0740i6.f4832e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((rz0) arrayList.get(i2)).f10163b.f11069t;
                    if (colorStateList != null) {
                        v30.m6560h(c0740i6, colorStateList);
                    }
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.m1657I(5);
                WeakReference weakReference = bottomSheetBehavior.f1975U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.f1975U.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                p40 p40Var = (p40) obj;
                p40Var.m6869p();
                p40Var.f8713r.start();
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).f1947h = null;
                break;
            case 5:
                fz0 fz0Var = (fz0) obj;
                fz0Var.f13609b.setTranslationY(TouchPipeline.SIZE);
                fz0Var.m2873b(TouchPipeline.SIZE);
                break;
            case 6:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.m1695w(5);
                WeakReference weakReference2 = sideSheetBehavior.f2103p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.f2103p.get()).requestLayout();
                    break;
                }
                break;
            default:
                ((t22) obj).m6213n();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6158a) {
            case 1:
                C0740i6 c0740i6 = (C0740i6) this.f6159b;
                ArrayList arrayList = new ArrayList(c0740i6.f4832e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    tz0 tz0Var = ((rz0) arrayList.get(i)).f10163b;
                    ColorStateList colorStateList = tz0Var.f11069t;
                    if (colorStateList != null) {
                        v30.m6559g(c0740i6, colorStateList.getColorForState(tz0Var.f11073x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
