package p000;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0056t;
import androidx.fragment.app.C0042f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0043g;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.ssmousepro.injection.InjectionMetrics;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.logging.Level;

/* JADX INFO: renamed from: ya */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1621ya implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12915a;

    /* JADX INFO: renamed from: b */
    public final Object f12916b;

    public /* synthetic */ RunnableC1621ya(Object obj, int i) {
        this.f12915a = i;
        this.f12916b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 0;
        switch (this.f12915a) {
            case 0:
                C0093bb c0093bb = (C0093bb) this.f12916b;
                y91 y91Var = c0093bb.f1270d;
                try {
                    C0634fb c0634fb = c0093bb.f1275n;
                    if (c0634fb != null) {
                        C1073lj c1073lj = c0093bb.f1268b;
                        long j = c1073lj.f6361b;
                        if (j > 0) {
                            c0634fb.mo956q(j, c1073lj);
                        }
                    }
                } catch (IOException e) {
                    y91Var.m7063o(e);
                }
                try {
                    C0634fb c0634fb2 = c0093bb.f1275n;
                    if (c0634fb2 != null) {
                        c0634fb2.close();
                    }
                } catch (IOException e2) {
                    y91Var.m7063o(e2);
                }
                try {
                    Socket socket = c0093bb.f1276o;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    y91Var.m7063o(e3);
                    return;
                }
            case 1:
                pt0 pt0Var = (pt0) this.f12916b;
                m40 m40Var = pt0Var.f9144c;
                C1291pd c1291pd = pt0Var.f9142a;
                if (pt0Var.f9156t) {
                    if (pt0Var.f9154r) {
                        pt0Var.f9154r = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c1291pd.f8852e = jCurrentAnimationTimeMillis;
                        c1291pd.f8854g = -1L;
                        c1291pd.f8853f = jCurrentAnimationTimeMillis;
                        c1291pd.f8855h = 0.5f;
                    }
                    if ((c1291pd.f8854g > 0 && AnimationUtils.currentAnimationTimeMillis() > c1291pd.f8854g + ((long) c1291pd.f8856i)) || !pt0Var.m5332e()) {
                        pt0Var.f9156t = false;
                        return;
                    }
                    if (pt0Var.f9155s) {
                        pt0Var.f9155s = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
                        m40Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c1291pd.f8853f == 0) {
                        l41.m4048q("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM5251a = c1291pd.m5251a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - c1291pd.f8853f;
                    c1291pd.f8853f = jCurrentAnimationTimeMillis2;
                    qt0.m5608b(pt0Var.f9158v, (int) (j2 * ((fM5251a * 4.0f) + ((-4.0f) * fM5251a * fM5251a)) * c1291pd.f8851d));
                    WeakHashMap weakHashMap = i72.f4849a;
                    s62.m5992m(m40Var, this);
                    return;
                }
                return;
            case 2:
                C0117c c0117c = (C0117c) this.f12916b;
                c0117c.f1592c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0117c.f1594e;
                m72 m72Var = bottomSheetBehavior.f1967M;
                if (m72Var != null && m72Var.m4394f()) {
                    c0117c.m1091a(c0117c.f1591b);
                    return;
                } else {
                    if (bottomSheetBehavior.f1966L == 2) {
                        bottomSheetBehavior.m1657I(c0117c.f1591b);
                        return;
                    }
                    return;
                }
            case 3:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!TextUtils.equals(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
            case 4:
                k00 k00Var = (k00) this.f12916b;
                k00Var.f5625b.endViewTransition(k00Var.f5626c);
                k00Var.f5627d.m336a();
                return;
            case 5:
                qf0.m5487a(4, (ArrayList) this.f12916b);
                return;
            case 6:
                ((m10) this.f12916b).f6587a.onReady();
                return;
            case 7:
                ((s10) this.f12916b).f10195a.mo4768p();
                return;
            case 8:
                DialogInterfaceOnCancelListenerC0043g dialogInterfaceOnCancelListenerC0043g = (DialogInterfaceOnCancelListenerC0043g) this.f12916b;
                dialogInterfaceOnCancelListenerC0043g.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC0043g.mDialog);
                return;
            case 9:
                m40 m40Var2 = (m40) this.f12916b;
                m40Var2.f6635q = null;
                m40Var2.drawableStateChanged();
                return;
            case 10:
                s90 s90Var = (s90) this.f12916b;
                ValueAnimator valueAnimator = s90Var.f10312z;
                int i2 = s90Var.f10285A;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                s90Var.f10285A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), TouchPipeline.SIZE);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 11:
                ((C0042f) this.f12916b).m345d();
                return;
            case 12:
                ((AbstractC0056t) this.f12916b).m412x(true);
                return;
            case 13:
                gp0 gp0Var = (gp0) ((RunnableC1466u3) this.f12916b).f11107c;
                yx0 yx0Var = gp0Var.f4278r;
                gp0Var.f4277q = null;
                gp0Var.f4278r = null;
                yx0Var.mo2580h(nv1.f7559n.m4614g("InternalSubchannel closed transport due to address change"));
                return;
            case 14:
                synchronized (((hu0) this.f12916b).f4705a) {
                    obj = ((hu0) this.f12916b).f4710f;
                    ((hu0) this.f12916b).f4710f = hu0.f4704k;
                    break;
                }
                ((hu0) this.f12916b).mo939h(obj);
                return;
            case 15:
                wg1 wg1Var = (wg1) this.f12916b;
                xo1[] xo1VarArr = wg1Var.f12173y;
                int length = xo1VarArr.length;
                while (i < length) {
                    xo1 xo1Var = xo1VarArr[i];
                    xo1Var.m6944l(true);
                    ay0 ay0Var = xo1Var.f12668h;
                    if (ay0Var != null) {
                        ay0Var.m763B(xo1Var.f12665e);
                        xo1Var.f12668h = null;
                        xo1Var.f12667g = null;
                    }
                    i++;
                }
                C1174o9 c1174o9 = wg1Var.f12166r;
                x80 x80Var = (x80) c1174o9.f7700c;
                if (x80Var != null) {
                    x80Var.release();
                    c1174o9.f7700c = null;
                }
                c1174o9.f7701d = null;
                return;
            case 16:
                ((ox0) ((C0765is) this.f12916b).f5143b).m5082M0();
                return;
            case 17:
                ox0 ox0Var = ((gx0) this.f12916b).f4358t;
                ox0Var.f8565u.m5930d();
                if (ox0Var.f8520E) {
                    ox0Var.f8519D.mo6118L();
                    return;
                }
                return;
            case 18:
                gp0 gp0Var2 = ((nx0) this.f12916b).f7575n;
                gp0Var2.f4271k.execute(new ap0(gp0Var2, ox0.f8512p0, i));
                return;
            case 19:
                C1289pb c1289pb = (C1289pb) this.f12916b;
                long j3 = c1289pb.f8826b;
                long jMax = Math.max(2 * j3, j3);
                C1326qb c1326qb = (C1326qb) c1289pb.f8827c;
                if (c1326qb.f9465b.compareAndSet(j3, jMax)) {
                    C1326qb.f9463c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c1326qb.f9464a, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 20:
                y91 y91Var2 = (y91) this.f12916b;
                y91Var2.f12903o.execute(y91Var2.f12908t);
                synchronized (((y91) this.f12916b).f12899k) {
                    y91 y91Var3 = (y91) this.f12916b;
                    y91Var3.f12876D = Integer.MAX_VALUE;
                    y91Var3.m7066s();
                    break;
                }
                return;
            case 21:
                tc1 tc1Var = (tc1) this.f12916b;
                tc1Var.f10836q = null;
                if (tc1Var.f10833n.m2377b()) {
                    tc1Var.mo4604p();
                    return;
                }
                return;
            case 22:
                ((o21) ((rc1) this.f12916b).f9886c).mo4186q0();
                return;
            case 23:
                dx0 dx0Var = (dx0) this.f12916b;
                if (dx0Var.f3071z) {
                    return;
                }
                dx0Var.f3066u.mo4768p();
                return;
            case 24:
                lm1 lm1Var = (lm1) this.f12916b;
                dx0 dx0Var2 = (dx0) lm1Var.f6389c.f9549c;
                nm1 nm1Var = lm1Var.f6388b;
                d51 d51Var = dx0.f3038E;
                dx0Var2.m2397s(nm1Var);
                return;
            case 25:
                ((sm1) this.f12916b).mo6118L();
                return;
            case InjectionMetrics.I_MAX_ACTIVE_REJ /* 26 */:
                try {
                    ((Runnable) this.f12916b).run();
                    return;
                } catch (Exception e6) {
                    hr1.m3274j(e6, "Executor", "Background execution failure.");
                    return;
                }
            case InjectionMetrics.I_TAP_ID_EXHAUST /* 27 */:
                ((StaggeredGridLayoutManager) this.f12916b).m636z0();
                return;
            default:
                ((Toolbar) this.f12916b).m274v();
                return;
        }
    }
}
