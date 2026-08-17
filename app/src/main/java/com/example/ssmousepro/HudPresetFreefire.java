package com.example.ssmousepro;

import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class HudPresetFreefire {
    public static final HudPresetFreefire INSTANCE = new HudPresetFreefire();
    private static final String JSON_PADRAO = "[{\"tipo\":\"ANALOGICO\",\"x\":415,\"y\":710,\"refW\":2340,\"refH\":1080,\"teclaW\":\"W\",\"teclaS\":\"S\",\"teclaA\":\"A\",\"teclaD\":\"D\",\"rapidez\":200,\"mostrarTeclas\":true,\"tamanho\":142,\"centroX\":536,\"centroY\":831,\"raio\":71},{\"tipo\":\"FPS\",\"x\":1649,\"y\":395,\"refW\":2340,\"refH\":1080,\"tecla\":\"F1\",\"teclaTag\":\"F1\",\"teclaSuspender\":\"X\",\"teclaSuspenderTag\":\"X\",\"sensX\":1.0,\"sensY\":0.5,\"centroX\":1873,\"centroY\":529,\"raio\":101},{\"tipo\":\"TOQUE\",\"x\":1749,\"y\":714,\"refW\":2340,\"refH\":1080,\"tecla\":\"Mouse[272]\",\"teclaTag\":\"Mouse[272]\",\"modoToque\":\"press\",\"centroX\":1812,\"centroY\":802,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":2135,\"y\":448,\"refW\":2340,\"refH\":1080,\"tecla\":\"Mouse[273]\",\"teclaTag\":\"Mouse[273]\",\"modoToque\":\"press\",\"centroX\":2198,\"centroY\":536,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":2127,\"y\":582,\"refW\":2340,\"refH\":1080,\"tecla\":\"Shift\",\"teclaTag\":\"Shift\",\"modoToque\":\"press\",\"centroX\":2190,\"centroY\":670,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":2135,\"y\":929,\"refW\":2340,\"refH\":1080,\"tecla\":\"C\",\"teclaTag\":\"C\",\"modoToque\":\"press\",\"centroX\":2198,\"centroY\":1017,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1834,\"y\":137,\"refW\":2340,\"refH\":1080,\"tecla\":\"1\",\"teclaTag\":\"1\",\"modoToque\":\"tap\",\"tapMs\":1,\"centroX\":1897,\"centroY\":225,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1990,\"y\":133,\"refW\":2340,\"refH\":1080,\"tecla\":\"2\",\"teclaTag\":\"2\",\"modoToque\":\"tap\",\"tapMs\":1,\"centroX\":2053,\"centroY\":221,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":2123,\"y\":122,\"refW\":2340,\"refH\":1080,\"tecla\":\"3\",\"teclaTag\":\"3\",\"modoToque\":\"tap\",\"tapMs\":1,\"centroX\":2186,\"centroY\":210,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1952,\"y\":8,\"refW\":2340,\"refH\":1080,\"tecla\":\"R\",\"teclaTag\":\"R\",\"modoToque\":\"tap\",\"tapMs\":1,\"centroX\":2015,\"centroY\":96,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1589,\"y\":173,\"refW\":2340,\"refH\":1080,\"tecla\":\"Q\",\"teclaTag\":\"Q\",\"modoToque\":\"tap\",\"tapMs\":1,\"centroX\":1652,\"centroY\":261,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1505,\"y\":781,\"refW\":2340,\"refH\":1080,\"tecla\":\"Enter\",\"teclaTag\":\"Enter\",\"modoToque\":\"press\",\"centroX\":1568,\"centroY\":869,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":149,\"y\":597,\"refW\":2340,\"refH\":1080,\"tecla\":\"Mouse[275]\",\"teclaTag\":\"Mouse[275]\",\"modoToque\":\"press\",\"centroX\":212,\"centroY\":685,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1256,\"y\":827,\"refW\":2340,\"refH\":1080,\"tecla\":\"T\",\"teclaTag\":\"T\",\"modoToque\":\"press\",\"centroX\":1319,\"centroY\":915,\"raio\":63},{\"tipo\":\"TOQUE\",\"x\":1249,\"y\":723,\"refW\":2340,\"refH\":1080,\"tecla\":\"Mouse[275]\",\"teclaTag\":\"Mouse[275]\",\"modoToque\":\"press\",\"centroX\":1312,\"centroY\":811,\"raio\":63},{\"tipo\":\"TOQUE_REP\",\"x\":2058,\"y\":737,\"refW\":2340,\"refH\":1080,\"tecla\":\"Espaço\",\"teclaTag\":\"Espaço\",\"modoToque\":\"press\",\"tapMs\":80,\"contagem\":5,\"repitaAteChave\":true,\"centroX\":2199,\"centroY\":825,\"raio\":63}]";
    public static final int REF_H = 1080;
    public static final int REF_W = 2340;
    public static final int VERSAO = 3;

    private HudPresetFreefire() {
    }

    public final String jsonPadrao() {
        return JSON_PADRAO;
    }

    public final boolean parecePresetAntigo(String str) {
        str.getClass();
        return (zv1.m7365E0(str, "\"centroX\":1680", false) && zv1.m7365E0(str, "\"centroX\":1750", false) && zv1.m7365E0(str, "\"tecla\":\"Espaço\"", false)) || (zv1.m7365E0(str, "\"refW\":1920", false) && zv1.m7365E0(str, "\"centroX\":1580", false) && zv1.m7365E0(str, "\"centroY\":860", false) && zv1.m7365E0(str, "\"centroX\":1380", false) && zv1.m7365E0(str, "\"tecla\":\"F1\"", false) && zv1.m7365E0(str, "\"tecla\":\"Tab\"", false));
    }
}
