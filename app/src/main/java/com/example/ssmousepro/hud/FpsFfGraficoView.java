package com.example.ssmousepro.hud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.example.ssmousepro.injection.FpsFfAntiAceleracao;
import com.example.ssmousepro.injection.FpsFfAntiAceleracaoConfig;
import com.example.ssmousepro.injection.TouchPipeline;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import p000.AbstractC1308pu;
import p000.AbstractC1414sp;
import p000.AbstractC1571wy;
import p000.jd0;
import p000.og0;
import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsFfGraficoView extends View {
    private final Paint curvaPaint;
    private float deltaRef;
    private final float densidade;
    private Float fatorEfetivoLive;
    private final Paint fillAbaixo;
    private final Paint fundo;
    private final Paint grade;
    private float larguraTela;
    private final Paint linhaDedo;
    private final Paint linhaOrigem;
    private final Paint linhaTela;
    private Float mouseX;
    private og0 onViewportAlterado;
    private float origemX;
    private boolean panAtivo;
    private float panStartMax;
    private float panStartMin;
    private float panStartPx;
    private float pinchCentroX;
    private float pinchDistStart;
    private float pinchMaxStart;
    private float pinchMinStart;
    private final Paint pontoDedo;
    private final Paint rotulo;
    private Float viewportXMax;
    private Float viewportXMin;
    private final float yMaxGrafico;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsFfGraficoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.deltaRef = 10.0f;
        this.larguraTela = 1080.0f;
        float f = getResources().getDisplayMetrics().density;
        this.densidade = f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.argb(200, 10, 14, 22));
        this.fundo = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(1.0f * f);
        paint2.setColor(Color.argb(60, 255, 255, 255));
        this.grade = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style2);
        paint3.setStrokeWidth(f * 2.5f);
        paint3.setColor(Color.rgb(76, 175, 80));
        this.curvaPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setColor(Color.argb(40, 76, 175, 80));
        this.fillAbaixo = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(f * 1.5f);
        paint5.setColor(Color.argb(140, 180, 180, 200));
        this.linhaTela = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setStrokeWidth(2.0f * f);
        paint6.setColor(Color.rgb(255, 224, 130));
        this.linhaOrigem = paint6;
        Paint paint7 = new Paint(1);
        paint7.setStyle(style2);
        paint7.setStrokeWidth(2.5f * f);
        paint7.setColor(Color.rgb(255, LocationRequest.PRIORITY_NO_POWER, 180));
        this.linhaDedo = paint7;
        Paint paint8 = new Paint(1);
        paint8.setStyle(style);
        paint8.setColor(Color.rgb(255, LocationRequest.PRIORITY_NO_POWER, 180));
        this.pontoDedo = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.rgb(238, 238, 238));
        paint9.setTextSize(f * 10.0f);
        this.rotulo = paint9;
        this.yMaxGrafico = 1.5f;
    }

    private final void aplicarViewport(float f, float f2) {
        float f3 = f2 - f;
        if (f3 < 120.0f) {
            f3 = 120.0f;
        }
        this.viewportXMin = Float.valueOf(f);
        this.viewportXMax = Float.valueOf(f + f3);
        og0 og0Var = this.onViewportAlterado;
        if (og0Var != null) {
            og0Var.invoke(descricaoZoom());
        }
        invalidate();
    }

    private final float dist(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i) - motionEvent.getX(i2);
        float y = motionEvent.getY(i) - motionEvent.getY(i2);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    private final float graphH() {
        float height = getHeight() - (pad() * 2.5f);
        if (height < 40.0f) {
            return 40.0f;
        }
        return height;
    }

    private final float origemOrDefault() {
        float f = this.origemX;
        return f > 1.0f ? f : this.larguraTela * 0.77f;
    }

    private final float pad() {
        return this.densidade * 8.0f;
    }

    private final float pxParaX(float f) {
        float fXMinVis = xMinVis();
        float fXMaxVis = xMaxVis();
        float width = getWidth() - (pad() * 2.0f);
        if (width < 1.0f) {
            width = 1.0f;
        }
        return ((fXMaxVis - fXMinVis) * ((f - pad()) / width)) + fXMinVis;
    }

    private final float xMaxVis() {
        Float f = this.viewportXMax;
        if (f != null) {
            return f.floatValue();
        }
        return (this.larguraTela * 1.2f) + origemOrDefault();
    }

    private final float xMinVis() {
        Float f = this.viewportXMin;
        return f != null ? f.floatValue() : origemOrDefault() - (this.larguraTela * 1.2f);
    }

    private final float xParaPx(float f) {
        float fXMinVis = xMinVis();
        float fXMaxVis = xMaxVis();
        float width = getWidth() - (pad() * 2.0f);
        if (width < 1.0f) {
            width = 1.0f;
        }
        return (((f - fXMinVis) / (fXMaxVis - fXMinVis)) * width) + pad();
    }

    private final float yParaFator(float f) {
        float fM5139E = p32.m5139E(f / this.yMaxGrafico, TouchPipeline.SIZE, 1.0f);
        return ((1.0f - fM5139E) * graphH()) + pad();
    }

    private final void zoomFator(float f) {
        float fXMinVis = xMinVis();
        float fXMaxVis = xMaxVis();
        float f2 = (fXMinVis + fXMaxVis) * 0.5f;
        float f3 = (fXMaxVis - fXMinVis) * 0.5f * f;
        aplicarViewport(f2 - f3, f2 + f3);
    }

    public final String descricaoZoom() {
        return AbstractC1308pu.m5338e("Zoom x ", (int) xMinVis(), (int) xMaxVis(), "…");
    }

    public final float fatorEfetivoEm(float f) {
        FpsFfAntiAceleracaoConfig fpsFfAntiAceleracaoConfig = FpsFfAntiAceleracaoConfig.INSTANCE;
        float densidadeDpi = fpsFfAntiAceleracaoConfig.getDensidadeDpi();
        float sensitivity = fpsFfAntiAceleracaoConfig.getSensitivity();
        float fOrigemOrDefault = origemOrDefault();
        float f2 = this.deltaRef;
        if (f < fOrigemOrDefault) {
            f2 = -f2;
        }
        float fFatorPassagemX = FpsFfAntiAceleracao.INSTANCE.fatorPassagemX(fOrigemOrDefault, f, f2, densidadeDpi) * sensitivity;
        return fFatorPassagemX < TouchPipeline.SIZE ? TouchPipeline.SIZE : fFatorPassagemX;
    }

    public final float getDeltaRef() {
        return this.deltaRef;
    }

    public final Float getFatorEfetivoLive() {
        return this.fatorEfetivoLive;
    }

    public final float getLarguraTela() {
        return this.larguraTela;
    }

    public final Float getMouseX() {
        return this.mouseX;
    }

    public final og0 getOnViewportAlterado() {
        return this.onViewportAlterado;
    }

    public final float getOrigemX() {
        return this.origemX;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = this.densidade;
        canvas.drawRoundRect(TouchPipeline.SIZE, TouchPipeline.SIZE, width, height, f * 8.0f, f * 8.0f, this.fundo);
        Iterator it = AbstractC1414sp.m6124n0(Float.valueOf(TouchPipeline.SIZE), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f)).iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            float fYParaFator = yParaFator(fFloatValue);
            canvas.drawLine(pad(), fYParaFator, width - pad(), fYParaFator, this.grade);
            canvas.drawText(((int) (fFloatValue * 100.0f)) + "%", pad() + 2.0f, fYParaFator - (this.densidade * 2.0f), this.rotulo);
        }
        float fXParaPx = xParaPx(TouchPipeline.SIZE);
        float fXParaPx2 = xParaPx(this.larguraTela);
        canvas.drawLine(fXParaPx, pad(), fXParaPx, graphH() + pad(), this.linhaTela);
        canvas.drawLine(fXParaPx2, pad(), fXParaPx2, pad() + graphH(), this.linhaTela);
        canvas.drawText("0", fXParaPx + 2.0f, (this.densidade * 10.0f) + pad() + graphH(), this.rotulo);
        canvas.drawText("tela", fXParaPx2 - (this.densidade * 28.0f), (this.densidade * 10.0f) + pad() + graphH(), this.rotulo);
        Path path = new Path();
        Path path2 = new Path();
        float fXMinVis = xMinVis();
        float fXMaxVis = xMaxVis();
        float fYParaFator2 = yParaFator(TouchPipeline.SIZE);
        boolean z = true;
        int i = 0;
        while (true) {
            float f2 = (((fXMaxVis - fXMinVis) * i) / 120.0f) + fXMinVis;
            float fM5139E = p32.m5139E(fatorEfetivoEm(f2), TouchPipeline.SIZE, this.yMaxGrafico);
            float fXParaPx3 = xParaPx(f2);
            float fYParaFator3 = yParaFator(fM5139E);
            if (z) {
                path.moveTo(fXParaPx3, fYParaFator3);
                path2.moveTo(fXParaPx3, fYParaFator2);
                path2.lineTo(fXParaPx3, fYParaFator3);
                z = false;
            } else {
                path.lineTo(fXParaPx3, fYParaFator3);
                path2.lineTo(fXParaPx3, fYParaFator3);
            }
            if (i == 120) {
                break;
            } else {
                i++;
            }
        }
        path2.lineTo(xParaPx(fXMaxVis), fYParaFator2);
        path2.close();
        canvas.drawPath(path2, this.fillAbaixo);
        canvas.drawPath(path, this.curvaPaint);
        float fXParaPx4 = xParaPx(origemOrDefault());
        canvas.drawLine(fXParaPx4, pad(), fXParaPx4, graphH() + pad(), this.linhaOrigem);
        canvas.drawText("origem", fXParaPx4 + 3.0f, (this.densidade * 12.0f) + pad(), this.rotulo);
        Float f3 = this.mouseX;
        if (f3 != null) {
            float fXParaPx5 = xParaPx(f3.floatValue());
            canvas.drawLine(fXParaPx5, pad(), fXParaPx5, graphH() + pad(), this.linhaDedo);
            Float f4 = this.fatorEfetivoLive;
            float fM5139E2 = p32.m5139E(f4 != null ? f4.floatValue() : fatorEfetivoEm(f3.floatValue()), TouchPipeline.SIZE, this.yMaxGrafico);
            canvas.drawCircle(fXParaPx5, yParaFator(fM5139E2), this.densidade * 5.0f, this.pontoDedo);
            canvas.drawText(jd0.m3610h((int) (100.0f * fM5139E2), "dedo ", "%"), fXParaPx5 + 4.0f, yParaFator(fM5139E2) - (this.densidade * 4.0f), this.rotulo);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.panAtivo = true;
            this.panStartPx = motionEvent.getX();
            this.panStartMin = xMinVis();
            this.panStartMax = xMaxVis();
            return true;
        }
        if (actionMasked == 1) {
            this.panAtivo = false;
        } else if (actionMasked == 2) {
            if (motionEvent.getPointerCount() >= 2 && this.pinchDistStart > 1.0f) {
                float fM5139E = (this.pinchMaxStart - this.pinchMinStart) * 0.5f * p32.m5139E(this.pinchDistStart / dist(motionEvent, 0, 1), 0.3f, 4.0f);
                float f = this.pinchCentroX;
                aplicarViewport(f - fM5139E, f + fM5139E);
                return true;
            }
            if (this.panAtivo) {
                float x = motionEvent.getX() - this.panStartPx;
                float f2 = this.panStartMax - this.panStartMin;
                float width = getWidth() - (pad() * 2.0f);
                float f3 = ((-x) / (width >= 1.0f ? width : 1.0f)) * f2;
                aplicarViewport(this.panStartMin + f3, this.panStartMax + f3);
                return true;
            }
        } else if (actionMasked == 3) {
            this.panAtivo = false;
        } else if (actionMasked == 5 && motionEvent.getPointerCount() >= 2) {
            this.panAtivo = false;
            this.pinchDistStart = dist(motionEvent, 0, 1);
            this.pinchMinStart = xMinVis();
            this.pinchMaxStart = xMaxVis();
            this.pinchCentroX = pxParaX((motionEvent.getX(1) + motionEvent.getX(0)) * 0.5f);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void resetZoom() {
        this.viewportXMin = null;
        this.viewportXMax = null;
        og0 og0Var = this.onViewportAlterado;
        if (og0Var != null) {
            og0Var.invoke(descricaoZoom());
        }
        invalidate();
    }

    public final void setDeltaRef(float f) {
        this.deltaRef = f;
    }

    public final void setFatorEfetivoLive(Float f) {
        Float f2 = this.fatorEfetivoLive;
        if (f2 == null) {
            if (f == null) {
                return;
            }
        } else if (f != null && f2.floatValue() == f.floatValue()) {
            return;
        }
        this.fatorEfetivoLive = f;
        invalidate();
    }

    public final void setLarguraTela(float f) {
        if (f < 200.0f) {
            f = 200.0f;
        }
        this.larguraTela = f;
        invalidate();
    }

    public final void setMouseX(Float f) {
        Float f2 = this.mouseX;
        if (f2 == null) {
            if (f == null) {
                return;
            }
        } else if (f != null && f2.floatValue() == f.floatValue()) {
            return;
        }
        this.mouseX = f;
        invalidate();
    }

    public final void setOnViewportAlterado(og0 og0Var) {
        this.onViewportAlterado = og0Var;
    }

    public final void setOrigemX(float f) {
        if (this.origemX == f) {
            return;
        }
        this.origemX = f;
        invalidate();
    }

    public final void zoomIn() {
        zoomFator(0.7f);
    }

    public final void zoomOut() {
        zoomFator(1.35f);
    }

    public final void zoomPresetOrigem() {
        float f = this.origemX;
        if (f <= TouchPipeline.SIZE) {
            f = this.larguraTela * 0.77f;
        }
        float f2 = this.larguraTela;
        aplicarViewport(f - (f2 * 0.55f), (f2 * 0.55f) + f);
    }

    public final void zoomPresetTela() {
        float f = this.larguraTela;
        aplicarViewport((-f) * 0.15f, f * 1.15f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FpsFfGraficoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ FpsFfGraficoView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1571wy abstractC1571wy) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FpsFfGraficoView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
