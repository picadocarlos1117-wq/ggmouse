package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ge0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f4158a;

    /* JADX INFO: renamed from: b */
    public final int f4159b;

    /* JADX INFO: renamed from: c */
    public final int f4160c;

    /* JADX INFO: renamed from: d */
    public final View f4161d;

    /* JADX INFO: renamed from: e */
    public fe0 f4162e;

    /* JADX INFO: renamed from: f */
    public fe0 f4163f;

    /* JADX INFO: renamed from: g */
    public boolean f4164g;

    /* JADX INFO: renamed from: m */
    public int f4165m;

    /* JADX INFO: renamed from: n */
    public final int[] f4166n = new int[2];

    public ge0(View view) {
        this.f4161d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4158a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4159b = tapTimeout;
        this.f4160c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2961a() {
        fe0 fe0Var = this.f4163f;
        View view = this.f4161d;
        if (fe0Var != null) {
            view.removeCallbacks(fe0Var);
        }
        fe0 fe0Var2 = this.f4162e;
        if (fe0Var2 != null) {
            view.removeCallbacks(fe0Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract us1 mo2962b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo2963c();

    /* JADX INFO: renamed from: d */
    public boolean mo2964d() {
        us1 us1VarMo2962b = mo2962b();
        if (us1VarMo2962b == null || !us1VarMo2962b.mo3058b()) {
            return true;
        }
        us1VarMo2962b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        m40 m40VarMo3060j;
        boolean z2 = this.f4164g;
        View view2 = this.f4161d;
        if (z2) {
            us1 us1VarMo2962b = mo2962b();
            if (us1VarMo2962b != null && us1VarMo2962b.mo3058b() && (m40VarMo3060j = us1VarMo2962b.mo3060j()) != null && m40VarMo3060j.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f4166n;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                m40VarMo3060j.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM4383b = m40VarMo3060j.m4383b(motionEventObtainNoHistory, this.f4165m);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM4383b && z3) {
                    z = true;
                } else if (mo2964d()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (mo2964d()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f4165m = motionEvent.getPointerId(0);
                    if (this.f4162e == null) {
                        this.f4162e = new fe0(this, 0);
                    }
                    view2.postDelayed(this.f4162e, this.f4159b);
                    if (this.f4163f == null) {
                        this.f4163f = new fe0(this, 1);
                    }
                    view2.postDelayed(this.f4163f, this.f4160c);
                } else if (actionMasked2 == 1) {
                    m2961a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f4165m);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f4158a;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m2961a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo2963c()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m2961a();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f4164g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4164g = false;
        this.f4165m = -1;
        fe0 fe0Var = this.f4162e;
        if (fe0Var != null) {
            this.f4161d.removeCallbacks(fe0Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
