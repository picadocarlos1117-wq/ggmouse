package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ge0 f3771b;

    public /* synthetic */ fe0(ge0 ge0Var, int i) {
        this.f3770a = i;
        this.f3771b = ge0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3770a;
        ge0 ge0Var = this.f3771b;
        switch (i) {
            case 0:
                ViewParent parent = ge0Var.f4161d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                ge0Var.m2961a();
                View view = ge0Var.f4161d;
                if (view.isEnabled() && !view.isLongClickable() && ge0Var.mo2963c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    ge0Var.f4164g = true;
                    break;
                }
                break;
        }
    }
}
