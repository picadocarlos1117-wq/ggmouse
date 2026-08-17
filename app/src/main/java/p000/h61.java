package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class h61 {

    /* JADX INFO: renamed from: a */
    public final zs1 f4458a = new zs1();

    /* JADX INFO: renamed from: b */
    public final zs1 f4459b = new zs1();

    /* JADX INFO: renamed from: a */
    public static h61 m3110a(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m3111b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m3111b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static h61 m3111b(ArrayList arrayList) {
        h61 h61Var = new h61();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                l41.m4038g(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            h61Var.f4459b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0779j6.f5285b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0779j6.f5286c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0779j6.f5287d;
            }
            i61 i61Var = new i61();
            i61Var.f4838d = 0;
            i61Var.f4839e = 1;
            i61Var.f4835a = startDelay;
            i61Var.f4836b = duration;
            i61Var.f4837c = interpolator;
            i61Var.f4838d = objectAnimator.getRepeatCount();
            i61Var.f4839e = objectAnimator.getRepeatMode();
            h61Var.f4458a.put(propertyName, i61Var);
        }
        return h61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h61) {
            return this.f4458a.equals(((h61) obj).f4458a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4458a.hashCode();
    }

    public final String toString() {
        return "\n" + h61.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4458a + "}\n";
    }
}
