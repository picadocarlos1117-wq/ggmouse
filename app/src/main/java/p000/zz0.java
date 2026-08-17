package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.example.ssmousepro.injection.TouchPipeline;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public class zz0 extends Drawable implements zr1 {

    /* JADX INFO: renamed from: B */
    public static final Paint f13624B;

    /* JADX INFO: renamed from: A */
    public final boolean f13625A;

    /* JADX INFO: renamed from: a */
    public yz0 f13626a;

    /* JADX INFO: renamed from: b */
    public final xr1[] f13627b;

    /* JADX INFO: renamed from: c */
    public final xr1[] f13628c;

    /* JADX INFO: renamed from: d */
    public final BitSet f13629d;

    /* JADX INFO: renamed from: e */
    public boolean f13630e;

    /* JADX INFO: renamed from: f */
    public final Matrix f13631f;

    /* JADX INFO: renamed from: g */
    public final Path f13632g;

    /* JADX INFO: renamed from: m */
    public final Path f13633m;

    /* JADX INFO: renamed from: n */
    public final RectF f13634n;

    /* JADX INFO: renamed from: o */
    public final RectF f13635o;

    /* JADX INFO: renamed from: p */
    public final Region f13636p;

    /* JADX INFO: renamed from: q */
    public final Region f13637q;

    /* JADX INFO: renamed from: r */
    public pr1 f13638r;

    /* JADX INFO: renamed from: s */
    public final Paint f13639s;

    /* JADX INFO: renamed from: t */
    public final Paint f13640t;

    /* JADX INFO: renamed from: u */
    public final nr1 f13641u;

    /* JADX INFO: renamed from: v */
    public final pn0 f13642v;

    /* JADX INFO: renamed from: w */
    public final d31 f13643w;

    /* JADX INFO: renamed from: x */
    public PorterDuffColorFilter f13644x;

    /* JADX INFO: renamed from: y */
    public PorterDuffColorFilter f13645y;

    /* JADX INFO: renamed from: z */
    public final RectF f13646z;

    static {
        Paint paint = new Paint(1);
        f13624B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public zz0(yz0 yz0Var) {
        this.f13627b = new xr1[4];
        this.f13628c = new xr1[4];
        this.f13629d = new BitSet(8);
        this.f13631f = new Matrix();
        this.f13632g = new Path();
        this.f13633m = new Path();
        this.f13634n = new RectF();
        this.f13635o = new RectF();
        this.f13636p = new Region();
        this.f13637q = new Region();
        Paint paint = new Paint(1);
        this.f13639s = paint;
        Paint paint2 = new Paint(1);
        this.f13640t = paint2;
        this.f13641u = new nr1();
        this.f13643w = Looper.getMainLooper().getThread() == Thread.currentThread() ? qr1.f9564a : new d31();
        this.f13646z = new RectF();
        this.f13625A = true;
        this.f13626a = yz0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m7401l();
        m7400k(getState());
        this.f13642v = new pn0(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m7391a(RectF rectF, Path path) {
        yz0 yz0Var = this.f13626a;
        this.f13643w.m2208b(yz0Var.f13172a, yz0Var.f13180i, rectF, this.f13642v, path);
        if (this.f13626a.f13179h != 1.0f) {
            Matrix matrix = this.f13631f;
            matrix.reset();
            float f = this.f13626a.f13179h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f13646z, true);
    }

    /* JADX INFO: renamed from: b */
    public final int m7392b(int i) {
        int i2;
        yz0 yz0Var = this.f13626a;
        float f = yz0Var.f13184m + TouchPipeline.SIZE + yz0Var.f13183l;
        n50 n50Var = yz0Var.f13173b;
        if (n50Var == null || !n50Var.f7236a || AbstractC0539cq.m2115d(i, 255) != n50Var.f7239d) {
            return i;
        }
        float f2 = n50Var.f7240e;
        float fMin = (f2 <= TouchPipeline.SIZE || f <= TouchPipeline.SIZE) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM3195D = hp0.m3195D(fMin, AbstractC0539cq.m2115d(i, 255), n50Var.f7237b);
        if (fMin > TouchPipeline.SIZE && (i2 = n50Var.f7238c) != 0) {
            iM3195D = AbstractC0539cq.m2113b(AbstractC0539cq.m2115d(i2, n50.f7235f), iM3195D);
        }
        return AbstractC0539cq.m2115d(iM3195D, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public final void m7393c(Canvas canvas) {
        if (this.f13629d.cardinality() > 0) {
            Log.w("zz0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f13626a.f13186o;
        Path path = this.f13632g;
        nr1 nr1Var = this.f13641u;
        if (i != 0) {
            canvas.drawPath(path, nr1Var.f7516a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            xr1 xr1Var = this.f13627b[i2];
            int i3 = this.f13626a.f13185n;
            Matrix matrix = xr1.f12696b;
            xr1Var.mo5902a(matrix, nr1Var, i3, canvas);
            this.f13628c[i2].mo5902a(matrix, nr1Var, this.f13626a.f13185n, canvas);
        }
        if (this.f13625A) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f13626a.f13186o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f13626a.f13186o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f13624B);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7394d(Canvas canvas, Paint paint, Path path, pr1 pr1Var, RectF rectF) {
        if (!pr1Var.m5312d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo1128a = pr1Var.f9051f.mo1128a(rectF) * this.f13626a.f13180i;
            canvas.drawRoundRect(rectF, fMo1128a, fMo1128a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f13644x;
        Paint paint = this.f13639s;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f13626a.f13182k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f13645y;
        Paint paint2 = this.f13640t;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f13626a.f13181j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f13626a.f13182k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f13630e;
        Path path = this.f13632g;
        if (z) {
            boolean zM7396g = m7396g();
            float strokeWidth = TouchPipeline.SIZE;
            float f = -(zM7396g ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            pr1 pr1Var = this.f13626a.f13172a;
            or1 or1VarM5313e = pr1Var.m5313e();
            InterfaceC1271ou c0123c5 = pr1Var.f9050e;
            if (!(c0123c5 instanceof rk1)) {
                c0123c5 = new C0123c5(f, c0123c5);
            }
            or1VarM5313e.f8429e = c0123c5;
            InterfaceC1271ou c0123c6 = pr1Var.f9051f;
            if (!(c0123c6 instanceof rk1)) {
                c0123c6 = new C0123c5(f, c0123c6);
            }
            or1VarM5313e.f8430f = c0123c6;
            InterfaceC1271ou c0123c7 = pr1Var.f9053h;
            if (!(c0123c7 instanceof rk1)) {
                c0123c7 = new C0123c5(f, c0123c7);
            }
            or1VarM5313e.f8432h = c0123c7;
            InterfaceC1271ou c0123c8 = pr1Var.f9052g;
            if (!(c0123c8 instanceof rk1)) {
                c0123c8 = new C0123c5(f, c0123c8);
            }
            or1VarM5313e.f8431g = c0123c8;
            pr1 pr1VarM5050a = or1VarM5313e.m5050a();
            this.f13638r = pr1VarM5050a;
            float f2 = this.f13626a.f13180i;
            RectF rectFM7395f = m7395f();
            RectF rectF = this.f13635o;
            rectF.set(rectFM7395f);
            if (m7396g()) {
                strokeWidth = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(strokeWidth, strokeWidth);
            this.f13643w.m2208b(pr1VarM5050a, f2, rectF, null, this.f13633m);
            m7391a(m7395f(), path);
            this.f13630e = false;
        }
        yz0 yz0Var = this.f13626a;
        yz0Var.getClass();
        if (yz0Var.f13185n > 0 && !this.f13626a.f13172a.m5312d(m7395f()) && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f13626a.f13186o)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f13626a.f13186o)));
            if (this.f13625A) {
                RectF rectF2 = this.f13646z;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    f40.m2719o("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f13626a.f13185n * 2) + ((int) rectF2.width()) + iWidth, (this.f13626a.f13185n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.f13626a.f13185n) - iWidth;
                float f4 = (getBounds().top - this.f13626a.f13185n) - iHeight;
                canvas2.translate(-f3, -f4);
                m7393c(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                m7393c(canvas);
                canvas.restore();
            }
        }
        yz0 yz0Var2 = this.f13626a;
        Paint.Style style = yz0Var2.f13187p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m7394d(canvas, paint, path, yz0Var2.f13172a, m7395f());
        }
        if (m7396g()) {
            mo2130e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public void mo2130e(Canvas canvas) {
        pr1 pr1Var = this.f13638r;
        RectF rectFM7395f = m7395f();
        RectF rectF = this.f13635o;
        rectF.set(rectFM7395f);
        boolean zM7396g = m7396g();
        Paint paint = this.f13640t;
        float strokeWidth = zM7396g ? paint.getStrokeWidth() / 2.0f : TouchPipeline.SIZE;
        rectF.inset(strokeWidth, strokeWidth);
        m7394d(canvas, paint, this.f13633m, pr1Var, rectF);
    }

    /* JADX INFO: renamed from: f */
    public final RectF m7395f() {
        Rect bounds = getBounds();
        RectF rectF = this.f13634n;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7396g() {
        Paint.Style style = this.f13626a.f13187p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f13640t.getStrokeWidth() > TouchPipeline.SIZE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13626a.f13182k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f13626a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f13626a.getClass();
        if (this.f13626a.f13172a.m5312d(m7395f())) {
            outline.setRoundRect(getBounds(), this.f13626a.f13172a.f9050e.mo1128a(m7395f()) * this.f13626a.f13180i);
            return;
        }
        RectF rectFM7395f = m7395f();
        Path path = this.f13632g;
        m7391a(rectFM7395f, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f13626a.f13178g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f13636p;
        region.set(bounds);
        RectF rectFM7395f = m7395f();
        Path path = this.f13632g;
        m7391a(rectFM7395f, path);
        Region region2 = this.f13637q;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final void m7397h(Context context) {
        this.f13626a.f13173b = new n50(context);
        m7402m();
    }

    /* JADX INFO: renamed from: i */
    public final void m7398i(float f) {
        yz0 yz0Var = this.f13626a;
        if (yz0Var.f13184m != f) {
            yz0Var.f13184m = f;
            m7402m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f13630e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f13626a.f13176e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f13626a.getClass();
        ColorStateList colorStateList2 = this.f13626a.f13175d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f13626a.f13174c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m7399j(ColorStateList colorStateList) {
        yz0 yz0Var = this.f13626a;
        if (yz0Var.f13174c != colorStateList) {
            yz0Var.f13174c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7400k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f13626a.f13174c == null || color2 == (colorForState2 = this.f13626a.f13174c.getColorForState(iArr, (color2 = (paint2 = this.f13639s).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f13626a.f13175d == null || color == (colorForState = this.f13626a.f13175d.getColorForState(iArr, (color = (paint = this.f13640t).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7401l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f13644x;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f13645y;
        yz0 yz0Var = this.f13626a;
        ColorStateList colorStateList = yz0Var.f13176e;
        PorterDuff.Mode mode = yz0Var.f13177f;
        if (colorStateList == null || mode == null) {
            int color = this.f13639s.getColor();
            int iM7392b = m7392b(color);
            porterDuffColorFilter = iM7392b != color ? new PorterDuffColorFilter(iM7392b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m7392b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f13644x = porterDuffColorFilter;
        this.f13626a.getClass();
        this.f13645y = null;
        this.f13626a.getClass();
        return (i91.m3395a(porterDuffColorFilter2, this.f13644x) && i91.m3395a(porterDuffColorFilter3, this.f13645y)) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final void m7402m() {
        yz0 yz0Var = this.f13626a;
        float f = yz0Var.f13184m + TouchPipeline.SIZE;
        yz0Var.f13185n = (int) Math.ceil(0.75f * f);
        this.f13626a.f13186o = (int) Math.ceil(f * 0.25f);
        m7401l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f13626a = new yz0(this.f13626a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f13630e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m7400k(iArr) || m7401l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        yz0 yz0Var = this.f13626a;
        if (yz0Var.f13182k != i) {
            yz0Var.f13182k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13626a.getClass();
        super.invalidateSelf();
    }

    @Override // p000.zr1
    public final void setShapeAppearanceModel(pr1 pr1Var) {
        this.f13626a.f13172a = pr1Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f13626a.f13176e = colorStateList;
        m7401l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        yz0 yz0Var = this.f13626a;
        if (yz0Var.f13177f != mode) {
            yz0Var.f13177f = mode;
            m7401l();
            super.invalidateSelf();
        }
    }

    public zz0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(pr1.m5310b(context, attributeSet, i, i2).m5050a());
    }

    public zz0(pr1 pr1Var) {
        this(new yz0(pr1Var));
    }

    public zz0() {
        this(new pr1());
    }
}
