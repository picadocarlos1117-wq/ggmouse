package com.example.ssmousepro.ads;

import p000.AbstractActivityC1469u6;
import p000.AbstractC1095m4;
import p000.C0738i4;
import p000.C1058l4;
import p000.f40;
import p000.l41;
import p000.og0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class RewardedVideoCoordinator {
    public static final RewardedVideoCoordinator INSTANCE = new RewardedVideoCoordinator();
    private static AbstractC1095m4 launcher;
    private static og0 onComplete;

    private RewardedVideoCoordinator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(C0738i4 c0738i4) {
        boolean z = c0738i4.f4811a == -1;
        og0 og0Var = onComplete;
        if (og0Var != null) {
            og0Var.invoke(Boolean.valueOf(z));
        }
        onComplete = null;
    }

    public final void play(AbstractActivityC1469u6 abstractActivityC1469u6, String str, og0 og0Var) {
        abstractActivityC1469u6.getClass();
        str.getClass();
        og0Var.getClass();
        AbstractC1095m4 abstractC1095m4 = launcher;
        if (abstractC1095m4 == null) {
            f40.m2719o("RewardedVideoCoordinator.register() deve ser chamado no onCreate da Activity.");
        } else {
            onComplete = og0Var;
            abstractC1095m4.mo4381a(RewardedVideoActivity.Companion.intent(abstractActivityC1469u6, str));
        }
    }

    public final void register(AbstractActivityC1469u6 abstractActivityC1469u6) {
        abstractActivityC1469u6.getClass();
        if (launcher != null) {
            return;
        }
        launcher = abstractActivityC1469u6.registerForActivityResult(new C1058l4(2), new l41(23));
    }
}
