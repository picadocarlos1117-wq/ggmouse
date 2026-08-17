package com.example.ssmousepro.injection;

import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsFfAntiAceleracao {
    public static final FpsFfAntiAceleracao INSTANCE = new FpsFfAntiAceleracao();
    private static final float K_LERP = 28.0f;

    private FpsFfAntiAceleracao() {
    }

    public final float aplicarDeltaX(float f, float f2, float f3, float f4, float f5) {
        return f3 == TouchPipeline.SIZE ? TouchPipeline.SIZE : fatorPassagemX(f, f2, f3, f4) * f3 * f5;
    }

    public final float fatorPassagemX(float f, float f2, float f3, float f4) {
        if (f3 == TouchPipeline.SIZE) {
            return 1.0f;
        }
        if (f4 < 120.0f) {
            f4 = 120.0f;
        }
        float fM5139E = ((((p32.m5139E(f3 / 300.0f, -1.0f, 1.0f) * K_LERP) * 3.0f) * ((Math.abs(((326.0f / f4) * (((f2 + f3) - f) - (0.5f * f3))) / 300.0f) * 3.0f) + 1.0f)) * 0.2f) / 0.6f;
        if (fM5139E == TouchPipeline.SIZE) {
            return 1.0f;
        }
        return Math.abs((f3 * 0.1f) / fM5139E);
    }
}
