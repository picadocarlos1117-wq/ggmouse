package com.example.ssmousepro.hud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;
import p000.AbstractC1337qm;
import p000.AbstractC1571wy;
import p000.C0694gy;
import p000.mg0;
import p000.og0;
import p000.p32;
import p000.y60;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsViewHudView extends View {
    public static final Companion Companion = new Companion(null);
    public static final float SENS_MAX = 20.0f;
    public static final float SENS_MIN = 0.1f;
    public static final float SENS_PASSO = 0.05f;
    private final Paint anelExternoPaint;
    private final Paint anelInternoPaint;
    private final Paint chevronPaint;
    private final Paint cruzPaint;
    private final float densidade;
    private final Paint escutaPaint;
    private final Paint fundoCirculoPaint;
    private boolean modoEdicao;
    private boolean modoEscuta;
    private mg0 onCentroClick;
    private og0 onSensXChanged;
    private og0 onSensYChanged;
    private float sensX;
    private float sensY;
    private String teclaRotulo;
    private final Paint textoSensPaint;
    private final Paint textoTeclaPaint;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum AreaToque {
        CENTRO,
        SENS_X_MAIS,
        SENS_X_MENOS,
        SENS_Y_MAIS,
        SENS_Y_MENOS,
        NENHUMA;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AreaToque.values().length];
            try {
                iArr[AreaToque.CENTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AreaToque.SENS_X_MAIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AreaToque.SENS_X_MENOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AreaToque.SENS_Y_MAIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AreaToque.SENS_Y_MENOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AreaToque.NENHUMA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsViewHudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.sensX = 1.0f;
        this.sensY = 0.5f;
        float f = getResources().getDisplayMetrics().density;
        this.densidade = f;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(2.0f * f);
        paint.setColor(Color.parseColor("#6629B6F6"));
        this.anelExternoPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.5f * f);
        paint2.setColor(Color.parseColor("#CCFFFFFF"));
        this.anelInternoPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(Color.parseColor("#F2FFFFFF"));
        this.fundoCirculoPaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(1.0f * f);
        paint4.setColor(Color.parseColor("#AAFFFFFF"));
        this.cruzPaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(Color.parseColor("#212121"));
        Paint.Align align = Paint.Align.CENTER;
        paint5.setTextAlign(align);
        paint5.setFakeBoldText(true);
        this.textoTeclaPaint = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(-1);
        paint6.setTextAlign(align);
        paint6.setFakeBoldText(true);
        this.textoSensPaint = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(Color.parseColor("#CCFFFFFF"));
        paint7.setStrokeWidth(1.2f * f);
        paint7.setStyle(style);
        paint7.setStrokeCap(Paint.Cap.ROUND);
        this.chevronPaint = paint7;
        Paint paint8 = new Paint(1);
        paint8.setStyle(style);
        paint8.setStrokeWidth(f * 2.5f);
        paint8.setColor(Color.parseColor("#FFFFC107"));
        this.escutaPaint = paint8;
    }

    private final AreaToque areaToque(float f, float f2, float f3, float f4, float f5) {
        if (hypot(f - f3, f2 - f4) <= 1.15f * f5) {
            return AreaToque.CENTRO;
        }
        float f6 = 1.35f * f5;
        float f7 = 0.55f * f5;
        float f8 = f5 * 0.7f;
        float f9 = 0.15f * f6;
        if (f < f3 - f9 && f > f3 - (f6 * 1.4f)) {
            if (Math.abs(f2 - (f4 - f7)) < f8) {
                return AreaToque.SENS_X_MAIS;
            }
            if (Math.abs(f2 - (f4 + f7)) < f8) {
                return AreaToque.SENS_X_MENOS;
            }
        }
        if (f > f9 + f3 && f < (f6 * 1.4f) + f3) {
            if (Math.abs(f2 - (f4 - f7)) < f8) {
                return AreaToque.SENS_Y_MAIS;
            }
            if (Math.abs(f2 - (f4 + f7)) < f8) {
                return AreaToque.SENS_Y_MENOS;
            }
        }
        return AreaToque.NENHUMA;
    }

    private final void desenharChevron(Canvas canvas, float f, float f2, float f3, boolean z) {
        float f4 = (z ? -1.0f : 1.0f) * f3;
        float f5 = (0.4f * f4) + f2;
        float f6 = f2 - (f4 * 0.5f);
        canvas.drawLine(f - f3, f5, f, f6, this.chevronPaint);
        canvas.drawLine(f + f3, f5, f, f6, this.chevronPaint);
    }

    private final void desenharCirculoCentral(Canvas canvas, float f, float f2, float f3) {
        String str;
        canvas.drawCircle(f, f2, 1.12f * f3, this.anelExternoPaint);
        canvas.drawCircle(f, f2, f3, this.fundoCirculoPaint);
        canvas.drawCircle(f, f2, f3, this.anelInternoPaint);
        float f4 = f3 * 0.55f;
        canvas.drawLine(f, f2 - f4, f, f2 + f4, this.cruzPaint);
        canvas.drawLine(f - f4, f2, f + f4, f2, this.cruzPaint);
        if (this.modoEscuta) {
            canvas.drawCircle(f, f2, 1.08f * f3, this.escutaPaint);
        }
        String str2 = "?";
        if (!this.modoEscuta && (str = this.teclaRotulo) != null && !zv1.m7371K0(str)) {
            str2 = this.teclaRotulo;
            str2.getClass();
        }
        this.textoTeclaPaint.setTextSize(0.62f * f3);
        canvas.drawText(str2, f, (0.2f * f3) + f2, this.textoTeclaPaint);
    }

    private final void desenharSensibilidade(Canvas canvas, float f, float f2, float f3) {
        float f4 = 1.55f * f3;
        float f5 = 0.62f * f3;
        float f6 = f3 * 0.22f;
        this.textoSensPaint.setTextSize(0.34f * f3);
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.sensX)}, 1));
        String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.sensY)}, 1));
        float f7 = f - f4;
        float f8 = (f3 * 0.1f) + f2;
        canvas.drawText("X ".concat(str), f7, f8, this.textoSensPaint);
        float f9 = f + f4;
        canvas.drawText(str2.concat(" Y"), f9, f8, this.textoSensPaint);
        if (this.modoEdicao) {
            float f10 = f2 - f5;
            desenharChevron(canvas, f7, f10, f6, true);
            float f11 = f2 + f5;
            desenharChevron(canvas, f7, f11, f6, false);
            desenharChevron(canvas, f9, f10, f6, true);
            desenharChevron(canvas, f9, f11, f6, false);
        }
    }

    private final float hypot(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    public final boolean getModoEdicao() {
        return this.modoEdicao;
    }

    public final boolean getModoEscuta() {
        return this.modoEscuta;
    }

    public final mg0 getOnCentroClick() {
        return this.onCentroClick;
    }

    public final og0 getOnSensXChanged() {
        return this.onSensXChanged;
    }

    public final og0 getOnSensYChanged() {
        return this.onSensYChanged;
    }

    public final float getSensX() {
        return this.sensX;
    }

    public final float getSensY() {
        return this.sensY;
    }

    public final String getTeclaRotulo() {
        return this.teclaRotulo;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float fMin = Math.min(getWidth(), getHeight()) * 0.28f;
        desenharSensibilidade(canvas, width, height, fMin);
        desenharCirculoCentral(canvas, width, height, fMin);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.densidade;
        setMeasuredDimension((int) (136.0f * f), (int) (f * 72.0f));
    }

    public final void setModoEdicao(boolean z) {
        this.modoEdicao = z;
        invalidate();
    }

    public final void setModoEscuta(boolean z) {
        this.modoEscuta = z;
        invalidate();
    }

    public final void setOnCentroClick(mg0 mg0Var) {
        this.onCentroClick = mg0Var;
    }

    public final void setOnSensXChanged(og0 og0Var) {
        this.onSensXChanged = og0Var;
    }

    public final void setOnSensYChanged(og0 og0Var) {
        this.onSensYChanged = og0Var;
    }

    public final void setSensX(float f) {
        this.sensX = p32.m5139E(f, 0.1f, 20.0f);
        invalidate();
    }

    public final void setSensY(float f) {
        this.sensY = p32.m5139E(f, 0.1f, 20.0f);
        invalidate();
    }

    public final void setTeclaRotulo(String str) {
        this.teclaRotulo = str;
        invalidate();
    }

    public final boolean tratarTapEdicao(float f, float f2) {
        if (!this.modoEdicao) {
            return false;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[areaToque(f, f2, getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) * 0.28f).ordinal()]) {
            case 1:
                mg0 mg0Var = this.onCentroClick;
                if (mg0Var != null) {
                    mg0Var.invoke();
                }
                return true;
            case 2:
                float f3 = this.sensX + 0.05f;
                setSensX(f3 <= 20.0f ? f3 : 20.0f);
                og0 og0Var = this.onSensXChanged;
                if (og0Var != null) {
                    og0Var.invoke(Float.valueOf(this.sensX));
                }
                return true;
            case 3:
                float f4 = this.sensX - 0.05f;
                setSensX(f4 >= 0.1f ? f4 : 0.1f);
                og0 og0Var2 = this.onSensXChanged;
                if (og0Var2 != null) {
                    og0Var2.invoke(Float.valueOf(this.sensX));
                }
                return true;
            case 4:
                float f5 = this.sensY + 0.05f;
                setSensY(f5 <= 20.0f ? f5 : 20.0f);
                og0 og0Var3 = this.onSensYChanged;
                if (og0Var3 != null) {
                    og0Var3.invoke(Float.valueOf(this.sensY));
                }
                return true;
            case 5:
                float f6 = this.sensY - 0.05f;
                setSensY(f6 >= 0.1f ? f6 : 0.1f);
                og0 og0Var4 = this.onSensYChanged;
                if (og0Var4 != null) {
                    og0Var4.invoke(Float.valueOf(this.sensY));
                }
                return true;
            default:
                C0694gy.m3076b();
            case 6:
                return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1571wy abstractC1571wy) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FpsViewHudView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ FpsViewHudView(Context context, AttributeSet attributeSet, int i, int i2, AbstractC1571wy abstractC1571wy) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FpsViewHudView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
