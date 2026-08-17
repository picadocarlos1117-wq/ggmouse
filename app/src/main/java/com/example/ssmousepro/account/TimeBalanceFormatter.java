package com.example.ssmousepro.account;

import com.example.ssmousepro.ads.RewardedAdConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p000.AbstractC1308pu;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeBalanceFormatter {
    public static final TimeBalanceFormatter INSTANCE = new TimeBalanceFormatter();
    private static final SimpleDateFormat formatoVencimento;
    private static final SimpleDateFormat formatoVencimentoCurto;
    private static final Locale localeBr;

    static {
        Locale localeForLanguageTag = Locale.forLanguageTag("pt-BR");
        localeBr = localeForLanguageTag;
        formatoVencimento = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm", localeForLanguageTag);
        formatoVencimentoCurto = new SimpleDateFormat("dd/MM/yyyy", localeForLanguageTag);
    }

    private TimeBalanceFormatter() {
    }

    public static /* synthetic */ boolean estaAtivo$default(TimeBalanceFormatter timeBalanceFormatter, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        return timeBalanceFormatter.estaAtivo(j, j2);
    }

    public static /* synthetic */ String formatRestante$default(TimeBalanceFormatter timeBalanceFormatter, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        return timeBalanceFormatter.formatRestante(j, j2);
    }

    public static /* synthetic */ String formatVencimento$default(TimeBalanceFormatter timeBalanceFormatter, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = System.currentTimeMillis();
        }
        return timeBalanceFormatter.formatVencimento(j, j2);
    }

    public final boolean estaAtivo(long j, long j2) {
        return j > j2;
    }

    public final String formatCredito(long j) {
        return AbstractC1308pu.m5339f("Acesso válido até ", formatoVencimentoCurto.format(new Date(j)));
    }

    public final String formatRestante(long j, long j2) {
        if (!estaAtivo(j, j2)) {
            return "Sem tempo — toque + para recarregar";
        }
        long j3 = j - j2;
        long j4 = j3 / RewardedAdConstants.PITY_BONUS_MS;
        long j5 = (j3 / 3600000) % 24;
        if (j4 >= 2) {
            return j4 + " dias restantes";
        }
        if (j4 == 1) {
            return "1 dia e " + j5 + "h restantes";
        }
        if (j5 >= 1) {
            return j5 + "h restantes";
        }
        return Math.max(1L, j3 / 60000) + " min restantes";
    }

    public final String formatVencimento(long j, long j2) {
        return !estaAtivo(j, j2) ? "Expirado" : AbstractC1308pu.m5339f("Válido até ", formatoVencimento.format(new Date(j)));
    }
}
