package com.example.ssmousepro.injection;

import p000.ch0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class MouseDeltaCoalescer {
    private static final String TAG = "MouseDeltaCoalescer";
    private static volatile ch0 onFlush;
    private static int pendingDx;
    private static int pendingDy;
    public static final MouseDeltaCoalescer INSTANCE = new MouseDeltaCoalescer();

    /* JADX INFO: renamed from: hz */
    private static volatile int f1914hz = InjectionProtocol.MOUSE_POLL_HZ_PADRAO;
    private static final Object lock = new Object();
    private static long ultimoSlotFlush = -1;

    private MouseDeltaCoalescer() {
    }

    private final void entregarPendente() {
        synchronized (lock) {
            int i = pendingDx;
            int i2 = pendingDy;
            if (i == 0 && i2 == 0) {
                return;
            }
            pendingDx = 0;
            pendingDy = 0;
            InjectionMetrics.INSTANCE.onMouseFlush(i, i2);
            ch0 ch0Var = onFlush;
            if (ch0Var != null) {
                ch0Var.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    private final long intervaloNs() {
        int i = f1914hz;
        if (i < 1) {
            i = 1;
        }
        return 1000000000 / ((long) i);
    }

    private final long slotAtualLocked(long j) {
        return j / intervaloNs();
    }

    private final boolean tentarMarcarSlotLocked(long j) {
        long jSlotAtualLocked = slotAtualLocked(j);
        if (jSlotAtualLocked == ultimoSlotFlush) {
            return false;
        }
        ultimoSlotFlush = jSlotAtualLocked;
        return true;
    }

    public final void definirHz(int i) {
        if (i != 0 && i != 125 && i != 250 && i != 500 && i != 1000) {
            i = 250;
        }
        if (i == f1914hz) {
            return;
        }
        flushAgora();
        f1914hz = i;
        synchronized (lock) {
            ultimoSlotFlush = -1L;
        }
        if (i == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("Hz");
    }

    public final void flushAgora() {
        synchronized (lock) {
            if (pendingDx == 0 && pendingDy == 0) {
                return;
            }
            ultimoSlotFlush = INSTANCE.slotAtualLocked(System.nanoTime());
            entregarPendente();
        }
    }

    public final void flushForcado() {
        InjectionMetrics.INSTANCE.onFlushForcado();
        flushAgora();
    }

    public final int hzAtual() {
        return f1914hz;
    }

    public final void limpar() {
        synchronized (lock) {
            pendingDx = 0;
            pendingDy = 0;
            ultimoSlotFlush = -1L;
        }
    }

    public final void offer(int i, int i2) {
        boolean zTentarMarcarSlotLocked;
        if (i == 0 && i2 == 0) {
            return;
        }
        InjectionMetrics injectionMetrics = InjectionMetrics.INSTANCE;
        injectionMetrics.onMouseRaw(i, i2);
        if (f1914hz <= 0) {
            injectionMetrics.onMouseFlush(i, i2);
            ch0 ch0Var = onFlush;
            if (ch0Var != null) {
                ch0Var.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            return;
        }
        synchronized (lock) {
            pendingDx += i;
            pendingDy += i2;
            zTentarMarcarSlotLocked = INSTANCE.tentarMarcarSlotLocked(System.nanoTime());
        }
        if (zTentarMarcarSlotLocked) {
            entregarPendente();
        }
    }

    public final void setOnFlush(ch0 ch0Var) {
        onFlush = ch0Var;
    }

    public final boolean temPendente() {
        boolean z;
        synchronized (lock) {
            z = (pendingDx == 0 && pendingDy == 0) ? false : true;
        }
        return z;
    }

    public final void tick() {
        boolean zTentarMarcarSlotLocked;
        if (f1914hz <= 0) {
            return;
        }
        synchronized (lock) {
            try {
                zTentarMarcarSlotLocked = (pendingDx == 0 && pendingDy == 0) ? false : INSTANCE.tentarMarcarSlotLocked(System.nanoTime());
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zTentarMarcarSlotLocked) {
            entregarPendente();
        }
    }
}
