package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.sousasantoslogic.sspro.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class q00 extends View {

    /* JADX INFO: renamed from: A */
    public final Formatter f9247A;

    /* JADX INFO: renamed from: B */
    public final RunnableC1430t4 f9248B;

    /* JADX INFO: renamed from: C */
    public final CopyOnWriteArraySet f9249C;

    /* JADX INFO: renamed from: D */
    public final Point f9250D;

    /* JADX INFO: renamed from: E */
    public final float f9251E;

    /* JADX INFO: renamed from: F */
    public int f9252F;

    /* JADX INFO: renamed from: G */
    public long f9253G;

    /* JADX INFO: renamed from: H */
    public int f9254H;

    /* JADX INFO: renamed from: I */
    public Rect f9255I;

    /* JADX INFO: renamed from: J */
    public final ValueAnimator f9256J;

    /* JADX INFO: renamed from: K */
    public float f9257K;

    /* JADX INFO: renamed from: L */
    public boolean f9258L;

    /* JADX INFO: renamed from: M */
    public boolean f9259M;

    /* JADX INFO: renamed from: N */
    public long f9260N;

    /* JADX INFO: renamed from: O */
    public long f9261O;

    /* JADX INFO: renamed from: P */
    public long f9262P;

    /* JADX INFO: renamed from: Q */
    public long f9263Q;

    /* JADX INFO: renamed from: R */
    public int f9264R;

    /* JADX INFO: renamed from: S */
    public long[] f9265S;

    /* JADX INFO: renamed from: T */
    public boolean[] f9266T;

    /* JADX INFO: renamed from: a */
    public final Rect f9267a;

    /* JADX INFO: renamed from: b */
    public final Rect f9268b;

    /* JADX INFO: renamed from: c */
    public final Rect f9269c;

    /* JADX INFO: renamed from: d */
    public final Rect f9270d;

    /* JADX INFO: renamed from: e */
    public final Paint f9271e;

    /* JADX INFO: renamed from: f */
    public final Paint f9272f;

    /* JADX INFO: renamed from: g */
    public final Paint f9273g;

    /* JADX INFO: renamed from: m */
    public final Paint f9274m;

    /* JADX INFO: renamed from: n */
    public final Paint f9275n;

    /* JADX INFO: renamed from: o */
    public final Paint f9276o;

    /* JADX INFO: renamed from: p */
    public final Drawable f9277p;

    /* JADX INFO: renamed from: q */
    public final int f9278q;

    /* JADX INFO: renamed from: r */
    public final int f9279r;

    /* JADX INFO: renamed from: s */
    public final int f9280s;

    /* JADX INFO: renamed from: t */
    public final int f9281t;

    /* JADX INFO: renamed from: u */
    public final int f9282u;

    /* JADX INFO: renamed from: v */
    public final int f9283v;

    /* JADX INFO: renamed from: w */
    public final int f9284w;

    /* JADX INFO: renamed from: x */
    public final int f9285x;

    /* JADX INFO: renamed from: y */
    public final int f9286y;

    /* JADX INFO: renamed from: z */
    public final StringBuilder f9287z;

    public q00(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f9267a = new Rect();
        this.f9268b = new Rect();
        this.f9269c = new Rect();
        this.f9270d = new Rect();
        Paint paint = new Paint();
        this.f9271e = paint;
        Paint paint2 = new Paint();
        this.f9272f = paint2;
        Paint paint3 = new Paint();
        this.f9273g = paint3;
        Paint paint4 = new Paint();
        this.f9274m = paint4;
        Paint paint5 = new Paint();
        this.f9275n = paint5;
        Paint paint6 = new Paint();
        this.f9276o = paint6;
        paint6.setAntiAlias(true);
        this.f9249C = new CopyOnWriteArraySet();
        this.f9250D = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f9251E = f;
        this.f9286y = m5380a(-50, f);
        int iM5380a = m5380a(4, f);
        int iM5380a2 = m5380a(26, f);
        int iM5380a3 = m5380a(4, f);
        int iM5380a4 = m5380a(12, f);
        int iM5380a5 = m5380a(0, f);
        int iM5380a6 = m5380a(16, f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hi1.f4581b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f9277p = drawable;
                if (drawable != null) {
                    int i = z42.f13274a;
                    if (i >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iM5380a2 = Math.max(drawable.getMinimumHeight(), iM5380a2);
                }
                this.f9278q = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM5380a);
                this.f9279r = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM5380a2);
                this.f9280s = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f9281t = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM5380a3);
                this.f9282u = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM5380a4);
                this.f9283v = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM5380a5);
                this.f9284w = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM5380a6);
                int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i3 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i5 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i6 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i7 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i2);
                paint6.setColor(i3);
                paint2.setColor(i4);
                paint3.setColor(i5);
                paint4.setColor(i6);
                paint5.setColor(i7);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f9278q = iM5380a;
            this.f9279r = iM5380a2;
            this.f9280s = 0;
            this.f9281t = iM5380a3;
            this.f9282u = iM5380a4;
            this.f9283v = iM5380a5;
            this.f9284w = iM5380a6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f9277p = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f9287z = sb;
        this.f9247A = new Formatter(sb, Locale.getDefault());
        this.f9248B = new RunnableC1430t4(this, 12);
        Drawable drawable2 = this.f9277p;
        if (drawable2 != null) {
            this.f9285x = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f9285x = (Math.max(this.f9283v, Math.max(this.f9282u, this.f9284w)) + 1) / 2;
        }
        this.f9257K = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9256J = valueAnimator;
        valueAnimator.addUpdateListener(new p00(this, 0));
        this.f9261O = -9223372036854775807L;
        this.f9253G = -9223372036854775807L;
        this.f9252F = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m5380a(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f9253G;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f9261O;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / ((long) this.f9252F);
    }

    private String getProgressText() {
        return z42.m7246t(this.f9287z, this.f9247A, this.f9262P);
    }

    private long getScrubberPosition() {
        Rect rect = this.f9268b;
        if (rect.width() <= 0 || this.f9261O == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f9270d.width()) * this.f9261O) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5381b(long j) {
        long j2 = this.f9261O;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.f9259M ? this.f9260N : this.f9262P;
        long jM7234h = z42.m7234h(j3 + j, 0L, j2);
        if (jM7234h == j3) {
            return false;
        }
        if (this.f9259M) {
            m5385f(jM7234h);
        } else {
            m5382c(jM7234h);
        }
        m5384e();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m5382c(long j) {
        this.f9260N = j;
        this.f9259M = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f9249C.iterator();
        while (it.hasNext()) {
            re1 re1Var = ((he1) it.next()).f4554a;
            re1Var.f9998u0 = true;
            TextView textView = re1Var.f9947I;
            if (textView != null) {
                textView.setText(z42.m7246t(re1Var.f9949K, re1Var.f9950L, j));
            }
            re1Var.f9962a.m6768f();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5383d(boolean z) {
        ee1 ee1Var;
        removeCallbacks(this.f9248B);
        this.f9259M = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        for (he1 he1Var : this.f9249C) {
            long j = this.f9260N;
            re1 re1Var = he1Var.f4554a;
            re1Var.f9998u0 = false;
            if (!z && (ee1Var = re1Var.f9986o0) != null) {
                if (re1Var.f9996t0) {
                    f80 f80Var = (f80) ee1Var;
                    if (f80Var.m2770r(17) && f80Var.m2770r(10)) {
                        t02 t02VarM2763j = f80Var.m2763j();
                        int iMo1059o = t02VarM2763j.mo1059o();
                        int i = 0;
                        while (true) {
                            long jM7226N = z42.m7226N(t02VarM2763j.mo1058m(i, re1Var.f9952N, 0L).f10191k);
                            if (j < jM7226N) {
                                break;
                            }
                            if (i == iMo1059o - 1) {
                                j = jM7226N;
                                break;
                            } else {
                                j -= jM7226N;
                                i++;
                            }
                        }
                        f80Var.m2740A(i, false, j);
                    }
                } else {
                    f80 f80Var2 = (f80) ee1Var;
                    if (f80Var2.m2770r(5)) {
                        f80Var2.m2740A(f80Var2.m2760g(), false, j);
                    }
                }
                re1Var.m5831o();
            }
            re1Var.f9962a.m6769g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9277p;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5384e() {
        Rect rect = this.f9269c;
        Rect rect2 = this.f9268b;
        rect.set(rect2);
        Rect rect3 = this.f9270d;
        rect3.set(rect2);
        long j = this.f9259M ? this.f9260N : this.f9262P;
        if (this.f9261O > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f9263Q) / this.f9261O)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f9261O)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f9267a);
    }

    /* JADX INFO: renamed from: f */
    public final void m5385f(long j) {
        if (this.f9260N == j) {
            return;
        }
        this.f9260N = j;
        Iterator it = this.f9249C.iterator();
        while (it.hasNext()) {
            re1 re1Var = ((he1) it.next()).f4554a;
            TextView textView = re1Var.f9947I;
            if (textView != null) {
                textView.setText(z42.m7246t(re1Var.f9949K, re1Var.f9950L, j));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f9268b.width() / this.f9251E);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f9261O;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9277p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.f9268b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i2 = iCenterY + iHeight;
        long j = this.f9261O;
        Paint paint = this.f9273g;
        Rect rect2 = this.f9270d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i2, paint);
        } else {
            Rect rect3 = this.f9269c;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (iMax < i5) {
                canvas.drawRect(iMax, iCenterY, i5, i2, paint);
            }
            int iMax2 = Math.max(i3, rect2.right);
            if (i4 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i4, i2, this.f9272f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i2, this.f9271e);
            }
            if (this.f9264R != 0) {
                long[] jArr = this.f9265S;
                jArr.getClass();
                boolean[] zArr = this.f9266T;
                zArr.getClass();
                int i6 = this.f9281t;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.f9264R) {
                    int iMin = Math.min(rect.width() - i6, Math.max(i8, ((int) ((((long) rect.width()) * z42.m7234h(jArr[i9], 0L, this.f9261O)) / this.f9261O)) - i7)) + rect.left;
                    int i10 = i9;
                    canvas.drawRect(iMin, iCenterY, iMin + i6, i2, zArr[i9] ? this.f9275n : this.f9274m);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.f9261O > 0) {
            int iM7233g = z42.m7233g(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f9277p;
            if (drawable == null) {
                if (this.f9259M || isFocused()) {
                    i = this.f9284w;
                } else {
                    i = isEnabled() ? this.f9282u : this.f9283v;
                }
                canvas2.drawCircle(iM7233g, iCenterY2, (int) ((i * this.f9257K) / 2.0f), this.f9276o);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f9257K)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f9257K)) / 2;
                drawable.setBounds(iM7233g - intrinsicWidth, iCenterY2 - intrinsicHeight, iM7233g + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.f9259M || z) {
            return;
        }
        m5383d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f9261O <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m5381b(positionIncrement)) {
                            RunnableC1430t4 runnableC1430t4 = this.f9248B;
                            removeCallbacks(runnableC1430t4);
                            postDelayed(runnableC1430t4, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m5381b(positionIncrement)) {
                            RunnableC1430t4 runnableC1430t5 = this.f9248B;
                            removeCallbacks(runnableC1430t5);
                            postDelayed(runnableC1430t5, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f9259M) {
                            m5383d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f9259M) {
                m5383d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.f9258L ? 0 : this.f9285x;
        int i8 = this.f9280s;
        int i9 = this.f9278q;
        int i10 = this.f9279r;
        if (i8 == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - i10;
            paddingBottom2 = ((i6 - getPaddingBottom()) - i9) - Math.max(i7 - (i9 / 2), 0);
        } else {
            paddingBottom = (i6 - i10) / 2;
            paddingBottom2 = (i6 - i9) / 2;
        }
        Rect rect2 = this.f9267a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i10 + paddingBottom);
        this.f9268b.set(rect2.left + i7, paddingBottom2, rect2.right - i7, i9 + paddingBottom2);
        if (z42.f13274a >= 29 && ((rect = this.f9255I) == null || rect.width() != i5 || this.f9255I.height() != i6)) {
            Rect rect3 = new Rect(0, 0, i5, i6);
            this.f9255I = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m5384e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f9279r;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f9277p;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f9277p;
        if (drawable == null || z42.f13274a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f9261O > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.f9250D;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f9268b;
            Rect rect2 = this.f9270d;
            if (action == 0) {
                int i3 = i;
                if (this.f9267a.contains(i3, i2)) {
                    rect2.right = z42.m7233g(i3, rect.left, rect.right);
                    m5382c(getScrubberPosition());
                    m5384e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f9259M) {
                    m5383d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f9259M) {
                        m5383d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f9259M) {
                if (i2 < this.f9286y) {
                    int i4 = this.f9254H;
                    rect2.right = z42.m7233g(((i - i4) / 3) + i4, rect.left, rect.right);
                } else {
                    this.f9254H = i;
                    rect2.right = z42.m7233g(i, rect.left, rect.right);
                }
                m5385f(getScrubberPosition());
                m5384e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f9261O <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m5381b(-getPositionIncrement())) {
                m5383d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m5381b(getPositionIncrement())) {
                m5383d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f9274m.setColor(i);
        invalidate(this.f9267a);
    }

    public void setBufferedColor(int i) {
        this.f9272f.setColor(i);
        invalidate(this.f9267a);
    }

    public void setBufferedPosition(long j) {
        if (this.f9263Q == j) {
            return;
        }
        this.f9263Q = j;
        m5384e();
    }

    public void setDuration(long j) {
        if (this.f9261O == j) {
            return;
        }
        this.f9261O = j;
        if (this.f9259M && j == -9223372036854775807L) {
            m5383d(true);
        }
        m5384e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.f9259M || z) {
            return;
        }
        m5383d(true);
    }

    public void setKeyCountIncrement(int i) {
        ki0.m3857c(i > 0);
        this.f9252F = i;
        this.f9253G = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        ki0.m3857c(j > 0);
        this.f9252F = -1;
        this.f9253G = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f9275n.setColor(i);
        invalidate(this.f9267a);
    }

    public void setPlayedColor(int i) {
        this.f9271e.setColor(i);
        invalidate(this.f9267a);
    }

    public void setPosition(long j) {
        if (this.f9262P == j) {
            return;
        }
        this.f9262P = j;
        setContentDescription(getProgressText());
        m5384e();
    }

    public void setScrubberColor(int i) {
        this.f9276o.setColor(i);
        invalidate(this.f9267a);
    }

    public void setUnplayedColor(int i) {
        this.f9273g.setColor(i);
        invalidate(this.f9267a);
    }
}
