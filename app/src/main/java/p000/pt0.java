package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.firebase.iid.ServiceStarter;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class pt0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: w */
    public static final int f9141w = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final C1291pd f9142a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f9143b;

    /* JADX INFO: renamed from: c */
    public final m40 f9144c;

    /* JADX INFO: renamed from: d */
    public RunnableC1621ya f9145d;

    /* JADX INFO: renamed from: e */
    public final float[] f9146e;

    /* JADX INFO: renamed from: f */
    public final float[] f9147f;

    /* JADX INFO: renamed from: g */
    public final int f9148g;

    /* JADX INFO: renamed from: m */
    public final int f9149m;

    /* JADX INFO: renamed from: n */
    public final float[] f9150n;

    /* JADX INFO: renamed from: o */
    public final float[] f9151o;

    /* JADX INFO: renamed from: p */
    public final float[] f9152p;

    /* JADX INFO: renamed from: q */
    public boolean f9153q;

    /* JADX INFO: renamed from: r */
    public boolean f9154r;

    /* JADX INFO: renamed from: s */
    public boolean f9155s;

    /* JADX INFO: renamed from: t */
    public boolean f9156t;

    /* JADX INFO: renamed from: u */
    public boolean f9157u;

    /* JADX INFO: renamed from: v */
    public final m40 f9158v;

    public pt0(m40 m40Var) {
        C1291pd c1291pd = new C1291pd();
        c1291pd.f8852e = Long.MIN_VALUE;
        c1291pd.f8854g = -1L;
        c1291pd.f8853f = 0L;
        this.f9142a = c1291pd;
        this.f9143b = new AccelerateInterpolator();
        float[] fArr = {TouchPipeline.SIZE, TouchPipeline.SIZE};
        this.f9146e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f9147f = fArr2;
        float[] fArr3 = {TouchPipeline.SIZE, TouchPipeline.SIZE};
        this.f9150n = fArr3;
        float[] fArr4 = {TouchPipeline.SIZE, TouchPipeline.SIZE};
        this.f9151o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f9152p = fArr5;
        this.f9144c = m40Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f9148g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f9149m = f9141w;
        c1291pd.f8848a = ServiceStarter.ERROR_UNKNOWN;
        c1291pd.f8849b = ServiceStarter.ERROR_UNKNOWN;
        this.f9158v = m40Var;
    }

    /* JADX INFO: renamed from: b */
    public static float m5328b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: a */
    public final float m5329a(float f, float f2, float f3, int i) {
        float fM5328b;
        float interpolation;
        float fM5328b2 = m5328b(this.f9146e[i] * f2, TouchPipeline.SIZE, this.f9147f[i]);
        float fM5330c = m5330c(f2 - f, fM5328b2) - m5330c(f, fM5328b2);
        AccelerateInterpolator accelerateInterpolator = this.f9143b;
        if (fM5330c >= TouchPipeline.SIZE) {
            if (fM5330c > TouchPipeline.SIZE) {
                interpolation = accelerateInterpolator.getInterpolation(fM5330c);
            } else {
                fM5328b = 0.0f;
            }
            if (fM5328b == TouchPipeline.SIZE) {
                return TouchPipeline.SIZE;
            }
            float f4 = this.f9150n[i];
            float f5 = this.f9151o[i];
            float f6 = this.f9152p[i];
            float f7 = f4 * f3;
            return fM5328b > TouchPipeline.SIZE ? m5328b(fM5328b * f7, f5, f6) : -m5328b((-fM5328b) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM5330c);
        fM5328b = m5328b(interpolation, -1.0f, 1.0f);
        if (fM5328b == TouchPipeline.SIZE) {
            return TouchPipeline.SIZE;
        }
        float f8 = this.f9150n[i];
        float f9 = this.f9151o[i];
        float f10 = this.f9152p[i];
        float f11 = f8 * f3;
        if (fM5328b > TouchPipeline.SIZE) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m5330c(float f, float f2) {
        if (f2 != TouchPipeline.SIZE) {
            int i = this.f9148g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= TouchPipeline.SIZE) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f9156t && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < TouchPipeline.SIZE) {
                return f / (-f2);
            }
        }
        return TouchPipeline.SIZE;
    }

    /* JADX INFO: renamed from: d */
    public final void m5331d() {
        int i = 0;
        if (this.f9154r) {
            this.f9156t = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C1291pd c1291pd = this.f9142a;
        int i2 = (int) (jCurrentAnimationTimeMillis - c1291pd.f8852e);
        int i3 = c1291pd.f8849b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c1291pd.f8856i = i;
        c1291pd.f8855h = c1291pd.m5251a(jCurrentAnimationTimeMillis);
        c1291pd.f8854g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5332e() {
        m40 m40Var;
        int count;
        C1291pd c1291pd = this.f9142a;
        float f = c1291pd.f8851d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c1291pd.f8850c);
        if (iAbs != 0 && (count = (m40Var = this.f9158v).getCount()) != 0) {
            int childCount = m40Var.getChildCount();
            int firstVisiblePosition = m40Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && m40Var.getChildAt(0).getTop() >= 0)) : !(i >= count && m40Var.getChildAt(childCount - 1).getBottom() <= m40Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f9157u
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.m5331d()
            return r1
        L1b:
            r7.f9155s = r2
            r7.f9153q = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            m40 r4 = r7.f9144c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m5329a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m5329a(r9, r8, r3, r2)
            pd r9 = r7.f9142a
            r9.f8850c = r0
            r9.f8851d = r8
            boolean r8 = r7.f9156t
            if (r8 != 0) goto L7c
            boolean r8 = r7.m5332e()
            if (r8 == 0) goto L7c
            ya r8 = r7.f9145d
            if (r8 != 0) goto L60
            ya r8 = new ya
            r8.<init>(r7, r2)
            r7.f9145d = r8
        L60:
            r7.f9156t = r2
            r7.f9154r = r2
            boolean r8 = r7.f9153q
            if (r8 != 0) goto L75
            int r8 = r7.f9149m
            if (r8 <= 0) goto L75
            ya r9 = r7.f9145d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p000.i72.f4849a
            p000.s62.m5993n(r4, r9, r5)
            goto L7a
        L75:
            ya r8 = r7.f9145d
            r8.run()
        L7a:
            r7.f9153q = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pt0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
