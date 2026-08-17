package com.example.ssmousepro.ads;

import p000.AbstractC1377rp;
import p000.jd0;
import p000.ri1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardLottery {
    public static final RewardLottery INSTANCE = new RewardLottery();

    private RewardLottery() {
    }

    public static /* synthetic */ RewardedAdConstants.PrizeTier sortear$default(RewardLottery rewardLottery, ri1 ri1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ri1Var = ri1.f10056a;
        }
        return rewardLottery.sortear(ri1Var);
    }

    public final String formatarCreditoToast(String str, boolean z) {
        str.getClass();
        return z ? jd0.m3615m("Você ganhou ", str, " + bônus de 1 dia (barra completa)!") : jd0.m3615m("Você ganhou ", str, "!");
    }

    public final RewardedAdConstants.PrizeTier sortear(ri1 ri1Var) {
        ri1Var.getClass();
        double dMo5496c = ri1Var.mo5496c();
        double weightPercent = 0.0d;
        for (RewardedAdConstants.PrizeTier prizeTier : RewardedAdConstants.INSTANCE.getPRIZE_TIERS()) {
            weightPercent += (double) prizeTier.getWeightPercent();
            if (dMo5496c < weightPercent) {
                return prizeTier;
            }
        }
        return (RewardedAdConstants.PrizeTier) AbstractC1377rp.m5870q0(RewardedAdConstants.INSTANCE.getPRIZE_TIERS());
    }
}
