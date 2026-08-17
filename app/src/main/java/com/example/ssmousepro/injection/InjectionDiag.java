package com.example.ssmousepro.injection;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class InjectionDiag {
    public static final boolean ATIVO = false;
    public static final InjectionDiag INSTANCE = new InjectionDiag();
    public static final String TAG = "SSmouseDIAG";

    private InjectionDiag() {
    }

    public static /* synthetic */ void teclaMapeada$default(InjectionDiag injectionDiag, int i, boolean z, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = -1;
        }
        injectionDiag.teclaMapeada(i, z, j);
    }

    public final void analogRecalc(Set<Integer> set, String str) {
        set.getClass();
        str.getClass();
    }

    public final void teclaFantasma(int i, String str) {
        str.getClass();
    }

    public final void touchInject(int i, String str, float f, float f2) {
        str.getClass();
    }

    public final void warper(String str, int i, int i2, String str2, boolean z) {
        str.getClass();
        str2.getClass();
    }

    public final void mouseBtn(int i, boolean z, boolean z2) {
    }

    public final void mouseRaw(int i, int i2, boolean z) {
    }

    public final void teclaMapeada(int i, boolean z, long j) {
    }
}
