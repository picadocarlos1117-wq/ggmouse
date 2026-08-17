package com.example.ssmousepro.injection;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.example.ssmousepro.activation.AdbPairingService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.DebugKt;
import p000.AbstractC1308pu;
import p000.AbstractC1337qm;
import p000.AbstractC1377rp;
import p000.AbstractC1414sp;
import p000.AbstractC1451tp;
import p000.AbstractC1571wy;
import p000.C0694gy;
import p000.C1284p6;
import p000.hp0;
import p000.jd0;
import p000.p32;
import p000.y60;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PipelineMonitorText {
    private static final List<Campo> CAMPOS;
    private static final int COR_ANORMAL;
    private static final int COR_BOM;
    private static final int COR_INFO;
    private static final int COR_MEDIO;
    private static final int COR_RUIM;
    private static final Set<String> IDS_ESSENCIAIS;
    private static final Set<String> IDS_TODOS;
    public static final PipelineMonitorText INSTANCE = new PipelineMonitorText();
    private static final String TAG = "MapperMonitor";

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Campo {

        /* JADX INFO: renamed from: id */
        private final String f1917id;
        private final String rotulo;

        public Campo(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f1917id = str;
            this.rotulo = str2;
        }

        public static /* synthetic */ Campo copy$default(Campo campo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = campo.f1917id;
            }
            if ((i & 2) != 0) {
                str2 = campo.rotulo;
            }
            return campo.copy(str, str2);
        }

        public final String component1() {
            return this.f1917id;
        }

        public final String component2() {
            return this.rotulo;
        }

        public final Campo copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new Campo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Campo)) {
                return false;
            }
            Campo campo = (Campo) obj;
            return hp0.m3214e(this.f1917id, campo.f1917id) && hp0.m3214e(this.rotulo, campo.rotulo);
        }

        public final String getId() {
            return this.f1917id;
        }

        public final String getRotulo() {
            return this.rotulo;
        }

        public int hashCode() {
            return this.rotulo.hashCode() + (this.f1917id.hashCode() * 31);
        }

        public String toString() {
            return jd0.m3617o("Campo(id=", this.f1917id, ", rotulo=", this.rotulo, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Linha {

        /* JADX INFO: renamed from: id */
        private final String f1918id;
        private final Nivel nivel;
        private final String texto;

        public Linha(String str, String str2, Nivel nivel) {
            str2.getClass();
            nivel.getClass();
            this.f1918id = str;
            this.texto = str2;
            this.nivel = nivel;
        }

        public static /* synthetic */ Linha copy$default(Linha linha, String str, String str2, Nivel nivel, int i, Object obj) {
            if ((i & 1) != 0) {
                str = linha.f1918id;
            }
            if ((i & 2) != 0) {
                str2 = linha.texto;
            }
            if ((i & 4) != 0) {
                nivel = linha.nivel;
            }
            return linha.copy(str, str2, nivel);
        }

        public final String component1() {
            return this.f1918id;
        }

        public final String component2() {
            return this.texto;
        }

        public final Nivel component3() {
            return this.nivel;
        }

        public final Linha copy(String str, String str2, Nivel nivel) {
            str2.getClass();
            nivel.getClass();
            return new Linha(str, str2, nivel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Linha)) {
                return false;
            }
            Linha linha = (Linha) obj;
            return hp0.m3214e(this.f1918id, linha.f1918id) && hp0.m3214e(this.texto, linha.texto) && this.nivel == linha.nivel;
        }

        public final String getId() {
            return this.f1918id;
        }

        public final Nivel getNivel() {
            return this.nivel;
        }

        public final String getTexto() {
            return this.texto;
        }

        public int hashCode() {
            String str = this.f1918id;
            return this.nivel.hashCode() + AbstractC1308pu.m5336c((str == null ? 0 : str.hashCode()) * 31, 31, this.texto);
        }

        public String toString() {
            String str = this.f1918id;
            String str2 = this.texto;
            Nivel nivel = this.nivel;
            StringBuilder sbM3618p = jd0.m3618p("Linha(id=", str, ", texto=", str2, ", nivel=");
            sbM3618p.append(nivel);
            sbM3618p.append(")");
            return sbM3618p.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public enum Nivel {
        INFO,
        BOM,
        MEDIO,
        RUIM,
        ANORMAL;

        private static final /* synthetic */ y60 $ENTRIES = AbstractC1337qm.m5553p(values());

        public static y60 getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Nivel.values().length];
            try {
                iArr[Nivel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Nivel.BOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Nivel.MEDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Nivel.RUIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Nivel.ANORMAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<Campo> listM6124n0 = AbstractC1414sp.m6124n0(new Campo("poll", "poll"), new Campo("aim", "aim"), new Campo("dedo", "dedo"), new Campo("syn", "syn (hw)"), new Campo("mouseIn", "mouse in"), new Campo("mouseOut", "mouse out"), new Campo("coalesce", "coalesce"), new Campo("injectFail", "inject fail"), new Campo("injectAvg", "inject avg"), new Campo("injectMax", "inject max"), new Campo("clickAvg", "click avg"), new Campo("clickLast", "click last"), new Campo("clickMax", "click max"), new Campo("moveFail", "moveFail"), new Campo("downFail", "downFail"), new Campo("zeroOut", "zeroOut"), new Campo("fila", "fila coalesce"), new Campo("forceFlush", "forceFlush"), new Campo("rejMax", "rej maxActive"), new Campo("tapEx", "tapId exhaust"), new Campo("teclado", "teclado"), new Campo("toques", "toques ativos"), new Campo("aimLoop", "aimLoop"), new Campo("binder", "binder RTT"), new Campo("stutter", "stutter out"));
        CAMPOS = listM6124n0;
        List<Campo> list = listM6124n0;
        ArrayList arrayList = new ArrayList(AbstractC1451tp.m6307o0(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Campo) it.next()).getId());
        }
        IDS_TODOS = AbstractC1377rp.m5869D0(arrayList);
        IDS_ESSENCIAIS = AbstractC1337qm.m5531c0("poll", "mouseIn", "mouseOut", "coalesce", "injectFail", "clickLast", "toques", "aimLoop");
        COR_INFO = Color.parseColor("#B0BEC5");
        COR_BOM = Color.parseColor("#69F0AE");
        COR_MEDIO = Color.parseColor("#FFB74D");
        COR_RUIM = Color.parseColor("#FF5252");
        COR_ANORMAL = Color.parseColor("#40C4FF");
    }

    private PipelineMonitorText() {
    }

    private static final double avaliar$avgClickMs(long[] jArr) {
        long j = jArr[21];
        if (j <= 0) {
            return 0.0d;
        }
        return (jArr[20] / j) / 1000000.0d;
    }

    private static final double avaliar$avgInjectMs(long[] jArr) {
        long j = jArr[10] + jArr[11];
        long j2 = jArr[12];
        if (j <= 0) {
            return 0.0d;
        }
        return (j2 / j) / 1000000.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List avaliar$default(PipelineMonitorText pipelineMonitorText, long[] jArr, Estado estado, boolean z, Set set, double d, int i, Object obj) {
        if ((i & 8) != 0) {
            set = IDS_TODOS;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            d = -1.0d;
        }
        return pipelineMonitorText.avaliar(jArr, estado, z, set2, d);
    }

    private static final long avaliar$delta(long[] jArr, long[] jArr2, int i) {
        if (jArr == null) {
            return 0L;
        }
        long j = jArr2[i] - jArr[i];
        if (j < 0) {
            return 0L;
        }
        return j;
    }

    private static final List<Linha> avaliar$filtrar(List<Linha> list, Set<String> set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Linha linha = (Linha) obj;
            if (linha.getId() == null || set.contains(linha.getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final double avaliar$rate(long[] jArr, double d, long[] jArr2, int i) {
        if (jArr == null || d <= 0.0d) {
            return 0.0d;
        }
        long j = jArr2[i] - jArr[i];
        if (j < 0) {
            j = 0;
        }
        return j / d;
    }

    private final String campo(String str, String str2) {
        if (str.length() < 16) {
            int length = 16 - str.length();
            if (length < 0) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + length + '.').toString());
            }
            String string = "";
            if (length != 0) {
                int i = 1;
                if (length != 1) {
                    int length2 = ".".length();
                    if (length2 != 0) {
                        if (length2 != 1) {
                            StringBuilder sb = new StringBuilder(".".length() * length);
                            if (1 <= length) {
                                while (true) {
                                    sb.append((CharSequence) ".");
                                    if (i == length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            string = sb.toString();
                        } else {
                            char cCharAt = ".".charAt(0);
                            char[] cArr = new char[length];
                            for (int i2 = 0; i2 < length; i2++) {
                                cArr[i2] = cCharAt;
                            }
                            string = new String(cArr);
                        }
                    }
                } else {
                    string = ".".toString();
                }
            }
            str = jd0.m3614l(str, string);
        }
        return AbstractC1308pu.m5340g(str, " ", str2);
    }

    private final int corDe(Nivel nivel) {
        int i = WhenMappings.$EnumSwitchMapping$0[nivel.ordinal()];
        if (i == 1) {
            return COR_INFO;
        }
        if (i == 2) {
            return COR_BOM;
        }
        if (i == 3) {
            return COR_MEDIO;
        }
        if (i == 4) {
            return COR_RUIM;
        }
        if (i == 5) {
            return COR_ANORMAL;
        }
        C0694gy.m3076b();
        return 0;
    }

    private final String fmt(double d) {
        if (d >= 100.0d) {
            return String.format("%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        }
        return d >= 10.0d ? String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    private final String fmtTotDelta(long j, long j2) {
        return j + "  Δ" + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence formatar$lambda$2(Linha linha) {
        linha.getClass();
        return linha.getTexto();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharSequence formatarSpannable$default(PipelineMonitorText pipelineMonitorText, long[] jArr, Estado estado, boolean z, Set set, double d, int i, Object obj) {
        if ((i & 8) != 0) {
            set = IDS_TODOS;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            d = -1.0d;
        }
        return pipelineMonitorText.formatarSpannable(jArr, estado, z, set2, d);
    }

    public final List<Linha> avaliar(long[] jArr, Estado estado, boolean z, Set<String> set, double d) {
        double d2;
        double d3;
        String str;
        Nivel nivel;
        Nivel nivel2;
        Nivel nivel3;
        Nivel nivel4;
        Nivel nivel5;
        Nivel nivel6;
        Nivel nivel7;
        Nivel nivel8;
        Nivel nivel9;
        Nivel nivel10;
        Nivel nivel11;
        Nivel nivel12;
        Nivel nivel13;
        Nivel nivel14;
        Nivel nivel15;
        Nivel nivel16;
        Nivel nivel17;
        Nivel nivel18;
        Nivel nivel19;
        ArrayList arrayList;
        PipelineMonitorText pipelineMonitorText;
        Nivel nivel20;
        String str2;
        String str3;
        String str4;
        double d4;
        double d5;
        String str5;
        Nivel nivel21;
        estado.getClass();
        set.getClass();
        Set<String> set2 = set.isEmpty() ? IDS_TODOS : set;
        if (!z) {
            Linha linha = new Linha(null, "MONITOR MAPEADOR", Nivel.INFO);
            Nivel nivel22 = Nivel.RUIM;
            return AbstractC1414sp.m6124n0(linha, new Linha(null, "daemon ............. OFF", nivel22), new Linha(null, "ALERTA ............. daemon", nivel22));
        }
        if (jArr == null || jArr.length < 35) {
            Linha linha2 = new Linha(null, "MONITOR MAPEADOR", Nivel.INFO);
            Nivel nivel23 = Nivel.RUIM;
            return AbstractC1414sp.m6124n0(linha2, new Linha(null, "snapshot ........... inválido", nivel23), new Linha(null, "ALERTA ............. snap", nivel23));
        }
        if (jArr[0] != 5) {
            Linha linha3 = new Linha(null, "MONITOR MAPEADOR", Nivel.INFO);
            String str6 = "schema ............. " + jArr[0] + "≠5";
            Nivel nivel24 = Nivel.ANORMAL;
            return AbstractC1414sp.m6124n0(linha3, new Linha(null, str6, nivel24), new Linha(null, "ALERTA ............. schema", nivel24));
        }
        long[] prev = estado.getPrev();
        if (prev == null || estado.getPrevMonoNs() <= 0) {
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            long prevMonoNs = jArr[1] - estado.getPrevMonoNs();
            d2 = 0.0d;
            d3 = (prevMonoNs < 1 ? 1L : prevMonoNs) / 1.0E9d;
        }
        int i = (int) jArr[2];
        if (i <= 0) {
            str = "nativo";
        } else {
            str = i + "Hz";
        }
        boolean z2 = jArr[24] != 0;
        boolean z3 = jArr[25] != 0;
        boolean z4 = jArr[9] != 0;
        boolean z5 = z2;
        double dAvaliar$rate = avaliar$rate(prev, d3, jArr, 3);
        Set<String> set3 = set2;
        double dAvaliar$rate2 = avaliar$rate(prev, d3, jArr, 4);
        double dAvaliar$rate3 = avaliar$rate(prev, d3, jArr, 29);
        double dAvaliar$rate4 = avaliar$rate(prev, d3, jArr, 11);
        double dAvaliar$rate5 = avaliar$rate(prev, d3, jArr, 30);
        double dAvaliar$rate6 = avaliar$rate(prev, d3, jArr, 32);
        double dAvaliar$rate7 = avaliar$rate(prev, d3, jArr, 31);
        double dAvaliar$avgInjectMs = avaliar$avgInjectMs(jArr);
        double d6 = jArr[13] / 1000000.0d;
        if (prev != null) {
            d6 = prev[13] / 1000000.0d;
        }
        boolean z6 = d6 > d6 + 0.05d;
        double dAvaliar$avgClickMs = avaliar$avgClickMs(jArr);
        double d7 = jArr[23] / 1000000.0d;
        double d8 = jArr[22] / 1000000.0d;
        long j = jArr[15];
        long j2 = jArr[17];
        long j3 = jArr[26];
        long j4 = jArr[27];
        long jAvaliar$delta = avaliar$delta(prev, jArr, 15);
        long jAvaliar$delta2 = avaliar$delta(prev, jArr, 17);
        long jAvaliar$delta3 = avaliar$delta(prev, jArr, 26);
        long jAvaliar$delta4 = avaliar$delta(prev, jArr, 27);
        long jAvaliar$delta5 = avaliar$delta(prev, jArr, 11);
        double dM5138D = (dAvaliar$rate <= 1.0d || dAvaliar$rate2 <= 0.1d) ? d2 : p32.m5138D((1.0d - (dAvaliar$rate2 / dAvaliar$rate)) * 100.0d, 0.0d, 100.0d);
        Nivel nivel25 = z5 ? Nivel.BOM : Nivel.INFO;
        if (!z5 || z3) {
            nivel = z3 ? Nivel.BOM : Nivel.INFO;
        } else {
            nivel = Nivel.MEDIO;
        }
        if (i <= 0) {
            nivel2 = nivel25;
            nivel4 = Nivel.INFO;
            nivel3 = nivel;
        } else {
            nivel2 = nivel25;
            nivel3 = nivel;
            double d9 = i;
            if (dAvaliar$rate < 0.55d * d9) {
                if (dAvaliar$rate < 12.0d) {
                    nivel4 = Nivel.INFO;
                } else if (dAvaliar$rate2 >= 0.85d * dAvaliar$rate) {
                    nivel4 = Nivel.BOM;
                } else {
                    nivel4 = (dAvaliar$rate2 < 0.6d * dAvaliar$rate && dAvaliar$rate >= 25.0d && dAvaliar$rate2 < dAvaliar$rate * 0.45d) ? Nivel.RUIM : Nivel.MEDIO;
                }
            } else if (dAvaliar$rate2 >= 0.92d * d9) {
                nivel4 = Nivel.BOM;
            } else if (dAvaliar$rate2 >= 0.7d * d9) {
                nivel4 = Nivel.MEDIO;
            } else if (dAvaliar$rate2 >= 0.5d * d9) {
                nivel4 = Nivel.RUIM;
            } else {
                nivel4 = dAvaliar$rate2 < d9 * 0.4d ? Nivel.ANORMAL : Nivel.MEDIO;
            }
        }
        if (i <= 0) {
            nivel5 = dM5138D > 15.0d ? Nivel.MEDIO : Nivel.BOM;
        } else {
            nivel5 = (i < 1000 || dM5138D <= 25.0d) ? Nivel.BOM : Nivel.MEDIO;
        }
        if (jAvaliar$delta5 <= 0 || dAvaliar$rate4 < 5.0d) {
            nivel6 = jAvaliar$delta5 > 0 ? Nivel.MEDIO : Nivel.BOM;
        } else {
            nivel6 = Nivel.RUIM;
        }
        Nivel nivel26 = nivel6;
        if (dAvaliar$avgInjectMs >= 4.0d) {
            nivel7 = Nivel.RUIM;
        } else {
            nivel7 = dAvaliar$avgInjectMs >= 2.0d ? Nivel.MEDIO : Nivel.BOM;
        }
        Nivel nivel27 = nivel7;
        if (z6 && d6 >= 8.0d) {
            nivel8 = Nivel.RUIM;
        } else if (!z6 || d6 < 4.0d) {
            nivel8 = (dAvaliar$avgInjectMs < 3.0d || d6 < 8.0d) ? Nivel.INFO : Nivel.MEDIO;
        } else {
            nivel8 = Nivel.MEDIO;
        }
        Nivel nivel28 = nivel8;
        if (dAvaliar$avgClickMs >= 25.0d) {
            nivel9 = Nivel.RUIM;
        } else if (dAvaliar$avgClickMs >= 12.0d) {
            nivel9 = Nivel.MEDIO;
        } else {
            nivel9 = dAvaliar$avgClickMs > d2 ? Nivel.BOM : Nivel.INFO;
        }
        Nivel nivel29 = nivel9;
        if (d7 >= 40.0d) {
            nivel10 = Nivel.RUIM;
        } else if (d7 >= 18.0d) {
            nivel10 = Nivel.MEDIO;
        } else {
            nivel10 = d7 > d2 ? Nivel.BOM : Nivel.INFO;
        }
        Nivel nivel30 = nivel5;
        Nivel nivel31 = nivel10;
        if (d8 >= 50.0d) {
            nivel11 = Nivel.RUIM;
        } else if (d8 >= 25.0d) {
            nivel11 = Nivel.MEDIO;
        } else {
            nivel11 = d8 > d2 ? Nivel.INFO : Nivel.INFO;
        }
        Nivel nivel32 = nivel11;
        String str7 = str;
        Nivel nivel33 = jAvaliar$delta > 0 ? Nivel.RUIM : Nivel.INFO;
        Nivel nivel34 = jAvaliar$delta2 > 0 ? Nivel.RUIM : Nivel.INFO;
        Nivel nivel35 = jAvaliar$delta3 > 0 ? Nivel.RUIM : Nivel.INFO;
        Nivel nivel36 = jAvaliar$delta4 > 0 ? Nivel.RUIM : Nivel.INFO;
        if (dAvaliar$rate7 <= 5.0d || dAvaliar$rate6 <= dAvaliar$rate7 * 0.4d) {
            nivel12 = dAvaliar$rate6 >= 30.0d ? Nivel.MEDIO : Nivel.BOM;
        } else {
            nivel12 = Nivel.ANORMAL;
        }
        Nivel nivel37 = nivel12;
        estado.setFilaSeguidas((!z4 || dAvaliar$rate <= 20.0d) ? 0 : estado.getFilaSeguidas() + 1);
        if (estado.getFilaSeguidas() >= 4) {
            nivel13 = Nivel.ANORMAL;
        } else {
            nivel13 = ((!z4 || i <= 0) && z4) ? Nivel.MEDIO : Nivel.BOM;
        }
        if (estado.getPrevFlushHz() >= 70.0d && dAvaliar$rate2 < estado.getPrevFlushHz() * 0.45d && dAvaliar$rate >= 50.0d) {
            estado.setStutterSeguidas(estado.getStutterSeguidas() + 1);
        } else if (estado.getStutterSeguidas() > 0) {
            estado.setStutterSeguidas(estado.getStutterSeguidas() - 1);
        }
        estado.setPrevFlushHz(dAvaliar$rate2);
        if (estado.getStutterSeguidas() >= 3) {
            nivel14 = Nivel.ANORMAL;
        } else {
            nivel14 = estado.getStutterSeguidas() >= 1 ? Nivel.MEDIO : Nivel.BOM;
        }
        Nivel nivel38 = dAvaliar$rate5 >= 20.0d ? Nivel.MEDIO : Nivel.INFO;
        boolean z7 = jArr.length > 34;
        double dAvaliar$rate8 = (z7 && (prev != null && prev.length > 33)) ? avaliar$rate(prev, d3, jArr, 33) : d2;
        long j5 = z7 ? jArr[34] : 0L;
        double dAvaliar$rate9 = avaliar$rate(prev, d3, jArr, 28);
        if (j5 >= 9) {
            nivel15 = Nivel.RUIM;
        } else {
            nivel15 = j5 >= 7 ? Nivel.MEDIO : Nivel.BOM;
        }
        if (!z5 || 0.1d > dAvaliar$rate9 || dAvaliar$rate9 > 60.0d) {
            nivel16 = (!z5 || 60.0d > dAvaliar$rate9 || dAvaliar$rate9 > 120.0d) ? Nivel.BOM : Nivel.MEDIO;
        } else {
            nivel16 = Nivel.RUIM;
        }
        if (d < d2) {
            nivel17 = Nivel.INFO;
        } else if (d >= 20.0d) {
            nivel17 = Nivel.RUIM;
        } else {
            nivel17 = d >= 8.0d ? Nivel.MEDIO : Nivel.BOM;
        }
        long j6 = j5;
        Nivel nivel39 = nivel17;
        ArrayList arrayList2 = new ArrayList();
        Nivel nivel40 = Nivel.RUIM;
        if (nivel26 == nivel40) {
            arrayList2.add("inject");
        }
        if (nivel33 == nivel40) {
            arrayList2.add("moveFail");
        }
        if (nivel34 == nivel40) {
            arrayList2.add("downFail");
        }
        Nivel nivel41 = nivel35;
        if (nivel35 == nivel40) {
            arrayList2.add("maxActive");
        }
        if (nivel36 == nivel40) {
            arrayList2.add("tapId");
        }
        if (nivel4 == nivel40 || nivel4 == Nivel.ANORMAL) {
            arrayList2.add("outBaixo");
        }
        Nivel nivel42 = Nivel.ANORMAL;
        if (nivel13 == nivel42) {
            arrayList2.add("fila");
        }
        Nivel nivel43 = nivel13;
        if (nivel37 == nivel42) {
            arrayList2.add("zeroOut");
        }
        if (nivel31 == nivel40) {
            arrayList2.add("click");
        }
        if (nivel16 == nivel40) {
            arrayList2.add("aimLoop");
        }
        Nivel nivel44 = nivel16;
        if (nivel15 == nivel40) {
            arrayList2.add("toques");
        }
        if (nivel39 == nivel40) {
            arrayList2.add("binder");
        }
        if (nivel14 == nivel42) {
            arrayList2.add("stutter");
        }
        if (arrayList2.isEmpty()) {
            nivel19 = Nivel.BOM;
            arrayList = arrayList2;
            nivel18 = nivel14;
        } else {
            if (arrayList2.isEmpty()) {
                nivel18 = nivel14;
            } else {
                int size = arrayList2.size();
                nivel18 = nivel14;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        int i3 = i2 + 1;
                        int i4 = size;
                        if (AbstractC1337qm.m5531c0("inject", "moveFail", "downFail", "maxActive", "tapId", "aimLoop").contains((String) obj)) {
                            nivel19 = Nivel.RUIM;
                            arrayList = arrayList2;
                        } else {
                            size = i4;
                            i2 = i3;
                        }
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList = arrayList2;
                nivel19 = Nivel.MEDIO;
            } else {
                int size2 = arrayList2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        int i6 = size2;
                        arrayList = arrayList2;
                        if (AbstractC1337qm.m5531c0("fila", "outBaixo", "zeroOut", "stutter").contains((String) obj2)) {
                            nivel19 = Nivel.ANORMAL;
                        } else {
                            size2 = i6;
                            arrayList2 = arrayList;
                        }
                    } else {
                        arrayList = arrayList2;
                        nivel19 = Nivel.MEDIO;
                    }
                }
            }
        }
        String strM5873t0 = arrayList.isEmpty() ? AdbPairingService.EXTRA_OK : AbstractC1377rp.m5873t0(arrayList, "+", null, null, null, 62);
        if (strM5873t0.equals(AdbPairingService.EXTRA_OK) || strM5873t0.equals(estado.getUltimoAlertaLog())) {
            pipelineMonitorText = this;
            nivel20 = nivel15;
            str2 = "stutter";
            str3 = "fila";
            str4 = "moveFail";
            d4 = dAvaliar$rate;
            d5 = dAvaliar$rate2;
            str5 = "binder";
            nivel21 = nivel31;
            if (strM5873t0.equals(AdbPairingService.EXTRA_OK)) {
                estado.setUltimoAlertaLog("");
            }
        } else {
            estado.setUltimoAlertaLog(strM5873t0);
            pipelineMonitorText = this;
            nivel20 = nivel15;
            str3 = "fila";
            d4 = dAvaliar$rate;
            pipelineMonitorText.fmt(d4);
            str2 = "stutter";
            str4 = "moveFail";
            d5 = dAvaliar$rate2;
            pipelineMonitorText.fmt(d5);
            str5 = "binder";
            nivel21 = nivel31;
            pipelineMonitorText.fmt(dAvaliar$rate9);
            pipelineMonitorText.fmt(dAvaliar$avgInjectMs);
            pipelineMonitorText.fmt(d);
            estado.getStutterSeguidas();
        }
        Nivel nivel45 = nivel19;
        estado.setPrev(Arrays.copyOf(jArr, jArr.length));
        String str8 = strM5873t0;
        estado.setPrevMonoNs(jArr[1]);
        Nivel nivel46 = Nivel.INFO;
        Linha linha4 = new Linha(null, "MONITOR MAPEADOR", nivel46);
        Linha linha5 = new Linha("poll", pipelineMonitorText.campo("poll", str7), nivel46);
        Linha linha6 = new Linha("aim", pipelineMonitorText.campo("aim", z5 ? "ON" : DebugKt.DEBUG_PROPERTY_VALUE_OFF), nivel2);
        Linha linha7 = new Linha("dedo", pipelineMonitorText.campo("dedo", z3 ? "ON" : DebugKt.DEBUG_PROPERTY_VALUE_OFF), nivel3);
        Linha linha8 = new Linha("syn", pipelineMonitorText.campo("syn (hw)", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$rate3), " Hz")), nivel46);
        Linha linha9 = new Linha("mouseIn", pipelineMonitorText.campo("mouse in", jd0.m3614l(pipelineMonitorText.fmt(d4), " Hz")), nivel46);
        Linha linha10 = new Linha("mouseOut", pipelineMonitorText.campo("mouse out", jd0.m3614l(pipelineMonitorText.fmt(d5), " Hz")), nivel4);
        Linha linha11 = new Linha("coalesce", pipelineMonitorText.campo("coalesce", jd0.m3614l(pipelineMonitorText.fmt(dM5138D), " %")), nivel30);
        Linha linha12 = new Linha("injectFail", pipelineMonitorText.campo("inject fail", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$rate4), " /s")), nivel26);
        Linha linha13 = new Linha("injectAvg", pipelineMonitorText.campo("inject avg", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$avgInjectMs), " ms")), nivel27);
        String strFmt = pipelineMonitorText.fmt(d6);
        String str9 = str4;
        return avaliar$filtrar(AbstractC1414sp.m6124n0(linha4, linha5, linha6, linha7, linha8, linha9, linha10, linha11, linha12, linha13, new Linha("injectMax", pipelineMonitorText.campo("inject max", z6 ? jd0.m3614l(strFmt, " ms ★") : jd0.m3614l(strFmt, " ms")), nivel28), new Linha("clickAvg", pipelineMonitorText.campo("click avg", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$avgClickMs), " ms")), nivel29), new Linha("clickLast", pipelineMonitorText.campo("click last", jd0.m3614l(pipelineMonitorText.fmt(d7), " ms")), nivel21), new Linha("clickMax", pipelineMonitorText.campo("click max", jd0.m3614l(pipelineMonitorText.fmt(d8), " ms")), nivel32), new Linha(str9, pipelineMonitorText.campo(str9, pipelineMonitorText.fmtTotDelta(j, jAvaliar$delta)), nivel33), new Linha("downFail", pipelineMonitorText.campo("downFail", pipelineMonitorText.fmtTotDelta(j2, jAvaliar$delta2)), nivel34), new Linha("zeroOut", pipelineMonitorText.campo("zeroOut", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$rate6), " /s")), nivel37), new Linha(str3, pipelineMonitorText.campo("fila coalesce", z4 ? "SIM" : "nao"), nivel43), new Linha("forceFlush", pipelineMonitorText.campo("forceFlush", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$rate5), " /s")), nivel38), new Linha("rejMax", pipelineMonitorText.campo("rej maxActive", pipelineMonitorText.fmtTotDelta(j3, jAvaliar$delta3)), nivel41), new Linha("tapEx", pipelineMonitorText.campo("tapId exhaust", pipelineMonitorText.fmtTotDelta(j4, jAvaliar$delta4)), nivel36), new Linha("teclado", pipelineMonitorText.campo("teclado", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$rate8), " ev/s")), nivel46), new Linha("toques", pipelineMonitorText.campo("toques ativos", String.valueOf(j6)), nivel20), new Linha("aimLoop", pipelineMonitorText.campo("aimLoop", jd0.m3614l(pipelineMonitorText.fmt(dAvaliar$rate9), " Hz")), nivel44), new Linha(str5, pipelineMonitorText.campo("binder RTT", d < d2 ? "—" : jd0.m3614l(pipelineMonitorText.fmt(d), " ms")), nivel39), new Linha(str2, pipelineMonitorText.campo("stutter out", String.valueOf(estado.getStutterSeguidas())), nivel18), new Linha(null, pipelineMonitorText.campo("ALERTA", str8), nivel45)), set3);
    }

    public final String formatar(long[] jArr, Estado estado, boolean z) {
        estado.getClass();
        return AbstractC1377rp.m5873t0(avaliar$default(this, jArr, estado, z, null, 0.0d, 24, null), "\n", null, null, new C1284p6(10), 30);
    }

    public final CharSequence formatarSpannable(long[] jArr, Estado estado, boolean z, Set<String> set, double d) {
        estado.getClass();
        set.getClass();
        List<Linha> listAvaliar = avaliar(jArr, estado, z, set, d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        for (Object obj : listAvaliar) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            Linha linha = (Linha) obj;
            if (i > 0) {
                spannableStringBuilder.append('\n');
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) linha.getTexto());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(INSTANCE.corDe(linha.getNivel())), length, spannableStringBuilder.length(), 33);
            i = i2;
        }
        return spannableStringBuilder;
    }

    public final List<Campo> getCAMPOS() {
        return CAMPOS;
    }

    public final Set<String> getIDS_ESSENCIAIS() {
        return IDS_ESSENCIAIS;
    }

    public final Set<String> getIDS_TODOS() {
        return IDS_TODOS;
    }

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class Estado {
        private int filaSeguidas;
        private long[] prev;
        private double prevFlushHz;
        private long prevMonoNs;
        private int stutterSeguidas;
        private String ultimoAlertaLog;

        public /* synthetic */ Estado(long[] jArr, long j, int i, double d, int i2, String str, int i3, AbstractC1571wy abstractC1571wy) {
            this((i3 & 1) != 0 ? null : jArr, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0.0d : d, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? "" : str);
        }

        public static /* synthetic */ Estado copy$default(Estado estado, long[] jArr, long j, int i, double d, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                jArr = estado.prev;
            }
            if ((i3 & 2) != 0) {
                j = estado.prevMonoNs;
            }
            if ((i3 & 4) != 0) {
                i = estado.filaSeguidas;
            }
            if ((i3 & 8) != 0) {
                d = estado.prevFlushHz;
            }
            if ((i3 & 16) != 0) {
                i2 = estado.stutterSeguidas;
            }
            if ((i3 & 32) != 0) {
                str = estado.ultimoAlertaLog;
            }
            int i4 = i;
            return estado.copy(jArr, j, i4, d, i2, str);
        }

        public final long[] component1() {
            return this.prev;
        }

        public final long component2() {
            return this.prevMonoNs;
        }

        public final int component3() {
            return this.filaSeguidas;
        }

        public final double component4() {
            return this.prevFlushHz;
        }

        public final int component5() {
            return this.stutterSeguidas;
        }

        public final String component6() {
            return this.ultimoAlertaLog;
        }

        public final Estado copy(long[] jArr, long j, int i, double d, int i2, String str) {
            str.getClass();
            return new Estado(jArr, j, i, d, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Estado)) {
                return false;
            }
            Estado estado = (Estado) obj;
            return hp0.m3214e(this.prev, estado.prev) && this.prevMonoNs == estado.prevMonoNs && this.filaSeguidas == estado.filaSeguidas && Double.compare(this.prevFlushHz, estado.prevFlushHz) == 0 && this.stutterSeguidas == estado.stutterSeguidas && hp0.m3214e(this.ultimoAlertaLog, estado.ultimoAlertaLog);
        }

        public final int getFilaSeguidas() {
            return this.filaSeguidas;
        }

        public final long[] getPrev() {
            return this.prev;
        }

        public final double getPrevFlushHz() {
            return this.prevFlushHz;
        }

        public final long getPrevMonoNs() {
            return this.prevMonoNs;
        }

        public final int getStutterSeguidas() {
            return this.stutterSeguidas;
        }

        public final String getUltimoAlertaLog() {
            return this.ultimoAlertaLog;
        }

        public int hashCode() {
            long[] jArr = this.prev;
            return this.ultimoAlertaLog.hashCode() + ((Integer.hashCode(this.stutterSeguidas) + ((Double.hashCode(this.prevFlushHz) + ((Integer.hashCode(this.filaSeguidas) + ((Long.hashCode(this.prevMonoNs) + ((jArr == null ? 0 : Arrays.hashCode(jArr)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final void setFilaSeguidas(int i) {
            this.filaSeguidas = i;
        }

        public final void setPrev(long[] jArr) {
            this.prev = jArr;
        }

        public final void setPrevFlushHz(double d) {
            this.prevFlushHz = d;
        }

        public final void setPrevMonoNs(long j) {
            this.prevMonoNs = j;
        }

        public final void setStutterSeguidas(int i) {
            this.stutterSeguidas = i;
        }

        public final void setUltimoAlertaLog(String str) {
            str.getClass();
            this.ultimoAlertaLog = str;
        }

        public String toString() {
            return "Estado(prev=" + Arrays.toString(this.prev) + ", prevMonoNs=" + this.prevMonoNs + ", filaSeguidas=" + this.filaSeguidas + ", prevFlushHz=" + this.prevFlushHz + ", stutterSeguidas=" + this.stutterSeguidas + ", ultimoAlertaLog=" + this.ultimoAlertaLog + ")";
        }

        public Estado(long[] jArr, long j, int i, double d, int i2, String str) {
            str.getClass();
            this.prev = jArr;
            this.prevMonoNs = j;
            this.filaSeguidas = i;
            this.prevFlushHz = d;
            this.stutterSeguidas = i2;
            this.ultimoAlertaLog = str;
        }

        public Estado() {
            this(null, 0L, 0, 0.0d, 0, null, 63, null);
        }
    }
}
