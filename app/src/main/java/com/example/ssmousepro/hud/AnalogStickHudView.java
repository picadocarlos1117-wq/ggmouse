package com.example.ssmousepro.hud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.example.ssmousepro.injection.TouchPipeline;
import p000.AbstractC1571wy;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AnalogStickHudView extends View {
    private final Paint anelPaint;
    private final float densidade;
    private final Paint fundoAnelPaint;
    private boolean mostrarTeclas;
    private final Paint petalaBordaPaint;
    private final Paint petalaPaint;
    private String teclaA;
    private String teclaD;
    private String teclaS;
    private String teclaW;
    private final Paint textoPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalogStickHudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.mostrarTeclas = true;
        this.teclaW = "W";
        this.teclaS = "S";
        this.teclaA = "A";
        this.teclaD = "D";
        float f = getResources().getDisplayMetrics().density;
        this.densidade = f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(2.5f * f);
        paint.setColor(Color.parseColor("#29B6F6"));
        this.anelPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setColor(Color.parseColor("#3329B6F6"));
        this.fundoAnelPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style2);
        paint3.setColor(Color.parseColor("#F5F5F5"));
        this.petalaPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(f * 1.0f);
        paint4.setColor(Color.parseColor("#33000000"));
        this.petalaBordaPaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(Color.parseColor("#212121"));
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setFakeBoldText(true);
        this.textoPaint = paint5;
    }

    private final void desenharPetala(Canvas canvas, float f, float f2, float f3, String str, float f4) {
        double radians = Math.toRadians(f4);
        float f5 = 0.52f * f3;
        float fCos = (((float) Math.cos(radians)) * f5) + f;
        float fSin = (((float) Math.sin(radians)) * f5) + f2;
        Path path = new Path();
        float f6 = (0.42f * f3) / 2.0f;
        float f7 = (0.36f * f3) / 2.0f;
        float f8 = f3 * 0.08f;
        path.addRoundRect(new RectF(fCos - f6, fSin - f7, f6 + fCos, f7 + fSin), f8, f8, Path.Direction.CW);
        canvas.save();
        canvas.rotate(f4, fCos, fSin);
        canvas.drawPath(path, this.petalaPaint);
        canvas.drawPath(path, this.petalaBordaPaint);
        canvas.rotate(-f4, fCos, fSin);
        canvas.drawText(str, fCos, (this.textoPaint.getTextSize() * 0.35f) + fSin, this.textoPaint);
        canvas.restore();
    }

    public final boolean getMostrarTeclas() {
        return this.mostrarTeclas;
    }

    public final String getTeclaA() {
        return this.teclaA;
    }

    public final String getTeclaD() {
        return this.teclaD;
    }

    public final String getTeclaS() {
        return this.teclaS;
    }

    public final String getTeclaW() {
        return this.teclaW;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = Math.min(width, height) * 0.9f;
        canvas.drawCircle(width, height, fMin, this.fundoAnelPaint);
        canvas.drawCircle(width, height, fMin, this.anelPaint);
        if (this.mostrarTeclas) {
            this.textoPaint.setTextSize(0.28f * fMin);
            desenharPetala(canvas, width, height, fMin, this.teclaW, -90.0f);
            desenharPetala(canvas, width, height, fMin, this.teclaS, 90.0f);
            desenharPetala(canvas, width, height, fMin, this.teclaA, 180.0f);
            desenharPetala(canvas, width, height, fMin, this.teclaD, TouchPipeline.SIZE);
        }
    }

    public final void setMostrarTeclas(boolean z) {
        this.mostrarTeclas = z;
        invalidate();
    }

    public final void setTeclaA(String str) {
        str.getClass();
        if (zv1.m7371K0(str)) {
            str = "A";
        }
        this.teclaA = str;
        invalidate();
    }

    public final void setTeclaD(String str) {
        str.getClass();
        if (zv1.m7371K0(str)) {
            str = "D";
        }
        this.teclaD = str;
        invalidate();
    }

    public final void setTeclaS(String str) {
        str.getClass();
        if (zv1.m7371K0(str)) {
            str = "S";
        }
        this.teclaS = str;
        invalidate();
    }

    public final void setTeclaW(String str) {
        str.getClass();
        if (zv1.m7371K0(str)) {
            str = "W";
        }
        this.teclaW = str;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalogStickHudView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ AnalogStickHudView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1571wy abstractC1571wy) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalogStickHudView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
