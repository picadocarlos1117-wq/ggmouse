package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e81 {

    /* JADX INFO: renamed from: a */
    public ViewParent f3284a;

    /* JADX INFO: renamed from: b */
    public ViewParent f3285b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3286c;

    /* JADX INFO: renamed from: d */
    public boolean f3287d;

    /* JADX INFO: renamed from: e */
    public int[] f3288e;

    public e81(ViewGroup viewGroup) {
        this.f3286c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2547a(float f, float f2, boolean z) {
        ViewParent viewParentM2551e;
        if (this.f3287d && (viewParentM2551e = m2551e(0)) != null) {
            try {
                return y72.m7030a(viewParentM2551e, this.f3286c, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2551e + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2548b(float f, float f2) {
        ViewParent viewParentM2551e;
        if (this.f3287d && (viewParentM2551e = m2551e(0)) != null) {
            try {
                return y72.m7031b(viewParentM2551e, this.f3286c, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2551e + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2549c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM2551e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f3287d || (viewParentM2551e = m2551e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3286c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f3288e == null) {
                this.f3288e = new int[2];
            }
            iArr3 = this.f3288e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM2551e instanceof f81) {
            ((f81) viewParentM2551e).mo225f(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                y72.m7032c(viewParentM2551e, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2551e + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup = viewGroup;
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        viewGroup = viewGroup;
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2550d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM2551e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f3287d && (viewParentM2551e = m2551e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f3286c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3288e == null) {
                        this.f3288e = new int[2];
                    }
                    int[] iArr4 = this.f3288e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM2551e instanceof g81) {
                    ((g81) viewParentM2551e).mo220a(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM2551e instanceof f81) {
                        ((f81) viewParentM2551e).mo221b(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            y72.m7033d(viewParentM2551e, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM2551e + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final ViewParent m2551e(int i) {
        if (i == 0) {
            return this.f3284a;
        }
        if (i != 1) {
            return null;
        }
        return this.f3285b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2552f(int i) {
        return m2551e(i) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2553g(int i, int i2) {
        boolean zM7035f;
        if (!m2552f(i2)) {
            if (this.f3287d) {
                ViewGroup viewGroup = this.f3286c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof f81;
                    if (z) {
                        zM7035f = ((f81) parent).mo222c(view, viewGroup, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zM7035f = y72.m7035f(parent, view, viewGroup, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zM7035f = false;
                        }
                    } else {
                        zM7035f = false;
                    }
                    if (zM7035f) {
                        if (i2 == 0) {
                            this.f3284a = parent;
                        } else if (i2 == 1) {
                            this.f3285b = parent;
                        }
                        if (z) {
                            ((f81) parent).mo223d(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                y72.m7034e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m2554h(int i) {
        ViewParent viewParentM2551e = m2551e(i);
        if (viewParentM2551e != null) {
            boolean z = viewParentM2551e instanceof f81;
            ViewGroup viewGroup = this.f3286c;
            if (z) {
                ((f81) viewParentM2551e).mo224e(viewGroup, i);
            } else if (i == 0) {
                try {
                    y72.m7036g(viewParentM2551e, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM2551e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f3284a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f3285b = null;
            }
        }
    }
}
