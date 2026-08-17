package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sousasantoslogic.sspro.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 extends w31 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final Context f4336b;

    /* JADX INFO: renamed from: c */
    public final i31 f4337c;

    /* JADX INFO: renamed from: d */
    public final f31 f4338d;

    /* JADX INFO: renamed from: e */
    public final boolean f4339e;

    /* JADX INFO: renamed from: f */
    public final int f4340f;

    /* JADX INFO: renamed from: g */
    public final int f4341g;

    /* JADX INFO: renamed from: m */
    public final e41 f4342m;

    /* JADX INFO: renamed from: n */
    public final ViewTreeObserverOnGlobalLayoutListenerC0819k8 f4343n;

    /* JADX INFO: renamed from: o */
    public final ViewOnAttachStateChangeListenerC1410sl f4344o;

    /* JADX INFO: renamed from: p */
    public PopupWindow.OnDismissListener f4345p;

    /* JADX INFO: renamed from: q */
    public View f4346q;

    /* JADX INFO: renamed from: r */
    public View f4347r;

    /* JADX INFO: renamed from: s */
    public f41 f4348s;

    /* JADX INFO: renamed from: t */
    public ViewTreeObserver f4349t;

    /* JADX INFO: renamed from: u */
    public boolean f4350u;

    /* JADX INFO: renamed from: v */
    public boolean f4351v;

    /* JADX INFO: renamed from: w */
    public int f4352w;

    /* JADX INFO: renamed from: x */
    public int f4353x = 0;

    /* JADX INFO: renamed from: y */
    public boolean f4354y;

    public gv1(Context context, i31 i31Var, View view, int i, boolean z) {
        int i2 = 3;
        this.f4343n = new ViewTreeObserverOnGlobalLayoutListenerC0819k8(this, i2);
        this.f4344o = new ViewOnAttachStateChangeListenerC1410sl(this, i2);
        this.f4336b = context;
        this.f4337c = i31Var;
        this.f4339e = z;
        this.f4338d = new f31(i31Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f4341g = i;
        Resources resources = context.getResources();
        this.f4340f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4346q = view;
        this.f4342m = new e41(context, null, i, 0);
        i31Var.m3339b(this, context);
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: a */
    public final void mo2928a(i31 i31Var, boolean z) {
        if (i31Var != this.f4337c) {
            return;
        }
        dismiss();
        f41 f41Var = this.f4348s;
        if (f41Var != null) {
            f41Var.mo766a(i31Var, z);
        }
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: b */
    public final boolean mo3058b() {
        return !this.f4350u && this.f4342m.f8470E.isShowing();
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: c */
    public final boolean mo2929c(nx1 nx1Var) {
        boolean z;
        if (nx1Var.hasVisibleItems()) {
            z31 z31Var = new z31(this.f4336b, nx1Var, this.f4347r, this.f4339e, this.f4341g, 0);
            f41 f41Var = this.f4348s;
            z31Var.f13261h = f41Var;
            w31 w31Var = z31Var.f13262i;
            if (w31Var != null) {
                w31Var.mo2932f(f41Var);
            }
            int size = nx1Var.f4792f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = nx1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            z31Var.f13260g = z;
            w31 w31Var2 = z31Var.f13262i;
            if (w31Var2 != null) {
                w31Var2.mo3063o(z);
            }
            z31Var.f13263j = this.f4345p;
            this.f4345p = null;
            this.f4337c.m3340c(false);
            e41 e41Var = this.f4342m;
            int width = e41Var.f8476f;
            int iM5062p = e41Var.m5062p();
            int i2 = this.f4353x;
            View view = this.f4346q;
            WeakHashMap weakHashMap = i72.f4849a;
            if ((Gravity.getAbsoluteGravity(i2, t62.m6240d(view)) & 7) == 5) {
                width += this.f4346q.getWidth();
            }
            if (!z31Var.m7188b()) {
                if (z31Var.f13258e != null) {
                    z31Var.m7189d(width, iM5062p, true, true);
                }
            }
            f41 f41Var2 = this.f4348s;
            if (f41Var2 != null) {
                f41Var2.mo782r(nx1Var);
            }
            return true;
        }
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: d */
    public final boolean mo2930d() {
        return false;
    }

    @Override // p000.us1
    public final void dismiss() {
        if (mo3058b()) {
            this.f4342m.dismiss();
        }
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: f */
    public final void mo2932f(f41 f41Var) {
        this.f4348s = f41Var;
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: g */
    public final void mo3059g() {
        View view;
        if (mo3058b()) {
            return;
        }
        if (this.f4350u || (view = this.f4346q) == null) {
            f40.m2719o("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.f4347r = view;
        e41 e41Var = this.f4342m;
        C0126c8 c0126c8 = e41Var.f8470E;
        C0126c8 c0126c9 = e41Var.f8470E;
        c0126c8.setOnDismissListener(this);
        e41Var.f8486u = this;
        e41Var.f8469D = true;
        c0126c9.setFocusable(true);
        View view2 = this.f4347r;
        boolean z = this.f4349t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4349t = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4343n);
        }
        view2.addOnAttachStateChangeListener(this.f4344o);
        e41Var.f8485t = view2;
        e41Var.f8482q = this.f4353x;
        boolean z2 = this.f4351v;
        Context context = this.f4336b;
        f31 f31Var = this.f4338d;
        if (!z2) {
            this.f4352w = w31.m6700m(f31Var, context, this.f4340f);
            this.f4351v = true;
        }
        e41Var.m5063r(this.f4352w);
        c0126c9.setInputMethodMode(2);
        Rect rect = this.f11960a;
        e41Var.f8468C = rect != null ? new Rect(rect) : null;
        e41Var.mo3059g();
        m40 m40Var = e41Var.f8473c;
        m40Var.setOnKeyListener(this);
        if (this.f4354y) {
            i31 i31Var = this.f4337c;
            if (i31Var.f4799m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m40Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(i31Var.f4799m);
                }
                frameLayout.setEnabled(false);
                m40Var.addHeaderView(frameLayout, null, false);
            }
        }
        e41Var.mo4730q(f31Var);
        e41Var.mo3059g();
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: i */
    public final void mo2934i() {
        this.f4351v = false;
        f31 f31Var = this.f4338d;
        if (f31Var != null) {
            f31Var.notifyDataSetChanged();
        }
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: j */
    public final m40 mo3060j() {
        return this.f4342m.f8473c;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: n */
    public final void mo3062n(View view) {
        this.f4346q = view;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: o */
    public final void mo3063o(boolean z) {
        this.f4338d.f3600c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4350u = true;
        this.f4337c.m3340c(true);
        ViewTreeObserver viewTreeObserver = this.f4349t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4349t = this.f4347r.getViewTreeObserver();
            }
            this.f4349t.removeGlobalOnLayoutListener(this.f4343n);
            this.f4349t = null;
        }
        this.f4347r.removeOnAttachStateChangeListener(this.f4344o);
        PopupWindow.OnDismissListener onDismissListener = this.f4345p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: p */
    public final void mo3064p(int i) {
        this.f4353x = i;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: q */
    public final void mo3065q(int i) {
        this.f4342m.f8476f = i;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: r */
    public final void mo3066r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4345p = onDismissListener;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: s */
    public final void mo3067s(boolean z) {
        this.f4354y = z;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: t */
    public final void mo3068t(int i) {
        this.f4342m.m5061m(i);
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: l */
    public final void mo3061l(i31 i31Var) {
    }
}
