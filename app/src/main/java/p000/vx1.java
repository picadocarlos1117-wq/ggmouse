package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.example.ssmousepro.injection.TouchPipeline;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 {

    /* JADX INFO: renamed from: A */
    public int f11801A;

    /* JADX INFO: renamed from: B */
    public int f11802B;

    /* JADX INFO: renamed from: C */
    public int f11803C;

    /* JADX INFO: renamed from: D */
    public int f11804D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f11805E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f11806F;

    /* JADX INFO: renamed from: G */
    public int f11807G;

    /* JADX INFO: renamed from: H */
    public int f11808H;

    /* JADX INFO: renamed from: I */
    public int f11809I;

    /* JADX INFO: renamed from: J */
    public Rect f11810J;

    /* JADX INFO: renamed from: a */
    public final float f11811a;

    /* JADX INFO: renamed from: b */
    public final float f11812b;

    /* JADX INFO: renamed from: c */
    public final float f11813c;

    /* JADX INFO: renamed from: d */
    public final float f11814d;

    /* JADX INFO: renamed from: e */
    public final float f11815e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f11816f;

    /* JADX INFO: renamed from: g */
    public final Paint f11817g;

    /* JADX INFO: renamed from: h */
    public final Paint f11818h;

    /* JADX INFO: renamed from: i */
    public CharSequence f11819i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f11820j;

    /* JADX INFO: renamed from: k */
    public Bitmap f11821k;

    /* JADX INFO: renamed from: l */
    public float f11822l;

    /* JADX INFO: renamed from: m */
    public int f11823m;

    /* JADX INFO: renamed from: n */
    public int f11824n;

    /* JADX INFO: renamed from: o */
    public float f11825o;

    /* JADX INFO: renamed from: p */
    public int f11826p;

    /* JADX INFO: renamed from: q */
    public float f11827q;

    /* JADX INFO: renamed from: r */
    public float f11828r;

    /* JADX INFO: renamed from: s */
    public int f11829s;

    /* JADX INFO: renamed from: t */
    public int f11830t;

    /* JADX INFO: renamed from: u */
    public int f11831u;

    /* JADX INFO: renamed from: v */
    public int f11832v;

    /* JADX INFO: renamed from: w */
    public int f11833w;

    /* JADX INFO: renamed from: x */
    public float f11834x;

    /* JADX INFO: renamed from: y */
    public float f11835y;

    /* JADX INFO: renamed from: z */
    public float f11836z;

    public vx1(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f11815e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11814d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f11811a = fRound;
        this.f11812b = fRound;
        this.f11813c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f11816f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f11817g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f11818h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m6666a(Canvas canvas, boolean z) {
        Canvas canvas2;
        if (!z) {
            this.f11810J.getClass();
            this.f11821k.getClass();
            canvas.drawBitmap(this.f11821k, (Rect) null, this.f11810J, this.f11818h);
            return;
        }
        StaticLayout staticLayout = this.f11805E;
        StaticLayout staticLayout2 = this.f11806F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f11807G, this.f11808H);
        if (Color.alpha(this.f11831u) > 0) {
            int i = this.f11831u;
            Paint paint = this.f11817g;
            paint.setColor(i);
            canvas2 = canvas;
            canvas2.drawRect(-this.f11809I, TouchPipeline.SIZE, staticLayout.getWidth() + this.f11809I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i2 = this.f11833w;
        TextPaint textPaint = this.f11816f;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f11811a);
            textPaint.setColor(this.f11832v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.f11812b;
            if (i2 == 2) {
                float f2 = this.f11813c;
                textPaint.setShadowLayer(f, f2, f2, this.f11832v);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.f11832v;
                int i4 = z2 ? this.f11832v : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f11829s);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.f11829s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(TouchPipeline.SIZE, TouchPipeline.SIZE, TouchPipeline.SIZE, 0);
        canvas2.restoreToCount(iSave);
    }
}
