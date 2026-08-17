package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: pm */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1300pm extends t22 {

    /* JADX INFO: renamed from: C */
    public static final String[] f8935C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: D */
    public static final C1076lm f8936D;

    /* JADX INFO: renamed from: E */
    public static final C1076lm f8937E;

    /* JADX INFO: renamed from: F */
    public static final C1076lm f8938F;

    /* JADX INFO: renamed from: G */
    public static final C1076lm f8939G;

    /* JADX INFO: renamed from: H */
    public static final C1076lm f8940H;

    static {
        new C0833km(PointF.class, "boundsOrigin").f5899a = new Rect();
        f8936D = new C1076lm("topLeft", 0, PointF.class);
        f8937E = new C1076lm("bottomRight", 1, PointF.class);
        f8938F = new C1076lm("bottomRight", 2, PointF.class);
        f8939G = new C1076lm("topLeft", 3, PointF.class);
        f8940H = new C1076lm("position", 4, PointF.class);
    }

    /* JADX INFO: renamed from: I */
    public static void m5281I(z22 z22Var) {
        View view = z22Var.f13248b;
        HashMap map = z22Var.f13247a;
        WeakHashMap weakHashMap = i72.f4849a;
        if (!v62.m6587c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: d */
    public final void mo2558d(z22 z22Var) {
        m5281I(z22Var);
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: g */
    public final void mo2559g(z22 z22Var) {
        m5281I(z22Var);
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: l */
    public final Animator mo2560l(ViewGroup viewGroup, z22 z22Var, z22 z22Var2) {
        int i;
        C1300pm c1300pm;
        Animator animatorOfObject;
        if (z22Var == null) {
            return null;
        }
        HashMap map = z22Var.f13247a;
        if (z22Var2 == null) {
            return null;
        }
        HashMap map2 = z22Var2.f13247a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = z22Var2.f13248b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        g82.m2942a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            c1300pm = this;
            if (i2 == i3 && i4 == i5) {
                c1300pm.f10732y.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f8938F, (TypeConverter) null, pu0.m5360m(i6, i8, i7, i9));
            } else {
                c1300pm.f10732y.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f8939G, (TypeConverter) null, pu0.m5360m(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            c1300pm = this;
            c1300pm.f10732y.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, f8940H, (TypeConverter) null, pu0.m5360m(i2, i4, i3, i5));
        } else {
            c1300pm = this;
            C1229om c1229om = new C1229om();
            c1229om.f8398e = view;
            c1300pm.f10732y.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c1229om, f8936D, (TypeConverter) null, pu0.m5360m(i2, i4, i3, i5));
            c1300pm.f10732y.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c1229om, f8937E, (TypeConverter) null, pu0.m5360m(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new C1113mm(c1229om));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            hp0.m3205O(viewGroup4, true);
            c1300pm.m6205a(new C1150nm(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: q */
    public final String[] mo2561q() {
        return f8935C;
    }
}
