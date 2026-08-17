package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.AbstractC0068g;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class ws0 {

    /* JADX INFO: renamed from: a */
    public int f12271a = -1;

    /* JADX INFO: renamed from: b */
    public RecyclerView f12272b;

    /* JADX INFO: renamed from: c */
    public AbstractC0066e f12273c;

    /* JADX INFO: renamed from: d */
    public boolean f12274d;

    /* JADX INFO: renamed from: e */
    public boolean f12275e;

    /* JADX INFO: renamed from: f */
    public View f12276f;

    /* JADX INFO: renamed from: g */
    public final uj1 f12277g;

    /* JADX INFO: renamed from: h */
    public boolean f12278h;

    /* JADX INFO: renamed from: i */
    public final LinearInterpolator f12279i;

    /* JADX INFO: renamed from: j */
    public final DecelerateInterpolator f12280j;

    /* JADX INFO: renamed from: k */
    public PointF f12281k;

    /* JADX INFO: renamed from: l */
    public final DisplayMetrics f12282l;

    /* JADX INFO: renamed from: m */
    public boolean f12283m;

    /* JADX INFO: renamed from: n */
    public float f12284n;

    /* JADX INFO: renamed from: o */
    public int f12285o;

    /* JADX INFO: renamed from: p */
    public int f12286p;

    public ws0(Context context) {
        uj1 uj1Var = new uj1();
        uj1Var.f11319d = -1;
        uj1Var.f11321f = false;
        uj1Var.f11322g = 0;
        uj1Var.f11316a = 0;
        uj1Var.f11317b = 0;
        uj1Var.f11318c = Integer.MIN_VALUE;
        uj1Var.f11320e = null;
        this.f12277g = uj1Var;
        this.f12279i = new LinearInterpolator();
        this.f12280j = new DecelerateInterpolator();
        this.f12283m = false;
        this.f12285o = 0;
        this.f12286p = 0;
        this.f12282l = context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m6826a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            f40.m2713i("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public int mo5276b(View view, int i) {
        AbstractC0066e abstractC0066e = this.f12273c;
        if (abstractC0066e == null || !abstractC0066e.mo534d()) {
            return 0;
        }
        mj1 mj1Var = (mj1) view.getLayoutParams();
        return m6826a((view.getLeft() - ((mj1) view.getLayoutParams()).f7011b.left) - ((ViewGroup.MarginLayoutParams) mj1Var).leftMargin, view.getRight() + ((mj1) view.getLayoutParams()).f7011b.right + ((ViewGroup.MarginLayoutParams) mj1Var).rightMargin, abstractC0066e.m659C(), abstractC0066e.f995n - abstractC0066e.m660D(), i);
    }

    /* JADX INFO: renamed from: c */
    public int mo5277c(View view, int i) {
        AbstractC0066e abstractC0066e = this.f12273c;
        if (abstractC0066e == null || !abstractC0066e.mo536e()) {
            return 0;
        }
        mj1 mj1Var = (mj1) view.getLayoutParams();
        return m6826a((view.getTop() - ((mj1) view.getLayoutParams()).f7011b.top) - ((ViewGroup.MarginLayoutParams) mj1Var).topMargin, view.getBottom() + ((mj1) view.getLayoutParams()).f7011b.bottom + ((ViewGroup.MarginLayoutParams) mj1Var).bottomMargin, abstractC0066e.m661E(), abstractC0066e.f996o - abstractC0066e.m658B(), i);
    }

    /* JADX INFO: renamed from: d */
    public float mo5278d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: renamed from: e */
    public int mo6827e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f12283m) {
            this.f12284n = mo5278d(this.f12282l);
            this.f12283m = true;
        }
        return (int) Math.ceil(fAbs * this.f12284n);
    }

    /* JADX INFO: renamed from: f */
    public PointF mo5279f(int i) {
        Object obj = this.f12273c;
        if (obj instanceof vj1) {
            return ((vj1) obj).mo528a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + vj1.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX INFO: renamed from: g */
    public final void m6828g(int i, int i2) {
        PointF pointFMo5279f;
        RecyclerView recyclerView = this.f12272b;
        if (this.f12271a == -1 || recyclerView == null) {
            m6830i();
        }
        if (this.f12274d && this.f12276f == null && this.f12273c != null && (pointFMo5279f = mo5279f(this.f12271a)) != null) {
            float f = pointFMo5279f.x;
            if (f != TouchPipeline.SIZE || pointFMo5279f.y != TouchPipeline.SIZE) {
                recyclerView.m580c0((int) Math.signum(f), (int) Math.signum(pointFMo5279f.y), null);
            }
        }
        this.f12274d = false;
        View view = this.f12276f;
        uj1 uj1Var = this.f12277g;
        if (view != null) {
            this.f12272b.getClass();
            AbstractC0068g abstractC0068gM547J = RecyclerView.m547J(view);
            if ((abstractC0068gM547J != null ? abstractC0068gM547J.getLayoutPosition() : -1) == this.f12271a) {
                View view2 = this.f12276f;
                wj1 wj1Var = recyclerView.f918l0;
                mo6829h(view2, uj1Var);
                uj1Var.m6496a(recyclerView);
                m6830i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f12276f = null;
            }
        }
        if (this.f12275e) {
            wj1 wj1Var2 = recyclerView.f918l0;
            if (this.f12272b.f931s.m678v() == 0) {
                m6830i();
            } else {
                int i3 = this.f12285o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f12285o = i4;
                int i5 = this.f12286p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f12286p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFMo5279f2 = mo5279f(this.f12271a);
                    if (pointFMo5279f2 != null) {
                        float f2 = pointFMo5279f2.x;
                        if (f2 == TouchPipeline.SIZE && pointFMo5279f2.y == TouchPipeline.SIZE) {
                            uj1Var.f11319d = this.f12271a;
                            m6830i();
                        } else {
                            float f3 = pointFMo5279f2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFMo5279f2.x / fSqrt;
                            pointFMo5279f2.x = f4;
                            float f5 = pointFMo5279f2.y / fSqrt;
                            pointFMo5279f2.y = f5;
                            this.f12281k = pointFMo5279f2;
                            this.f12285o = (int) (f4 * 10000.0f);
                            this.f12286p = (int) (f5 * 10000.0f);
                            int iMo6827e = mo6827e(10000);
                            int i7 = (int) (this.f12285o * 1.2f);
                            int i8 = (int) (this.f12286p * 1.2f);
                            uj1Var.f11316a = i7;
                            uj1Var.f11317b = i8;
                            uj1Var.f11318c = (int) (iMo6827e * 1.2f);
                            uj1Var.f11320e = this.f12279i;
                            uj1Var.f11321f = true;
                        }
                    } else {
                        uj1Var.f11319d = this.f12271a;
                        m6830i();
                    }
                }
            }
            boolean z = uj1Var.f11319d >= 0;
            uj1Var.m6496a(recyclerView);
            if (z && this.f12275e) {
                this.f12274d = true;
                recyclerView.f915i0.m7318b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    /* JADX INFO: renamed from: h */
    public void mo6829h(View view, uj1 uj1Var) {
        int i;
        PointF pointF = this.f12281k;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == TouchPipeline.SIZE) {
                i = 0;
            } else {
                i = f > TouchPipeline.SIZE ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iMo5276b = mo5276b(view, i);
        PointF pointF2 = this.f12281k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != TouchPipeline.SIZE) {
                i2 = f2 > TouchPipeline.SIZE ? 1 : -1;
            }
        }
        int iMo5277c = mo5277c(view, i2);
        int iCeil = (int) Math.ceil(((double) mo6827e((int) Math.sqrt((iMo5277c * iMo5277c) + (iMo5276b * iMo5276b)))) / 0.3356d);
        if (iCeil > 0) {
            uj1Var.f11316a = -iMo5276b;
            uj1Var.f11317b = -iMo5277c;
            uj1Var.f11318c = iCeil;
            uj1Var.f11320e = this.f12280j;
            uj1Var.f11321f = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6830i() {
        if (this.f12275e) {
            this.f12275e = false;
            this.f12286p = 0;
            this.f12285o = 0;
            this.f12281k = null;
            this.f12272b.f918l0.f12193a = -1;
            this.f12276f = null;
            this.f12271a = -1;
            this.f12274d = false;
            AbstractC0066e abstractC0066e = this.f12273c;
            if (abstractC0066e.f986e == this) {
                abstractC0066e.f986e = null;
            }
            this.f12273c = null;
            this.f12272b = null;
        }
    }
}
