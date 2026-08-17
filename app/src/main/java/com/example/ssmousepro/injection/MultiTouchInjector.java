package com.example.ssmousepro.injection;

import java.util.Arrays;
import p000.bc1;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiTouchInjector {
    public static final MultiTouchInjector INSTANCE = new MultiTouchInjector();
    private static final boolean PREFERIR_UINPUT = false;
    private static final String TAG = "MultiTouchInjector";
    private static volatile boolean usandoUinput;

    private MultiTouchInjector() {
    }

    public static /* synthetic */ bc1 jitterDown$default(MultiTouchInjector multiTouchInjector, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        return multiTouchInjector.jitterDown(f, f2, i);
    }

    public final void desativarUinput() {
        if (usandoUinput || NativeTouchInjector.INSTANCE.disponivel()) {
            NativeTouchInjector.INSTANCE.fechar();
        }
        usandoUinput = false;
    }

    public final boolean disponivel() {
        return usandoUinput ? NativeTouchInjector.INSTANCE.disponivel() : PrivilegedTouchInjector.INSTANCE.disponivel();
    }

    public final boolean down(int i, float f, float f2) {
        return usandoUinput ? NativeTouchInjector.INSTANCE.down(i, f, f2) : PrivilegedTouchInjector.INSTANCE.down(i, f, f2);
    }

    public final boolean estaAtivo(int i) {
        return usandoUinput ? NativeTouchInjector.INSTANCE.estaAtivo(i) : PrivilegedTouchInjector.INSTANCE.estaAtivo(i);
    }

    public final bc1 jitterDown(float f, float f2, int i) {
        return usandoUinput ? NativeTouchInjector.INSTANCE.jitterDown(f, f2, i) : PrivilegedTouchInjector.INSTANCE.jitterDown(f, f2, i);
    }

    public final void liberarExceto(int... iArr) {
        iArr.getClass();
        if (usandoUinput) {
            NativeTouchInjector.INSTANCE.liberarExceto(Arrays.copyOf(iArr, iArr.length));
        } else {
            PrivilegedTouchInjector.INSTANCE.liberarExceto(Arrays.copyOf(iArr, iArr.length));
        }
    }

    public final void liberarTudo() {
        if (usandoUinput) {
            NativeTouchInjector.INSTANCE.liberarTudo();
        } else {
            PrivilegedTouchInjector.INSTANCE.liberarTudo();
        }
    }

    public final void mover(int i, float f, float f2) {
        if (usandoUinput) {
            NativeTouchInjector.INSTANCE.mover(i, f, f2);
        } else {
            PrivilegedTouchInjector.INSTANCE.mover(i, f, f2);
        }
    }

    public final boolean probeInject(int i, int i2) {
        return usandoUinput ? NativeTouchInjector.INSTANCE.probeInject(i, i2) : PrivilegedTouchInjector.INSTANCE.probeInject(i, i2);
    }

    public final boolean sincronizarTamanhoTela(int i, int i2, String str) {
        str.getClass();
        if (i > 0 && i2 > 0) {
            desativarUinput();
        }
        return false;
    }

    public final boolean tentarAtivarUinput(int i, int i2) {
        return sincronizarTamanhoTela(i, i2, "tentarAtivar");
    }

    /* JADX INFO: renamed from: up */
    public final void m1584up(int i) {
        if (usandoUinput) {
            NativeTouchInjector.INSTANCE.m1585up(i);
        } else {
            PrivilegedTouchInjector.INSTANCE.m1592up(i);
        }
    }

    public final boolean usandoUinput() {
        return usandoUinput;
    }
}
