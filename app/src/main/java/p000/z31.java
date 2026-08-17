package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class z31 {

    /* JADX INFO: renamed from: a */
    public final Context f13254a;

    /* JADX INFO: renamed from: b */
    public final i31 f13255b;

    /* JADX INFO: renamed from: c */
    public final boolean f13256c;

    /* JADX INFO: renamed from: d */
    public final int f13257d;

    /* JADX INFO: renamed from: e */
    public View f13258e;

    /* JADX INFO: renamed from: g */
    public boolean f13260g;

    /* JADX INFO: renamed from: h */
    public f41 f13261h;

    /* JADX INFO: renamed from: i */
    public w31 f13262i;

    /* JADX INFO: renamed from: j */
    public PopupWindow.OnDismissListener f13263j;

    /* JADX INFO: renamed from: f */
    public int f13259f = 8388611;

    /* JADX INFO: renamed from: k */
    public final x31 f13264k = new x31(this);

    public z31(Context context, i31 i31Var, View view, boolean z, int i, int i2) {
        this.f13254a = context;
        this.f13255b = i31Var;
        this.f13258e = view;
        this.f13256c = z;
        this.f13257d = i;
    }

    /* JADX INFO: renamed from: a */
    public final w31 m7187a() {
        w31 gv1Var;
        if (this.f13262i == null) {
            Context context = this.f13254a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            y31.m6997a(defaultDisplay, point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f13254a;
            if (iMin >= dimensionPixelSize) {
                gv1Var = new ViewOnKeyListenerC1484ul(context2, this.f13258e, this.f13257d, this.f13256c);
            } else {
                gv1Var = new gv1(context2, this.f13255b, this.f13258e, this.f13257d, this.f13256c);
            }
            gv1Var.mo3061l(this.f13255b);
            gv1Var.mo3066r(this.f13264k);
            gv1Var.mo3062n(this.f13258e);
            gv1Var.mo2932f(this.f13261h);
            gv1Var.mo3063o(this.f13260g);
            gv1Var.mo3064p(this.f13259f);
            this.f13262i = gv1Var;
        }
        return this.f13262i;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7188b() {
        w31 w31Var = this.f13262i;
        return w31Var != null && w31Var.mo3058b();
    }

    /* JADX INFO: renamed from: c */
    public void mo5970c() {
        this.f13262i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13263j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7189d(int i, int i2, boolean z, boolean z2) {
        w31 w31VarM7187a = m7187a();
        w31VarM7187a.mo3067s(z2);
        if (z) {
            int i3 = this.f13259f;
            View view = this.f13258e;
            WeakHashMap weakHashMap = i72.f4849a;
            if ((Gravity.getAbsoluteGravity(i3, t62.m6240d(view)) & 7) == 5) {
                i -= this.f13258e.getWidth();
            }
            w31VarM7187a.mo3065q(i);
            w31VarM7187a.mo3068t(i2);
            int i4 = (int) ((this.f13254a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            w31VarM7187a.f11960a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        w31VarM7187a.mo3059g();
    }
}
