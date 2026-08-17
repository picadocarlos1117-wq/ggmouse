package p000;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e90 extends t22 {

    /* JADX INFO: renamed from: D */
    public static final String[] f3295D = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: C */
    public final int f3296C;

    public e90() {
        this.f3296C = 3;
    }

    /* JADX INFO: renamed from: I */
    public static void m2555I(z22 z22Var) {
        View view = z22Var.f13248b;
        int visibility = view.getVisibility();
        HashMap map = z22Var.f13247a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX INFO: renamed from: K */
    public static p82 m2556K(z22 z22Var, z22 z22Var2) {
        p82 p82Var = new p82();
        p82Var.f8806a = false;
        p82Var.f8807b = false;
        if (z22Var != null) {
            HashMap map = z22Var.f13247a;
            if (map.containsKey("android:visibility:visibility")) {
                p82Var.f8808c = ((Integer) map.get("android:visibility:visibility")).intValue();
                p82Var.f8810e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                p82Var.f8808c = -1;
                p82Var.f8810e = null;
            }
        } else {
            p82Var.f8808c = -1;
            p82Var.f8810e = null;
        }
        if (z22Var2 != null) {
            HashMap map2 = z22Var2.f13247a;
            if (map2.containsKey("android:visibility:visibility")) {
                p82Var.f8809d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                p82Var.f8811f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                p82Var.f8809d = -1;
                p82Var.f8811f = null;
            }
        } else {
            p82Var.f8809d = -1;
            p82Var.f8811f = null;
        }
        if (z22Var != null && z22Var2 != null) {
            int i = p82Var.f8808c;
            int i2 = p82Var.f8809d;
            if (i != i2 || p82Var.f8810e != p82Var.f8811f) {
                if (i != i2) {
                    if (i == 0) {
                        p82Var.f8807b = false;
                        p82Var.f8806a = true;
                        return p82Var;
                    }
                    if (i2 == 0) {
                        p82Var.f8807b = true;
                        p82Var.f8806a = true;
                        return p82Var;
                    }
                } else {
                    if (p82Var.f8811f == null) {
                        p82Var.f8807b = false;
                        p82Var.f8806a = true;
                        return p82Var;
                    }
                    if (p82Var.f8810e == null) {
                        p82Var.f8807b = true;
                        p82Var.f8806a = true;
                        return p82Var;
                    }
                }
            }
        } else {
            if (z22Var == null && p82Var.f8809d == 0) {
                p82Var.f8807b = true;
                p82Var.f8806a = true;
                return p82Var;
            }
            if (z22Var2 == null && p82Var.f8808c == 0) {
                p82Var.f8807b = false;
                p82Var.f8806a = true;
            }
        }
        return p82Var;
    }

    /* JADX INFO: renamed from: J */
    public final ObjectAnimator m2557J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        g82.f4100a.mo3577f0(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, g82.f4101b, f2);
        objectAnimatorOfFloat.addListener(new d90(view));
        m6205a(new c90(view, 0));
        return objectAnimatorOfFloat;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: d */
    public final void mo2558d(z22 z22Var) {
        m2555I(z22Var);
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: g */
    public final void mo2559g(z22 z22Var) {
        m2555I(z22Var);
        z22Var.f13247a.put("android:fade:transitionAlpha", Float.valueOf(g82.f4100a.mo3576M(z22Var.f13248b)));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x0217  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (m2556K(m6214o(r3, false), m6215r(r3, false)).f8806a != false) goto L9;
     */
    @Override // p000.t22
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo2560l(android.view.ViewGroup r23, p000.z22 r24, p000.z22 r25) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e90.mo2560l(android.view.ViewGroup, z22, z22):android.animation.Animator");
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: q */
    public final String[] mo2561q() {
        return f3295D;
    }

    @Override // p000.t22
    /* JADX INFO: renamed from: s */
    public final boolean mo2562s(z22 z22Var, z22 z22Var2) {
        if (z22Var == null && z22Var2 == null) {
            return false;
        }
        if (z22Var != null && z22Var2 != null && z22Var2.f13247a.containsKey("android:visibility:visibility") != z22Var.f13247a.containsKey("android:visibility:visibility")) {
            return false;
        }
        p82 p82VarM2556K = m2556K(z22Var, z22Var2);
        if (p82VarM2556K.f8806a) {
            return p82VarM2556K.f8808c == 0 || p82VarM2556K.f8809d == 0;
        }
        return false;
    }

    public e90(int i) {
        this();
        this.f3296C = i;
    }
}
