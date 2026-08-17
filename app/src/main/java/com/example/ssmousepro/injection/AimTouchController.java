package com.example.ssmousepro.injection;

import android.util.Log;
import p000.bc1;
import p000.mg0;
import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AimTouchController {
    private static final float ASPECT_REF = 1.7777778f;
    private static final float DEDO_ESCALA_X = 0.25f;
    public static final AimTouchController INSTANCE = new AimTouchController();
    public static final int POINTER_ID = 2;
    private static final float SENS_X_UI_REF = 2.0f;
    private static final float SENS_Y_AJUSTE = 1.5f;
    private static final boolean SOFT_REPLANT_ATIVO = false;
    private static final float SOFT_REPLANT_FRAC = 0.22f;
    private static final float SOFT_REPLANT_MAX_PX = 480.0f;
    private static final float SOFT_REPLANT_MIN_PX = 260.0f;
    private static final String TAG = "AimTouchController";
    private static float aimCenterY;
    private static volatile float ancoraX;
    private static volatile boolean dedoAtivo;
    private static float injectDownX;
    private static float injectDownY;
    private static volatile float injectX;
    private static volatile float injectY;
    private static volatile mg0 onAntesPlantar;
    private static volatile mg0 onDepoisPlantar;
    private static volatile float origemCompensacaoX;
    private static volatile float virtualX;
    private static volatile float virtualY;

    private AimTouchController() {
    }

    private final float aspectScale(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return 1.0f;
        }
        return (i / i2) / ASPECT_REF;
    }

    private final float limiteSoftReplant(int i) {
        if (i < 320) {
            i = 320;
        }
        return p32.m5139E(i * SOFT_REPLANT_FRAC, SOFT_REPLANT_MIN_PX, 480.0f);
    }

    private final void plantar() {
        try {
            mg0 mg0Var = onAntesPlantar;
            if (mg0Var != null) {
                mg0Var.invoke();
            }
        } catch (Exception e) {
            Log.w(TAG, "onAntesPlantar falhou", e);
        }
        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
        bc1 bc1VarJitterDown = multiTouchInjector.jitterDown(virtualX, virtualY, 5);
        float fFloatValue = ((Number) bc1VarJitterDown.f1292a).floatValue();
        float fFloatValue2 = ((Number) bc1VarJitterDown.f1293b).floatValue();
        virtualX = fFloatValue;
        virtualY = fFloatValue2;
        injectX = fFloatValue;
        injectY = fFloatValue2;
        injectDownX = fFloatValue;
        injectDownY = fFloatValue2;
        ancoraX = fFloatValue;
        multiTouchInjector.down(2, fFloatValue, fFloatValue2);
        dedoAtivo = multiTouchInjector.estaAtivo(2);
        if (!dedoAtivo) {
            Log.w(TAG, "DOWN falhou; nova tentativa no próximo movimento");
        }
        try {
            mg0 mg0Var2 = onDepoisPlantar;
            if (mg0Var2 != null) {
                mg0Var2.invoke();
            }
        } catch (Exception e2) {
            Log.w(TAG, "onDepoisPlantar falhou", e2);
        }
    }

    private final boolean precisaSoftReplant(int i) {
        return ((float) Math.hypot((double) (injectX - injectDownX), (double) (injectY - injectDownY))) >= limiteSoftReplant(i);
    }

    public static /* synthetic */ void restaurarAposReinicio$default(AimTouchController aimTouchController, float f, float f2, float f3, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        aimTouchController.restaurarAposReinicio(f, f2, f3, z);
    }

    private final void softReplant() {
        MultiTouchInjector multiTouchInjector = MultiTouchInjector.INSTANCE;
        multiTouchInjector.m1584up(2);
        bc1 bc1VarJitterDown = multiTouchInjector.jitterDown(origemCompensacaoX, aimCenterY, 5);
        float fFloatValue = ((Number) bc1VarJitterDown.f1292a).floatValue();
        float fFloatValue2 = ((Number) bc1VarJitterDown.f1293b).floatValue();
        injectX = fFloatValue;
        injectY = fFloatValue2;
        injectDownX = fFloatValue;
        injectDownY = fFloatValue2;
        multiTouchInjector.down(2, fFloatValue, fFloatValue2);
        dedoAtivo = multiTouchInjector.estaAtivo(2);
        if (dedoAtivo) {
            return;
        }
        Log.w(TAG, "soft-replant DOWN falhou");
    }

    public final void aplicarDelta(int i, int i2, float f, float f2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return;
        }
        float fFloatValue = i * f * SENS_X_UI_REF * DEDO_ESCALA_X;
        float fAspectScale = i2 * f2 * DEDO_ESCALA_X * SENS_Y_AJUSTE * aspectScale(i3, i4);
        FpsLowSpeedGainConfig fpsLowSpeedGainConfig = FpsLowSpeedGainConfig.INSTANCE;
        if (fpsLowSpeedGainConfig.deveAplicar()) {
            FpsLowSpeedGain fpsLowSpeedGain = FpsLowSpeedGain.INSTANCE;
            boolean zEixoXAtivo = fpsLowSpeedGainConfig.eixoXAtivo();
            float thresholdY = TouchPipeline.SIZE;
            float thresholdX = zEixoXAtivo ? fpsLowSpeedGainConfig.getThresholdX() : 0.0f;
            float precisionXPermil = fpsLowSpeedGainConfig.getPrecisionXPermil() / 1000.0f;
            if (fpsLowSpeedGainConfig.eixoYAtivo()) {
                thresholdY = fpsLowSpeedGainConfig.getThresholdY();
            }
            bc1 bc1VarAplicar = fpsLowSpeedGain.aplicar(fFloatValue, fAspectScale, thresholdX, precisionXPermil, thresholdY, fpsLowSpeedGainConfig.getPrecisionYPermil() / 1000.0f);
            fFloatValue = ((Number) bc1VarAplicar.f1292a).floatValue();
            fAspectScale = ((Number) bc1VarAplicar.f1293b).floatValue();
        }
        float fFloatValue2 = fFloatValue;
        float fFloatValue3 = fAspectScale;
        FpsDesacelModo fpsDesacelModo = FpsDesacelModo.INSTANCE;
        ModoDesacelFps modoAtivo = fpsDesacelModo.getModoAtivo();
        ModoDesacelFps modoDesacelFps = ModoDesacelFps.FF_ANTI_ACEL;
        if (modoAtivo != modoDesacelFps) {
            FpsAcelLimiarConfig fpsAcelLimiarConfig = FpsAcelLimiarConfig.INSTANCE;
            if (fpsAcelLimiarConfig.deveAplicar()) {
                bc1 bc1VarAplicar2 = FpsAcelLimiar.INSTANCE.aplicar(fFloatValue2, fFloatValue3, fpsAcelLimiarConfig.getThresholdX(), fpsAcelLimiarConfig.getGainXPermil() / 1000.0f, fpsAcelLimiarConfig.getThresholdY(), fpsAcelLimiarConfig.getGainYPermil() / 1000.0f);
                fFloatValue2 = ((Number) bc1VarAplicar2.f1292a).floatValue();
                fFloatValue3 = ((Number) bc1VarAplicar2.f1293b).floatValue();
            }
        }
        float fAplicarDeltaX = fFloatValue2;
        if (fpsDesacelModo.getModoAtivo() == modoDesacelFps) {
            FpsFfAntiAceleracao fpsFfAntiAceleracao = FpsFfAntiAceleracao.INSTANCE;
            float f3 = origemCompensacaoX;
            float f4 = virtualX;
            FpsFfAntiAceleracaoConfig fpsFfAntiAceleracaoConfig = FpsFfAntiAceleracaoConfig.INSTANCE;
            fAplicarDeltaX = fpsFfAntiAceleracao.aplicarDeltaX(f3, f4, fAplicarDeltaX, fpsFfAntiAceleracaoConfig.getDensidadeDpi(), fpsFfAntiAceleracaoConfig.getSensitivity());
        }
        InjectionMetrics.INSTANCE.onApplyDelta(i, i2, fAplicarDeltaX, fFloatValue3);
        virtualX += fAplicarDeltaX;
        virtualY += fFloatValue3;
        if (!dedoAtivo) {
            plantar();
            return;
        }
        injectX += fAplicarDeltaX;
        injectY += fFloatValue3;
        MultiTouchInjector.INSTANCE.mover(2, injectX, injectY);
    }

    public final void ativar(float f, float f2) {
        virtualX = f;
        virtualY = f2;
        injectX = f;
        injectY = f2;
        ancoraX = f;
        aimCenterY = f2;
        injectDownX = f;
        injectDownY = f2;
        origemCompensacaoX = f;
        dedoAtivo = false;
        MultiTouchInjector.INSTANCE.m1584up(2);
    }

    public final void desativar() {
        dedoAtivo = false;
        MultiTouchInjector.INSTANCE.m1584up(2);
    }

    public final void forcarPlantarSeInativo() {
        if (dedoAtivo) {
            return;
        }
        plantar();
    }

    public final float getAncoraX() {
        return ancoraX;
    }

    public final boolean getDedoAtivo() {
        return dedoAtivo;
    }

    public final float getInjectX() {
        return injectX;
    }

    public final float getInjectY() {
        return injectY;
    }

    public final mg0 getOnAntesPlantar() {
        return onAntesPlantar;
    }

    public final mg0 getOnDepoisPlantar() {
        return onDepoisPlantar;
    }

    public final float getOrigemCompensacaoX() {
        return origemCompensacaoX;
    }

    public final float getVirtualX() {
        return virtualX;
    }

    public final float getVirtualY() {
        return virtualY;
    }

    public final void restaurarAposReinicio(float f, float f2, float f3, boolean z) {
        virtualX = f;
        virtualY = f2;
        injectX = f;
        injectY = f2;
        ancoraX = f3;
        aimCenterY = f2;
        injectDownX = f;
        injectDownY = f2;
        origemCompensacaoX = f3;
        if (z && MultiTouchInjector.INSTANCE.estaAtivo(2)) {
            dedoAtivo = true;
        } else {
            dedoAtivo = false;
        }
    }

    public final void setOnAntesPlantar(mg0 mg0Var) {
        onAntesPlantar = mg0Var;
    }

    public final void setOnDepoisPlantar(mg0 mg0Var) {
        onDepoisPlantar = mg0Var;
    }

    public final void soltarDedo() {
        MultiTouchInjector.INSTANCE.m1584up(2);
        dedoAtivo = false;
    }
}
