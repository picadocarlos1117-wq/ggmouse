package com.example.ssmousepro.injection;

import p000.AbstractC1308pu;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsDesacelModo {
    public static final FpsDesacelModo INSTANCE = new FpsDesacelModo();
    private static final ModoDesacelFps MODO_ATIVO;
    private static volatile ModoDesacelFps modoAtivo;

    static {
        ModoDesacelFps modoDesacelFps = ModoDesacelFps.FF_ANTI_ACEL;
        MODO_ATIVO = modoDesacelFps;
        modoAtivo = modoDesacelFps;
    }

    private FpsDesacelModo() {
    }

    public final void aplicarValoresDoCodigo() {
        modoAtivo = MODO_ATIVO;
    }

    public final String comandoSincronizar() {
        return AbstractC1308pu.m5339f("FPS_DESACEL_MODO ", MODO_ATIVO.name());
    }

    public final ModoDesacelFps getMODO_ATIVO() {
        return MODO_ATIVO;
    }

    public final ModoDesacelFps getModoAtivo() {
        return modoAtivo;
    }

    public final void setModoAtivo(ModoDesacelFps modoDesacelFps) {
        modoDesacelFps.getClass();
        modoAtivo = modoDesacelFps;
    }
}
