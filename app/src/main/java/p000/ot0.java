package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ot0 implements us1 {

    /* JADX INFO: renamed from: F */
    public static final Method f8464F;

    /* JADX INFO: renamed from: G */
    public static final Method f8465G;

    /* JADX INFO: renamed from: A */
    public final Handler f8466A;

    /* JADX INFO: renamed from: C */
    public Rect f8468C;

    /* JADX INFO: renamed from: D */
    public boolean f8469D;

    /* JADX INFO: renamed from: E */
    public final C0126c8 f8470E;

    /* JADX INFO: renamed from: a */
    public final Context f8471a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f8472b;

    /* JADX INFO: renamed from: c */
    public m40 f8473c;

    /* JADX INFO: renamed from: f */
    public int f8476f;

    /* JADX INFO: renamed from: g */
    public int f8477g;

    /* JADX INFO: renamed from: n */
    public boolean f8479n;

    /* JADX INFO: renamed from: o */
    public boolean f8480o;

    /* JADX INFO: renamed from: p */
    public boolean f8481p;

    /* JADX INFO: renamed from: s */
    public C1383rv f8484s;

    /* JADX INFO: renamed from: t */
    public View f8485t;

    /* JADX INFO: renamed from: u */
    public AdapterView.OnItemClickListener f8486u;

    /* JADX INFO: renamed from: v */
    public AdapterView.OnItemSelectedListener f8487v;

    /* JADX INFO: renamed from: d */
    public final int f8474d = -2;

    /* JADX INFO: renamed from: e */
    public int f8475e = -2;

    /* JADX INFO: renamed from: m */
    public final int f8478m = 1002;

    /* JADX INFO: renamed from: q */
    public int f8482q = 0;

    /* JADX INFO: renamed from: r */
    public final int f8483r = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: w */
    public final lt0 f8488w = new lt0(this, 1);

    /* JADX INFO: renamed from: x */
    public final nt0 f8489x = new nt0(this, 0);

    /* JADX INFO: renamed from: y */
    public final mt0 f8490y = new mt0(this);

    /* JADX INFO: renamed from: z */
    public final lt0 f8491z = new lt0(this, 0);

    /* JADX INFO: renamed from: B */
    public final Rect f8467B = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8464F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f8465G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ot0(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f8471a = context;
        this.f8466A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ki1.f5860o, i, 0);
        this.f8476f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8477g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8479n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0126c8 c0126c8 = new C0126c8(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ki1.f5864s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            nf1.m4544c(c0126c8, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0126c8.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : hr1.m3282r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f8470E = c0126c8;
        c0126c8.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: a */
    public m40 mo2498a(Context context, boolean z) {
        return new m40(context, z);
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: b */
    public final boolean mo3058b() {
        return this.f8470E.isShowing();
    }

    /* JADX INFO: renamed from: c */
    public final int m5057c() {
        return this.f8476f;
    }

    /* JADX INFO: renamed from: d */
    public final void m5058d(int i) {
        this.f8476f = i;
    }

    @Override // p000.us1
    public final void dismiss() {
        C0126c8 c0126c8 = this.f8470E;
        c0126c8.dismiss();
        c0126c8.setContentView(null);
        this.f8473c = null;
        this.f8466A.removeCallbacks(this.f8488w);
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: g */
    public final void mo3059g() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        m40 m40Var;
        m40 m40Var2 = this.f8473c;
        Context context = this.f8471a;
        C0126c8 c0126c8 = this.f8470E;
        if (m40Var2 == null) {
            m40 m40VarMo2498a = mo2498a(context, !this.f8469D);
            this.f8473c = m40VarMo2498a;
            m40VarMo2498a.setAdapter(this.f8472b);
            this.f8473c.setOnItemClickListener(this.f8486u);
            this.f8473c.setFocusable(true);
            this.f8473c.setFocusableInTouchMode(true);
            this.f8473c.setOnItemSelectedListener(new it0(this, 0));
            this.f8473c.setOnScrollListener(this.f8490y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8487v;
            if (onItemSelectedListener != null) {
                this.f8473c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0126c8.setContentView(this.f8473c);
        }
        Drawable background = c0126c8.getBackground();
        Rect rect = this.f8467B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f8479n) {
                this.f8477g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM3707a = jt0.m3707a(c0126c8, this.f8485t, this.f8477g, c0126c8.getInputMethodMode() == 2);
        int i3 = this.f8474d;
        if (i3 == -1) {
            paddingBottom = iM3707a + i;
        } else {
            int i4 = this.f8475e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iM4382a = this.f8473c.m4382a(iMakeMeasureSpec, iM3707a);
            paddingBottom = iM4382a + (iM4382a > 0 ? this.f8473c.getPaddingBottom() + this.f8473c.getPaddingTop() + i : 0);
        }
        boolean z = c0126c8.getInputMethodMode() == 2;
        nf1.m4545d(c0126c8, this.f8478m);
        if (c0126c8.isShowing()) {
            View view = this.f8485t;
            WeakHashMap weakHashMap = i72.f4849a;
            if (v62.m6586b(view)) {
                int width = this.f8475e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f8485t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.f8475e;
                    if (z) {
                        c0126c8.setWidth(i5 == -1 ? -1 : 0);
                        c0126c8.setHeight(0);
                    } else {
                        c0126c8.setWidth(i5 == -1 ? -1 : 0);
                        c0126c8.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0126c8.setOutsideTouchable(true);
                View view2 = this.f8485t;
                int i6 = width;
                int i7 = this.f8476f;
                int i8 = this.f8477g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0126c8.update(view2, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.f8475e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f8485t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0126c8.setWidth(width2);
        c0126c8.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8464F;
            if (method != null) {
                try {
                    method.invoke(c0126c8, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            kt0.m3998b(c0126c8, true);
        }
        c0126c8.setOutsideTouchable(true);
        c0126c8.setTouchInterceptor(this.f8489x);
        if (this.f8481p) {
            nf1.m4544c(c0126c8, this.f8480o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f8465G;
            if (method2 != null) {
                try {
                    method2.invoke(c0126c8, this.f8468C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            kt0.m3997a(c0126c8, this.f8468C);
        }
        mf1.m4422a(c0126c8, this.f8485t, this.f8476f, this.f8477g, this.f8482q);
        this.f8473c.setSelection(-1);
        if ((!this.f8469D || this.f8473c.isInTouchMode()) && (m40Var = this.f8473c) != null) {
            m40Var.setListSelectionHidden(true);
            m40Var.requestLayout();
        }
        if (this.f8469D) {
            return;
        }
        this.f8466A.post(this.f8491z);
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m5059h() {
        return this.f8470E.getBackground();
    }

    @Override // p000.us1
    /* JADX INFO: renamed from: j */
    public final m40 mo3060j() {
        return this.f8473c;
    }

    /* JADX INFO: renamed from: k */
    public final void m5060k(Drawable drawable) {
        this.f8470E.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: m */
    public final void m5061m(int i) {
        this.f8477g = i;
        this.f8479n = true;
    }

    /* JADX INFO: renamed from: p */
    public final int m5062p() {
        if (this.f8479n) {
            return this.f8477g;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public void mo4730q(ListAdapter listAdapter) {
        C1383rv c1383rv = this.f8484s;
        if (c1383rv == null) {
            this.f8484s = new C1383rv(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f8472b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1383rv);
            }
        }
        this.f8472b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8484s);
        }
        m40 m40Var = this.f8473c;
        if (m40Var != null) {
            m40Var.setAdapter(this.f8472b);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5063r(int i) {
        Drawable background = this.f8470E.getBackground();
        if (background == null) {
            this.f8475e = i;
            return;
        }
        Rect rect = this.f8467B;
        background.getPadding(rect);
        this.f8475e = rect.left + rect.right + i;
    }
}
