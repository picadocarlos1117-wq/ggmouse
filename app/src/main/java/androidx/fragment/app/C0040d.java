package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.sousasantoslogic.sspro.R;
import p000.C0558d8;
import p000.ki0;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040d extends AbstractC0041e {

    /* JADX INFO: renamed from: c */
    public boolean f677c;

    /* JADX INFO: renamed from: d */
    public boolean f678d;

    /* JADX INFO: renamed from: e */
    public C0558d8 f679e;

    /* JADX WARN: Code duplicated, block: B:74:0x00f4 A[Catch: RuntimeException -> 0x00fa, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fa, blocks: (B:72:0x00ee, B:74:0x00f4), top: B:85:0x00ee }] */
    /* JADX INFO: renamed from: c */
    public final C0558d8 m335c(Context context) {
        int enterAnim;
        C0558d8 c0558d8;
        Animator animatorLoadAnimator;
        int iM3858c0;
        if (this.f678d) {
            return this.f679e;
        }
        C0061y c0061y = this.f680a;
        AbstractComponentCallbacksC0048l abstractComponentCallbacksC0048l = c0061y.f769c;
        boolean z = c0061y.f767a == 2;
        boolean z2 = this.f677c;
        int nextTransition = abstractComponentCallbacksC0048l.getNextTransition();
        if (z2) {
            enterAnim = z ? abstractComponentCallbacksC0048l.getPopEnterAnim() : abstractComponentCallbacksC0048l.getPopExitAnim();
        } else {
            enterAnim = z ? abstractComponentCallbacksC0048l.getEnterAnim() : abstractComponentCallbacksC0048l.getExitAnim();
        }
        abstractComponentCallbacksC0048l.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0048l.mContainer;
        C0558d8 c0558d9 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0048l.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0048l.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = abstractComponentCallbacksC0048l.onCreateAnimation(nextTransition, z, enterAnim);
            if (animationOnCreateAnimation != null) {
                c0558d9 = new C0558d8(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = abstractComponentCallbacksC0048l.onCreateAnimator(nextTransition, z, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    c0558d9 = new C0558d8(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iM3858c0 = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iM3858c0 = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iM3858c0 = z ? ki0.m3858c0(context, android.R.attr.activityCloseEnterAnimation) : ki0.m3858c0(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iM3858c0 = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iM3858c0 = -1;
                        } else {
                            iM3858c0 = z ? ki0.m3858c0(context, android.R.attr.activityOpenEnterAnimation) : ki0.m3858c0(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iM3858c0;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    c0558d8 = new C0558d8(animationLoadAnimation);
                                    c0558d9 = c0558d8;
                                }
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        c0558d8 = new C0558d8(animatorLoadAnimator);
                                        c0558d9 = c0558d8;
                                    }
                                } catch (RuntimeException e2) {
                                    if (zEquals) {
                                        throw e2;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        c0558d9 = new C0558d8(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                c0558d8 = new C0558d8(animatorLoadAnimator);
                                c0558d9 = c0558d8;
                            }
                        }
                    }
                }
            }
        }
        this.f679e = c0558d9;
        this.f678d = true;
        return c0558d9;
    }
}
