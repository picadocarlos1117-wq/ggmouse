package p000;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.AbstractC0066e;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class s90 extends jj1 {

    /* JADX INFO: renamed from: C */
    public static final int[] f10283C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f10284D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f10285A;

    /* JADX INFO: renamed from: B */
    public final RunnableC1621ya f10286B;

    /* JADX INFO: renamed from: a */
    public final int f10287a;

    /* JADX INFO: renamed from: b */
    public final int f10288b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f10289c;

    /* JADX INFO: renamed from: d */
    public final Drawable f10290d;

    /* JADX INFO: renamed from: e */
    public final int f10291e;

    /* JADX INFO: renamed from: f */
    public final int f10292f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f10293g;

    /* JADX INFO: renamed from: h */
    public final Drawable f10294h;

    /* JADX INFO: renamed from: i */
    public final int f10295i;

    /* JADX INFO: renamed from: j */
    public final int f10296j;

    /* JADX INFO: renamed from: k */
    public int f10297k;

    /* JADX INFO: renamed from: l */
    public int f10298l;

    /* JADX INFO: renamed from: m */
    public float f10299m;

    /* JADX INFO: renamed from: n */
    public int f10300n;

    /* JADX INFO: renamed from: o */
    public int f10301o;

    /* JADX INFO: renamed from: p */
    public float f10302p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f10305s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f10312z;

    /* JADX INFO: renamed from: q */
    public int f10303q = 0;

    /* JADX INFO: renamed from: r */
    public int f10304r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f10306t = false;

    /* JADX INFO: renamed from: u */
    public boolean f10307u = false;

    /* JADX INFO: renamed from: v */
    public int f10308v = 0;

    /* JADX INFO: renamed from: w */
    public int f10309w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f10310x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f10311y = new int[2];

    public s90(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(TouchPipeline.SIZE, 1.0f);
        this.f10312z = valueAnimatorOfFloat;
        this.f10285A = 0;
        RunnableC1621ya runnableC1621ya = new RunnableC1621ya(this, 10);
        this.f10286B = runnableC1621ya;
        r90 r90Var = new r90(this);
        this.f10289c = stateListDrawable;
        this.f10290d = drawable;
        this.f10293g = stateListDrawable2;
        this.f10294h = drawable2;
        this.f10291e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10292f = Math.max(i, drawable.getIntrinsicWidth());
        this.f10295i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10296j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10287a = i2;
        this.f10288b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new d90(this));
        valueAnimatorOfFloat.addUpdateListener(new C1109mi(this, 1));
        RecyclerView recyclerView2 = this.f10305s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f935u;
            AbstractC0066e abstractC0066e = recyclerView2.f931s;
            if (abstractC0066e != null) {
                abstractC0066e.mo531c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m566O();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f10305s;
            recyclerView3.f937v.remove(this);
            if (recyclerView3.f939w == this) {
                recyclerView3.f939w = null;
            }
            ArrayList arrayList2 = this.f10305s.f922n0;
            if (arrayList2 != null) {
                arrayList2.remove(r90Var);
            }
            this.f10305s.removeCallbacks(runnableC1621ya);
        }
        this.f10305s = recyclerView;
        recyclerView.m585g(this);
        this.f10305s.f937v.add(this);
        this.f10305s.m587h(r90Var);
    }

    /* JADX INFO: renamed from: e */
    public static int m6008e(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // p000.jj1
    /* JADX INFO: renamed from: b */
    public final void mo3655b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f10303q;
        RecyclerView recyclerView2 = this.f10305s;
        if (i != recyclerView2.getWidth() || this.f10304r != recyclerView2.getHeight()) {
            this.f10303q = recyclerView2.getWidth();
            this.f10304r = recyclerView2.getHeight();
            m6011f(0);
            return;
        }
        if (this.f10285A != 0) {
            if (this.f10306t) {
                int i2 = this.f10303q;
                int i3 = this.f10291e;
                int i4 = i2 - i3;
                int i5 = this.f10298l;
                int i6 = this.f10297k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f10289c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f10292f;
                int i9 = this.f10304r;
                Drawable drawable = this.f10290d;
                drawable.setBounds(0, 0, i8, i9);
                WeakHashMap weakHashMap = i72.f4849a;
                if (t62.m6240d(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, TouchPipeline.SIZE);
                    drawable.draw(canvas);
                    canvas.translate(TouchPipeline.SIZE, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f10307u) {
                int i10 = this.f10304r;
                int i11 = this.f10295i;
                int i12 = i10 - i11;
                int i13 = this.f10301o;
                int i14 = this.f10300n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f10293g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f10303q;
                int i17 = this.f10296j;
                Drawable drawable2 = this.f10294h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(TouchPipeline.SIZE, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, TouchPipeline.SIZE);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6009c(float f, float f2) {
        if (f2 < this.f10304r - this.f10295i) {
            return false;
        }
        int i = this.f10301o;
        int i2 = this.f10300n;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6010d(float f, float f2) {
        WeakHashMap weakHashMap = i72.f4849a;
        int iM6240d = t62.m6240d(this.f10305s);
        int i = this.f10291e;
        if (iM6240d == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f10303q - i) {
            return false;
        }
        int i2 = this.f10298l;
        int i3 = this.f10297k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: f */
    public final void m6011f(int i) {
        RecyclerView recyclerView = this.f10305s;
        RunnableC1621ya runnableC1621ya = this.f10286B;
        StateListDrawable stateListDrawable = this.f10289c;
        if (i == 2 && this.f10308v != 2) {
            stateListDrawable.setState(f10283C);
            recyclerView.removeCallbacks(runnableC1621ya);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            m6012g();
        }
        if (this.f10308v == 2 && i != 2) {
            stateListDrawable.setState(f10284D);
            recyclerView.removeCallbacks(runnableC1621ya);
            recyclerView.postDelayed(runnableC1621ya, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(runnableC1621ya);
            recyclerView.postDelayed(runnableC1621ya, 1500L);
        }
        this.f10308v = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m6012g() {
        int i = this.f10285A;
        ValueAnimator valueAnimator = this.f10312z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f10285A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
