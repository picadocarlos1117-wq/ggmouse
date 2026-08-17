package com.example.ssmousepro.injection;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class AimGraphConfig {
    public static final AimGraphConfig INSTANCE = new AimGraphConfig();
    public static final boolean MOSTRAR_DEBUG_OVERLAY = false;
    public static final boolean MOSTRAR_GRAFICO_NA_PARTIDA_PADRAO = false;
    private static volatile boolean mostrarGraficoNaPartida;

    private AimGraphConfig() {
    }

    public final boolean getMostrarGraficoNaPartida() {
        return mostrarGraficoNaPartida;
    }

    public final void setMostrarGraficoNaPartida(boolean z) {
        mostrarGraficoNaPartida = z;
    }
}
