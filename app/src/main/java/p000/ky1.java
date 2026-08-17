package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ky1 {

    /* JADX INFO: renamed from: A */
    public CharSequence f6080A;

    /* JADX INFO: renamed from: B */
    public CharSequence f6081B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ly1 f6084E;

    /* JADX INFO: renamed from: a */
    public final Menu f6085a;

    /* JADX INFO: renamed from: h */
    public boolean f6092h;

    /* JADX INFO: renamed from: i */
    public int f6093i;

    /* JADX INFO: renamed from: j */
    public int f6094j;

    /* JADX INFO: renamed from: k */
    public CharSequence f6095k;

    /* JADX INFO: renamed from: l */
    public CharSequence f6096l;

    /* JADX INFO: renamed from: m */
    public int f6097m;

    /* JADX INFO: renamed from: n */
    public char f6098n;

    /* JADX INFO: renamed from: o */
    public int f6099o;

    /* JADX INFO: renamed from: p */
    public char f6100p;

    /* JADX INFO: renamed from: q */
    public int f6101q;

    /* JADX INFO: renamed from: r */
    public int f6102r;

    /* JADX INFO: renamed from: s */
    public boolean f6103s;

    /* JADX INFO: renamed from: t */
    public boolean f6104t;

    /* JADX INFO: renamed from: u */
    public boolean f6105u;

    /* JADX INFO: renamed from: v */
    public int f6106v;

    /* JADX INFO: renamed from: w */
    public int f6107w;

    /* JADX INFO: renamed from: x */
    public String f6108x;

    /* JADX INFO: renamed from: y */
    public String f6109y;

    /* JADX INFO: renamed from: z */
    public s31 f6110z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f6082C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f6083D = null;

    /* JADX INFO: renamed from: b */
    public int f6086b = 0;

    /* JADX INFO: renamed from: c */
    public int f6087c = 0;

    /* JADX INFO: renamed from: d */
    public int f6088d = 0;

    /* JADX INFO: renamed from: e */
    public int f6089e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f6090f = true;

    /* JADX INFO: renamed from: g */
    public boolean f6091g = true;

    public ky1(ly1 ly1Var, Menu menu) {
        this.f6084E = ly1Var;
        this.f6085a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4009a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f6084E.f6556c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4010b(MenuItem menuItem) {
        ly1 ly1Var = this.f6084E;
        Context context = ly1Var.f6556c;
        boolean z = false;
        menuItem.setChecked(this.f6103s).setVisible(this.f6104t).setEnabled(this.f6105u).setCheckable(this.f6102r >= 1).setTitleCondensed(this.f6096l).setIcon(this.f6097m);
        int i = this.f6106v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f6109y != null) {
            if (context.isRestricted()) {
                f40.m2719o("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (ly1Var.f6557d == null) {
                ly1Var.f6557d = ly1.m4331a(context);
            }
            Object obj = ly1Var.f6557d;
            String str = this.f6109y;
            jy1 jy1Var = new jy1();
            jy1Var.f5599b = obj;
            Class<?> cls = obj.getClass();
            try {
                jy1Var.f5600c = cls.getMethod(str, jy1.f5597d);
                menuItem.setOnMenuItemClickListener(jy1Var);
            } catch (Exception e) {
                StringBuilder sbM5347n = AbstractC1308pu.m5347n("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM5347n.append(cls.getName());
                InflateException inflateException = new InflateException(sbM5347n.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f6102r >= 2) {
            if (menuItem instanceof r31) {
                r31 r31Var = (r31) menuItem;
                r31Var.f9694x = (r31Var.f9694x & (-5)) | 4;
            } else if (menuItem instanceof v31) {
                v31 v31Var = (v31) menuItem;
                my1 my1Var = v31Var.f11500c;
                try {
                    if (v31Var.f11501d == null) {
                        v31Var.f11501d = my1Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    v31Var.f11501d.invoke(my1Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f6108x;
        if (str2 != null) {
            menuItem.setActionView((View) m4009a(str2, ly1.f6552e, ly1Var.f6554a));
            z = true;
        }
        int i2 = this.f6107w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        s31 s31Var = this.f6110z;
        if (s31Var != null) {
            if (menuItem instanceof my1) {
                ((my1) menuItem).mo4485a(s31Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f6080A;
        boolean z2 = menuItem instanceof my1;
        if (z2) {
            ((my1) menuItem).setContentDescription(charSequence);
        } else {
            p31.m5129h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f6081B;
        if (z2) {
            ((my1) menuItem).setTooltipText(charSequence2);
        } else {
            p31.m5134m(menuItem, charSequence2);
        }
        char c = this.f6098n;
        int i3 = this.f6099o;
        if (z2) {
            ((my1) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            p31.m5128g(menuItem, c, i3);
        }
        char c2 = this.f6100p;
        int i4 = this.f6101q;
        if (z2) {
            ((my1) menuItem).setNumericShortcut(c2, i4);
        } else {
            p31.m5132k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f6083D;
        if (mode != null) {
            if (z2) {
                ((my1) menuItem).setIconTintMode(mode);
            } else {
                p31.m5131j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f6082C;
        if (colorStateList != null) {
            if (z2) {
                ((my1) menuItem).setIconTintList(colorStateList);
            } else {
                p31.m5130i(menuItem, colorStateList);
            }
        }
    }
}
