package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1540w3 implements g41 {

    /* JADX INFO: renamed from: A */
    public C1429t3 f11937A;

    /* JADX INFO: renamed from: a */
    public final Context f11939a;

    /* JADX INFO: renamed from: b */
    public Context f11940b;

    /* JADX INFO: renamed from: c */
    public i31 f11941c;

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f11942d;

    /* JADX INFO: renamed from: e */
    public f41 f11943e;

    /* JADX INFO: renamed from: m */
    public j41 f11946m;

    /* JADX INFO: renamed from: n */
    public C1503v3 f11947n;

    /* JADX INFO: renamed from: o */
    public Drawable f11948o;

    /* JADX INFO: renamed from: p */
    public boolean f11949p;

    /* JADX INFO: renamed from: q */
    public boolean f11950q;

    /* JADX INFO: renamed from: r */
    public boolean f11951r;

    /* JADX INFO: renamed from: s */
    public int f11952s;

    /* JADX INFO: renamed from: t */
    public int f11953t;

    /* JADX INFO: renamed from: u */
    public int f11954u;

    /* JADX INFO: renamed from: v */
    public boolean f11955v;

    /* JADX INFO: renamed from: x */
    public C1392s3 f11957x;

    /* JADX INFO: renamed from: y */
    public C1392s3 f11958y;

    /* JADX INFO: renamed from: z */
    public RunnableC1466u3 f11959z;

    /* JADX INFO: renamed from: f */
    public final int f11944f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g */
    public final int f11945g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: w */
    public final SparseBooleanArray f11956w = new SparseBooleanArray();

    /* JADX INFO: renamed from: B */
    public final ay0 f11938B = new ay0(this, 2);

    public C1540w3(Context context) {
        this.f11939a = context;
        this.f11942d = LayoutInflater.from(context);
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: a */
    public final void mo2928a(i31 i31Var, boolean z) {
        m6695g();
        C1392s3 c1392s3 = this.f11958y;
        if (c1392s3 != null && c1392s3.m7188b()) {
            c1392s3.f13262i.dismiss();
        }
        f41 f41Var = this.f11943e;
        if (f41Var != null) {
            f41Var.mo766a(i31Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final View m6694b(r31 r31Var, View view, ViewGroup viewGroup) {
        View actionView = r31Var.getActionView();
        if (actionView == null || r31Var.m5679e()) {
            i41 i41Var = view instanceof i41 ? (i41) view : (i41) this.f11942d.inflate(this.f11945g, viewGroup, false);
            i41Var.mo205c(r31Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) i41Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f11946m);
            if (this.f11937A == null) {
                this.f11937A = new C1429t3(this);
            }
            actionMenuItemView.setPopupCallback(this.f11937A);
            actionView = (View) i41Var;
        }
        actionView.setVisibility(r31Var.f9670C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1614y3)) {
            actionView.setLayoutParams(ActionMenuView.m232k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.g41
    /* JADX INFO: renamed from: c */
    public final boolean mo2929c(nx1 nx1Var) {
        boolean z;
        if (nx1Var.hasVisibleItems()) {
            nx1 nx1Var2 = nx1Var;
            while (true) {
                i31 i31Var = nx1Var2.f7581z;
                if (i31Var == this.f11941c) {
                    break;
                }
                nx1Var2 = (nx1) i31Var;
            }
            r31 r31Var = nx1Var2.f7580A;
            ViewGroup viewGroup = (ViewGroup) this.f11946m;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof i41) && ((i41) childAt).getItemData() == r31Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                nx1Var.f7580A.getClass();
                int size = nx1Var.f4792f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = nx1Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C1392s3 c1392s3 = new C1392s3(this, this.f11940b, nx1Var, view);
                this.f11958y = c1392s3;
                c1392s3.f13260g = z;
                w31 w31Var = c1392s3.f13262i;
                if (w31Var != null) {
                    w31Var.mo3063o(z);
                }
                C1392s3 c1392s4 = this.f11958y;
                if (!c1392s4.m7188b()) {
                    if (c1392s4.f13258e == null) {
                        f40.m2719o("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    c1392s4.m7189d(0, 0, false, false);
                }
                f41 f41Var = this.f11943e;
                if (f41Var != null) {
                    f41Var.mo782r(nx1Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: d */
    public final boolean mo2930d() {
        int size;
        ArrayList arrayListM3349l;
        int i;
        boolean z;
        C1540w3 c1540w3 = this;
        i31 i31Var = c1540w3.f11941c;
        if (i31Var != null) {
            arrayListM3349l = i31Var.m3349l();
            size = arrayListM3349l.size();
        } else {
            size = 0;
            arrayListM3349l = null;
        }
        int i2 = c1540w3.f11954u;
        int i3 = c1540w3.f11953t;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1540w3.f11946m;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            r31 r31Var = (r31) arrayListM3349l.get(i4);
            int i7 = r31Var.f9695y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (c1540w3.f11955v && r31Var.f9670C) {
                i2 = 0;
            }
            i4++;
        }
        if (c1540w3.f11950q && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = c1540w3.f11956w;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            r31 r31Var2 = (r31) arrayListM3349l.get(i9);
            int i11 = r31Var2.f9695y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = r31Var2.f9672b;
            if (z3) {
                View viewM6694b = c1540w3.m6694b(r31Var2, null, viewGroup);
                viewM6694b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM6694b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                r31Var2.m5680f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewM6694b2 = c1540w3.m6694b(r31Var2, null, viewGroup);
                        viewM6694b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewM6694b2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            r31 r31Var3 = (r31) arrayListM3349l.get(i13);
                            if (r31Var3.f9672b == i12) {
                                if ((r31Var3.f9694x & 32) == 32) {
                                    i8++;
                                }
                                r31Var3.m5680f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    r31Var2.m5680f(z5);
                } else {
                    r31Var2.m5680f(false);
                }
                i9++;
                i = 2;
                c1540w3 = this;
                z = true;
            }
            i9++;
            i = 2;
            c1540w3 = this;
            z = true;
        }
        return z;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: e */
    public final boolean mo2931e(r31 r31Var) {
        return false;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: f */
    public final void mo2932f(f41 f41Var) {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6695g() {
        Object obj;
        RunnableC1466u3 runnableC1466u3 = this.f11959z;
        if (runnableC1466u3 != null && (obj = this.f11946m) != null) {
            ((View) obj).removeCallbacks(runnableC1466u3);
            this.f11959z = null;
            return true;
        }
        C1392s3 c1392s3 = this.f11957x;
        if (c1392s3 == null) {
            return false;
        }
        if (c1392s3.m7188b()) {
            c1392s3.f13262i.dismiss();
        }
        return true;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: h */
    public final boolean mo2933h(r31 r31Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.g41
    /* JADX INFO: renamed from: i */
    public final void mo2934i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f11946m;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            i31 i31Var = this.f11941c;
            if (i31Var != null) {
                i31Var.m3346i();
                ArrayList arrayListM3349l = this.f11941c.m3349l();
                int size = arrayListM3349l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    r31 r31Var = (r31) arrayListM3349l.get(i2);
                    if ((r31Var.f9694x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        r31 itemData = childAt instanceof i41 ? ((i41) childAt).getItemData() : null;
                        View viewM6694b = m6694b(r31Var, childAt, viewGroup);
                        if (r31Var != itemData) {
                            viewM6694b.setPressed(false);
                            viewM6694b.jumpDrawablesToCurrentState();
                        }
                        if (viewM6694b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM6694b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM6694b);
                            }
                            ((ViewGroup) this.f11946m).addView(viewM6694b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f11947n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f11946m).requestLayout();
        i31 i31Var2 = this.f11941c;
        if (i31Var2 != null) {
            i31Var2.m3346i();
            ArrayList arrayList2 = i31Var2.f4795i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                s31 s31Var = ((r31) arrayList2.get(i3)).f9668A;
            }
        }
        i31 i31Var3 = this.f11941c;
        if (i31Var3 != null) {
            i31Var3.m3346i();
            arrayList = i31Var3.f4796j;
        }
        if (this.f11950q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((r31) arrayList.get(0)).f9670C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C1503v3 c1503v3 = this.f11947n;
        if (z) {
            if (c1503v3 == null) {
                this.f11947n = new C1503v3(this, this.f11939a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f11947n.getParent();
            if (viewGroup3 != this.f11946m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f11947n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f11946m;
                C1503v3 c1503v4 = this.f11947n;
                actionMenuView.getClass();
                C1614y3 c1614y3M231j = ActionMenuView.m231j();
                c1614y3M231j.f12817a = true;
                actionMenuView.addView(c1503v4, c1614y3M231j);
            }
        } else if (c1503v3 != null) {
            Object parent = c1503v3.getParent();
            Object obj = this.f11946m;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f11947n);
            }
        }
        ((ActionMenuView) this.f11946m).setOverflowReserved(this.f11950q);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6696j() {
        C1392s3 c1392s3 = this.f11957x;
        return c1392s3 != null && c1392s3.m7188b();
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: k */
    public final void mo2935k(Context context, i31 i31Var) {
        this.f11940b = context;
        LayoutInflater.from(context);
        this.f11941c = i31Var;
        Resources resources = context.getResources();
        if (!this.f11951r) {
            this.f11950q = true;
        }
        int i = 2;
        this.f11952s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f11954u = i;
        int measuredWidth = this.f11952s;
        if (this.f11950q) {
            if (this.f11947n == null) {
                C1503v3 c1503v3 = new C1503v3(this, this.f11939a);
                this.f11947n = c1503v3;
                if (this.f11949p) {
                    c1503v3.setImageDrawable(this.f11948o);
                    this.f11948o = null;
                    this.f11949p = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f11947n.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f11947n.getMeasuredWidth();
        } else {
            this.f11947n = null;
        }
        this.f11953t = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m6697l() {
        i31 i31Var;
        int i = 0;
        if (this.f11950q && !m6696j() && (i31Var = this.f11941c) != null && this.f11946m != null && this.f11959z == null) {
            i31Var.m3346i();
            if (!i31Var.f4796j.isEmpty()) {
                RunnableC1466u3 runnableC1466u3 = new RunnableC1466u3(i, this, new C1392s3(this, this.f11940b, this.f11941c, this.f11947n));
                this.f11959z = runnableC1466u3;
                ((View) this.f11946m).post(runnableC1466u3);
                return true;
            }
        }
        return false;
    }
}
