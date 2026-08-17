package p000;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class jy1 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: d */
    public static final Class[] f5597d = {MenuItem.class};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5598a = 0;

    /* JADX INFO: renamed from: b */
    public Object f5599b;

    /* JADX INFO: renamed from: c */
    public Object f5600c;

    public jy1(v31 v31Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5600c = v31Var;
        this.f5599b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.f5598a) {
            case 0:
                Object obj = this.f5599b;
                Method method = (Method) this.f5600c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    ca0.m1184p(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.f5599b).onMenuItemClick(((v31) this.f5600c).m4715f(menuItem));
        }
    }

    public /* synthetic */ jy1() {
    }
}
