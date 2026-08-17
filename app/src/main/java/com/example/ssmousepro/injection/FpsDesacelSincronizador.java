package com.example.ssmousepro.injection;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.List;
import p000.AbstractC1414sp;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsDesacelSincronizador {
    public static final FpsDesacelSincronizador INSTANCE = new FpsDesacelSincronizador();

    private FpsDesacelSincronizador() {
    }

    public static /* synthetic */ List comandosSincronizar$default(FpsDesacelSincronizador fpsDesacelSincronizador, Resources resources, int i, Object obj) {
        if ((i & 1) != 0) {
            resources = null;
        }
        return fpsDesacelSincronizador.comandosSincronizar(resources);
    }

    public final void aplicarValoresDoCodigo() {
        FpsDesacelModo.INSTANCE.aplicarValoresDoCodigo();
        FpsFfAntiAceleracaoConfig.INSTANCE.aplicarValoresDoCodigo();
    }

    public final List<String> comandosSincronizar(Resources resources) {
        DisplayMetrics displayMetrics;
        aplicarValoresDoCodigo();
        return AbstractC1414sp.m6124n0(FpsDesacelModo.INSTANCE.comandoSincronizar(), FpsFfAntiAceleracaoConfig.INSTANCE.comandoSincronizar((resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? FpsFfAntiAceleracaoConfig.INSTANCE.getDensidadeDpi() : displayMetrics.densityDpi));
    }
}
