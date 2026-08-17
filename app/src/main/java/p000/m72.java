package p000;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class m72 {

    /* JADX INFO: renamed from: v */
    public static final cj1 f6688v = new cj1(1);

    /* JADX INFO: renamed from: a */
    public int f6689a;

    /* JADX INFO: renamed from: b */
    public final int f6690b;

    /* JADX INFO: renamed from: d */
    public float[] f6692d;

    /* JADX INFO: renamed from: e */
    public float[] f6693e;

    /* JADX INFO: renamed from: f */
    public float[] f6694f;

    /* JADX INFO: renamed from: g */
    public float[] f6695g;

    /* JADX INFO: renamed from: h */
    public int[] f6696h;

    /* JADX INFO: renamed from: i */
    public int[] f6697i;

    /* JADX INFO: renamed from: j */
    public int[] f6698j;

    /* JADX INFO: renamed from: k */
    public int f6699k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f6700l;

    /* JADX INFO: renamed from: m */
    public final float f6701m;

    /* JADX INFO: renamed from: n */
    public final float f6702n;

    /* JADX INFO: renamed from: o */
    public final int f6703o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f6704p;

    /* JADX INFO: renamed from: q */
    public final ki0 f6705q;

    /* JADX INFO: renamed from: r */
    public View f6706r;

    /* JADX INFO: renamed from: s */
    public boolean f6707s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f6708t;

    /* JADX INFO: renamed from: c */
    public int f6691c = -1;

    /* JADX INFO: renamed from: u */
    public final l72 f6709u = new l72(this, 0);

    public m72(Context context, CoordinatorLayout coordinatorLayout, ki0 ki0Var) {
        if (ki0Var == null) {
            f40.m2713i("Callback may not be null");
            throw null;
        }
        this.f6708t = coordinatorLayout;
        this.f6705q = ki0Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6703o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f6690b = viewConfiguration.getScaledTouchSlop();
        this.f6701m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6702n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6704p = new OverScroller(context, f6688v);
    }

    /* JADX INFO: renamed from: a */
    public final void m4389a() {
        this.f6691c = -1;
        float[] fArr = this.f6692d;
        if (fArr != null) {
            Arrays.fill(fArr, TouchPipeline.SIZE);
            Arrays.fill(this.f6693e, TouchPipeline.SIZE);
            Arrays.fill(this.f6694f, TouchPipeline.SIZE);
            Arrays.fill(this.f6695g, TouchPipeline.SIZE);
            Arrays.fill(this.f6696h, 0);
            Arrays.fill(this.f6697i, 0);
            Arrays.fill(this.f6698j, 0);
            this.f6699k = 0;
        }
        VelocityTracker velocityTracker = this.f6700l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6700l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4390b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f6708t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f6706r = view;
        this.f6691c = i;
        this.f6705q.mo3881L(view, i);
        m4402n(1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[RETURN] */
    /* JADX INFO: renamed from: c */
    public final boolean m4391c(View view, float f, float f2) {
        if (view != null) {
            ki0 ki0Var = this.f6705q;
            boolean z = ki0Var.mo3879C(view) > 0;
            boolean z2 = ki0Var.mo3880D() > 0;
            int i = this.f6690b;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4392d(int i) {
        float[] fArr = this.f6692d;
        if (fArr != null) {
            int i2 = this.f6699k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f6693e[i] = 0.0f;
                this.f6694f[i] = 0.0f;
                this.f6695g[i] = 0.0f;
                this.f6696h[i] = 0;
                this.f6697i[i] = 0;
                this.f6698j[i] = 0;
                this.f6699k = (~i3) & i2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4393e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f6708t.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4394f() {
        if (this.f6689a == 2) {
            OverScroller overScroller = this.f6704p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f6706r.getLeft();
            int top = currY - this.f6706r.getTop();
            if (left != 0) {
                View view = this.f6706r;
                WeakHashMap weakHashMap = i72.f4849a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f6706r;
                WeakHashMap weakHashMap2 = i72.f4849a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f6705q.mo3883N(this.f6706r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f6708t.post(this.f6709u);
            }
        }
        return this.f6689a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m4395g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f6708t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f6705q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4396h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f6706r.getLeft();
        int top = this.f6706r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f6704p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m4402n(0);
            return false;
        }
        View view = this.f6706r;
        int i7 = (int) this.f6702n;
        int i8 = (int) this.f6701m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        ki0 ki0Var = this.f6705q;
        overScroller.startScroll(left, top, i5, i6, (int) ((m4393e(i6, i4, ki0Var.mo3880D()) * f6) + (m4393e(i5, i3, ki0Var.mo3879C(view)) * f5)));
        m4402n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4397i(int i) {
        if ((this.f6699k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m4398j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m4389a();
        }
        if (this.f6700l == null) {
            this.f6700l = VelocityTracker.obtain();
        }
        this.f6700l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM4395g = m4395g((int) x, (int) y);
            m4400l(x, y, pointerId);
            m4405q(viewM4395g, pointerId);
            int i3 = this.f6696h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f6689a == 1) {
                m4399k();
            }
            m4389a();
            return;
        }
        ki0 ki0Var = this.f6705q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f6689a == 1) {
                    this.f6707s = true;
                    ki0Var.mo3884O(this.f6706r, TouchPipeline.SIZE, TouchPipeline.SIZE);
                    this.f6707s = false;
                    if (this.f6689a == 1) {
                        m4402n(0);
                    }
                }
                m4389a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m4400l(x2, y2, pointerId2);
                if (this.f6689a == 0) {
                    m4405q(m4395g((int) x2, (int) y2), pointerId2);
                    int i4 = this.f6696h[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.f6706r;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    m4405q(this.f6706r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f6689a == 1 && pointerId3 == this.f6691c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f6691c) {
                        View viewM4395g2 = m4395g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f6706r;
                        if (viewM4395g2 == view2 && m4405q(view2, pointerId4)) {
                            i = this.f6691c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    m4399k();
                }
            }
            m4392d(pointerId3);
            return;
        }
        if (this.f6689a == 1) {
            if (m4397i(this.f6691c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f6691c);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f6694f;
                int i7 = this.f6691c;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.f6695g[i7]);
                int left = this.f6706r.getLeft() + i8;
                int top = this.f6706r.getTop() + i9;
                int left2 = this.f6706r.getLeft();
                int top2 = this.f6706r.getTop();
                if (i8 != 0) {
                    left = ki0Var.mo3886l(this.f6706r, left);
                    WeakHashMap weakHashMap = i72.f4849a;
                    this.f6706r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = ki0Var.mo3887m(this.f6706r, top);
                    WeakHashMap weakHashMap2 = i72.f4849a;
                    this.f6706r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    ki0Var.mo3883N(this.f6706r, left, top);
                }
                m4401m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (m4397i(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.f6692d[pointerId5];
                float f2 = y4 - this.f6693e[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.f6696h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.f6696h[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.f6696h[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.f6696h[pointerId5];
                if (this.f6689a != 1) {
                    View viewM4395g3 = m4395g((int) x4, (int) y4);
                    if (m4391c(viewM4395g3, f, f2) && m4405q(viewM4395g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m4401m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m4399k() {
        VelocityTracker velocityTracker = this.f6700l;
        float f = this.f6701m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f6700l.getXVelocity(this.f6691c);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.f6702n;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > TouchPipeline.SIZE ? f : -f;
        }
        float yVelocity = this.f6700l.getYVelocity(this.f6691c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= TouchPipeline.SIZE) {
            f = -f;
        }
        this.f6707s = true;
        this.f6705q.mo3884O(this.f6706r, xVelocity, f);
        this.f6707s = false;
        if (this.f6689a == 1) {
            m4402n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4400l(float f, float f2, int i) {
        float[] fArr = this.f6692d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f6693e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f6694f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f6695g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f6696h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f6697i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f6698j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f6692d = fArr2;
            this.f6693e = fArr3;
            this.f6694f = fArr4;
            this.f6695g = fArr5;
            this.f6696h = iArr;
            this.f6697i = iArr2;
            this.f6698j = iArr3;
        }
        float[] fArr9 = this.f6692d;
        this.f6694f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f6693e;
        this.f6695g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f6696h;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f6708t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f6703o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f6699k |= 1 << i;
    }

    /* JADX INFO: renamed from: m */
    public final void m4401m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m4397i(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f6694f[pointerId] = x;
                this.f6695g[pointerId] = y;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4402n(int i) {
        this.f6708t.removeCallbacks(this.f6709u);
        if (this.f6689a != i) {
            this.f6689a = i;
            this.f6705q.mo3882M(i);
            if (this.f6689a == 0) {
                this.f6706r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4403o(int i, int i2) {
        if (this.f6707s) {
            return m4396h(i, i2, (int) this.f6700l.getXVelocity(this.f6691c), (int) this.f6700l.getYVelocity(this.f6691c));
        }
        f40.m2719o("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX INFO: renamed from: p */
    public final boolean m4404p(MotionEvent motionEvent) {
        View viewM4395g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m4389a();
        }
        if (this.f6700l == null) {
            this.f6700l = VelocityTracker.obtain();
        }
        this.f6700l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m4400l(x, y, pointerId);
            View viewM4395g2 = m4395g((int) x, (int) y);
            if (viewM4395g2 == this.f6706r && this.f6689a == 2) {
                m4405q(viewM4395g2, pointerId);
            }
            int i = this.f6696h[pointerId];
        } else if (actionMasked == 1) {
            m4389a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m4389a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m4400l(x2, y2, pointerId2);
                int i2 = this.f6689a;
                if (i2 == 0) {
                    int i3 = this.f6696h[pointerId2];
                } else if (i2 == 2 && (viewM4395g = m4395g((int) x2, (int) y2)) == this.f6706r) {
                    m4405q(viewM4395g, pointerId2);
                }
            } else if (actionMasked == 6) {
                m4392d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f6692d != null && this.f6693e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (m4397i(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.f6692d[pointerId3];
                    float f2 = y3 - this.f6693e[pointerId3];
                    View viewM4395g3 = m4395g((int) x3, (int) y3);
                    boolean z = viewM4395g3 != null && m4391c(viewM4395g3, f, f2);
                    if (!z) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.f6696h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.f6696h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.f6696h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.f6696h[pointerId3];
                        if (this.f6689a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM4395g3.getLeft();
                        ki0 ki0Var = this.f6705q;
                        int iMo3886l = ki0Var.mo3886l(viewM4395g3, ((int) f) + left);
                        int top = viewM4395g3.getTop();
                        int iMo3887m = ki0Var.mo3887m(viewM4395g3, ((int) f2) + top);
                        int iMo3879C = ki0Var.mo3879C(viewM4395g3);
                        int iMo3880D = ki0Var.mo3880D();
                        if ((iMo3879C == 0 || (iMo3879C > 0 && iMo3886l == left)) && (iMo3880D == 0 || (iMo3880D > 0 && iMo3887m == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.f6696h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.f6696h[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i11 = this.f6696h[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i12 = this.f6696h[pointerId3];
                        if (this.f6689a != 1 || (z && m4405q(viewM4395g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m4401m(motionEvent);
        }
        return this.f6689a == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m4405q(View view, int i) {
        if (view == this.f6706r && this.f6691c == i) {
            return true;
        }
        if (view == null || !this.f6705q.mo3885d0(view, i)) {
            return false;
        }
        this.f6691c = i;
        m4390b(view, i);
        return true;
    }
}
