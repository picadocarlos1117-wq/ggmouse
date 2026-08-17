package com.example.ssmousepro.activation;

import android.content.Context;
import p000.C0694gy;
import p000.tl1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ActivationModePrefs {
    public static final ActivationModePrefs INSTANCE = new ActivationModePrefs();
    private static final String KEY_MODO = "modo_ativacao";
    private static final String PREFS = "sspro_activation";

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

    private ActivationModePrefs() {
    }

    public final void definir(Context context, ModoAtivacao modoAtivacao) {
        context.getClass();
        modoAtivacao.getClass();
        context.getApplicationContext().getSharedPreferences(PREFS, 0).edit().putString(KEY_MODO, modoAtivacao.name()).apply();
    }

    public final ModoAtivacao modo(Context context) {
        Object tl1Var;
        context.getClass();
        String string = context.getApplicationContext().getSharedPreferences(PREFS, 0).getString(KEY_MODO, "SHIZUKU");
        try {
            tl1Var = ModoAtivacao.valueOf(string != null ? string : "SHIZUKU");
        } catch (Throwable th) {
            tl1Var = new tl1(th);
        }
        Object obj = ModoAtivacao.SHIZUKU;
        if (tl1Var instanceof tl1) {
            tl1Var = obj;
        }
        return (ModoAtivacao) tl1Var;
    }

    public final String rotulo(ModoAtivacao modoAtivacao) {
        modoAtivacao.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[modoAtivacao.ordinal()];
        if (i == 1) {
            return "Shizuku (recomendado)";
        }
        if (i == 2) {
            return "Depuração Wi‑Fi";
        }
        C0694gy.m3076b();
        return null;
    }
}
