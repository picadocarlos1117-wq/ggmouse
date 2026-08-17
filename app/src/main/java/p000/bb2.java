package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 {

    /* JADX INFO: renamed from: b */
    public static final bb2 f1284b;

    /* JADX INFO: renamed from: a */
    public final ya2 f1285a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1284b = xa2.f12512q;
        } else {
            f1284b = ya2.f12920b;
        }
    }

    public bb2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f1285a = new xa2(this, windowInsets);
        } else if (i >= 29) {
            this.f1285a = new wa2(this, windowInsets);
        } else {
            this.f1285a = new ua2(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static un0 m959e(un0 un0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, un0Var.f11368a - i);
        int iMax2 = Math.max(0, un0Var.f11369b - i2);
        int iMax3 = Math.max(0, un0Var.f11370c - i3);
        int iMax4 = Math.max(0, un0Var.f11371d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? un0Var : un0.m6514b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static bb2 m960g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        bb2 bb2Var = new bb2(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = i72.f4849a;
            if (v62.m6586b(view)) {
                bb2 bb2VarM7254a = z62.m7254a(view);
                ya2 ya2Var = bb2Var.f1285a;
                ya2Var.mo6023p(bb2VarM7254a);
                ya2Var.mo6017d(view.getRootView());
            }
        }
        return bb2Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m961a() {
        return this.f1285a.mo6019j().f11371d;
    }

    /* JADX INFO: renamed from: b */
    public final int m962b() {
        return this.f1285a.mo6019j().f11368a;
    }

    /* JADX INFO: renamed from: c */
    public final int m963c() {
        return this.f1285a.mo6019j().f11370c;
    }

    /* JADX INFO: renamed from: d */
    public final int m964d() {
        return this.f1285a.mo6019j().f11369b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bb2) {
            return i91.m3395a(this.f1285a, ((bb2) obj).f1285a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m965f() {
        ya2 ya2Var = this.f1285a;
        if (ya2Var instanceof sa2) {
            return ((sa2) ya2Var).f10341c;
        }
        return null;
    }

    public final int hashCode() {
        ya2 ya2Var = this.f1285a;
        if (ya2Var == null) {
            return 0;
        }
        return ya2Var.hashCode();
    }

    public bb2() {
        this.f1285a = new ya2(this);
    }
}
