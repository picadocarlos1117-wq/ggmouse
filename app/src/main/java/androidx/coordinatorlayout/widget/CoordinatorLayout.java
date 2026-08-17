package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.example.ssmousepro.injection.TouchPipeline;
import com.sousasantoslogic.sspro.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0075au;
import p000.AbstractC0727hu;
import p000.C0599ed;
import p000.C1047ku;
import p000.C1121mu;
import p000.C1158nu;
import p000.InterfaceC0766iu;
import p000.ViewGroupOnHierarchyChangeListenerC0804ju;
import p000.ViewTreeObserverOnPreDrawListenerC1084lu;
import p000.ay0;
import p000.bb2;
import p000.ei1;
import p000.f40;
import p000.f81;
import p000.g21;
import p000.g81;
import p000.i72;
import p000.lf1;
import p000.o72;
import p000.pi0;
import p000.s62;
import p000.t62;
import p000.v62;
import p000.w30;
import p000.w62;
import p000.y62;
import p000.zs1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements f81, g81 {

    /* JADX INFO: renamed from: A */
    public static final ThreadLocal f579A;

    /* JADX INFO: renamed from: B */
    public static final C1158nu f580B;

    /* JADX INFO: renamed from: C */
    public static final lf1 f581C;

    /* JADX INFO: renamed from: y */
    public static final String f582y;

    /* JADX INFO: renamed from: z */
    public static final Class[] f583z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f584a;

    /* JADX INFO: renamed from: b */
    public final C0599ed f585b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f586c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f587d;

    /* JADX INFO: renamed from: e */
    public final int[] f588e;

    /* JADX INFO: renamed from: f */
    public final int[] f589f;

    /* JADX INFO: renamed from: g */
    public boolean f590g;

    /* JADX INFO: renamed from: m */
    public boolean f591m;

    /* JADX INFO: renamed from: n */
    public final int[] f592n;

    /* JADX INFO: renamed from: o */
    public View f593o;

    /* JADX INFO: renamed from: p */
    public View f594p;

    /* JADX INFO: renamed from: q */
    public ViewTreeObserverOnPreDrawListenerC1084lu f595q;

    /* JADX INFO: renamed from: r */
    public boolean f596r;

    /* JADX INFO: renamed from: s */
    public bb2 f597s;

    /* JADX INFO: renamed from: t */
    public boolean f598t;

    /* JADX INFO: renamed from: u */
    public Drawable f599u;

    /* JADX INFO: renamed from: v */
    public ViewGroup.OnHierarchyChangeListener f600v;

    /* JADX INFO: renamed from: w */
    public ay0 f601w;

    /* JADX INFO: renamed from: x */
    public final g21 f602x;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f582y = r0 != null ? r0.getName() : null;
        f580B = new C1158nu(0);
        f583z = new Class[]{Context.class, AttributeSet.class};
        f579A = new ThreadLocal();
        f581C = new lf1();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f584a = new ArrayList();
        this.f585b = new C0599ed(4);
        this.f586c = new ArrayList();
        this.f587d = new ArrayList();
        this.f588e = new int[2];
        this.f589f = new int[2];
        this.f602x = new g21();
        int[] iArr = ei1.f3353a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f592n = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f592n;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f599u = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m305w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0804ju(this));
        WeakHashMap weakHashMap = i72.f4849a;
        if (s62.m5982c(this) == 0) {
            s62.m5998s(this, 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Rect m289g() {
        Rect rect = (Rect) f581C.mo3822a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: l */
    public static void m290l(int i, Rect rect, Rect rect2, C1047ku c1047ku, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = c1047ku.f6009c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c1047ku.f6010d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: n */
    public static C1047ku m291n(View view) {
        C1047ku c1047ku = (C1047ku) view.getLayoutParams();
        if (!c1047ku.f6008b) {
            InterfaceC0766iu interfaceC0766iu = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0766iu = (InterfaceC0766iu) superclass.getAnnotation(InterfaceC0766iu.class);
                if (interfaceC0766iu != null) {
                    break;
                }
            }
            if (interfaceC0766iu != null) {
                try {
                    AbstractC0727hu abstractC0727hu = (AbstractC0727hu) interfaceC0766iu.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0727hu abstractC0727hu2 = c1047ku.f6007a;
                    if (abstractC0727hu2 != abstractC0727hu) {
                        if (abstractC0727hu2 != null) {
                            abstractC0727hu2.mo1665i();
                        }
                        c1047ku.f6007a = abstractC0727hu;
                        c1047ku.f6008b = true;
                        if (abstractC0727hu != null) {
                            abstractC0727hu.mo1664g(c1047ku);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0766iu.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            c1047ku.f6008b = true;
        }
        return c1047ku;
    }

    /* JADX INFO: renamed from: u */
    public static void m292u(View view, int i) {
        C1047ku c1047ku = (C1047ku) view.getLayoutParams();
        int i2 = c1047ku.f6015i;
        if (i2 != i) {
            WeakHashMap weakHashMap = i72.f4849a;
            view.offsetLeftAndRight(i - i2);
            c1047ku.f6015i = i;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m293v(View view, int i) {
        C1047ku c1047ku = (C1047ku) view.getLayoutParams();
        int i2 = c1047ku.f6016j;
        if (i2 != i) {
            WeakHashMap weakHashMap = i72.f4849a;
            view.offsetTopAndBottom(i - i2);
            c1047ku.f6016j = i;
        }
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: a */
    public final void mo220a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0727hu abstractC0727hu;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C1047ku c1047ku = (C1047ku) childAt.getLayoutParams();
                if (c1047ku.m3999a(i5) && (abstractC0727hu = c1047ku.f6007a) != null) {
                    int[] iArr2 = this.f588e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0727hu.mo1635o(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m300p(1);
        }
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: b */
    public final void mo221b(View view, int i, int i2, int i3, int i4, int i5) {
        mo220a(view, i, i2, i3, i4, 0, this.f589f);
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: c */
    public final boolean mo222c(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1047ku c1047ku = (C1047ku) childAt.getLayoutParams();
                AbstractC0727hu abstractC0727hu = c1047ku.f6007a;
                if (abstractC0727hu != null) {
                    boolean zMo1638s = abstractC0727hu.mo1638s(childAt, i, i2);
                    z |= zMo1638s;
                    if (i2 == 0) {
                        c1047ku.f6019m = zMo1638s;
                    } else if (i2 == 1) {
                        c1047ku.f6020n = zMo1638s;
                    }
                } else if (i2 == 0) {
                    c1047ku.f6019m = false;
                } else if (i2 == 1) {
                    c1047ku.f6020n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1047ku) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: d */
    public final void mo223d(View view, View view2, int i, int i2) {
        g21 g21Var = this.f602x;
        if (i2 == 1) {
            g21Var.f4021b = i;
        } else {
            g21Var.f4020a = i;
        }
        this.f594p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C1047ku) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0727hu abstractC0727hu = ((C1047ku) view.getLayoutParams()).f6007a;
        if (abstractC0727hu != null) {
            abstractC0727hu.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f599u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: e */
    public final void mo224e(View view, int i) {
        g21 g21Var = this.f602x;
        if (i == 1) {
            g21Var.f4021b = 0;
        } else {
            g21Var.f4020a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1047ku c1047ku = (C1047ku) childAt.getLayoutParams();
            if (c1047ku.m3999a(i)) {
                AbstractC0727hu abstractC0727hu = c1047ku.f6007a;
                if (abstractC0727hu != null) {
                    abstractC0727hu.mo1639t(childAt, view, i);
                }
                if (i == 0) {
                    c1047ku.f6019m = false;
                } else if (i == 1) {
                    c1047ku.f6020n = false;
                }
            }
        }
        this.f594p = null;
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: f */
    public final void mo225f(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0727hu abstractC0727hu;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1047ku c1047ku = (C1047ku) childAt.getLayoutParams();
                if (c1047ku.m3999a(i3) && (abstractC0727hu = c1047ku.f6007a) != null) {
                    int[] iArr2 = this.f588e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0727hu.mo1634n(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m300p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1047ku();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1047ku) {
            return new C1047ku((C1047ku) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1047ku((ViewGroup.MarginLayoutParams) layoutParams) : new C1047ku(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        m303s();
        return Collections.unmodifiableList(this.f584a);
    }

    public final bb2 getLastWindowInsets() {
        return this.f597s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g21 g21Var = this.f602x;
        return g21Var.f4021b | g21Var.f4020a;
    }

    public Drawable getStatusBarBackground() {
        return this.f599u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX INFO: renamed from: h */
    public final void m294h(C1047ku c1047ku, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: i */
    public final void m295i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m297k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m296j(View view) {
        zs1 zs1Var = (zs1) this.f585b.f3314b;
        int i = zs1Var.f13557c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) zs1Var.m7352j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(zs1Var.m7350h(i2));
            }
        }
        ArrayList arrayList3 = this.f587d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: k */
    public final void m297k(View view, Rect rect) {
        ThreadLocal threadLocal = o72.f7679a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = o72.f7679a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        o72.m4718a(this, view, matrix);
        ThreadLocal threadLocal3 = o72.f7680b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX INFO: renamed from: m */
    public final int m298m(int i) {
        int[] iArr = this.f592n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m299o(View view, int i, int i2) {
        lf1 lf1Var = f581C;
        Rect rectM289g = m289g();
        m297k(view, rectM289g);
        try {
            return rectM289g.contains(i, i2);
        } finally {
            rectM289g.setEmpty();
            lf1Var.mo3824c(rectM289g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m304t(false);
        if (this.f596r) {
            if (this.f595q == null) {
                this.f595q = new ViewTreeObserverOnPreDrawListenerC1084lu(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f595q);
        }
        if (this.f597s == null) {
            WeakHashMap weakHashMap = i72.f4849a;
            if (s62.m5981b(this)) {
                w62.m6726c(this);
            }
        }
        this.f591m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m304t(false);
        if (this.f596r && this.f595q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f595q);
        }
        View view = this.f594p;
        if (view != null) {
            mo224e(view, 0);
        }
        this.f591m = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f598t || this.f599u == null) {
            return;
        }
        bb2 bb2Var = this.f597s;
        int iM964d = bb2Var != null ? bb2Var.m964d() : 0;
        if (iM964d > 0) {
            this.f599u.setBounds(0, 0, getWidth(), iM964d);
            this.f599u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m304t(true);
        }
        boolean zM302r = m302r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zM302r;
        }
        m304t(true);
        return zM302r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0727hu abstractC0727hu;
        WeakHashMap weakHashMap = i72.f4849a;
        int iM6240d = t62.m6240d(this);
        ArrayList arrayList = this.f584a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0727hu = ((C1047ku) view.getLayoutParams()).f6007a) == null || !abstractC0727hu.mo1632k(this, view, iM6240d))) {
                m301q(view, iM6240d);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        AbstractC0727hu abstractC0727hu;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zMo1633l;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.m303s();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            zs1 zs1Var = (zs1) coordinatorLayout.f585b.f3314b;
            int i13 = zs1Var.f13557c;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) zs1Var.m7352j(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.f596r) {
            boolean z3 = coordinatorLayout.f591m;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.f595q == null) {
                        coordinatorLayout.f595q = new ViewTreeObserverOnPreDrawListenerC1084lu(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f595q);
                }
                coordinatorLayout.f596r = true;
            } else {
                if (z3 && coordinatorLayout.f595q != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f595q);
                }
                coordinatorLayout.f596r = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = i72.f4849a;
        int iM6240d = t62.m6240d(coordinatorLayout);
        boolean z4 = iM6240d == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.f597s != null && s62.m5981b(coordinatorLayout);
        ArrayList arrayList3 = coordinatorLayout.f584a;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                C1047ku c1047ku = (C1047ku) view2.getLayoutParams();
                int i19 = c1047ku.f6011e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iM298m = coordinatorLayout.m298m(i19);
                    int i20 = c1047ku.f6009c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, iM6240d) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iM298m - paddingLeft);
                        }
                        if (z5 || s62.m5981b(view2)) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iM963c = coordinatorLayout.f597s.m963c() + coordinatorLayout.f597s.m962b();
                            int iM961a = coordinatorLayout.f597s.m961a() + coordinatorLayout.f597s.m964d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iM963c, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM961a, mode2);
                        }
                        abstractC0727hu = c1047ku.f6007a;
                        if (abstractC0727hu != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zMo1633l = abstractC0727hu.mo1633l(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zMo1633l) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin + ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin + ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin + ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin + ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iM298m);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    abstractC0727hu = c1047ku.f6007a;
                    if (abstractC0727hu != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zMo1633l = abstractC0727hu.mo1633l(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zMo1633l) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin + ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin + ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin + ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin + ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                abstractC0727hu = c1047ku.f6007a;
                if (abstractC0727hu != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zMo1633l = abstractC0727hu.mo1633l(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zMo1633l) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin + ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin + ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) c1047ku).leftMargin + ((ViewGroup.MarginLayoutParams) c1047ku).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) c1047ku).topMargin + ((ViewGroup.MarginLayoutParams) c1047ku).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1047ku c1047ku = (C1047ku) childAt.getLayoutParams();
                if (c1047ku.m3999a(0)) {
                    AbstractC0727hu abstractC0727hu = c1047ku.f6007a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0727hu abstractC0727hu;
        int childCount = getChildCount();
        boolean zMo1666m = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C1047ku c1047ku = (C1047ku) childAt.getLayoutParams();
                if (c1047ku.m3999a(0) && (abstractC0727hu = c1047ku.f6007a) != null) {
                    zMo1666m |= abstractC0727hu.mo1666m(view);
                }
            }
        }
        return zMo1666m;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo225f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo221b(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo223d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1121mu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1121mu c1121mu = (C1121mu) parcelable;
        super.onRestoreInstanceState(c1121mu.f4756a);
        SparseArray sparseArray = c1121mu.f7102c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0727hu abstractC0727hu = m291n(childAt).f6007a;
            if (id != -1 && abstractC0727hu != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0727hu.mo1636q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo1637r;
        C1121mu c1121mu = new C1121mu(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0727hu abstractC0727hu = ((C1047ku) childAt.getLayoutParams()).f6007a;
            if (id != -1 && abstractC0727hu != null && (parcelableMo1637r = abstractC0727hu.mo1637r(childAt)) != null) {
                sparseArray.append(id, parcelableMo1637r);
            }
        }
        c1121mu.f7102c = sparseArray;
        return c1121mu;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo222c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo224e(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM302r;
        boolean zMo1640u;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f593o == null) {
            zM302r = m302r(motionEvent, 1);
            if (!zM302r) {
                zMo1640u = false;
            }
            motionEventObtain = null;
            if (this.f593o == null) {
                zMo1640u |= super.onTouchEvent(motionEvent);
            } else if (zM302r) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zMo1640u;
            }
            m304t(false);
            return zMo1640u;
        }
        zM302r = false;
        AbstractC0727hu abstractC0727hu = ((C1047ku) this.f593o.getLayoutParams()).f6007a;
        if (abstractC0727hu != null) {
            zMo1640u = abstractC0727hu.mo1640u(this.f593o, motionEvent);
        } else {
            zMo1640u = false;
        }
        motionEventObtain = null;
        if (this.f593o == null) {
            zMo1640u |= super.onTouchEvent(motionEvent);
        } else if (zM302r) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        m304t(false);
        return zMo1640u;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX INFO: renamed from: p */
    public final void m300p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        C1047ku c1047ku;
        int i10;
        View view;
        AbstractC0727hu abstractC0727hu;
        WeakHashMap weakHashMap = i72.f4849a;
        int iM6240d = t62.m6240d(this);
        ArrayList arrayList2 = this.f584a;
        int size = arrayList2.size();
        Rect rectM289g = m289g();
        Rect rectM289g2 = m289g();
        Rect rectM289g3 = m289g();
        int i11 = 0;
        while (true) {
            lf1 lf1Var = f581C;
            if (i11 >= size) {
                Rect rect2 = rectM289g3;
                rectM289g.setEmpty();
                lf1Var.mo3824c(rectM289g);
                rectM289g2.setEmpty();
                lf1Var.mo3824c(rectM289g2);
                rect2.setEmpty();
                lf1Var.mo3824c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            C1047ku c1047ku2 = (C1047ku) view2.getLayoutParams();
            if (i == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i3 = size;
                rect = rectM289g3;
                i2 = i11;
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    if (c1047ku2.f6018l == ((View) arrayList2.get(i12))) {
                        C1047ku c1047ku3 = (C1047ku) view2.getLayoutParams();
                        if (c1047ku3.f6017k != null) {
                            Rect rectM289g4 = m289g();
                            Rect rectM289g5 = m289g();
                            C1047ku c1047ku4 = c1047ku2;
                            Rect rectM289g6 = m289g();
                            m297k(c1047ku3.f6017k, rectM289g4);
                            m295i(view2, rectM289g5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            c1047ku = c1047ku4;
                            i10 = i12;
                            iM6240d = iM6240d;
                            view = view3;
                            m290l(iM6240d, rectM289g4, rectM289g6, c1047ku3, measuredWidth, measuredHeight);
                            boolean z3 = (rectM289g6.left == rectM289g5.left && rectM289g6.top == rectM289g5.top) ? false : true;
                            m294h(c1047ku3, rectM289g6, measuredWidth, measuredHeight);
                            int i13 = rectM289g6.left - rectM289g5.left;
                            int i14 = rectM289g6.top - rectM289g5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = i72.f4849a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = i72.f4849a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (abstractC0727hu = c1047ku3.f6007a) != null) {
                                abstractC0727hu.mo1643h(this, view, c1047ku3.f6017k);
                            }
                            rectM289g4.setEmpty();
                            lf1Var.mo3824c(rectM289g4);
                            rectM289g5.setEmpty();
                            lf1Var.mo3824c(rectM289g5);
                            rectM289g6.setEmpty();
                            lf1Var.mo3824c(rectM289g6);
                        } else {
                            c1047ku = c1047ku2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        c1047ku = c1047ku2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    c1047ku2 = c1047ku;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectM289g3 = rectM289g3;
                }
                ArrayList arrayList3 = arrayList2;
                C1047ku c1047ku5 = c1047ku2;
                int i15 = size;
                Rect rect3 = rectM289g3;
                i2 = i11;
                View view4 = view2;
                m295i(view4, rectM289g2, true);
                if (c1047ku5.f6013g != 0 && !rectM289g2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c1047ku5.f6013g, iM6240d);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectM289g.top = Math.max(rectM289g.top, rectM289g2.bottom);
                    } else if (i16 == 80) {
                        rectM289g.bottom = Math.max(rectM289g.bottom, getHeight() - rectM289g2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectM289g.left = Math.max(rectM289g.left, rectM289g2.right);
                    } else if (i17 == 5) {
                        rectM289g.right = Math.max(rectM289g.right, getWidth() - rectM289g2.left);
                    }
                }
                if (c1047ku5.f6014h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = i72.f4849a;
                    if (v62.m6587c(view4) && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        C1047ku c1047ku6 = (C1047ku) view4.getLayoutParams();
                        AbstractC0727hu abstractC0727hu2 = c1047ku6.f6007a;
                        Rect rectM289g7 = m289g();
                        Rect rectM289g8 = m289g();
                        rectM289g8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC0727hu2 == null || !abstractC0727hu2.mo1693e(view4)) {
                            rectM289g7.set(rectM289g8);
                        } else if (!rectM289g8.contains(rectM289g7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM289g7.toShortString() + " | Bounds:" + rectM289g8.toShortString());
                        }
                        rectM289g8.setEmpty();
                        lf1Var.mo3824c(rectM289g8);
                        if (rectM289g7.isEmpty()) {
                            rectM289g7.setEmpty();
                            lf1Var.mo3824c(rectM289g7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c1047ku6.f6014h, iM6240d);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectM289g7.top - ((ViewGroup.MarginLayoutParams) c1047ku6).topMargin) - c1047ku6.f6016j) >= (i9 = rectM289g.top)) {
                                z = false;
                            } else {
                                m293v(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM289g7.bottom) - ((ViewGroup.MarginLayoutParams) c1047ku6).bottomMargin) + c1047ku6.f6016j) < (i7 = rectM289g.bottom)) {
                                m293v(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                m293v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectM289g7.left - ((ViewGroup.MarginLayoutParams) c1047ku6).leftMargin) - c1047ku6.f6015i) >= (i6 = rectM289g.left)) {
                                z2 = false;
                            } else {
                                m292u(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM289g7.right) - ((ViewGroup.MarginLayoutParams) c1047ku6).rightMargin) + c1047ku6.f6015i) < (i4 = rectM289g.right)) {
                                m292u(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                m292u(view4, 0);
                            }
                            rectM289g7.setEmpty();
                            lf1Var.mo3824c(rectM289g7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C1047ku) view4.getLayoutParams()).f6021o);
                    if (rect.equals(rectM289g2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((C1047ku) view4.getLayoutParams()).f6021o.set(rectM289g2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 < i3) {
                        View view5 = (View) arrayList.get(i18);
                        AbstractC0727hu abstractC0727hu3 = ((C1047ku) view5.getLayoutParams()).f6007a;
                        if (abstractC0727hu3 != null) {
                            abstractC0727hu3.mo1642f(view5);
                        }
                        i18++;
                        arrayList3 = arrayList;
                    }
                }
            }
            i11 = i2 + 1;
            size = i3;
            rectM289g3 = rect;
            arrayList2 = arrayList;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m301q(View view, int i) {
        int i2;
        C1047ku c1047ku = (C1047ku) view.getLayoutParams();
        View view2 = c1047ku.f6017k;
        if (view2 == null && c1047ku.f6012f != -1) {
            f40.m2719o("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        lf1 lf1Var = f581C;
        if (view2 != null) {
            Rect rectM289g = m289g();
            Rect rectM289g2 = m289g();
            try {
                m297k(view2, rectM289g);
                C1047ku c1047ku2 = (C1047ku) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m290l(i, rectM289g, rectM289g2, c1047ku2, measuredWidth, measuredHeight);
                m294h(c1047ku2, rectM289g2, measuredWidth, measuredHeight);
                view.layout(rectM289g2.left, rectM289g2.top, rectM289g2.right, rectM289g2.bottom);
                return;
            } finally {
                rectM289g.setEmpty();
                lf1Var.mo3824c(rectM289g);
                rectM289g2.setEmpty();
                lf1Var.mo3824c(rectM289g2);
            }
        }
        int i3 = c1047ku.f6011e;
        if (i3 < 0) {
            C1047ku c1047ku3 = (C1047ku) view.getLayoutParams();
            Rect rectM289g3 = m289g();
            rectM289g3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1047ku3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1047ku3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1047ku3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1047ku3).bottomMargin);
            if (this.f597s != null) {
                WeakHashMap weakHashMap = i72.f4849a;
                if (s62.m5981b(this) && !s62.m5981b(view)) {
                    rectM289g3.left = this.f597s.m962b() + rectM289g3.left;
                    rectM289g3.top = this.f597s.m964d() + rectM289g3.top;
                    rectM289g3.right -= this.f597s.m963c();
                    rectM289g3.bottom -= this.f597s.m961a();
                }
            }
            Rect rectM289g4 = m289g();
            int i4 = c1047ku3.f6009c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            pi0.m5265b(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectM289g3, rectM289g4, i);
            view.layout(rectM289g4.left, rectM289g4.top, rectM289g4.right, rectM289g4.bottom);
            rectM289g3.setEmpty();
            lf1Var.mo3824c(rectM289g3);
            rectM289g4.setEmpty();
            lf1Var.mo3824c(rectM289g4);
            return;
        }
        C1047ku c1047ku4 = (C1047ku) view.getLayoutParams();
        int i5 = c1047ku4.f6009c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM298m = m298m(i3) - measuredWidth2;
        if (i6 == 1) {
            iM298m += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iM298m += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1047ku4).leftMargin, Math.min(iM298m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c1047ku4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1047ku4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c1047ku4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m302r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f586c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        C1158nu c1158nu = f580B;
        if (c1158nu != null) {
            Collections.sort(arrayList, c1158nu);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zMo1631j = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            AbstractC0727hu abstractC0727hu = ((C1047ku) view.getLayoutParams()).f6007a;
            if (zMo1631j && actionMasked != 0) {
                if (abstractC0727hu != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
                    }
                    if (i == 0) {
                        abstractC0727hu.mo1631j(this, view, motionEventObtain);
                    } else if (i == 1) {
                        abstractC0727hu.mo1640u(view, motionEventObtain);
                    }
                }
            } else if (!zMo1631j && abstractC0727hu != null) {
                if (i == 0) {
                    zMo1631j = abstractC0727hu.mo1631j(this, view, motionEvent);
                } else if (i == 1) {
                    zMo1631j = abstractC0727hu.mo1640u(view, motionEvent);
                }
                if (zMo1631j) {
                    this.f593o = view;
                }
            }
        }
        arrayList.clear();
        return zMo1631j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0727hu abstractC0727hu = ((C1047ku) view.getLayoutParams()).f6007a;
        if (abstractC0727hu != null) {
            abstractC0727hu.mo1644p(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f590g) {
            return;
        }
        m304t(false);
        this.f590g = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: s */
    public final void m303s() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m303s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m305w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f600v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f599u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f599u = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f599u.setState(getDrawableState());
                }
                Drawable drawable3 = this.f599u;
                WeakHashMap weakHashMap = i72.f4849a;
                w30.m6699b(drawable3, t62.m6240d(this));
                this.f599u.setVisible(getVisibility() == 0, false);
                this.f599u.setCallback(this);
            }
            WeakHashMap weakHashMap2 = i72.f4849a;
            s62.m5990k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC0075au.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f599u;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f599u.setVisible(z, false);
    }

    /* JADX INFO: renamed from: t */
    public final void m304t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0727hu abstractC0727hu = ((C1047ku) childAt.getLayoutParams()).f6007a;
            if (abstractC0727hu != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
                if (z) {
                    abstractC0727hu.mo1631j(this, childAt, motionEventObtain);
                } else {
                    abstractC0727hu.mo1640u(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C1047ku) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f593o = null;
        this.f590g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f599u;
    }

    /* JADX INFO: renamed from: w */
    public final void m305w() {
        WeakHashMap weakHashMap = i72.f4849a;
        if (!s62.m5981b(this)) {
            y62.m7020u(this, null);
            return;
        }
        if (this.f601w == null) {
            this.f601w = new ay0(this, 20);
        }
        y62.m7020u(this, this.f601w);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1047ku(getContext(), attributeSet);
    }
}
