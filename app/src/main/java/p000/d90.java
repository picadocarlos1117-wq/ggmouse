package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class d90 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2828a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f2829b = false;

    /* JADX INFO: renamed from: c */
    public final Object f2830c;

    public d90(s90 s90Var) {
        this.f2830c = s90Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2828a) {
            case 1:
                this.f2829b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f2828a;
        Object obj = this.f2830c;
        switch (i) {
            case 0:
                View view = (View) obj;
                g82.f4100a.mo3577f0(view, 1.0f);
                if (this.f2829b) {
                    view.setLayerType(0, null);
                }
                break;
            default:
                s90 s90Var = (s90) obj;
                if (this.f2829b) {
                    this.f2829b = false;
                } else if (((Float) s90Var.f10312z.getAnimatedValue()).floatValue() != TouchPipeline.SIZE) {
                    s90Var.f10285A = 2;
                    s90Var.f10305s.invalidate();
                } else {
                    s90Var.f10285A = 0;
                    s90Var.m6011f(0);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2828a) {
            case 0:
                View view = (View) this.f2830c;
                WeakHashMap weakHashMap = i72.f4849a;
                if (s62.m5987h(view) && view.getLayerType() == 0) {
                    this.f2829b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public d90(View view) {
        this.f2830c = view;
    }
}
