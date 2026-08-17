package p000;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sa2 extends ya2 {

    /* JADX INFO: renamed from: h */
    public static boolean f10336h = false;

    /* JADX INFO: renamed from: i */
    public static Method f10337i;

    /* JADX INFO: renamed from: j */
    public static Class f10338j;

    /* JADX INFO: renamed from: k */
    public static Field f10339k;

    /* JADX INFO: renamed from: l */
    public static Field f10340l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f10341c;

    /* JADX INFO: renamed from: d */
    public un0[] f10342d;

    /* JADX INFO: renamed from: e */
    public un0 f10343e;

    /* JADX INFO: renamed from: f */
    public bb2 f10344f;

    /* JADX INFO: renamed from: g */
    public un0 f10345g;

    public sa2(bb2 bb2Var, WindowInsets windowInsets) {
        super(bb2Var);
        this.f10343e = null;
        this.f10341c = windowInsets;
    }

    /* JADX INFO: renamed from: r */
    private un0 m6013r(int i, boolean z) {
        un0 un0VarM6513a = un0.f11367e;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                un0VarM6513a = un0.m6513a(un0VarM6513a, m6024s(i2, z));
            }
        }
        return un0VarM6513a;
    }

    /* JADX INFO: renamed from: t */
    private un0 m6014t() {
        bb2 bb2Var = this.f10344f;
        return bb2Var != null ? bb2Var.f1285a.mo6261h() : un0.f11367e;
    }

    /* JADX INFO: renamed from: u */
    private un0 m6015u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0694gy.m3079e("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f10336h) {
            m6016v();
        }
        Method method = f10337i;
        if (method != null && f10338j != null && f10339k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f10339k.get(f10340l.get(objInvoke));
                if (rect != null) {
                    return un0.m6514b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    private static void m6016v() {
        try {
            f10337i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f10338j = cls;
            f10339k = cls.getDeclaredField("mVisibleInsets");
            f10340l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f10339k.setAccessible(true);
            f10340l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f10336h = true;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: d */
    public void mo6017d(View view) {
        un0 un0VarM6015u = m6015u(view);
        if (un0VarM6015u == null) {
            un0VarM6015u = un0.f11367e;
        }
        m6025w(un0VarM6015u);
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: f */
    public un0 mo6018f(int i) {
        return m6013r(i, false);
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: j */
    public final un0 mo6019j() {
        if (this.f10343e == null) {
            WindowInsets windowInsets = this.f10341c;
            this.f10343e = un0.m6514b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f10343e;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: l */
    public bb2 mo6020l(int i, int i2, int i3, int i4) {
        ra2 pa2Var;
        bb2 bb2VarM960g = bb2.m960g(null, this.f10341c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            pa2Var = new qa2(bb2VarM960g);
        } else {
            pa2Var = i5 >= 29 ? new pa2(bb2VarM960g) : new oa2(bb2VarM960g);
        }
        pa2Var.mo4789g(bb2.m959e(mo6019j(), i, i2, i3, i4));
        pa2Var.mo4788e(bb2.m959e(mo6261h(), i, i2, i3, i4));
        return pa2Var.mo4787b();
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: n */
    public boolean mo6021n() {
        return this.f10341c.isRound();
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: o */
    public void mo6022o(un0[] un0VarArr) {
        this.f10342d = un0VarArr;
    }

    @Override // p000.ya2
    /* JADX INFO: renamed from: p */
    public void mo6023p(bb2 bb2Var) {
        this.f10344f = bb2Var;
    }

    /* JADX INFO: renamed from: s */
    public un0 m6024s(int i, boolean z) {
        un0 un0VarMo6261h;
        int i2;
        if (i == 1) {
            return z ? un0.m6514b(0, Math.max(m6014t().f11369b, mo6019j().f11369b), 0, 0) : un0.m6514b(0, mo6019j().f11369b, 0, 0);
        }
        if (i == 2) {
            if (z) {
                un0 un0VarM6014t = m6014t();
                un0 un0VarMo6261h2 = mo6261h();
                return un0.m6514b(Math.max(un0VarM6014t.f11368a, un0VarMo6261h2.f11368a), 0, Math.max(un0VarM6014t.f11370c, un0VarMo6261h2.f11370c), Math.max(un0VarM6014t.f11371d, un0VarMo6261h2.f11371d));
            }
            un0 un0VarMo6019j = mo6019j();
            bb2 bb2Var = this.f10344f;
            un0VarMo6261h = bb2Var != null ? bb2Var.f1285a.mo6261h() : null;
            int iMin = un0VarMo6019j.f11371d;
            if (un0VarMo6261h != null) {
                iMin = Math.min(iMin, un0VarMo6261h.f11371d);
            }
            return un0.m6514b(un0VarMo6019j.f11368a, 0, un0VarMo6019j.f11370c, iMin);
        }
        un0 un0Var = un0.f11367e;
        if (i == 8) {
            un0[] un0VarArr = this.f10342d;
            un0VarMo6261h = un0VarArr != null ? un0VarArr[ua0.m6426E(8)] : null;
            if (un0VarMo6261h != null) {
                return un0VarMo6261h;
            }
            un0 un0VarMo6019j2 = mo6019j();
            un0 un0VarM6014t2 = m6014t();
            int i3 = un0VarMo6019j2.f11371d;
            if (i3 > un0VarM6014t2.f11371d) {
                return un0.m6514b(0, 0, 0, i3);
            }
            un0 un0Var2 = this.f10345g;
            if (un0Var2 != null && !un0Var2.equals(un0Var) && (i2 = this.f10345g.f11371d) > un0VarM6014t2.f11371d) {
                return un0.m6514b(0, 0, 0, i2);
            }
        } else {
            if (i == 16) {
                return mo6738i();
            }
            if (i == 32) {
                return mo6737g();
            }
            if (i == 64) {
                return mo6739k();
            }
            if (i == 128) {
                bb2 bb2Var2 = this.f10344f;
                v20 v20VarMo6481e = bb2Var2 != null ? bb2Var2.f1285a.mo6481e() : mo6481e();
                if (v20VarMo6481e != null) {
                    DisplayCutout displayCutout = v20VarMo6481e.f11496a;
                    return un0.m6514b(u20.m6376d(displayCutout), u20.m6378f(displayCutout), u20.m6377e(displayCutout), u20.m6375c(displayCutout));
                }
            }
        }
        return un0Var;
    }

    /* JADX INFO: renamed from: w */
    public void m6025w(un0 un0Var) {
        this.f10345g = un0Var;
    }
}
