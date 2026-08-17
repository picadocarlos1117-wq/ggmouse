package com.example.ssmousepro.account;

import p000.mg0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class BalanceChangeNotifier {
    public static final BalanceChangeNotifier INSTANCE = new BalanceChangeNotifier();
    private static volatile mg0 listener;

    private BalanceChangeNotifier() {
    }

    public final mg0 getListener() {
        return listener;
    }

    public final void notifyChange() {
        mg0 mg0Var = listener;
        if (mg0Var != null) {
            mg0Var.invoke();
        }
    }

    public final void setListener(mg0 mg0Var) {
        listener = mg0Var;
    }
}
