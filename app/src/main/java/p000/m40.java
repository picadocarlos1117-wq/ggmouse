package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.sousasantoslogic.sspro.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class m40 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f6624a;

    /* JADX INFO: renamed from: b */
    public int f6625b;

    /* JADX INFO: renamed from: c */
    public int f6626c;

    /* JADX INFO: renamed from: d */
    public int f6627d;

    /* JADX INFO: renamed from: e */
    public int f6628e;

    /* JADX INFO: renamed from: f */
    public int f6629f;

    /* JADX INFO: renamed from: g */
    public k40 f6630g;

    /* JADX INFO: renamed from: m */
    public boolean f6631m;

    /* JADX INFO: renamed from: n */
    public final boolean f6632n;

    /* JADX INFO: renamed from: o */
    public boolean f6633o;

    /* JADX INFO: renamed from: p */
    public pt0 f6634p;

    /* JADX INFO: renamed from: q */
    public RunnableC1621ya f6635q;

    public m40(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f6624a = new Rect();
        this.f6625b = 0;
        this.f6626c = 0;
        this.f6627d = 0;
        this.f6628e = 0;
        this.f6632n = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m4382a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0182  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: b */
    public final boolean m4383b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM3550a;
        View childAt;
        View childAt2;
        pt0 pt0Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.f6633o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f6629f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            pt0Var = this.f6634p;
            if (z) {
                if (pt0Var == null) {
                    this.f6634p = new pt0(this);
                }
                pt0 pt0Var2 = this.f6634p;
                boolean z3 = pt0Var2.f9157u;
                pt0Var2.f9157u = true;
                pt0Var2.onTouch(this, motionEvent);
            } else if (pt0Var != null) {
                if (pt0Var.f9157u) {
                    pt0Var.m5331d();
                }
                pt0Var.f9157u = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f6633o = true;
                h40.m3096a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f6629f;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f6629f = iPointToPosition;
                h40.m3096a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f6624a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f6625b;
                rect.top -= this.f6626c;
                rect.right += this.f6627d;
                rect.bottom += this.f6628e;
                if (AbstractC1408sj.m6104a()) {
                    zM3550a = j40.m3550a(this);
                } else {
                    Field field = l40.f6175a;
                    if (field != null) {
                        try {
                            zM3550a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM3550a = false;
                        }
                    } else {
                        zM3550a = false;
                    }
                }
                if (childAt3.isEnabled() != zM3550a) {
                    boolean z5 = !zM3550a;
                    if (AbstractC1408sj.m6104a()) {
                        j40.m3551b(this, z5);
                    } else {
                        Field field2 = l40.f6175a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    v30.m6557e(selector, fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    v30.m6557e(selector2, f, f2);
                }
                k40 k40Var = this.f6630g;
                if (k40Var != null) {
                    k40Var.f5660b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f6633o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6629f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f6633o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6629f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        pt0Var = this.f6634p;
        if (z) {
            if (pt0Var == null) {
                this.f6634p = new pt0(this);
            }
            pt0 pt0Var3 = this.f6634p;
            boolean z6 = pt0Var3.f9157u;
            pt0Var3.f9157u = true;
            pt0Var3.onTouch(this, motionEvent);
        } else if (pt0Var != null) {
            if (pt0Var.f9157u) {
                pt0Var.m5331d();
            }
            pt0Var.f9157u = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f6624a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6635q != null) {
            return;
        }
        super.drawableStateChanged();
        k40 k40Var = this.f6630g;
        if (k40Var != null) {
            k40Var.f5660b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f6633o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6632n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6632n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6632n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6632n && this.f6631m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6635q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 10 && this.f6635q == null) {
            RunnableC1621ya runnableC1621ya = new RunnableC1621ya(this, i);
            this.f6635q = runnableC1621ya;
            post(runnableC1621ya);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !i40.f4816d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        i40.f4813a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        i40.f4814b.invoke(this, Integer.valueOf(iPointToPosition));
                        i40.f4815c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f6633o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6629f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1621ya runnableC1621ya = this.f6635q;
        if (runnableC1621ya != null) {
            m40 m40Var = (m40) runnableC1621ya.f12916b;
            m40Var.f6635q = null;
            m40Var.removeCallbacks(runnableC1621ya);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f6631m = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        k40 k40Var = null;
        if (drawable != null) {
            k40 k40Var2 = new k40();
            Drawable drawable2 = k40Var2.f5659a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            k40Var2.f5659a = drawable;
            drawable.setCallback(k40Var2);
            k40Var2.f5660b = true;
            k40Var = k40Var2;
        }
        this.f6630g = k40Var;
        super.setSelector(k40Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f6625b = rect.left;
        this.f6626c = rect.top;
        this.f6627d = rect.right;
        this.f6628e = rect.bottom;
    }
}
