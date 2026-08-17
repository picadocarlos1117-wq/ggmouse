package p000;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class e41 extends ot0 implements q31 {

    /* JADX INFO: renamed from: I */
    public static final Method f3189I;

    /* JADX INFO: renamed from: H */
    public ay0 f3190H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3189I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p000.ot0
    /* JADX INFO: renamed from: a */
    public final m40 mo2498a(Context context, boolean z) {
        d41 d41Var = new d41(context, z);
        d41Var.setHoverListener(this);
        return d41Var;
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: e */
    public final void mo769e(i31 i31Var, MenuItem menuItem) {
        ay0 ay0Var = this.f3190H;
        if (ay0Var != null) {
            ay0Var.mo769e(i31Var, menuItem);
        }
    }

    @Override // p000.q31
    /* JADX INFO: renamed from: l */
    public final void mo776l(i31 i31Var, r31 r31Var) {
        ay0 ay0Var = this.f3190H;
        if (ay0Var != null) {
            ay0Var.mo776l(i31Var, r31Var);
        }
    }
}
