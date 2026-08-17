package com.example.ssmousepro.injection;

import p000.AbstractC1308pu;
import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsLowSpeedGainConfig {
    public static final boolean PADRAO_ATIVO_X = true;
    public static final boolean PADRAO_ATIVO_Y = false;
    public static final int PADRAO_FATOR_X_PERMIL = 600;
    public static final int PADRAO_FATOR_Y_PERMIL = 600;
    public static final int PADRAO_LIM_X = 30;
    public static final int PADRAO_LIM_Y = 0;
    private static volatile boolean ativoY;
    private static volatile int holdCodeX;
    private static volatile int holdCodeY;
    private static volatile boolean holdPressedX;
    private static volatile boolean holdPressedY;
    private static volatile int thresholdY;
    public static final FpsLowSpeedGainConfig INSTANCE = new FpsLowSpeedGainConfig();
    private static volatile boolean ativoX = true;
    private static volatile int thresholdX = 30;
    private static volatile int precisionXPermil = 600;
    private static volatile int precisionYPermil = 600;

    private FpsLowSpeedGainConfig() {
    }

    public final void aplicarPadraoProduto() {
        ativoX = true;
        thresholdX = 30;
        precisionXPermil = 600;
        holdCodeX = 0;
        holdPressedX = false;
        ativoY = false;
        thresholdY = 0;
        precisionYPermil = 600;
        holdCodeY = 0;
        holdPressedY = false;
    }

    public final String comandoSincronizar() {
        boolean z = ativoX;
        int iM5140F = p32.m5140F(thresholdX, 0, 50);
        int iM5140F2 = p32.m5140F(precisionXPermil, 100, 1000);
        int i = holdCodeX;
        if (i < 0) {
            i = 0;
        }
        boolean z2 = ativoY;
        int iM5140F3 = p32.m5140F(thresholdY, 0, 50);
        int iM5140F4 = p32.m5140F(precisionYPermil, 100, 1000);
        int i2 = holdCodeY;
        int i3 = i2 >= 0 ? i2 : 0;
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("FPS_LOW_SPEED ", z ? 1 : 0, " ", iM5140F, " ");
        AbstractC1308pu.m5356w(sbM5345l, iM5140F2, " ", i, " ");
        AbstractC1308pu.m5356w(sbM5345l, z2 ? 1 : 0, " ", iM5140F3, " ");
        sbM5345l.append(iM5140F4);
        sbM5345l.append(" ");
        sbM5345l.append(i3);
        return sbM5345l.toString();
    }

    public final boolean deveAplicar() {
        return eixoXAtivo() || eixoYAtivo();
    }

    public final boolean eixoXAtivo() {
        if (thresholdX <= 0 || precisionXPermil >= 1000) {
            return false;
        }
        if (ativoX) {
            return true;
        }
        return holdCodeX != 0 && holdPressedX;
    }

    public final boolean eixoYAtivo() {
        if (thresholdY <= 0 || precisionYPermil >= 1000) {
            return false;
        }
        if (ativoY) {
            return true;
        }
        return holdCodeY != 0 && holdPressedY;
    }

    public final boolean getAtivoX() {
        return ativoX;
    }

    public final boolean getAtivoY() {
        return ativoY;
    }

    public final int getHoldCodeX() {
        return holdCodeX;
    }

    public final int getHoldCodeY() {
        return holdCodeY;
    }

    public final boolean getHoldPressedX() {
        return holdPressedX;
    }

    public final boolean getHoldPressedY() {
        return holdPressedY;
    }

    public final int getPrecisionXPermil() {
        return precisionXPermil;
    }

    public final int getPrecisionYPermil() {
        return precisionYPermil;
    }

    public final int getThresholdX() {
        return thresholdX;
    }

    public final int getThresholdY() {
        return thresholdY;
    }

    public final void setAtivoX(boolean z) {
        ativoX = z;
    }

    public final void setAtivoY(boolean z) {
        ativoY = z;
    }

    public final void setHoldCodeX(int i) {
        holdCodeX = i;
    }

    public final void setHoldCodeY(int i) {
        holdCodeY = i;
    }

    public final void setHoldPressedX(boolean z) {
        holdPressedX = z;
    }

    public final void setHoldPressedY(boolean z) {
        holdPressedY = z;
    }

    public final void setPrecisionXPermil(int i) {
        precisionXPermil = i;
    }

    public final void setPrecisionYPermil(int i) {
        precisionYPermil = i;
    }

    public final void setThresholdX(int i) {
        thresholdX = i;
    }

    public final void setThresholdY(int i) {
        thresholdY = i;
    }
}
