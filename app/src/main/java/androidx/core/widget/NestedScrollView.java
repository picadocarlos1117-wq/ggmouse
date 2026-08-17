package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.example.ssmousepro.OverlayDisplayBinder;
import com.example.ssmousepro.injection.InjectionProtocol;
import com.example.ssmousepro.injection.TouchPipeline;
import io.github.muntashirakon.adb.AdbProtocol;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.b81;
import p000.c81;
import p000.d81;
import p000.e81;
import p000.f40;
import p000.f50;
import p000.g21;
import p000.g81;
import p000.i72;
import p000.mz0;
import p000.o21;
import p000.s62;
import p000.y62;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements g81 {

    /* JADX INFO: renamed from: F */
    public static final float f620F = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: G */
    public static final mz0 f621G = new mz0(3);

    /* JADX INFO: renamed from: H */
    public static final int[] f622H = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public int f623A;

    /* JADX INFO: renamed from: B */
    public d81 f624B;

    /* JADX INFO: renamed from: C */
    public final g21 f625C;

    /* JADX INFO: renamed from: D */
    public final e81 f626D;

    /* JADX INFO: renamed from: E */
    public float f627E;

    /* JADX INFO: renamed from: a */
    public final float f628a;

    /* JADX INFO: renamed from: b */
    public long f629b;

    /* JADX INFO: renamed from: c */
    public final Rect f630c;

    /* JADX INFO: renamed from: d */
    public final OverScroller f631d;

    /* JADX INFO: renamed from: e */
    public final EdgeEffect f632e;

    /* JADX INFO: renamed from: f */
    public final EdgeEffect f633f;

    /* JADX INFO: renamed from: g */
    public int f634g;

    /* JADX INFO: renamed from: m */
    public boolean f635m;

    /* JADX INFO: renamed from: n */
    public boolean f636n;

    /* JADX INFO: renamed from: o */
    public View f637o;

    /* JADX INFO: renamed from: p */
    public boolean f638p;

    /* JADX INFO: renamed from: q */
    public VelocityTracker f639q;

    /* JADX INFO: renamed from: r */
    public boolean f640r;

    /* JADX INFO: renamed from: s */
    public boolean f641s;

    /* JADX INFO: renamed from: t */
    public final int f642t;

    /* JADX INFO: renamed from: u */
    public final int f643u;

    /* JADX INFO: renamed from: v */
    public final int f644v;

    /* JADX INFO: renamed from: w */
    public int f645w;

    /* JADX INFO: renamed from: x */
    public final int[] f646x;

    /* JADX INFO: renamed from: y */
    public final int[] f647y;

    /* JADX INFO: renamed from: z */
    public int f648z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.sousasantoslogic.sspro.R.attr.nestedScrollViewStyle);
        this.f630c = new Rect();
        this.f635m = true;
        this.f636n = false;
        this.f637o = null;
        this.f638p = false;
        this.f641s = true;
        this.f645w = -1;
        this.f646x = new int[2];
        this.f647y = new int[2];
        int i = Build.VERSION.SDK_INT;
        this.f632e = i >= 31 ? f50.m2721a(context, attributeSet) : new EdgeEffect(context);
        this.f633f = i >= 31 ? f50.m2721a(context, attributeSet) : new EdgeEffect(context);
        this.f628a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f631d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(AdbProtocol.MAX_PAYLOAD_V2);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f642t = viewConfiguration.getScaledTouchSlop();
        this.f643u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f644v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f622H, com.sousasantoslogic.sspro.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f625C = new g21();
        this.f626D = new e81(this);
        setNestedScrollingEnabled(true);
        i72.m3378j(this, f621G);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f627E == TouchPipeline.SIZE) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                f40.m2719o("Expected theme to define listPreferredItemHeight.");
                return TouchPipeline.SIZE;
            }
            this.f627E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f627E;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m309m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m309m((View) parent, nestedScrollView);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: a */
    public final void mo220a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m317o(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            f40.m2719o("ScrollView can host only one direct child");
        }
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: b */
    public final void mo221b(View view, int i, int i2, int i3, int i4, int i5) {
        m317o(i4, i5, null);
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: c */
    public final boolean mo222c(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int i2;
        int overScrollMode;
        OverScroller overScroller = this.f631d;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i3 = currY - this.f623A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f632e;
        EdgeEffect edgeEffect2 = this.f633f;
        if (i3 <= 0 || o21.m4640J(edgeEffect) == TouchPipeline.SIZE) {
            if (i3 < 0 && o21.m4640J(edgeEffect2) != TouchPipeline.SIZE) {
                float f = height;
                iRound = Math.round(o21.m4656d0(edgeEffect2, (i3 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i3) {
                    edgeEffect2.finish();
                }
            }
            this.f623A = currY;
            iArr = this.f647y;
            iArr[1] = 0;
            m312i(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                m319q(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                i2 = 1;
                this.f626D.m2550d(0, scrollY2, 0, i4, this.f646x, 1, iArr);
                i = i4 - iArr[1];
            } else {
                i2 = 1;
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i2 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                m326x(i2);
            }
            if (!overScroller.isFinished()) {
                m326x(i2);
            } else {
                WeakHashMap weakHashMap = i72.f4849a;
                s62.m5990k(this);
            }
        }
        iRound = Math.round(o21.m4656d0(edgeEffect, ((-i3) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i3) {
            edgeEffect.finish();
        }
        i3 -= iRound;
        this.f623A = currY;
        iArr = this.f647y;
        iArr[1] = 0;
        m312i(0, i3, 1, iArr, null);
        i = i3 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            m319q(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i5 = i - scrollY4;
            iArr[1] = 0;
            i2 = 1;
            this.f626D.m2550d(0, scrollY4, 0, i5, this.f646x, 1, iArr);
            i = i5 - iArr[1];
        } else {
            i2 = 1;
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            m326x(i2);
        }
        if (!overScroller.isFinished()) {
            m326x(i2);
        } else {
            WeakHashMap weakHashMap2 = i72.f4849a;
            s62.m5990k(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: d */
    public final void mo223d(View view, View view2, int i, int i2) {
        g21 g21Var = this.f625C;
        if (i2 == 1) {
            g21Var.f4021b = i;
        } else {
            g21Var.f4020a = i;
        }
        m324v(2, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m313j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f626D.m2547a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f626D.m2548b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f626D.m2549c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f626D.m2550d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f632e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b81.m941a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b81.m941a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = i72.f4849a;
                s62.m5990k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f633f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b81.m941a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (b81.m941a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, TouchPipeline.SIZE);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = i72.f4849a;
            s62.m5990k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: e */
    public final void mo224e(View view, int i) {
        g21 g21Var = this.f625C;
        if (i == 1) {
            g21Var.f4021b = 0;
        } else {
            g21Var.f4020a = 0;
        }
        m326x(i);
    }

    @Override // p000.f81
    /* JADX INFO: renamed from: f */
    public final void mo225f(View view, int i, int i2, int[] iArr, int i3) {
        m312i(i, i2, i3, iArr, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m310g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m316n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m321s(true, maxScrollAmount, 0, 1);
        } else {
            Rect rect = this.f630c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m321s(true, m311h(rect), 0, 1);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m316n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(OverlayDisplayBinder.FLAG_EXTERNAL_DEX_HOSTING);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return TouchPipeline.SIZE;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g21 g21Var = this.f625C;
        return g21Var.f4021b | g21Var.f4020a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return TouchPipeline.SIZE;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public final int m311h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f626D.m2552f(0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m312i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f626D.m2549c(i, i2, i3, iArr, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f626D.f3287d;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m313j(KeyEvent keyEvent) {
        Rect rect = this.f630c;
        rect.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return !keyEvent.isAltPressed() ? m310g(33) : m315l(33);
                    }
                    if (keyCode == 20) {
                        return !keyEvent.isAltPressed() ? m310g(130) : m315l(130);
                    }
                    if (keyCode == 62) {
                        int i = keyEvent.isShiftPressed() ? 33 : 130;
                        boolean z = i == 130;
                        int height = getHeight();
                        if (z) {
                            rect.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                                if (rect.top + height > paddingBottom) {
                                    rect.top = paddingBottom - height;
                                }
                            }
                        } else {
                            int scrollY = getScrollY() - height;
                            rect.top = scrollY;
                            if (scrollY < 0) {
                                rect.top = 0;
                            }
                        }
                        int i2 = rect.top;
                        int i3 = height + i2;
                        rect.bottom = i3;
                        m320r(i, i2, i3);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m314k(int i) {
        if (getChildCount() > 0) {
            this.f631d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m324v(2, 1);
            this.f623A = getScrollY();
            WeakHashMap weakHashMap = i72.f4849a;
            s62.m5990k(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m315l(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f630c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m320r(i, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m316n(View view, int i, int i2) {
        Rect rect = this.f630c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m317o(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f626D.m2550d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f636n = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f638p) {
            if ((motionEvent.getSource() & 2) == 2) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            } else {
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != TouchPipeline.SIZE) {
                m321s((motionEvent.getSource() & 8194) == 8194, -((int) (axisValue * getVerticalScrollFactorCompat())), width, 1);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f638p) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.f631d;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!m325w(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f638p = z;
                    velocityTracker = this.f639q;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f639q = null;
                    }
                } else {
                    this.f634g = y;
                    this.f645w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f639q;
                    if (velocityTracker3 == null) {
                        this.f639q = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f639q.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!m325w(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.f638p = z;
                    m324v(2, 0);
                }
            } else {
                if (!m325w(motionEvent)) {
                    z = false;
                }
                this.f638p = z;
                velocityTracker = this.f639q;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f639q = null;
                }
            }
        } else if (i == 1) {
            this.f638p = false;
            this.f645w = -1;
            velocityTracker2 = this.f639q;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f639q = null;
            }
            if (this.f631d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = i72.f4849a;
                s62.m5990k(this);
            }
            m326x(0);
        } else if (i == 2) {
            int i2 = this.f645w;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f634g) > this.f642t && (2 & getNestedScrollAxes()) == 0) {
                        this.f638p = true;
                        this.f634g = y2;
                        if (this.f639q == null) {
                            this.f639q = VelocityTracker.obtain();
                        }
                        this.f639q.addMovement(motionEvent);
                        this.f648z = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f638p = false;
            this.f645w = -1;
            velocityTracker2 = this.f639q;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f639q = null;
            }
            if (this.f631d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap2 = i72.f4849a;
                s62.m5990k(this);
            }
            m326x(0);
        } else if (i == 6) {
            m318p(motionEvent);
        }
        return this.f638p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f635m = false;
        View view = this.f637o;
        if (view != null && m309m(view, this)) {
            View view2 = this.f637o;
            Rect rect = this.f630c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM311h = m311h(rect);
            if (iM311h != 0) {
                scrollBy(0, iM311h);
            }
        }
        this.f637o = null;
        if (!this.f636n) {
            if (this.f624B != null) {
                scrollTo(getScrollX(), this.f624B.f2827a);
                this.f624B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f636n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f640r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(TouchPipeline.SIZE, f2, true);
        m314k((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.f626D.m2548b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m312i(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m317o(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo223d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m316n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d81)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d81 d81Var = (d81) parcelable;
        super.onRestoreInstanceState(d81Var.getSuperState());
        this.f624B = d81Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d81 d81Var = new d81(super.onSaveInstanceState());
        d81Var.f2827a = getScrollY();
        return d81Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m316n(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.f630c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM311h = m311h(rect);
        if (iM311h != 0) {
            if (this.f641s) {
                m323u(0, iM311h, false);
            } else {
                scrollBy(0, iM311h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo222c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo224e(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM4656d0;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.f639q == null) {
            this.f639q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f648z = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = this.f648z;
        float f2 = TouchPipeline.SIZE;
        motionEventObtain.offsetLocation(TouchPipeline.SIZE, f);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f632e;
            EdgeEffect edgeEffect2 = this.f633f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f639q;
                velocityTracker.computeCurrentVelocity(1000, this.f644v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f645w);
                if (Math.abs(yVelocity) >= this.f643u) {
                    if (o21.m4640J(edgeEffect) != TouchPipeline.SIZE) {
                        if (m322t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            m314k(-yVelocity);
                        }
                    } else if (o21.m4640J(edgeEffect2) != TouchPipeline.SIZE) {
                        int i3 = -yVelocity;
                        if (m322t(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            m314k(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f3 = i4;
                        if (!this.f626D.m2548b(TouchPipeline.SIZE, f3)) {
                            dispatchNestedFling(TouchPipeline.SIZE, f3, true);
                            m314k(i4);
                        }
                    }
                } else if (this.f631d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap = i72.f4849a;
                    s62.m5990k(this);
                }
                this.f645w = -1;
                this.f638p = false;
                VelocityTracker velocityTracker2 = this.f639q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f639q = null;
                }
                m326x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f645w);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f645w + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f634g - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (o21.m4640J(edgeEffect) != TouchPipeline.SIZE) {
                        fM4656d0 = -o21.m4656d0(edgeEffect, -height, x);
                        if (o21.m4640J(edgeEffect) == TouchPipeline.SIZE) {
                            edgeEffect.onRelease();
                        }
                    } else if (o21.m4640J(edgeEffect2) != TouchPipeline.SIZE) {
                        fM4656d0 = o21.m4656d0(edgeEffect2, height, 1.0f - x);
                        if (o21.m4640J(edgeEffect2) == TouchPipeline.SIZE) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f2 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.f638p) {
                            iAbs = Math.abs(i);
                            i2 = this.f642t;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f638p = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.f638p) {
                            int iM321s = m321s(false, i, (int) motionEvent.getX(iFindPointerIndex), 0);
                            this.f634g = y - iM321s;
                            this.f648z += iM321s;
                        }
                    }
                    f2 = fM4656d0;
                    iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.f638p) {
                        iAbs = Math.abs(i);
                        i2 = this.f642t;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f638p = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.f638p) {
                        int iM321s2 = m321s(false, i, (int) motionEvent.getX(iFindPointerIndex), 0);
                        this.f634g = y - iM321s2;
                        this.f648z += iM321s2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f638p && getChildCount() > 0) {
                    if (this.f631d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        WeakHashMap weakHashMap2 = i72.f4849a;
                        s62.m5990k(this);
                    }
                }
                this.f645w = -1;
                this.f638p = false;
                VelocityTracker velocityTracker3 = this.f639q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f639q = null;
                }
                m326x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f634g = (int) motionEvent.getY(actionIndex);
                this.f645w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m318p(motionEvent);
                this.f634g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f645w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f638p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.f631d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m326x(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f634g = y2;
            this.f645w = pointerId;
            m324v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f639q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m318p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f645w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f634g = (int) motionEvent.getY(i);
            this.f645w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f639q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m319q(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && !this.f626D.m2552f(1)) {
                this.f631d.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.f631d.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: r */
    public final boolean m320r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m321s(true, z2 ? i2 - scrollY : i3 - i4, 0, 1);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f635m) {
            this.f637o = view2;
        } else {
            Rect rect = this.f630c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM311h = m311h(rect);
            if (iM311h != 0) {
                scrollBy(0, iM311h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM311h = m311h(rect);
        boolean z2 = iM311h != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM311h);
                return z2;
            }
            m323u(0, iM311h, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f639q) != null) {
            velocityTracker.recycle();
            this.f639q = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f635m = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final int m321s(boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        if (i3 == 1) {
            m324v(2, i3);
        }
        boolean zM2549c = this.f626D.m2549c(0, i, i3, this.f647y, this.f646x);
        int[] iArr = this.f646x;
        int[] iArr2 = this.f647y;
        if (zM2549c) {
            i4 = i - iArr2[1];
            i5 = iArr[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = m319q(i4, 0, scrollY, scrollRange) && !this.f626D.m2552f(i3);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.f626D.m2550d(0, scrollY2, 0, i4 - scrollY2, this.f646x, i3, iArr2);
        int i6 = i5 + iArr[1];
        int i7 = i4 - iArr2[1];
        int i8 = scrollY + i7;
        EdgeEffect edgeEffect = this.f633f;
        EdgeEffect edgeEffect2 = this.f632e;
        if (i8 < 0) {
            if (z3) {
                o21.m4656d0(edgeEffect2, (-i7) / getHeight(), i2 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            o21.m4656d0(edgeEffect, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z2 = z4;
        } else {
            WeakHashMap weakHashMap = i72.f4849a;
            s62.m5990k(this);
            z2 = false;
        }
        if (z2 && i3 == 0) {
            this.f639q.clear();
        }
        if (i3 == 1) {
            m326x(i3);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i6;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f640r) {
            this.f640r = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        e81 e81Var = this.f626D;
        if (e81Var.f3287d) {
            ViewGroup viewGroup = e81Var.f3286c;
            WeakHashMap weakHashMap = i72.f4849a;
            y62.m7025z(viewGroup);
        }
        e81Var.f3287d = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f641s = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f626D.m2553g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m326x(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m322t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fM4640J = o21.m4640J(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f628a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = f620F;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fM4640J;
    }

    /* JADX INFO: renamed from: u */
    public final void m323u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f629b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f631d.startScroll(getScrollX(), scrollY, 0, iMax, InjectionProtocol.MOUSE_POLL_HZ_PADRAO);
            if (z) {
                m324v(2, 1);
            } else {
                m326x(1);
            }
            this.f623A = getScrollY();
            WeakHashMap weakHashMap = i72.f4849a;
            s62.m5990k(this);
        } else {
            OverScroller overScroller = this.f631d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                m326x(1);
            }
            scrollBy(i, i2);
        }
        this.f629b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: v */
    public final void m324v(int i, int i2) {
        this.f626D.m2553g(2, i2);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m325w(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f632e;
        if (o21.m4640J(edgeEffect) != TouchPipeline.SIZE) {
            o21.m4656d0(edgeEffect, TouchPipeline.SIZE, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f633f;
        if (o21.m4640J(edgeEffect2) == TouchPipeline.SIZE) {
            return z;
        }
        o21.m4656d0(edgeEffect2, TouchPipeline.SIZE, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m326x(int i) {
        this.f626D.m2554h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            f40.m2719o("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            f40.m2719o("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            f40.m2719o("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(c81 c81Var) {
    }
}
