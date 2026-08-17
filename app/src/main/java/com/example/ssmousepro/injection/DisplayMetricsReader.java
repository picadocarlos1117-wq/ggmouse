package com.example.ssmousepro.injection;

import android.util.Log;
import com.example.ssmousepro.HudPresetFreefire;
import io.github.muntashirakon.adb.PairingConnectionCtx;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC0609en;
import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class DisplayMetricsReader {
    private static final String TAG = "DisplayMetricsReader";
    public static final DisplayMetricsReader INSTANCE = new DisplayMetricsReader();
    private static final Pattern patternFisico = Pattern.compile("Physical size:\\s*(\\d+)x(\\d+)");
    private static final Pattern patternOverride = Pattern.compile("Override size:\\s*(\\d+)x(\\d+)");

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class TamanhoTela {
        private final int altura;
        private final int largura;

        public TamanhoTela(int i, int i2) {
            this.largura = i;
            this.altura = i2;
        }

        public static /* synthetic */ TamanhoTela copy$default(TamanhoTela tamanhoTela, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = tamanhoTela.largura;
            }
            if ((i3 & 2) != 0) {
                i2 = tamanhoTela.altura;
            }
            return tamanhoTela.copy(i, i2);
        }

        public final int component1() {
            return this.largura;
        }

        public final int component2() {
            return this.altura;
        }

        public final TamanhoTela copy(int i, int i2) {
            return new TamanhoTela(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TamanhoTela)) {
                return false;
            }
            TamanhoTela tamanhoTela = (TamanhoTela) obj;
            return this.largura == tamanhoTela.largura && this.altura == tamanhoTela.altura;
        }

        public final int getAltura() {
            return this.altura;
        }

        public final int getLargura() {
            return this.largura;
        }

        public int hashCode() {
            return Integer.hashCode(this.altura) + (Integer.hashCode(this.largura) * 31);
        }

        public String toString() {
            return "TamanhoTela(largura=" + this.largura + ", altura=" + this.altura + ")";
        }
    }

    private DisplayMetricsReader() {
    }

    private final TamanhoTela parseSaida(String str) {
        Matcher matcher = patternOverride.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new TamanhoTela(i, Integer.parseInt(strGroup2));
        }
        Matcher matcher2 = patternFisico.matcher(str);
        if (!matcher2.find()) {
            return null;
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        int i2 = Integer.parseInt(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        return new TamanhoTela(i2, Integer.parseInt(strGroup4));
    }

    public final TamanhoTela lerTamanhoTela() {
        try {
            Process processStart = new ProcessBuilder("wm", "size").redirectErrorStream(true).start();
            InputStream inputStream = processStart.getInputStream();
            inputStream.getClass();
            String strM5163c0 = p32.m5163c0(new BufferedReader(new InputStreamReader(inputStream, AbstractC0609en.f3387a), PairingConnectionCtx.PeerInfo.MAX_PEER_INFO_SIZE));
            processStart.waitFor();
            TamanhoTela saida = parseSaida(strM5163c0);
            return saida == null ? new TamanhoTela(HudPresetFreefire.REF_H, 2400) : saida;
        } catch (Exception e) {
            Log.w(TAG, "Falha ao ler wm size, usando fallback 1080x2400", e);
            return new TamanhoTela(HudPresetFreefire.REF_H, 2400);
        }
    }
}
