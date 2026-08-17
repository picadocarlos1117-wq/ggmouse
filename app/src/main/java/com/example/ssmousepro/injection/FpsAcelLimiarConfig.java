package com.example.ssmousepro.injection;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import p000.AbstractC1308pu;
import p000.p32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class FpsAcelLimiarConfig {
    private static volatile boolean ativo;
    private static volatile int holdCode;
    private static volatile boolean holdPressed;
    public static final FpsAcelLimiarConfig INSTANCE = new FpsAcelLimiarConfig();
    private static volatile int thresholdX = 8;
    private static volatile int gainXPermil = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    private static volatile int thresholdY = 8;
    private static volatile int gainYPermil = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    private FpsAcelLimiarConfig() {
    }

    public final String comandoSincronizar() {
        boolean z = ativo;
        int iM5140F = p32.m5140F(thresholdX, 0, 50);
        int iM5140F2 = p32.m5140F(gainXPermil, 1000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        int iM5140F3 = p32.m5140F(thresholdY, 0, 50);
        int iM5140F4 = p32.m5140F(gainYPermil, 1000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        int i = holdCode;
        int i2 = i >= 0 ? i : 0;
        StringBuilder sbM5345l = AbstractC1308pu.m5345l("FPS_ACEL_LIMIAR ", z ? 1 : 0, " ", iM5140F, " ");
        AbstractC1308pu.m5356w(sbM5345l, iM5140F2, " ", iM5140F3, " ");
        sbM5345l.append(iM5140F4);
        sbM5345l.append(" ");
        sbM5345l.append(i2);
        return sbM5345l.toString();
    }

    public final void desligarProduto() {
        ativo = false;
        holdCode = 0;
        holdPressed = false;
        thresholdX = 8;
        gainXPermil = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        thresholdY = 8;
        gainYPermil = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    }

    public final boolean deveAplicar() {
        boolean z = thresholdX > 0 && gainXPermil > 1000;
        boolean z2 = thresholdY > 0 && gainYPermil > 1000;
        if (z || z2) {
            return ativo || (holdCode != 0 && holdPressed);
        }
        return false;
    }

    public final boolean getAtivo() {
        return ativo;
    }

    public final int getGainXPermil() {
        return gainXPermil;
    }

    public final int getGainYPermil() {
        return gainYPermil;
    }

    public final int getHoldCode() {
        return holdCode;
    }

    public final boolean getHoldPressed() {
        return holdPressed;
    }

    public final int getThresholdX() {
        return thresholdX;
    }

    public final int getThresholdY() {
        return thresholdY;
    }

    public final void setAtivo(boolean z) {
        ativo = z;
    }

    public final void setGainXPermil(int i) {
        gainXPermil = i;
    }

    public final void setGainYPermil(int i) {
        gainYPermil = i;
    }

    public final void setHoldCode(int i) {
        holdCode = i;
    }

    public final void setHoldPressed(boolean z) {
        holdPressed = z;
    }

    public final void setThresholdX(int i) {
        thresholdX = i;
    }

    public final void setThresholdY(int i) {
        thresholdY = i;
    }
}
