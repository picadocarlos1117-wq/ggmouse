package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sousasantoslogic.sspro.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ul */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1484ul extends w31 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A */
    public boolean f11326A;

    /* JADX INFO: renamed from: B */
    public f41 f11327B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserver f11328C;

    /* JADX INFO: renamed from: D */
    public PopupWindow.OnDismissListener f11329D;

    /* JADX INFO: renamed from: E */
    public boolean f11330E;

    /* JADX INFO: renamed from: b */
    public final Context f11331b;

    /* JADX INFO: renamed from: c */
    public final int f11332c;

    /* JADX INFO: renamed from: d */
    public final int f11333d;

    /* JADX INFO: renamed from: e */
    public final boolean f11334e;

    /* JADX INFO: renamed from: f */
    public final Handler f11335f;

    /* JADX INFO: renamed from: s */
    public View f11343s;

    /* JADX INFO: renamed from: t */
    public View f11344t;

    /* JADX INFO: renamed from: u */
    public int f11345u;

    /* JADX INFO: renamed from: v */
    public boolean f11346v;

    /* JADX INFO: renamed from: w */
    public boolean f11347w;

    /* JADX INFO: renamed from: x */
    public int f11348x;

    /* JADX INFO: renamed from: y */
    public int f11349y;

    /* JADX INFO: renamed from: g */
    public final ArrayList f11336g = new ArrayList();

    /* JADX INFO: renamed from: m */
    public final ArrayList f11337m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public final ViewTreeObserverOnGlobalLayoutListenerC0819k8 f11338n = new ViewTreeObserverOnGlobalLayoutListenerC0819k8(this, 2);

    /* JADX INFO: renamed from: o */
    public final ViewOnAttachStateChangeListenerC1410sl f11339o = new ViewOnAttachStateChangeListenerC1410sl(this, 0);

    /* JADX INFO: renamed from: p */
    public final ay0 f11340p = new ay0(this, 15);

    /* JADX INFO: renamed from: q */
    public int f11341q = 0;

    /* JADX INFO: renamed from: r */
    public int f11342r = 0;

    /* JADX INFO: renamed from: z */
    public boolean f11350z = false;

    public ViewOnKeyListenerC1484ul(Context context, View view, int i, boolean z) {
        this.f11331b = context;
        this.f11343s = view;
        this.f11333d = i;
        this.f11334e = z;
        WeakHashMap weakHashMap = i72.f4849a;
        this.f11345u = t62.m6240d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f11332c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f11335f = new Handler();
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: a */
    public final void mo2928a(i31 i31Var, boolean z) {
        ArrayList arrayList = this.f11337m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (i31Var == ((C1447tl) arrayList.get(i)).f10902b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C1447tl) arrayList.get(i2)).f10902b.m3340c(false);
        }
        C1447tl c1447tl = (C1447tl) arrayList.remove(i);
        i31 i31Var2 = c1447tl.f10902b;
        e41 e41Var = c1447tl.f10901a;
        C0126c8 c0126c8 = e41Var.f8470E;
        i31Var2.m3355r(this);
        if (this.f11330E) {
            a41.m74b(c0126c8, null);
            c0126c8.setAnimationStyle(0);
        }
        e41Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f11345u = ((C1447tl) arrayList.get(size2 - 1)).f10903c;
        } else {
            View view = this.f11343s;
            WeakHashMap weakHashMap = i72.f4849a;
            this.f11345u = t62.m6240d(view) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C1447tl) arrayList.get(0)).f10902b.m3340c(false);
                return;
            }
            return;
        }
        dismiss();
        f41 f41Var = this.f11327B;
        if (f41Var != null) {
            f41Var.mo766a(i31Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.f11328C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f11328C.removeGlobalOnLayoutListener(this.f11338n);
            }
            this.f11328C = null;
        }
        this.f11344t.removeOnAttachStateChangeListener(this.f11339o);
        this.f11329D.onDismiss();
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: b */
    public final boolean mo3058b() {
        ArrayList arrayList = this.f11337m;
        return arrayList.size() > 0 && ((C1447tl) arrayList.get(0)).f10901a.f8470E.isShowing();
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: c */
    public final boolean mo2929c(nx1 nx1Var) {
        ArrayList arrayList = this.f11337m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1447tl c1447tl = (C1447tl) obj;
            if (nx1Var == c1447tl.f10902b) {
                c1447tl.f10901a.f8473c.requestFocus();
                return true;
            }
        }
        if (!nx1Var.hasVisibleItems()) {
            return false;
        }
        mo3061l(nx1Var);
        f41 f41Var = this.f11327B;
        if (f41Var != null) {
            f41Var.mo782r(nx1Var);
        }
        return true;
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: d */
    public final boolean mo2930d() {
        return false;
    }

    @Override // p000.us1
    public final void dismiss() {
        ArrayList arrayList = this.f11337m;
        int size = arrayList.size();
        if (size > 0) {
            C1447tl[] c1447tlArr = (C1447tl[]) arrayList.toArray(new C1447tl[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1447tl c1447tl = c1447tlArr[i];
                if (c1447tl.f10901a.f8470E.isShowing()) {
                    c1447tl.f10901a.dismiss();
                }
            }
        }
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: f */
    public final void mo2932f(f41 f41Var) {
        this.f11327B = f41Var;
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: g */
    public final void mo3059g() {
        if (mo3058b()) {
            return;
        }
        ArrayList arrayList = this.f11336g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m6506u((i31) obj);
        }
        arrayList.clear();
        View view = this.f11343s;
        this.f11344t = view;
        if (view != null) {
            boolean z = this.f11328C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f11328C = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11338n);
            }
            this.f11344t.addOnAttachStateChangeListener(this.f11339o);
        }
    }

    @Override // p000.g41
    /* JADX INFO: renamed from: i */
    public final void mo2934i() {
        ArrayList arrayList = this.f11337m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C1447tl) obj).f10901a.f8473c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f31) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: j */
    public final m40 mo3060j() {
        ArrayList arrayList = this.f11337m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1447tl) arrayList.get(arrayList.size() - 1)).f10901a.f8473c;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: l */
    public final void mo3061l(i31 i31Var) {
        i31Var.m3339b(this, this.f11331b);
        if (mo3058b()) {
            m6506u(i31Var);
        } else {
            this.f11336g.add(i31Var);
        }
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: n */
    public final void mo3062n(View view) {
        if (this.f11343s != view) {
            this.f11343s = view;
            int i = this.f11341q;
            WeakHashMap weakHashMap = i72.f4849a;
            this.f11342r = Gravity.getAbsoluteGravity(i, t62.m6240d(view));
        }
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: o */
    public final void mo3063o(boolean z) {
        this.f11350z = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1447tl c1447tl;
        ArrayList arrayList = this.f11337m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1447tl = null;
                break;
            }
            c1447tl = (C1447tl) arrayList.get(i);
            if (!c1447tl.f10901a.f8470E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1447tl != null) {
            c1447tl.f10902b.m3340c(false);
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
        if (this.f11341q != i) {
            this.f11341q = i;
            View view = this.f11343s;
            WeakHashMap weakHashMap = i72.f4849a;
            this.f11342r = Gravity.getAbsoluteGravity(i, t62.m6240d(view));
        }
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: q */
    public final void mo3065q(int i) {
        this.f11346v = true;
        this.f11348x = i;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: r */
    public final void mo3066r(PopupWindow.OnDismissListener onDismissListener) {
        this.f11329D = onDismissListener;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: s */
    public final void mo3067s(boolean z) {
        this.f11326A = z;
    }

    @Override // p000.w31
    /* JADX INFO: renamed from: t */
    public final void mo3068t(int i) {
        this.f11347w = true;
        this.f11349y = i;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public final void m6506u(i31 i31Var) {
        boolean z;
        char c;
        View childAt;
        C1447tl c1447tl;
        int i;
        int i2;
        MenuItem item;
        f31 f31Var;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f11331b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        f31 f31Var2 = new f31(i31Var, layoutInflaterFrom, this.f11334e, R.layout.abc_cascading_menu_item_layout);
        if (!mo3058b() && this.f11350z) {
            f31Var2.f3600c = true;
        } else if (mo3058b()) {
            int size = i31Var.f4792f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = i31Var.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            f31Var2.f3600c = z;
        }
        int iM6700m = w31.m6700m(f31Var2, context, this.f11332c);
        e41 e41Var = new e41(context, null, this.f11333d, 0);
        e41Var.f3190H = this.f11340p;
        e41Var.f8486u = this;
        C0126c8 c0126c8 = e41Var.f8470E;
        c0126c8.setOnDismissListener(this);
        e41Var.f8485t = this.f11343s;
        e41Var.f8482q = this.f11342r;
        e41Var.f8469D = true;
        c0126c8.setFocusable(true);
        c0126c8.setInputMethodMode(2);
        e41Var.mo4730q(f31Var2);
        e41Var.m5063r(iM6700m);
        e41Var.f8482q = this.f11342r;
        ArrayList arrayList = this.f11337m;
        if (arrayList.size() > 0) {
            c1447tl = (C1447tl) arrayList.get(arrayList.size() - 1);
            i31 i31Var2 = c1447tl.f10902b;
            int size2 = i31Var2.f4792f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = i31Var2.getItem(i4);
                if (item.hasSubMenu() && i31Var == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                m40 m40Var = c1447tl.f10901a.f8473c;
                ListAdapter adapter = m40Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    f31Var = (f31) headerViewListAdapter.getWrappedAdapter();
                } else {
                    f31Var = (f31) adapter;
                    headersCount = 0;
                }
                int count = f31Var.getCount();
                int i5 = 0;
                c = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == f31Var.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - m40Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m40Var.getChildCount()) ? m40Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            c1447tl = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = e41.f3189I;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(c0126c8, objArr);
                    } catch (Exception unused) {
                    }
                }
            } else {
                b41.m848a(c0126c8, c);
            }
            a41.m73a(c0126c8, null);
            m40 m40Var2 = ((C1447tl) arrayList.get(arrayList.size() - 1)).f10901a.f8473c;
            int[] iArr = new int[2];
            m40Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f11344t.getWindowVisibleDisplayFrame(rect);
            if (this.f11345u == 1) {
                if (m40Var2.getWidth() + iArr[0] + iM6700m > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iM6700m < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.f11345u = i;
            e41Var.f8485t = childAt;
            if ((this.f11342r & 5) != 5) {
                i2 = 0;
                iM6700m = z2 ? childAt.getWidth() : 0 - iM6700m;
            } else if (z2) {
                i2 = 0;
            } else {
                i2 = 0;
                iM6700m = 0 - childAt.getWidth();
            }
            e41Var.f8476f = iM6700m;
            e41Var.f8481p = true;
            e41Var.f8480o = true;
            e41Var.m5061m(i2);
        } else {
            if (this.f11346v) {
                e41Var.f8476f = this.f11348x;
            }
            if (this.f11347w) {
                e41Var.m5061m(this.f11349y);
            }
            Rect rect2 = this.f11960a;
            e41Var.f8468C = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C1447tl(e41Var, i31Var, this.f11345u));
        e41Var.mo3059g();
        m40 m40Var3 = e41Var.f8473c;
        m40Var3.setOnKeyListener(this);
        if (c1447tl == null && this.f11326A && i31Var.f4799m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m40Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(i31Var.f4799m);
            m40Var3.addHeaderView(frameLayout, null, false);
            e41Var.mo3059g();
        }
    }
}
