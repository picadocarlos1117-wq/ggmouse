package com.example.ssmousepro.account;

import android.content.Context;
import p000.InterfaceC0579du;
import p000.mg0;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class PlayTimeSessionManager {
    public static final PlayTimeSessionManager INSTANCE = new PlayTimeSessionManager();
    private static Context appContext;
    private static volatile mg0 onTempoEsgotado;

    private PlayTimeSessionManager() {
    }

    public final Object encerrarAguardando(InterfaceC0579du interfaceC0579du) {
        onTempoEsgotado = null;
        return z32.f13265a;
    }

    public final mg0 getOnTempoEsgotado() {
        return onTempoEsgotado;
    }

    public final void init(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        appContext = applicationContext;
        applicationContext.getSharedPreferences("SSPlayTimeSync", 0).edit().remove("pending_debit_ms").apply();
    }

    public final void setOnTempoEsgotado(mg0 mg0Var) {
        onTempoEsgotado = mg0Var;
    }

    public final Object sincronizarPendenteSeHouver(InterfaceC0579du interfaceC0579du) {
        return z32.f13265a;
    }

    public final void tick(long j) {
        mg0 mg0Var;
        if (AccountRepository.INSTANCE.hasPlayableBalance() || (mg0Var = onTempoEsgotado) == null) {
            return;
        }
        mg0Var.invoke();
    }

    public final void pausarESincronizar() {
    }
}
