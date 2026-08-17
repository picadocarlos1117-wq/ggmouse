package com.example.ssmousepro.injection;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsFfAntiAceleracaoConfig {
    public static final float DENSITY_DPI_PADRAO = 480.0f;
    public static final boolean LOG_ATIVO = false;
    public static final float SENSITIVITY_PADRAO = 1.2f;
    public static final FpsFfAntiAceleracaoConfig INSTANCE = new FpsFfAntiAceleracaoConfig();
    private static volatile float sensitivity = 1.2f;
    private static volatile float densidadeDpi = 480.0f;

    private FpsFfAntiAceleracaoConfig() {
    }

    public final void aplicarValoresDoCodigo() {
        sensitivity = 1.2f;
    }

    public final String comandoSincronizar(float f) {
        if (f < 120.0f) {
            f = 120.0f;
        }
        densidadeDpi = f;
        return "FPS_FF_ANTI " + sensitivity + " " + densidadeDpi;
    }

    public final float getDensidadeDpi() {
        return densidadeDpi;
    }

    public final float getSensitivity() {
        return sensitivity;
    }

    public final void setDensidadeDpi(float f) {
        densidadeDpi = f;
    }

    public final void setSensitivity(float f) {
        sensitivity = f;
    }
}
