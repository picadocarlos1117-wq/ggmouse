package com.example.ssmousepro.injection;

import p000.bc1;
import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsAcelLimiar {
    public static final FpsAcelLimiar INSTANCE = new FpsAcelLimiar();

    private FpsAcelLimiar() {
    }

    private final float aplicarEixo(float f, float f2, float f3) {
        if (f2 < TouchPipeline.SIZE) {
            f2 = 0.0f;
        }
        float fM5139E = p32.m5139E(f3, 1.0f, 3.0f);
        return (f2 <= TouchPipeline.SIZE || fM5139E <= 1.001f || Math.abs(f) < f2) ? f : f * fM5139E;
    }

    public final bc1 aplicar(float f, float f2, float f3, float f4, float f5, float f6) {
        return new bc1(Float.valueOf(aplicarEixo(f, f3, f4)), Float.valueOf(aplicarEixo(f2, f5, f6)));
    }
}
