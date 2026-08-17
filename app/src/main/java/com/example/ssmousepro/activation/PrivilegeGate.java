package com.example.ssmousepro.activation;

import android.content.Context;
import com.example.ssmousepro.ShizukuManager;
import p000.C0694gy;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PrivilegeGate {
    public static final PrivilegeGate INSTANCE = new PrivilegeGate();

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModoAtivacao.values().length];
            try {
                iArr[ModoAtivacao.SHIZUKU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModoAtivacao.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PrivilegeGate() {
    }

    public final boolean estaProntoParaInjecao(Context context) {
        context.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[ActivationModePrefs.INSTANCE.modo(context).ordinal()];
        if (i == 1) {
            return ShizukuManager.INSTANCE.estaProntoParaInjecao();
        }
        if (i == 2) {
            return WifiAdbManager.INSTANCE.estaProntoParaInjecao();
        }
        C0694gy.m3076b();
        return false;
    }

    public final String mensagemBloqueioMapeador(Context context) {
        context.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[ActivationModePrefs.INSTANCE.modo(context).ordinal()];
        if (i == 1) {
            return ShizukuManager.INSTANCE.mensagemBloqueioMapeador(context);
        }
        if (i == 2) {
            return WifiAdbManager.INSTANCE.mensagemBloqueio(context);
        }
        C0694gy.m3076b();
        return null;
    }
}
